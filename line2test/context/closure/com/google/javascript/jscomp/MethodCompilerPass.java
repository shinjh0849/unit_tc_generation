 MethodCompilerPass(AbstractCompiler compiler)
public void reset()
public void addSignature(String functionName, Node functionNode, String sourceFile)
public void removeSignature(String functionName)
public void process(Node externs, Node root)
 abstract Callback getActingCallback()
 abstract SignatureStore getSignatureStore()
private void addPossibleSignature(String name, Node node, NodeTraversal t)
private void addSignature(String name, Node function, String fnSourceName)
public void visit(NodeTraversal t, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
private void processPrototypeParent(NodeTraversal t, Node n)
Set<String> externMethods=Optional[Sets.newHashSet()]
Set<String> externMethodsWithoutSignatures=Optional[Sets.newHashSet()]
Set<String> nonMethodProperties=Optional[Sets.newHashSet()]
Multimap<String, Node> methodDefinitions=Optional[LinkedHashMultimap.create()]
AbstractCompiler compiler
