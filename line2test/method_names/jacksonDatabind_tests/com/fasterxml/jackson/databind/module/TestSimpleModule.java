public CustomBean(String s, int i)
public CustomBeanSerializer()
public SimpleEnumSerializer()
public BaseSerializer()
public MySimpleModule(String name, Version version)
public void serialize(CustomBean value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException
public JsonNode getSchema(SerializerProvider provider, Type typeHint) throws JsonMappingException
public CustomBean deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public void serialize(SimpleEnum value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException
public JsonNode getSchema(SerializerProvider provider, Type typeHint) throws JsonMappingException
public SimpleEnum deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public String getText()
public String getText()
public String getText()
public void serialize(Base value, JsonGenerator jgen, SerializerProvider provider) throws IOException
public String getModuleName()
public Version version()
public void setupModule(SetupContext context)
public void testWithoutModule()
public void testSimpleBeanSerializer() throws Exception
public void testSimpleEnumSerializer() throws Exception
public void testSimpleInterfaceSerializer() throws Exception
public void testSimpleBeanDeserializer() throws Exception
public void testSimpleEnumDeserializer() throws Exception
public void testMultipleModules() throws Exception
public void testMixIns() throws Exception
public void testAccessToMapper() throws Exception
