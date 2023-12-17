@JsonCreator [EOL] public Container(@JsonProperty("contained") Contained<String> contained) { [EOL]     this.contained = contained; [EOL] } <line_num>: 16,19
@Override [EOL] public Contained<?> deserialize(JsonParser jp, DeserializationContext ctxt) throws JsonProcessingException { [EOL]     return null; [EOL] } <line_num>: 29,32
@Override [EOL] public Contained<?> getNullValue() { [EOL]     return NULL_CONTAINED; [EOL] } <line_num>: 34,37
@Override [EOL] public JsonDeserializer<?> findBeanDeserializer(JavaType type, DeserializationConfig config, BeanDescription beanDesc) throws JsonMappingException { [EOL]     if (!Contained.class.isAssignableFrom(type.getRawClass())) { [EOL]         return null; [EOL]     } else { [EOL]         return new ContainedDeserializer(); [EOL]     } [EOL] } <line_num>: 41,51
@Override [EOL] public String getModuleName() { [EOL]     return "ContainedModule"; [EOL] } <line_num>: 56,59
@Override [EOL] public Version version() { [EOL]     return Version.unknownVersion(); [EOL] } <line_num>: 61,64
@Override [EOL] public void setupModule(SetupContext setupContext) { [EOL]     setupContext.addDeserializers(new ContainerDeserializerResolver()); [EOL] } <line_num>: 66,69
public void testUsesDeserializersNullValue() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     mapper.registerModule(new TestModule()); [EOL]     Container container = mapper.readValue("{}", Container.class); [EOL]     assertEquals(NULL_CONTAINED, container.contained); [EOL] } <line_num>: 78,83
