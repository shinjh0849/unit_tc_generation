public StdDelegatingDeserializer(Converter<?, T> converter)
public StdDelegatingDeserializer(Converter<Object, T> converter, JavaType delegateType, JsonDeserializer<?> delegateDeserializer)
protected StdDelegatingDeserializer<T> withDelegate(Converter<Object, T> converter, JavaType delegateType, JsonDeserializer<?> delegateDeserializer)
public void resolve(DeserializationContext ctxt) throws JsonMappingException
public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) throws JsonMappingException
public JsonDeserializer<?> getDelegatee()
public T deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Object deserializeWithType(JsonParser jp, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException, JsonProcessingException
protected T convertValue(Object delegateValue)
