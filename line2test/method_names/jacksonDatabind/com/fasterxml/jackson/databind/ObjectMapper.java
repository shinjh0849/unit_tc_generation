public DefaultTypeResolverBuilder(DefaultTyping t)
public ObjectMapper()
public ObjectMapper(JsonFactory jf)
protected ObjectMapper(ObjectMapper src)
public ObjectMapper(JsonFactory jf, DefaultSerializerProvider sp, DefaultDeserializationContext dc)
public TypeDeserializer buildTypeDeserializer(DeserializationConfig config, JavaType baseType, Collection<NamedType> subtypes)
public TypeSerializer buildTypeSerializer(SerializationConfig config, JavaType baseType, Collection<NamedType> subtypes)
public boolean useForType(JavaType t)
public ObjectMapper copy()
protected void _checkInvalidCopy(Class<?> exp)
public Version version()
public Version getMapperVersion()
public C getOwner()
public TypeFactory getTypeFactory()
public boolean isEnabled(MapperFeature f)
public boolean isEnabled(DeserializationFeature f)
public boolean isEnabled(SerializationFeature f)
public boolean isEnabled(JsonFactory.Feature f)
public boolean isEnabled(JsonParser.Feature f)
public boolean isEnabled(JsonGenerator.Feature f)
public void addDeserializers(Deserializers d)
public void addKeyDeserializers(KeyDeserializers d)
public void addBeanDeserializerModifier(BeanDeserializerModifier modifier)
public void addSerializers(Serializers s)
public void addKeySerializers(Serializers s)
public void addBeanSerializerModifier(BeanSerializerModifier modifier)
public void addAbstractTypeResolver(AbstractTypeResolver resolver)
public void addTypeModifier(TypeModifier modifier)
public void addValueInstantiators(ValueInstantiators instantiators)
public void setClassIntrospector(ClassIntrospector ci)
public void insertAnnotationIntrospector(AnnotationIntrospector ai)
public void appendAnnotationIntrospector(AnnotationIntrospector ai)
public void registerSubtypes(Class<?>... subtypes)
public void registerSubtypes(NamedType... subtypes)
public void setMixInAnnotations(Class<?> target, Class<?> mixinSource)
public void addDeserializationProblemHandler(DeserializationProblemHandler handler)
public ObjectMapper registerModule(Module module)
public ObjectMapper registerModules(Module... modules)
public ObjectMapper registerModules(Iterable<Module> modules)
public static List<Module> findModules()
public static List<Module> findModules(ClassLoader classLoader)
public ObjectMapper findAndRegisterModules()
public SerializationConfig getSerializationConfig()
public DeserializationConfig getDeserializationConfig()
public DeserializationContext getDeserializationContext()
public ObjectMapper setSerializerFactory(SerializerFactory f)
public SerializerFactory getSerializerFactory()
public ObjectMapper setSerializerProvider(DefaultSerializerProvider p)
public SerializerProvider getSerializerProvider()
public final void setMixInAnnotations(Map<Class<?>, Class<?>> sourceMixins)
public final void addMixInAnnotations(Class<?> target, Class<?> mixinSource)
public final Class<?> findMixInClassFor(Class<?> cls)
public final int mixInCount()
public VisibilityChecker<?> getVisibilityChecker()
public void setVisibilityChecker(VisibilityChecker<?> vc)
public ObjectMapper setVisibility(PropertyAccessor forMethod, JsonAutoDetect.Visibility visibility)
public SubtypeResolver getSubtypeResolver()
public ObjectMapper setSubtypeResolver(SubtypeResolver str)
public ObjectMapper setAnnotationIntrospector(AnnotationIntrospector ai)
public ObjectMapper setAnnotationIntrospectors(AnnotationIntrospector serializerAI, AnnotationIntrospector deserializerAI)
public ObjectMapper setPropertyNamingStrategy(PropertyNamingStrategy s)
public ObjectMapper setSerializationInclusion(JsonInclude.Include incl)
public ObjectMapper enableDefaultTyping()
public ObjectMapper enableDefaultTyping(DefaultTyping dti)
public ObjectMapper enableDefaultTyping(DefaultTyping applicability, JsonTypeInfo.As includeAs)
public ObjectMapper enableDefaultTypingAsProperty(DefaultTyping applicability, String propertyName)
public ObjectMapper disableDefaultTyping()
public ObjectMapper setDefaultTyping(TypeResolverBuilder<?> typer)
public void registerSubtypes(Class<?>... classes)
public void registerSubtypes(NamedType... types)
public TypeFactory getTypeFactory()
public ObjectMapper setTypeFactory(TypeFactory f)
public JavaType constructType(Type t)
public ObjectMapper setNodeFactory(JsonNodeFactory f)
public ObjectMapper addHandler(DeserializationProblemHandler h)
public ObjectMapper clearProblemHandlers()
public void setFilters(FilterProvider filterProvider)
public ObjectMapper setBase64Variant(Base64Variant v)
public JsonFactory getFactory()
public JsonFactory getJsonFactory()
public ObjectMapper setDateFormat(DateFormat dateFormat)
public Object setHandlerInstantiator(HandlerInstantiator hi)
public ObjectMapper setInjectableValues(InjectableValues injectableValues)
public ObjectMapper setLocale(Locale l)
public ObjectMapper setTimeZone(TimeZone tz)
public ObjectMapper configure(MapperFeature f, boolean state)
public ObjectMapper configure(SerializationFeature f, boolean state)
public ObjectMapper configure(DeserializationFeature f, boolean state)
public ObjectMapper configure(JsonParser.Feature f, boolean state)
public ObjectMapper configure(JsonGenerator.Feature f, boolean state)
public ObjectMapper enable(MapperFeature... f)
public ObjectMapper disable(MapperFeature... f)
public ObjectMapper enable(DeserializationFeature feature)
public ObjectMapper enable(DeserializationFeature first, DeserializationFeature... f)
public ObjectMapper disable(DeserializationFeature feature)
public ObjectMapper disable(DeserializationFeature first, DeserializationFeature... f)
public ObjectMapper enable(SerializationFeature f)
public ObjectMapper enable(SerializationFeature first, SerializationFeature... f)
public ObjectMapper disable(SerializationFeature f)
public ObjectMapper disable(SerializationFeature first, SerializationFeature... f)
public boolean isEnabled(MapperFeature f)
public boolean isEnabled(SerializationFeature f)
public boolean isEnabled(DeserializationFeature f)
public boolean isEnabled(JsonFactory.Feature f)
public boolean isEnabled(JsonParser.Feature f)
public boolean isEnabled(JsonGenerator.Feature f)
public JsonNodeFactory getNodeFactory()
public T readValue(JsonParser jp, Class<T> valueType) throws IOException, JsonParseException, JsonMappingException
public T readValue(JsonParser jp, TypeReference<?> valueTypeRef) throws IOException, JsonParseException, JsonMappingException
public final T readValue(JsonParser jp, ResolvedType valueType) throws IOException, JsonParseException, JsonMappingException
public T readValue(JsonParser jp, JavaType valueType) throws IOException, JsonParseException, JsonMappingException
public T readTree(JsonParser jp) throws IOException, JsonProcessingException
public MappingIterator<T> readValues(JsonParser jp, ResolvedType valueType) throws IOException, JsonProcessingException
public MappingIterator<T> readValues(JsonParser jp, JavaType valueType) throws IOException, JsonProcessingException
public MappingIterator<T> readValues(JsonParser jp, Class<T> valueType) throws IOException, JsonProcessingException
public MappingIterator<T> readValues(JsonParser jp, TypeReference<?> valueTypeRef) throws IOException, JsonProcessingException
public JsonNode readTree(InputStream in) throws IOException, JsonProcessingException
public JsonNode readTree(Reader r) throws IOException, JsonProcessingException
public JsonNode readTree(String content) throws IOException, JsonProcessingException
public JsonNode readTree(byte[] content) throws IOException, JsonProcessingException
public JsonNode readTree(File file) throws IOException, JsonProcessingException
public JsonNode readTree(URL source) throws IOException, JsonProcessingException
public void writeValue(JsonGenerator jgen, Object value) throws IOException, JsonGenerationException, JsonMappingException
public void writeTree(JsonGenerator jgen, JsonNode rootNode) throws IOException, JsonProcessingException
public ObjectNode createObjectNode()
public ArrayNode createArrayNode()
public JsonParser treeAsTokens(TreeNode n)
public T treeToValue(TreeNode n, Class<T> valueType) throws JsonProcessingException
public T valueToTree(Object fromValue) throws IllegalArgumentException
public boolean canSerialize(Class<?> type)
public boolean canDeserialize(JavaType type)
public T readValue(File src, Class<T> valueType) throws IOException, JsonParseException, JsonMappingException
public T readValue(File src, TypeReference valueTypeRef) throws IOException, JsonParseException, JsonMappingException
public T readValue(File src, JavaType valueType) throws IOException, JsonParseException, JsonMappingException
public T readValue(URL src, Class<T> valueType) throws IOException, JsonParseException, JsonMappingException
public T readValue(URL src, TypeReference valueTypeRef) throws IOException, JsonParseException, JsonMappingException
public T readValue(URL src, JavaType valueType) throws IOException, JsonParseException, JsonMappingException
public T readValue(String content, Class<T> valueType) throws IOException, JsonParseException, JsonMappingException
public T readValue(String content, TypeReference valueTypeRef) throws IOException, JsonParseException, JsonMappingException
public T readValue(String content, JavaType valueType) throws IOException, JsonParseException, JsonMappingException
public T readValue(Reader src, Class<T> valueType) throws IOException, JsonParseException, JsonMappingException
public T readValue(Reader src, TypeReference valueTypeRef) throws IOException, JsonParseException, JsonMappingException
public T readValue(Reader src, JavaType valueType) throws IOException, JsonParseException, JsonMappingException
public T readValue(InputStream src, Class<T> valueType) throws IOException, JsonParseException, JsonMappingException
public T readValue(InputStream src, TypeReference valueTypeRef) throws IOException, JsonParseException, JsonMappingException
public T readValue(InputStream src, JavaType valueType) throws IOException, JsonParseException, JsonMappingException
public T readValue(byte[] src, Class<T> valueType) throws IOException, JsonParseException, JsonMappingException
public T readValue(byte[] src, int offset, int len, Class<T> valueType) throws IOException, JsonParseException, JsonMappingException
public T readValue(byte[] src, TypeReference valueTypeRef) throws IOException, JsonParseException, JsonMappingException
public T readValue(byte[] src, int offset, int len, TypeReference valueTypeRef) throws IOException, JsonParseException, JsonMappingException
public T readValue(byte[] src, JavaType valueType) throws IOException, JsonParseException, JsonMappingException
public T readValue(byte[] src, int offset, int len, JavaType valueType) throws IOException, JsonParseException, JsonMappingException
public void writeValue(File resultFile, Object value) throws IOException, JsonGenerationException, JsonMappingException
public void writeValue(OutputStream out, Object value) throws IOException, JsonGenerationException, JsonMappingException
public void writeValue(Writer w, Object value) throws IOException, JsonGenerationException, JsonMappingException
public String writeValueAsString(Object value) throws JsonProcessingException
public byte[] writeValueAsBytes(Object value) throws JsonProcessingException
public ObjectWriter writer()
public ObjectWriter writer(SerializationFeature feature)
public ObjectWriter writer(SerializationFeature first, SerializationFeature... other)
public ObjectWriter writer(DateFormat df)
public ObjectWriter writerWithView(Class<?> serializationView)
public ObjectWriter writerWithType(Class<?> rootType)
public ObjectWriter writerWithType(TypeReference<?> rootType)
public ObjectWriter writerWithType(JavaType rootType)
public ObjectWriter writer(PrettyPrinter pp)
public ObjectWriter writerWithDefaultPrettyPrinter()
public ObjectWriter writer(FilterProvider filterProvider)
public ObjectWriter writer(FormatSchema schema)
public ObjectWriter writer(Base64Variant defaultBase64)
public ObjectReader reader()
public ObjectReader reader(DeserializationFeature feature)
public ObjectReader reader(DeserializationFeature first, DeserializationFeature... other)
public ObjectReader readerForUpdating(Object valueToUpdate)
public ObjectReader reader(JavaType type)
public ObjectReader reader(Class<?> type)
public ObjectReader reader(TypeReference<?> type)
public ObjectReader reader(JsonNodeFactory f)
public ObjectReader reader(FormatSchema schema)
public ObjectReader reader(InjectableValues injectableValues)
public ObjectReader readerWithView(Class<?> view)
public ObjectReader reader(Base64Variant defaultBase64)
public T convertValue(Object fromValue, Class<T> toValueType) throws IllegalArgumentException
public T convertValue(Object fromValue, TypeReference<?> toValueTypeRef) throws IllegalArgumentException
public T convertValue(Object fromValue, JavaType toValueType) throws IllegalArgumentException
protected Object _convert(Object fromValue, JavaType toValueType) throws IllegalArgumentException
public com.fasterxml.jackson.databind.jsonschema.JsonSchema generateJsonSchema(Class<?> t) throws JsonMappingException
public void acceptJsonFormatVisitor(Class<?> type, JsonFormatVisitorWrapper visitor) throws JsonMappingException
public void acceptJsonFormatVisitor(JavaType type, JsonFormatVisitorWrapper visitor) throws JsonMappingException
protected DefaultSerializerProvider _serializerProvider(SerializationConfig config)
protected PrettyPrinter _defaultPrettyPrinter()
protected final void _configAndWriteValue(JsonGenerator jgen, Object value) throws IOException, JsonGenerationException, JsonMappingException
protected final void _configAndWriteValue(JsonGenerator jgen, Object value, Class<?> viewClass) throws IOException, JsonGenerationException, JsonMappingException
private final void _configAndWriteCloseable(JsonGenerator jgen, Object value, SerializationConfig cfg) throws IOException, JsonGenerationException, JsonMappingException
private final void _writeCloseableValue(JsonGenerator jgen, Object value, SerializationConfig cfg) throws IOException, JsonGenerationException, JsonMappingException
protected DefaultDeserializationContext createDeserializationContext(JsonParser jp, DeserializationConfig cfg)
protected Object _readValue(DeserializationConfig cfg, JsonParser jp, JavaType valueType) throws IOException, JsonParseException, JsonMappingException
protected Object _readMapAndClose(JsonParser jp, JavaType valueType) throws IOException, JsonParseException, JsonMappingException
protected JsonToken _initForReading(JsonParser jp) throws IOException, JsonParseException, JsonMappingException
protected Object _unwrapAndDeserialize(JsonParser jp, DeserializationContext ctxt, DeserializationConfig config, JavaType rootType, JsonDeserializer<Object> deser) throws IOException, JsonParseException, JsonMappingException
protected JsonDeserializer<Object> _findRootDeserializer(DeserializationContext ctxt, JavaType valueType) throws JsonMappingException
protected void _verifySchemaType(FormatSchema schema)
