import os
import statistics
import numpy as np
import re
import csv
import requests
import xml.etree.ElementTree as ET


def get_list_stats(lst):
    minimum = min(lst)
    maximum = max(lst)
    average = sum(lst) / len(lst)
    median = statistics.median(lst)
    qs = np.percentile(lst, [25, 75])
    print('min:', minimum, 'max:', maximum, 'avg:', average, 'med:', median, 'q1:', qs[0], 'q3:', qs[1])

def get_data_per_method():
    os.makedirs('dataset/per_method', exist_ok=True)
    for prj in ['compress', 'gson', 'jacksonCore', 'jacksonDatabind', 'jsoup']:
        for split in ['0']:
            try:
                with open(f'dataset/generated_datasets_sav/{prj}_test_{split}.tests') as f:
                    tests = [x.strip() for x in f.readlines()]
                with open(f'dataset/generated_datasets_sav/{prj}_test_{split}.methods') as f:
                    methods = [x.strip() for x in f.readlines()]
                with open (f'dataset/generated_datasets_sav/{prj}_test_info_{split}.txt') as f:
                    infos = [x.strip() for x in f.readlines()]
            except FileNotFoundError as e:
                print(f'no split {split} in project {prj}!')
                continue
            
            unique = []
            filtered = []
            for test, method, info in zip(tests, methods, infos):
                method = method.split('[LINE]')[2].strip()
                cut_idx = method.rfind('}')
                method = method[:cut_idx+1]
                key = method

                if key not in unique:
                    unique.append(key)
                    filtered.append({'test':test, 'method':method, 'info':info})
            
            test_f = open(f'dataset/per_method/{prj}_test_{split}.tests', 'w')
            methods_f = open(f'dataset/per_method/{prj}_test_{split}.methods', 'w')
            infos_f = open(f'dataset/per_method/{prj}_test_info_{split}.txt', 'w')
            for dct in filtered:
                # print(dct)
                test_f.write(dct['test'] + '\n')
                methods_f.write(dct['method'] + '\n')
                infos_f.write(dct['info'] + '\n')
            test_f.close()
            methods_f.close()
            infos_f.close()
            
            
def toks_stats():
    toks = []
    big = 0
    for prj in ['compress', 'gson', 'jacksonCore', 'jacksonDatabind', 'jsoup']:
        for split in ['0']:
            try:
                with open(f'dataset/per_method/{prj}_test_{split}.methods') as f:
                    methods = [x.strip() for x in f.readlines()]
            except FileNotFoundError as e:
                print(f'no split {split} in project {prj}!')
                continue
            for method in methods:
                toks.append(len(method.split()))
                if len(method.split()) > 4000:
                    big += 1
    get_list_stats(toks)
    print(big)
            
def cnt_input_toks():
    # 13531852
    # CAD 405.96
    total_toks = 0
    for prj in ['compress', 'gson', 'jacksonCore', 'jacksonDatabind', 'jsoup']:
        for split in ['0']:
            try:
                with open(f'dataset/per_method/{prj}_test_{split}.methods') as f:
                    methods = [x.strip() for x in f.readlines()]
            except FileNotFoundError as e:
                print(f'no split {split} in project {prj}!')
                continue
            for method in methods:
                total_toks += len(method.split())
    print(total_toks)
    print('CAD', total_toks/1000*0.03)
            
            
def cnt_num_of_inst(data='per_method'):
    for prj in ['compress', 'gson', 'jacksonCore', 'jacksonDatabind', 'jsoup']:
        for split in ['0']:
            try:
                with open(f'dataset/{data}/{prj}_test_{split}.methods') as f:
                    methods = [x.strip() for x in f.readlines()]
            except FileNotFoundError as e:
                print(f'no split {split} in project {prj}!')
                continue
            print(prj, split, len(methods), sep=',')


def print_line2test():
    with open('line2test/Cli1f_line2test.txt') as f:
        lines = f.readlines()
    for line in lines:
        if '<src_file>' in line:
            print(line)
            
            
def split_gpt_tcs():
    for prj in ['compress', 'gson', 'jacksonCore', 'jacksonDatabind', 'jsoup']:
        for split in ['0', '1', '2', '3', '4']:
            # open gpt_4 generated results 
            with open(f'output/gpt_4/{prj}_generated_{split}_0.txt') as f:
                gen_tcs = [x.strip() for x in f.readlines()]
            os.makedirs('dataset/gpt_combined', exist_ok=True)
            methods_w = open(f'dataset/gpt_combined/{prj}_test_{split}.methods', 'w')
            gen_tests_w =  open(f'dataset/gpt_combined/{prj}_generated_{split}.tests', 'w')
            test_w = open(f'dataset/gpt_combined/{prj}_test_{split}.tests', 'w')
            infos_w = open(f'dataset/gpt_combined/{prj}_test_info_{split}.txt', 'w')
            with open(f'dataset/per_method/{prj}_test_{split}.methods') as f:
                methods = [x.strip() for x in f.readlines()]
            with open(f'dataset/per_method/{prj}_test_info_{split}.txt') as f:
                infos = [x.strip() for x in f.readlines()]
            with open(f'dataset/per_method/{prj}_test_{split}.tests') as f:
                tests = [x.strip() for x in f.readlines()]
            assert len(gen_tcs) == len(methods) == len(infos) == len(tests)
            
            for gen_tc, method, info, test in zip(gen_tcs, methods, infos, tests):
                # get only the java code surrounded by ```java [CODE]```
                try:
                    found = re.search('```java(.+?)```', gen_tc).group(1)
                except Exception:
                    try:
                        found = re.search('```(.+?)```', gen_tc).group(1)
                    except Exception:
                        found = gen_tc
                
                # split into multiple TCS
                processed_tcs = []
                tcs = found.split('[TCS]')
                for tc in tcs:
                    tc = tc.strip()
                    tc_lines = tc.split('[EOL]')
                    processed_tc = ''
                    for line in tc_lines:
                        line = line.strip()
                        if line and not line.startswith('//'):
                            processed_tc += line + ' [EOL] '
                    processed_tc = processed_tc[:-7]
                    processed_tcs.append(processed_tc)
                
                for p_tc in processed_tcs:
                    methods_w.write(f'{method}\n')
                    gen_tests_w.write(f'{p_tc}\n')
                    infos_w.write(f'{info}\n')
                    test_w.write(f'{test}\n')
                    
            methods_w.close()
            gen_tests_w.close()
            infos_w.close()
            test_w.close()
            print('Done!')
                            
def make_d4j_repos(folder_name):
    for prj in ['Compress', 'Gson', 'JacksonCore', 'JacksonDatabind', 'Jsoup']:
        os.system(f'defects4j checkout -p {prj} -v 1f -w coverage/{folder_name}/{prj}/')

def parse_coverage_report(dir):
    for prj in ['compress', 'gson', 'jacksonCore', 'jacksonDatabind', 'jsoup']:
        tree = ET.parse(f'coverage/lc_reports/{dir}/{prj}.xml')
        root = tree.getroot()
        
        covered_lines = {}
        for package in root.findall('./group/group/package'):
            package_name = package.attrib['name']
            if 'test' not in package_name:
                for srcfile in package.findall('sourcefile'):
                    file_name = srcfile.attrib['name']
                    c_lines = []
                    for line in srcfile.findall('line'):
                        mi = line.attrib['mi']
                        if mi != '0':
                            c_lines.append(line.attrib['nr'])
                    covered_lines[f'{package_name}/{file_name}'] = c_lines
        return covered_lines
                
def get_unique_coverage():
    total = 0
    withDA = parse_coverage_report('codet5/withDA')
    withoutDA = parse_coverage_report('codet5/withoutDA')
    gpt4 = parse_coverage_report('gpt4')
    a3test = parse_coverage_report('a3test')
        
    for file, cov_lines in withDA.items():
        wo_da = withoutDA[file]
        gpt = gpt4[file]
        a3 = a3test[file]
        
        unique_lines = 0
        for cov in cov_lines:
            if cov not in a3test:
                unique_lines +=1
        total += unique_lines
    print(total)

# get_data_per_method()
# cnt_input_toks()
# cnt_num_of_inst('gpt_combined')
# toks_stats()
# split_gpt_tcs()
# make_d4j_repos('a3test')
get_unique_coverage()