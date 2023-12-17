 ExportTestFunctions(AbstractCompiler compiler, String exportSymbolFunction, String exportPropertyFunction)
public void visit(NodeTraversal t, Node n, Node parent)
private boolean isVarDeclaredFunction(Node node)
public void process(Node externs, Node root)
private void exportTestFunctionAsSymbol(String testFunctionName, Node node, Node scriptNode)
private void exportTestFunctionAsProperty(String fullyQualifiedFunctionName, Node parent, Node node, Node scriptNode)
private boolean isTestFunction(Node n, String functionName)
Pattern TEST_FUNCTIONS_NAME_PATTERN=Optional[Pattern.compile("^(?:((\\w+\\.)+prototype\\.)*" + "(setUpPage|setUp|tearDown|tearDownPage|test\\w+))$")]
AbstractCompiler compiler
String exportSymbolFunction
String exportPropertyFunction
