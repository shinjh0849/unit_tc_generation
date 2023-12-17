# Replication pakage for Line level Test Generation Using Transformers and Domain Adaptation

The source code is provided in seperate sections so using it in different senarious would be easier.

## Dataset
for extracting the dataset you can use this command.
```
cat dataset.tar.gz.* | tar xzvf - 
```
## Context extraction 
For extracting the context for any java project you can copy the src folder of your project in the extract_context/input folder then run the java package provided in extract_context (you can use any editor preferably intellij). The extracted context will be in the output folder.

## Coverage 
After using clover for getting the coverage of your java project, clover will generate a number of database files with names starting with *clover4_4_1.db*. copy all of them to *coverage/src/main/java/Projects* and run the provided java project for reading the database.
The provided code will generate a line-to-test-mapping file (e.g. Lang1f_line2test.txt).
you will use it for generating the dataset in the next step.

## Line2test

for generating the dataset for your project, you should copy the generated context(consisting context, method_names, methods folders), line2test file (e.g. Lang1f_line2test.txt) and the src code of your project in this folder. After copying everything you can edit the line2test_kfold.py for your project.(all defects4j projects are available in the code just uncomment the project config available in line2test_kfold.py)



## CodeT5
For training the codet5 model you can copy the generated data in *code_t5/data/test_gen* folder and use the *code_t5/sh/train.sh* scripts for training the model. 

## Post_processing 
After generating the tests for each project you should use post-processing in order to select the compilable tests. 
The compressed model prediction files are provided in post processing folder. 
for extracting the prediction files you can use this command.
```
cat model-predictions.tar.gz.* | tar xzvf - 
```
after extracting the files, you can edit *convert_model_output_to_tests.py* and *select_runnable_tests.py* for the project under test. then you should run the *convert_model_output_to_tests.py* first. Then you run *select_runnable_tests.py* and the ready to run tests will be generated in *post_processing/out/combined*. The *post_processing/combined* folder is the result of all projects. 
then you can copy the tests from combined folder to your java project and calculate the coverage. 
The coverage of model generated tests can be found in *post_processing/model_gen_coverage* folder for each project.

