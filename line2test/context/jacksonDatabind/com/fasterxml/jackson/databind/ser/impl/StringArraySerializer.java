protected StringArraySerializer()
public StringArraySerializer(StringArraySerializer src, BeanProperty prop, JsonSerializer<?> ser)
public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer vts)
public JsonSerializer<?> createContextual(SerializerProvider provider, BeanProperty property) throws JsonMappingException
public JavaType getContentType()
public JsonSerializer<?> getContentSerializer()
public boolean isEmpty(String[] value)
public boolean hasSingleElement(String[] value)
public void serializeContents(String[] value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
private void serializeContentsSlow(String[] value, JsonGenerator jgen, SerializerProvider provider, JsonSerializer<Object> ser) throws IOException, JsonGenerationException
public JsonNode getSchema(SerializerProvider provider, Type typeHint)
public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException
JavaType VALUE_TYPE=Optional[TypeFactory.defaultInstance().uncheckedSimpleType(String.class)]
StringArraySerializer instance=Optional[new StringArraySerializer()]
JsonSerializer<Object> _elementSerializer
