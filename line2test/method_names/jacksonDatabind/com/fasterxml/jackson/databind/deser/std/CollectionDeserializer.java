public CollectionDeserializer(JavaType collectionType, JsonDeserializer<Object> valueDeser, TypeDeserializer valueTypeDeser, ValueInstantiator valueInstantiator)
protected CollectionDeserializer(JavaType collectionType, JsonDeserializer<Object> valueDeser, TypeDeserializer valueTypeDeser, ValueInstantiator valueInstantiator, JsonDeserializer<Object> delegateDeser)
protected CollectionDeserializer(CollectionDeserializer src)
protected CollectionDeserializer withResolved(JsonDeserializer<?> dd, JsonDeserializer<?> vd, TypeDeserializer vtd)
public CollectionDeserializer createContextual(DeserializationContext ctxt, BeanProperty property) throws JsonMappingException
public JavaType getContentType()
public JsonDeserializer<Object> getContentDeserializer()
public Collection<Object> deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Collection<Object> deserialize(JsonParser jp, DeserializationContext ctxt, Collection<Object> result) throws IOException, JsonProcessingException
public Object deserializeWithType(JsonParser jp, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException, JsonProcessingException
protected final Collection<Object> handleNonArray(JsonParser jp, DeserializationContext ctxt, Collection<Object> result) throws IOException, JsonProcessingException
