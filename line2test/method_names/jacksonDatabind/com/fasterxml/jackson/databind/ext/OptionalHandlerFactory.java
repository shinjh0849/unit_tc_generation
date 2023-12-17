protected OptionalHandlerFactory()
public JsonSerializer<?> findSerializer(SerializationConfig config, JavaType type, BeanDescription beanDesc)
public JsonDeserializer<?> findDeserializer(JavaType type, DeserializationConfig config, BeanDescription beanDesc) throws JsonMappingException
private Object instantiate(String className)
private boolean doesImplement(Class<?> actualType, String classNameToImplement)
private boolean hasInterface(Class<?> type, String interfaceToImplement)
private boolean hasSupertypeStartingWith(Class<?> rawType, String prefix)
private boolean hasInterfaceStartingWith(Class<?> type, String prefix)
