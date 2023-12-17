protected ContainerNode(JsonNodeFactory nc) { [EOL]     _nodeFactory = nc; [EOL] } <line_num>: 23,26
@Override [EOL] public abstract JsonToken asToken(); <line_num>: 31,32
@Override [EOL] public String asText() { [EOL]     return ""; [EOL] } <line_num>: 34,35
@Override [EOL] public abstract int size(); <line_num>: 43,44
@Override [EOL] public abstract JsonNode get(int index); <line_num>: 46,47
@Override [EOL] public abstract JsonNode get(String fieldName); <line_num>: 49,50
public final ArrayNode arrayNode() { [EOL]     return _nodeFactory.arrayNode(); [EOL] } <line_num>: 63,63
public final ObjectNode objectNode() { [EOL]     return _nodeFactory.objectNode(); [EOL] } <line_num>: 69,69
public final NullNode nullNode() { [EOL]     return _nodeFactory.nullNode(); [EOL] } <line_num>: 71,71
public final BooleanNode booleanNode(boolean v) { [EOL]     return _nodeFactory.booleanNode(v); [EOL] } <line_num>: 73,73
public final NumericNode numberNode(byte v) { [EOL]     return _nodeFactory.numberNode(v); [EOL] } <line_num>: 75,75
public final NumericNode numberNode(short v) { [EOL]     return _nodeFactory.numberNode(v); [EOL] } <line_num>: 76,76
public final NumericNode numberNode(int v) { [EOL]     return _nodeFactory.numberNode(v); [EOL] } <line_num>: 77,77
public final NumericNode numberNode(long v) { [EOL]     return _nodeFactory.numberNode(v); [EOL] } <line_num>: 78,78
public final NumericNode numberNode(float v) { [EOL]     return _nodeFactory.numberNode(v); [EOL] } <line_num>: 79,79
public final NumericNode numberNode(double v) { [EOL]     return _nodeFactory.numberNode(v); [EOL] } <line_num>: 80,80
public final NumericNode numberNode(BigDecimal v) { [EOL]     return (_nodeFactory.numberNode(v)); [EOL] } <line_num>: 81,81
public final TextNode textNode(String text) { [EOL]     return _nodeFactory.textNode(text); [EOL] } <line_num>: 83,83
public final BinaryNode binaryNode(byte[] data) { [EOL]     return _nodeFactory.binaryNode(data); [EOL] } <line_num>: 85,85
public final BinaryNode binaryNode(byte[] data, int offset, int length) { [EOL]     return _nodeFactory.binaryNode(data, offset, length); [EOL] } <line_num>: 86,86
public final POJONode POJONode(Object pojo) { [EOL]     return _nodeFactory.POJONode(pojo); [EOL] } <line_num>: 88,88
public abstract T removeAll(); <line_num>: 101,101
