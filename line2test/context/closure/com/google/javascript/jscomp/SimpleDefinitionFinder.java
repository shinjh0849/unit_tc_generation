public SimpleDefinitionFinder(AbstractCompiler compiler)
 DefinitionGatheringCallback(boolean inExterns)
public Collection<DefinitionSite> getDefinitionSites()
private DefinitionSite getDefinitionAt(Node node)
 DefinitionSite getDefinitionForFunction(Node function)
public Collection<Definition> getDefinitionsReferencedAt(Node useSite)
public void process(Node externs, Node source)
 Collection<UseSite> getUseSites(Definition definition)
private static String getSimplifiedName(Node node)
public void visit(NodeTraversal traversal, Node node, Node parent)
private boolean jsdocContainsDeclarations(Node node)
public void visit(NodeTraversal traversal, Node node, Node parent)
 static boolean isCallOrNewSite(UseSite use)
 boolean canModifyDefinition(Definition definition)
private boolean isExported(Definition definition)
 static boolean isSimpleFunctionDeclaration(Node fn)
 static Node getNameNodeFromFunctionNode(Node function)
 void removeReferences(Node node)
AbstractCompiler compiler
Map<Node, DefinitionSite> definitionSiteMap
Multimap<String, Definition> nameDefinitionMultimap
Multimap<String, UseSite> nameUseSiteMultimap
