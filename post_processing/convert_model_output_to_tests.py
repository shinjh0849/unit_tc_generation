import re
import os
import sys

def prepare(out, info, method, da):

    f = open(out)
    out_lines = f.readlines()
    f.close()

    f = open(info)
    info_lines = f.readlines()
    f.close()

    assert len(out_lines) == len(info_lines)
    
    global i
    i = 0

    def replace(m):
        global i
        i += 1
        test_name = m.group(0).split('(') 
        new_test_name =(str(i)+'(').join(test_name)
        return new_test_name
    
    # if os.path.exists("out/"):
    #     shutil.rmtree("out/")
    test_num  = 0
    list_of_tests = []
    for line, info_line in zip(out_lines, info_lines):
        if line not in list_of_tests:
            list_of_tests.append(line)
            line = re.sub('test\w+\(\)', replace, line)
            if "@Test" not in line:
                if line.startswith('('):
                    line = '@Test' + line
                else:
                    line = '@Test\n' + line
            test_num += 1
            line = line.replace("[EOL]", '\n')
            path = info_line.split("<test_path>:")[-1].strip()
            pth = f"out/{method}/{da}/runnable_tests/"
            os.makedirs(os.path.dirname(pth + path), exist_ok=True)
            with open(pth + path, "a") as Final_tests:
                Final_tests.write(line)
                    
    print(test_num)    

if __name__ == "__main__":
    method = sys.argv[1]
    
    if method == 'codet5':
        for prj in ['compress', 'gson', 'jacksonCore', 'jacksonDatabind', 'jsoup']:
            for da in ['da', 'noda']:
                out = f"../dataset/codet5/{da}/{prj}.tests"
                info = f"../dataset/defects4j/{prj}_test_info_0.txt"
                prepare(out, info, method, da)
    elif method == 'gpt4':
        for prj in ['compress', 'gson', 'jacksonCore', 'jacksonDatabind', 'jsoup']:
            out = f"../dataset/gpt4/{prj}_generated_0.tests"
            info = f'../dataset/gpt4/{prj}_test_info_0.txt'
            prepare(out, info, method, '')
    elif method == 'a3test':
        for prj in ['compress', 'gson', 'jacksonCore', 'jacksonDatabind', 'jsoup']:
            out = f"../dataset/a3test/{prj}.tests"
            info = f"../dataset/defects4j/{prj}_test_info_0.txt"
            prepare(out, info, method, '')
    else:
        print('Incorrect argv!')