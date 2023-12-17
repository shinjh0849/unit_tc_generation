 FunctionFinder(String target)
public void process(Node externs, Node root)
protected CompilerPass getProcessor(final Compiler compiler)
public void testFunctionGetIsAliased()
public void testFunctionGetIsExposedToCallOrApply()
private void assertFunctionAliased(boolean aliasStatus, String functionName)
private void assertFunctionExposedToCallOrApply(boolean exposure, String functionName)
private void compileAndRun(String source)
private Node findFunction(String name)
public void visit(NodeTraversal t, Node n, Node parent)
SimpleFunctionAliasAnalysis analysis
Compiler lastCompiler
