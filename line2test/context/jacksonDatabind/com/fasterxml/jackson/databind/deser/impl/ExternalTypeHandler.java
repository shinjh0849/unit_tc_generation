protected ExternalTypeHandler(ExtTypedProperty[] properties, HashMap<String, Integer> nameToPropertyIndex, String[] typeIds, TokenBuffer[] tokens)
protected ExternalTypeHandler(ExternalTypeHandler h)
public ExtTypedProperty(SettableBeanProperty property, TypeDeserializer typeDeser)
public ExternalTypeHandler start()
public boolean handleTypePropertyValue(JsonParser jp, DeserializationContext ctxt, String propName, Object bean) throws IOException, JsonProcessingException
public boolean handlePropertyValue(JsonParser jp, DeserializationContext ctxt, String propName, Object bean) throws IOException, JsonProcessingException
public Object complete(JsonParser jp, DeserializationContext ctxt, Object bean) throws IOException, JsonProcessingException
public Object complete(JsonParser jp, DeserializationContext ctxt, PropertyValueBuffer buffer, PropertyBasedCreator creator) throws IOException, JsonProcessingException
protected final Object _deserialize(JsonParser jp, DeserializationContext ctxt, int index, String typeId) throws IOException, JsonProcessingException
protected final void _deserializeAndSet(JsonParser jp, DeserializationContext ctxt, Object bean, int index, String typeId) throws IOException, JsonProcessingException
public void addExternal(SettableBeanProperty property, TypeDeserializer typeDeser)
public ExternalTypeHandler build()
public boolean hasTypePropertyName(String n)
public boolean hasDefaultType()
public String getDefaultTypeId()
public String getTypePropertyName()
public SettableBeanProperty getProperty()
ExtTypedProperty[] _properties
HashMap<String, Integer> _nameToPropertyIndex
String[] _typeIds
TokenBuffer[] _tokens
