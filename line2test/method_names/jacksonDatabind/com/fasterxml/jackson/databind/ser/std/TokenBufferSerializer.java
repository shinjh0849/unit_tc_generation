public TokenBufferSerializer()
public void serialize(TokenBuffer value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public final void serializeWithType(TokenBuffer value, JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonGenerationException
public JsonNode getSchema(SerializerProvider provider, Type typeHint)
public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException
