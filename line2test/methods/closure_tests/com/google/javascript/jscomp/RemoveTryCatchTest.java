public RemoveTryCatchTest() { [EOL]     super("", false); [EOL] } <line_num>: 22,25
@Override [EOL] public CompilerPass getProcessor(Compiler compiler) { [EOL]     return new RemoveTryCatch(compiler); [EOL] } <line_num>: 27,29
@Override [EOL] public int getNumRepetitions() { [EOL]     return 1; [EOL] } <line_num>: 31,34
public void testRemoveTryCatch() { [EOL]     test("try{var a=1;}catch(ex){var b=2;}", "var b;var a=1"); [EOL]     test("try{var a=1;var b=2}catch(ex){var c=3;var d=4;}", "var d;var c;var a=1;var b=2"); [EOL]     test("try{var a=1;var b=2}catch(ex){}", "var a=1;var b=2"); [EOL] } <line_num>: 36,43
public void testRemoveTryFinally() { [EOL]     test("try{var a=1;}finally{var c=3;}", "var a=1;var c=3"); [EOL]     test("try{var a=1;var b=2}finally{var e=5;var f=6;}", "var a=1;var b=2;var e=5;var f=6"); [EOL] } <line_num>: 45,50
public void testRemoveTryCatchFinally() { [EOL]     test("try{var a=1;}catch(ex){var b=2;}finally{var c=3;}", "var b;var a=1;var c=3"); [EOL]     test("try{var a=1;var b=2}catch(ex){var c=3;var d=4;}finally{var e=5;" + "var f=6;}", "var d;var c;var a=1;var b=2;var e=5;var f=6"); [EOL] } <line_num>: 52,58
public void testPreserveTryBlockContainingReturnStatement() { [EOL]     testSame("function f(){var a;try{a=1;return}finally{a=2}}"); [EOL] } <line_num>: 60,62
public void testPreserveAnnotatedTryBlock() { [EOL]     test("/** @preserveTry */try{var a=1;}catch(ex){var b=2;}", "try{var a=1}catch(ex){var b=2}"); [EOL] } <line_num>: 64,67
public void testIfTryFinally() { [EOL]     test("if(x)try{y}finally{z}", "if(x){y;z}"); [EOL] } <line_num>: 69,71
public void testIfTryCatch() { [EOL]     test("if(x)try{y;z}catch(e){}", "if(x){y;z}"); [EOL] } <line_num>: 73,75
