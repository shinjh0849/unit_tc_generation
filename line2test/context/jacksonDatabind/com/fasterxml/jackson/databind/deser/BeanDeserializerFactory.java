public BeanDeserializerFactory(DeserializerFactoryConfig config)
public DeserializerFactory withConfig(DeserializerFactoryConfig config)
protected JsonDeserializer<Object> _findCustomBeanDeserializer(JavaType type, DeserializationConfig config, BeanDescription beanDesc) throws JsonMappingException
public JsonDeserializer<Object> createBeanDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) throws JsonMappingException
public JsonDeserializer<Object> createBuilderBasedDeserializer(DeserializationContext ctxt, JavaType valueType, BeanDescription beanDesc, Class<?> builderClass) throws JsonMappingException
protected JsonDeserializer<?> findStdDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) throws JsonMappingException
protected JsonDeserializer<?> findOptionalStdDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) throws JsonMappingException
protected JavaType materializeAbstractType(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) throws JsonMappingException
public JsonDeserializer<Object> buildBeanDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) throws JsonMappingException
protected JsonDeserializer<Object> buildBuilderBasedDeserializer(DeserializationContext ctxt, JavaType valueType, BeanDescription builderDesc) throws JsonMappingException
protected void addObjectIdReader(DeserializationContext ctxt, BeanDescription beanDesc, BeanDeserializerBuilder builder) throws JsonMappingException
public JsonDeserializer<Object> buildThrowableDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) throws JsonMappingException
protected BeanDeserializerBuilder constructBeanDeserializerBuilder(DeserializationContext ctxt, BeanDescription beanDesc)
protected void addBeanProps(DeserializationContext ctxt, BeanDescription beanDesc, BeanDeserializerBuilder builder) throws JsonMappingException
protected List<BeanPropertyDefinition> filterBeanProps(DeserializationContext ctxt, BeanDescription beanDesc, BeanDeserializerBuilder builder, List<BeanPropertyDefinition> propDefsIn, Set<String> ignored) throws JsonMappingException
protected void addReferenceProperties(DeserializationContext ctxt, BeanDescription beanDesc, BeanDeserializerBuilder builder) throws JsonMappingException
protected void addInjectables(DeserializationContext ctxt, BeanDescription beanDesc, BeanDeserializerBuilder builder) throws JsonMappingException
protected SettableAnyProperty constructAnySetter(DeserializationContext ctxt, BeanDescription beanDesc, AnnotatedMethod setter) throws JsonMappingException
protected SettableBeanProperty constructSettableProperty(DeserializationContext ctxt, BeanDescription beanDesc, BeanPropertyDefinition propDef, Type jdkType) throws JsonMappingException
protected SettableBeanProperty constructSetterlessProperty(DeserializationContext ctxt, BeanDescription beanDesc, BeanPropertyDefinition propDef) throws JsonMappingException
protected boolean isPotentialBeanType(Class<?> type)
protected boolean isIgnorableType(DeserializationConfig config, BeanDescription beanDesc, Class<?> type, Map<Class<?>, Boolean> ignoredTypes)
long serialVersionUID=Optional[1]
Class<?>[] INIT_CAUSE_PARAMS=Optional[new Class<?>[] { Throwable.class }]
Class<?>[] NO_VIEWS=Optional[new Class<?>[0]]
BeanDeserializerFactory instance=Optional[new BeanDeserializerFactory(new DeserializerFactoryConfig())]
