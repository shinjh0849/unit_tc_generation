public abstract SerializerFactory withAdditionalSerializers(Serializers additional); <line_num>: 26,26
public abstract SerializerFactory withAdditionalKeySerializers(Serializers additional); <line_num>: 28,28
public abstract SerializerFactory withSerializerModifier(BeanSerializerModifier modifier); <line_num>: 37,37
@Deprecated [EOL] public JsonSerializer<Object> createSerializer(SerializerProvider prov, JavaType baseType, BeanProperty property) throws JsonMappingException { [EOL]     return createSerializer(prov, baseType); [EOL] } <line_num>: 49,54
public abstract JsonSerializer<Object> createSerializer(SerializerProvider prov, JavaType baseType) throws JsonMappingException; <line_num>: 64,66
public abstract TypeSerializer createTypeSerializer(SerializationConfig config, JavaType baseType) throws JsonMappingException; <line_num>: 77,79
public abstract JsonSerializer<Object> createKeySerializer(SerializationConfig config, JavaType baseType, JsonSerializer<Object> defaultImpl) throws JsonMappingException; <line_num>: 93,95
@Deprecated [EOL] public JsonSerializer<Object> createKeySerializer(SerializationConfig config, JavaType baseType) throws JsonMappingException { [EOL]     return createKeySerializer(config, baseType, null); [EOL] } <line_num>: 100,105
