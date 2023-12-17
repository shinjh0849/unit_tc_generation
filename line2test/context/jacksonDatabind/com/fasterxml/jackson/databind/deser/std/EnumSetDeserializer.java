public EnumSetDeserializer(JavaType enumType, JsonDeserializer<?> deser)
public EnumSetDeserializer withDeserializer(JsonDeserializer<?> deser)
public boolean isCachable()
public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) throws JsonMappingException
public EnumSet<?> deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Object deserializeWithType(JsonParser jp, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException, JsonProcessingException
private EnumSet constructSet()
long serialVersionUID=Optional[3479455075597887177L]
JavaType _enumType
Class<Enum> _enumClass
JsonDeserializer<Enum<?>> _enumDeserializer
