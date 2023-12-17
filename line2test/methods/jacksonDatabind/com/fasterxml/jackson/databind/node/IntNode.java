public IntNode(int v) { [EOL]     _value = v; [EOL] } <line_num>: 43,43
public static IntNode valueOf(int i) { [EOL]     if (i > MAX_CANONICAL || i < MIN_CANONICAL) [EOL]         return new IntNode(i); [EOL]     return CANONICALS[i - MIN_CANONICAL]; [EOL] } <line_num>: 45,48
@Override [EOL] public JsonToken asToken() { [EOL]     return JsonToken.VALUE_NUMBER_INT; [EOL] } <line_num>: 56,56
@Override [EOL] public JsonParser.NumberType numberType() { [EOL]     return JsonParser.NumberType.INT; [EOL] } <line_num>: 58,59
@Override [EOL] public boolean isIntegralNumber() { [EOL]     return true; [EOL] } <line_num>: 67,68
@Override [EOL] public boolean isInt() { [EOL]     return true; [EOL] } <line_num>: 70,71
@Override [EOL] public boolean canConvertToInt() { [EOL]     return true; [EOL] } <line_num>: 73,73
@Override [EOL] public boolean canConvertToLong() { [EOL]     return true; [EOL] } <line_num>: 74,74
@Override [EOL] public Number numberValue() { [EOL]     return Integer.valueOf(_value); [EOL] } <line_num>: 76,79
@Override [EOL] public short shortValue() { [EOL]     return (short) _value; [EOL] } <line_num>: 81,82
@Override [EOL] public int intValue() { [EOL]     return _value; [EOL] } <line_num>: 84,85
@Override [EOL] public long longValue() { [EOL]     return (long) _value; [EOL] } <line_num>: 87,88
@Override [EOL] public float floatValue() { [EOL]     return (float) _value; [EOL] } <line_num>: 90,91
@Override [EOL] public double doubleValue() { [EOL]     return (double) _value; [EOL] } <line_num>: 93,94
@Override [EOL] public BigDecimal decimalValue() { [EOL]     return BigDecimal.valueOf(_value); [EOL] } <line_num>: 97,98
@Override [EOL] public BigInteger bigIntegerValue() { [EOL]     return BigInteger.valueOf(_value); [EOL] } <line_num>: 100,101
@Override [EOL] public String asText() { [EOL]     return NumberOutput.toString(_value); [EOL] } <line_num>: 103,106
@Override [EOL] public boolean asBoolean(boolean defaultValue) { [EOL]     return _value != 0; [EOL] } <line_num>: 108,111
@Override [EOL] public final void serialize(JsonGenerator jg, SerializerProvider provider) throws IOException, JsonProcessingException { [EOL]     jg.writeNumber(_value); [EOL] } <line_num>: 113,118
@Override [EOL] public boolean equals(Object o) { [EOL]     if (o == this) [EOL]         return true; [EOL]     if (o == null) [EOL]         return false; [EOL]     if (o.getClass() != getClass()) { [EOL]         return false; [EOL]     } [EOL]     return ((IntNode) o)._value == _value; [EOL] } <line_num>: 120,129
@Override [EOL] public int hashCode() { [EOL]     return _value; [EOL] } <line_num>: 131,132
