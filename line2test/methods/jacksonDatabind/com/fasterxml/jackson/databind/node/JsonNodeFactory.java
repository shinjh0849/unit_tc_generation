public JsonNodeFactory(boolean bigDecimalExact) { [EOL]     _cfgBigDecimalExact = bigDecimalExact; [EOL] } <line_num>: 58,61
protected JsonNodeFactory() { [EOL]     this(false); [EOL] } <line_num>: 69,72
public static JsonNodeFactory withExactBigDecimals(boolean bigDecimalExact) { [EOL]     return bigDecimalExact ? decimalsAsIs : decimalsNormalized; [EOL] } <line_num>: 81,84
public BooleanNode booleanNode(boolean v) { [EOL]     return v ? BooleanNode.getTrue() : BooleanNode.getFalse(); [EOL] } <line_num>: 96,98
public NullNode nullNode() { [EOL]     return NullNode.getInstance(); [EOL] } <line_num>: 104,104
public NumericNode numberNode(byte v) { [EOL]     return IntNode.valueOf(v); [EOL] } <line_num>: 116,116
public ValueNode numberNode(Byte value) { [EOL]     return (value == null) ? nullNode() : IntNode.valueOf(value.intValue()); [EOL] } <line_num>: 124,126
public NumericNode numberNode(short v) { [EOL]     return ShortNode.valueOf(v); [EOL] } <line_num>: 132,132
public ValueNode numberNode(Short value) { [EOL]     return (value == null) ? nullNode() : ShortNode.valueOf(value); [EOL] } <line_num>: 140,142
public NumericNode numberNode(int v) { [EOL]     return IntNode.valueOf(v); [EOL] } <line_num>: 148,148
public ValueNode numberNode(Integer value) { [EOL]     return (value == null) ? nullNode() : IntNode.valueOf(value.intValue()); [EOL] } <line_num>: 156,158
public NumericNode numberNode(long v) { [EOL]     return LongNode.valueOf(v); [EOL] } <line_num>: 164,164
public ValueNode numberNode(Long value) { [EOL]     return (value == null) ? nullNode() : LongNode.valueOf(value.longValue()); [EOL] } <line_num>: 171,173
public NumericNode numberNode(BigInteger v) { [EOL]     return BigIntegerNode.valueOf(v); [EOL] } <line_num>: 179,179
public NumericNode numberNode(float v) { [EOL]     return FloatNode.valueOf((float) v); [EOL] } <line_num>: 185,185
public ValueNode numberNode(Float value) { [EOL]     return (value == null) ? nullNode() : FloatNode.valueOf(value.floatValue()); [EOL] } <line_num>: 193,195
public NumericNode numberNode(double v) { [EOL]     return DoubleNode.valueOf(v); [EOL] } <line_num>: 201,201
public ValueNode numberNode(Double value) { [EOL]     return (value == null) ? nullNode() : DoubleNode.valueOf(value.doubleValue()); [EOL] } <line_num>: 209,211
public NumericNode numberNode(BigDecimal v) { [EOL]     if (_cfgBigDecimalExact) [EOL]         return DecimalNode.valueOf(v); [EOL]     return v.compareTo(BigDecimal.ZERO) == 0 ? DecimalNode.ZERO : DecimalNode.valueOf(v.stripTrailingZeros()); [EOL] } <line_num>: 223,243
public TextNode textNode(String text) { [EOL]     return TextNode.valueOf(text); [EOL] } <line_num>: 255,255
public BinaryNode binaryNode(byte[] data) { [EOL]     return BinaryNode.valueOf(data); [EOL] } <line_num>: 262,262
public BinaryNode binaryNode(byte[] data, int offset, int length) { [EOL]     return BinaryNode.valueOf(data, offset, length); [EOL] } <line_num>: 269,271
public ArrayNode arrayNode() { [EOL]     return new ArrayNode(this); [EOL] } <line_num>: 282,282
public ObjectNode objectNode() { [EOL]     return new ObjectNode(this); [EOL] } <line_num>: 287,287
public POJONode POJONode(Object pojo) { [EOL]     return new POJONode(pojo); [EOL] } <line_num>: 295,295
