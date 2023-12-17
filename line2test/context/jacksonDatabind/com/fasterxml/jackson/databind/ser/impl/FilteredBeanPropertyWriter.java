protected SingleView(BeanPropertyWriter delegate, Class<?> view)
protected MultiView(BeanPropertyWriter delegate, Class<?>[] views)
public static BeanPropertyWriter constructViewBased(BeanPropertyWriter base, Class<?>[] viewsToIncludeIn)
public SingleView rename(NameTransformer transformer)
public void assignSerializer(JsonSerializer<Object> ser)
public void assignNullSerializer(JsonSerializer<Object> nullSer)
public void serializeAsField(Object bean, JsonGenerator jgen, SerializerProvider prov) throws Exception
public void serializeAsColumn(Object bean, JsonGenerator jgen, SerializerProvider prov) throws Exception
public MultiView rename(NameTransformer transformer)
public void assignSerializer(JsonSerializer<Object> ser)
public void assignNullSerializer(JsonSerializer<Object> nullSer)
public void serializeAsField(Object bean, JsonGenerator jgen, SerializerProvider prov) throws Exception
public void serializeAsColumn(Object bean, JsonGenerator jgen, SerializerProvider prov) throws Exception
