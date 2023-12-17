public StringSerializer() { [EOL]     super(String.class); [EOL] } <line_num>: 25,25
@Override [EOL] public boolean isEmpty(String value) { [EOL]     return (value == null) || (value.length() == 0); [EOL] } <line_num>: 30,33
@Override [EOL] public void serialize(String value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException { [EOL]     jgen.writeString(value); [EOL] } <line_num>: 35,40
@Override [EOL] public JsonNode getSchema(SerializerProvider provider, Type typeHint) { [EOL]     return createSchemaNode("string", true); [EOL] } <line_num>: 42,46
@Override [EOL] public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException { [EOL]     if (visitor != null) [EOL]         visitor.expectStringFormat(typeHint); [EOL] } <line_num>: 48,53
