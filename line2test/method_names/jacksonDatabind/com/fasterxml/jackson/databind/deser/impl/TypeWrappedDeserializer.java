public TypeWrappedDeserializer(TypeDeserializer typeDeser, JsonDeserializer<Object> deser)
public Object deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Object deserializeWithType(JsonParser jp, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException, JsonProcessingException
public Object deserialize(JsonParser jp, DeserializationContext ctxt, Object intoValue) throws IOException, JsonProcessingException
