public BeanAsArrayDeserializer(BeanDeserializerBase delegate, SettableBeanProperty[] ordered)
public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer unwrapper)
public BeanAsArrayDeserializer withObjectIdReader(ObjectIdReader oir)
public BeanAsArrayDeserializer withIgnorableProperties(HashSet<String> ignorableProps)
protected BeanDeserializerBase asArrayDeserializer()
public Object deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Object deserialize(JsonParser jp, DeserializationContext ctxt, Object bean) throws IOException, JsonProcessingException
public Object deserializeFromObject(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected Object _deserializeNonVanilla(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected Object _deserializeWithCreator(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected final Object _deserializeUsingPropertyBased(final JsonParser jp, final DeserializationContext ctxt) throws IOException, JsonProcessingException
protected Object _deserializeFromNonArray(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
long serialVersionUID=Optional[1L]
BeanDeserializerBase _delegate
SettableBeanProperty[] _orderedProperties
