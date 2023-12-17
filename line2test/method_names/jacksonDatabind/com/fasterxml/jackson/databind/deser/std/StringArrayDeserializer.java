public StringArrayDeserializer()
protected StringArrayDeserializer(JsonDeserializer<?> deser)
public String[] deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected final String[] _deserializeCustom(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Object deserializeWithType(JsonParser jp, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException, JsonProcessingException
private final String[] handleNonArray(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) throws JsonMappingException
