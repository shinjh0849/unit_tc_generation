public RawSerializer(Class<?> cls)
public void serialize(T value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public void serializeWithType(T value, JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonProcessingException
public JsonNode getSchema(SerializerProvider provider, Type typeHint)
public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException
