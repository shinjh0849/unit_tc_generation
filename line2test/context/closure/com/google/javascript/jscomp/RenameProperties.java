 RenameProperties(AbstractCompiler compiler, boolean affinity, boolean generatePseudoNames)
 RenameProperties(AbstractCompiler compiler, boolean affinity, boolean generatePseudoNames, VariableMap prevUsedPropertyMap)
 RenameProperties(AbstractCompiler compiler, boolean affinity, boolean generatePseudoNames, VariableMap prevUsedPropertyMap, @Nullable char[] reservedCharacters)
 Property(String name)
private PropertyAffinity(int affinity)
public int compare(Property p1, Property p2)
public void process(Node externs, Node root)
private void reusePropertyNames(Set<String> reservedNames, Collection<Property> allProps)
private void computeAffinityScores()
private void generateNames(Set<Property> props, Set<String> reservedNames)
 VariableMap getPropertyMap()
public void visit(NodeTraversal t, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
private void maybeMarkCandidate(Node n)
private void countCallCandidates(NodeTraversal t, Node callNode)
private void countPropertyOccurrence(String name)
public void enterScope(NodeTraversal t)
public void exitScope(NodeTraversal t)
private void increase()
AbstractCompiler compiler
boolean generatePseudoNames
VariableMap prevUsedPropertyMap
List<Node> stringNodesToRename=Optional[new ArrayList<Node>()]
Map<Node, Node> callNodeToParentMap=Optional[new HashMap<Node, Node>()]
char[] reservedCharacters
Map<String, Property> propertyMap=Optional[new HashMap<String, Property>()]
UndiGraph<Property, PropertyAffinity> affinityGraph
Set<String> externedNames=Optional[new HashSet<String>(Arrays.asList("prototype"))]
Set<String> quotedNames=Optional[new HashSet<String>()]
Comparator<Property> FREQUENCY_COMPARATOR=Optional[new Comparator<Property>() {

    @Override
    public int compare(Property p1, Property p2) {
        /**
         * First a frequently used names would always be picked first.
         */
        if (p1.numOccurrences != p2.numOccurrences) {
            return p2.numOccurrences - p1.numOccurrences;
            /**
             * If both properties are used equally frequent. We'll let the property
             * with a high affinity score get a name first.
             *
             * see #computeAffinityScores() for how the score is computed.
             */
        } else if (p1.affinityScore != p2.affinityScore) {
            return p2.affinityScore - p1.affinityScore;
        }
        /**
         * Finally, for determinism, we compare them based on the old name.
         */
        return p1.oldName.compareTo(p2.oldName);
    }
}]
String RENAME_PROPERTY_FUNCTION_NAME=Optional["JSCompiler_renameProperty"]
DiagnosticType BAD_CALL=Optional[DiagnosticType.error("JSC_BAD_RENAME_PROPERTY_FUNCTION_NAME_CALL", "Bad " + RENAME_PROPERTY_FUNCTION_NAME + " call - " + "argument must be a string literal")]
DiagnosticType BAD_ARG=Optional[DiagnosticType.error("JSC_BAD_RENAME_PROPERTY_FUNCTION_NAME_ARG", "Bad " + RENAME_PROPERTY_FUNCTION_NAME + " argument - " + "'{0}' is not a valid JavaScript identifier")]
