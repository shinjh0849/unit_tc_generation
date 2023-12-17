 ShadowVariables(AbstractCompiler compiler, Map<String, Assignment> assignments, SortedSet<Assignment> varsByFrequency, Map<Node, String> pseudoNameMap)
public void process(Node externs, Node root)
public void visit(NodeTraversal t, Node n, Node parent)
public void enterScope(NodeTraversal t)
public void exitScope(NodeTraversal t)
public void visit(NodeTraversal t, Node n, Node parent)
private Assignment findBestShadow(Scope curScope, Var candidate)
private void doShadow(Assignment original, Assignment toShadow, Var var)
Multimap<Node, String> scopeUpRefMap=Optional[HashMultimap.create()]
Multimap<Var, Node> varToNameUsage=Optional[HashMultimap.create()]
AbstractCompiler compiler
SortedSet<Assignment> varsByFrequency
Map<String, Assignment> assignments
Map<Node, String> oldPseudoNameMap
Map<Node, String> deltaPseudoNameMap
