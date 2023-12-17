public CheckDebuggerStatement(AbstractCompiler compiler) { [EOL]     this.compiler = compiler; [EOL] } <line_num>: 40,42
@Override [EOL] public void process(Node externs, Node root) { [EOL]     NodeTraversal.traverse(compiler, root, this); [EOL] } <line_num>: 44,47
@Override [EOL] public void visit(NodeTraversal t, Node n, Node parent) { [EOL]     if (n.isDebugger()) { [EOL]         t.report(n, DEBUGGER_STATEMENT_PRESENT); [EOL]     } [EOL] } <line_num>: 49,54
