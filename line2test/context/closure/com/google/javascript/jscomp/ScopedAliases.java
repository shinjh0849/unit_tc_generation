 ScopedAliases(AbstractCompiler compiler, @Nullable PreprocessorSymbolTable preprocessorSymbolTable, AliasTransformationHandler transformationHandler)
 AliasedNode(Node aliasReference, Node aliasDefinition)
 AliasedTypeNode(Node typeReference, Node aliasDefinition, String aliasName)
public void process(Node externs, Node root)
public void hotSwapScript(Node root, Node originalRoot)
public void applyAlias()
public void applyAlias()
public void applyAlias()
 Collection<Node> getAliasDefinitionsInOrder()
private List<AliasUsage> getAliasUsages()
 List<Node> getScopeCalls()
 boolean hasErrors()
private boolean isCallToScopeMethod(Node n)
public void enterScope(NodeTraversal t)
public void exitScope(NodeTraversal t)
public final boolean shouldTraverse(NodeTraversal t, Node n, Node parent)
private SourcePosition<AliasTransformation> getSourceRegion(Node n)
private void report(NodeTraversal t, Node n, DiagnosticType error, String... arguments)
private void findAliases(NodeTraversal t)
private void findNamespaceShadows(NodeTraversal t)
private void renameNamespaceShadows(NodeTraversal t)
private void validateScopeCall(NodeTraversal t, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
private void fixTypeNode(Node typeNode)
String SCOPING_METHOD_NAME=Optional["goog.scope"]
AbstractCompiler compiler
PreprocessorSymbolTable preprocessorSymbolTable
AliasTransformationHandler transformationHandler
DiagnosticType GOOG_SCOPE_USED_IMPROPERLY=Optional[DiagnosticType.error("JSC_GOOG_SCOPE_USED_IMPROPERLY", "The call to goog.scope must be alone in a single statement.")]
DiagnosticType GOOG_SCOPE_HAS_BAD_PARAMETERS=Optional[DiagnosticType.error("JSC_GOOG_SCOPE_HAS_BAD_PARAMETERS", "The call to goog.scope must take only a single parameter.  It must" + " be an anonymous function that itself takes no parameters.")]
DiagnosticType GOOG_SCOPE_REFERENCES_THIS=Optional[DiagnosticType.error("JSC_GOOG_SCOPE_REFERENCES_THIS", "The body of a goog.scope function cannot reference 'this'.")]
DiagnosticType GOOG_SCOPE_USES_RETURN=Optional[DiagnosticType.error("JSC_GOOG_SCOPE_USES_RETURN", "The body of a goog.scope function cannot use 'return'.")]
DiagnosticType GOOG_SCOPE_USES_THROW=Optional[DiagnosticType.error("JSC_GOOG_SCOPE_USES_THROW", "The body of a goog.scope function cannot use 'throw'.")]
DiagnosticType GOOG_SCOPE_ALIAS_REDEFINED=Optional[DiagnosticType.error("JSC_GOOG_SCOPE_ALIAS_REDEFINED", "The alias {0} is assigned a value more than once.")]
DiagnosticType GOOG_SCOPE_NON_ALIAS_LOCAL=Optional[DiagnosticType.error("JSC_GOOG_SCOPE_NON_ALIAS_LOCAL", "The local variable {0} is in a goog.scope and is not an alias.")]
