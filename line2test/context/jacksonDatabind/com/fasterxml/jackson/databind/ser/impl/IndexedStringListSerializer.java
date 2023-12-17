protected IndexedStringListSerializer()
public IndexedStringListSerializer(JsonSerializer<?> ser)
protected JsonNode contentSchema()
protected void acceptContentVisitor(JsonArrayFormatVisitor visitor) throws JsonMappingException
public JsonSerializer<?> createContextual(SerializerProvider provider, BeanProperty property) throws JsonMappingException
public void serialize(List<String> value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
private final void _serializeUnwrapped(List<String> value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public void serializeWithType(List<String> value, JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonGenerationException
private final void serializeContents(List<String> value, JsonGenerator jgen, SerializerProvider provider, int len) throws IOException, JsonGenerationException
private final void serializeUsingCustom(List<String> value, JsonGenerator jgen, SerializerProvider provider, int len) throws IOException, JsonGenerationException
IndexedStringListSerializer instance=Optional[new IndexedStringListSerializer()]
JsonSerializer<String> _serializer
