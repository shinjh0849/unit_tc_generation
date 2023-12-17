public FindExportableNodes(AbstractCompiler compiler)
public GenerateNodeContext(Node node, Node scriptNode, Node contextNode)
public void visit(NodeTraversal t, Node n, Node parent)
public LinkedHashMap<String, GenerateNodeContext> getExports()
public Node getNode()
public Node getScriptNode()
public Node getContextNode()
DiagnosticType NON_GLOBAL_ERROR=Optional[DiagnosticType.error("JSC_NON_GLOBAL_ERROR", "@export only applies to symbols/properties defined in the " + "global scope.")]
LinkedHashMap<String, GenerateNodeContext> exports
AbstractCompiler compiler
