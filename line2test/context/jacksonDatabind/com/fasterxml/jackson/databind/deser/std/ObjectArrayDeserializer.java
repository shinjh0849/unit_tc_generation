public ObjectArrayDeserializer(ArrayType arrayType, JsonDeserializer<Object> elemDeser, TypeDeserializer elemTypeDeser)
public ObjectArrayDeserializer withDeserializer(TypeDeserializer elemTypeDeser, JsonDeserializer<?> elemDeser)
public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) throws JsonMappingException
public JavaType getContentType()
public JsonDeserializer<Object> getContentDeserializer()
public Object[] deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Object[] deserializeWithType(JsonParser jp, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException, JsonProcessingException
protected Byte[] deserializeFromBase64(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
private final Object[] handleNonArray(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
long serialVersionUID=Optional[1L]
ArrayType _arrayType
boolean _untyped
Class<?> _elementClass
JsonDeserializer<Object> _elementDeserializer
TypeDeserializer _elementTypeDeserializer
