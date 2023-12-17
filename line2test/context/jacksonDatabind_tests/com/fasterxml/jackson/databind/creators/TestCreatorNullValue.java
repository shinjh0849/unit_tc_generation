public Container(@JsonProperty("contained") Contained<String> contained)
public Contained<?> deserialize(JsonParser jp, DeserializationContext ctxt) throws JsonProcessingException
public Contained<?> getNullValue()
public JsonDeserializer<?> findBeanDeserializer(JavaType type, DeserializationConfig config, BeanDescription beanDesc) throws JsonMappingException
public String getModuleName()
public Version version()
public void setupModule(SetupContext setupContext)
public void testUsesDeserializersNullValue() throws Exception
NullContained NULL_CONTAINED=Optional[new NullContained()]
