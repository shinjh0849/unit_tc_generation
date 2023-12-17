private NullSerializer() { [EOL]     super(Object.class); [EOL] } <line_num>: 25,25
@Override [EOL] public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException { [EOL]     jgen.writeNull(); [EOL] } <line_num>: 27,32
@Override [EOL] public JsonNode getSchema(SerializerProvider provider, Type typeHint) throws JsonMappingException { [EOL]     return createSchemaNode("null"); [EOL] } <line_num>: 34,39
@Override [EOL] public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException { [EOL]     visitor.expectNullFormat(typeHint); [EOL] } <line_num>: 41,46
