@Override [EOL] protected CompilerPass getProcessor(final Compiler compiler) { [EOL]     return new ObjectPropertyStringPostprocess(compiler); [EOL] } <line_num>: 25,28
@Override [EOL] protected int getNumRepetitions() { [EOL]     return 1; [EOL] } <line_num>: 30,33
public void testFooDotBar() { [EOL]     testPass("goog.global, foo.bar", "foo, 'bar'"); [EOL] } <line_num>: 35,37
public void testFooGetElemBar() { [EOL]     testPass("goog.global, foo[bar]", "foo, bar"); [EOL] } <line_num>: 39,41
public void testFooBar() { [EOL]     testPass("goog.global, foo$bar", "goog.global, 'foo$bar'"); [EOL] } <line_num>: 43,45
private void testPass(String input, String expected) { [EOL]     test("new JSCompiler_ObjectPropertyString(" + input + ")", "new JSCompiler_ObjectPropertyString(" + expected + ")"); [EOL] } <line_num>: 47,50
