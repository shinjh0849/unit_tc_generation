public AsExternalTypeDeserializer(JavaType bt, TypeIdResolver idRes, String typePropertyName, boolean typeIdVisible, Class<?> defaultImpl) { [EOL]     super(bt, idRes, typePropertyName, typeIdVisible, defaultImpl); [EOL] } <line_num>: 22,26
public AsExternalTypeDeserializer(AsExternalTypeDeserializer src, BeanProperty property) { [EOL]     super(src, property); [EOL] } <line_num>: 28,30
@Override [EOL] public TypeDeserializer forProperty(BeanProperty prop) { [EOL]     if (prop == _property) { [EOL]         return this; [EOL]     } [EOL]     return new AsExternalTypeDeserializer(this, prop); [EOL] } <line_num>: 32,39
@Override [EOL] public As getTypeInclusion() { [EOL]     return As.EXTERNAL_PROPERTY; [EOL] } <line_num>: 41,44
