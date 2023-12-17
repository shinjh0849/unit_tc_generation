public UnwrappingBeanSerializer(BeanSerializerBase src, NameTransformer transformer)
public UnwrappingBeanSerializer(UnwrappingBeanSerializer src, ObjectIdWriter objectIdWriter)
protected UnwrappingBeanSerializer(UnwrappingBeanSerializer src, String[] toIgnore)
public JsonSerializer<Object> unwrappingSerializer(NameTransformer transformer)
public boolean isUnwrappingSerializer()
public UnwrappingBeanSerializer withObjectIdWriter(ObjectIdWriter objectIdWriter)
protected UnwrappingBeanSerializer withIgnorals(String[] toIgnore)
protected BeanSerializerBase asArraySerializer()
public final void serialize(Object bean, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public String toString()
NameTransformer _nameTransformer
