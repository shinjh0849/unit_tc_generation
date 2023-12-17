public BeanAsArraySerializer(BeanSerializerBase src)
protected BeanAsArraySerializer(BeanSerializerBase src, String[] toIgnore)
public JsonSerializer<Object> unwrappingSerializer(NameTransformer transformer)
public boolean isUnwrappingSerializer()
public BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectIdWriter)
protected BeanAsArraySerializer withIgnorals(String[] toIgnore)
protected BeanSerializerBase asArraySerializer()
public void serializeWithType(Object bean, JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonGenerationException
public final void serialize(Object bean, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
private boolean hasSingleElement(SerializerProvider provider)
protected final void serializeAsArray(Object bean, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public String toString()
BeanSerializerBase _defaultSerializer
