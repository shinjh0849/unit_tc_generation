@Override [EOL] public CompilerOptions getOptions() { [EOL]     CompilerOptions options = super.getOptions(); [EOL]     if (enableAmbiguousFunctionCheck) { [EOL]         options.setWarningLevel(DiagnosticGroups.AMBIGUOUS_FUNCTION_DECL, CheckLevel.WARNING); [EOL]     } [EOL]     return options; [EOL] } <line_num>: 33,41
@Override [EOL] public CompilerPass getProcessor(Compiler compiler) { [EOL]     return new VariableReferenceCheck(compiler, CheckLevel.WARNING); [EOL] } <line_num>: 43,47
@Override [EOL] public void setUp() throws Exception { [EOL]     super.setUp(); [EOL]     enableAmbiguousFunctionCheck = false; [EOL] } <line_num>: 49,53
public void testCorrectCode() { [EOL]     assertNoWarning("function foo(d) { (function() { d.foo(); }); d.bar(); } "); [EOL]     assertNoWarning("function foo() { bar(); } function bar() { foo(); } "); [EOL]     assertNoWarning("function f(d) { d = 3; }"); [EOL]     assertNoWarning(VARIABLE_RUN); [EOL]     assertNoWarning("function f() { " + VARIABLE_RUN + "}"); [EOL] } <line_num>: 55,61
public void testCorrectShadowing() { [EOL]     assertNoWarning(VARIABLE_RUN + "function f() { " + VARIABLE_RUN + "}"); [EOL] } <line_num>: 63,65
public void testCorrectRedeclare() { [EOL]     assertNoWarning("function f() { if (1) { var a = 2; } else { var a = 3; } }"); [EOL] } <line_num>: 67,70
public void testCorrectRecursion() { [EOL]     assertNoWarning("function f() { var x = function() { x(); }; }"); [EOL] } <line_num>: 72,74
public void testCorrectCatch() { [EOL]     assertNoWarning("function f() { try { var x = 2; } catch (x) {} }"); [EOL] } <line_num>: 76,78
public void testRedeclare() { [EOL]     assertRedeclare("function f() { var a = 2; var a = 3; }"); [EOL]     assertRedeclare("function f(a) { var a = 2; }"); [EOL] } <line_num>: 80,84
public void testEarlyReference() { [EOL]     assertUndeclared("function f() { a = 2; var a = 3; }"); [EOL] } <line_num>: 86,88
public void testCorrectEarlyReference() { [EOL]     assertNoWarning("var goog = goog || {}"); [EOL]     assertNoWarning("function f() { a = 2; } var a = 2;"); [EOL] } <line_num>: 90,93
public void testUnreferencedBleedingFunction() { [EOL]     assertNoWarning("var x = function y() {}"); [EOL] } <line_num>: 95,97
public void testReferencedBleedingFunction() { [EOL]     assertNoWarning("var x = function y() { return y(); }"); [EOL] } <line_num>: 99,101
public void testDoubleDeclaration() { [EOL]     assertRedeclare("function x(y) { if (true) { var y; } }"); [EOL] } <line_num>: 103,105
public void testDoubleDeclaration2() { [EOL]     assertRedeclare("function x() { var y; if (true) { var y; } }"); [EOL] } <line_num>: 107,109
public void testHoistedFunction1() { [EOL]     enableAmbiguousFunctionCheck = true; [EOL]     assertNoWarning("f(); function f() {}"); [EOL] } <line_num>: 111,114
public void testHoistedFunction2() { [EOL]     enableAmbiguousFunctionCheck = true; [EOL]     assertNoWarning("function g() { f(); function f() {} }"); [EOL] } <line_num>: 116,119
public void testNonHoistedFunction() { [EOL]     enableAmbiguousFunctionCheck = true; [EOL]     assertUndeclared("if (true) { f(); function f() {} }"); [EOL] } <line_num>: 121,124
public void testNonHoistedFunction2() { [EOL]     enableAmbiguousFunctionCheck = true; [EOL]     assertNoWarning("if (false) { function f() {} f(); }"); [EOL] } <line_num>: 126,129
public void testNonHoistedFunction3() { [EOL]     enableAmbiguousFunctionCheck = true; [EOL]     assertNoWarning("function g() { if (false) { function f() {} f(); }}"); [EOL] } <line_num>: 131,134
public void testNonHoistedFunction4() { [EOL]     enableAmbiguousFunctionCheck = true; [EOL]     assertAmbiguous("if (false) { function f() {} }  f();"); [EOL] } <line_num>: 136,139
public void testNonHoistedFunction5() { [EOL]     enableAmbiguousFunctionCheck = true; [EOL]     assertAmbiguous("function g() { if (false) { function f() {} }  f(); }"); [EOL] } <line_num>: 141,144
public void testNonHoistedFunction6() { [EOL]     enableAmbiguousFunctionCheck = true; [EOL]     assertUndeclared("if (false) { f(); function f() {} }"); [EOL] } <line_num>: 146,149
public void testNonHoistedFunction7() { [EOL]     enableAmbiguousFunctionCheck = true; [EOL]     assertUndeclared("function g() { if (false) { f(); function f() {} }}"); [EOL] } <line_num>: 151,154
public void testNonHoistedRecursiveFunction1() { [EOL]     enableAmbiguousFunctionCheck = true; [EOL]     assertNoWarning("if (false) { function f() { f(); }}"); [EOL] } <line_num>: 156,159
public void testNonHoistedRecursiveFunction2() { [EOL]     enableAmbiguousFunctionCheck = true; [EOL]     assertNoWarning("function g() { if (false) { function f() { f(); }}}"); [EOL] } <line_num>: 161,164
public void testNonHoistedRecursiveFunction3() { [EOL]     enableAmbiguousFunctionCheck = true; [EOL]     assertNoWarning("function g() { if (false) { function f() { f(); g(); }}}"); [EOL] } <line_num>: 166,169
public void testNoWarnInExterns1() { [EOL]     String externs = "var google;" + "/** @suppress {duplicate} */ var google"; [EOL]     String code = ""; [EOL]     test(externs, code, code, null, null); [EOL] } <line_num>: 171,178
public void testNoWarnInExterns2() { [EOL]     String externs = "window;" + "var window;"; [EOL]     String code = ""; [EOL]     test(externs, code, code, null, null); [EOL] } <line_num>: 180,187
private void assertRedeclare(String js) { [EOL]     testSame(js, VariableReferenceCheck.REDECLARED_VARIABLE); [EOL] } <line_num>: 192,194
private void assertUndeclared(String js) { [EOL]     testSame(js, VariableReferenceCheck.UNDECLARED_REFERENCE); [EOL] } <line_num>: 199,201
private void assertAmbiguous(String js) { [EOL]     testSame(js, VariableReferenceCheck.AMBIGUOUS_FUNCTION_DECL); [EOL] } <line_num>: 206,208
private void assertNoWarning(String js) { [EOL]     testSame(js); [EOL] } <line_num>: 214,216
