 CheckRequiresForConstructors(AbstractCompiler compiler, CheckLevel level)
public void process(Node externs, Node root)
public void hotSwapScript(Node scriptRoot, Node originalRoot)
private static boolean isClassName(String name)
private static String getOutermostClassName(String className)
public boolean shouldTraverse(NodeTraversal t, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
private void visitScriptNode(NodeTraversal t)
private void visitCallNode(Node n, Node parent)
private void visitNewNode(NodeTraversal t, Node n)
AbstractCompiler compiler
CodingConvention codingConvention
CheckLevel level
DiagnosticType MISSING_REQUIRE_WARNING=Optional[DiagnosticType.disabled("JSC_MISSING_REQUIRE_WARNING", "''{0}'' used but not goog.require''d")]
