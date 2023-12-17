private BooleanNode(boolean v) { [EOL]     _value = v; [EOL] } <line_num>: 24,24
public static BooleanNode getTrue() { [EOL]     return TRUE; [EOL] } <line_num>: 26,26
public static BooleanNode getFalse() { [EOL]     return FALSE; [EOL] } <line_num>: 27,27
public static BooleanNode valueOf(boolean b) { [EOL]     return b ? TRUE : FALSE; [EOL] } <line_num>: 29,29
@Override [EOL] public JsonNodeType getNodeType() { [EOL]     return JsonNodeType.BOOLEAN; [EOL] } <line_num>: 31,34
@Override [EOL] public JsonToken asToken() { [EOL]     return _value ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE; [EOL] } <line_num>: 36,38
@Override [EOL] public boolean booleanValue() { [EOL]     return _value; [EOL] } <line_num>: 40,43
@Override [EOL] public String asText() { [EOL]     return _value ? "true" : "false"; [EOL] } <line_num>: 45,48
@Override [EOL] public boolean asBoolean() { [EOL]     return _value; [EOL] } <line_num>: 50,53
@Override [EOL] public boolean asBoolean(boolean defaultValue) { [EOL]     return _value; [EOL] } <line_num>: 55,58
@Override [EOL] public int asInt(int defaultValue) { [EOL]     return _value ? 1 : 0; [EOL] } <line_num>: 60,63
@Override [EOL] public long asLong(long defaultValue) { [EOL]     return _value ? 1L : 0L; [EOL] } <line_num>: 64,67
@Override [EOL] public double asDouble(double defaultValue) { [EOL]     return _value ? 1.0 : 0.0; [EOL] } <line_num>: 68,71
@Override [EOL] public final void serialize(JsonGenerator jg, SerializerProvider provider) throws IOException, JsonProcessingException { [EOL]     jg.writeBoolean(_value); [EOL] } <line_num>: 73,78
@Override [EOL] public boolean equals(Object o) { [EOL]     if (o == this) [EOL]         return true; [EOL]     if (o == null) [EOL]         return false; [EOL]     if (o.getClass() != getClass()) { [EOL]         return false; [EOL]     } [EOL]     return (_value == ((BooleanNode) o)._value); [EOL] } <line_num>: 80,93
