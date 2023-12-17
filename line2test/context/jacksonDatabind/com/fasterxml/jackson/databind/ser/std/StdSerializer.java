protected StdSerializer(Class<T> t)
protected StdSerializer(JavaType type)
protected StdSerializer(Class<?> t, boolean dummy)
public Class<T> handledType()
public abstract void serialize(T value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public JsonNode getSchema(SerializerProvider provider, Type typeHint) throws JsonMappingException
public JsonNode getSchema(SerializerProvider provider, Type typeHint, boolean isOptional) throws JsonMappingException
protected ObjectNode createObjectNode()
protected ObjectNode createSchemaNode(String type)
protected ObjectNode createSchemaNode(String type, boolean isOptional)
public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException
public void wrapAndThrow(SerializerProvider provider, Throwable t, Object bean, String fieldName) throws IOException
public void wrapAndThrow(SerializerProvider provider, Throwable t, Object bean, int index) throws IOException
protected boolean isDefaultSerializer(JsonSerializer<?> serializer)
protected JsonSerializer<?> findConvertingContentSerializer(SerializerProvider provider, BeanProperty prop, JsonSerializer<?> existingSerializer) throws JsonMappingException
Class<T> _handledType
