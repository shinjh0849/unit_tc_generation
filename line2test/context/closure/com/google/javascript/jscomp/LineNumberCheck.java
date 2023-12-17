 LineNumberCheck(AbstractCompiler compiler)
public void setCheckSubTree(Node root)
public void process(Node externs, Node root)
public boolean shouldTraverse(NodeTraversal t, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
DiagnosticType MISSING_LINE_INFO=Optional[DiagnosticType.error("JSC_MISSING_LINE_INFO", "No source location information associated with {0}.\n" + "Most likely a Node has been created with settings the source file " + "and line/column location.  Usually this is done using " + "Node.copyInformationFrom and supplying a Node from the source AST.")]
AbstractCompiler compiler
boolean requiresLineNumbers=Optional[false]
