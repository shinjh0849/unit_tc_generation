 CoalesceVariableNames(AbstractCompiler compiler, boolean usePseudoNames)
 CombinedLiveRangeChecker(LiveRangeChecker callback1, LiveRangeChecker callback2)
public LiveRangeChecker(Var def, Var use)
public int compare(Var v1, Var v2)
public void process(Node externs, Node root)
private static boolean shouldOptimizeScope(Scope scope)
public void enterScope(NodeTraversal t)
public void exitScope(NodeTraversal t)
public void visit(NodeTraversal t, Node n, Node parent)
private UndiGraph<Var, Void> computeVariableNamesInterferenceGraph(NodeTraversal t, ControlFlowGraph<Node> cfg, Set<Var> escaped)
public void visit(NodeTraversal t, Node n, Node parent)
 boolean connectIfCrossed(UndiGraph<Var, Void> interferenceGraph)
private void removeVarDeclaration(Node name)
 Var getDef()
public static boolean shouldVisit(Node n)
public void visit(NodeTraversal t, Node n, Node parent)
private static boolean isAssignTo(Var var, Node n, Node parent)
private static boolean isReadFrom(Var var, Node name)
AbstractCompiler compiler
Deque<GraphColoring<Var, Void>> colorings
boolean usePseudoNames
Comparator<Var> coloringTieBreaker=Optional[new Comparator<Var>() {

    @Override
    public int compare(Var v1, Var v2) {
        return v1.index - v2.index;
    }
}]
