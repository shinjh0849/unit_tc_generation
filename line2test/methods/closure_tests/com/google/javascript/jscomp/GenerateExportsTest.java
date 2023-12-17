public GenerateExportsTest() { [EOL]     super(EXTERNS); [EOL] } <line_num>: 29,31
@Override [EOL] protected CompilerPass getProcessor(Compiler compiler) { [EOL]     return new GenerateExports(compiler, "google_exportSymbol", "goog.exportProperty"); [EOL] } <line_num>: 33,37
@Override [EOL] protected int getNumRepetitions() { [EOL]     return 1; [EOL] } <line_num>: 39,43
@Override [EOL] public void setUp() throws Exception { [EOL]     super.setUp(); [EOL]     super.enableLineNumberCheck(false); [EOL] } <line_num>: 45,49
public void testExportSymbol() { [EOL]     test("/** @export */function foo() {}", "function foo(){}google_exportSymbol(\"foo\",foo)"); [EOL] } <line_num>: 51,54
public void testExportSymbolAndProperties() { [EOL]     test("/** @export */function foo() {}" + "/** @export */foo.prototype.bar = function() {}", "function foo(){}" + "google_exportSymbol(\"foo\",foo);" + "foo.prototype.bar=function(){};" + "goog.exportProperty(foo.prototype,\"bar\",foo.prototype.bar)"); [EOL] } <line_num>: 56,63
public void testExportSymbolAndConstantProperties() { [EOL]     test("/** @export */function foo() {}" + "/** @export */foo.BAR = 5;", "function foo(){}" + "google_exportSymbol(\"foo\",foo);" + "foo.BAR=5;" + "goog.exportProperty(foo,\"BAR\",foo.BAR)"); [EOL] } <line_num>: 65,72
public void testExportVars() { [EOL]     test("/** @export */var FOO = 5", "var FOO=5;" + "google_exportSymbol(\"FOO\",FOO)"); [EOL] } <line_num>: 74,78
public void testNoExport() { [EOL]     test("var FOO = 5", "var FOO=5"); [EOL] } <line_num>: 80,82
public void testNestedVarAssign() { [EOL]     test("var BAR;\n/** @export */var FOO = BAR = 5", null, FindExportableNodes.NON_GLOBAL_ERROR); [EOL] } <line_num>: 88,91
public void testNestedAssign() { [EOL]     test("var BAR;var FOO = {};\n/** @export */FOO.test = BAR = 5", null, FindExportableNodes.NON_GLOBAL_ERROR); [EOL] } <line_num>: 97,100
public void testNonGlobalScopeExport() { [EOL]     test("(function() { /** @export */var FOO = 5 })()", null, FindExportableNodes.NON_GLOBAL_ERROR); [EOL] } <line_num>: 102,105
public void testExportClass() { [EOL]     test("/** @export */ function G() {} foo();", "function G() {} google_exportSymbol('G', G); foo();"); [EOL] } <line_num>: 107,110
public void testExportSubclass() { [EOL]     test("var goog = {}; function F() {}" + "/** @export */ function G() {} goog.inherits(G, F);", "var goog = {}; function F() {}" + "function G() {} goog.inherits(G, F); google_exportSymbol('G', G);"); [EOL] } <line_num>: 112,117
public void testExportEnum() { [EOL]     test("/** @enum {string}\n @export */ var E = {A:1, B:2};", "/** @enum {string}\n @export */ var E = {A:1, B:2};" + "google_exportSymbol('E', E);"); [EOL] } <line_num>: 119,124
