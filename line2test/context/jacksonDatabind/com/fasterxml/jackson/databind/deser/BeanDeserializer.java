public BeanDeserializer(BeanDeserializerBuilder builder, BeanDescription beanDesc, BeanPropertyMap properties, Map<String, SettableBeanProperty> backRefs, HashSet<String> ignorableProps, boolean ignoreAllUnknown, boolean hasViews)
protected BeanDeserializer(BeanDeserializerBase src)
protected BeanDeserializer(BeanDeserializerBase src, boolean ignoreAllUnknown)
protected BeanDeserializer(BeanDeserializerBase src, NameTransformer unwrapper)
public BeanDeserializer(BeanDeserializerBase src, ObjectIdReader oir)
public BeanDeserializer(BeanDeserializerBase src, HashSet<String> ignorableProps)
public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer unwrapper)
public BeanDeserializer withObjectIdReader(ObjectIdReader oir)
public BeanDeserializer withIgnorableProperties(HashSet<String> ignorableProps)
protected BeanDeserializerBase asArrayDeserializer()
public final Object deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
private final Object _deserializeOther(JsonParser jp, DeserializationContext ctxt, JsonToken t) throws IOException, JsonProcessingException
protected Object _missingToken(JsonParser jp, DeserializationContext ctxt) throws JsonProcessingException
public Object deserialize(JsonParser jp, DeserializationContext ctxt, Object bean) throws IOException, JsonProcessingException
private final Object vanillaDeserialize(JsonParser jp, DeserializationContext ctxt, JsonToken t) throws IOException, JsonProcessingException
public Object deserializeFromObject(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected Object _deserializeUsingPropertyBased(final JsonParser jp, final DeserializationContext ctxt) throws IOException, JsonProcessingException
protected final Object deserializeWithView(JsonParser jp, DeserializationContext ctxt, Object bean, Class<?> activeView) throws IOException, JsonProcessingException
protected Object deserializeWithUnwrapped(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected Object deserializeWithUnwrapped(JsonParser jp, DeserializationContext ctxt, Object bean) throws IOException, JsonProcessingException
protected Object deserializeUsingPropertyBasedWithUnwrapped(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected Object deserializeWithExternalTypeId(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected Object deserializeWithExternalTypeId(JsonParser jp, DeserializationContext ctxt, Object bean) throws IOException, JsonProcessingException
protected Object deserializeUsingPropertyBasedWithExternalTypeId(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
long serialVersionUID=Optional[1L]
