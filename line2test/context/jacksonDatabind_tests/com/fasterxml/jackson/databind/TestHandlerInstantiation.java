public MyBean()
public MyBean(String s)
public TypeIdBean()
public TypeIdBean(int x)
public TypeIdBeanWrapper()
public TypeIdBeanWrapper(TypeIdBean b)
public MyBeanDeserializer(String p)
public MyKeyDeserializer()
public MyBeanSerializer(String p)
public CustomIdResolver(String idForBean)
public MyInstantiator(String p)
public MyBean deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Object deserializeKey(String key, DeserializationContext ctxt) throws IOException, JsonProcessingException
public void serialize(MyBean value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException
public Id getMechanism()
public String idFromValue(Object value)
public String idFromValueAndType(Object value, Class<?> type)
public void init(JavaType baseType)
public JavaType typeFromId(String id)
public String idFromBaseType()
public JsonDeserializer<?> deserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> deserClass)
public KeyDeserializer keyDeserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> keyDeserClass)
public JsonSerializer<?> serializerInstance(SerializationConfig config, Annotated annotated, Class<?> serClass)
public TypeIdResolver typeIdResolverInstance(MapperConfig<?> config, Annotated annotated, Class<?> resolverClass)
public TypeResolverBuilder<?> typeResolverBuilderInstance(MapperConfig<?> config, Annotated annotated, Class<?> builderClass)
public void testDeserializer() throws Exception
public void testKeyDeserializer() throws Exception
public void testSerializer() throws Exception
public void testTypeIdResolver() throws Exception
