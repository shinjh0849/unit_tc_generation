 ObjectPropertyStringPreprocess(AbstractCompiler compiler)
public void process(Node externs, Node root)
private void addExternDeclaration(Node externs, Node declarationStmt)
public void visit(NodeTraversal t, Node n, Node parent)
String OBJECT_PROPERTY_STRING=Optional["goog.testing.ObjectPropertyString"]
String EXTERN_OBJECT_PROPERTY_STRING=Optional["JSCompiler_ObjectPropertyString"]
DiagnosticType INVALID_NUM_ARGUMENTS_ERROR=Optional[DiagnosticType.error("JSC_OBJECT_PROPERTY_STRING_NUM_ARGS", "goog.testing.ObjectPropertyString instantiated with \"{0}\" " + "arguments, expected 2.")]
DiagnosticType QUALIFIED_NAME_EXPECTED_ERROR=Optional[DiagnosticType.error("JSC_OBJECT_PROPERTY_STRING_QUALIFIED_NAME_EXPECTED", "goog.testing.ObjectPropertyString instantiated with invalid " + "argument, qualified name expected. Was \"{0}\".")]
DiagnosticType STRING_LITERAL_EXPECTED_ERROR=Optional[DiagnosticType.error("JSC_OBJECT_PROPERTY_STRING_STRING_LITERAL_EXPECTED", "goog.testing.ObjectPropertyString instantiated with invalid " + "argument, string literal expected. Was \"{0}\".")]
AbstractCompiler compiler
