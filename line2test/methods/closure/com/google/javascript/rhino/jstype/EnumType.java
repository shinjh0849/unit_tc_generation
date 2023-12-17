EnumType(JSTypeRegistry registry, String name, Node source, JSType elementsType) { [EOL]     super(registry, "enum{" + name + "}", null); [EOL]     this.source = source; [EOL]     this.elementsType = new EnumElementType(registry, elementsType, name); [EOL] } <line_num>: 76,81
public Node getSource() { [EOL]     return source; [EOL] } <line_num>: 86,88
@Override [EOL] public EnumType toMaybeEnumType() { [EOL]     return this; [EOL] } <line_num>: 90,93
@Override [EOL] public ObjectType getImplicitPrototype() { [EOL]     return registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE); [EOL] } <line_num>: 95,98
public Set<String> getElements() { [EOL]     return Collections.unmodifiableSet(elements); [EOL] } <line_num>: 105,107
public boolean defineElement(String name, Node definingNode) { [EOL]     elements.add(name); [EOL]     return defineDeclaredProperty(name, elementsType, definingNode); [EOL] } <line_num>: 115,118
public EnumElementType getElementsType() { [EOL]     return elementsType; [EOL] } <line_num>: 123,125
@Override [EOL] public TernaryValue testForEquality(JSType that) { [EOL]     TernaryValue result = super.testForEquality(that); [EOL]     if (result != null) { [EOL]         return result; [EOL]     } [EOL]     return this.isEquivalentTo(that) ? TRUE : FALSE; [EOL] } <line_num>: 127,134
@Override [EOL] public boolean isSubtype(JSType that) { [EOL]     return that.isEquivalentTo(getNativeType(JSTypeNative.OBJECT_TYPE)) || that.isEquivalentTo(getNativeType(JSTypeNative.OBJECT_PROTOTYPE)) || JSType.isSubtypeHelper(this, that); [EOL] } <line_num>: 136,141
@Override [EOL] String toStringHelper(boolean forAnnotations) { [EOL]     return forAnnotations ? "Object" : getReferenceName(); [EOL] } <line_num>: 143,146
@Override [EOL] public String getDisplayName() { [EOL]     return elementsType.getDisplayName(); [EOL] } <line_num>: 148,151
@Override [EOL] public <T> T visit(Visitor<T> visitor) { [EOL]     return visitor.caseObjectType(this); [EOL] } <line_num>: 153,156
@Override [EOL] <T> T visit(RelationshipVisitor<T> visitor, JSType that) { [EOL]     return visitor.caseObjectType(this, that); [EOL] } <line_num>: 158,160
@Override [EOL] public FunctionType getConstructor() { [EOL]     return null; [EOL] } <line_num>: 162,165
@Override [EOL] public boolean matchesNumberContext() { [EOL]     return false; [EOL] } <line_num>: 167,170
@Override [EOL] public boolean matchesStringContext() { [EOL]     return true; [EOL] } <line_num>: 172,175
@Override [EOL] public boolean matchesObjectContext() { [EOL]     return true; [EOL] } <line_num>: 177,180
@Override [EOL] JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { [EOL]     elementsType = (EnumElementType) elementsType.resolve(t, scope); [EOL]     return super.resolveInternal(t, scope); [EOL] } <line_num>: 182,186
