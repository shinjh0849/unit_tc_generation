@Override [EOL] public CompilerPass getProcessor(final Compiler compiler) { [EOL]     return new ClosureOptimizePrimitives(compiler); [EOL] } <line_num>: 26,28
public void testObjectCreateNonConstKey() { [EOL]     testSame("goog.object.create('a',1,2,3,foo,bar);"); [EOL] } <line_num>: 30,32
public void testObjectCreateOddParams() { [EOL]     testSame("goog.object.create('a',1,2);"); [EOL] } <line_num>: 34,36
public void testObjectCreate1() { [EOL]     test("var a = goog.object.create()", "var a = {}"); [EOL] } <line_num>: 38,40
public void testObjectCreate2() { [EOL]     test("var a = goog$object$create('b',goog$object$create('c','d'))", "var a = {'b':{'c':'d'}};"); [EOL] } <line_num>: 42,45
public void testObjectCreate3() { [EOL]     test("var a = goog.object.create(1,2)", "var a = {1:2}"); [EOL] } <line_num>: 47,49
public void testObjectCreate4() { [EOL]     test("alert(goog.object.create(1,2).toString())", "alert({1:2}.toString())"); [EOL] } <line_num>: 51,54
public void testObjectCreate5() { [EOL]     test("goog.object.create('a',2).toString()", "({'a':2}).toString()"); [EOL] } <line_num>: 56,58
