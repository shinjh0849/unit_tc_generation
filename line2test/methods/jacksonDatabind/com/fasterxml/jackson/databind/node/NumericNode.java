protected NumericNode() { [EOL] } <line_num>: 14,14
@Override [EOL] public final JsonNodeType getNodeType() { [EOL]     return JsonNodeType.NUMBER; [EOL] } <line_num>: 16,20
@Override [EOL] public abstract JsonParser.NumberType numberType(); <line_num>: 24,25
@Override [EOL] public abstract Number numberValue(); <line_num>: 27,27
@Override [EOL] public abstract int intValue(); <line_num>: 28,28
@Override [EOL] public abstract long longValue(); <line_num>: 29,29
@Override [EOL] public abstract double doubleValue(); <line_num>: 30,30
@Override [EOL] public abstract BigDecimal decimalValue(); <line_num>: 31,31
@Override [EOL] public abstract BigInteger bigIntegerValue(); <line_num>: 32,32
@Override [EOL] public abstract boolean canConvertToInt(); <line_num>: 34,34
@Override [EOL] public abstract boolean canConvertToLong(); <line_num>: 35,35
@Override [EOL] public abstract String asText(); <line_num>: 43,44
@Override [EOL] public final int asInt() { [EOL]     return intValue(); [EOL] } <line_num>: 46,49
@Override [EOL] public final int asInt(int defaultValue) { [EOL]     return intValue(); [EOL] } <line_num>: 50,53
@Override [EOL] public final long asLong() { [EOL]     return longValue(); [EOL] } <line_num>: 55,58
@Override [EOL] public final long asLong(long defaultValue) { [EOL]     return longValue(); [EOL] } <line_num>: 59,62
@Override [EOL] public final double asDouble() { [EOL]     return doubleValue(); [EOL] } <line_num>: 64,67
@Override [EOL] public final double asDouble(double defaultValue) { [EOL]     return doubleValue(); [EOL] } <line_num>: 68,71
