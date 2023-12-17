public ContextualKeySerializer()
public ContextualKeySerializer(String p)
protected ContextualDeser(String p)
public void serialize(String value, JsonGenerator jgen, SerializerProvider provider) throws IOException
public JsonSerializer<?> createContextual(SerializerProvider prov, BeanProperty property) throws JsonMappingException
public Object deserializeKey(String key, DeserializationContext ctxt) throws IOException, JsonProcessingException
public KeyDeserializer createContextual(DeserializationContext ctxt, BeanProperty property) throws JsonMappingException
public void testSimpleKeySer() throws Exception
public void testSimpleKeyDeser() throws Exception
