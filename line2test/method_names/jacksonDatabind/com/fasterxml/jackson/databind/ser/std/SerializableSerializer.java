protected SerializableSerializer()
public void serialize(JsonSerializable value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public final void serializeWithType(JsonSerializable value, JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonGenerationException
public JsonNode getSchema(SerializerProvider provider, Type typeHint) throws JsonMappingException
private static final synchronized ObjectMapper _getObjectMapper()
public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException
