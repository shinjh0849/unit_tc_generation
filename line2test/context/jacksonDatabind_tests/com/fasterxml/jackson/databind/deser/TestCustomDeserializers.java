public DummyDeserializer(T v, Class<T> cls)
public CustomBean(int a, int b)
public Immutable(int x0, int y0)
public CustomKey(int id)
public Model(@JsonProperty("map") @JsonDeserialize(keyUsing = CustomKeyDeserializer.class) Map<CustomKey, String> map)
public T deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public CustomBean deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException
public int getId()
public Map<CustomKey, String> getMap()
public void serialize(CustomKey value, JsonGenerator jgen, SerializerProvider provider) throws IOException
public CustomKey deserializeKey(String key, DeserializationContext ctxt) throws IOException
public void testCustomBeanDeserializer() throws Exception
public Immutable convert(JsonNode value)
public void testDelegating() throws Exception
public void testIssue882() throws Exception
ObjectMapper MAPPER=Optional[new ObjectMapper()]
