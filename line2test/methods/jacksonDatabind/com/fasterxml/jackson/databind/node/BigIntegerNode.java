public BigIntegerNode(BigInteger v) { [EOL]     _value = v; [EOL] } <line_num>: 29,29
public static BigIntegerNode valueOf(BigInteger v) { [EOL]     return new BigIntegerNode(v); [EOL] } <line_num>: 31,31
@Override [EOL] public JsonToken asToken() { [EOL]     return JsonToken.VALUE_NUMBER_INT; [EOL] } <line_num>: 39,40
@Override [EOL] public JsonParser.NumberType numberType() { [EOL]     return JsonParser.NumberType.BIG_INTEGER; [EOL] } <line_num>: 42,43
@Override [EOL] public boolean isIntegralNumber() { [EOL]     return true; [EOL] } <line_num>: 45,46
@Override [EOL] public boolean isBigInteger() { [EOL]     return true; [EOL] } <line_num>: 48,49
@Override [EOL] public boolean canConvertToInt() { [EOL]     return (_value.compareTo(MIN_INTEGER) >= 0) && (_value.compareTo(MAX_INTEGER) <= 0); [EOL] } <line_num>: 51,53
@Override [EOL] public boolean canConvertToLong() { [EOL]     return (_value.compareTo(MIN_LONG) >= 0) && (_value.compareTo(MAX_LONG) <= 0); [EOL] } <line_num>: 54,56
@Override [EOL] public Number numberValue() { [EOL]     return _value; [EOL] } <line_num>: 58,61
@Override [EOL] public short shortValue() { [EOL]     return _value.shortValue(); [EOL] } <line_num>: 63,64
@Override [EOL] public int intValue() { [EOL]     return _value.intValue(); [EOL] } <line_num>: 66,67
@Override [EOL] public long longValue() { [EOL]     return _value.longValue(); [EOL] } <line_num>: 69,70
@Override [EOL] public BigInteger bigIntegerValue() { [EOL]     return _value; [EOL] } <line_num>: 72,73
@Override [EOL] public float floatValue() { [EOL]     return _value.floatValue(); [EOL] } <line_num>: 75,76
@Override [EOL] public double doubleValue() { [EOL]     return _value.doubleValue(); [EOL] } <line_num>: 78,79
@Override [EOL] public BigDecimal decimalValue() { [EOL]     return new BigDecimal(_value); [EOL] } <line_num>: 81,82
@Override [EOL] public String asText() { [EOL]     return _value.toString(); [EOL] } <line_num>: 90,93
@Override [EOL] public boolean asBoolean(boolean defaultValue) { [EOL]     return !BigInteger.ZERO.equals(_value); [EOL] } <line_num>: 95,98
@Override [EOL] public final void serialize(JsonGenerator jg, SerializerProvider provider) throws IOException, JsonProcessingException { [EOL]     jg.writeNumber(_value); [EOL] } <line_num>: 100,105
@Override [EOL] public boolean equals(Object o) { [EOL]     if (o == this) [EOL]         return true; [EOL]     if (o == null) [EOL]         return false; [EOL]     if (o.getClass() != getClass()) { [EOL]         return false; [EOL]     } [EOL]     return ((BigIntegerNode) o)._value.equals(_value); [EOL] } <line_num>: 107,116
@Override [EOL] public int hashCode() { [EOL]     return _value.hashCode(); [EOL] } <line_num>: 118,121
