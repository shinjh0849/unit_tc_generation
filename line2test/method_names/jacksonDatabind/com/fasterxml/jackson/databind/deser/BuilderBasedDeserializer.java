public BuilderBasedDeserializer(BeanDeserializerBuilder builder, BeanDescription beanDesc, BeanPropertyMap properties, Map<String, SettableBeanProperty> backRefs, HashSet<String> ignorableProps, boolean ignoreAllUnknown, boolean hasViews)
protected BuilderBasedDeserializer(BuilderBasedDeserializer src)
protected BuilderBasedDeserializer(BuilderBasedDeserializer src, boolean ignoreAllUnknown)
protected BuilderBasedDeserializer(BuilderBasedDeserializer src, NameTransformer unwrapper)
public BuilderBasedDeserializer(BuilderBasedDeserializer src, ObjectIdReader oir)
public BuilderBasedDeserializer(BuilderBasedDeserializer src, HashSet<String> ignorableProps)
public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer unwrapper)
public BuilderBasedDeserializer withObjectIdReader(ObjectIdReader oir)
public BuilderBasedDeserializer withIgnorableProperties(HashSet<String> ignorableProps)
protected BeanAsArrayBuilderDeserializer asArrayDeserializer()
protected final Object finishBuild(DeserializationContext ctxt, Object builder) throws IOException
public final Object deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Object deserialize(JsonParser jp, DeserializationContext ctxt, Object builder) throws IOException, JsonProcessingException
protected final Object _deserialize(JsonParser jp, DeserializationContext ctxt, Object builder) throws IOException, JsonProcessingException
private final Object vanillaDeserialize(JsonParser jp, DeserializationContext ctxt, JsonToken t) throws IOException, JsonProcessingException
public Object deserializeFromObject(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected final Object _deserializeUsingPropertyBased(final JsonParser jp, final DeserializationContext ctxt) throws IOException, JsonProcessingException
protected final Object deserializeWithView(JsonParser jp, DeserializationContext ctxt, Object bean, Class<?> activeView) throws IOException, JsonProcessingException
protected Object deserializeWithUnwrapped(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected Object deserializeWithUnwrapped(JsonParser jp, DeserializationContext ctxt, Object bean) throws IOException, JsonProcessingException
protected Object deserializeUsingPropertyBasedWithUnwrapped(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected Object deserializeWithExternalTypeId(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected Object deserializeWithExternalTypeId(JsonParser jp, DeserializationContext ctxt, Object bean) throws IOException, JsonProcessingException
protected Object deserializeUsingPropertyBasedWithExternalTypeId(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
