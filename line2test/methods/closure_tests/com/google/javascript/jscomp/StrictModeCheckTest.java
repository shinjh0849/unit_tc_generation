public StrictModeCheckTest() { [EOL]     super(EXTERNS); [EOL] } <line_num>: 25,27
@Override [EOL] protected void setUp() throws Exception { [EOL]     super.setUp(); [EOL]     noVarCheck = false; [EOL]     noCajaChecks = false; [EOL] } <line_num>: 29,34
@Override [EOL] protected CompilerPass getProcessor(Compiler compiler) { [EOL]     return new StrictModeCheck(compiler, noVarCheck, noCajaChecks); [EOL] } <line_num>: 36,39
@Override [EOL] protected int getNumRepetitions() { [EOL]     return 1; [EOL] } <line_num>: 41,44
public void testEval() { [EOL]     test("function foo() { eval('a'); }", null, StrictModeCheck.EVAL_USE); [EOL] } <line_num>: 46,49
public void testEval2() { [EOL]     testSame("function foo(eval) {}", StrictModeCheck.EVAL_DECLARATION); [EOL] } <line_num>: 51,54
public void testEval3() { [EOL]     testSame("function foo() {} foo.eval = 3;"); [EOL] } <line_num>: 56,58
public void testEval4() { [EOL]     testSame("function foo() { var eval = 3; }", StrictModeCheck.EVAL_DECLARATION); [EOL] } <line_num>: 60,63
public void testEval5() { [EOL]     testSame("function eval() {}", StrictModeCheck.EVAL_DECLARATION); [EOL] } <line_num>: 65,67
public void testEval6() { [EOL]     testSame("try {} catch (eval) {}", StrictModeCheck.EVAL_DECLARATION); [EOL] } <line_num>: 69,71
public void testEval7() { [EOL]     testSame("var o = {eval: 3};"); [EOL] } <line_num>: 73,75
public void testEval8() { [EOL]     testSame("var a; eval: while (true) { a = 3; }"); [EOL] } <line_num>: 77,79
public void testUnknownVariable() { [EOL]     testSame("function foo(a) { a = b; }", StrictModeCheck.UNKNOWN_VARIABLE); [EOL] } <line_num>: 81,83
public void testUnknownVariable2() { [EOL]     testSame("a: while (true) { a = 3; }", StrictModeCheck.UNKNOWN_VARIABLE); [EOL] } <line_num>: 85,87
public void testUnknownVariable3() { [EOL]     testSame("try {} catch (ex) { ex = 3; }"); [EOL] } <line_num>: 89,91
public void testArguments() { [EOL]     testSame("function foo(arguments) {}", StrictModeCheck.ARGUMENTS_DECLARATION); [EOL] } <line_num>: 93,96
public void testArguments2() { [EOL]     testSame("function foo() { var arguments = 3; }", StrictModeCheck.ARGUMENTS_DECLARATION); [EOL] } <line_num>: 98,101
public void testArguments3() { [EOL]     testSame("function arguments() {}", StrictModeCheck.ARGUMENTS_DECLARATION); [EOL] } <line_num>: 103,106
public void testArguments4() { [EOL]     testSame("try {} catch (arguments) {}", StrictModeCheck.ARGUMENTS_DECLARATION); [EOL] } <line_num>: 108,111
public void testArguments5() { [EOL]     testSame("var o = {arguments: 3};"); [EOL] } <line_num>: 113,115
public void testEvalAssignment() { [EOL]     noCajaChecks = true; [EOL]     testSame("function foo() { eval = []; }", StrictModeCheck.EVAL_ASSIGNMENT); [EOL] } <line_num>: 117,121
public void testEvalAssignment2() { [EOL]     test("function foo() { eval = []; }", null, StrictModeCheck.EVAL_USE); [EOL] } <line_num>: 123,125
public void testAssignToArguments() { [EOL]     testSame("function foo() { arguments = []; }", StrictModeCheck.ARGUMENTS_ASSIGNMENT); [EOL] } <line_num>: 127,130
public void testDeleteVar() { [EOL]     testSame("var a; delete a", StrictModeCheck.DELETE_VARIABLE); [EOL] } <line_num>: 132,134
public void testDeleteFunction() { [EOL]     testSame("function a() {} delete a", StrictModeCheck.DELETE_VARIABLE); [EOL] } <line_num>: 136,138
public void testDeleteArgument() { [EOL]     testSame("function b(a) { delete a; }", StrictModeCheck.DELETE_VARIABLE); [EOL] } <line_num>: 140,143
public void testDeleteProperty() { [EOL]     testSame("function f(obj) { delete obj.a; }"); [EOL] } <line_num>: 145,147
public void testIllegalName() { [EOL]     test("var a__ = 3;", null, StrictModeCheck.ILLEGAL_NAME); [EOL] } <line_num>: 149,151
public void testIllegalName2() { [EOL]     test("function a__() {}", null, StrictModeCheck.ILLEGAL_NAME); [EOL] } <line_num>: 153,155
public void testIllegalName3() { [EOL]     test("function f(a__) {}", null, StrictModeCheck.ILLEGAL_NAME); [EOL] } <line_num>: 157,159
public void testIllegalName4() { [EOL]     test("try {} catch (a__) {}", null, StrictModeCheck.ILLEGAL_NAME); [EOL] } <line_num>: 161,163
public void testIllegalName5() { [EOL]     noVarCheck = true; [EOL]     test("var a = b__;", null, StrictModeCheck.ILLEGAL_NAME); [EOL] } <line_num>: 165,168
public void testIllegalName6() { [EOL]     test("function f(obj) { return obj.a__; }", null, StrictModeCheck.ILLEGAL_NAME); [EOL] } <line_num>: 170,173
public void testIllegalName7() { [EOL]     noCajaChecks = true; [EOL]     testSame("var a__ = 3;"); [EOL] } <line_num>: 175,178
public void testIllegalName8() { [EOL]     test("var o = {a__: 3};", null, StrictModeCheck.ILLEGAL_NAME); [EOL]     test("var o = {b: 3, a__: 4};", null, StrictModeCheck.ILLEGAL_NAME); [EOL]     test("var o = {b: 3, get a__() {}};", null, StrictModeCheck.ILLEGAL_NAME); [EOL]     test("var o = {b: 3, set a__(c) {}};", null, StrictModeCheck.ILLEGAL_NAME); [EOL] } <line_num>: 180,185
public void testIllegalName9() { [EOL]     test("a__: while (true) { var b = 3; }", null, StrictModeCheck.ILLEGAL_NAME); [EOL] } <line_num>: 187,190
public void testIllegalName10() { [EOL]     testSame("var o = {1: 3, 2: 4};"); [EOL] } <line_num>: 192,195
public void testDuplicateObjectLiteralKey() { [EOL]     testSame("var o = {a: 1, b: 2, c: 3};"); [EOL]     testSame("var x = { get a() {}, set a(p) {} };"); [EOL]     testSame("var o = {a: 1, b: 2, a: 3};", StrictModeCheck.DUPLICATE_OBJECT_KEY); [EOL]     testSame("var x = { get a() {}, get a() {} };", StrictModeCheck.DUPLICATE_OBJECT_KEY); [EOL]     testSame("var x = { get a() {}, a: 1 };", StrictModeCheck.DUPLICATE_OBJECT_KEY); [EOL]     testSame("var x = { set a(p) {}, a: 1 };", StrictModeCheck.DUPLICATE_OBJECT_KEY); [EOL]     testSame("'use strict';\n" + "function App() {}\n" + "App.prototype = {\n" + "  get appData() { return this.appData_; },\n" + "  set appData(data) { this.appData_ = data; }\n" + "};"); [EOL] } <line_num>: 197,217
public void testFunctionDecl() { [EOL]     testSame("function g() {}"); [EOL]     testSame("var g = function() {};"); [EOL]     testSame("(function() {})();"); [EOL]     testSame("(function() {});"); [EOL]     testSame(inFn("function g() {}")); [EOL]     testSame(inFn("var g = function() {};")); [EOL]     testSame(inFn("(function() {})();")); [EOL]     testSame(inFn("(function() {});")); [EOL]     test("{function g() {}}", null, StrictModeCheck.BAD_FUNCTION_DECLARATION); [EOL]     testSame("{var g = function () {}}"); [EOL]     testSame("{(function g() {})()}"); [EOL]     test("var x;if (x) { function g(){} }", null, StrictModeCheck.BAD_FUNCTION_DECLARATION); [EOL]     testSame("var x;if (x) {var g = function () {}}"); [EOL]     testSame("var x;if (x) {(function g() {})()}"); [EOL] } <line_num>: 219,237
public void testFunctionDecl2() { [EOL]     test("{function g() {}}", null, StrictModeCheck.BAD_FUNCTION_DECLARATION); [EOL] } <line_num>: 239,241
private String inFn(String body) { [EOL]     return "function func() {" + body + "}"; [EOL] } <line_num>: 243,245
