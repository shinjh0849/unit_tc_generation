 OptimizeArgumentsArray(AbstractCompiler compiler)
 OptimizeArgumentsArray(AbstractCompiler compiler, String paramPrefix)
public void process(Node externs, Node root)
public void enterScope(NodeTraversal traversal)
public void exitScope(NodeTraversal traversal)
public boolean shouldTraverse(NodeTraversal nodeTraversal, Node node, Node parent)
public void visit(NodeTraversal traversal, Node node, Node parent)
private boolean tryReplaceArguments(Scope scope)
private String getNewName()
String ARGUMENTS=Optional["arguments"]
String PARAMETER_PREFIX=Optional["JSCompiler_OptimizeArgumentsArray_p"]
String paramPredix
int uniqueId=Optional[0]
AbstractCompiler compiler
Deque<List<Node>> argumentsAccessStack=Optional[Lists.newLinkedList()]
List<Node> currentArgumentsAccess=Optional[null]
