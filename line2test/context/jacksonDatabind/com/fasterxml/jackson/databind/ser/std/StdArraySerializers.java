protected StdArraySerializers()
protected TypedPrimitiveArraySerializer(Class<T> cls)
protected TypedPrimitiveArraySerializer(TypedPrimitiveArraySerializer<T> src, BeanProperty prop, TypeSerializer vts)
public BooleanArraySerializer()
public ByteArraySerializer()
public ShortArraySerializer()
public ShortArraySerializer(ShortArraySerializer src, BeanProperty prop, TypeSerializer vts)
public CharArraySerializer()
public IntArraySerializer()
public LongArraySerializer()
public LongArraySerializer(LongArraySerializer src, BeanProperty prop, TypeSerializer vts)
public FloatArraySerializer()
public FloatArraySerializer(FloatArraySerializer src, BeanProperty prop, TypeSerializer vts)
public DoubleArraySerializer()
public static JsonSerializer<?> findStandardImpl(Class<?> cls)
public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer vts)
public JavaType getContentType()
public JsonSerializer<?> getContentSerializer()
public boolean isEmpty(boolean[] value)
public boolean hasSingleElement(boolean[] value)
public void serializeContents(boolean[] value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public JsonNode getSchema(SerializerProvider provider, Type typeHint)
public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException
public boolean isEmpty(byte[] value)
public void serialize(byte[] value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public void serializeWithType(byte[] value, JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonGenerationException
public JsonNode getSchema(SerializerProvider provider, Type typeHint)
public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException
public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer vts)
public JavaType getContentType()
public JsonSerializer<?> getContentSerializer()
public boolean isEmpty(short[] value)
public boolean hasSingleElement(short[] value)
public void serializeContents(short[] value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public JsonNode getSchema(SerializerProvider provider, Type typeHint)
public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException
public boolean isEmpty(char[] value)
public void serialize(char[] value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public void serializeWithType(char[] value, JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonGenerationException
private final void _writeArrayContents(JsonGenerator jgen, char[] value) throws IOException, JsonGenerationException
public JsonNode getSchema(SerializerProvider provider, Type typeHint)
public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException
public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer vts)
public JavaType getContentType()
public JsonSerializer<?> getContentSerializer()
public boolean isEmpty(int[] value)
public boolean hasSingleElement(int[] value)
public void serializeContents(int[] value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public JsonNode getSchema(SerializerProvider provider, Type typeHint)
public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException
public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer vts)
public JavaType getContentType()
public JsonSerializer<?> getContentSerializer()
public boolean isEmpty(long[] value)
public boolean hasSingleElement(long[] value)
public void serializeContents(long[] value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public JsonNode getSchema(SerializerProvider provider, Type typeHint)
public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException
public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer vts)
public JavaType getContentType()
public JsonSerializer<?> getContentSerializer()
public boolean isEmpty(float[] value)
public boolean hasSingleElement(float[] value)
public void serializeContents(float[] value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public JsonNode getSchema(SerializerProvider provider, Type typeHint)
public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException
public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer vts)
public JavaType getContentType()
public JsonSerializer<?> getContentSerializer()
public boolean isEmpty(double[] value)
public boolean hasSingleElement(double[] value)
public void serializeContents(double[] value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public JsonNode getSchema(SerializerProvider provider, Type typeHint)
public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException
HashMap<String, JsonSerializer<?>> _arraySerializers=Optional[new HashMap<String, JsonSerializer<?>>()]
