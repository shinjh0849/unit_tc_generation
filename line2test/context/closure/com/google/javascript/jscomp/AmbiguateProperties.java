 AmbiguateProperties(AbstractCompiler compiler, char[] reservedCharacters)
 PropertyGraph(Collection<Property> props)
 PropertyGraphNode(Property property)
 Property(String name)
private JSTypeBitSet(int size)
private JSTypeBitSet()
public int compare(Property p1, Property p2)
private void addInvalidatingType(JSType type)
 Map<String, String> getRenamingMap()
private int getIntForType(JSType type)
public void process(Node externs, Node root)
private BitSet getRelatedTypesOnNonUnion(JSType type)
private void computeRelatedTypes(JSType type)
private void addRelatedInstance(FunctionType constructor, JSTypeBitSet related)
public List<GraphNode<Property, Void>> getNodes()
public GraphNode<Property, Void> getNode(Property property)
public SubGraph<Property, Void> newSubGraph()
public void clearNodeAnnotations()
public int getWeight(Property value)
public boolean isIndependentOf(Property prop)
public void addNode(Property prop)
public Property getValue()
public A getAnnotation()
public void setAnnotation(Annotation data)
public void visit(NodeTraversal t, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
private void maybeMarkCandidate(Node n, JSType type, NodeTraversal t)
private Property recordProperty(String name, JSType type)
private boolean isInvalidatingType(JSType type)
private Property getProperty(String name)
private JSType getJSType(Node n)
 void addType(JSType newType)
private void addNonUnionType(JSType newType)
public String toString()
Logger logger=Optional[Logger.getLogger(AmbiguateProperties.class.getName())]
AbstractCompiler compiler
List<Node> stringNodesToRename=Optional[Lists.newArrayList()]
char[] reservedCharacters
Map<String, Property> propertyMap=Optional[Maps.newHashMap()]
Set<String> externedNames=Optional[Sets.newHashSet()]
Set<String> quotedNames=Optional[Sets.newHashSet()]
Map<String, String> renamingMap=Optional[Maps.newHashMap()]
Comparator<Property> FREQUENCY_COMPARATOR=Optional[new Comparator<Property>() {

    @Override
    public int compare(Property p1, Property p2) {
        if (p1.numOccurrences != p2.numOccurrences) {
            return p2.numOccurrences - p1.numOccurrences;
        }
        return p1.oldName.compareTo(p2.oldName);
    }
}]
BiMap<JSType, Integer> intForType=Optional[HashBiMap.create()]
Map<JSType, JSTypeBitSet> relatedBitsets=Optional[Maps.newHashMap()]
Set<JSType> invalidatingTypes
String SKIP_PREFIX=Optional["JSAbstractCompiler"]
