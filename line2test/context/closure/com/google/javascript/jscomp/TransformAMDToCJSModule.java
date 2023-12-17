 TransformAMDToCJSModule(AbstractCompiler compiler)
public RenameCallback(String from, String to)
public void process(Node externs, Node root)
private void unsupportedDefineError(NodeTraversal t, Node n)
private boolean isVirtualModuleName(String moduleName)
public void visit(NodeTraversal t, Node n, Node parent)
private void handleDefineObjectLiteral(Node parent, Node onlyExport, Node script)
private void handleRequiresAndParamList(NodeTraversal t, Node defineNode, Node script, Node requiresNode, Node callback)
private void handleRequire(NodeTraversal t, Node defineNode, Node script, Node callback, Node aliasNode, Node modNode)
private String handlePlugins(NodeTraversal t, Node script, String moduleName, Node modNode)
private void moveCallbackContentToTopLevel(Node defineParent, Node script, Node callbackBlock)
public void visit(NodeTraversal t, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
DiagnosticType UNSUPPORTED_DEFINE_SIGNATURE_ERROR=Optional[DiagnosticType.error("UNSUPPORTED_DEFINE_SIGNATURE", "Only define(function() ...), define(OBJECT_LITERAL) and define(" + "['dep', 'dep1'], function(d0, d2, [exports, module]) ...) forms " + "are currently supported.")]
DiagnosticType NON_TOP_LEVEL_STATEMENT_DEFINE_ERROR=Optional[DiagnosticType.error("NON_TOP_LEVEL_STATEMENT_DEFINE", "The define function must be called as a top-level statement.")]
DiagnosticType REQUIREJS_PLUGINS_NOT_SUPPORTED_WARNING=Optional[DiagnosticType.warning("REQUIREJS_PLUGINS_NOT_SUPPORTED", "Plugins in define requirements are not supported: {0}")]
String VAR_RENAME_SUFFIX=Optional["__alias"]
AbstractCompiler compiler
int renameIndex=Optional[0]
