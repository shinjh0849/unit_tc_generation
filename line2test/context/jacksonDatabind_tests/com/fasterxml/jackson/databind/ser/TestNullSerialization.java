public MyNullProvider()
public MyNullProvider(MyNullProvider base, SerializationConfig config, SerializerFactory jsf)
public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException
public DefaultSerializerProvider createInstance(SerializationConfig config, SerializerFactory jsf)
public JsonSerializer<Object> findNullValueSerializer(BeanProperty property) throws JsonMappingException
public void testSimple() throws Exception
public void testOverriddenDefaultNulls() throws Exception
public void testCustomNulls() throws Exception
