public Bean()
public Bean(String a, String b)
public ModuleImpl(BeanDeserializerModifier modifier)
public RemovingModifier(String remove)
public ReplacingModifier(JsonDeserializer<?> s)
public BogusBeanDeserializer(String a, String b)
public Issue476Deserializer(BeanDeserializer src)
public Issue476Module()
public void setupModule(SetupContext context)
public BeanDeserializerBuilder updateBuilder(DeserializationConfig config, BeanDescription beanDesc, BeanDeserializerBuilder builder)
public JsonDeserializer<?> modifyDeserializer(DeserializationConfig config, BeanDescription beanDesc, JsonDeserializer<?> deserializer)
public Object deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) throws JsonMappingException
public JsonDeserializer<?> modifyDeserializer(DeserializationConfig config, BeanDescription beanDesc, JsonDeserializer<?> deserializer)
public void setupModule(SetupContext context)
public Object deserialize(JsonParser jp, DeserializationContext ctxt)
public JsonDeserializer<?> modifyArrayDeserializer(DeserializationConfig config, ArrayType valueType, BeanDescription beanDesc, JsonDeserializer<?> deserializer)
public Object deserialize(JsonParser jp, DeserializationContext ctxt)
public JsonDeserializer<?> modifyCollectionDeserializer(DeserializationConfig config, CollectionType valueType, BeanDescription beanDesc, JsonDeserializer<?> deserializer)
public Object deserialize(JsonParser jp, DeserializationContext ctxt)
public JsonDeserializer<?> modifyMapDeserializer(DeserializationConfig config, MapType valueType, BeanDescription beanDesc, JsonDeserializer<?> deserializer)
public Object deserialize(JsonParser jp, DeserializationContext ctxt)
public JsonDeserializer<?> modifyEnumDeserializer(DeserializationConfig config, JavaType valueType, BeanDescription beanDesc, JsonDeserializer<?> deserializer)
public Object deserializeKey(String key, DeserializationContext ctxt) throws IOException, JsonProcessingException
public KeyDeserializer modifyKeyDeserializer(DeserializationConfig config, JavaType valueType, KeyDeserializer kd)
public void testPropertyRemoval() throws Exception
public void testDeserializerReplacement() throws Exception
public void testIssue476() throws Exception
public void testPOJOFromEmptyString() throws Exception
public void testModifyArrayDeserializer() throws Exception
public void testModifyCollectionDeserializer() throws Exception
public void testModifyMapDeserializer() throws Exception
public void testModifyEnumDeserializer() throws Exception
public void testModifyKeyDeserializer() throws Exception
