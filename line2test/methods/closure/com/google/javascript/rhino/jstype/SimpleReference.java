public SimpleReference(T symbol, Node node) { [EOL]     this.symbol = symbol; [EOL]     this.node = node; [EOL] } <line_num>: 53,56
@Override [EOL] final public T getSymbol() { [EOL]     return symbol; [EOL] } <line_num>: 58,61
@Override [EOL] final public Node getNode() { [EOL]     return node; [EOL] } <line_num>: 63,66
@Override [EOL] final public StaticSourceFile getSourceFile() { [EOL]     return node.getStaticSourceFile(); [EOL] } <line_num>: 68,71
@Override [EOL] public String toString() { [EOL]     String sourceName = node == null ? null : node.getSourceFileName(); [EOL]     int lineNo = node == null ? -1 : node.getLineno(); [EOL]     return node.getQualifiedName() + "@" + sourceName + ":" + lineNo; [EOL] } <line_num>: 73,78
