public AsPropertyTypeDeserializer(JavaType bt, TypeIdResolver idRes, String typePropertyName, boolean typeIdVisible, Class<?> defaultImpl)
public AsPropertyTypeDeserializer(AsPropertyTypeDeserializer src, BeanProperty property)
public TypeDeserializer forProperty(BeanProperty prop)
public As getTypeInclusion()
public Object deserializeTypedFromObject(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected final Object _deserializeTypedForId(JsonParser jp, DeserializationContext ctxt, TokenBuffer tb) throws IOException, JsonProcessingException
protected Object _deserializeTypedUsingDefaultImpl(JsonParser jp, DeserializationContext ctxt, TokenBuffer tb) throws IOException, JsonProcessingException
public Object deserializeTypedFromAny(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
long serialVersionUID=Optional[1L]
