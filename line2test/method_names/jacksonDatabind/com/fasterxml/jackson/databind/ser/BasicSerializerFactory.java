protected BasicSerializerFactory(SerializerFactoryConfig config)
public SerializerFactoryConfig getFactoryConfig()
public abstract SerializerFactory withConfig(SerializerFactoryConfig config)
public final SerializerFactory withAdditionalSerializers(Serializers additional)
public final SerializerFactory withAdditionalKeySerializers(Serializers additional)
public final SerializerFactory withSerializerModifier(BeanSerializerModifier modifier)
public abstract JsonSerializer<Object> createSerializer(SerializerProvider prov, JavaType type) throws JsonMappingException
public JsonSerializer<Object> createKeySerializer(SerializationConfig config, JavaType keyType, JsonSerializer<Object> defaultImpl)
public TypeSerializer createTypeSerializer(SerializationConfig config, JavaType baseType)
public final JsonSerializer<?> getNullSerializer()
protected abstract Iterable<Serializers> customSerializers()
protected final JsonSerializer<?> findSerializerByLookup(JavaType type, SerializationConfig config, BeanDescription beanDesc, boolean staticTyping)
protected final JsonSerializer<?> findSerializerByAnnotations(SerializerProvider prov, JavaType type, BeanDescription beanDesc) throws JsonMappingException
protected final JsonSerializer<?> findSerializerByPrimaryType(SerializerProvider prov, JavaType type, BeanDescription beanDesc, boolean staticTyping) throws JsonMappingException
protected JsonSerializer<?> findOptionalStdSerializer(SerializerProvider prov, JavaType type, BeanDescription beanDesc, boolean staticTyping) throws JsonMappingException
protected final JsonSerializer<?> findSerializerByAddonType(SerializationConfig config, JavaType javaType, BeanDescription beanDesc, boolean staticTyping) throws JsonMappingException
protected JsonSerializer<Object> findSerializerFromAnnotation(SerializerProvider prov, Annotated a) throws JsonMappingException
protected JsonSerializer<?> findConvertingSerializer(SerializerProvider prov, Annotated a, JsonSerializer<?> ser) throws JsonMappingException
protected Converter<Object, Object> findConverter(SerializerProvider prov, Annotated a) throws JsonMappingException
protected final JsonSerializer<?> buildContainerSerializer(SerializerProvider prov, JavaType type, BeanDescription beanDesc, BeanProperty property, boolean staticTyping) throws JsonMappingException
protected JsonSerializer<?> buildContainerSerializer(SerializerProvider prov, JavaType type, BeanDescription beanDesc, boolean staticTyping) throws JsonMappingException
protected final JsonSerializer<?> buildCollectionSerializer(SerializationConfig config, CollectionType type, BeanDescription beanDesc, BeanProperty property, boolean staticTyping, TypeSerializer elementTypeSerializer, JsonSerializer<Object> elementValueSerializer) throws JsonMappingException
protected JsonSerializer<?> buildCollectionSerializer(SerializationConfig config, CollectionType type, BeanDescription beanDesc, boolean staticTyping, TypeSerializer elementTypeSerializer, JsonSerializer<Object> elementValueSerializer) throws JsonMappingException
protected boolean isIndexedList(Class<?> cls)
protected JsonSerializer<?> buildMapSerializer(SerializationConfig config, MapType type, BeanDescription beanDesc, boolean staticTyping, JsonSerializer<Object> keySerializer, TypeSerializer elementTypeSerializer, JsonSerializer<Object> elementValueSerializer) throws JsonMappingException
protected JsonSerializer<?> buildArraySerializer(SerializationConfig config, ArrayType type, BeanDescription beanDesc, boolean staticTyping, TypeSerializer elementTypeSerializer, JsonSerializer<Object> elementValueSerializer) throws JsonMappingException
protected JsonSerializer<?> buildIteratorSerializer(SerializationConfig config, JavaType type, BeanDescription beanDesc, boolean staticTyping) throws JsonMappingException
protected JsonSerializer<?> buildIterableSerializer(SerializationConfig config, JavaType type, BeanDescription beanDesc, boolean staticTyping) throws JsonMappingException
protected JsonSerializer<?> buildEnumSerializer(SerializationConfig config, JavaType type, BeanDescription beanDesc) throws JsonMappingException
protected T modifyTypeByAnnotation(SerializationConfig config, Annotated a, T type)
protected static T modifySecondaryTypesByAnnotation(SerializationConfig config, Annotated a, T type)
protected JsonSerializer<Object> _findKeySerializer(SerializerProvider prov, Annotated a) throws JsonMappingException
protected JsonSerializer<Object> _findContentSerializer(SerializerProvider prov, Annotated a) throws JsonMappingException
protected final boolean usesStaticTyping(SerializationConfig config, BeanDescription beanDesc, TypeSerializer typeSer, BeanProperty property)
protected boolean usesStaticTyping(SerializationConfig config, BeanDescription beanDesc, TypeSerializer typeSer)
protected Class<?> _verifyAsClass(Object src, String methodName, Class<?> noneClass)
