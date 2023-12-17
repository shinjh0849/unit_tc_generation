 ExpandJqueryAliases(AbstractCompiler compiler)
 FindCallbackArgumentReferences(Node functionRoot, List<Node> keyReferences, List<Node> valueReferences, boolean useArrayMode)
public static boolean isJqueryExtendCall(Node n, String qname, AbstractCompiler compiler)
public boolean isJqueryExpandedEachCall(Node call, String qName)
public void visit(NodeTraversal t, Node n, Node parent)
public void process(Node externs, Node root)
private void maybeReplaceJqueryPrototypeAlias(Node n)
private void maybeExpandJqueryExtendCall(Node n)
private void maybeExpandJqueryEachCall(NodeTraversal t, Node n)
private Node tryExpandJqueryEachCall(NodeTraversal t, Node n, Node callbackFunction, List<Node> keyNodes, List<Node> valueNodes)
private void replaceOriginalJqueryEachCall(Node n, Node expandedBlock)
private boolean isArrayLitValidForExpansion(Node n)
private boolean isShadowed(String name, Scope scope)
public void visit(NodeTraversal t, Node n, Node parent)
public void enterScope(NodeTraversal t)
public void exitScope(NodeTraversal t)
AbstractCompiler compiler
CodingConvention convention
Logger logger=Optional[Logger.getLogger(ExpandJqueryAliases.class.getName())]
DiagnosticType JQUERY_UNABLE_TO_EXPAND_INVALID_LIT_ERROR=Optional[DiagnosticType.warning("JSC_JQUERY_UNABLE_TO_EXPAND_INVALID_LIT", "jQuery.expandedEach call cannot be expanded because the first " + "argument must be an object literal or an array of strings " + "literal.")]
DiagnosticType JQUERY_UNABLE_TO_EXPAND_INVALID_NAME_ERROR=Optional[DiagnosticType.error("JSC_JQUERY_UNABLE_TO_EXPAND_INVALID_NAME", "jQuery.expandedEach expansion would result in the invalid " + "property name \"{0}\".")]
DiagnosticType JQUERY_USELESS_EACH_EXPANSION=Optional[DiagnosticType.warning("JSC_JQUERY_USELESS_EACH_EXPANSION", "jQuery.expandedEach was not expanded as no valid property " + "assignments were encountered. Consider using jQuery.each instead.")]
Set<String> JQUERY_EXTEND_NAMES=Optional[ImmutableSet.of("jQuery.extend", "jQuery.fn.extend", "jQuery.prototype.extend")]
String JQUERY_EXPANDED_EACH_NAME=Optional["jQuery.expandedEach"]
PeepholeOptimizationsPass peepholePasses
