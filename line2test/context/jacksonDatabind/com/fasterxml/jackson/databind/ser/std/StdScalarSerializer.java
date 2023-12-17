protected StdScalarSerializer(Class<T> t)
protected StdScalarSerializer(Class<?> t, boolean dummy)
public void serializeWithType(T value, JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonGenerationException
public JsonNode getSchema(SerializerProvider provider, Type typeHint) throws JsonMappingException
public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException
