from ast import Bytes
import re
import os
import sys
from sklearn.model_selection import train_test_split
import copy
import json 
import pandas as pd
from sklearn.model_selection import KFold


def text_preprocess (input):
  input = input.strip().replace(str.encode(" "), str.encode("")).replace(str.encode("[EOL]"),str.encode(""))
  input = input.split(str.encode("//"))[0]
  return input
method_names_path = "method_names/"
methods_path = "methods/"
context_path = "context/"

kfold = 1
project = 'cli'
input_database_file = 'Cli1f_line2test.txt'
path_len = 8

# project = "lang3"
# input_database_file = "Lang1f_line2test.txt"
# path_len = 10

# project = "closure"
# input_database_file = "Closure1f_line2test.txt"
# path_len = 7

# project = "codec"
# input_database_file = "Codec1f_line2test.txt"
# path_len = 8

# project = "csv"
# input_database_file = "Csv1f_line2test.txt"
# path_len = 9

# project = "time"
# input_database_file = "Time1f_line2test.txt"
# path_len = 10

# project = "chart"
# input_database_file = "Chart1f_line2test.txt"
# path_len = 8

# project = "compress"
# input_database_file = "Compress1f_line2test.txt"
# path_len = 10

# project = "jacksonDatabind"
# input_database_file = "jacksonDatabind1f_line2test.txt"
# path_len = 10

# project = "gson"
# input_database_file = "gson_line2test.txt"
# path_len = 11

# project = "jacksonCore"
# input_database_file = "jacksonCore1f_line2test.txt"
# path_len = 10

# project = "jsoup"
# input_database_file = "jsoup1f_line2test.txt"
# path_len = 10

# project = "jxPath"
# input_database_file = "jxPath1f_line2test.txt"
# path_len = 9


if __name__ == "__main__":



    f = open(input_database_file)
    line2test = f.read()
    f.close()
    line2test = line2test.split("\n")
    i = 0
    src_code = 0
    class_name = 0
    function_found_flag = 0
    dataset = {}
    path = ""
    methods = ""
    line_plus_method = ""
    src_line_num = 0
    src_file_found_flag = 0
    
    for line in line2test:
      # print(line)
      
      if "<src_file>" in line:
          if("Test" in line):
            print("test#########################################################")
            print(line)
            src_file_found_flag = 0
          else:
            line_src_dict = {}
            path = line.split("/")[path_len:]
            class_name = line.split("/")[-1].split(".")[0]
            # print("src" + str(path))
            # print(class_name)
            print("src/" + project +"/" + "/".join(path))
            if os.path.exists("src/" + project +"/" + "/".join(path)):
              f = open("src/" + project +"/" + "/".join(path),'rb')
              src_code = f.readlines()
              f.close()
              src_file_found_flag = 1
            else:
              print("src file not found")
              src_file_found_flag = 0
              continue

            if os.path.exists(methods_path + project +"/" + "/".join(path)):
              f = open(methods_path+ project +"/" + "/".join(path),'rb')
              methods = f.readlines()
              f.close()
              src_file_found_flag = 1
            else:
              print("methods file not found")
              src_file_found_flag = 0
              continue
              

            if os.path.exists(context_path+ project +"/" +"/".join(path)):
              f = open(context_path+ project +"/" +"/".join(path),'rb')
              context = f.readlines()
              f.close()
              src_file_found_flag = 1
            else:
              print("context file not found")
              src_file_found_flag = 0
              continue

            # f = open("src_lines.txt","ab")
            # f.write(str.encode("/".join(path) + "\n"))
            # f.close()

            # f = open("tests.txt","ab")
            # f.write(str.encode("/".join(path) + "\n"))
            # f.close()

            # f = open("test_path.txt",'ab')
            # f.write(str.encode("<SRC>"+"/".join(path) + "\n"))
            # f.close()

            # f = open("lines_covered.txt",'ab')
            # f.write(str.encode("/".join(path) + "\n"))
            # f.close()    
    
            methods2line = {}
            for method in methods:
              method_line_num_start = method.split(str.encode("<line_num>:"))[1].split(str.encode(","))[0]
              method_line_num_end = method.split(str.encode("<line_num>:"))[1].split(str.encode(","))[1]
              methods2line[method.split(str.encode("<line_num>:"))[0]] = {"start": int(method_line_num_start), "end": int(method_line_num_end)}
      if "<line>" in line and src_file_found_flag == 1: 
        line_num = int(line.split(":")[1]) #real line num starts from 1
        src_line_num = line_num
        src_line = src_code[line_num-1] # in array we should subtrac 1 because its an array and start at zero
        nearest_func = 0
        diff = 50000
        entered_loop_flag = 0
        function_found_flag = 0
        if len(methods2line) == 0:
          function_found_flag = 0
          print("zero methods")
          continue #if we dont have any methods in the file we continue until we get to the next file

        for key, value in methods2line.items():
          # print("line "+ str(line_num))
          # print("key"+str(key))
          if text_preprocess(src_line) in text_preprocess(key):
            function_found_flag = 2 #for debug
          if line_num >= value["start"]:
            if line_num <= value["end"]:
              nearest_func = key
              entered_loop_flag = 1 
              # if text_preprocess(src_line) in text_preprocess(methods2line[nearest_func]):
              #   function_found_flag = 2
              
                
          
        if entered_loop_flag == 1:
          if text_preprocess(src_line) in text_preprocess(nearest_func):
            function_found_flag = 1



        
        # print("/".join(path))
        # f = open("src_lines.txt","ab")
        if function_found_flag == 1 :
          line_plus_method = str.encode(" [LINE] ") + src_line.replace(str.encode("\n"), str.encode(" ")).strip() + str.encode(" [LINE] ") \
            + nearest_func + str.encode("; ").join(context).replace(str.encode("\n"), str.encode(""))
        elif entered_loop_flag == 1 and function_found_flag != 1:
          #if str.encode("@") not in src_line: #and str.encode("this") not in src_line\
          #   and str.encode("super") not in src_line and str.encode(path[-1].split(".")[0]) not in src_line :

          print("method not found")
          # print(" [LINE] " + str(src_line))
          # print(" [method] " + str(nearest_func))
          # print(" [path] " + str(path))
          # print(" [line] " + str(src_line_num))
          continue




      if "<test_name>" in line and function_found_flag == 1 and src_file_found_flag ==1:
        test_path = line.split("<###>")[0]

        test_path = test_path.split(":")[-1].strip()
        test_path = test_path.split(".")[:-1]
        # print(line.split(".")[-1])
        # print(line.split(".")[-1])
        
        
        selected_test_name = line.split("<###>")[0].split(".")[-1].strip()+"()" #default test if no more related one is found
        test_names = line.split("<###>")
        for test_name in test_names:
          if class_name in test_name:
            selected_test_name = test_name.split(".")[-1].strip()+"()"
            test_path = test_name.split(":")[-1].strip()
            test_path = test_path.split(".")[:-1]
            # print("test_name ###########################################")
            break
        if os.path.exists(methods_path + project + "_tests/" + "/".join(test_path)+".java"):
          f = open(methods_path + project + "_tests/" + "/".join(test_path)+".java",'rb')
          tests = f.read()
          f.close()

          tests = tests.split(str.encode("\n"))
          # print(tests)
          index = 0
          for test in tests:   
            if str.encode(selected_test_name) in test.replace(str.encode(" "),str.encode("")): #for geting rid of spaces before () in some tests
              index += 1
              if(index>1):
                print(index)
                print("more than one test found for one line")
                continue
              line_src_dict[str(src_line_num)] = {"src": line_plus_method , "test": test.split(str.encode("<line_num>"))[0],\
              "test_path": str.encode("/".join(test_path)+".java")}
              dataset["/".join(path)] = line_src_dict 
          
          if index == 0: 
            print("no tests found for a line")
            print(selected_test_name)
            print("/".join(test_path)+".java")
        else: 
          print("test_file not found")
          print(methods_path + project + "_tests/" + "/".join(test_path)+".java")
    # print(dataset)
    # f = open("covered_lines_new.txt","wb")
    # for key,value in dataset.items():
    #   f.write(str.encode(key +  "\n"))
    #   for line, _ in value.items():
    #     f.write(str.encode(line +  "\n"))
    # f.close()


    df = pd.DataFrame(columns=['methods','tests','info'])

   
           
    for path,line_src_test in dataset.items():
      # f.write(str.encode(key +  "\n"))
        for line, src_test in line_src_test.items():
          # print(line)
          new_row = pd.DataFrame([{"methods":src_test["src"], "tests":src_test["test"], "info":str.encode("<line>: "+ line + "<path>: " + path  + "<test_path>: ") + src_test["test_path"]}],  )
          df = pd.concat([df,new_row],axis=0, ignore_index=True)
    
    # print(df)
    print(len(df)) 
    unique_tests = df["tests"].unique()

    if kfold == 1:
      

      # unique_tests_train, unique_tests_test = train_test_split(unique_tests, test_size=test_size, random_state=42)
      
      kf = KFold(n_splits=5,shuffle=True,random_state = 42)
      kf.get_n_splits(unique_tests)
      # print(unique_tests)
      for i, (train_index, test_index) in enumerate(kf.split(unique_tests)):
        print(f"Fold {i}:")
        # print(f"  Train: index={train_index}")
        # print(f"  Test:  index={test_index}")
        unique_tests_train = unique_tests[train_index]
        unique_tests_test = unique_tests[test_index]
        print("train utest numbers: {}".format(len(unique_tests_train)))
        print("test utest numbers: {}".format(len(unique_tests_test)))

        i == 0         
        data_train = pd.DataFrame(columns=['methods','tests','info'])
        data_test = pd.DataFrame(columns=['methods','tests','info'])
        for index_dataset, row_dataset in  df.iterrows():
          if(row_dataset["tests"] in unique_tests_train):
              new_row = pd.DataFrame([row_dataset],columns=["methods", "tests", "info"])
              data_train = pd.concat([data_train,new_row],keys=["methods", "tests", "info"],axis=0, ignore_index=True)
          elif (row_dataset["tests"] in unique_tests_test):
              new_row = pd.DataFrame([row_dataset],columns=["methods", "tests", "info"])
              data_test = pd.concat([data_test,new_row],keys=["methods", "tests", "info"],axis=0, ignore_index=True)
        print("test lines: {}".format(len(data_test)))
        print("train lines: {}".format(len(data_train)) )
        with open("generated_datasets/"+project+"_train_"+ str(i) + ".methods","wb") as train_methods, open("generated_datasets/"+project+"_train_"+ str(i) + ".tests","wb") as train_tests\
            , open("generated_datasets/"+project+"_test_"+ str(i) + ".methods","wb") as test_methods, open("generated_datasets/"+project+"_test_"+ str(i) + ".tests","wb") as test_tests\
            , open("generated_datasets/"+project+"_test_info_"+ str(i) + ".txt","wb") as test_info, open("generated_datasets/"+project+"_train_info_"+ str(i) + ".txt","wb") as train_info:
            for index_train, row_train in  data_train.iterrows():
              train_methods.write(row_train["methods"] +  str.encode("\n"))
              train_tests.write(row_train["tests"] +  str.encode("\n"))
              train_info.write(row_train['info']+ str.encode("\n"))
            for index_test, row_test in  data_test.iterrows():
              test_methods.write(row_test["methods"] +  str.encode("\n"))
              test_tests.write(row_test["tests"] +  str.encode("\n"))
              test_info.write(row_test['info']+ str.encode("\n"))

    elif kfold == 0:
      unique_tests_train, unique_tests_test = train_test_split(unique_tests, test_size=test_size, random_state=42)
      i == 0         
      data_train = pd.DataFrame(columns=['methods','tests','info'])
      data_test = pd.DataFrame(columns=['methods','tests','info'])
      for index_dataset, row_dataset in  df.iterrows():
        if(row_dataset["tests"] in unique_tests_train):
            new_row = pd.DataFrame([row_dataset],columns=["methods", "tests", "info"])
            data_train = pd.concat([data_train,new_row],keys=["methods", "tests", "info"],axis=0, ignore_index=True)
        elif (row_dataset["tests"] in unique_tests_test):
            new_row = pd.DataFrame([row_dataset],columns=["methods", "tests", "info"])
            data_test = pd.concat([data_test,new_row],keys=["methods", "tests", "info"],axis=0, ignore_index=True)
      print(len(data_test))   
      print(len(data_train))  
      with open("generated_datasets/"+project+"_train.methods","wb") as train_methods, open("generated_datasets/"+project+"_train.tests","wb") as train_tests\
          , open("generated_datasets/"+project+"_test.methods","wb") as test_methods, open("generated_datasets/"+project+"_test.tests","wb") as test_tests\
          , open("generated_datasets/"+project+"_test_info.txt","wb") as test_info, open("generated_datasets/"+project+"_train_info.txt","wb") as train_info:
          for index_train, row_train in  data_train.iterrows():
            train_methods.write(row_train["methods"] +  str.encode("\n"))
            train_tests.write(row_train["tests"] +  str.encode("\n"))
            train_info.write(row_train['info']+ str.encode("\n"))
          for index_test, row_test in  data_test.iterrows():
            test_methods.write(row_test["methods"] +  str.encode("\n"))
            test_tests.write(row_test["tests"] +  str.encode("\n"))
            test_info.write(row_test['info']+ str.encode("\n"))