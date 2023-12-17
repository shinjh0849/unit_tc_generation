public ShortNode(short v) { [EOL]     _value = v; [EOL] } <line_num>: 26,26
public static ShortNode valueOf(short l) { [EOL]     return new ShortNode(l); [EOL] } <line_num>: 28,28
@Override [EOL] public JsonToken asToken() { [EOL]     return JsonToken.VALUE_NUMBER_INT; [EOL] } <line_num>: 36,36
@Override [EOL] public JsonParser.NumberType numberType() { [EOL]     return JsonParser.NumberType.INT; [EOL] } <line_num>: 38,39
@Override [EOL] public boolean isIntegralNumber() { [EOL]     return true; [EOL] } <line_num>: 42,43
@Override [EOL] public boolean isShort() { [EOL]     return true; [EOL] } <line_num>: 45,46
@Override [EOL] public boolean canConvertToInt() { [EOL]     return true; [EOL] } <line_num>: 48,48
@Override [EOL] public boolean canConvertToLong() { [EOL]     return true; [EOL] } <line_num>: 49,49
@Override [EOL] public Number numberValue() { [EOL]     return Short.valueOf(_value); [EOL] } <line_num>: 51,54
@Override [EOL] public short shortValue() { [EOL]     return _value; [EOL] } <line_num>: 56,57
@Override [EOL] public int intValue() { [EOL]     return _value; [EOL] } <line_num>: 59,60
@Override [EOL] public long longValue() { [EOL]     return _value; [EOL] } <line_num>: 62,63
@Override [EOL] public float floatValue() { [EOL]     return _value; [EOL] } <line_num>: 65,66
@Override [EOL] public double doubleValue() { [EOL]     return _value; [EOL] } <line_num>: 68,69
@Override [EOL] public BigDecimal decimalValue() { [EOL]     return BigDecimal.valueOf(_value); [EOL] } <line_num>: 71,72
@Override [EOL] public BigInteger bigIntegerValue() { [EOL]     return BigInteger.valueOf(_value); [EOL] } <line_num>: 74,75
@Override [EOL] public String asText() { [EOL]     return NumberOutput.toString(_value); [EOL] } <line_num>: 77,80
@Override [EOL] public boolean asBoolean(boolean defaultValue) { [EOL]     return _value != 0; [EOL] } <line_num>: 82,85
@Override [EOL] public final void serialize(JsonGenerator jg, SerializerProvider provider) throws IOException, JsonProcessingException { [EOL]     jg.writeNumber(_value); [EOL] } <line_num>: 87,92
@Override [EOL] public boolean equals(Object o) { [EOL]     if (o == this) [EOL]         return true; [EOL]     if (o == null) [EOL]         return false; [EOL]     if (o.getClass() != getClass()) { [EOL]         return false; [EOL]     } [EOL]     return ((ShortNode) o)._value == _value; [EOL] } <line_num>: 94,103
@Override [EOL] public int hashCode() { [EOL]     return _value; [EOL] } <line_num>: 105,108
