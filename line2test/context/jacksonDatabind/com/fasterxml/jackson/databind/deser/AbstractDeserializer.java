public AbstractDeserializer(BeanDeserializerBuilder builder, BeanDescription beanDesc, Map<String, SettableBeanProperty> backRefProps)
public boolean isCachable()
public ObjectIdReader getObjectIdReader()
public SettableBeanProperty findBackReference(String logicalName)
public Object deserializeWithType(JsonParser jp, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException, JsonProcessingException
public Object deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected Object _deserializeIfNatural(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected Object _deserializeFromObjectId(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
long serialVersionUID=Optional[-3010349050434697698L]
JavaType _baseType
ObjectIdReader _objectIdReader
Map<String, SettableBeanProperty> _backRefProperties
boolean _acceptString
boolean _acceptBoolean
boolean _acceptInt
boolean _acceptDouble
