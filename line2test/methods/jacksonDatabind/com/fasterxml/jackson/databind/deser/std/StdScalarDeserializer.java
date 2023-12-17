protected StdScalarDeserializer(Class<?> vc) { [EOL]     super(vc); [EOL] } <line_num>: 19,21
protected StdScalarDeserializer(JavaType valueType) { [EOL]     super(valueType); [EOL] } <line_num>: 23,25
@Override [EOL] public Object deserializeWithType(JsonParser jp, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException, JsonProcessingException { [EOL]     return typeDeserializer.deserializeTypedFromScalar(jp, ctxt); [EOL] } <line_num>: 27,33
