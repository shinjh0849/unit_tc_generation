protected BaseJsonNode() { [EOL] } <line_num>: 22,22
@Override [EOL] public final JsonNode findPath(String fieldName) { [EOL]     JsonNode value = findValue(fieldName); [EOL]     if (value == null) { [EOL]         return MissingNode.getInstance(); [EOL]     } [EOL]     return value; [EOL] } <line_num>: 30,38
@Override [EOL] public JsonParser traverse() { [EOL]     return new TreeTraversingParser(this); [EOL] } <line_num>: 46,49
@Override [EOL] public JsonParser traverse(ObjectCodec codec) { [EOL]     return new TreeTraversingParser(this, codec); [EOL] } <line_num>: 51,54
@Override [EOL] public abstract JsonToken asToken(); <line_num>: 63,64
@Override [EOL] public JsonParser.NumberType numberType() { [EOL]     return null; [EOL] } <line_num>: 70,74
@Override [EOL] public abstract void serialize(JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException; <line_num>: 85,87
@Override [EOL] public abstract void serializeWithType(JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonProcessingException; <line_num>: 93,96
