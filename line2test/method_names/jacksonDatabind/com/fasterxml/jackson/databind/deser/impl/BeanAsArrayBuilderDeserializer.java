public BeanAsArrayBuilderDeserializer(BeanDeserializerBase delegate, SettableBeanProperty[] ordered, AnnotatedMethod buildMethod)
public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer unwrapper)
public BeanAsArrayBuilderDeserializer withObjectIdReader(ObjectIdReader oir)
public BeanAsArrayBuilderDeserializer withIgnorableProperties(HashSet<String> ignorableProps)
protected BeanAsArrayBuilderDeserializer asArrayDeserializer()
protected final Object finishBuild(DeserializationContext ctxt, Object builder) throws IOException
public Object deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Object deserialize(JsonParser jp, DeserializationContext ctxt, Object builder) throws IOException, JsonProcessingException
public Object deserializeFromObject(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected Object _deserializeNonVanilla(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected Object _deserializeWithCreator(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected final Object _deserializeUsingPropertyBased(final JsonParser jp, final DeserializationContext ctxt) throws IOException, JsonProcessingException
protected Object _deserializeFromNonArray(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
