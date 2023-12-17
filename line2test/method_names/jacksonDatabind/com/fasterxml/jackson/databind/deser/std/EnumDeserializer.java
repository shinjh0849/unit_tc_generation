public EnumDeserializer(EnumResolver<?> res)
public FactoryBasedDeserializer(Class<?> cls, AnnotatedMethod f, Class<?> inputType)
public static JsonDeserializer<?> deserializerForCreator(DeserializationConfig config, Class<?> enumClass, AnnotatedMethod factory)
public boolean isCachable()
public Enum<?> deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Object deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
