protected ObjectCodec() { [EOL] } <line_num>: 25,25
public abstract <T> T readValue(JsonParser jp, Class<T> valueType) throws IOException, JsonProcessingException; <line_num>: 43,44
public abstract <T> T readValue(JsonParser jp, TypeReference<?> valueTypeRef) throws IOException, JsonProcessingException; <line_num>: 53,54
public abstract <T> T readValue(JsonParser jp, ResolvedType valueType) throws IOException, JsonProcessingException; <line_num>: 62,63
public abstract <T extends TreeNode> T readTree(JsonParser jp) throws IOException, JsonProcessingException; <line_num>: 72,73
public abstract <T> Iterator<T> readValues(JsonParser jp, Class<T> valueType) throws IOException, JsonProcessingException; <line_num>: 79,80
public abstract <T> Iterator<T> readValues(JsonParser jp, TypeReference<?> valueTypeRef) throws IOException, JsonProcessingException; <line_num>: 86,87
public abstract <T> Iterator<T> readValues(JsonParser jp, ResolvedType valueType) throws IOException, JsonProcessingException; <line_num>: 93,94
public abstract void writeValue(JsonGenerator jgen, Object value) throws IOException, JsonProcessingException; <line_num>: 106,107
public abstract TreeNode createObjectNode(); <line_num>: 119,119
public abstract TreeNode createArrayNode(); <line_num>: 125,125
public abstract JsonParser treeAsTokens(TreeNode n); <line_num>: 132,132
public abstract <T> T treeToValue(TreeNode n, Class<T> valueType) throws JsonProcessingException; <line_num>: 139,140
@Deprecated [EOL] public abstract JsonFactory getJsonFactory(); <line_num>: 151,152
public JsonFactory getFactory() { [EOL]     return getJsonFactory(); [EOL] } <line_num>: 160,162
