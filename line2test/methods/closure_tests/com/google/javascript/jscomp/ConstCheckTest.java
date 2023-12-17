public ConstCheckTest() { [EOL]     enableNormalize(); [EOL] } <line_num>: 26,28
@Override [EOL] public CompilerPass getProcessor(Compiler compiler) { [EOL]     return new ConstCheck(compiler); [EOL] } <line_num>: 30,33
@Override [EOL] public int getNumRepetitions() { [EOL]     return 1; [EOL] } <line_num>: 35,38
public void testConstantDefinition1() { [EOL]     testSame("var XYZ = 1;"); [EOL] } <line_num>: 40,42
public void testConstantDefinition2() { [EOL]     testSame("var a$b$XYZ = 1;"); [EOL] } <line_num>: 44,46
public void testConstantInitializedInAnonymousNamespace1() { [EOL]     testSame("var XYZ; (function(){ XYZ = 1; })();"); [EOL] } <line_num>: 48,50
public void testConstantInitializedInAnonymousNamespace2() { [EOL]     testSame("var a$b$XYZ; (function(){ a$b$XYZ = 1; })();"); [EOL] } <line_num>: 52,54
public void testObjectModified() { [EOL]     testSame("var IE = true, XYZ = {a:1,b:1}; if (IE) XYZ['c'] = 1;"); [EOL] } <line_num>: 56,58
public void testObjectPropertyInitializedLate() { [EOL]     testSame("var XYZ = {}; for (var i = 0; i < 10; i++) { XYZ[i] = i; }"); [EOL] } <line_num>: 60,62
public void testObjectRedefined1() { [EOL]     testError("var XYZ = {}; XYZ = 2;"); [EOL] } <line_num>: 64,66
public void testConstantRedefined1() { [EOL]     testError("var XYZ = 1; XYZ = 2;"); [EOL] } <line_num>: 68,70
public void testConstantRedefined2() { [EOL]     testError("var a$b$XYZ = 1; a$b$XYZ = 2;"); [EOL] } <line_num>: 72,74
public void testConstantRedefinedInLocalScope1() { [EOL]     testError("var XYZ = 1; (function(){ XYZ = 2; })();"); [EOL] } <line_num>: 76,78
public void testConstantRedefinedInLocalScope2() { [EOL]     testError("var a$b$XYZ = 1; (function(){ a$b$XYZ = 2; })();"); [EOL] } <line_num>: 80,82
public void testConstantRedefinedInLocalScopeOutOfOrder() { [EOL]     testError("function f() { XYZ = 2; } var XYZ = 1;"); [EOL] } <line_num>: 84,86
public void testConstantPostIncremented1() { [EOL]     testError("var XYZ = 1; XYZ++;"); [EOL] } <line_num>: 88,90
public void testConstantPostIncremented2() { [EOL]     testError("var a$b$XYZ = 1; a$b$XYZ++;"); [EOL] } <line_num>: 92,94
public void testConstantPreIncremented1() { [EOL]     testError("var XYZ = 1; XYZ++;"); [EOL] } <line_num>: 96,98
public void testConstantPreIncremented2() { [EOL]     testError("var a$b$XYZ = 1; a$b$XYZ++;"); [EOL] } <line_num>: 100,102
public void testConstantPostDecremented1() { [EOL]     testError("var XYZ = 1; XYZ--;"); [EOL] } <line_num>: 104,106
public void testConstantPostDecremented2() { [EOL]     testError("var a$b$XYZ = 1; a$b$XYZ--;"); [EOL] } <line_num>: 108,110
public void testConstantPreDecremented1() { [EOL]     testError("var XYZ = 1; XYZ--;"); [EOL] } <line_num>: 112,114
public void testConstantPreDecremented2() { [EOL]     testError("var a$b$XYZ = 1; a$b$XYZ--;"); [EOL] } <line_num>: 116,118
public void testAbbreviatedArithmeticAssignment1() { [EOL]     testError("var XYZ = 1; XYZ += 2;"); [EOL] } <line_num>: 120,122
public void testAbbreviatedArithmeticAssignment2() { [EOL]     testError("var a$b$XYZ = 1; a$b$XYZ %= 2;"); [EOL] } <line_num>: 124,126
public void testAbbreviatedBitAssignment1() { [EOL]     testError("var XYZ = 1; XYZ |= 2;"); [EOL] } <line_num>: 128,130
public void testAbbreviatedBitAssignment2() { [EOL]     testError("var a$b$XYZ = 1; a$b$XYZ &= 2;"); [EOL] } <line_num>: 132,134
public void testAbbreviatedShiftAssignment1() { [EOL]     testError("var XYZ = 1; XYZ >>= 2;"); [EOL] } <line_num>: 136,138
public void testAbbreviatedShiftAssignment2() { [EOL]     testError("var a$b$XYZ = 1; a$b$XYZ <<= 2;"); [EOL] } <line_num>: 140,142
public void testConstAnnotation() { [EOL]     testError("/** @const */ var xyz = 1; xyz = 3;"); [EOL] } <line_num>: 144,146
public void testConstSuppression() { [EOL]     testSame("/**\n" + " * @fileoverview\n" + " * @suppress {const}\n" + " */\n" + "/** @const */ var xyz = 1; xyz = 3;"); [EOL] } <line_num>: 148,154
private void testError(String js) { [EOL]     test(js, null, ConstCheck.CONST_REASSIGNED_VALUE_ERROR); [EOL] } <line_num>: 156,158
