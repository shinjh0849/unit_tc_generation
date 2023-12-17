protected StaticListSerializerBase(Class<?> cls)
public boolean isEmpty(T value)
public JsonNode getSchema(SerializerProvider provider, Type typeHint)
public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException
protected abstract JsonNode contentSchema()
protected abstract void acceptContentVisitor(JsonArrayFormatVisitor visitor) throws JsonMappingException
