 Assignment(String name)
 RenameVars(AbstractCompiler compiler, String prefix, boolean localRenamingOnly, boolean preserveFunctionExpressionNames, boolean generatePseudoNames, boolean shouldShadow, VariableMap prevUsedRenameMap, @Nullable char[] reservedCharacters, @Nullable Set<String> reservedNames)
 ProcessVars(boolean isExterns)
 void setNewName(String newName)
public void enterScope(NodeTraversal t)
public void exitScope(NodeTraversal t)
public void visit(NodeTraversal t, Node n, Node parent)
 void incCount(String name)
public int compare(Assignment a1, Assignment a2)
public int compare(Assignment a1, Assignment a2)
public void process(Node externs, Node root)
private String getNewGlobalName(Node n)
private String getNewLocalName(Node n)
private void recordPseudoName(Node n)
private void reusePreviouslyUsedVariableMap()
private void assignNames(Set<Assignment> varsToRename)
private void finalizeNameAssignment(Assignment a, String newName)
 VariableMap getVariableMap()
private boolean okToRenameVar(String name, boolean isLocal)
private int getLocalVarIndex(Var v)
AbstractCompiler compiler
ArrayList<Node> globalNameNodes=Optional[new ArrayList<Node>()]
ArrayList<Node> localNameNodes=Optional[new ArrayList<Node>()]
Map<Node, String> pseudoNameMap
Set<String> externNames=Optional[new HashSet<String>()]
Set<String> reservedNames
Map<String, String> renameMap=Optional[new HashMap<String, String>()]
VariableMap prevUsedRenameMap
String prefix
int assignmentCount=Optional[0]
StringBuilder assignmentLog
Set<Var> localBleedingFunctions=Optional[Sets.newHashSet()]
ArrayListMultimap<Scope, Var> localBleedingFunctionsPerScope=Optional[ArrayListMultimap.create()]
Map<String, Assignment> assignments=Optional[new HashMap<String, Assignment>()]
boolean localRenamingOnly
boolean preserveFunctionExpressionNames
boolean shouldShadow
char[] reservedCharacters
String LOCAL_VAR_PREFIX=Optional["L "]
Comparator<Assignment> FREQUENCY_COMPARATOR=Optional[new Comparator<Assignment>() {

    @Override
    public int compare(Assignment a1, Assignment a2) {
        if (a1.count != a2.count) {
            return a2.count - a1.count;
        }
        // Break a tie using the order in which the variable first appears in
        // the source.
        return ORDER_OF_OCCURRENCE_COMPARATOR.compare(a1, a2);
    }
}]
Comparator<Assignment> ORDER_OF_OCCURRENCE_COMPARATOR=Optional[new Comparator<Assignment>() {

    @Override
    public int compare(Assignment a1, Assignment a2) {
        return a1.orderOfOccurrence - a2.orderOfOccurrence;
    }
}]
