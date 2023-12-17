public CheckDebuggerStatement(AbstractCompiler compiler)
public void process(Node externs, Node root)
public void visit(NodeTraversal t, Node n, Node parent)
DiagnosticType DEBUGGER_STATEMENT_PRESENT=Optional[DiagnosticType.disabled("JSC_DEBUGGER_STATEMENT_PRESENT", "Using the debugger statement can halt your application if the user " + "has a JavaScript debugger running.")]
AbstractCompiler compiler
