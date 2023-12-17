public ExportTestFunctionsTest()
public void setUp()
protected CompilerPass getProcessor(Compiler compiler)
protected int getNumRepetitions()
public void testFunctionsAreExported()
public void testBasicTestFunctionsAreExported()
public void testFunctionExpressionsAreExported()
public void testFunctionAssignmentsAreExported()
String EXTERNS=Optional["function google_exportSymbol(a, b) {}; " + "function google_exportProperty(a, b, c) {};"]
String TEST_FUNCTIONS_WITH_NAMES=Optional["function Foo(arg) {}; " + "function setUp(arg3) {}; " + "function tearDown(arg, arg2) {}; " + "function testBar(arg) {}"]
