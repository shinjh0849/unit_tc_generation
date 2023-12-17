 Property(String name)
 RenamePrototypes(AbstractCompiler compiler, boolean aggressiveRenaming, @Nullable char[] reservedCharacters, @Nullable VariableMap prevUsedRenameMap)
 int count()
 boolean canRename()
private boolean canRenamePrototypeProperty()
private boolean canRenameObjLitProperty()
public int compare(Property a1, Property a2)
public void process(Node externs, Node root)
private void reusePrototypeNames(Set<Property> properties)
public void visit(NodeTraversal t, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
private void processPrototypeParent(Node n, CompilerInput input)
private void markPrototypePropertyCandidate(Node n, CompilerInput input)
private void markObjLitPropertyCandidate(Node n, CompilerInput input)
private void markPropertyAccessCandidate(Node n, CompilerInput input)
private Property getProperty(String name)
 VariableMap getPropertyMap()
AbstractCompiler compiler
boolean aggressiveRenaming
char[] reservedCharacters
VariableMap prevUsedRenameMap
Comparator<Property> FREQUENCY_COMPARATOR=Optional[new Comparator<Property>() {

    @Override
    public int compare(Property a1, Property a2) {
        int n1 = a1.count();
        int n2 = a2.count();
        if (n1 != n2) {
            return n2 - n1;
        }
        return a1.oldName.compareTo(a2.oldName);
    }
}]
Set<Node> stringNodes=Optional[new HashSet<Node>()]
Map<String, Property> properties=Optional[new HashMap<String, Property>()]
Set<String> reservedNames=Optional[new HashSet<String>(Arrays.asList("indexOf", "lastIndexOf", "toString", "valueOf"))]
Set<Node> prototypeObjLits=Optional[new HashSet<Node>()]
