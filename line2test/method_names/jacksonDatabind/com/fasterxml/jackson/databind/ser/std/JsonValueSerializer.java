public JsonValueSerializer(Method valueMethod, JsonSerializer<Object> ser)
public JsonValueSerializer(JsonValueSerializer src, BeanProperty property, JsonSerializer<?> ser, boolean forceTypeInfo)
private static final Class<Object> _notNullClass(Class<?> cls)
public JsonValueSerializer withResolved(BeanProperty property, JsonSerializer<?> ser, boolean forceTypeInfo)
public JsonSerializer<?> createContextual(SerializerProvider provider, BeanProperty property) throws JsonMappingException
public void serialize(Object bean, JsonGenerator jgen, SerializerProvider prov) throws IOException, JsonGenerationException
public void serializeWithType(Object bean, JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer0) throws IOException, JsonProcessingException
public JsonNode getSchema(SerializerProvider provider, Type typeHint) throws JsonMappingException
public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException
protected boolean isNaturalTypeWithStdHandling(Class<?> rawType, JsonSerializer<?> ser)
public String toString()
