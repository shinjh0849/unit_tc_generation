public SerializerProvider()
protected SerializerProvider(SerializerProvider src, SerializationConfig config, SerializerFactory f)
public void setDefaultKeySerializer(JsonSerializer<Object> ks)
public void setNullValueSerializer(JsonSerializer<Object> nvs)
public void setNullKeySerializer(JsonSerializer<Object> nks)
public final SerializationConfig getConfig()
public final AnnotationIntrospector getAnnotationIntrospector()
public final TypeFactory getTypeFactory()
public final Class<?> getActiveView()
public final Class<?> getSerializationView()
public final boolean isEnabled(SerializationFeature feature)
public final FilterProvider getFilterProvider()
public Locale getLocale()
public TimeZone getTimeZone()
public abstract WritableObjectId findObjectId(Object forPojo, ObjectIdGenerator<?> generatorType)
public JsonSerializer<Object> findValueSerializer(Class<?> valueType, BeanProperty property) throws JsonMappingException
public JsonSerializer<Object> findValueSerializer(JavaType valueType, BeanProperty property) throws JsonMappingException
public JsonSerializer<Object> findTypedValueSerializer(Class<?> valueType, boolean cache, BeanProperty property) throws JsonMappingException
public JsonSerializer<Object> findTypedValueSerializer(JavaType valueType, boolean cache, BeanProperty property) throws JsonMappingException
public JsonSerializer<Object> findKeySerializer(JavaType keyType, BeanProperty property) throws JsonMappingException
public JsonSerializer<Object> getDefaultNullKeySerializer()
public JsonSerializer<Object> getDefaultNullValueSerializer()
public JsonSerializer<Object> findNullKeySerializer(JavaType serializationType, BeanProperty property) throws JsonMappingException
public JsonSerializer<Object> findNullValueSerializer(BeanProperty property) throws JsonMappingException
public JsonSerializer<Object> getUnknownTypeSerializer(Class<?> unknownType)
public abstract JsonSerializer<Object> serializerInstance(Annotated annotated, Object serDef) throws JsonMappingException
public final void defaultSerializeValue(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException
public final void defaultSerializeField(String fieldName, Object value, JsonGenerator jgen) throws IOException, JsonProcessingException
public final void defaultSerializeDateValue(long timestamp, JsonGenerator jgen) throws IOException, JsonProcessingException
public final void defaultSerializeDateValue(Date date, JsonGenerator jgen) throws IOException, JsonProcessingException
public void defaultSerializeDateKey(long timestamp, JsonGenerator jgen) throws IOException, JsonProcessingException
public void defaultSerializeDateKey(Date date, JsonGenerator jgen) throws IOException, JsonProcessingException
public final void defaultSerializeNull(JsonGenerator jgen) throws IOException, JsonProcessingException
protected void _reportIncompatibleRootType(Object value, JavaType rootType) throws IOException, JsonProcessingException
protected JsonSerializer<Object> _findExplicitUntypedSerializer(Class<?> runtimeType) throws JsonMappingException
protected JsonSerializer<Object> _createAndCacheUntypedSerializer(Class<?> type) throws JsonMappingException
protected JsonSerializer<Object> _createAndCacheUntypedSerializer(JavaType type) throws JsonMappingException
protected JsonSerializer<Object> _createUntypedSerializer(JavaType type) throws JsonMappingException
protected JsonSerializer<Object> _handleContextualResolvable(JsonSerializer<?> ser, BeanProperty property) throws JsonMappingException
protected JsonSerializer<Object> _handleResolvable(JsonSerializer<?> ser) throws JsonMappingException
protected JsonSerializer<Object> _handleContextual(JsonSerializer<?> ser, BeanProperty property) throws JsonMappingException
protected final DateFormat _dateFormat()
