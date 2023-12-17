 CollapseProperties(AbstractCompiler compiler, boolean collapsePropertiesOnExternTypes, boolean inlineAliases)
public void process(Node externs, Node root)
private void inlineAliases(GlobalNamespace namespace)
private boolean inlineAliasIfPossible(Ref alias, GlobalNamespace namespace)
private void checkNamespaces()
private void warnAboutNamespaceAliasing(Name nameObj, Ref ref)
private void warnAboutNamespaceRedefinition(Name nameObj, Ref ref)
private void flattenReferencesToCollapsibleDescendantNames(Name n, String alias)
private void flattenSimpleStubDeclaration(Name name, String alias)
private void flattenReferencesTo(Name n, String alias)
private void flattenPrefixes(String alias, Name n, int depth)
private void flattenNameRefAtDepth(String alias, Node n, int depth, String originalName)
private void flattenNameRef(String alias, Node n, Node parent, String originalName)
private void collapseDeclarationOfNameAndDescendants(Name n, String alias)
private void updateSimpleDeclaration(String alias, Name refName, Ref ref)
private void updateObjLitOrFunctionDeclaration(Name n, String alias, boolean canCollapseChildNames)
private void updateObjLitOrFunctionDeclarationAtAssignNode(Name n, String alias, boolean canCollapseChildNames)
public void visit(NodeTraversal t, Node n, Node parent)
private void checkForHosedThisReferences(Node function, JSDocInfo docInfo, final Name name)
private void updateObjLitOrFunctionDeclarationAtVarNode(Name n, boolean canCollapseChildNames)
private void updateFunctionDeclarationAtFunctionNode(Name n, boolean canCollapseChildNames)
private int declareVarsForObjLitValues(Name objlitName, String alias, Node objlit, Node varNode, Node nameToAddAfter, Node varParent)
private int addStubsForUndeclaredProperties(Name n, String alias, Node parent, Node addAfter)
private static String appendPropForAlias(String root, String prop)
DiagnosticType UNSAFE_NAMESPACE_WARNING=Optional[DiagnosticType.warning("JSC_UNSAFE_NAMESPACE", "incomplete alias created for namespace {0}")]
DiagnosticType NAMESPACE_REDEFINED_WARNING=Optional[DiagnosticType.warning("JSC_NAMESPACE_REDEFINED", "namespace {0} should not be redefined")]
DiagnosticType UNSAFE_THIS=Optional[DiagnosticType.warning("JSC_UNSAFE_THIS", "dangerous use of 'this' in static method {0}")]
AbstractCompiler compiler
List<Name> globalNames
Map<String, Name> nameMap
boolean collapsePropertiesOnExternTypes
boolean inlineAliases
