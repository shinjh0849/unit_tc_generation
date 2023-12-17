protected JsonNodeDeserializer()
protected ObjectDeserializer()
protected ArrayDeserializer()
public BaseNodeDeserializer()
public static JsonDeserializer<? extends JsonNode> getDeserializer(Class<?> nodeClass)
public JsonNode deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public static ObjectDeserializer getInstance()
public ObjectNode deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public static ArrayDeserializer getInstance()
public ArrayNode deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Object deserializeWithType(JsonParser jp, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException, JsonProcessingException
public JsonNode getNullValue()
protected void _reportProblem(JsonParser jp, String msg) throws JsonMappingException
protected void _handleDuplicateField(String fieldName, ObjectNode objectNode, JsonNode oldValue, JsonNode newValue) throws JsonProcessingException
protected final ObjectNode deserializeObject(JsonParser jp, DeserializationContext ctxt, final JsonNodeFactory nodeFactory) throws IOException, JsonProcessingException
protected final ArrayNode deserializeArray(JsonParser jp, DeserializationContext ctxt, final JsonNodeFactory nodeFactory) throws IOException, JsonProcessingException
protected final JsonNode deserializeAny(JsonParser jp, DeserializationContext ctxt, final JsonNodeFactory nodeFactory) throws IOException, JsonProcessingException
JsonNodeDeserializer instance=Optional[new JsonNodeDeserializer()]
