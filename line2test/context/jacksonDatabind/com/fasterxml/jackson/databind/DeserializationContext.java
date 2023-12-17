protected DeserializationContext(DeserializerFactory df)
protected DeserializationContext(DeserializerFactory df, DeserializerCache cache)
protected DeserializationContext(DeserializationContext src, DeserializerFactory factory)
protected DeserializationContext(DeserializationContext src, DeserializationConfig config, JsonParser jp, InjectableValues injectableValues)
public DeserializationConfig getConfig()
public final Class<?> getActiveView()
public final AnnotationIntrospector getAnnotationIntrospector()
public final TypeFactory getTypeFactory()
public DeserializerFactory getFactory()
public final boolean isEnabled(DeserializationFeature feat)
public final JsonParser getParser()
public final Object findInjectableValue(Object valueId, BeanProperty forProperty, Object beanInstance)
public final Base64Variant getBase64Variant()
public final JsonNodeFactory getNodeFactory()
public Locale getLocale()
public TimeZone getTimeZone()
public boolean hasValueDeserializerFor(JavaType type)
public final JsonDeserializer<Object> findContextualValueDeserializer(JavaType type, BeanProperty property) throws JsonMappingException
public final JsonDeserializer<Object> findRootValueDeserializer(JavaType type) throws JsonMappingException
public final KeyDeserializer findKeyDeserializer(JavaType keyType, BeanProperty property) throws JsonMappingException
public abstract ReadableObjectId findObjectId(Object id, ObjectIdGenerator<?> generator)
public final JavaType constructType(Class<?> cls)
public Class<?> findClass(String className) throws ClassNotFoundException
public abstract JsonDeserializer<Object> deserializerInstance(Annotated annotated, Object deserDef) throws JsonMappingException
public abstract KeyDeserializer keyDeserializerInstance(Annotated annotated, Object deserDef) throws JsonMappingException
public final ObjectBuffer leaseObjectBuffer()
public final void returnObjectBuffer(ObjectBuffer buf)
public final ArrayBuilders getArrayBuilders()
public Date parseDate(String dateStr) throws IllegalArgumentException
public Calendar constructCalendar(Date d)
public boolean handleUnknownProperty(JsonParser jp, JsonDeserializer<?> deser, Object instanceOrClass, String propName) throws IOException, JsonProcessingException
public void reportUnknownProperty(Object instanceOrClass, String fieldName, JsonDeserializer<?> deser) throws JsonMappingException
public JsonMappingException mappingException(Class<?> targetClass)
public JsonMappingException mappingException(Class<?> targetClass, JsonToken token)
public JsonMappingException mappingException(String message)
public JsonMappingException instantiationException(Class<?> instClass, Throwable t)
public JsonMappingException instantiationException(Class<?> instClass, String msg)
public JsonMappingException weirdStringException(Class<?> instClass, String msg)
public JsonMappingException weirdStringException(String value, Class<?> instClass, String msg)
public JsonMappingException weirdNumberException(Class<?> instClass, String msg)
public JsonMappingException weirdNumberException(Number value, Class<?> instClass, String msg)
public JsonMappingException weirdKeyException(Class<?> keyClass, String keyValue, String msg)
public JsonMappingException wrongTokenException(JsonParser jp, JsonToken expToken, String msg)
public JsonMappingException unknownTypeException(JavaType type, String id)
public JsonMappingException endOfInputException(Class<?> instClass)
protected DateFormat getDateFormat()
protected String determineClassName(Object instance)
protected String _calcName(Class<?> cls)
protected String _valueDesc()
protected String _desc(String desc)
long serialVersionUID=Optional[-7727373309391091315L]
int MAX_ERROR_STR_LEN=Optional[500]
DeserializerCache _cache
DeserializerFactory _factory
DeserializationConfig _config
int _featureFlags
Class<?> _view
JsonParser _parser
InjectableValues _injectableValues
ArrayBuilders _arrayBuilders
ObjectBuffer _objectBuffer
DateFormat _dateFormat
