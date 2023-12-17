public JavaTypeDeserializer()
public TokenBufferDeserializer()
public static StdDeserializer<?>[] all()
public static JsonDeserializer<?> find(Class<?> rawType)
public static ValueInstantiator findValueInstantiator(DeserializationConfig config, BeanDescription beanDesc)
public JavaType deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public String getValueTypeDesc()
public boolean canCreateFromObjectWith()
public CreatorProperty[] getFromObjectArguments(DeserializationConfig config)
private static CreatorProperty creatorProp(String name, JavaType type, int index)
public Object createFromObjectWith(DeserializationContext ctxt, Object[] args)
private static final long _long(Object o)
private static final int _int(Object o)
public TokenBuffer deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
