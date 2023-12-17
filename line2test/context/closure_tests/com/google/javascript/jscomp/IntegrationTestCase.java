public void setUp()
protected void testSame(CompilerOptions options, String original)
protected void testSame(CompilerOptions options, String[] original)
protected void test(CompilerOptions options, String original, String compiled)
protected void test(CompilerOptions options, String[] original, String[] compiled)
protected void test(CompilerOptions options, String original, DiagnosticType warning)
protected void test(CompilerOptions options, String original, String compiled, DiagnosticType warning)
protected void test(CompilerOptions options, String[] original, DiagnosticType warning)
protected void test(CompilerOptions options, String[] original, String[] compiled, DiagnosticType warning)
protected void test(CompilerOptions options, String[] original, String[] compiled, DiagnosticType[] warnings)
protected void checkUnexpectedErrorsOrWarnings(Compiler compiler, int expected)
protected Compiler compile(CompilerOptions options, String original)
protected Compiler compile(CompilerOptions options, String[] original)
protected Node parse(String[] original, CompilerOptions options, boolean normalize)
 abstract CompilerOptions createCompilerOptions()
List<SourceFile> DEFAULT_EXTERNS=Optional[ImmutableList.of(SourceFile.fromCode("externs", "var arguments;\n" + "/** @constructor */ function Window() {}\n" + "/** @type {string} */ Window.prototype.name;\n" + "/** @type {string} */ Window.prototype.offsetWidth;\n" + "/** @type {Window} */ var window;\n" + "/** @nosideeffects */ function noSideEffects() {}\n" + "/** @constructor\n * @nosideeffects */ function Widget() {}\n" + "/** @modifies {this} */ Widget.prototype.go = function() {};\n" + "/** @return {string} */ var widgetToken = function() {};\n" + "function alert(message) {}" + "function Object() {}" + "Object.seal;"))]
List<SourceFile> externs=Optional[DEFAULT_EXTERNS]
Compiler lastCompiler
boolean normalizeResults=Optional[false]
