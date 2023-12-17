protected ObjectWriter(ObjectMapper mapper, SerializationConfig config, JavaType rootType, PrettyPrinter pp)
protected ObjectWriter(ObjectMapper mapper, SerializationConfig config)
protected ObjectWriter(ObjectMapper mapper, SerializationConfig config, FormatSchema s)
protected ObjectWriter(ObjectWriter base, SerializationConfig config, JavaType rootType, JsonSerializer<Object> rootSer, PrettyPrinter pp, FormatSchema s)
protected ObjectWriter(ObjectWriter base, SerializationConfig config)
public Version version()
public ObjectWriter with(SerializationFeature feature)
public ObjectWriter with(SerializationFeature first, SerializationFeature... other)
public ObjectWriter withFeatures(SerializationFeature... features)
public ObjectWriter without(SerializationFeature feature)
public ObjectWriter without(SerializationFeature first, SerializationFeature... other)
public ObjectWriter withoutFeatures(SerializationFeature... features)
public ObjectWriter with(DateFormat df)
public ObjectWriter withDefaultPrettyPrinter()
public ObjectWriter with(FilterProvider filterProvider)
public ObjectWriter with(PrettyPrinter pp)
public ObjectWriter withRootName(String rootName)
public ObjectWriter withSchema(FormatSchema schema)
public ObjectWriter withType(JavaType rootType)
public ObjectWriter withType(Class<?> rootType)
public ObjectWriter withType(TypeReference<?> rootType)
public ObjectWriter withView(Class<?> view)
public ObjectWriter with(Locale l)
public ObjectWriter with(TimeZone tz)
public ObjectWriter with(Base64Variant b64variant)
public boolean isEnabled(SerializationFeature f)
public boolean isEnabled(MapperFeature f)
public boolean isEnabled(JsonParser.Feature f)
public SerializationConfig getConfig()
public JsonFactory getJsonFactory()
public JsonFactory getFactory()
public TypeFactory getTypeFactory()
public boolean hasPrefetchedSerializer()
public void writeValue(JsonGenerator jgen, Object value) throws IOException, JsonGenerationException, JsonMappingException
public void writeValue(File resultFile, Object value) throws IOException, JsonGenerationException, JsonMappingException
public void writeValue(OutputStream out, Object value) throws IOException, JsonGenerationException, JsonMappingException
public void writeValue(Writer w, Object value) throws IOException, JsonGenerationException, JsonMappingException
public String writeValueAsString(Object value) throws JsonProcessingException
public byte[] writeValueAsBytes(Object value) throws JsonProcessingException
public void acceptJsonFormatVisitor(JavaType type, JsonFormatVisitorWrapper visitor) throws JsonMappingException
public boolean canSerialize(Class<?> type)
protected DefaultSerializerProvider _serializerProvider(SerializationConfig config)
protected void _verifySchemaType(FormatSchema schema)
protected final void _configAndWriteValue(JsonGenerator jgen, Object value) throws IOException, JsonGenerationException, JsonMappingException
private final void _writeCloseable(JsonGenerator jgen, Object value, SerializationConfig cfg) throws IOException, JsonGenerationException, JsonMappingException
private final void _writeCloseableValue(JsonGenerator jgen, Object value, SerializationConfig cfg) throws IOException, JsonGenerationException, JsonMappingException
protected JsonSerializer<Object> _prefetchRootSerializer(SerializationConfig config, JavaType valueType)
private void _configureJsonGenerator(JsonGenerator jgen)
long serialVersionUID=Optional[-7024829992408267532L]
PrettyPrinter NULL_PRETTY_PRINTER=Optional[new MinimalPrettyPrinter()]
SerializationConfig _config
DefaultSerializerProvider _serializerProvider
SerializerFactory _serializerFactory
JsonFactory _jsonFactory
JavaType _rootType
JsonSerializer<Object> _rootSerializer
PrettyPrinter _prettyPrinter
FormatSchema _schema
