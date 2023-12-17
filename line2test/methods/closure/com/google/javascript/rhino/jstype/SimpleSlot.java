public SimpleSlot(String name, JSType type, boolean inferred) { [EOL]     this.name = name; [EOL]     this.type = type; [EOL]     this.inferred = inferred; [EOL] } <line_num>: 58,62
@Override [EOL] public String getName() { [EOL]     return name; [EOL] } <line_num>: 64,67
@Override [EOL] public JSType getType() { [EOL]     return type; [EOL] } <line_num>: 69,72
@Override [EOL] public boolean isTypeInferred() { [EOL]     return inferred; [EOL] } <line_num>: 74,77
@Override [EOL] public StaticReference<JSType> getDeclaration() { [EOL]     return null; [EOL] } <line_num>: 79,82
@Override [EOL] public JSDocInfo getJSDocInfo() { [EOL]     return null; [EOL] } <line_num>: 84,87
