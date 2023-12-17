public ConstCheck(AbstractCompiler compiler)
public void process(Node externs, Node root)
public void visit(NodeTraversal t, Node n, Node parent)
private boolean isConstant(Scope.Var var)
 void reportError(NodeTraversal t, Node n, String name)
DiagnosticType CONST_REASSIGNED_VALUE_ERROR=Optional[DiagnosticType.error("JSC_CONSTANT_REASSIGNED_VALUE_ERROR", "constant {0} assigned a value more than once")]
AbstractCompiler compiler
Set<Scope.Var> initializedConstants
