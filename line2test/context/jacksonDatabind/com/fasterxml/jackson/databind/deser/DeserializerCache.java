public DeserializerCache()
 Object writeReplace()
public int cachedDeserializersCount()
public void flushCachedDeserializers()
public JsonDeserializer<Object> findValueDeserializer(DeserializationContext ctxt, DeserializerFactory factory, JavaType propertyType) throws JsonMappingException
public KeyDeserializer findKeyDeserializer(DeserializationContext ctxt, DeserializerFactory factory, JavaType type) throws JsonMappingException
public boolean hasValueDeserializerFor(DeserializationContext ctxt, DeserializerFactory factory, JavaType type)
protected JsonDeserializer<Object> _findCachedDeserializer(JavaType type)
protected JsonDeserializer<Object> _createAndCacheValueDeserializer(DeserializationContext ctxt, DeserializerFactory factory, JavaType type) throws JsonMappingException
protected JsonDeserializer<Object> _createAndCache2(DeserializationContext ctxt, DeserializerFactory factory, JavaType type) throws JsonMappingException
protected JsonDeserializer<Object> _createDeserializer(DeserializationContext ctxt, DeserializerFactory factory, JavaType type) throws JsonMappingException
protected JsonDeserializer<?> _createDeserializer2(DeserializationContext ctxt, DeserializerFactory factory, JavaType type, BeanDescription beanDesc) throws JsonMappingException
protected JsonDeserializer<Object> findDeserializerFromAnnotation(DeserializationContext ctxt, Annotated ann) throws JsonMappingException
protected JsonDeserializer<Object> findConvertingDeserializer(DeserializationContext ctxt, Annotated a, JsonDeserializer<Object> deser) throws JsonMappingException
protected Converter<Object, Object> findConverter(DeserializationContext ctxt, Annotated a) throws JsonMappingException
private JavaType modifyTypeByAnnotation(DeserializationContext ctxt, Annotated a, JavaType type) throws JsonMappingException
private Class<?> _verifyAsClass(Object src, String methodName, Class<?> noneClass)
protected JsonDeserializer<Object> _handleUnknownValueDeserializer(JavaType type) throws JsonMappingException
protected KeyDeserializer _handleUnknownKeyDeserializer(JavaType type) throws JsonMappingException
long serialVersionUID=Optional[1L]
ConcurrentHashMap<JavaType, JsonDeserializer<Object>> _cachedDeserializers=Optional[new ConcurrentHashMap<JavaType, JsonDeserializer<Object>>(64, 0.75f, 2)]
HashMap<JavaType, JsonDeserializer<Object>> _incompleteDeserializers=Optional[new HashMap<JavaType, JsonDeserializer<Object>>(8)]
