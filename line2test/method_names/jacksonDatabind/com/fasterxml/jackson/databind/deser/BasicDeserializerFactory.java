protected BasicDeserializerFactory(DeserializerFactoryConfig config)
public DeserializerFactoryConfig getFactoryConfig()
protected abstract DeserializerFactory withConfig(DeserializerFactoryConfig config)
public final DeserializerFactory withAdditionalDeserializers(Deserializers additional)
public final DeserializerFactory withAdditionalKeyDeserializers(KeyDeserializers additional)
public final DeserializerFactory withDeserializerModifier(BeanDeserializerModifier modifier)
public final DeserializerFactory withAbstractTypeResolver(AbstractTypeResolver resolver)
public final DeserializerFactory withValueInstantiators(ValueInstantiators instantiators)
public JavaType mapAbstractType(DeserializationConfig config, JavaType type) throws JsonMappingException
private JavaType _mapAbstractType2(DeserializationConfig config, JavaType type) throws JsonMappingException
public ValueInstantiator findValueInstantiator(DeserializationContext ctxt, BeanDescription beanDesc) throws JsonMappingException
private ValueInstantiator _findStdValueInstantiator(DeserializationConfig config, BeanDescription beanDesc) throws JsonMappingException
protected ValueInstantiator _constructDefaultValueInstantiator(DeserializationContext ctxt, BeanDescription beanDesc) throws JsonMappingException
public ValueInstantiator _valueInstantiatorInstance(DeserializationConfig config, Annotated annotated, Object instDef) throws JsonMappingException
protected void _addDeserializerConstructors(DeserializationContext ctxt, BeanDescription beanDesc, VisibilityChecker<?> vchecker, AnnotationIntrospector intr, CreatorCollector creators) throws JsonMappingException
protected boolean _handleSingleArgumentConstructor(DeserializationContext ctxt, BeanDescription beanDesc, VisibilityChecker<?> vchecker, AnnotationIntrospector intr, CreatorCollector creators, AnnotatedConstructor ctor, boolean isCreator, boolean isVisible, String name) throws JsonMappingException
protected void _addDeserializerFactoryMethods(DeserializationContext ctxt, BeanDescription beanDesc, VisibilityChecker<?> vchecker, AnnotationIntrospector intr, CreatorCollector creators) throws JsonMappingException
protected boolean _handleSingleArgumentFactory(DeserializationConfig config, BeanDescription beanDesc, VisibilityChecker<?> vchecker, AnnotationIntrospector intr, CreatorCollector creators, AnnotatedMethod factory, boolean isCreator) throws JsonMappingException
protected CreatorProperty constructCreatorProperty(DeserializationContext ctxt, BeanDescription beanDesc, String name, int index, AnnotatedParameter param, Object injectableValueId) throws JsonMappingException
public JsonDeserializer<?> createArrayDeserializer(DeserializationContext ctxt, ArrayType type, final BeanDescription beanDesc) throws JsonMappingException
protected JsonDeserializer<?> _findCustomArrayDeserializer(ArrayType type, DeserializationConfig config, BeanDescription beanDesc, TypeDeserializer elementTypeDeserializer, JsonDeserializer<?> elementDeserializer) throws JsonMappingException
public JsonDeserializer<?> createCollectionDeserializer(DeserializationContext ctxt, CollectionType type, BeanDescription beanDesc) throws JsonMappingException
protected CollectionType _mapAbstractCollectionType(JavaType type, DeserializationConfig config)
protected JsonDeserializer<?> _findCustomCollectionDeserializer(CollectionType type, DeserializationConfig config, BeanDescription beanDesc, TypeDeserializer elementTypeDeserializer, JsonDeserializer<?> elementDeserializer) throws JsonMappingException
public JsonDeserializer<?> createCollectionLikeDeserializer(DeserializationContext ctxt, CollectionLikeType type, final BeanDescription beanDesc) throws JsonMappingException
protected JsonDeserializer<?> _findCustomCollectionLikeDeserializer(CollectionLikeType type, DeserializationConfig config, BeanDescription beanDesc, TypeDeserializer elementTypeDeserializer, JsonDeserializer<?> elementDeserializer) throws JsonMappingException
public JsonDeserializer<?> createMapDeserializer(DeserializationContext ctxt, MapType type, BeanDescription beanDesc) throws JsonMappingException
public JsonDeserializer<?> createMapLikeDeserializer(DeserializationContext ctxt, MapLikeType type, final BeanDescription beanDesc) throws JsonMappingException
protected JsonDeserializer<?> _findCustomMapDeserializer(MapType type, DeserializationConfig config, BeanDescription beanDesc, KeyDeserializer keyDeserializer, TypeDeserializer elementTypeDeserializer, JsonDeserializer<?> elementDeserializer) throws JsonMappingException
protected JsonDeserializer<?> _findCustomMapLikeDeserializer(MapLikeType type, DeserializationConfig config, BeanDescription beanDesc, KeyDeserializer keyDeserializer, TypeDeserializer elementTypeDeserializer, JsonDeserializer<?> elementDeserializer) throws JsonMappingException
public JsonDeserializer<?> createEnumDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) throws JsonMappingException
protected JsonDeserializer<?> _findCustomEnumDeserializer(Class<?> type, DeserializationConfig config, BeanDescription beanDesc) throws JsonMappingException
public JsonDeserializer<?> createTreeDeserializer(DeserializationConfig config, JavaType nodeType, BeanDescription beanDesc) throws JsonMappingException
protected JsonDeserializer<?> _findCustomTreeNodeDeserializer(Class<? extends JsonNode> type, DeserializationConfig config, BeanDescription beanDesc) throws JsonMappingException
public TypeDeserializer findTypeDeserializer(DeserializationConfig config, JavaType baseType) throws JsonMappingException
public KeyDeserializer createKeyDeserializer(DeserializationContext ctxt, JavaType type) throws JsonMappingException
private KeyDeserializer _createEnumKeyDeserializer(DeserializationContext ctxt, JavaType type) throws JsonMappingException
public TypeDeserializer findPropertyTypeDeserializer(DeserializationConfig config, JavaType baseType, AnnotatedMember annotated) throws JsonMappingException
public TypeDeserializer findPropertyContentTypeDeserializer(DeserializationConfig config, JavaType containerType, AnnotatedMember propertyEntity) throws JsonMappingException
public JsonDeserializer<?> findDefaultDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) throws JsonMappingException
protected JsonDeserializer<Object> findDeserializerFromAnnotation(DeserializationContext ctxt, Annotated ann) throws JsonMappingException
protected T modifyTypeByAnnotation(DeserializationContext ctxt, Annotated a, T type) throws JsonMappingException
protected JavaType resolveType(DeserializationContext ctxt, BeanDescription beanDesc, JavaType type, AnnotatedMember member) throws JsonMappingException
protected EnumResolver<?> constructEnumResolver(Class<?> enumClass, DeserializationConfig config, AnnotatedMethod jsonValueMethod)
protected AnnotatedMethod _findJsonValueFor(DeserializationConfig config, JavaType enumType)
