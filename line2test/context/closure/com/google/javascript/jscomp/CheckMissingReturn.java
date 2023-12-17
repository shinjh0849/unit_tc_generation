 CheckMissingReturn(AbstractCompiler compiler, CheckLevel level)
public boolean apply(Node input)
public boolean apply(DiGraphEdge<Node, ControlFlowGraph.Branch> input)
public void enterScope(NodeTraversal t)
private static boolean fastAllPathsReturnCheck(ControlFlowGraph<Node> cfg)
public void exitScope(NodeTraversal t)
public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
private JSType explicitReturnExpected(Node scope)
private static boolean isEmptyFunction(Node function)
private boolean isVoidOrUnknown(JSType returnType)
DiagnosticType MISSING_RETURN_STATEMENT=Optional[DiagnosticType.warning("JSC_MISSING_RETURN_STATEMENT", "Missing return statement. Function expected to return {0}.")]
AbstractCompiler compiler
CheckLevel level
Predicate<Node> IS_RETURN=Optional[new Predicate<Node>() {

    @Override
    public boolean apply(Node input) {
        // Check for null because the control flow graph's implicit return node is
        // represented by null, so this value might be input.
        return input != null && input.isReturn();
    }
}]
Predicate<DiGraphEdge<Node, ControlFlowGraph.Branch>> GOES_THROUGH_TRUE_CONDITION_PREDICATE=Optional[new Predicate<DiGraphEdge<Node, ControlFlowGraph.Branch>>() {

    @Override
    public boolean apply(DiGraphEdge<Node, ControlFlowGraph.Branch> input) {
        // First skill all exceptions.
        Branch branch = input.getValue();
        if (branch == Branch.ON_EX) {
            return false;
        } else if (branch.isConditional()) {
            Node condition = NodeUtil.getConditionExpression(input.getSource().getValue());
            // TODO(user): We CAN make this bit smarter just looking at
            // constants. We DO have a full blown ReverseAbstractInterupter and
            // type system that can evaluate some impressions' boolean value but
            // for now we will keep this pass lightweight.
            if (condition != null) {
                TernaryValue val = NodeUtil.getImpureBooleanValue(condition);
                if (val != TernaryValue.UNKNOWN) {
                    return val.toBoolean(true) == (Branch.ON_TRUE == branch);
                }
            }
        }
        return true;
    }
}]
