public JsonSerializer<T> unwrappingSerializer(NameTransformer unwrapper)
public JsonSerializer<T> replaceDelegatee(JsonSerializer<?> delegatee)
public abstract void serialize(T value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException
public void serializeWithType(T value, JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonProcessingException
public Class<T> handledType()
public boolean isEmpty(T value)
public boolean usesObjectId()
public boolean isUnwrappingSerializer()
public JsonSerializer<?> getDelegatee()
public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType type) throws JsonMappingException
