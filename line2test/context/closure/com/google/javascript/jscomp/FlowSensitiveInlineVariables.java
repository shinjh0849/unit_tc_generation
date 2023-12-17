public FlowSensitiveInlineVariables(AbstractCompiler compiler)
 Candidate(String varName, Definition defMetadata, Node use, Node useCfgNode)
public boolean apply(Node n)
public void enterScope(NodeTraversal t)
public void exitScope(NodeTraversal t)
public void process(Node externs, Node root)
public void visit(NodeTraversal t, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
private Node getDefCfgNode()
public boolean apply(Node input)
public boolean apply(Node input)
private boolean canInline(final Scope scope)
private void inlineVariable()
public void visit(NodeTraversal t, Node n, Node parent)
private void getDefinition(Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
private void getNumUseInUseCfgNode(Node n, Node parant)
private static boolean checkRightOf(Node n, Node expressionRoot, Predicate<Node> predicate)
private static boolean checkLeftOf(Node n, Node expressionRoot, Predicate<Node> predicate)
AbstractCompiler compiler
Set<Var> inlinedNewDependencies=Optional[Sets.newHashSet()]
ControlFlowGraph<Node> cfg
List<Candidate> candidates
MustBeReachingVariableDef reachingDef
MaybeReachingVariableUse reachingUses
Predicate<Node> SIDE_EFFECT_PREDICATE=Optional[new Predicate<Node>() {

    @Override
    public boolean apply(Node n) {
        // When the node is null it means, we reached the implicit return
        // where the function returns (possibly without an return statement)
        if (n == null) {
            return false;
        }
        // TODO(user): We only care about calls to functions that
        // passes one of the dependent variable to a non-side-effect free
        // function.
        if (n.isCall() && NodeUtil.functionCallHasSideEffects(n)) {
            return true;
        }
        if (n.isNew() && NodeUtil.constructorCallHasSideEffects(n)) {
            return true;
        }
        if (n.isDelProp()) {
            return true;
        }
        for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
            if (!ControlFlowGraph.isEnteringNewCfgNode(c) && apply(c)) {
                return true;
            }
        }
        return false;
    }
}]
