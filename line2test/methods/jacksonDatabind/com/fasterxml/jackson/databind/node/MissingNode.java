private MissingNode() { [EOL] } <line_num>: 28,28
@SuppressWarnings("unchecked") [EOL] @Override [EOL] public <T extends JsonNode> T deepCopy() { [EOL]     return (T) this; [EOL] } <line_num>: 31,33
public static MissingNode getInstance() { [EOL]     return instance; [EOL] } <line_num>: 35,35
@Override [EOL] public JsonNodeType getNodeType() { [EOL]     return JsonNodeType.MISSING; [EOL] } <line_num>: 37,41
@Override [EOL] public JsonToken asToken() { [EOL]     return JsonToken.NOT_AVAILABLE; [EOL] } <line_num>: 43,43
@Override [EOL] public String asText() { [EOL]     return ""; [EOL] } <line_num>: 45,46
@Override [EOL] public final void serialize(JsonGenerator jg, SerializerProvider provider) throws IOException, JsonProcessingException { [EOL]     jg.writeNull(); [EOL] } <line_num>: 57,68
@Override [EOL] public void serializeWithType(JsonGenerator jg, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonProcessingException { [EOL]     jg.writeNull(); [EOL] } <line_num>: 70,76
@Override [EOL] public boolean equals(Object o) { [EOL]     return (o == this); [EOL] } <line_num>: 78,90
@Override [EOL] public String toString() { [EOL]     return ""; [EOL] } <line_num>: 92,97
