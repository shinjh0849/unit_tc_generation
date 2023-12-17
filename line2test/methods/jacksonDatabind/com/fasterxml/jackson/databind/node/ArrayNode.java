public ArrayNode(JsonNodeFactory nc) { [EOL]     super(nc); [EOL] } <line_num>: 25,25
@SuppressWarnings("unchecked") [EOL] @Override [EOL] public ArrayNode deepCopy() { [EOL]     ArrayNode ret = new ArrayNode(_nodeFactory); [EOL]     for (JsonNode element : _children) ret._children.add(element.deepCopy()); [EOL]     return ret; [EOL] } <line_num>: 28,38
@Override [EOL] public JsonNodeType getNodeType() { [EOL]     return JsonNodeType.ARRAY; [EOL] } <line_num>: 46,50
@Override [EOL] public JsonToken asToken() { [EOL]     return JsonToken.START_ARRAY; [EOL] } <line_num>: 52,52
@Override [EOL] public int size() { [EOL]     return _children.size(); [EOL] } <line_num>: 54,58
@Override [EOL] public Iterator<JsonNode> elements() { [EOL]     return _children.iterator(); [EOL] } <line_num>: 60,64
@Override [EOL] public JsonNode get(int index) { [EOL]     if (index >= 0 && index < _children.size()) { [EOL]         return _children.get(index); [EOL]     } [EOL]     return null; [EOL] } <line_num>: 66,73
@Override [EOL] public JsonNode get(String fieldName) { [EOL]     return null; [EOL] } <line_num>: 75,76
@Override [EOL] public JsonNode path(String fieldName) { [EOL]     return MissingNode.getInstance(); [EOL] } <line_num>: 78,79
@Override [EOL] public JsonNode path(int index) { [EOL]     if (index >= 0 && index < _children.size()) { [EOL]         return _children.get(index); [EOL]     } [EOL]     return MissingNode.getInstance(); [EOL] } <line_num>: 81,88
@Override [EOL] public void serialize(JsonGenerator jg, SerializerProvider provider) throws IOException, JsonProcessingException { [EOL]     jg.writeStartArray(); [EOL]     for (JsonNode n : _children) { [EOL]         ((BaseJsonNode) n).serialize(jg, provider); [EOL]     } [EOL]     jg.writeEndArray(); [EOL] } <line_num>: 96,110
@Override [EOL] public void serializeWithType(JsonGenerator jg, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonProcessingException { [EOL]     typeSer.writeTypePrefixForArray(this, jg); [EOL]     for (JsonNode n : _children) { [EOL]         ((BaseJsonNode) n).serialize(jg, provider); [EOL]     } [EOL]     typeSer.writeTypeSuffixForArray(this, jg); [EOL] } <line_num>: 112,122
@Override [EOL] public JsonNode findValue(String fieldName) { [EOL]     for (JsonNode node : _children) { [EOL]         JsonNode value = node.findValue(fieldName); [EOL]         if (value != null) { [EOL]             return value; [EOL]         } [EOL]     } [EOL]     return null; [EOL] } <line_num>: 130,140
@Override [EOL] public List<JsonNode> findValues(String fieldName, List<JsonNode> foundSoFar) { [EOL]     for (JsonNode node : _children) { [EOL]         foundSoFar = node.findValues(fieldName, foundSoFar); [EOL]     } [EOL]     return foundSoFar; [EOL] } <line_num>: 142,149
@Override [EOL] public List<String> findValuesAsText(String fieldName, List<String> foundSoFar) { [EOL]     for (JsonNode node : _children) { [EOL]         foundSoFar = node.findValuesAsText(fieldName, foundSoFar); [EOL]     } [EOL]     return foundSoFar; [EOL] } <line_num>: 151,158
@Override [EOL] public ObjectNode findParent(String fieldName) { [EOL]     for (JsonNode node : _children) { [EOL]         JsonNode parent = node.findParent(fieldName); [EOL]         if (parent != null) { [EOL]             return (ObjectNode) parent; [EOL]         } [EOL]     } [EOL]     return null; [EOL] } <line_num>: 160,170
@Override [EOL] public List<JsonNode> findParents(String fieldName, List<JsonNode> foundSoFar) { [EOL]     for (JsonNode node : _children) { [EOL]         foundSoFar = node.findParents(fieldName, foundSoFar); [EOL]     } [EOL]     return foundSoFar; [EOL] } <line_num>: 172,179
public JsonNode set(int index, JsonNode value) { [EOL]     if (value == null) { [EOL]         value = nullNode(); [EOL]     } [EOL]     if (index < 0 || index >= _children.size()) { [EOL]         throw new IndexOutOfBoundsException("Illegal index " + index + ", array size " + size()); [EOL]     } [EOL]     return _children.set(index, value); [EOL] } <line_num>: 198,207
public ArrayNode add(JsonNode value) { [EOL]     if (value == null) { [EOL]         value = nullNode(); [EOL]     } [EOL]     _add(value); [EOL]     return this; [EOL] } <line_num>: 214,221
public ArrayNode addAll(ArrayNode other) { [EOL]     _children.addAll(other._children); [EOL]     return this; [EOL] } <line_num>: 231,235
public ArrayNode addAll(Collection<JsonNode> nodes) { [EOL]     _children.addAll(nodes); [EOL]     return this; [EOL] } <line_num>: 244,248
public ArrayNode insert(int index, JsonNode value) { [EOL]     if (value == null) { [EOL]         value = nullNode(); [EOL]     } [EOL]     _insert(index, value); [EOL]     return this; [EOL] } <line_num>: 259,266
public JsonNode remove(int index) { [EOL]     if (index >= 0 && index < _children.size()) { [EOL]         return _children.remove(index); [EOL]     } [EOL]     return null; [EOL] } <line_num>: 275,281
@Override [EOL] public ArrayNode removeAll() { [EOL]     _children.clear(); [EOL]     return this; [EOL] } <line_num>: 289,294
public ArrayNode addArray() { [EOL]     ArrayNode n = arrayNode(); [EOL]     _add(n); [EOL]     return n; [EOL] } <line_num>: 308,313
public ObjectNode addObject() { [EOL]     ObjectNode n = objectNode(); [EOL]     _add(n); [EOL]     return n; [EOL] } <line_num>: 321,326
public ArrayNode addPOJO(Object value) { [EOL]     if (value == null) { [EOL]         addNull(); [EOL]     } else { [EOL]         _add(POJONode(value)); [EOL]     } [EOL]     return this; [EOL] } <line_num>: 334,342
public ArrayNode addNull() { [EOL]     _add(nullNode()); [EOL]     return this; [EOL] } <line_num>: 349,353
public ArrayNode add(int v) { [EOL]     _add(numberNode(v)); [EOL]     return this; [EOL] } <line_num>: 360,363
public ArrayNode add(Integer value) { [EOL]     if (value == null) { [EOL]         return addNull(); [EOL]     } [EOL]     return _add(numberNode(value.intValue())); [EOL] } <line_num>: 371,376
public ArrayNode add(long v) { [EOL]     return _add(numberNode(v)); [EOL] } <line_num>: 383,383
public ArrayNode add(Long value) { [EOL]     if (value == null) { [EOL]         return addNull(); [EOL]     } [EOL]     return _add(numberNode(value.longValue())); [EOL] } <line_num>: 391,396
public ArrayNode add(float v) { [EOL]     return _add(numberNode(v)); [EOL] } <line_num>: 403,405
public ArrayNode add(Float value) { [EOL]     if (value == null) { [EOL]         return addNull(); [EOL]     } [EOL]     return _add(numberNode(value.floatValue())); [EOL] } <line_num>: 413,418
public ArrayNode add(double v) { [EOL]     return _add(numberNode(v)); [EOL] } <line_num>: 425,427
public ArrayNode add(Double value) { [EOL]     if (value == null) { [EOL]         return addNull(); [EOL]     } [EOL]     return _add(numberNode(value.doubleValue())); [EOL] } <line_num>: 435,440
public ArrayNode add(BigDecimal v) { [EOL]     if (v == null) { [EOL]         return addNull(); [EOL]     } [EOL]     return _add(numberNode(v)); [EOL] } <line_num>: 447,452
public ArrayNode add(String v) { [EOL]     if (v == null) { [EOL]         return addNull(); [EOL]     } [EOL]     return _add(textNode(v)); [EOL] } <line_num>: 459,464
public ArrayNode add(boolean v) { [EOL]     return _add(booleanNode(v)); [EOL] } <line_num>: 471,473
public ArrayNode add(Boolean value) { [EOL]     if (value == null) { [EOL]         return addNull(); [EOL]     } [EOL]     return _add(booleanNode(value.booleanValue())); [EOL] } <line_num>: 481,486
public ArrayNode add(byte[] v) { [EOL]     if (v == null) { [EOL]         return addNull(); [EOL]     } [EOL]     return _add(binaryNode(v)); [EOL] } <line_num>: 494,499
public ArrayNode insertArray(int index) { [EOL]     ArrayNode n = arrayNode(); [EOL]     _insert(index, n); [EOL]     return n; [EOL] } <line_num>: 507,512
public ObjectNode insertObject(int index) { [EOL]     ObjectNode n = objectNode(); [EOL]     _insert(index, n); [EOL]     return n; [EOL] } <line_num>: 521,526
public ArrayNode insertPOJO(int index, Object value) { [EOL]     if (value == null) { [EOL]         return insertNull(index); [EOL]     } [EOL]     return _insert(index, POJONode(value)); [EOL] } <line_num>: 534,540
public ArrayNode insertNull(int index) { [EOL]     _insert(index, nullNode()); [EOL]     return this; [EOL] } <line_num>: 548,552
public ArrayNode insert(int index, int v) { [EOL]     _insert(index, numberNode(v)); [EOL]     return this; [EOL] } <line_num>: 560,563
public ArrayNode insert(int index, Integer value) { [EOL]     if (value == null) { [EOL]         insertNull(index); [EOL]     } else { [EOL]         _insert(index, numberNode(value.intValue())); [EOL]     } [EOL]     return this; [EOL] } <line_num>: 571,578
public ArrayNode insert(int index, long v) { [EOL]     return _insert(index, numberNode(v)); [EOL] } <line_num>: 586,588
public ArrayNode insert(int index, Long value) { [EOL]     if (value == null) { [EOL]         return insertNull(index); [EOL]     } [EOL]     return _insert(index, numberNode(value.longValue())); [EOL] } <line_num>: 596,601
public ArrayNode insert(int index, float v) { [EOL]     return _insert(index, numberNode(v)); [EOL] } <line_num>: 609,611
public ArrayNode insert(int index, Float value) { [EOL]     if (value == null) { [EOL]         return insertNull(index); [EOL]     } [EOL]     return _insert(index, numberNode(value.floatValue())); [EOL] } <line_num>: 619,624
public ArrayNode insert(int index, double v) { [EOL]     return _insert(index, numberNode(v)); [EOL] } <line_num>: 632,634
public ArrayNode insert(int index, Double value) { [EOL]     if (value == null) { [EOL]         return insertNull(index); [EOL]     } [EOL]     return _insert(index, numberNode(value.doubleValue())); [EOL] } <line_num>: 642,647
public ArrayNode insert(int index, BigDecimal v) { [EOL]     if (v == null) { [EOL]         return insertNull(index); [EOL]     } [EOL]     return _insert(index, numberNode(v)); [EOL] } <line_num>: 655,660
public ArrayNode insert(int index, String v) { [EOL]     if (v == null) { [EOL]         return insertNull(index); [EOL]     } [EOL]     return _insert(index, textNode(v)); [EOL] } <line_num>: 668,673
public ArrayNode insert(int index, boolean v) { [EOL]     return _insert(index, booleanNode(v)); [EOL] } <line_num>: 681,683
public ArrayNode insert(int index, Boolean value) { [EOL]     if (value == null) { [EOL]         return insertNull(index); [EOL]     } [EOL]     return _insert(index, booleanNode(value.booleanValue())); [EOL] } <line_num>: 691,696
public ArrayNode insert(int index, byte[] v) { [EOL]     if (v == null) { [EOL]         return insertNull(index); [EOL]     } [EOL]     return _insert(index, binaryNode(v)); [EOL] } <line_num>: 705,710
@Override [EOL] public boolean equals(Object o) { [EOL]     if (o == this) [EOL]         return true; [EOL]     if (o == null) [EOL]         return false; [EOL]     if (getClass() != o.getClass()) { [EOL]         return false; [EOL]     } [EOL]     return _children.equals(((ArrayNode) o)._children); [EOL] } <line_num>: 718,727
@Override [EOL] public int hashCode() { [EOL]     return _children.hashCode(); [EOL] } <line_num>: 729,733
@Override [EOL] public String toString() { [EOL]     StringBuilder sb = new StringBuilder(16 + (size() << 4)); [EOL]     sb.append('['); [EOL]     for (int i = 0, len = _children.size(); i < len; ++i) { [EOL]         if (i > 0) { [EOL]             sb.append(','); [EOL]         } [EOL]         sb.append(_children.get(i).toString()); [EOL]     } [EOL]     sb.append(']'); [EOL]     return sb.toString(); [EOL] } <line_num>: 736,749
private ArrayNode _add(JsonNode node) { [EOL]     _children.add(node); [EOL]     return this; [EOL] } <line_num>: 757,761
private ArrayNode _insert(int index, JsonNode node) { [EOL]     if (index < 0) { [EOL]         _children.add(0, node); [EOL]     } else if (index >= _children.size()) { [EOL]         _children.add(node); [EOL]     } else { [EOL]         _children.add(index, node); [EOL]     } [EOL]     return this; [EOL] } <line_num>: 763,773
