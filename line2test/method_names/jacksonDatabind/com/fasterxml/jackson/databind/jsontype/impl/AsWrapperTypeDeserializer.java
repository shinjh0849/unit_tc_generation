public AsWrapperTypeDeserializer(JavaType bt, TypeIdResolver idRes, String typePropertyName, boolean typeIdVisible, Class<?> defaultImpl)
protected AsWrapperTypeDeserializer(AsWrapperTypeDeserializer src, BeanProperty property)
public TypeDeserializer forProperty(BeanProperty prop)
public As getTypeInclusion()
public Object deserializeTypedFromObject(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Object deserializeTypedFromArray(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Object deserializeTypedFromScalar(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Object deserializeTypedFromAny(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
private final Object _deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
