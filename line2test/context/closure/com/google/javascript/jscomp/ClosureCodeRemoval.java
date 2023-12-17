public RemovableAssignment(Node nameNode, Node assignNode, NodeTraversal traversal)
 FindAssertionCalls()
 ClosureCodeRemoval(AbstractCompiler compiler, boolean removeAbstractMethods, boolean removeAssertionCalls)
public void remove()
public void visit(NodeTraversal t, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
public void process(Node externs, Node root)
AbstractCompiler compiler
String ABSTRACT_METHOD_NAME=Optional["goog.abstractMethod"]
boolean removeAbstractMethods
boolean removeAssertionCalls
List<RemovableAssignment> abstractMethodAssignmentNodes=Optional[Lists.newArrayList()]
List<Node> assertionCalls=Optional[Lists.newArrayList()]
