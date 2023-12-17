public FailingDeserializer(String m) { [EOL]     super(Object.class); [EOL]     _message = m; [EOL] } <line_num>: 20,23
@Override [EOL] public Object deserialize(JsonParser jp, DeserializationContext ctxt) throws JsonMappingException { [EOL]     throw ctxt.mappingException(_message); [EOL] } <line_num>: 25,30
