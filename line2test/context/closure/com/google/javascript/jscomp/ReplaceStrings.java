 Config(String name, int parameter)
 Result(String original, String replacement)
 Location(String sourceFile, int line, int column)
 ReplaceStrings(AbstractCompiler compiler, String placeholderToken, List<String> functionsToInspect, Set<String> blacklisted, VariableMap previousMappings)
 void addLocation(Node n)
private void initMapping(VariableMap previousVarMap, Set<String> reservedNames)
public boolean apply(Result result)
 List<Result> getResult()
 VariableMap getStringMap()
public void process(Node externs, Node root)
public void visit(NodeTraversal t, Node n, Node parent)
private Config findMatching(String name)
private Config findMatchingClass(JSType callClassType, Collection<String> declarationNames)
private void doSubstitutions(NodeTraversal t, Config config, Node n)
private Node replaceExpression(NodeTraversal t, Node expr, Node parent)
private String getReplacement(String key)
private void recordReplacement(Node n, String key, String replacement)
private Node buildReplacement(Node expr, Node prefix, StringBuilder keyBuilder)
private String getMethodFromDeclarationName(String fullDeclarationName)
private String getClassFromDeclarationName(String fullDeclarationName)
private void parseConfiguration(List<String> functionsToInspect)
private Config parseConfiguration(String function)
private static NameGenerator createNameGenerator(Iterable<String> reserved)
DiagnosticType BAD_REPLACEMENT_CONFIGURATION=Optional[DiagnosticType.warning("JSC_BAD_REPLACEMENT_CONFIGURATION", "Bad replacement configuration.")]
String DEFAULT_PLACEHOLDER_TOKEN=Optional["`"]
String placeholderToken
String REPLACE_ONE_MARKER=Optional["?"]
String REPLACE_ALL_MARKER=Optional["*"]
AbstractCompiler compiler
JSTypeRegistry registry
Map<String, Config> functions=Optional[Maps.newHashMap()]
Multimap<String, String> methods=Optional[HashMultimap.create()]
NameGenerator nameGenerator
Map<String, Result> results=Optional[Maps.newLinkedHashMap()]
Predicate<Result> USED_RESULTS=Optional[new Predicate<Result>() {

    @Override
    public boolean apply(Result result) {
        // The list of locations may be empty if the map
        // was pre-populated from a previous map.
        return !result.replacementLocations.isEmpty();
    }
}]
