private NullNode() { [EOL] } <line_num>: 20,20
public static NullNode getInstance() { [EOL]     return instance; [EOL] } <line_num>: 22,22
@Override [EOL] public JsonNodeType getNodeType() { [EOL]     return JsonNodeType.NULL; [EOL] } <line_num>: 24,28
@Override [EOL] public JsonToken asToken() { [EOL]     return JsonToken.VALUE_NULL; [EOL] } <line_num>: 30,30
@Override [EOL] public String asText() { [EOL]     return "null"; [EOL] } <line_num>: 32,35
@Override [EOL] public final void serialize(JsonGenerator jg, SerializerProvider provider) throws IOException, JsonProcessingException { [EOL]     jg.writeNull(); [EOL] } <line_num>: 46,51
@Override [EOL] public boolean equals(Object o) { [EOL]     return (o == this); [EOL] } <line_num>: 53,57
