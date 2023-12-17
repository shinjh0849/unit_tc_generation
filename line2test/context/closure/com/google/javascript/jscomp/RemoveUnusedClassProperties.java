 RemoveUnusedClassProperties(AbstractCompiler compiler)
public void process(Node externs, Node root)
private void removeUnused()
public boolean shouldTraverse(NodeTraversal t, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
private boolean isPinningPropertyUse(Node n)
AbstractCompiler compiler
boolean inExterns
Set<String> used=Optional[Sets.newHashSet()]
List<Node> candidates=Optional[Lists.newArrayList()]
