public Dog(String name, int b)
public ContainerWithGetter(T a)
public ContainerWithField(T a)
public MyParam()
public MyParam(T v)
public CustomJsonSerializer(JsonSerializer<Object> beanSerializer)
public CustomJsonSerializerFactory()
public T getAnimal()
public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException
public Class<Object> handledType()
public void serializeWithType(Object value, JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonProcessingException
public void resolve(SerializerProvider provider) throws JsonMappingException
protected JsonSerializer<Object> constructBeanSerializer(SerializerProvider prov, BeanDescription beanDesc) throws JsonMappingException
public void testWrapperWithGetter() throws Exception
public void testWrapperWithField() throws Exception
public void testWrapperWithExplicitType() throws Exception
public void testJackson387() throws Exception
public void testJackson430() throws Exception
