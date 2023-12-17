 RuntimeTypeCheck(AbstractCompiler compiler, @Nullable String logFunction)
private AddMarkers(AbstractCompiler compiler)
private AddChecks()
public int compare(JSType t1, JSType t2)
private String getName(JSType type)
public void process(Node externs, Node root)
public void visit(NodeTraversal t, Node n, Node parent)
private void visitFunction(NodeTraversal t, Node n)
private Node addMarker(FunctionType funType, Node nodeToInsertAfter, @Nullable ObjectType interfaceType)
private Node findNodeToInsertAfter(Node n)
private Node findEnclosingConstructorDeclaration(Node n)
private boolean isClassDefiningCall(Node next)
public void visit(NodeTraversal t, Node n, Node parent)
private void visitFunction(NodeTraversal t, Node n)
private void visitReturn(NodeTraversal t, Node n)
private Node createCheckTypeCallNode(JSType type, Node expr)
private Node createCheckerNode(JSType type)
private void addBoilerplateCode()
private Node jsCode(String prop)
Comparator<JSType> ALPHA=Optional[new Comparator<JSType>() {

    @Override
    public int compare(JSType t1, JSType t2) {
        return getName(t1).compareTo(getName(t2));
    }

    private String getName(JSType type) {
        if (type.isInstanceType()) {
            return ((ObjectType) type).getReferenceName();
        } else if (type.isNullType() || type.isBooleanValueType() || type.isNumberValueType() || type.isStringValueType() || type.isVoidType()) {
            return type.toString();
        } else {
            // Type unchecked at runtime, so we don't care about the sorting order.
            return "";
        }
    }
}]
AbstractCompiler compiler
String logFunction
