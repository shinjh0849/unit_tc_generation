public EnumMapDeserializer(JavaType mapType, JsonDeserializer<?> keyDeserializer, JsonDeserializer<?> valueDeser)
public EnumMapDeserializer(JavaType mapType, JsonDeserializer<?> keyDeserializer, JsonDeserializer<?> valueDeser, TypeDeserializer valueTypeDeser)
public EnumMapDeserializer withResolved(JsonDeserializer<?> keyDeserializer, JsonDeserializer<?> valueDeserializer)
public EnumMapDeserializer withResolved(JsonDeserializer<?> keyDeserializer, JsonDeserializer<?> valueDeserializer, TypeDeserializer valueTypeDeser)
public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) throws JsonMappingException
public boolean isCachable()
public EnumMap<?, ?> deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Object deserializeWithType(JsonParser jp, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException, JsonProcessingException
private EnumMap<?, ?> constructMap()
long serialVersionUID=Optional[1518773374647478964L]
JavaType _mapType
Class<?> _enumClass
JsonDeserializer<Enum<?>> _keyDeserializer
JsonDeserializer<Object> _valueDeserializer
TypeDeserializer _valueTypeDeserializer
