TemplateType(JSTypeRegistry registry, String name) { [EOL]     super(registry, registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE)); [EOL]     this.name = name; [EOL] } <line_num>: 53,56
@Override [EOL] public String getReferenceName() { [EOL]     return name; [EOL] } <line_num>: 58,61
@Override [EOL] String toStringHelper(boolean forAnnotations) { [EOL]     return name; [EOL] } <line_num>: 63,66
@Override [EOL] public TemplateType toMaybeTemplateType() { [EOL]     return this; [EOL] } <line_num>: 68,71
@Override [EOL] public boolean hasAnyTemplateTypesInternal() { [EOL]     return true; [EOL] } <line_num>: 73,76
@Override [EOL] public <T> T visit(Visitor<T> visitor) { [EOL]     return visitor.caseTemplateType(this); [EOL] } <line_num>: 78,81
@Override [EOL] <T> T visit(RelationshipVisitor<T> visitor, JSType that) { [EOL]     return visitor.caseTemplateType(this, that); [EOL] } <line_num>: 83,85
