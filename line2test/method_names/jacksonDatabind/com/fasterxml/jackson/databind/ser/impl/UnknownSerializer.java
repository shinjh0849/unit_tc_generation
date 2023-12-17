public UnknownSerializer()
public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonMappingException
public final void serializeWithType(Object value, JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonGenerationException
public JsonNode getSchema(SerializerProvider provider, Type typeHint) throws JsonMappingException
public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException
protected void failForEmpty(Object value) throws JsonMappingException
