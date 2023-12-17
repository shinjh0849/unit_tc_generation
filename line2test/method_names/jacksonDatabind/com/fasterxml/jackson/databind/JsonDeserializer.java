private None()
public abstract T deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public T deserialize(JsonParser jp, DeserializationContext ctxt, T intoValue) throws IOException, JsonProcessingException
public Object deserializeWithType(JsonParser jp, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException, JsonProcessingException
public JsonDeserializer<T> unwrappingDeserializer(NameTransformer unwrapper)
public JsonDeserializer<?> replaceDelegatee(JsonDeserializer<?> delegatee)
public T getNullValue()
public T getEmptyValue()
public Collection<Object> getKnownPropertyNames()
public boolean isCachable()
public ObjectIdReader getObjectIdReader()
public JsonDeserializer<?> getDelegatee()
