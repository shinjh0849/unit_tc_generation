@Override [EOL] protected CompilerPass getProcessor(Compiler compiler) { [EOL]     return new MoveFunctionDeclarations(compiler); [EOL] } <line_num>: 25,28
public void testFunctionDeclarations() { [EOL]     test("a; function f(){} function g(){}", "function f(){} function g(){} a"); [EOL] } <line_num>: 30,32
public void testFunctionDeclarationsInModule() { [EOL]     test(createModules("a; function f(){} function g(){}"), new String[] { "function f(){} function g(){} a" }); [EOL] } <line_num>: 34,37
public void testFunctionsExpression() { [EOL]     testSame("a; f = function(){}"); [EOL] } <line_num>: 39,41
public void testNoMoveDeepFunctionDeclarations() { [EOL]     testSame("a; if (a) function f(){};"); [EOL]     testSame("a; if (a) { function f(){} }"); [EOL] } <line_num>: 43,46
