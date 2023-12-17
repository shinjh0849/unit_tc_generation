import csv
import numpy as np
import os
import re
import nltk
import sys
import re
import bleu
import weighted_ngram_match
import syntax_match
import dataflow_match
import json
from rouge_score import rouge_scorer
from nltk.translate.meteor_score import meteor_score
from nltk.translate.bleu_score import sentence_bleu
from tree_sitter import Language, Parser


def calc_em_acc(preds, targets):
    correct = 0
    total = len(preds)
    for pred, target in zip(preds, targets):
        if pred.lower() == target.lower():
            correct += 1
    accuracy = correct / total

    return accuracy


def calc_codebleu(refs, hyps):
    lang = 'java'
    
    # preprocess inputs
    pre_references = [[x.strip() for x in refs]]
    hypothesis = [x.strip() for x in hyps]
    
    for i in range(len(pre_references)):
        assert len(hypothesis) == len(pre_references[i])

    references = []
    for i in range(len(hypothesis)):
        ref_for_instance = []
        for j in range(len(pre_references)):
            ref_for_instance.append(pre_references[j][i])
        references.append(ref_for_instance)
    assert len(references) == len(pre_references)*len(hypothesis)

    # calculate ngram match (BLEU)
    tokenized_hyps = [x.split() for x in hypothesis]
    tokenized_refs = [[x.split() for x in reference] for reference in references]
    
    ngram_match_score = bleu.corpus_bleu(tokenized_refs, tokenized_hyps)
    
    # calculate weighted ngram match
    keywords = [x.strip() for x in open('keywords/' + lang + '.txt', 'r', encoding='utf-8').readlines()]
    def make_weights(reference_tokens, key_word_list):
        return {token:1 if token in key_word_list else 0.2 \
                for token in reference_tokens}
    tokenized_refs_with_weights = [[[reference_tokens, make_weights(reference_tokens, keywords)]\
                for reference_tokens in reference] for reference in tokenized_refs]

    weighted_ngram_match_score = weighted_ngram_match.corpus_bleu(tokenized_refs_with_weights, tokenized_hyps)

    # calculate syntax match
    syntax_match_score = syntax_match.corpus_syntax_match(refs, hyps, lang)

    # calculate dataflow match
    dataflow_match_score = dataflow_match.corpus_dataflow_match(refs, hyps, lang)

    # print('ngram match: {0}, weighted ngram match: {1}, syntax_match: {2}, dataflow_match: {3}'.\
                        # format(ngram_match_score, weighted_ngram_match_score, syntax_match_score, dataflow_match_score))

    code_bleu_score = 0.25 * ngram_match_score\
                    + 0.25 * weighted_ngram_match_score\
                    + 0.25 * syntax_match_score\
                    + 0.25 * dataflow_match_score
    return code_bleu_score


def calc_bleu(preds, targets):    
    # Calculate the BLEU score
    weights = [0.25] * 4  # weights for BLEU-4
    # bleu_score = nltk.translate.bleu_score.corpus_bleu(targets_tokens, preds_tokens, weights=weights)
   
    scores = []
    for pred, target in zip(preds, targets):
        each_bleu = nltk.translate.bleu_score.sentence_bleu([target], pred, weights=weights)
        scores.append(each_bleu)
    total_bleu = sum(scores) / len(scores)
    return total_bleu


def calc_rouge_l(preds, targets):
    total_len = len(targets)
    rouge_l = []
    for pred, target in zip(preds, targets):
        scorer = rouge_scorer.RougeScorer(['rougeL'], use_stemmer=True)
        rouge_scores = scorer.score(pred, target)
        rouge_l.append(rouge_scores['rougeL'].fmeasure)
    return round(sum(rouge_l) / total_len, 4)


def calc_meteor(preds, targets):
    meteor_score_sentences_list = []
    for target, pred in zip(targets, preds):
        pred = pred.split()
        target = target.split()
        meteor_score_sentences_list.append(meteor_score([target], pred))
    meteor_score_res = np.mean(meteor_score_sentences_list)
    return meteor_score_res


def calc_metrics(baseline, prj):
    if baseline=='gpt4':
        with open(f'../../dataset/{baseline}/{prj}_test_0.tests') as f:
            targets = [x.strip() for x in f.readlines()]
        with open(f'../../dataset/{baseline}/{prj}_generated_0.tests') as f:
            preds = [x.strip() for x in f.readlines()]
    else:
        with open(f'../../dataset/for_baselines/{prj}_test_0.tests') as f:
            targets = [x.strip() for x in f.readlines()]
        with open(f'../../dataset/{baseline}/{prj}.tests') as f:
            preds = [x.strip() for x in f.readlines()]
    
    assert len(targets) == len(preds)
    
    accuracy = calc_em_acc(preds, targets)
    bleu = calc_bleu(preds, targets)
    codeblue = calc_codebleu(preds, targets)
    rouge_l = calc_rouge_l(preds, targets)
    meteor = calc_meteor(preds, targets)
    
    print('======================================')
    print(baseline, prj)
    print('Exact Match accuracy: {:.2f}'.format(accuracy * 100))
    print('BLEU-4 score: {:.2f}'.format(bleu * 100))
    print('CodeBLEU: {:.2f}'.format(codeblue * 100))
    print('ROUGE_L: {:.2f}'.format(rouge_l * 100))
    print('METEOR: {:.2f}'.format(meteor * 100))
       

for baseline in ['a3test', 'codet5/da', 'codet5/noda', 'gpt4']:
    for prj in ['compress', 'gson', 'jacksonCore', 'jacksonDatabind', 'jsoup']:
        calc_metrics(baseline, prj)
