public ModifierModule()
public MyMapLikeType()
public MyMapLikeType(String k, int v)
public MyCollectionLikeType()
public MyCollectionLikeType(int v)
public MyMapSerializer(JsonSerializer<Object> keySer, JsonSerializer<Object> valueSer)
public JsonSerializer<?> findMapLikeSerializer(SerializationConfig config, MapLikeType type, BeanDescription beanDesc, JsonSerializer<Object> keySerializer, TypeSerializer elementTypeSerializer, JsonSerializer<Object> elementValueSerializer)
public JsonSerializer<?> findCollectionLikeSerializer(SerializationConfig config, CollectionLikeType type, BeanDescription beanDesc, TypeSerializer elementTypeSerializer, JsonSerializer<Object> elementValueSerializer)
public JsonDeserializer<?> findCollectionLikeDeserializer(CollectionLikeType type, DeserializationConfig config, BeanDescription beanDesc, TypeDeserializer elementTypeDeserializer, JsonDeserializer<?> elementDeserializer) throws JsonMappingException
public JsonDeserializer<?> findMapLikeDeserializer(MapLikeType type, DeserializationConfig config, BeanDescription beanDesc, KeyDeserializer keyDeserializer, TypeDeserializer elementTypeDeserializer, JsonDeserializer<?> elementDeserializer) throws JsonMappingException
public void setupModule(SetupContext context)
public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException
public K getKey()
public V getValue()
public V getValue()
public String getKey()
public Integer getValue()
public Integer getValue()
public void serialize(MapMarker<?, ?> value, JsonGenerator jgen, SerializerProvider provider) throws IOException
public MapMarker<?, ?> deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException
public void serialize(MyCollectionLikeType value, JsonGenerator jgen, SerializerProvider provider) throws IOException
public MyCollectionLikeType deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException
public JavaType modifyType(JavaType type, Type jdkType, TypeBindings context, TypeFactory typeFactory)
public void testLikeTypeConstruction() throws Exception
public void testCollectionLikeSerialization() throws Exception
public void testMapLikeSerialization() throws Exception
public void testCollectionLikeDeserialization() throws Exception
public void testMapLikeDeserialization() throws Exception
