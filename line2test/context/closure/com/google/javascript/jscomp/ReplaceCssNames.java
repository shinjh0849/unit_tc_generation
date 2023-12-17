 ReplaceCssNames(AbstractCompiler compiler, @Nullable Map<String, Integer> cssNames, @Nullable Set<String> whitelist)
public void process(Node externs, Node root)
protected CssRenamingMap getCssRenamingMap()
public void visit(NodeTraversal t, Node n, Node parent)
private void processStringNode(NodeTraversal t, Node n)
String GET_CSS_NAME_FUNCTION=Optional["goog.getCssName"]
DiagnosticType INVALID_NUM_ARGUMENTS_ERROR=Optional[DiagnosticType.error("JSC_GETCSSNAME_NUM_ARGS", "goog.getCssName called with \"{0}\" arguments, expected 1 or 2.")]
DiagnosticType STRING_LITERAL_EXPECTED_ERROR=Optional[DiagnosticType.error("JSC_GETCSSNAME_STRING_LITERAL_EXPECTED", "goog.getCssName called with invalid argument, string literal " + "expected.  Was \"{0}\".")]
DiagnosticType UNEXPECTED_STRING_LITERAL_ERROR=Optional[DiagnosticType.error("JSC_GETCSSNAME_UNEXPECTED_STRING_LITERAL", "goog.getCssName called with invalid arguments, string literal " + "passed as first of two arguments.  Did you mean " + "goog.getCssName(\"{0}-{1}\")?")]
DiagnosticType UNKNOWN_SYMBOL_WARNING=Optional[DiagnosticType.warning("JSC_GETCSSNAME_UNKNOWN_CSS_SYMBOL", "goog.getCssName called with unrecognized symbol \"{0}\" in class " + "\"{1}\".")]
AbstractCompiler compiler
Map<String, Integer> cssNames
CssRenamingMap symbolMap
Set<String> whitelist
JSType nativeStringType
