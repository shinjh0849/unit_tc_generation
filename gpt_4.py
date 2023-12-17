import backoff
import openai
import os
from tqdm import tqdm
import sys

 
@backoff.on_exception(backoff.expo, (openai.error.RateLimitError, openai.error.APIError, openai.error.Timeout, openai.error.ServiceUnavailableError))
def get_completion(prompt, engine='gpt-4-1106-preview'):
    response = openai.ChatCompletion.create(
        model=engine,
        messages=prompt,
        temperature=0, # this is the degree of randomness of the model's output
    )
    return response['choices'][0]['message']['content'].strip()

     

def gen_comments(num):
    # max_token = 4000
    
    for prj in ['compress', 'gson', 'jacksonCore', 'jacksonDatabind', 'jsoup']:
        for split in ['0']:
            try:
                with open(f'dataset/per_method/{prj}_test_{split}.tests') as f:
                    tests = [x.strip() for x in f.readlines()]
                with open(f'dataset/per_method/{prj}_test_{split}.methods') as f:
                    methods = [x.strip() for x in f.readlines()]
            except FileNotFoundError as e:
                print(f'{prj}')
                continue
            print(f'starting {prj} split {split}')
            test_dict = []
            for test, method in zip(tests, methods):
                test_dict.append({'test': test, 'method':method})
            os.makedirs('output/gpt_4', exist_ok=True)    
            generated_comments_f = open(f'output/gpt_4/{prj}_generated_{split}_{num}.txt', 'w')
            for cnt, test in enumerate(tqdm(test_dict, total=len(test_dict))):
                if cnt < num: continue
                method = test['method']
                # if len(method.split()) > max_token:
                #     method = ' '.join(method.split()[:max_token]).strip()
                prompt = [{"role": "system", "content": f"You are a unit test case generator with meaningful assertions for a Java project: {prj}."},
                          {"role": "user", "content": f"""Given a focal method surrounded by ???, \
                                                        generate unit test case methods that cover maximum line coverage. \
                                                        Only create new tests if they cover new lines of code.\
                                                        Only generate the java code part of test methods.\
                                                        Use [TCS] to seperate the multiple test cases.
                                                        Input text: ???{method}???"""},
                          {"role": "user", "content": """Remove all comments (e.g. line starts with // and surrounded by /* and */),\
                                                NL description, and @Test annotations.\
                                                New lines should be substituted with [EOL]."""}]
                
                # print(prj, ',',len(method.split()) + len(prompt[1]['content'].split()), sep='')
                response = get_completion(prompt)
                if not response:
                    response = 'no_gen'
                if len(response.splitlines()) > 1:
                    response = response.replace('\n', ' [EOL] ') 
                assert len(response.splitlines()) == 1
                generated_comments_f.write(response + '\n')
            generated_comments_f.close()
        
openai.organization = 'YOUR_ORG_KEY'
openai.api_key = 'YOUR_API_KEY'
# num = sys.argv[1]
gen_comments(0)