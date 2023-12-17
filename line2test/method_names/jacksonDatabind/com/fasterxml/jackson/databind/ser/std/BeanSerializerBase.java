protected BeanSerializerBase(JavaType type, BeanSerializerBuilder builder, BeanPropertyWriter[] properties, BeanPropertyWriter[] filteredProperties)
public BeanSerializerBase(BeanSerializerBase src, BeanPropertyWriter[] properties, BeanPropertyWriter[] filteredProperties)
protected BeanSerializerBase(BeanSerializerBase src, ObjectIdWriter objectIdWriter)
protected BeanSerializerBase(BeanSerializerBase src, String[] toIgnore)
protected BeanSerializerBase(BeanSerializerBase src)
protected BeanSerializerBase(BeanSerializerBase src, NameTransformer unwrapper)
public abstract BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectIdWriter)
protected abstract BeanSerializerBase withIgnorals(String[] toIgnore)
protected abstract BeanSerializerBase asArraySerializer()
private static final BeanPropertyWriter[] rename(BeanPropertyWriter[] props, NameTransformer transformer)
public void resolve(SerializerProvider provider) throws JsonMappingException
protected JsonSerializer<Object> findConvertingSerializer(SerializerProvider provider, BeanPropertyWriter prop) throws JsonMappingException
public JsonSerializer<?> createContextual(SerializerProvider provider, BeanProperty property) throws JsonMappingException
public boolean usesObjectId()
public abstract void serialize(Object bean, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public void serializeWithType(Object bean, JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonGenerationException
protected final void _serializeWithObjectId(Object bean, JsonGenerator jgen, SerializerProvider provider, boolean startEndObject) throws IOException, JsonGenerationException
protected final void _serializeWithObjectId(Object bean, JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonGenerationException
private final String _customTypeId(Object bean)
protected void serializeFields(Object bean, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
protected void serializeFieldsFiltered(Object bean, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
protected BeanPropertyFilter findFilter(SerializerProvider provider) throws JsonMappingException
public JsonNode getSchema(SerializerProvider provider, Type typeHint) throws JsonMappingException
public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException
