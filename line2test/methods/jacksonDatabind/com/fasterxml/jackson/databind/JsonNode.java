protected JsonNode() { [EOL] } <line_num>: 40,40
public abstract <T extends JsonNode> T deepCopy(); <line_num>: 59,59
@Override [EOL] public int size() { [EOL]     return 0; [EOL] } <line_num>: 73,74
@Override [EOL] public final boolean isValueNode() { [EOL]     switch(getNodeType()) { [EOL]         case ARRAY: [EOL]         case OBJECT: [EOL]         case MISSING: [EOL]             return false; [EOL]         default: [EOL]             return true; [EOL]     } [EOL] } <line_num>: 76,85
@Override [EOL] public final boolean isContainerNode() { [EOL]     final JsonNodeType type = getNodeType(); [EOL]     return type == JsonNodeType.OBJECT || type == JsonNodeType.ARRAY; [EOL] } <line_num>: 87,91
@Override [EOL] public final boolean isMissingNode() { [EOL]     return getNodeType() == JsonNodeType.MISSING; [EOL] } <line_num>: 93,96
@Override [EOL] public final boolean isArray() { [EOL]     return getNodeType() == JsonNodeType.ARRAY; [EOL] } <line_num>: 98,101
@Override [EOL] public final boolean isObject() { [EOL]     return getNodeType() == JsonNodeType.OBJECT; [EOL] } <line_num>: 103,106
@Override [EOL] public abstract JsonNode get(int index); <line_num>: 129,130
@Override [EOL] public JsonNode get(String fieldName) { [EOL]     return null; [EOL] } <line_num>: 147,148
@Override [EOL] public abstract JsonNode path(String fieldName); <line_num>: 159,160
@Override [EOL] public abstract JsonNode path(int index); <line_num>: 170,171
@Override [EOL] public Iterator<String> fieldNames() { [EOL]     return EmptyIterator.instance(); [EOL] } <line_num>: 173,176
public abstract JsonNodeType getNodeType(); <line_num>: 193,193
public final boolean isPojo() { [EOL]     return getNodeType() == JsonNodeType.POJO; [EOL] } <line_num>: 203,205
public final boolean isNumber() { [EOL]     return getNodeType() == JsonNodeType.NUMBER; [EOL] } <line_num>: 210,212
public boolean isIntegralNumber() { [EOL]     return false; [EOL] } <line_num>: 219,219
public boolean isFloatingPointNumber() { [EOL]     return false; [EOL] } <line_num>: 225,225
public boolean isShort() { [EOL]     return false; [EOL] } <line_num>: 237,237
public boolean isInt() { [EOL]     return false; [EOL] } <line_num>: 249,249
public boolean isLong() { [EOL]     return false; [EOL] } <line_num>: 261,261
public boolean isFloat() { [EOL]     return false; [EOL] } <line_num>: 266,266
public boolean isDouble() { [EOL]     return false; [EOL] } <line_num>: 268,268
public boolean isBigDecimal() { [EOL]     return false; [EOL] } <line_num>: 269,269
public boolean isBigInteger() { [EOL]     return false; [EOL] } <line_num>: 270,270
public final boolean isTextual() { [EOL]     return getNodeType() == JsonNodeType.STRING; [EOL] } <line_num>: 276,278
public final boolean isBoolean() { [EOL]     return getNodeType() == JsonNodeType.BOOLEAN; [EOL] } <line_num>: 284,286
public final boolean isNull() { [EOL]     return getNodeType() == JsonNodeType.NULL; [EOL] } <line_num>: 292,294
public final boolean isBinary() { [EOL]     return getNodeType() == JsonNodeType.BINARY; [EOL] } <line_num>: 304,306
public boolean canConvertToInt() { [EOL]     return false; [EOL] } <line_num>: 317,317
public boolean canConvertToLong() { [EOL]     return false; [EOL] } <line_num>: 328,328
public String textValue() { [EOL]     return null; [EOL] } <line_num>: 346,346
public byte[] binaryValue() throws IOException { [EOL]     return null; [EOL] } <line_num>: 358,360
public boolean booleanValue() { [EOL]     return false; [EOL] } <line_num>: 370,370
public Number numberValue() { [EOL]     return null; [EOL] } <line_num>: 380,380
public short shortValue() { [EOL]     return 0; [EOL] } <line_num>: 392,392
public int intValue() { [EOL]     return 0; [EOL] } <line_num>: 404,404
public long longValue() { [EOL]     return 0L; [EOL] } <line_num>: 416,416
public float floatValue() { [EOL]     return 0.0f; [EOL] } <line_num>: 429,429
public double doubleValue() { [EOL]     return 0.0; [EOL] } <line_num>: 442,442
public BigDecimal decimalValue() { [EOL]     return BigDecimal.ZERO; [EOL] } <line_num>: 444,444
public BigInteger bigIntegerValue() { [EOL]     return BigInteger.ZERO; [EOL] } <line_num>: 445,445
public abstract String asText(); <line_num>: 459,459
public int asInt() { [EOL]     return asInt(0); [EOL] } <line_num>: 471,473
public int asInt(int defaultValue) { [EOL]     return defaultValue; [EOL] } <line_num>: 485,487
public long asLong() { [EOL]     return asLong(0L); [EOL] } <line_num>: 499,501
public long asLong(long defaultValue) { [EOL]     return defaultValue; [EOL] } <line_num>: 513,515
public double asDouble() { [EOL]     return asDouble(0.0); [EOL] } <line_num>: 527,529
public double asDouble(double defaultValue) { [EOL]     return defaultValue; [EOL] } <line_num>: 541,543
public boolean asBoolean() { [EOL]     return asBoolean(false); [EOL] } <line_num>: 555,557
public boolean asBoolean(boolean defaultValue) { [EOL]     return defaultValue; [EOL] } <line_num>: 569,571
public boolean has(String fieldName) { [EOL]     return get(fieldName) != null; [EOL] } <line_num>: 599,601
public boolean has(int index) { [EOL]     return get(index) != null; [EOL] } <line_num>: 625,627
public boolean hasNonNull(String fieldName) { [EOL]     JsonNode n = get(fieldName); [EOL]     return (n != null) && !n.isNull(); [EOL] } <line_num>: 640,643
public boolean hasNonNull(int index) { [EOL]     JsonNode n = get(index); [EOL]     return (n != null) && !n.isNull(); [EOL] } <line_num>: 656,659
@Override [EOL] public final Iterator<JsonNode> iterator() { [EOL]     return elements(); [EOL] } <line_num>: 672,673
public Iterator<JsonNode> elements() { [EOL]     return EmptyIterator.instance(); [EOL] } <line_num>: 681,683
public Iterator<Map.Entry<String, JsonNode>> fields() { [EOL]     return EmptyIterator.instance(); [EOL] } <line_num>: 689,691
public abstract JsonNode findValue(String fieldName); <line_num>: 708,708
public final List<JsonNode> findValues(String fieldName) { [EOL]     List<JsonNode> result = findValues(fieldName, null); [EOL]     if (result == null) { [EOL]         return Collections.emptyList(); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 719,726
public final List<String> findValuesAsText(String fieldName) { [EOL]     List<String> result = findValuesAsText(fieldName, null); [EOL]     if (result == null) { [EOL]         return Collections.emptyList(); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 732,739
public abstract JsonNode findPath(String fieldName); <line_num>: 753,753
public abstract JsonNode findParent(String fieldName); <line_num>: 764,764
public final List<JsonNode> findParents(String fieldName) { [EOL]     List<JsonNode> result = findParents(fieldName, null); [EOL]     if (result == null) { [EOL]         return Collections.emptyList(); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 775,782
public abstract List<JsonNode> findValues(String fieldName, List<JsonNode> foundSoFar); <line_num>: 784,784
public abstract List<String> findValuesAsText(String fieldName, List<String> foundSoFar); <line_num>: 785,785
public abstract List<JsonNode> findParents(String fieldName, List<JsonNode> foundSoFar); <line_num>: 786,786
public JsonNode with(String propertyName) { [EOL]     throw new UnsupportedOperationException("JsonNode not of type ObjectNode (but " + getClass().getName() + "), can not call with() on it"); [EOL] } <line_num>: 802,805
public JsonNode withArray(String propertyName) { [EOL]     throw new UnsupportedOperationException("JsonNode not of type ObjectNode (but " + getClass().getName() + "), can not call withArray() on it"); [EOL] } <line_num>: 815,818
@Override [EOL] public abstract String toString(); <line_num>: 831,832
@Override [EOL] public abstract boolean equals(Object o); <line_num>: 843,844
