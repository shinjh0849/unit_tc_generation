EnumElementType(JSTypeRegistry registry, JSType elementType, String name) { [EOL]     super(registry); [EOL]     this.primitiveType = elementType; [EOL]     this.primitiveObjectType = elementType.toObjectType(); [EOL]     this.name = name; [EOL] } <line_num>: 67,73
@Override [EOL] public PropertyMap getPropertyMap() { [EOL]     return primitiveObjectType == null ? PropertyMap.immutableEmptyMap() : primitiveObjectType.getPropertyMap(); [EOL] } <line_num>: 75,79
@Override [EOL] public EnumElementType toMaybeEnumElementType() { [EOL]     return this; [EOL] } <line_num>: 81,84
@Override [EOL] public boolean matchesNumberContext() { [EOL]     return primitiveType.matchesNumberContext(); [EOL] } <line_num>: 86,89
@Override [EOL] public boolean matchesStringContext() { [EOL]     return primitiveType.matchesStringContext(); [EOL] } <line_num>: 91,94
@Override [EOL] public boolean matchesObjectContext() { [EOL]     return primitiveType.matchesObjectContext(); [EOL] } <line_num>: 96,99
@Override [EOL] public boolean canBeCalled() { [EOL]     return primitiveType.canBeCalled(); [EOL] } <line_num>: 101,104
@Override [EOL] public boolean isObject() { [EOL]     return primitiveType.isObject(); [EOL] } <line_num>: 106,109
@Override [EOL] public TernaryValue testForEquality(JSType that) { [EOL]     return primitiveType.testForEquality(that); [EOL] } <line_num>: 111,114
@Override [EOL] public boolean isNullable() { [EOL]     return primitiveType.isNullable(); [EOL] } <line_num>: 122,125
@Override [EOL] public boolean isNominalType() { [EOL]     return hasReferenceName(); [EOL] } <line_num>: 127,130
@Override [EOL] public int hashCode() { [EOL]     if (hasReferenceName()) { [EOL]         return getReferenceName().hashCode(); [EOL]     } else { [EOL]         return super.hashCode(); [EOL]     } [EOL] } <line_num>: 136,143
@Override [EOL] String toStringHelper(boolean forAnnotations) { [EOL]     return forAnnotations ? primitiveType.toString() : (getReferenceName() + ".<" + primitiveType + ">"); [EOL] } <line_num>: 145,150
@Override [EOL] public String getReferenceName() { [EOL]     return name; [EOL] } <line_num>: 152,155
@Override [EOL] public boolean hasReferenceName() { [EOL]     return true; [EOL] } <line_num>: 157,160
@Override [EOL] public boolean isSubtype(JSType that) { [EOL]     if (JSType.isSubtypeHelper(this, that)) { [EOL]         return true; [EOL]     } else { [EOL]         return primitiveType.isSubtype(that); [EOL]     } [EOL] } <line_num>: 162,169
@Override [EOL] public <T> T visit(Visitor<T> visitor) { [EOL]     return visitor.caseEnumElementType(this); [EOL] } <line_num>: 171,174
@Override [EOL] <T> T visit(RelationshipVisitor<T> visitor, JSType that) { [EOL]     return visitor.caseEnumElementType(this, that); [EOL] } <line_num>: 176,178
@Override [EOL] boolean defineProperty(String propertyName, JSType type, boolean inferred, Node propertyNode) { [EOL]     return true; [EOL] } <line_num>: 180,185
@Override [EOL] public ObjectType getImplicitPrototype() { [EOL]     return null; [EOL] } <line_num>: 187,190
@Override [EOL] public JSType findPropertyType(String propertyName) { [EOL]     return primitiveType.findPropertyType(propertyName); [EOL] } <line_num>: 192,195
@Override [EOL] public FunctionType getConstructor() { [EOL]     return primitiveObjectType == null ? null : primitiveObjectType.getConstructor(); [EOL] } <line_num>: 197,201
@Override [EOL] public JSType autoboxesTo() { [EOL]     return primitiveType.autoboxesTo(); [EOL] } <line_num>: 203,206
public JSType getPrimitiveType() { [EOL]     return primitiveType; [EOL] } <line_num>: 211,213
JSType meet(JSType that) { [EOL]     JSType meetPrimitive = primitiveType.getGreatestSubtype(that); [EOL]     if (meetPrimitive.isEmptyType()) { [EOL]         return null; [EOL]     } else { [EOL]         return new EnumElementType(registry, meetPrimitive, name); [EOL]     } [EOL] } <line_num>: 231,238
@Override [EOL] JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { [EOL]     primitiveType = primitiveType.resolve(t, scope); [EOL]     primitiveObjectType = ObjectType.cast(primitiveType); [EOL]     return this; [EOL] } <line_num>: 240,245
