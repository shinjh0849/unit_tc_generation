public UUIDDeserializer()
public URLDeserializer()
public URIDeserializer()
public CurrencyDeserializer()
public PatternDeserializer()
public LocaleDeserializer()
public InetAddressDeserializer()
public CharsetDeserializer()
public FileDeserializer()
public AtomicReferenceDeserializer(JavaType referencedType)
public AtomicReferenceDeserializer(JavaType referencedType, JsonDeserializer<?> deser)
public AtomicBooleanDeserializer()
public StackTraceElementDeserializer()
public static StdDeserializer<?>[] all()
public static JsonDeserializer<?> find(Class<?> rawType, String clsName)
protected UUID _deserialize(String value, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected UUID _deserializeEmbedded(Object ob, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected URL _deserialize(String value, DeserializationContext ctxt) throws IOException
protected URI _deserialize(String value, DeserializationContext ctxt) throws IllegalArgumentException
protected Currency _deserialize(String value, DeserializationContext ctxt) throws IllegalArgumentException
protected Pattern _deserialize(String value, DeserializationContext ctxt) throws IllegalArgumentException
protected Locale _deserialize(String value, DeserializationContext ctxt) throws IOException
protected InetAddress _deserialize(String value, DeserializationContext ctxt) throws IOException
protected Charset _deserialize(String value, DeserializationContext ctxt) throws IOException
protected File _deserialize(String value, DeserializationContext ctxt)
public AtomicReference<?> deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) throws JsonMappingException
public AtomicBoolean deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public StackTraceElement deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
HashSet<String> _classNames=Optional[new HashSet<String>()]
