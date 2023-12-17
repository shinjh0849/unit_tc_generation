public DoubleNode(double v) { [EOL]     _value = v; [EOL] } <line_num>: 27,27
public static DoubleNode valueOf(double v) { [EOL]     return new DoubleNode(v); [EOL] } <line_num>: 29,29
@Override [EOL] public JsonToken asToken() { [EOL]     return JsonToken.VALUE_NUMBER_FLOAT; [EOL] } <line_num>: 37,37
@Override [EOL] public JsonParser.NumberType numberType() { [EOL]     return JsonParser.NumberType.DOUBLE; [EOL] } <line_num>: 39,40
@Override [EOL] public boolean isFloatingPointNumber() { [EOL]     return true; [EOL] } <line_num>: 48,49
@Override [EOL] public boolean isDouble() { [EOL]     return true; [EOL] } <line_num>: 51,52
@Override [EOL] public boolean canConvertToInt() { [EOL]     return (_value >= Integer.MIN_VALUE && _value <= Integer.MAX_VALUE); [EOL] } <line_num>: 54,56
@Override [EOL] public boolean canConvertToLong() { [EOL]     return (_value >= Long.MIN_VALUE && _value <= Long.MAX_VALUE); [EOL] } <line_num>: 57,59
@Override [EOL] public Number numberValue() { [EOL]     return Double.valueOf(_value); [EOL] } <line_num>: 61,64
@Override [EOL] public short shortValue() { [EOL]     return (short) _value; [EOL] } <line_num>: 66,67
@Override [EOL] public int intValue() { [EOL]     return (int) _value; [EOL] } <line_num>: 69,70
@Override [EOL] public long longValue() { [EOL]     return (long) _value; [EOL] } <line_num>: 72,73
@Override [EOL] public float floatValue() { [EOL]     return (float) _value; [EOL] } <line_num>: 75,76
@Override [EOL] public double doubleValue() { [EOL]     return _value; [EOL] } <line_num>: 78,79
@Override [EOL] public BigDecimal decimalValue() { [EOL]     return BigDecimal.valueOf(_value); [EOL] } <line_num>: 81,82
@Override [EOL] public BigInteger bigIntegerValue() { [EOL]     return decimalValue().toBigInteger(); [EOL] } <line_num>: 84,87
@Override [EOL] public String asText() { [EOL]     return NumberOutput.toString(_value); [EOL] } <line_num>: 89,92
@Override [EOL] public final void serialize(JsonGenerator jg, SerializerProvider provider) throws IOException, JsonProcessingException { [EOL]     jg.writeNumber(_value); [EOL] } <line_num>: 94,99
@Override [EOL] public boolean equals(Object o) { [EOL]     if (o == this) [EOL]         return true; [EOL]     if (o == null) [EOL]         return false; [EOL]     if (o.getClass() != getClass()) { [EOL]         return false; [EOL]     } [EOL]     final double otherValue = ((DoubleNode) o)._value; [EOL]     return Double.compare(_value, otherValue) == 0; [EOL] } <line_num>: 101,114
@Override [EOL] public int hashCode() { [EOL]     long l = Double.doubleToLongBits(_value); [EOL]     return ((int) l) ^ (int) (l >> 32); [EOL] } <line_num>: 116,123
