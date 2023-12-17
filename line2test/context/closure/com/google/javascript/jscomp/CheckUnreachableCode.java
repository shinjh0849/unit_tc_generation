 CheckUnreachableCode(AbstractCompiler compiler, CheckLevel level)
public void enterScope(NodeTraversal t)
public boolean shouldTraverse(NodeTraversal t, Node n, Node parent)
private void initScope(ControlFlowGraph<Node> controlFlowGraph)
public void exitScope(NodeTraversal t)
public void visit(NodeTraversal t, Node n, Node parent)
public boolean apply(EdgeTuple<Node, Branch> input)
DiagnosticType UNREACHABLE_CODE=Optional[DiagnosticType.error("JSC_UNREACHABLE_CODE", "unreachable code")]
AbstractCompiler compiler
CheckLevel level
