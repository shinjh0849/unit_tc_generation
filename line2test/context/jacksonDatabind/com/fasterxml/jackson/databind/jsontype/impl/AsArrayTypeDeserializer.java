public AsArrayTypeDeserializer(JavaType bt, TypeIdResolver idRes, String typePropertyName, boolean typeIdVisible, Class<?> defaultImpl)
public AsArrayTypeDeserializer(AsArrayTypeDeserializer src, BeanProperty property)
public TypeDeserializer forProperty(BeanProperty prop)
public As getTypeInclusion()
public Object deserializeTypedFromArray(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Object deserializeTypedFromObject(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Object deserializeTypedFromScalar(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Object deserializeTypedFromAny(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
private final Object _deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected final String _locateTypeId(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
long serialVersionUID=Optional[5345570420394408290L]
