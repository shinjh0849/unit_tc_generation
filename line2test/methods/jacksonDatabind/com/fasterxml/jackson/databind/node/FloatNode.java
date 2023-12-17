public FloatNode(float v) { [EOL]     _value = v; [EOL] } <line_num>: 27,27
public static FloatNode valueOf(float v) { [EOL]     return new FloatNode(v); [EOL] } <line_num>: 29,29
@Override [EOL] public JsonToken asToken() { [EOL]     return JsonToken.VALUE_NUMBER_FLOAT; [EOL] } <line_num>: 37,37
@Override [EOL] public JsonParser.NumberType numberType() { [EOL]     return JsonParser.NumberType.FLOAT; [EOL] } <line_num>: 39,40
@Override [EOL] public boolean isFloatingPointNumber() { [EOL]     return true; [EOL] } <line_num>: 48,49
@Override [EOL] public boolean isFloat() { [EOL]     return true; [EOL] } <line_num>: 51,52
@Override [EOL] public boolean canConvertToInt() { [EOL]     return (_value >= Integer.MIN_VALUE && _value <= Integer.MAX_VALUE); [EOL] } <line_num>: 54,56
@Override [EOL] public boolean canConvertToLong() { [EOL]     return (_value >= Long.MIN_VALUE && _value <= Long.MAX_VALUE); [EOL] } <line_num>: 58,60
@Override [EOL] public Number numberValue() { [EOL]     return Float.valueOf(_value); [EOL] } <line_num>: 62,65
@Override [EOL] public short shortValue() { [EOL]     return (short) _value; [EOL] } <line_num>: 67,68
@Override [EOL] public int intValue() { [EOL]     return (int) _value; [EOL] } <line_num>: 70,71
@Override [EOL] public long longValue() { [EOL]     return (long) _value; [EOL] } <line_num>: 73,74
@Override [EOL] public float floatValue() { [EOL]     return (float) _value; [EOL] } <line_num>: 76,77
@Override [EOL] public double doubleValue() { [EOL]     return _value; [EOL] } <line_num>: 79,80
@Override [EOL] public BigDecimal decimalValue() { [EOL]     return BigDecimal.valueOf(_value); [EOL] } <line_num>: 82,83
@Override [EOL] public BigInteger bigIntegerValue() { [EOL]     return decimalValue().toBigInteger(); [EOL] } <line_num>: 85,88
@Override [EOL] public String asText() { [EOL]     return NumberOutput.toString(_value); [EOL] } <line_num>: 90,93
@Override [EOL] public final void serialize(JsonGenerator jg, SerializerProvider provider) throws IOException, JsonProcessingException { [EOL]     jg.writeNumber(_value); [EOL] } <line_num>: 95,100
@Override [EOL] public boolean equals(Object o) { [EOL]     if (o == this) [EOL]         return true; [EOL]     if (o == null) [EOL]         return false; [EOL]     if (o.getClass() != getClass()) { [EOL]         return false; [EOL]     } [EOL]     final float otherValue = ((FloatNode) o)._value; [EOL]     return Float.compare(_value, otherValue) == 0; [EOL] } <line_num>: 102,115
@Override [EOL] public int hashCode() { [EOL]     return Float.floatToIntBits(_value); [EOL] } <line_num>: 117,120
