@Override [EOL] public void setUp() throws Exception { [EOL]     super.setUp(); [EOL]     enableLineNumberCheck(true); [EOL] } <line_num>: 25,29
@Override [EOL] public CompilerPass getProcessor(final Compiler compiler) { [EOL]     PeepholeOptimizationsPass peepholePass = new PeepholeOptimizationsPass(compiler, new StatementFusion()); [EOL]     return peepholePass; [EOL] } <line_num>: 31,37
public void testNothingToDo() { [EOL]     fuseSame(""); [EOL]     fuseSame("a"); [EOL]     fuseSame("a()"); [EOL]     fuseSame("if(a()){}"); [EOL] } <line_num>: 39,44
public void testFoldBlockWithStatements() { [EOL]     fuse("a;b;c", "a,b,c"); [EOL]     fuse("a();b();c();", "a(),b(),c()"); [EOL]     fuse("a(),b();c(),d()", "a(),b(),c(),d()"); [EOL]     fuse("a();b(),c(),d()", "a(),b(),c(),d()"); [EOL]     fuse("a(),b(),c();d()", "a(),b(),c(),d()"); [EOL] } <line_num>: 46,52
public void testFoldBlockIntoIf() { [EOL]     fuse("a;b;c;if(x){}", "if(a,b,c,x){}"); [EOL]     fuse("a;b;c;if(x,y){}else{}", "if(a,b,c,x,y){}else{}"); [EOL]     fuse("a;b;c;if(x,y){}", "if(a,b,c,x,y){}"); [EOL]     fuse("a;b;c;if(x,y,z){}", "if(a,b,c,x,y,z){}"); [EOL]     fuseSame("a();if(a()){}a()"); [EOL] } <line_num>: 54,62
public void testFoldBlockReturn() { [EOL]     fuse("a;b;c;return x", "return a,b,c,x"); [EOL]     fuse("a;b;c;return x+y", "return a,b,c,x+y"); [EOL]     fuseSame("a;b;c;return x;a;b;c"); [EOL] } <line_num>: 64,70
public void testFoldBlockThrow() { [EOL]     fuse("a;b;c;throw x", "throw a,b,c,x"); [EOL]     fuse("a;b;c;throw x+y", "throw a,b,c,x+y"); [EOL]     fuseSame("a;b;c;throw x;a;b;c"); [EOL] } <line_num>: 72,76
public void testFoldSwitch() { [EOL]     fuse("a;b;c;switch(x){}", "switch(a,b,c,x){}"); [EOL] } <line_num>: 78,80
public void testFuseIntoForIn() { [EOL]     fuse("a;b;c;for(x in y){}", "for(x in a,b,c,y){}"); [EOL]     fuseSame("a();for(var x = b() in y){}"); [EOL] } <line_num>: 82,85
public void testNoFuseIntoWhile() { [EOL]     fuseSame("a;b;c;while(x){}"); [EOL] } <line_num>: 87,89
public void testNoFuseIntoDo() { [EOL]     fuseSame("a;b;c;do{}while(x)"); [EOL] } <line_num>: 91,93
public void testNoGlobalSchopeChanges() { [EOL]     testSame("a,b,c"); [EOL] } <line_num>: 95,97
public void testNoFunctionBlockChanges() { [EOL]     testSame("function foo() { a,b,c }"); [EOL] } <line_num>: 99,101
private void fuse(String before, String after) { [EOL]     test("function F(){if(CONDITION){" + before + "}}", "function F(){if(CONDITION){" + after + "}}"); [EOL] } <line_num>: 103,106
private void fuseSame(String code) { [EOL]     fuse(code, code); [EOL] } <line_num>: 108,110
