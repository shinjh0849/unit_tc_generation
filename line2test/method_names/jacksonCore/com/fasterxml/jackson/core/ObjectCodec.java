protected ObjectCodec()
public abstract T readValue(JsonParser jp, Class<T> valueType) throws IOException, JsonProcessingException
public abstract T readValue(JsonParser jp, TypeReference<?> valueTypeRef) throws IOException, JsonProcessingException
public abstract T readValue(JsonParser jp, ResolvedType valueType) throws IOException, JsonProcessingException
public abstract T readTree(JsonParser jp) throws IOException, JsonProcessingException
public abstract Iterator<T> readValues(JsonParser jp, Class<T> valueType) throws IOException, JsonProcessingException
public abstract Iterator<T> readValues(JsonParser jp, TypeReference<?> valueTypeRef) throws IOException, JsonProcessingException
public abstract Iterator<T> readValues(JsonParser jp, ResolvedType valueType) throws IOException, JsonProcessingException
public abstract void writeValue(JsonGenerator jgen, Object value) throws IOException, JsonProcessingException
public abstract TreeNode createObjectNode()
public abstract TreeNode createArrayNode()
public abstract JsonParser treeAsTokens(TreeNode n)
public abstract T treeToValue(TreeNode n, Class<T> valueType) throws JsonProcessingException
public abstract JsonFactory getJsonFactory()
public JsonFactory getFactory()
