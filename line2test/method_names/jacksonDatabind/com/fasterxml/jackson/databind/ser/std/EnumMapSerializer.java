public EnumMapSerializer(JavaType valueType, boolean staticTyping, EnumValues keyEnums, TypeSerializer vts, JsonSerializer<Object> valueSerializer)
public EnumMapSerializer(EnumMapSerializer src, BeanProperty property, JsonSerializer<?> ser)
public EnumMapSerializer _withValueTypeSerializer(TypeSerializer vts)
public EnumMapSerializer withValueSerializer(BeanProperty prop, JsonSerializer<?> ser)
public JsonSerializer<?> createContextual(SerializerProvider provider, BeanProperty property) throws JsonMappingException
public JavaType getContentType()
public JsonSerializer<?> getContentSerializer()
public boolean isEmpty(EnumMap<? extends Enum<?>, ?> value)
public boolean hasSingleElement(EnumMap<? extends Enum<?>, ?> value)
public void serialize(EnumMap<? extends Enum<?>, ?> value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public void serializeWithType(EnumMap<? extends Enum<?>, ?> value, JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonGenerationException
protected void serializeContents(EnumMap<? extends Enum<?>, ?> value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
protected void serializeContentsUsing(EnumMap<? extends Enum<?>, ?> value, JsonGenerator jgen, SerializerProvider provider, JsonSerializer<Object> valueSer) throws IOException, JsonGenerationException
public JsonNode getSchema(SerializerProvider provider, Type typeHint) throws JsonMappingException
public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException
