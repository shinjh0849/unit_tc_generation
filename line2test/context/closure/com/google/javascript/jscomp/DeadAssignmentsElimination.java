public DeadAssignmentsElimination(AbstractCompiler compiler)
public boolean apply(Node n)
public void process(Node externs, Node root)
public void enterScope(NodeTraversal t)
public void exitScope(NodeTraversal t)
public void visit(NodeTraversal t, Node n, Node parent)
private void tryRemoveDeadAssignments(NodeTraversal t, ControlFlowGraph<Node> cfg)
private void tryRemoveAssignment(NodeTraversal t, Node n, FlowState<LiveVariableLattice> state)
private void tryRemoveAssignment(NodeTraversal t, Node n, Node exprRoot, FlowState<LiveVariableLattice> state)
private boolean isVariableStillLiveWithinExpression(Node n, Node exprRoot, String variable)
private VariableLiveness isVariableReadBeforeKill(Node n, String variable)
private VariableLiveness checkHookBranchReadBeforeKill(Node trueCase, Node falseCase, String variable)
AbstractCompiler compiler
LiveVariablesAnalysis liveness
Predicate<Node> matchRemovableAssigns=Optional[new Predicate<Node>() {

    @Override
    public boolean apply(Node n) {
        return (NodeUtil.isAssignmentOp(n) && n.getFirstChild().isName()) || n.isInc() || n.isDec();
    }
}]
