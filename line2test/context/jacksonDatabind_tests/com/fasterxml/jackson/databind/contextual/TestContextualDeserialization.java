public StringValue(String v)
public ContextualCtorBean(@Name("CtorA") @JsonProperty("a") StringValue a, @Name("CtorB") @JsonProperty("b") StringValue b)
public MyContextualDeserializer()
public MyContextualDeserializer(String fieldName)
public AnnotatedContextualDeserializer()
public AnnotatedContextualDeserializer(String fieldName)
public StringValue deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException
public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) throws JsonMappingException
public StringValue deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException
public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) throws JsonMappingException
public void testSimple() throws Exception
public void testSimpleWithAnnotations() throws Exception
public void testSimpleWithClassAnnotations() throws Exception
public void testAnnotatedCtor() throws Exception
public void testAnnotatedArray() throws Exception
public void testAnnotatedList() throws Exception
public void testAnnotatedMap() throws Exception
private ObjectMapper _mapperWithAnnotatedContextual()
