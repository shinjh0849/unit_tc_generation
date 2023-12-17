@Override [EOL] protected CompilerPass getProcessor(Compiler compiler) { [EOL]     return new PeepholeOptimizationsPass(compiler, new PeepholeFoldWithTypes()); [EOL] } <line_num>: 26,29
@Override [EOL] public void setUp() { [EOL]     enableTypeCheck(CheckLevel.WARNING); [EOL] } <line_num>: 31,34
public void testFoldTypeofObject() { [EOL]     test("var x = {};typeof x", "var x = {};\"object\""); [EOL]     test("var x = [];typeof x", "var x = [];\"object\""); [EOL]     test("var x = null;typeof x", "var x = null;\"object\""); [EOL] } <line_num>: 36,46
public void testFoldTypeofString() { [EOL]     test("var x = \"foo\";typeof x", "var x = \"foo\";\"string\""); [EOL]     test("var x = new String(\"foo\");typeof x", "var x = new String(\"foo\");\"object\""); [EOL] } <line_num>: 48,54
public void testFoldTypeofNumber() { [EOL]     test("var x = 10;typeof x", "var x = 10;\"number\""); [EOL]     test("var x = new Number(6);typeof x", "var x = new Number(6);\"object\""); [EOL] } <line_num>: 56,62
public void testFoldTypeofBoolean() { [EOL]     test("var x = false;typeof x", "var x = false;\"boolean\""); [EOL]     test("var x = new Boolean(true);typeof x", "var x = new Boolean(true);\"object\""); [EOL] } <line_num>: 64,70
public void testFoldTypeofUndefined() { [EOL]     test("var x = undefined;typeof x", "var x = undefined;\"undefined\""); [EOL] } <line_num>: 72,75
public void testDontFoldTypeofUnionTypes() { [EOL]     testSame("var x = (unknown ? {} : null);typeof x"); [EOL] } <line_num>: 77,80
public void testDontFoldTypeofSideEffects() { [EOL]     testSame("var x = 6 ;typeof (x++)"); [EOL] } <line_num>: 82,85
public void testDontFoldTypeofWithTypeCheckDisabled() { [EOL]     disableTypeCheck(); [EOL]     testSame("var x = {};typeof x"); [EOL] } <line_num>: 87,90
