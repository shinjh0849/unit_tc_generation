@Override [EOL] protected CompilerPass getProcessor(final Compiler compiler) { [EOL]     return new ObjectPropertyStringPreprocess(compiler); [EOL] } <line_num>: 24,27
@Override [EOL] protected int getNumRepetitions() { [EOL]     return 1; [EOL] } <line_num>: 29,32
@Override [EOL] protected void setUp() { [EOL]     super.allowExternsChanges(true); [EOL] } <line_num>: 34,37
public void testDeclaration() { [EOL]     test("goog.testing.ObjectPropertyString = function() {}", "JSCompiler_ObjectPropertyString = function() {}"); [EOL] } <line_num>: 39,42
public void testFooBar() { [EOL]     test("new goog.testing.ObjectPropertyString(foo, 'bar')", "new JSCompiler_ObjectPropertyString(goog.global, foo.bar)"); [EOL] } <line_num>: 44,47
public void testFooPrototypeBar() { [EOL]     test("new goog.testing.ObjectPropertyString(foo.prototype, 'bar')", "new JSCompiler_ObjectPropertyString(goog.global, " + "foo.prototype.bar)"); [EOL] } <line_num>: 49,53
public void testInvalidNumArgumentsError() { [EOL]     testSame(new String[] { "new goog.testing.ObjectPropertyString()" }, ObjectPropertyStringPreprocess.INVALID_NUM_ARGUMENTS_ERROR); [EOL] } <line_num>: 55,58
public void testQualifedNameExpectedError() { [EOL]     testSame(new String[] { "new goog.testing.ObjectPropertyString(foo[a], 'bar')" }, ObjectPropertyStringPreprocess.QUALIFIED_NAME_EXPECTED_ERROR); [EOL] } <line_num>: 60,66
public void testStringLiteralExpectedError() { [EOL]     testSame(new String[] { "new goog.testing.ObjectPropertyString(foo, bar)" }, ObjectPropertyStringPreprocess.STRING_LITERAL_EXPECTED_ERROR); [EOL] } <line_num>: 68,71
