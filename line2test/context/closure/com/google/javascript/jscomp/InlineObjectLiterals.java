 InlineObjectLiterals(AbstractCompiler compiler, Supplier<String> safeNameIdSupplier)
public void process(Node externs, Node root)
public void afterExitScope(NodeTraversal t, ReferenceMap referenceMap)
public void visit(Node node)
private void blacklistVarReferencesInTree(Node root, final Scope scope)
private boolean isVarInlineForbidden(Var var)
private boolean isInlinableObject(List<Reference> refs)
private boolean isVarOrAssignExprLhs(Node n)
private Map<String, String> computeVarList(Var v, ReferenceCollection referenceInfo)
private void fillInitialValues(Reference init, Map<String, Node> initvals)
private void replaceAssignmentExpression(Var v, Reference ref, Map<String, String> varmap)
private void splitObject(Var v, Reference declaration, Reference init, ReferenceCollection referenceInfo)
String VAR_PREFIX=Optional["JSCompiler_object_inline_"]
AbstractCompiler compiler
Supplier<String> safeNameIdSupplier
