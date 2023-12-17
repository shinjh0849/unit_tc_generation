public CheckRegExp(AbstractCompiler compiler)
public boolean isGlobalRegExpPropertiesUsed()
public void process(Node externs, Node root)
public void visit(NodeTraversal t, Node n, Node parent)
DiagnosticType REGEXP_REFERENCE=Optional[DiagnosticType.warning("JSC_REGEXP_REFERENCE", "References to the global RegExp object prevents " + "optimization of regular expressions.")]
DiagnosticType MALFORMED_REGEXP=Optional[DiagnosticType.warning("JSC_MALFORMED_REGEXP", "Malformed Regular Expression: {0}")]
AbstractCompiler compiler
boolean globalRegExpPropertiesUsed=Optional[false]
