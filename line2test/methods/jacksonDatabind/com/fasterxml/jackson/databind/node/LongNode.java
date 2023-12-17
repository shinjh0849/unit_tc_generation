public LongNode(long v) { [EOL]     _value = v; [EOL] } <line_num>: 26,26
public static LongNode valueOf(long l) { [EOL]     return new LongNode(l); [EOL] } <line_num>: 28,28
@Override [EOL] public JsonToken asToken() { [EOL]     return JsonToken.VALUE_NUMBER_INT; [EOL] } <line_num>: 36,36
@Override [EOL] public JsonParser.NumberType numberType() { [EOL]     return JsonParser.NumberType.LONG; [EOL] } <line_num>: 38,39
@Override [EOL] public boolean isIntegralNumber() { [EOL]     return true; [EOL] } <line_num>: 42,43
@Override [EOL] public boolean isLong() { [EOL]     return true; [EOL] } <line_num>: 45,46
@Override [EOL] public boolean canConvertToInt() { [EOL]     return (_value >= Integer.MIN_VALUE && _value <= Integer.MAX_VALUE); [EOL] } <line_num>: 48,50
@Override [EOL] public boolean canConvertToLong() { [EOL]     return true; [EOL] } <line_num>: 51,51
@Override [EOL] public Number numberValue() { [EOL]     return Long.valueOf(_value); [EOL] } <line_num>: 53,56
@Override [EOL] public short shortValue() { [EOL]     return (short) _value; [EOL] } <line_num>: 58,59
@Override [EOL] public int intValue() { [EOL]     return (int) _value; [EOL] } <line_num>: 61,62
@Override [EOL] public long longValue() { [EOL]     return _value; [EOL] } <line_num>: 64,65
@Override [EOL] public float floatValue() { [EOL]     return _value; [EOL] } <line_num>: 67,68
@Override [EOL] public double doubleValue() { [EOL]     return _value; [EOL] } <line_num>: 70,71
@Override [EOL] public BigDecimal decimalValue() { [EOL]     return BigDecimal.valueOf(_value); [EOL] } <line_num>: 73,74
@Override [EOL] public BigInteger bigIntegerValue() { [EOL]     return BigInteger.valueOf(_value); [EOL] } <line_num>: 76,77
@Override [EOL] public String asText() { [EOL]     return NumberOutput.toString(_value); [EOL] } <line_num>: 79,82
@Override [EOL] public boolean asBoolean(boolean defaultValue) { [EOL]     return _value != 0; [EOL] } <line_num>: 84,87
@Override [EOL] public final void serialize(JsonGenerator jg, SerializerProvider provider) throws IOException, JsonProcessingException { [EOL]     jg.writeNumber(_value); [EOL] } <line_num>: 89,94
@Override [EOL] public boolean equals(Object o) { [EOL]     if (o == this) [EOL]         return true; [EOL]     if (o == null) [EOL]         return false; [EOL]     if (o.getClass() != getClass()) { [EOL]         return false; [EOL]     } [EOL]     return ((LongNode) o)._value == _value; [EOL] } <line_num>: 96,105
@Override [EOL] public int hashCode() { [EOL]     return ((int) _value) ^ (int) (_value >> 32); [EOL] } <line_num>: 107,110
