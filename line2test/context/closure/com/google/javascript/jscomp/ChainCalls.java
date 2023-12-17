 ChainCalls(AbstractCompiler compiler)
 CallSite(Node parent, Node n, Node callNode, Node nextGetPropNode, Node nextGetPropFirstChildNode)
public void process(Node externs, Node root)
public void enterScope(NodeTraversal t)
public void exitScope(NodeTraversal t)
public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
AbstractCompiler compiler
Set<Node> badFunctionNodes=Optional[Sets.newHashSet()]
Set<Node> goodFunctionNodes=Optional[Sets.newHashSet()]
List<CallSite> callSites=Optional[Lists.newArrayList()]
SimpleDefinitionFinder defFinder
GatherFunctions gatherFunctions=Optional[new GatherFunctions()]
