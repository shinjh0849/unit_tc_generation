public ArrayBlockingQueueDeserializer(JavaType collectionType, JsonDeserializer<Object> valueDeser, TypeDeserializer valueTypeDeser, ValueInstantiator valueInstantiator, JsonDeserializer<Object> delegateDeser)
protected ArrayBlockingQueueDeserializer(ArrayBlockingQueueDeserializer src)
protected ArrayBlockingQueueDeserializer withResolved(JsonDeserializer<?> dd, JsonDeserializer<?> vd, TypeDeserializer vtd)
public Collection<Object> deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Collection<Object> deserialize(JsonParser jp, DeserializationContext ctxt, Collection<Object> result0) throws IOException, JsonProcessingException
public Object deserializeWithType(JsonParser jp, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException, JsonProcessingException
long serialVersionUID=Optional[5471961369237518580L]
