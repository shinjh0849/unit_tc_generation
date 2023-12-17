InstanceObjectType(JSTypeRegistry registry, FunctionType constructor) { [EOL]     this(registry, constructor, false, null); [EOL] } <line_num>: 56,58
InstanceObjectType(JSTypeRegistry registry, FunctionType constructor, boolean isNativeType, ImmutableList<JSType> templatizedTypes) { [EOL]     super(registry, null, null, isNativeType, constructor.getTemplateKeys(), templatizedTypes); [EOL]     Preconditions.checkNotNull(constructor); [EOL]     this.constructor = constructor; [EOL] } <line_num>: 60,67
@Override [EOL] public String getReferenceName() { [EOL]     return getConstructor().getReferenceName(); [EOL] } <line_num>: 69,72
@Override [EOL] public boolean hasReferenceName() { [EOL]     return getConstructor().hasReferenceName(); [EOL] } <line_num>: 74,77
@Override [EOL] public ObjectType getImplicitPrototype() { [EOL]     return getConstructor().getPrototype(); [EOL] } <line_num>: 79,82
@Override [EOL] public FunctionType getConstructor() { [EOL]     return constructor; [EOL] } <line_num>: 84,87
@Override [EOL] boolean defineProperty(String name, JSType type, boolean inferred, Node propertyNode) { [EOL]     ObjectType proto = getImplicitPrototype(); [EOL]     if (proto != null && proto.hasOwnDeclaredProperty(name)) { [EOL]         return false; [EOL]     } [EOL]     return super.defineProperty(name, type, inferred, propertyNode); [EOL] } <line_num>: 89,97
@Override [EOL] String toStringHelper(boolean forAnnotations) { [EOL]     if (constructor.hasReferenceName()) { [EOL]         String typeString = constructor.getReferenceName(); [EOL]         ImmutableList<JSType> templatizedTypes = getTemplatizedTypes(); [EOL]         if (!templatizedTypes.isEmpty()) { [EOL]             typeString += ".<" + Joiner.on(",").join(templatizedTypes) + ">"; [EOL]         } [EOL]         return typeString; [EOL]     } else { [EOL]         return super.toStringHelper(forAnnotations); [EOL]     } [EOL] } <line_num>: 99,113
@Override [EOL] boolean isTheObjectType() { [EOL]     return getConstructor().isNativeObjectType() && "Object".equals(getReferenceName()); [EOL] } <line_num>: 115,119
@Override [EOL] public boolean isInstanceType() { [EOL]     return true; [EOL] } <line_num>: 121,124
@Override [EOL] public boolean isArrayType() { [EOL]     return getConstructor().isNativeObjectType() && "Array".equals(getReferenceName()); [EOL] } <line_num>: 126,130
@Override [EOL] public boolean isStringObjectType() { [EOL]     return getConstructor().isNativeObjectType() && "String".equals(getReferenceName()); [EOL] } <line_num>: 132,136
@Override [EOL] public boolean isBooleanObjectType() { [EOL]     return getConstructor().isNativeObjectType() && "Boolean".equals(getReferenceName()); [EOL] } <line_num>: 138,142
@Override [EOL] public boolean isNumberObjectType() { [EOL]     return getConstructor().isNativeObjectType() && "Number".equals(getReferenceName()); [EOL] } <line_num>: 144,148
@Override [EOL] public boolean isDateType() { [EOL]     return getConstructor().isNativeObjectType() && "Date".equals(getReferenceName()); [EOL] } <line_num>: 150,154
@Override [EOL] public boolean isRegexpType() { [EOL]     return getConstructor().isNativeObjectType() && "RegExp".equals(getReferenceName()); [EOL] } <line_num>: 156,160
@Override [EOL] public boolean isNominalType() { [EOL]     return hasReferenceName(); [EOL] } <line_num>: 162,165
@Override [EOL] public int hashCode() { [EOL]     if (hasReferenceName()) { [EOL]         return getReferenceName().hashCode(); [EOL]     } else { [EOL]         return super.hashCode(); [EOL]     } [EOL] } <line_num>: 171,178
@Override [EOL] public Iterable<ObjectType> getCtorImplementedInterfaces() { [EOL]     return getConstructor().getImplementedInterfaces(); [EOL] } <line_num>: 180,183
@Override [EOL] public Iterable<ObjectType> getCtorExtendedInterfaces() { [EOL]     return getConstructor().getExtendedInterfaces(); [EOL] } <line_num>: 185,188
