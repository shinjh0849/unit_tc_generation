protected BeanSerializerFactory(SerializerFactoryConfig config)
public SerializerFactory withConfig(SerializerFactoryConfig config)
protected Iterable<Serializers> customSerializers()
public JsonSerializer<Object> createSerializer(SerializerProvider prov, JavaType origType) throws JsonMappingException
protected JsonSerializer<?> _createSerializer2(SerializerProvider prov, JavaType type, BeanDescription beanDesc, boolean staticTyping) throws JsonMappingException
public final JsonSerializer<Object> findBeanSerializer(SerializerProvider prov, JavaType type, BeanDescription beanDesc, BeanProperty property) throws JsonMappingException
public JsonSerializer<Object> findBeanSerializer(SerializerProvider prov, JavaType type, BeanDescription beanDesc) throws JsonMappingException
public final TypeSerializer findPropertyTypeSerializer(JavaType baseType, SerializationConfig config, AnnotatedMember accessor, BeanProperty property) throws JsonMappingException
public TypeSerializer findPropertyTypeSerializer(JavaType baseType, SerializationConfig config, AnnotatedMember accessor) throws JsonMappingException
public TypeSerializer findPropertyContentTypeSerializer(JavaType containerType, SerializationConfig config, AnnotatedMember accessor) throws JsonMappingException
protected final JsonSerializer<Object> constructBeanSerializer(SerializerProvider prov, BeanDescription beanDesc, BeanProperty property) throws JsonMappingException
protected JsonSerializer<Object> constructBeanSerializer(SerializerProvider prov, BeanDescription beanDesc) throws JsonMappingException
protected ObjectIdWriter constructObjectIdHandler(SerializerProvider prov, BeanDescription beanDesc, List<BeanPropertyWriter> props) throws JsonMappingException
protected BeanPropertyWriter constructFilteredBeanWriter(BeanPropertyWriter writer, Class<?>[] inViews)
protected PropertyBuilder constructPropertyBuilder(SerializationConfig config, BeanDescription beanDesc)
protected BeanSerializerBuilder constructBeanSerializerBuilder(BeanDescription beanDesc)
protected Object findFilterId(SerializationConfig config, BeanDescription beanDesc)
protected boolean isPotentialBeanType(Class<?> type)
protected List<BeanPropertyWriter> findBeanProperties(SerializerProvider prov, BeanDescription beanDesc, BeanSerializerBuilder builder) throws JsonMappingException
protected List<BeanPropertyWriter> filterBeanProperties(SerializationConfig config, BeanDescription beanDesc, List<BeanPropertyWriter> props)
protected void processViews(SerializationConfig config, BeanSerializerBuilder builder)
protected void removeIgnorableTypes(SerializationConfig config, BeanDescription beanDesc, List<BeanPropertyDefinition> properties)
protected void removeSetterlessGetters(SerializationConfig config, BeanDescription beanDesc, List<BeanPropertyDefinition> properties)
protected BeanPropertyWriter _constructWriter(SerializerProvider prov, BeanPropertyDefinition propDef, TypeBindings typeContext, PropertyBuilder pb, boolean staticTyping, AnnotatedMember accessor) throws JsonMappingException
long serialVersionUID=Optional[1]
BeanSerializerFactory instance=Optional[new BeanSerializerFactory(null)]
