 CheckMissingGetCssName(AbstractCompiler compiler, CheckLevel level, String blacklistRegex)
public void process(Node externs, Node root)
public void visit(NodeTraversal t, Node n, Node parent)
private boolean insideGetCssNameCall(Node n, Node parent)
private boolean insideGetUniqueIdCall(Node n, Node parent)
private boolean insideAssignmentToIdConstant(Node n, Node parent)
private boolean isIdName(String name)
AbstractCompiler compiler
CheckLevel level
Matcher blacklist
String GET_CSS_NAME_FUNCTION=Optional["goog.getCssName"]
String GET_UNIQUE_ID_FUNCTION=Optional[".getUniqueId"]
DiagnosticType MISSING_GETCSSNAME=Optional[DiagnosticType.disabled("JSC_MISSING_GETCSSNAME", "missing goog.getCssName around literal ''{0}''")]
