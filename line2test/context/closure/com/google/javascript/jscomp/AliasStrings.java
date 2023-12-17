 AliasStrings(AbstractCompiler compiler, JSModuleGraph moduleGraph, Set<String> strings, String blacklistRegex, boolean outputStringUsage)
 StringOccurrence(Node node, Node parent)
 StringInfo(int id)
public void process(Node externs, Node root)
public void visit(NodeTraversal t, Node n, Node parent)
private StringInfo getOrCreateStringInfo(String string)
private static boolean isInThrowExpression(Node n)
private void replaceStringsWithAliases()
private void addAliasDeclarationNodes()
private static boolean shouldReplaceWithAlias(String str, StringInfo info)
private void replaceStringWithAliasName(StringOccurrence occurrence, String name, StringInfo info)
private void outputStringUsage()
 String getVariableName(String stringLiteral)
 String encodeStringAsIdentifier(String prefix, String s)
Logger logger=Optional[Logger.getLogger(AliasStrings.class.getName())]
String STRING_ALIAS_PREFIX=Optional["$$S_"]
AbstractCompiler compiler
JSModuleGraph moduleGraph
Matcher blacklist=Optional[null]
Set<String> aliasableStrings
boolean outputStringUsage
SortedMap<String, StringInfo> stringInfoMap=Optional[Maps.newTreeMap()]
Set<String> usedHashedAliases=Optional[new LinkedHashSet<String>()]
Map<JSModule, Node> moduleVarParentMap=Optional[new HashMap<JSModule, Node>()]
long unitTestHashReductionMask=Optional[~0L]
