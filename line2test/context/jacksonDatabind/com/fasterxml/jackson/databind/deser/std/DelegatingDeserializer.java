public DelegatingDeserializer(JsonDeserializer<?> delegatee)
protected abstract JsonDeserializer<?> newDelegatingInstance(JsonDeserializer<?> newDelegatee)
private static Class<?> _figureType(JsonDeserializer<?> deser)
public void resolve(DeserializationContext ctxt) throws JsonMappingException
public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) throws JsonMappingException
protected JsonDeserializer<?> _createContextual(DeserializationContext ctxt, BeanProperty property, JsonDeserializer<?> newDelegatee)
public Object deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Object deserialize(JsonParser jp, DeserializationContext ctxt, Object intoValue) throws IOException, JsonProcessingException
public Object deserializeWithType(JsonParser jp, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException, JsonProcessingException
public JsonDeserializer<?> replaceDelegatee(JsonDeserializer<?> delegatee)
public Object getNullValue()
public Object getEmptyValue()
public Collection<Object> getKnownPropertyNames()
public boolean isCachable()
public ObjectIdReader getObjectIdReader()
public JsonDeserializer<?> getDelegatee()
long serialVersionUID=Optional[1L]
JsonDeserializer<?> _delegatee
