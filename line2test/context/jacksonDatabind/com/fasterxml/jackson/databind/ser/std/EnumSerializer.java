public EnumSerializer(EnumValues v)
public EnumSerializer(EnumValues v, Boolean serializeAsIndex)
public static EnumSerializer construct(Class<Enum<?>> enumClass, SerializationConfig config, BeanDescription beanDesc, JsonFormat.Value format)
public static EnumSerializer construct(Class<Enum<?>> enumClass, SerializationConfig config, BeanDescription beanDesc)
public JsonSerializer<?> createContextual(SerializerProvider prov, BeanProperty property) throws JsonMappingException
public EnumValues getEnumValues()
public final void serialize(Enum<?> en, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public JsonNode getSchema(SerializerProvider provider, Type typeHint)
public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException
protected final boolean _serializeAsIndex(SerializerProvider provider)
protected static Boolean _isShapeWrittenUsingIndex(Class<?> enumClass, JsonFormat.Value format, boolean fromClass)
EnumValues _values
Boolean _serializeAsIndex
