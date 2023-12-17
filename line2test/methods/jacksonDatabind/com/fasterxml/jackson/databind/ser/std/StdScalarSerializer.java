protected StdScalarSerializer(Class<T> t) { [EOL]     super(t); [EOL] } <line_num>: 18,20
@SuppressWarnings("unchecked") [EOL] protected StdScalarSerializer(Class<?> t, boolean dummy) { [EOL]     super((Class<T>) t); [EOL] } <line_num>: 26,29
@Override [EOL] public void serializeWithType(T value, JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonGenerationException { [EOL]     typeSer.writeTypePrefixForScalar(value, jgen); [EOL]     serialize(value, jgen, provider); [EOL]     typeSer.writeTypeSuffixForScalar(value, jgen); [EOL] } <line_num>: 38,46
@Override [EOL] public JsonNode getSchema(SerializerProvider provider, Type typeHint) throws JsonMappingException { [EOL]     return createSchemaNode("string", true); [EOL] } <line_num>: 48,53
@Override [EOL] public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException { [EOL]     visitor.expectAnyFormat(typeHint); [EOL] } <line_num>: 55,60
