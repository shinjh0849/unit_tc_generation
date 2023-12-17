 FunctionNames(AbstractCompiler compiler)
 FunctionRecord(int id, Node parent, String name)
 FunctionListExtractor(Map<Node, FunctionRecord> functionMap)
 FunctionExpressionNamer(Map<Node, FunctionRecord> functionMap)
public void process(Node externs, Node root)
public Iterable<Node> getFunctionNodeList()
public int getFunctionId(Node f)
public String getFunctionName(Node f)
public void visit(NodeTraversal t, Node n, Node parent)
public final String getName(Node node)
public final void setFunctionName(String name, Node fnNode)
public final String getCombinedName(String lhs, String rhs)
long serialVersionUID=Optional[1L]
AbstractCompiler compiler
Map<Node, FunctionRecord> functionMap=Optional[Maps.newLinkedHashMap()]
FunctionListExtractor functionListExtractor
