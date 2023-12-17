private None() { [EOL] } <line_num>: 269,269
public abstract T deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException; <line_num>: 75,76
public T deserialize(JsonParser jp, DeserializationContext ctxt, T intoValue) throws IOException, JsonProcessingException { [EOL]     throw new UnsupportedOperationException("Can not update object of type " + intoValue.getClass().getName() + " (by deserializer of type " + getClass().getName() + ")"); [EOL] } <line_num>: 92,98
public Object deserializeWithType(JsonParser jp, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException, JsonProcessingException { [EOL]     return typeDeserializer.deserializeTypedFromAny(jp, ctxt); [EOL] } <line_num>: 114,120
public JsonDeserializer<T> unwrappingDeserializer(NameTransformer unwrapper) { [EOL]     return this; [EOL] } <line_num>: 137,139
public JsonDeserializer<?> replaceDelegatee(JsonDeserializer<?> delegatee) { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 150,152
public T getNullValue() { [EOL]     return null; [EOL] } <line_num>: 173,173
public T getEmptyValue() { [EOL]     return getNullValue(); [EOL] } <line_num>: 186,186
public Collection<Object> getKnownPropertyNames() { [EOL]     return null; [EOL] } <line_num>: 200,202
public boolean isCachable() { [EOL]     return false; [EOL] } <line_num>: 218,218
public ObjectIdReader getObjectIdReader() { [EOL]     return null; [EOL] } <line_num>: 238,238
public JsonDeserializer<?> getDelegatee() { [EOL]     return null; [EOL] } <line_num>: 251,253
