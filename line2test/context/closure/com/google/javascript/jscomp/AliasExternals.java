 AliasExternals(AbstractCompiler compiler, JSModuleGraph moduleGraph)
 AliasExternals(AbstractCompiler compiler, JSModuleGraph moduleGraph, @Nullable String unaliasableGlobals, @Nullable String aliasableGlobals)
public GetAliasableNames(final Set<String> whitelist)
private Symbol(String name, boolean isConstant)
public void setRequiredUsage(int usage)
public void process(Node externs, Node root)
private void aliasProperties(Node externs, Node root)
private void replaceAccessor(Node getPropNode)
private void replaceMutator(Node getPropNode)
private void replaceNode(Node parent, Node before, Node after)
private void addAccessorPropName(String propName, Node root)
private void addMutatorFunction(String propName, Node root)
private Node getAddingRoot(JSModule m)
public void visit(NodeTraversal t, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
private boolean canReplaceWithGetProp(Node propNameNode, Node getPropNode, Node parent)
private boolean canReplaceWithSetProp(Node propNameNode, Node getPropNode, Node parent)
private static String getMutatorFor(String prop)
private static String getArrayNotationNameFor(String prop)
private void aliasGlobals(Node externs, Node root)
private void getGlobalName(NodeTraversal t, Node dest, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
private void replaceGlobalUse(Node globalUse)
private void addGlobalAliasNode(Symbol global, Node root)
private Symbol newSymbolForGlobalVar(Node name)
private Symbol newSymbolForProperty(String name)
 void recordAccessor(NodeTraversal t)
 void recordMutator(NodeTraversal t)
int DEFAULT_REQUIRED_USAGE=Optional[4]
int requiredUsage=Optional[DEFAULT_REQUIRED_USAGE]
int MIN_PROP_SIZE=Optional[4]
String PROTOTYPE_PROPERTY_NAME=Optional[getArrayNotationNameFor("prototype")]
Map<String, Symbol> props=Optional[Maps.newHashMap()]
List<Node> accessors=Optional[Lists.newArrayList()]
List<Node> mutators=Optional[Lists.newArrayList()]
Map<Node, Node> replacementMap=Optional[new IdentityHashMap<Node, Node>()]
Map<String, Symbol> globals=Optional[Maps.newHashMap()]
AbstractCompiler compiler
JSModuleGraph moduleGraph
Node defaultRoot
Map<JSModule, Node> moduleRoots
Set<String> unaliasableGlobals=Optional[Sets.newHashSet(// While "arguments" is declared as a global extern, it really only has
// meaning inside function bodies and should not be aliased at a global
// level.
"arguments", // Eval should not be aliased, per the ECMA-262 spec section 15.1.2.1
"eval", // "NodeFilter" is not defined in IE and throws an error if you try to
// do var foo = NodeFilter.
"NodeFilter", // Calls to this special function are eliminated by the RenameProperties
// compiler pass.
"JSCompiler_renameProperty")]
Set<String> aliasableGlobals=Optional[Sets.newHashSet()]
