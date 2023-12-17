@Override [EOL] public CompilerPass getProcessor(Compiler compiler) { [EOL]     return new ControlStructureCheck(compiler); [EOL] } <line_num>: 35,38
public void testWhile() { [EOL]     assertNoError("while(1) { break; }"); [EOL] } <line_num>: 40,42
public void testNextedWhile() { [EOL]     assertNoError("while(1) { while(1) { break; } }"); [EOL] } <line_num>: 44,46
public void testBreak() { [EOL]     assertInvalidBreak("break;"); [EOL] } <line_num>: 48,50
public void testContinue() { [EOL]     assertInvalidContinue("continue;"); [EOL] } <line_num>: 52,54
public void testBreakCrossFunction() { [EOL]     assertInvalidBreak("while(1) { function f() { break; } }"); [EOL] } <line_num>: 56,58
public void testBreakCrossFunctionInFor() { [EOL]     assertInvalidBreak("while(1) {for(var f = function () { break; };;) {}}"); [EOL] } <line_num>: 60,62
public void testContinueToSwitch() { [EOL]     assertInvalidContinue("switch(1) {case(1): continue; }"); [EOL] } <line_num>: 64,66
public void testContinueToSwitchWithNoCases() { [EOL]     assertNoError("switch(1){}"); [EOL] } <line_num>: 68,70
public void testContinueToSwitchWithTwoCases() { [EOL]     assertInvalidContinue("switch(1){case(1):break;case(2):continue;}"); [EOL] } <line_num>: 72,74
public void testContinueToSwitchWithDefault() { [EOL]     assertInvalidContinue("switch(1){case(1):break;case(2):default:continue;}"); [EOL] } <line_num>: 76,78
public void testContinueToLabelSwitch() { [EOL]     assertInvalidLabeledContinue("while(1) {a: switch(1) {case(1): continue a; }}"); [EOL] } <line_num>: 80,83
public void testContinueOutsideSwitch() { [EOL]     assertNoError("b: while(1) { a: switch(1) { case(1): continue b; } }"); [EOL] } <line_num>: 85,87
public void testContinueNotCrossFunction1() { [EOL]     assertNoError("a:switch(1){case(1):function f(){a:while(1){continue a;}}}"); [EOL] } <line_num>: 89,91
public void testContinueNotCrossFunction2() { [EOL]     assertUndefinedLabel("a:switch(1){case(1):function f(){while(1){continue a;}}}"); [EOL] } <line_num>: 93,96
public void testUseOfWith1() { [EOL]     testSame("with(a){}", ControlStructureCheck.USE_OF_WITH); [EOL] } <line_num>: 98,100
public void testUseOfWith2() { [EOL]     testSame("/** @suppress {with} */" + "with(a){}"); [EOL] } <line_num>: 102,105
public void testUseOfWith3() { [EOL]     testSame("function f(expr, context) {\n" + "  try {\n" + "    /** @suppress{with} */ with (context) {\n" + "      return eval('[' + expr + '][0]');\n" + "    }\n" + "  } catch (e) {\n" + "    return null;\n" + "  }\n" + "};\n"); [EOL] } <line_num>: 107,118
private void assertNoError(String js) { [EOL]     testSame(js); [EOL] } <line_num>: 120,122
private void assertInvalidBreak(String js) { [EOL]     testParseError(js, UNLABELED_BREAK); [EOL] } <line_num>: 124,126
private void assertInvalidContinue(String js) { [EOL]     testParseError(js, UNEXPECTED_CONTINUE); [EOL] } <line_num>: 128,130
private void assertInvalidLabeledContinue(String js) { [EOL]     testParseError(js, UNEXPECTED_LABLED_CONTINUE); [EOL] } <line_num>: 132,134
private void assertUndefinedLabel(String js) { [EOL]     testParseError(js, UNDEFINED_LABEL); [EOL] } <line_num>: 136,138
private void testParseError(String js, String errorText) { [EOL]     Compiler compiler = new Compiler(); [EOL]     compiler.parseTestCode(js); [EOL]     assertTrue(compiler.getErrorCount() == 1); [EOL]     String msg = compiler.getErrors()[0].toString(); [EOL]     assertTrue(msg.contains(errorText)); [EOL] } <line_num>: 140,146
