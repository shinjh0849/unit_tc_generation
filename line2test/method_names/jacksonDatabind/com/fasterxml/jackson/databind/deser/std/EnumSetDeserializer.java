public EnumSetDeserializer(JavaType enumType, JsonDeserializer<?> deser)
public EnumSetDeserializer withDeserializer(JsonDeserializer<?> deser)
public boolean isCachable()
public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) throws JsonMappingException
public EnumSet<?> deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Object deserializeWithType(JsonParser jp, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException, JsonProcessingException
private EnumSet constructSet()
