public HashTest(@JsonProperty("bytes") @JsonDeserialize(using = BytesDeserializer.class) final byte[] bytes, @JsonProperty("type") final String type)
public Primitives(@JsonProperty("x") int x, @JsonProperty("d") double d, @JsonProperty("b") boolean b)
public Test431Container(@JsonProperty("items") final List<Item431> i)
public Item431(@JsonProperty("id") String id)
public BeanFor438(@JsonProperty("name") String s)
public MapBean(Map<String, Long> map)
public BrokenCreatorBean(@JsonProperty("bar") String bar1, @JsonProperty("bar") String bar2)
public AutoDetectConstructorBean(@JsonProperty("bar") String bar, @JsonProperty("foo") String foo)
 BustedCtor(@JsonProperty("a") String value)
public IgnoredCtor(String arg)
public IgnoredCtor()
public AbstractBaseImpl(Map<String, Object> props)
public Issue700Bean(@JsonProperty("item") String item)
public byte[] deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException
public static AbstractBase create(Map<String, Object> props)
public String getItem()
public void testExceptionFromConstructor() throws Exception
public void testSimpleConstructor() throws Exception
public void testMissingPrimitives() throws Exception
public void testJackson431() throws Exception
public void testJackson438() throws Exception
public void testIssue465() throws Exception
public void testCreatorWithDupNames() throws Exception
public void testCreatorMultipleArgumentWithoutAnnotation() throws Exception
public void testIgnoredSingleArgCtor() throws Exception
public void testAbstractFactory() throws Exception
public void testCreatorProperties() throws Exception
ObjectMapper MAPPER=Optional[new ObjectMapper()]
