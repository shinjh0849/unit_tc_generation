 AliasSet(String name1, String name2)
 JsNameRefNode(JsName name, Node node)
 PrototypeSetNode(JsName name, Node parent)
 SpecialReferenceNode(JsName name, Node node)
 ClassDefiningFunctionNode(JsName name, Node node)
 InstanceOfCheckNode(JsName name, Node node)
 FindReferences()
 NameAnalyzer(AbstractCompiler compiler, boolean removeUnreferenced)
public boolean traverseEdge(JsName from, RefType callSite, JsName to)
public String toString()
public int compareTo(JsName rhs)
 JsName name()
 void remove()
public JsName name()
public void remove()
public void remove()
public JsName name()
 Node getParent()
 Node getGramps()
public void remove()
public void remove()
public void visit(NodeTraversal t, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
private void recordConsumers(NodeTraversal t, Node n, Node recordNode)
private void recordAssignment(NodeTraversal t, Node n, Node recordNode)
private void recordDepScope(Node node, NameInformation name)
public void visit(NodeTraversal t, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
private void recordSet(String name, Node node)
private void recordPrototypeSet(String className, String prototypeProperty, Node node)
private void recordWriteOnProperties(String parentName)
public boolean apply(Node input)
private void addAllChildren(Node n)
private void addSimplifiedChildren(Node n)
private void addSimplifiedExpression(Node n, Node parent)
public boolean shouldTraverse(NodeTraversal t, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
private void maybeRecordReferenceOrAlias(NodeTraversal t, Node n, Node parent, NameInformation nameInfo, NameInformation referring)
private void recordAliases(List<NameInformation> referers)
private boolean maybeHiddenAlias(String name, Node n)
private boolean maybeRecordAlias(String name, Node parent, NameInformation referring, String referringName)
public boolean classDefiningCallsHaveSideEffects()
public void keepSubTree(Node original)
public void keepSimplifiedShortCircuitExpression(Node original)
public void keepSimplifiedHookExpression(Node hook, boolean thenHasSideEffects, boolean elseHasSideEffects)
public void nodeRemoved(Node n)
public void process(Node externs, Node root)
private void recordAlias(String fromName, String toName)
private void recordReference(String fromName, String toName, RefType depType)
 void removeUnreferenced()
 String getHtmlReport()
private void appendListItem(StringBuilder sb, String text)
private String nameLink(String name)
private String nameAnchor(String name)
private JsName getName(String name, boolean canCreate)
private void createName(String name)
private void referenceAliases()
private void referenceParentNames()
private NameInformation createNameInformation(NodeTraversal t, Node n)
private NameInformation createNameInformation(String name, Scope scope, Node rootNameNode)
private boolean isExternallyReferenceable(Scope scope, String name)
private List<NameInformation> getDependencyScope(Node n)
private List<NameInformation> getEnclosingFunctionDependencyScope(NodeTraversal t)
private void calculateReferences()
private int countOf(TriState isClass, TriState referenced)
private List<Node> getSideEffectNodes(Node n)
private void replaceWithRhs(Node parent, Node n)
private void replaceTopLevelExpressionWithRhs(Node parent, Node n)
private boolean valueConsumedByParent(Node n, Node parent)
private Node collapseReplacements(List<Node> replacements)
private List<Node> getRhsSubexpressions(Node n)
AbstractCompiler compiler
Map<String, JsName> allNames=Optional[Maps.newTreeMap()]
DiGraph<JsName, RefType> referenceGraph=Optional[LinkedDirectedGraph.createWithoutAnnotations()]
ListMultimap<Node, NameInformation> scopes=Optional[LinkedListMultimap.create()]
String PROTOTYPE_SUBSTRING=Optional[".prototype."]
int PROTOTYPE_SUBSTRING_LEN=Optional[PROTOTYPE_SUBSTRING.length()]
int PROTOTYPE_SUFFIX_LEN=Optional[".prototype".length()]
String WINDOW=Optional["window"]
String FUNCTION=Optional["Function"]
Set<String> DEFAULT_GLOBAL_NAMES=Optional[ImmutableSet.of("window", "goog.global")]
boolean removeUnreferenced
Set<String> globalNames
AstChangeProxy changeProxy
Set<String> externalNames=Optional[Sets.newHashSet()]
List<RefNode> refNodes=Optional[Lists.newArrayList()]
Map<String, AliasSet> aliases=Optional[Maps.newHashMap()]
Predicate<Node> NON_LOCAL_RESULT_PREDICATE=Optional[new Predicate<Node>() {

    @Override
    public boolean apply(Node input) {
        if (input.isCall()) {
            return false;
        }
        // TODO(johnlenz): handle NEW calls that record their 'this'
        // in global scope and effectively return an alias.
        // Other non-local references are handled by this pass.
        return true;
    }
}]
