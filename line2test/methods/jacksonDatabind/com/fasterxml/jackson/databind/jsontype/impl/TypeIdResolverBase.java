protected TypeIdResolverBase(JavaType baseType, TypeFactory typeFactory) { [EOL]     _baseType = baseType; [EOL]     _typeFactory = typeFactory; [EOL] } <line_num>: 17,21
@Override [EOL] public void init(JavaType bt) { [EOL] } <line_num>: 23,26
@Override [EOL] public String idFromBaseType() { [EOL]     return idFromValueAndType(null, _baseType.getRawClass()); [EOL] } <line_num>: 28,37
