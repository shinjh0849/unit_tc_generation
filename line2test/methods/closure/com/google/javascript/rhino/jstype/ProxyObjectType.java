ProxyObjectType(JSTypeRegistry registry, JSType referencedType) { [EOL]     super(registry); [EOL]     setReferencedType(referencedType); [EOL] } <line_num>: 61,64
@Override [EOL] PropertyMap getPropertyMap() { [EOL]     return referencedObjType == null ? PropertyMap.immutableEmptyMap() : referencedObjType.getPropertyMap(); [EOL] } <line_num>: 66,70
JSType getReferencedTypeInternal() { [EOL]     return referencedType; [EOL] } <line_num>: 72,74
ObjectType getReferencedObjTypeInternal() { [EOL]     return referencedObjType; [EOL] } <line_num>: 76,78
void setReferencedType(JSType referencedType) { [EOL]     this.referencedType = referencedType; [EOL]     if (referencedType instanceof ObjectType) { [EOL]         this.referencedObjType = (ObjectType) referencedType; [EOL]     } else { [EOL]         this.referencedObjType = null; [EOL]     } [EOL] } <line_num>: 80,87
@Override [EOL] public String getReferenceName() { [EOL]     return referencedObjType == null ? "" : referencedObjType.getReferenceName(); [EOL] } <line_num>: 89,93
@Override [EOL] public boolean hasReferenceName() { [EOL]     return referencedObjType == null ? null : referencedObjType.hasReferenceName(); [EOL] } <line_num>: 95,99
@Override [EOL] public boolean matchesNumberContext() { [EOL]     return referencedType.matchesNumberContext(); [EOL] } <line_num>: 101,104
@Override [EOL] public boolean matchesStringContext() { [EOL]     return referencedType.matchesStringContext(); [EOL] } <line_num>: 106,109
@Override [EOL] public boolean matchesObjectContext() { [EOL]     return referencedType.matchesObjectContext(); [EOL] } <line_num>: 111,114
@Override [EOL] public boolean canBeCalled() { [EOL]     return referencedType.canBeCalled(); [EOL] } <line_num>: 116,119
@Override [EOL] public boolean isNoType() { [EOL]     return referencedType.isNoType(); [EOL] } <line_num>: 121,124
@Override [EOL] public boolean isNoObjectType() { [EOL]     return referencedType.isNoObjectType(); [EOL] } <line_num>: 126,129
@Override [EOL] public boolean isNoResolvedType() { [EOL]     return referencedType.isNoResolvedType(); [EOL] } <line_num>: 131,134
@Override [EOL] public boolean isUnknownType() { [EOL]     return referencedType.isUnknownType(); [EOL] } <line_num>: 136,139
@Override [EOL] public boolean isCheckedUnknownType() { [EOL]     return referencedType.isCheckedUnknownType(); [EOL] } <line_num>: 141,144
@Override [EOL] public boolean isNullable() { [EOL]     return referencedType.isNullable(); [EOL] } <line_num>: 146,149
@Override [EOL] public EnumType toMaybeEnumType() { [EOL]     return referencedType.toMaybeEnumType(); [EOL] } <line_num>: 151,154
@Override [EOL] public boolean isConstructor() { [EOL]     return referencedType.isConstructor(); [EOL] } <line_num>: 156,159
@Override [EOL] public boolean isNominalType() { [EOL]     return referencedType.isNominalType(); [EOL] } <line_num>: 161,164
@Override [EOL] public boolean isInstanceType() { [EOL]     return referencedType.isInstanceType(); [EOL] } <line_num>: 166,169
@Override [EOL] public boolean isInterface() { [EOL]     return referencedType.isInterface(); [EOL] } <line_num>: 171,174
@Override [EOL] public boolean isOrdinaryFunction() { [EOL]     return referencedType.isOrdinaryFunction(); [EOL] } <line_num>: 176,179
@Override [EOL] public boolean isAllType() { [EOL]     return referencedType.isAllType(); [EOL] } <line_num>: 181,184
@Override [EOL] public boolean isStruct() { [EOL]     return referencedType.isStruct(); [EOL] } <line_num>: 186,189
@Override [EOL] public boolean isDict() { [EOL]     return referencedType.isDict(); [EOL] } <line_num>: 191,194
@Override [EOL] public boolean isNativeObjectType() { [EOL]     return referencedObjType == null ? false : referencedObjType.isNativeObjectType(); [EOL] } <line_num>: 196,200
@Override [EOL] RecordType toMaybeRecordType() { [EOL]     return referencedType.toMaybeRecordType(); [EOL] } <line_num>: 202,205
@Override [EOL] public UnionType toMaybeUnionType() { [EOL]     return referencedType.toMaybeUnionType(); [EOL] } <line_num>: 207,210
@Override [EOL] public FunctionType toMaybeFunctionType() { [EOL]     return referencedType.toMaybeFunctionType(); [EOL] } <line_num>: 212,215
@Override [EOL] public EnumElementType toMaybeEnumElementType() { [EOL]     return referencedType.toMaybeEnumElementType(); [EOL] } <line_num>: 217,220
@Override [EOL] public TernaryValue testForEquality(JSType that) { [EOL]     return referencedType.testForEquality(that); [EOL] } <line_num>: 222,225
@Override [EOL] public boolean isSubtype(JSType that) { [EOL]     return referencedType.isSubtype(that); [EOL] } <line_num>: 227,230
@Override [EOL] public FunctionType getOwnerFunction() { [EOL]     return referencedObjType == null ? null : referencedObjType.getOwnerFunction(); [EOL] } <line_num>: 232,236
@Override [EOL] public Iterable<ObjectType> getCtorImplementedInterfaces() { [EOL]     return referencedObjType == null ? Collections.<ObjectType>emptyList() : referencedObjType.getCtorImplementedInterfaces(); [EOL] } <line_num>: 238,242
@Override [EOL] public int hashCode() { [EOL]     return referencedType.hashCode(); [EOL] } <line_num>: 244,247
@Override [EOL] String toStringHelper(boolean forAnnotations) { [EOL]     return referencedType.toStringHelper(forAnnotations); [EOL] } <line_num>: 249,252
@Override [EOL] public ObjectType getImplicitPrototype() { [EOL]     return referencedObjType == null ? null : referencedObjType.getImplicitPrototype(); [EOL] } <line_num>: 254,258
@Override [EOL] boolean defineProperty(String propertyName, JSType type, boolean inferred, Node propertyNode) { [EOL]     return referencedObjType == null ? true : referencedObjType.defineProperty(propertyName, type, inferred, propertyNode); [EOL] } <line_num>: 260,266
@Override [EOL] public boolean removeProperty(String name) { [EOL]     return referencedObjType == null ? false : referencedObjType.removeProperty(name); [EOL] } <line_num>: 268,272
@Override [EOL] public JSType findPropertyType(String propertyName) { [EOL]     return referencedType.findPropertyType(propertyName); [EOL] } <line_num>: 274,277
@Override [EOL] public JSDocInfo getJSDocInfo() { [EOL]     return referencedType.getJSDocInfo(); [EOL] } <line_num>: 279,282
@Override [EOL] public void setJSDocInfo(JSDocInfo info) { [EOL]     if (referencedObjType != null) { [EOL]         referencedObjType.setJSDocInfo(info); [EOL]     } [EOL] } <line_num>: 284,289
@Override [EOL] public void setPropertyJSDocInfo(String propertyName, JSDocInfo info) { [EOL]     if (referencedObjType != null) { [EOL]         referencedObjType.setPropertyJSDocInfo(propertyName, info); [EOL]     } [EOL] } <line_num>: 291,296
@Override [EOL] public FunctionType getConstructor() { [EOL]     return referencedObjType == null ? null : referencedObjType.getConstructor(); [EOL] } <line_num>: 298,302
@Override [EOL] public JSType getParameterType() { [EOL]     return referencedObjType == null ? null : referencedObjType.getParameterType(); [EOL] } <line_num>: 304,308
@Override [EOL] public JSType getIndexType() { [EOL]     return referencedObjType == null ? null : referencedObjType.getIndexType(); [EOL] } <line_num>: 310,314
@Override [EOL] public <T> T visit(Visitor<T> visitor) { [EOL]     return referencedType.visit(visitor); [EOL] } <line_num>: 316,319
@Override [EOL] <T> T visit(RelationshipVisitor<T> visitor, JSType that) { [EOL]     return referencedType.visit(visitor, that); [EOL] } <line_num>: 321,323
@Override [EOL] JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { [EOL]     setReferencedType(referencedType.resolve(t, scope)); [EOL]     return this; [EOL] } <line_num>: 325,329
@Override [EOL] public String toDebugHashCodeString() { [EOL]     return "{proxy:" + referencedType.toDebugHashCodeString() + "}"; [EOL] } <line_num>: 331,334
@Override [EOL] public JSType getTypeOfThis() { [EOL]     if (referencedObjType != null) { [EOL]         return referencedObjType.getTypeOfThis(); [EOL]     } [EOL]     return super.getTypeOfThis(); [EOL] } <line_num>: 336,342
@Override [EOL] public JSType collapseUnion() { [EOL]     if (referencedType.isUnionType()) { [EOL]         return referencedType.collapseUnion(); [EOL]     } [EOL]     return this; [EOL] } <line_num>: 344,350
@Override [EOL] public void matchConstraint(JSType constraint) { [EOL]     referencedType.matchConstraint(constraint); [EOL] } <line_num>: 352,355
@Override [EOL] public ParameterizedType toMaybeParameterizedType() { [EOL]     return referencedType.toMaybeParameterizedType(); [EOL] } <line_num>: 357,360
@Override [EOL] public TemplateType toMaybeTemplateType() { [EOL]     return referencedType.toMaybeTemplateType(); [EOL] } <line_num>: 362,365
@Override [EOL] public boolean hasAnyTemplateTypesInternal() { [EOL]     return referencedType.hasAnyTemplateTypes(); [EOL] } <line_num>: 367,370
