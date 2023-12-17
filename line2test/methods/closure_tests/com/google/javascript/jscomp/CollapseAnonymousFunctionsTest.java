public CollapseAnonymousFunctionsTest() { [EOL]     this.enableNormalize(); [EOL] } <line_num>: 25,27
@Override [EOL] protected CompilerPass getProcessor(Compiler compiler) { [EOL]     return new CollapseAnonymousFunctions(compiler); [EOL] } <line_num>: 29,32
public void testGlobalScope() { [EOL]     test("var f = function(){}", "function f(){}"); [EOL] } <line_num>: 34,36
public void testLocalScope1() { [EOL]     test("function f(){ var x = function(){}; x() }", "function f(){ function x(){} x() }"); [EOL] } <line_num>: 38,41
public void testLocalScope2() { [EOL]     test("function f(){ var x = function(){}; return x }", "function f(){ function x(){} return x }"); [EOL] } <line_num>: 43,46
public void testVarNotImmediatelyBelowScriptOrBlock1() { [EOL]     testSame("if (x) var f = function(){}"); [EOL] } <line_num>: 48,50
public void testVarNotImmediatelyBelowScriptOrBlock2() { [EOL]     testSame("var x = 1;" + "if (x == 1) {" + "  var f = function () { alert('b')}" + "} else {" + "  f = function() { alert('c')}" + "}" + "f();"); [EOL] } <line_num>: 52,60
public void testVarNotImmediatelyBelowScriptOrBlock3() { [EOL]     testSame("var x = 1; if (x) {var f = function(){return x}; f(); x--;}"); [EOL] } <line_num>: 62,64
public void testMultipleVar() { [EOL]     test("var f = function(){}; var g = f", "function f(){} var g = f"); [EOL] } <line_num>: 66,68
public void testMultipleVar2() { [EOL]     test("var f = function(){}; var g = f; var h = function(){}", "function f(){}var g = f;function h(){}"); [EOL] } <line_num>: 70,73
public void testBothScopes() { [EOL]     test("var x = function() { var y = function(){} }", "function x() { function y(){} }"); [EOL] } <line_num>: 75,78
public void testLocalScopeOnly1() { [EOL]     test("if (x) var f = function(){ var g = function(){} }", "if (x) var f = function(){ function g(){} }"); [EOL] } <line_num>: 80,83
public void testLocalScopeOnly2() { [EOL]     test("if (x) var f = function(){ var g = function(){} };", "if (x) var f = function(){ function g(){} }"); [EOL] } <line_num>: 85,88
public void testReturn() { [EOL]     test("var f = function(x){return 2*x}; var g = f(2);", "function f(x){return 2*x} var g = f(2)"); [EOL] } <line_num>: 90,93
public void testAlert() { [EOL]     test("var x = 1; var f = function(){alert(x)};", "var x = 1; function f(){alert(x)}"); [EOL] } <line_num>: 95,98
public void testRecursiveInternal1() { [EOL]     testSame("var f = function foo() { foo() }"); [EOL] } <line_num>: 100,102
public void testRecursiveInternal2() { [EOL]     testSame("var f = function foo() { function g(){foo()} g() }"); [EOL] } <line_num>: 104,106
public void testRecursiveExternal1() { [EOL]     test("var f = function foo() { f() }", "function f() { f() }"); [EOL] } <line_num>: 108,111
public void testRecursiveExternal2() { [EOL]     test("var f = function foo() { function g(){f()} g() }", "function f() { function g(){f()} g() }"); [EOL] } <line_num>: 113,116
public void testConstantFunction1() { [EOL]     test("var FOO = function(){};FOO()", "function FOO(){}FOO()"); [EOL] } <line_num>: 118,121
public void testInnerFunction1() { [EOL]     test("function f() { " + "  var x = 3; var y = function() { return 4; }; return x + y();" + "}", "function f() { " + "  function y() { return 4; } var x = 3; return x + y();" + "}"); [EOL] } <line_num>: 123,131
