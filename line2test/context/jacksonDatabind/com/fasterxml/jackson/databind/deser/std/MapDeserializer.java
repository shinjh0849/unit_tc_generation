public MapDeserializer(JavaType mapType, ValueInstantiator valueInstantiator, KeyDeserializer keyDeser, JsonDeserializer<Object> valueDeser, TypeDeserializer valueTypeDeser)
protected MapDeserializer(MapDeserializer src)
protected MapDeserializer(MapDeserializer src, KeyDeserializer keyDeser, JsonDeserializer<Object> valueDeser, TypeDeserializer valueTypeDeser, HashSet<String> ignorable)
protected MapDeserializer withResolved(KeyDeserializer keyDeser, TypeDeserializer valueTypeDeser, JsonDeserializer<?> valueDeser, HashSet<String> ignorable)
protected final boolean _isStdKeyDeser(JavaType mapType, KeyDeserializer keyDeser)
public void setIgnorableProperties(String[] ignorable)
public void resolve(DeserializationContext ctxt) throws JsonMappingException
public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) throws JsonMappingException
public JavaType getContentType()
public JsonDeserializer<Object> getContentDeserializer()
public Map<Object, Object> deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Map<Object, Object> deserialize(JsonParser jp, DeserializationContext ctxt, Map<Object, Object> result) throws IOException, JsonProcessingException
public Object deserializeWithType(JsonParser jp, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException, JsonProcessingException
public final Class<?> getMapClass()
public JavaType getValueType()
protected final void _readAndBind(JsonParser jp, DeserializationContext ctxt, Map<Object, Object> result) throws IOException, JsonProcessingException
protected final void _readAndBindStringMap(JsonParser jp, DeserializationContext ctxt, Map<Object, Object> result) throws IOException, JsonProcessingException
public Map<Object, Object> _deserializeUsingCreator(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected void wrapAndThrow(Throwable t, Object ref) throws IOException
long serialVersionUID=Optional[-3378654289961736240L]
JavaType _mapType
KeyDeserializer _keyDeserializer
boolean _standardStringKey
JsonDeserializer<Object> _valueDeserializer
TypeDeserializer _valueTypeDeserializer
ValueInstantiator _valueInstantiator
boolean _hasDefaultCreator
JsonDeserializer<Object> _delegateDeserializer
PropertyBasedCreator _propertyBasedCreator
HashSet<String> _ignorableProperties
