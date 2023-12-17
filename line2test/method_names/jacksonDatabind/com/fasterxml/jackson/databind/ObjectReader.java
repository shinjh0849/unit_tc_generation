protected ObjectReader(ObjectMapper mapper, DeserializationConfig config)
protected ObjectReader(ObjectMapper mapper, DeserializationConfig config, JavaType valueType, Object valueToUpdate, FormatSchema schema, InjectableValues injectableValues)
protected ObjectReader(ObjectReader base, DeserializationConfig config, JavaType valueType, JsonDeserializer<Object> rootDeser, Object valueToUpdate, FormatSchema schema, InjectableValues injectableValues, DataFormatReaders dataFormatReaders)
protected ObjectReader(ObjectReader base, DeserializationConfig config)
protected ObjectReader(ObjectReader base, JsonFactory f)
public Version version()
public ObjectReader with(DeserializationConfig config)
public ObjectReader with(DeserializationFeature feature)
public ObjectReader with(DeserializationFeature first, DeserializationFeature... other)
public ObjectReader withFeatures(DeserializationFeature... features)
public ObjectReader without(DeserializationFeature feature)
public ObjectReader without(DeserializationFeature first, DeserializationFeature... other)
public ObjectReader withoutFeatures(DeserializationFeature... features)
public ObjectReader with(InjectableValues injectableValues)
public ObjectReader with(JsonNodeFactory f)
public ObjectReader with(JsonFactory f)
public ObjectReader withRootName(String rootName)
public ObjectReader with(FormatSchema schema)
public ObjectReader withType(JavaType valueType)
public ObjectReader withType(Class<?> valueType)
public ObjectReader withType(java.lang.reflect.Type valueType)
public ObjectReader withType(TypeReference<?> valueTypeRef)
public ObjectReader withValueToUpdate(Object value)
public ObjectReader withView(Class<?> activeView)
public ObjectReader with(Locale l)
public ObjectReader with(TimeZone tz)
public ObjectReader withHandler(DeserializationProblemHandler h)
public ObjectReader with(Base64Variant defaultBase64)
public ObjectReader withFormatDetection(ObjectReader... readers)
public ObjectReader withFormatDetection(DataFormatReaders readers)
public boolean isEnabled(DeserializationFeature f)
public boolean isEnabled(MapperFeature f)
public boolean isEnabled(JsonParser.Feature f)
public DeserializationConfig getConfig()
public JsonFactory getFactory()
public JsonFactory getJsonFactory()
public TypeFactory getTypeFactory()
public T readValue(JsonParser jp) throws IOException, JsonProcessingException
public T readValue(JsonParser jp, Class<T> valueType) throws IOException, JsonProcessingException
public T readValue(JsonParser jp, TypeReference<?> valueTypeRef) throws IOException, JsonProcessingException
public T readValue(JsonParser jp, ResolvedType valueType) throws IOException, JsonProcessingException
public T readValue(JsonParser jp, JavaType valueType) throws IOException, JsonProcessingException
public T readTree(JsonParser jp) throws IOException, JsonProcessingException
public Iterator<T> readValues(JsonParser jp, Class<T> valueType) throws IOException, JsonProcessingException
public Iterator<T> readValues(JsonParser jp, TypeReference<?> valueTypeRef) throws IOException, JsonProcessingException
public Iterator<T> readValues(JsonParser jp, ResolvedType valueType) throws IOException, JsonProcessingException
public Iterator<T> readValues(JsonParser jp, JavaType valueType) throws IOException, JsonProcessingException
public T readValue(InputStream src) throws IOException, JsonProcessingException
public T readValue(Reader src) throws IOException, JsonProcessingException
public T readValue(String src) throws IOException, JsonProcessingException
public T readValue(byte[] src) throws IOException, JsonProcessingException
public T readValue(byte[] src, int offset, int length) throws IOException, JsonProcessingException
public T readValue(File src) throws IOException, JsonProcessingException
public T readValue(URL src) throws IOException, JsonProcessingException
public T readValue(JsonNode src) throws IOException, JsonProcessingException
public JsonNode readTree(InputStream in) throws IOException, JsonProcessingException
public JsonNode readTree(Reader r) throws IOException, JsonProcessingException
public JsonNode readTree(String json) throws IOException, JsonProcessingException
public MappingIterator<T> readValues(JsonParser jp) throws IOException, JsonProcessingException
public MappingIterator<T> readValues(InputStream src) throws IOException, JsonProcessingException
public MappingIterator<T> readValues(Reader src) throws IOException, JsonProcessingException
public MappingIterator<T> readValues(String json) throws IOException, JsonProcessingException
public MappingIterator<T> readValues(byte[] src, int offset, int length) throws IOException, JsonProcessingException
public final MappingIterator<T> readValues(byte[] src) throws IOException, JsonProcessingException
public MappingIterator<T> readValues(File src) throws IOException, JsonProcessingException
public MappingIterator<T> readValues(URL src) throws IOException, JsonProcessingException
public JsonNode createArrayNode()
public JsonNode createObjectNode()
public JsonParser treeAsTokens(TreeNode n)
public T treeToValue(TreeNode n, Class<T> valueType) throws JsonProcessingException
public void writeValue(JsonGenerator jgen, Object value) throws IOException, JsonProcessingException
protected Object _bind(JsonParser jp, Object valueToUpdate) throws IOException, JsonParseException, JsonMappingException
protected Object _bindAndClose(JsonParser jp, Object valueToUpdate) throws IOException, JsonParseException, JsonMappingException
protected JsonNode _bindAsTree(JsonParser jp) throws IOException, JsonParseException, JsonMappingException
protected JsonNode _bindAndCloseAsTree(JsonParser jp) throws IOException, JsonParseException, JsonMappingException
protected MappingIterator<T> _bindAndReadValues(JsonParser p, Object valueToUpdate) throws IOException, JsonProcessingException
protected static JsonToken _initForReading(JsonParser jp) throws IOException, JsonParseException, JsonMappingException
protected JsonDeserializer<Object> _findRootDeserializer(DeserializationContext ctxt, JavaType valueType) throws JsonMappingException
protected JsonDeserializer<Object> _prefetchRootDeserializer(DeserializationConfig config, JavaType valueType)
protected Object _unwrapAndDeserialize(JsonParser jp, DeserializationContext ctxt, JavaType rootType, JsonDeserializer<Object> deser) throws IOException, JsonParseException, JsonMappingException
protected Object _detectBindAndClose(byte[] src, int offset, int length) throws IOException
protected Object _detectBindAndClose(DataFormatReaders.Match match, boolean forceClosing) throws IOException
protected MappingIterator<T> _detectBindAndReadValues(DataFormatReaders.Match match, boolean forceClosing) throws IOException, JsonProcessingException
protected JsonNode _detectBindAndCloseAsTree(InputStream in) throws IOException
protected void _reportUnkownFormat(DataFormatReaders detector, DataFormatReaders.Match match) throws JsonProcessingException
protected void _verifySchemaType(FormatSchema schema)
protected DefaultDeserializationContext createDeserializationContext(JsonParser jp, DeserializationConfig cfg)
protected ObjectReader _with(DeserializationConfig newConfig)
protected void _reportUndetectableSource(Object src) throws JsonProcessingException
protected InputStream _inputStream(URL src) throws IOException
protected InputStream _inputStream(File f) throws IOException
