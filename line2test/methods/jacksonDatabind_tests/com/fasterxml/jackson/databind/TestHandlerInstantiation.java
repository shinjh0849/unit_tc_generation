public MyBean() { [EOL]     this(null); [EOL] } <line_num>: 39,39
public MyBean(String s) { [EOL]     value = s; [EOL] } <line_num>: 40,40
public TypeIdBean() { [EOL] } <line_num>: 52,52
public TypeIdBean(int x) { [EOL]     this.x = x; [EOL] } <line_num>: 53,53
public TypeIdBeanWrapper() { [EOL]     this(null); [EOL] } <line_num>: 59,59
public TypeIdBeanWrapper(TypeIdBean b) { [EOL]     bean = b; [EOL] } <line_num>: 60,60
public MyBeanDeserializer(String p) { [EOL]     _prefix = p; [EOL] } <line_num>: 73,75
public MyKeyDeserializer() { [EOL] } <line_num>: 87,87
public MyBeanSerializer(String p) { [EOL]     _prefix = p; [EOL] } <line_num>: 101,103
public CustomIdResolver(String idForBean) { [EOL]     _id = idForBean; [EOL] } <line_num>: 120,122
public MyInstantiator(String p) { [EOL]     _prefix = p; [EOL] } <line_num>: 170,172
@Override [EOL] public MyBean deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException { [EOL]     return new MyBean(_prefix + jp.getText()); [EOL] } <line_num>: 77,82
@Override [EOL] public Object deserializeKey(String key, DeserializationContext ctxt) throws IOException, JsonProcessingException { [EOL]     return "KEY"; [EOL] } <line_num>: 89,94
@Override [EOL] public void serialize(MyBean value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException { [EOL]     jgen.writeString(_prefix + value.value); [EOL] } <line_num>: 105,110
@Override [EOL] public Id getMechanism() { [EOL]     return Id.CUSTOM; [EOL] } <line_num>: 124,127
@Override [EOL] public String idFromValue(Object value) { [EOL]     if (value.getClass() == TypeIdBean.class) { [EOL]         return _id; [EOL]     } [EOL]     return "unknown"; [EOL] } <line_num>: 128,135
@Override [EOL] public String idFromValueAndType(Object value, Class<?> type) { [EOL]     return idFromValue(value); [EOL] } <line_num>: 136,139
@Override [EOL] public void init(JavaType baseType) { [EOL]     if (initTypes != null) { [EOL]         initTypes.add(baseType); [EOL]     } [EOL] } <line_num>: 140,145
@Override [EOL] public JavaType typeFromId(String id) { [EOL]     if (id.equals(_id)) { [EOL]         return TypeFactory.defaultInstance().constructType(TypeIdBean.class); [EOL]     } [EOL]     return null; [EOL] } <line_num>: 146,153
@Override [EOL] public String idFromBaseType() { [EOL]     return "xxx"; [EOL] } <line_num>: 154,157
@Override [EOL] public JsonDeserializer<?> deserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> deserClass) { [EOL]     if (deserClass == MyBeanDeserializer.class) { [EOL]         return new MyBeanDeserializer(_prefix); [EOL]     } [EOL]     return null; [EOL] } <line_num>: 174,183
@Override [EOL] public KeyDeserializer keyDeserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> keyDeserClass) { [EOL]     if (keyDeserClass == MyKeyDeserializer.class) { [EOL]         return new MyKeyDeserializer(); [EOL]     } [EOL]     return null; [EOL] } <line_num>: 185,194
@Override [EOL] public JsonSerializer<?> serializerInstance(SerializationConfig config, Annotated annotated, Class<?> serClass) { [EOL]     if (serClass == MyBeanSerializer.class) { [EOL]         return new MyBeanSerializer(_prefix); [EOL]     } [EOL]     return null; [EOL] } <line_num>: 196,204
@Override [EOL] public TypeIdResolver typeIdResolverInstance(MapperConfig<?> config, Annotated annotated, Class<?> resolverClass) { [EOL]     if (resolverClass == CustomIdResolver.class) { [EOL]         return new CustomIdResolver("!!!"); [EOL]     } [EOL]     return null; [EOL] } <line_num>: 206,214
@Override [EOL] public TypeResolverBuilder<?> typeResolverBuilderInstance(MapperConfig<?> config, Annotated annotated, Class<?> builderClass) { [EOL]     return null; [EOL] } <line_num>: 216,221
public void testDeserializer() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     mapper.setHandlerInstantiator(new MyInstantiator("abc:")); [EOL]     MyBean result = mapper.readValue(quote("123"), MyBean.class); [EOL]     assertEquals("abc:123", result.value); [EOL] } <line_num>: 230,236
public void testKeyDeserializer() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     mapper.setHandlerInstantiator(new MyInstantiator("abc:")); [EOL]     MyMap map = mapper.readValue("{\"a\":\"b\"}", MyMap.class); [EOL]     assertEquals("{\"KEY\":\"b\"}", mapper.writeValueAsString(map)); [EOL] } <line_num>: 238,245
public void testSerializer() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     mapper.setHandlerInstantiator(new MyInstantiator("xyz:")); [EOL]     assertEquals(quote("xyz:456"), mapper.writeValueAsString(new MyBean("456"))); [EOL] } <line_num>: 247,252
public void testTypeIdResolver() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     mapper.setHandlerInstantiator(new MyInstantiator("foobar")); [EOL]     String json = mapper.writeValueAsString(new TypeIdBeanWrapper(new TypeIdBean(123))); [EOL]     assertEquals("{\"bean\":[\"!!!\",{\"x\":123}]}", json); [EOL]     TypeIdBeanWrapper result = mapper.readValue(json, TypeIdBeanWrapper.class); [EOL]     TypeIdBean bean = result.bean; [EOL]     assertEquals(123, bean.x); [EOL] } <line_num>: 254,265
