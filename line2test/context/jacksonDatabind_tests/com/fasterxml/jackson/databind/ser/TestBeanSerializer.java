public ModuleImpl(BeanSerializerModifier modifier)
public RemovingModifier(String remove)
public ReplacingModifier(JsonSerializer<?> s)
public BuilderModifier(JsonSerializer<?> ser)
public BogusSerializerBuilder(BeanSerializerBuilder src, JsonSerializer<?> ser)
public BogusBeanSerializer(int v)
public void setupModule(SetupContext context)
public List<BeanPropertyWriter> changeProperties(SerializationConfig config, BeanDescription beanDesc, List<BeanPropertyWriter> beanProperties)
public List<BeanPropertyWriter> orderProperties(SerializationConfig config, BeanDescription beanDesc, List<BeanPropertyWriter> beanProperties)
public JsonSerializer<?> modifySerializer(SerializationConfig config, BeanDescription beanDesc, JsonSerializer<?> serializer)
public BeanSerializerBuilder updateBuilder(SerializationConfig config, BeanDescription beanDesc, BeanSerializerBuilder builder)
public JsonSerializer<?> build()
public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException
public List<BeanPropertyWriter> changeProperties(SerializationConfig config, BeanDescription beanDesc, List<BeanPropertyWriter> beanProperties)
public int getX()
public boolean isX()
public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException
public JsonSerializer<?> modifyArraySerializer(SerializationConfig config, ArrayType valueType, BeanDescription beanDesc, JsonSerializer<?> serializer)
public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException
public JsonSerializer<?> modifyCollectionSerializer(SerializationConfig config, CollectionType valueType, BeanDescription beanDesc, JsonSerializer<?> serializer)
public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException
public JsonSerializer<?> modifyMapSerializer(SerializationConfig config, MapType valueType, BeanDescription beanDesc, JsonSerializer<?> serializer)
public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException
public JsonSerializer<?> modifyEnumSerializer(SerializationConfig config, JavaType valueType, BeanDescription beanDesc, JsonSerializer<?> serializer)
public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException
public JsonSerializer<?> modifyKeySerializer(SerializationConfig config, JavaType valueType, BeanDescription beanDesc, JsonSerializer<?> serializer)
public void testPropertyRemoval() throws Exception
public void testPropertyReorder() throws Exception
public void testBuilderReplacement() throws Exception
public void testSerializerReplacement() throws Exception
public void setupModule(SetupContext context)
public void testEmptyBean() throws Exception
public void testModifyArraySerializer() throws Exception
public void testModifyCollectionSerializer() throws Exception
public void testModifyMapSerializer() throws Exception
public void testModifyEnumSerializer() throws Exception
public void testModifyKeySerializer() throws Exception
public void testFailWithDupProps() throws Exception
