 ControlFlowAnalysis(AbstractCompiler compiler, boolean shouldTraverseFunctions, boolean edgeAnnotations)
private AstControlFlowGraph(Node entry, Map<DiGraphNode<Node, Branch>, Integer> priorities, boolean edgeAnnotations)
public int compare(DiGraphNode<Node, Branch> a, DiGraphNode<Node, Branch> b)
 ControlFlowGraph<Node> getCfg()
public void process(Node externs, Node root)
private void prioritizeFromEntryNode(DiGraphNode<Node, Branch> entry)
public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
private void handleIf(Node node)
private void handleWhile(Node node)
private void handleDo(Node node)
private void handleFor(Node forNode)
private void handleSwitch(Node node)
private void handleCase(Node node)
private void handleDefault(Node node)
private void handleWith(Node node)
private void handleStmtList(Node node)
private void handleFunction(Node node)
private void handleExpr(Node node)
private void handleThrow(Node node)
private void handleTry(Node node)
private void handleCatch(Node node)
private void handleBreak(Node node)
private void handleContinue(Node node)
private void handleReturn(Node node)
private void handleStmt(Node node)
 static Node computeFollowNode(Node node, ControlFlowAnalysis cfa)
 static Node computeFollowNode(Node node)
private static Node computeFollowNode(Node fromNode, Node node, ControlFlowAnalysis cfa)
 static Node computeFallThrough(Node n)
private void createEdge(Node fromNode, ControlFlowGraph.Branch branch, Node toNode)
private void connectToPossibleExceptionHandler(Node cfgNode, Node target)
private static Node getNextSiblingOfType(Node first, int... types)
public static boolean isBreakTarget(Node target, String label)
private static boolean isContinueTarget(Node target, Node parent, String label)
private static boolean matchLabel(Node target, String label)
public static boolean mayThrowException(Node n)
 static boolean isBreakStructure(Node n, boolean labeled)
 static boolean isContinueStructure(Node n)
 static Node getExceptionHandler(Node n)
 static Node getCatchHandlerForBlock(Node block)
public int compare(DiGraphNode<Node, Branch> n1, DiGraphNode<Node, Branch> n2)
public int compare(DiGraphNode<Node, Branch> n1, DiGraphNode<Node, Branch> n2)
public Comparator<DiGraphNode<Node, Branch>> getOptionalNodeComparator(boolean isForward)
private int getPosition(DiGraphNode<Node, Branch> n)
AbstractCompiler compiler
ControlFlowGraph<Node> cfg
Map<Node, Integer> astPosition
Map<DiGraphNode<Node, Branch>, Integer> nodePriorities
Comparator<DiGraphNode<Node, Branch>> priorityComparator=Optional[new Comparator<DiGraphNode<Node, Branch>>() {

    @Override
    public int compare(DiGraphNode<Node, Branch> a, DiGraphNode<Node, Branch> b) {
        return astPosition.get(a.getValue()) - astPosition.get(b.getValue());
    }
}]
int astPositionCounter
int priorityCounter
boolean shouldTraverseFunctions
boolean edgeAnnotations
Node root
Deque<Node> exceptionHandler=Optional[new ArrayDeque<Node>()]
Multimap<Node, Node> finallyMap=Optional[HashMultimap.create()]
