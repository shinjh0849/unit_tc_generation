public StdDelegatingSerializer(Converter<?, ?> converter)
public StdDelegatingSerializer(Class<T> cls, Converter<T, ?> converter)
public StdDelegatingSerializer(Converter<Object, ?> converter, JavaType delegateType, JsonSerializer<?> delegateSerializer)
protected StdDelegatingSerializer withDelegate(Converter<Object, ?> converter, JavaType delegateType, JsonSerializer<?> delegateSerializer)
public void resolve(SerializerProvider provider) throws JsonMappingException
public JsonSerializer<?> createContextual(SerializerProvider provider, BeanProperty property) throws JsonMappingException
protected Converter<Object, ?> getConverter()
public JsonSerializer<?> getDelegatee()
public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException
public void serializeWithType(Object value, JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonProcessingException
public boolean isEmpty(Object value)
public JsonNode getSchema(SerializerProvider provider, Type typeHint) throws JsonMappingException
public JsonNode getSchema(SerializerProvider provider, Type typeHint, boolean isOptional) throws JsonMappingException
public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException
protected Object convertValue(Object value)
