public ClosureCodeRemovalTest() { [EOL]     super(EXTERNS); [EOL] } <line_num>: 28,30
public void testRemoveAbstract() { [EOL]     test("function Foo() {}; Foo.prototype.doSomething = goog.abstractMethod;", "function Foo() {};"); [EOL] } <line_num>: 32,35
public void testRemoveMultiplySetAbstract() { [EOL]     test("function Foo() {}; Foo.prototype.doSomething = " + "Foo.prototype.doSomethingElse = Foo.prototype.oneMore = " + "goog.abstractMethod;", "function Foo() {};"); [EOL] } <line_num>: 37,42
public void testDoNotRemoveNormal() { [EOL]     testSame("function Foo() {}; Foo.prototype.doSomething = function() {};"); [EOL] } <line_num>: 44,46
public void testDoNotRemoveOverride() { [EOL]     test("function Foo() {}; Foo.prototype.doSomething = goog.abstractMethod;" + "function Bar() {}; goog.inherits(Bar, Foo);" + "Bar.prototype.doSomething = function() {}", "function Foo() {}; function Bar() {}; goog.inherits(Bar, Foo);" + "Bar.prototype.doSomething = function() {}"); [EOL] } <line_num>: 48,54
public void testDoNotRemoveNonQualifiedName() { [EOL]     testSame("document.getElementById('x').y = goog.abstractMethod;"); [EOL] } <line_num>: 56,58
public void testStopRemovalAtNonQualifiedName() { [EOL]     test("function Foo() {}; function Bar() {};" + "Foo.prototype.x = document.getElementById('x').y = Bar.prototype.x" + " = goog.abstractMethod;", "function Foo() {}; function Bar() {};" + "Foo.prototype.x = document.getElementById('x').y = " + "goog.abstractMethod;"); [EOL] } <line_num>: 60,67
public void testAssertionRemoval1() { [EOL]     test("var x = goog.asserts.assert(y(), 'message');", "var x = y();"); [EOL] } <line_num>: 69,71
public void testAssertionRemoval2() { [EOL]     test("goog.asserts.assert(y(), 'message');", ""); [EOL] } <line_num>: 73,75
public void testAssertionRemoval3() { [EOL]     test("goog.asserts.assert();", ""); [EOL] } <line_num>: 77,79
public void testAssertionRemoval4() { [EOL]     test("var x = goog.asserts.assert();", "var x = void 0;"); [EOL] } <line_num>: 81,83
@Override [EOL] protected ClosureCodeRemoval getProcessor(Compiler compiler) { [EOL]     return new ClosureCodeRemoval(compiler, true, true); [EOL] } <line_num>: 85,88
