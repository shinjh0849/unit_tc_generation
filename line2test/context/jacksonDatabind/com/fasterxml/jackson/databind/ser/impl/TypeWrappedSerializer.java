public TypeWrappedSerializer(TypeSerializer typeSer, JsonSerializer<?> ser)
public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException
public void serializeWithType(Object value, JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonProcessingException
public Class<Object> handledType()
TypeSerializer _typeSerializer
JsonSerializer<Object> _serializer
