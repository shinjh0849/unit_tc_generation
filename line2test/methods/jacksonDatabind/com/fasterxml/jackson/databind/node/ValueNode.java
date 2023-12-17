protected ValueNode() { [EOL] } <line_num>: 20,20
@SuppressWarnings("unchecked") [EOL] @Override [EOL] public <T extends JsonNode> T deepCopy() { [EOL]     return (T) this; [EOL] } <line_num>: 26,28
@Override [EOL] public abstract JsonToken asToken(); <line_num>: 30,30
@Override [EOL] public void serializeWithType(JsonGenerator jg, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonProcessingException { [EOL]     typeSer.writeTypePrefixForScalar(this, jg); [EOL]     serialize(jg, provider); [EOL]     typeSer.writeTypeSuffixForScalar(this, jg); [EOL] } <line_num>: 32,40
@Override [EOL] public String toString() { [EOL]     return asText(); [EOL] } <line_num>: 48,49
@Override [EOL] public final JsonNode get(int index) { [EOL]     return null; [EOL] } <line_num>: 57,61
@Override [EOL] public final JsonNode path(int index) { [EOL]     return MissingNode.getInstance(); [EOL] } <line_num>: 63,67
@Override [EOL] public final boolean has(int index) { [EOL]     return false; [EOL] } <line_num>: 69,73
@Override [EOL] public final boolean hasNonNull(int index) { [EOL]     return false; [EOL] } <line_num>: 75,79
@Override [EOL] public final JsonNode get(String fieldName) { [EOL]     return null; [EOL] } <line_num>: 81,85
@Override [EOL] public final JsonNode path(String fieldName) { [EOL]     return MissingNode.getInstance(); [EOL] } <line_num>: 87,91
@Override [EOL] public final boolean has(String fieldName) { [EOL]     return false; [EOL] } <line_num>: 93,97
@Override [EOL] public final boolean hasNonNull(String fieldName) { [EOL]     return false; [EOL] } <line_num>: 99,103
@Override [EOL] public final JsonNode findValue(String fieldName) { [EOL]     return null; [EOL] } <line_num>: 111,115
@Override [EOL] public final ObjectNode findParent(String fieldName) { [EOL]     return null; [EOL] } <line_num>: 118,122
@Override [EOL] public final List<JsonNode> findValues(String fieldName, List<JsonNode> foundSoFar) { [EOL]     return foundSoFar; [EOL] } <line_num>: 124,128
@Override [EOL] public final List<String> findValuesAsText(String fieldName, List<String> foundSoFar) { [EOL]     return foundSoFar; [EOL] } <line_num>: 130,134
@Override [EOL] public final List<JsonNode> findParents(String fieldName, List<JsonNode> foundSoFar) { [EOL]     return foundSoFar; [EOL] } <line_num>: 136,140
