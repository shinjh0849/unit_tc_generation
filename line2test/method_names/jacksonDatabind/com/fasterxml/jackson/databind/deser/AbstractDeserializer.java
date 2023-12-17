public AbstractDeserializer(BeanDeserializerBuilder builder, BeanDescription beanDesc, Map<String, SettableBeanProperty> backRefProps)
public boolean isCachable()
public ObjectIdReader getObjectIdReader()
public SettableBeanProperty findBackReference(String logicalName)
public Object deserializeWithType(JsonParser jp, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException, JsonProcessingException
public Object deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected Object _deserializeIfNatural(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected Object _deserializeFromObjectId(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
