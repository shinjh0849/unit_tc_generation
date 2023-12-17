public ObjectArraySerializer(JavaType elemType, boolean staticTyping, TypeSerializer vts, JsonSerializer<Object> elementSerializer)
public ObjectArraySerializer(ObjectArraySerializer src, TypeSerializer vts)
public ObjectArraySerializer(ObjectArraySerializer src, BeanProperty property, TypeSerializer vts, JsonSerializer<?> elementSerializer)
public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer vts)
public ObjectArraySerializer withResolved(BeanProperty prop, TypeSerializer vts, JsonSerializer<?> ser)
public JsonSerializer<?> createContextual(SerializerProvider provider, BeanProperty property) throws JsonMappingException
public JavaType getContentType()
public JsonSerializer<?> getContentSerializer()
public boolean isEmpty(Object[] value)
public boolean hasSingleElement(Object[] value)
public void serializeContents(Object[] value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public void serializeContentsUsing(Object[] value, JsonGenerator jgen, SerializerProvider provider, JsonSerializer<Object> ser) throws IOException, JsonGenerationException
public void serializeTypedContents(Object[] value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public JsonNode getSchema(SerializerProvider provider, Type typeHint) throws JsonMappingException
public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException
protected final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap map, Class<?> type, SerializerProvider provider) throws JsonMappingException
protected final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap map, JavaType type, SerializerProvider provider) throws JsonMappingException
