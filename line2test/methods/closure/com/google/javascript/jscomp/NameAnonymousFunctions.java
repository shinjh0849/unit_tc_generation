NameAnonymousFunctions(AbstractCompiler compiler) { [EOL]     this.compiler = compiler; [EOL] } <line_num>: 47,49
AnonymousFunctionNamer() { [EOL]     this.nameExtractor = new NodeNameExtractor(DELIMITER); [EOL] } <line_num>: 70,72
@Override [EOL] public void process(Node externs, Node root) { [EOL]     AnonymousFunctionNamingCallback namingCallback = new AnonymousFunctionNamingCallback(new AnonymousFunctionNamer()); [EOL]     NodeTraversal.traverse(compiler, root, namingCallback); [EOL]     logger.fine("Named " + namedCount + " anon functions using " + bytesUsed + " bytes"); [EOL] } <line_num>: 51,58
private String getLikelyNonConflictingName(String name) { [EOL]     return DELIMITER + name + DELIMITER; [EOL] } <line_num>: 78,80
@Override [EOL] public final String getName(Node node) { [EOL]     return nameExtractor.getName(node); [EOL] } <line_num>: 82,85
@Override [EOL] public final void setFunctionName(String name, Node fnNode) { [EOL]     Node fnNameNode = fnNode.getFirstChild(); [EOL]     String uniqueName = getLikelyNonConflictingName(name); [EOL]     fnNameNode.setString(uniqueName); [EOL]     compiler.reportCodeChange(); [EOL]     namedCount++; [EOL]     bytesUsed += uniqueName.length(); [EOL] } <line_num>: 87,95
@Override [EOL] public final String getCombinedName(String lhs, String rhs) { [EOL]     return lhs + DELIMITER + rhs; [EOL] } <line_num>: 97,100
