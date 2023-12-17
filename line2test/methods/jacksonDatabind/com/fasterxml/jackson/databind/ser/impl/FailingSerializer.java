public FailingSerializer(String msg) { [EOL]     super(Object.class); [EOL]     _msg = msg; [EOL] } <line_num>: 27,30
@Override [EOL] public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException { [EOL]     throw new JsonGenerationException(_msg); [EOL] } <line_num>: 32,37
@Override [EOL] public JsonNode getSchema(SerializerProvider provider, Type typeHint) throws JsonMappingException { [EOL]     return null; [EOL] } <line_num>: 39,44
@Override [EOL] public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) { [EOL]     ; [EOL] } <line_num>: 46,50
