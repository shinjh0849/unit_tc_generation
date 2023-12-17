public POJONode(Object v) { [EOL]     _value = v; [EOL] } <line_num>: 19,19
@Override [EOL] public JsonNodeType getNodeType() { [EOL]     return JsonNodeType.POJO; [EOL] } <line_num>: 27,31
@Override [EOL] public JsonToken asToken() { [EOL]     return JsonToken.VALUE_EMBEDDED_OBJECT; [EOL] } <line_num>: 33,33
@Override [EOL] public byte[] binaryValue() throws IOException { [EOL]     if (_value instanceof byte[]) { [EOL]         return (byte[]) _value; [EOL]     } [EOL]     return super.binaryValue(); [EOL] } <line_num>: 40,47
@Override [EOL] public String asText() { [EOL]     return (_value == null) ? "null" : _value.toString(); [EOL] } <line_num>: 55,58
@Override [EOL] public boolean asBoolean(boolean defaultValue) { [EOL]     if (_value != null && _value instanceof Boolean) { [EOL]         return ((Boolean) _value).booleanValue(); [EOL]     } [EOL]     return defaultValue; [EOL] } <line_num>: 60,67
@Override [EOL] public int asInt(int defaultValue) { [EOL]     if (_value instanceof Number) { [EOL]         return ((Number) _value).intValue(); [EOL]     } [EOL]     return defaultValue; [EOL] } <line_num>: 69,76
@Override [EOL] public long asLong(long defaultValue) { [EOL]     if (_value instanceof Number) { [EOL]         return ((Number) _value).longValue(); [EOL]     } [EOL]     return defaultValue; [EOL] } <line_num>: 78,85
@Override [EOL] public double asDouble(double defaultValue) { [EOL]     if (_value instanceof Number) { [EOL]         return ((Number) _value).doubleValue(); [EOL]     } [EOL]     return defaultValue; [EOL] } <line_num>: 87,94
@Override [EOL] public final void serialize(JsonGenerator jg, SerializerProvider provider) throws IOException, JsonProcessingException { [EOL]     if (_value == null) { [EOL]         jg.writeNull(); [EOL]     } else { [EOL]         jg.writeObject(_value); [EOL]     } [EOL] } <line_num>: 102,111
public Object getPojo() { [EOL]     return _value; [EOL] } <line_num>: 122,122
@Override [EOL] public boolean equals(Object o) { [EOL]     if (o == this) [EOL]         return true; [EOL]     if (o == null) [EOL]         return false; [EOL]     if (o.getClass() != getClass()) { [EOL]         return false; [EOL]     } [EOL]     POJONode other = (POJONode) o; [EOL]     if (_value == null) { [EOL]         return other._value == null; [EOL]     } [EOL]     return _value.equals(other._value); [EOL] } <line_num>: 130,143
@Override [EOL] public int hashCode() { [EOL]     return _value.hashCode(); [EOL] } <line_num>: 145,146
@Override [EOL] public String toString() { [EOL]     return String.valueOf(_value); [EOL] } <line_num>: 148,152
