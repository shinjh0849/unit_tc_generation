 Collapse(Node startNode, Node endNode, Node parent)
 CollapseVariableDeclarations(AbstractCompiler compiler)
public void process(Node externs, Node root)
public void visit(NodeTraversal t, Node n, Node parent)
private void blacklistStubVars(NodeTraversal t, Node varNode)
private boolean canBeRedeclared(Node n, Scope s)
private boolean isNamedParameter(Var v)
private void applyCollapses()
AbstractCompiler compiler
List<Collapse> collapses=Optional[Lists.newArrayList()]
Set<Node> nodesToCollapse=Optional[Sets.newHashSet()]
