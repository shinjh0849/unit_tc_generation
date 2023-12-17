 ProcessClosurePrimitives(AbstractCompiler compiler, @Nullable PreprocessorSymbolTable preprocessorSymbolTable, CheckLevel requiresLevel)
 ProvidedName(String namespace, Node node, JSModule module, boolean explicit)
 UnrecognizedRequire(Node requireNode, String namespace, String inputName)
 Set<String> getExportedVariableNames()
public void process(Node externs, Node root)
public void hotSwapScript(Node scriptRoot, Node originalRoot)
public void visit(NodeTraversal t, Node n, Node parent)
private void processRequireCall(NodeTraversal t, Node n, Node parent)
private void processProvideCall(NodeTraversal t, Node n, Node parent)
private void handleTypedefDefinition(NodeTraversal t, Node n, Node parent)
private void handleCandidateProvideDefinition(NodeTraversal t, Node n, Node parent)
private void processBaseClassCall(NodeTraversal t, Node n)
private Node getEnclosingDeclNameNode(NodeTraversal t)
private void reportBadBaseClassUse(NodeTraversal t, Node n, String extraMessage)
private void processProvideFromPreviousPass(NodeTraversal t, String name, Node parent)
public String get(String value)
public CssRenamingMap.Style getStyle()
private void processSetCssNameMapping(NodeTraversal t, Node n, Node parent)
private boolean verifyProvide(NodeTraversal t, Node methodName, Node arg)
private boolean verifyArgument(NodeTraversal t, Node methodName, Node arg)
private boolean verifyArgument(NodeTraversal t, Node methodName, Node arg, int desiredType)
private boolean verifySetCssNameMapping(NodeTraversal t, Node methodName, Node firstArg)
private void registerAnyProvidedPrefixes(String ns, Node node, JSModule module)
 void addProvide(Node node, JSModule module, boolean explicit)
 boolean isExplicitlyProvided()
 void addDefinition(Node node, JSModule module)
private void updateMinimumModule(JSModule newModule)
 void replace()
private Node createDeclarationNode()
private Node makeVarDeclNode()
private Node createNamespaceLiteral()
private Node makeAssignmentExprNode()
private JSDocInfo createConstantJsDoc()
private void setSourceInfo(Node newNode)
private int getSourceInfoOffset(Node provideStringNode)
private Node getProvideStringNode()
private static boolean isNamespacePlaceholder(Node n)
private void maybeAddStringNodeToSymbolTable(Node n)
private void maybeAddToSymbolTable(Node n)
DiagnosticType NULL_ARGUMENT_ERROR=Optional[DiagnosticType.error("JSC_NULL_ARGUMENT_ERROR", "method \"{0}\" called without an argument")]
DiagnosticType EXPECTED_OBJECTLIT_ERROR=Optional[DiagnosticType.error("JSC_EXPECTED_OBJECTLIT_ERROR", "method \"{0}\" expected an object literal argument")]
DiagnosticType EXPECTED_STRING_ERROR=Optional[DiagnosticType.error("JSC_EXPECTED_STRING_ERROR", "method \"{0}\" expected an object string argument")]
DiagnosticType INVALID_ARGUMENT_ERROR=Optional[DiagnosticType.error("JSC_INVALID_ARGUMENT_ERROR", "method \"{0}\" called with invalid argument")]
DiagnosticType INVALID_STYLE_ERROR=Optional[DiagnosticType.error("JSC_INVALID_CSS_NAME_MAP_STYLE_ERROR", "Invalid CSS name map style {0}")]
DiagnosticType TOO_MANY_ARGUMENTS_ERROR=Optional[DiagnosticType.error("JSC_TOO_MANY_ARGUMENTS_ERROR", "method \"{0}\" called with more than one argument")]
DiagnosticType DUPLICATE_NAMESPACE_ERROR=Optional[DiagnosticType.error("JSC_DUPLICATE_NAMESPACE_ERROR", "namespace \"{0}\" cannot be provided twice")]
DiagnosticType FUNCTION_NAMESPACE_ERROR=Optional[DiagnosticType.error("JSC_FUNCTION_NAMESPACE_ERROR", "\"{0}\" cannot be both provided and declared as a function")]
DiagnosticType MISSING_PROVIDE_ERROR=Optional[DiagnosticType.error("JSC_MISSING_PROVIDE_ERROR", "required \"{0}\" namespace never provided")]
DiagnosticType LATE_PROVIDE_ERROR=Optional[DiagnosticType.error("JSC_LATE_PROVIDE_ERROR", "required \"{0}\" namespace not provided yet")]
DiagnosticType INVALID_PROVIDE_ERROR=Optional[DiagnosticType.error("JSC_INVALID_PROVIDE_ERROR", "\"{0}\" is not a valid JS property name")]
DiagnosticType XMODULE_REQUIRE_ERROR=Optional[DiagnosticType.warning("JSC_XMODULE_REQUIRE_ERROR", "namespace \"{0}\" provided in module {1} " + "but required in module {2}")]
DiagnosticType NON_STRING_PASSED_TO_SET_CSS_NAME_MAPPING_ERROR=Optional[DiagnosticType.error("JSC_NON_STRING_PASSED_TO_SET_CSS_NAME_MAPPING_ERROR", "goog.setCssNameMapping only takes an object literal with string values")]
DiagnosticType INVALID_CSS_RENAMING_MAP=Optional[DiagnosticType.warning("INVALID_CSS_RENAMING_MAP", "Invalid entries in css renaming map: {0}")]
DiagnosticType BASE_CLASS_ERROR=Optional[DiagnosticType.error("JSC_BASE_CLASS_ERROR", "incorrect use of goog.base: {0}")]
String GOOG=Optional["goog"]
AbstractCompiler compiler
JSModuleGraph moduleGraph
Map<String, ProvidedName> providedNames=Optional[Maps.newTreeMap()]
List<UnrecognizedRequire> unrecognizedRequires=Optional[Lists.newArrayList()]
Set<String> exportedVariables=Optional[Sets.newHashSet()]
CheckLevel requiresLevel
PreprocessorSymbolTable preprocessorSymbolTable
