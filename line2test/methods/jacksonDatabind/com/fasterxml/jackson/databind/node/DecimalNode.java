public DecimalNode(BigDecimal v) { [EOL]     _value = v; [EOL] } <line_num>: 33,33
public static DecimalNode valueOf(BigDecimal d) { [EOL]     return new DecimalNode(d); [EOL] } <line_num>: 35,35
@Override [EOL] public JsonToken asToken() { [EOL]     return JsonToken.VALUE_NUMBER_FLOAT; [EOL] } <line_num>: 43,43
@Override [EOL] public JsonParser.NumberType numberType() { [EOL]     return JsonParser.NumberType.BIG_DECIMAL; [EOL] } <line_num>: 45,46
@Override [EOL] public boolean isFloatingPointNumber() { [EOL]     return true; [EOL] } <line_num>: 54,55
@Override [EOL] public boolean isBigDecimal() { [EOL]     return true; [EOL] } <line_num>: 57,58
@Override [EOL] public boolean canConvertToInt() { [EOL]     return (_value.compareTo(MIN_INTEGER) >= 0) && (_value.compareTo(MAX_INTEGER) <= 0); [EOL] } <line_num>: 60,62
@Override [EOL] public boolean canConvertToLong() { [EOL]     return (_value.compareTo(MIN_LONG) >= 0) && (_value.compareTo(MAX_LONG) <= 0); [EOL] } <line_num>: 63,65
@Override [EOL] public Number numberValue() { [EOL]     return _value; [EOL] } <line_num>: 67,68
@Override [EOL] public short shortValue() { [EOL]     return _value.shortValue(); [EOL] } <line_num>: 70,71
@Override [EOL] public int intValue() { [EOL]     return _value.intValue(); [EOL] } <line_num>: 73,74
@Override [EOL] public long longValue() { [EOL]     return _value.longValue(); [EOL] } <line_num>: 76,77
@Override [EOL] public BigInteger bigIntegerValue() { [EOL]     return _value.toBigInteger(); [EOL] } <line_num>: 80,81
@Override [EOL] public float floatValue() { [EOL]     return _value.floatValue(); [EOL] } <line_num>: 83,84
@Override [EOL] public double doubleValue() { [EOL]     return _value.doubleValue(); [EOL] } <line_num>: 86,87
@Override [EOL] public BigDecimal decimalValue() { [EOL]     return _value; [EOL] } <line_num>: 89,90
@Override [EOL] public String asText() { [EOL]     return _value.toString(); [EOL] } <line_num>: 92,95
@Override [EOL] public final void serialize(JsonGenerator jg, SerializerProvider provider) throws IOException, JsonProcessingException { [EOL]     jg.writeNumber(_value); [EOL] } <line_num>: 97,102
@Override [EOL] public boolean equals(Object o) { [EOL]     if (o == this) [EOL]         return true; [EOL]     if (o == null) [EOL]         return false; [EOL]     if (o.getClass() != getClass()) { [EOL]         return false; [EOL]     } [EOL]     return ((DecimalNode) o)._value.equals(_value); [EOL] } <line_num>: 104,113
@Override [EOL] public int hashCode() { [EOL]     return _value.hashCode(); [EOL] } <line_num>: 115,116
