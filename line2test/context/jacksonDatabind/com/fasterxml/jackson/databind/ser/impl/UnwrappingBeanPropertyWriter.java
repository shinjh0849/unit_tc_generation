public UnwrappingBeanPropertyWriter(BeanPropertyWriter base, NameTransformer unwrapper)
private UnwrappingBeanPropertyWriter(UnwrappingBeanPropertyWriter base, NameTransformer transformer, SerializedString name)
public UnwrappingBeanPropertyWriter rename(NameTransformer transformer)
public void serializeAsField(Object bean, JsonGenerator jgen, SerializerProvider prov) throws Exception
public void assignSerializer(JsonSerializer<Object> ser)
protected JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap map, Class<?> type, SerializerProvider provider) throws JsonMappingException
NameTransformer _nameTransformer
