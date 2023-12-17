protected TypeSerializerBase(TypeIdResolver idRes, BeanProperty property) { [EOL]     _idResolver = idRes; [EOL]     _property = property; [EOL] } <line_num>: 14,18
@Override [EOL] public abstract JsonTypeInfo.As getTypeInclusion(); <line_num>: 20,21
@Override [EOL] public String getPropertyName() { [EOL]     return null; [EOL] } <line_num>: 23,24
@Override [EOL] public TypeIdResolver getTypeIdResolver() { [EOL]     return _idResolver; [EOL] } <line_num>: 26,27
protected String idFromValue(Object value) { [EOL]     return _idResolver.idFromValue(value); [EOL] } <line_num>: 35,37
protected String idFromValueAndType(Object value, Class<?> type) { [EOL]     return _idResolver.idFromValueAndType(value, type); [EOL] } <line_num>: 39,41
