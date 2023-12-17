Property(String name, JSType type, boolean inferred, Node propertyNode) { [EOL]     this.name = name; [EOL]     this.type = type; [EOL]     this.inferred = inferred; [EOL]     this.propertyNode = propertyNode; [EOL] } <line_num>: 79,85
@Override [EOL] public String getName() { [EOL]     return name; [EOL] } <line_num>: 87,90
@Override [EOL] public Node getNode() { [EOL]     return propertyNode; [EOL] } <line_num>: 92,95
@Override [EOL] public StaticSourceFile getSourceFile() { [EOL]     return propertyNode == null ? null : propertyNode.getStaticSourceFile(); [EOL] } <line_num>: 97,100
@Override [EOL] public Property getSymbol() { [EOL]     return this; [EOL] } <line_num>: 102,105
@Override [EOL] public Property getDeclaration() { [EOL]     return propertyNode == null ? null : this; [EOL] } <line_num>: 107,110
@Override [EOL] public JSType getType() { [EOL]     return type; [EOL] } <line_num>: 112,115
@Override [EOL] public boolean isTypeInferred() { [EOL]     return inferred; [EOL] } <line_num>: 117,120
boolean isFromExterns() { [EOL]     return propertyNode == null ? false : propertyNode.isFromExterns(); [EOL] } <line_num>: 122,124
void setType(JSType type) { [EOL]     this.type = type; [EOL] } <line_num>: 126,128
@Override [EOL] public JSDocInfo getJSDocInfo() { [EOL]     return this.docInfo; [EOL] } <line_num>: 130,132
void setJSDocInfo(JSDocInfo info) { [EOL]     this.docInfo = info; [EOL] } <line_num>: 134,136
public void setNode(Node n) { [EOL]     this.propertyNode = n; [EOL] } <line_num>: 138,140
