 Export(String symbolName, Node value)
public SymbolExport(String symbolName, Node value)
public PropertyExport(String exportPath, String symbolName, Node value)
 ExternExportsPass(AbstractCompiler compiler)
 void generateExterns()
 abstract String getExportedPath()
 void appendExtern(String path, Node valueToExport)
private List<String> computePathPrefixes(String path)
private void appendPathDefinition(String path, Node initializer)
private Node createExternFunction(Node exportedFunction)
private Node createExternObjectLit(Node exportedObjectLit)
private void checkForFunctionsWithUnknownTypes(Node function)
private void reportUnknownParameterType(Node function, Node parameter)
private void reportUnknownReturnType(Node function)
protected Node getValue(Node qualifiedNameNode)
 String getExportedPath()
 String getExportedPath()
private void initExportMethods()
public int compare(Export e1, Export e2)
public void process(Node externs, Node root)
public String getGeneratedExterns()
public void visit(NodeTraversal t, Node n, Node parent)
private void handleSymbolExport(Node parent)
private void handlePropertyExport(Node parent)
DiagnosticType EXPORTED_FUNCTION_UNKNOWN_PARAMETER_TYPE=Optional[DiagnosticType.warning("JSC_EXPORTED_FUNCTION_UNKNOWN_PARAMETER_TYPE", "Unable to determine type of parameter {0} for exported function {1}")]
DiagnosticType EXPORTED_FUNCTION_UNKNOWN_RETURN_TYPE=Optional[DiagnosticType.warning("JSC_EXPORTED_FUNCTION_UNKNOWN_RETURN_TYPE", "Unable to determine return type for exported function {0}")]
List<Export> exports
Map<String, Node> definitionMap
AbstractCompiler compiler
Node externsRoot
Map<String, String> mappedPaths
Set<String> alreadyExportedPaths
List<String> exportSymbolFunctionNames
List<String> exportPropertyFunctionNames
