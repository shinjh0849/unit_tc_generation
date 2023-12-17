private DotFormatter()
private DotFormatter(Node n, ControlFlowGraph<Node> cfg, Appendable builder, boolean printAnnotations) throws IOException
public static String toDot(Node n) throws IOException
 static String toDot(Node n, ControlFlowGraph<Node> inCFG, boolean printAnnotations) throws IOException
 static String toDot(Node n, ControlFlowGraph<Node> inCFG) throws IOException
 static void appendDot(Node n, ControlFlowGraph<Node> inCFG, Appendable builder) throws IOException
 static DotFormatter newInstanceForTesting()
private void traverseNodes(Node parent) throws IOException
 int key(Node n) throws IOException
private String name(Node n)
private String formatNodeName(Integer key)
private void formatPreamble() throws IOException
private void formatConclusion() throws IOException
public static String toDot(GraphvizGraph graph)
String INDENT=Optional["  "]
String ARROW=Optional[" -> "]
String LINE=Optional[" -- "]
HashMap<Node, Integer> assignments=Optional[new HashMap<Node, Integer>()]
int keyCount=Optional[0]
Appendable builder
ControlFlowGraph<Node> cfg
boolean printAnnotations
