protected StaticListSerializerBase(Class<?> cls) { [EOL]     super(cls, false); [EOL] } <line_num>: 21,23
@Override [EOL] public boolean isEmpty(T value) { [EOL]     return (value == null) || (value.size() == 0); [EOL] } <line_num>: 25,28
@Override [EOL] public JsonNode getSchema(SerializerProvider provider, Type typeHint) { [EOL]     ObjectNode o = createSchemaNode("array", true); [EOL]     o.put("items", contentSchema()); [EOL]     return o; [EOL] } <line_num>: 30,36
@Override [EOL] public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException { [EOL]     acceptContentVisitor(visitor.expectArrayFormat(typeHint)); [EOL] } <line_num>: 38,43
protected abstract JsonNode contentSchema(); <line_num>: 51,51
protected abstract void acceptContentVisitor(JsonArrayFormatVisitor visitor) throws JsonMappingException; <line_num>: 53,54
