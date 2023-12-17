public StringCollectionDeserializer(JavaType collectionType, JsonDeserializer<?> valueDeser, ValueInstantiator valueInstantiator)
protected StringCollectionDeserializer(JavaType collectionType, ValueInstantiator valueInstantiator, JsonDeserializer<?> delegateDeser, JsonDeserializer<?> valueDeser)
protected StringCollectionDeserializer withResolved(JsonDeserializer<?> delegateDeser, JsonDeserializer<?> valueDeser)
public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) throws JsonMappingException
public JavaType getContentType()
public JsonDeserializer<Object> getContentDeserializer()
public Collection<String> deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Collection<String> deserialize(JsonParser jp, DeserializationContext ctxt, Collection<String> result) throws IOException, JsonProcessingException
private Collection<String> deserializeUsingCustom(JsonParser jp, DeserializationContext ctxt, Collection<String> result, final JsonDeserializer<String> deser) throws IOException, JsonProcessingException
public Object deserializeWithType(JsonParser jp, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException, JsonProcessingException
private final Collection<String> handleNonArray(JsonParser jp, DeserializationContext ctxt, Collection<String> result) throws IOException, JsonProcessingException
long serialVersionUID=Optional[1L]
JavaType _collectionType
JsonDeserializer<String> _valueDeserializer
ValueInstantiator _valueInstantiator
JsonDeserializer<Object> _delegateDeserializer
