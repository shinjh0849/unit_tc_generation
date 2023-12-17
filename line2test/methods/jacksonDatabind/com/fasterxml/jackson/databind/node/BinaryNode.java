public BinaryNode(byte[] data) { [EOL]     _data = data; [EOL] } <line_num>: 21,24
public BinaryNode(byte[] data, int offset, int length) { [EOL]     if (offset == 0 && length == data.length) { [EOL]         _data = data; [EOL]     } else { [EOL]         _data = new byte[length]; [EOL]         System.arraycopy(data, offset, _data, 0, length); [EOL]     } [EOL] } <line_num>: 26,34
public static BinaryNode valueOf(byte[] data) { [EOL]     if (data == null) { [EOL]         return null; [EOL]     } [EOL]     if (data.length == 0) { [EOL]         return EMPTY_BINARY_NODE; [EOL]     } [EOL]     return new BinaryNode(data); [EOL] } <line_num>: 36,45
public static BinaryNode valueOf(byte[] data, int offset, int length) { [EOL]     if (data == null) { [EOL]         return null; [EOL]     } [EOL]     if (length == 0) { [EOL]         return EMPTY_BINARY_NODE; [EOL]     } [EOL]     return new BinaryNode(data, offset, length); [EOL] } <line_num>: 47,56
@Override [EOL] public JsonNodeType getNodeType() { [EOL]     return JsonNodeType.BINARY; [EOL] } <line_num>: 58,62
@Override [EOL] public JsonToken asToken() { [EOL]     return JsonToken.VALUE_EMBEDDED_OBJECT; [EOL] } <line_num>: 64,71
@Override [EOL] public byte[] binaryValue() { [EOL]     return _data; [EOL] } <line_num>: 78,79
@Override [EOL] public String asText() { [EOL]     return Base64Variants.getDefaultVariant().encode(_data, false); [EOL] } <line_num>: 85,88
@Override [EOL] public final void serialize(JsonGenerator jg, SerializerProvider provider) throws IOException, JsonProcessingException { [EOL]     jg.writeBinary(provider.getConfig().getBase64Variant(), _data, 0, _data.length); [EOL] } <line_num>: 90,96
@Override [EOL] public boolean equals(Object o) { [EOL]     if (o == this) [EOL]         return true; [EOL]     if (o == null) [EOL]         return false; [EOL]     if (o.getClass() != getClass()) { [EOL]         return false; [EOL]     } [EOL]     return Arrays.equals(((BinaryNode) o)._data, _data); [EOL] } <line_num>: 98,107
@Override [EOL] public int hashCode() { [EOL]     return (_data == null) ? -1 : _data.length; [EOL] } <line_num>: 109,112
@Override [EOL] public String toString() { [EOL]     return Base64Variants.getDefaultVariant().encode(_data, true); [EOL] } <line_num>: 118,122
