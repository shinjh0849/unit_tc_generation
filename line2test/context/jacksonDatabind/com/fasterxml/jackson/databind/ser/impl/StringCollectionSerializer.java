protected StringCollectionSerializer()
protected StringCollectionSerializer(JsonSerializer<?> ser)
protected JsonNode contentSchema()
protected void acceptContentVisitor(JsonArrayFormatVisitor visitor) throws JsonMappingException
public JsonSerializer<?> createContextual(SerializerProvider provider, BeanProperty property) throws JsonMappingException
public void serialize(Collection<String> value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
private final void _serializeUnwrapped(Collection<String> value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public void serializeWithType(Collection<String> value, JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonGenerationException
private final void serializeContents(Collection<String> value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
private void serializeUsingCustom(Collection<String> value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
StringCollectionSerializer instance=Optional[new StringCollectionSerializer()]
JsonSerializer<String> _serializer
