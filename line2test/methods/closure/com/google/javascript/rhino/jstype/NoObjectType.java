NoObjectType(JSTypeRegistry registry) { [EOL]     super(registry, null, null, registry.createArrowType(null, null), null, null, true, true); [EOL]     getInternalArrowType().returnType = this; [EOL]     this.setInstanceType(this); [EOL] } <line_num>: 66,72
@Override [EOL] public boolean isSubtype(JSType that) { [EOL]     if (JSType.isSubtypeHelper(this, that)) { [EOL]         return true; [EOL]     } else { [EOL]         return that.isObject() && !that.isNoType() && !that.isNoResolvedType(); [EOL]     } [EOL] } <line_num>: 74,81
@Override [EOL] public FunctionType toMaybeFunctionType() { [EOL]     return null; [EOL] } <line_num>: 83,86
@Override [EOL] public boolean isNoObjectType() { [EOL]     return true; [EOL] } <line_num>: 88,91
@Override [EOL] public ObjectType getImplicitPrototype() { [EOL]     return null; [EOL] } <line_num>: 93,96
@Override [EOL] public String getReferenceName() { [EOL]     return null; [EOL] } <line_num>: 98,101
@Override [EOL] public boolean matchesNumberContext() { [EOL]     return true; [EOL] } <line_num>: 103,106
@Override [EOL] public boolean matchesObjectContext() { [EOL]     return true; [EOL] } <line_num>: 108,111
@Override [EOL] public boolean matchesStringContext() { [EOL]     return true; [EOL] } <line_num>: 113,116
@Override [EOL] public int hashCode() { [EOL]     return System.identityHashCode(this); [EOL] } <line_num>: 118,121
@Override [EOL] boolean defineProperty(String propertyName, JSType type, boolean inferred, Node propertyNode) { [EOL]     return true; [EOL] } <line_num>: 123,128
@Override [EOL] public boolean removeProperty(String name) { [EOL]     return false; [EOL] } <line_num>: 130,133
@Override [EOL] public void setPropertyJSDocInfo(String propertyName, JSDocInfo info) { [EOL] } <line_num>: 135,138
@Override [EOL] public <T> T visit(Visitor<T> visitor) { [EOL]     return visitor.caseNoObjectType(); [EOL] } <line_num>: 140,143
@Override [EOL] <T> T visit(RelationshipVisitor<T> visitor, JSType that) { [EOL]     return visitor.caseNoObjectType(that); [EOL] } <line_num>: 145,147
@Override [EOL] String toStringHelper(boolean forAnnotations) { [EOL]     return forAnnotations ? "?" : "NoObject"; [EOL] } <line_num>: 149,152
@Override [EOL] public FunctionType getConstructor() { [EOL]     return null; [EOL] } <line_num>: 154,157
@Override [EOL] JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { [EOL]     return this; [EOL] } <line_num>: 159,162
