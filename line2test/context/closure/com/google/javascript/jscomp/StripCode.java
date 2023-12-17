 StripCode(AbstractCompiler compiler, Set<String> stripTypes, Set<String> stripNameSuffixes, Set<String> stripTypePrefixes, Set<String> stripNamePrefixes)
public void enableTweakStripping()
public void process(Node externs, Node root)
public void visit(NodeTraversal t, Node n, Node parent)
 void removeVarDeclarationsByNameOrRvalue(NodeTraversal t, Node n, Node parent)
 void maybeRemoveReferenceToRemovedVariable(NodeTraversal t, Node n, Node parent)
 void replaceHighestNestedCallWithNull(Node node, Node parent)
 void maybeEliminateAssignmentByLvalueName(NodeTraversal t, Node n, Node parent)
 void maybeEliminateExpressionByName(NodeTraversal t, Node n, Node parent)
 void maybeRemoveCall(NodeTraversal t, Node n, Node parent)
 void eliminateKeysWithStripNamesFromObjLit(NodeTraversal t, Node n)
 boolean isCallWhoseReturnValueShouldBeStripped(@Nullable Node n)
 boolean qualifiedNameBeginsWithStripType(Node n)
 boolean qualifiedNameBeginsWithStripType(String name)
 boolean isReferenceToRemovedVar(NodeTraversal t, Node n)
 boolean isMethodOrCtorCallThatTriggersRemoval(NodeTraversal t, Node n, Node parent)
 boolean nameEndsWithFieldNameToStrip(@Nullable Node n)
private boolean actsOnStripType(NodeTraversal t, Node callNode)
 boolean isStripName(String name)
 void replaceWithNull(Node n, Node parent)
 void replaceWithEmpty(Node n, Node parent)
AbstractCompiler compiler
Set<String> stripTypes
Set<String> stripNameSuffixes
Set<String> stripTypePrefixes
Set<String> stripNamePrefixes
Set<Scope.Var> varsToRemove
DiagnosticType STRIP_TYPE_INHERIT_ERROR=Optional[DiagnosticType.error("JSC_STRIP_TYPE_INHERIT_ERROR", "Non-strip type {0} cannot inherit from strip type {1}")]
DiagnosticType STRIP_ASSIGNMENT_ERROR=Optional[DiagnosticType.error("JSC_STRIP_ASSIGNMENT_ERROR", "Unable to strip assignment to {0}")]
