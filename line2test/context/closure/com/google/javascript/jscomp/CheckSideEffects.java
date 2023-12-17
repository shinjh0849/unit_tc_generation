 CheckSideEffects(AbstractCompiler compiler, CheckLevel level, boolean protectSideEffectFreeCode)
 StripProtection(AbstractCompiler compiler)
public void process(Node externs, Node root)
public void hotSwapScript(Node scriptRoot, Node originalRoot)
public void visit(NodeTraversal t, Node n, Node parent)
private void protectSideEffects()
private void addExtern()
public void process(Node externs, Node root)
public void visit(NodeTraversal t, Node n, Node parent)
DiagnosticType USELESS_CODE_ERROR=Optional[DiagnosticType.warning("JSC_USELESS_CODE", "Suspicious code. {0}")]
String PROTECTOR_FN=Optional["JSCOMPILER_PRESERVE"]
CheckLevel level
List<Node> problemNodes=Optional[Lists.newArrayList()]
AbstractCompiler compiler
boolean protectSideEffectFreeCode
