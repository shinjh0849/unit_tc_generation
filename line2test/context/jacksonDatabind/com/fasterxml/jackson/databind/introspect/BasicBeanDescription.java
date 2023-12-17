protected BasicBeanDescription(MapperConfig<?> config, JavaType type, AnnotatedClass classDef, List<BeanPropertyDefinition> props)
protected BasicBeanDescription(POJOPropertiesCollector coll)
public static BasicBeanDescription forDeserialization(POJOPropertiesCollector coll)
public static BasicBeanDescription forSerialization(POJOPropertiesCollector coll)
public static BasicBeanDescription forOtherUse(MapperConfig<?> config, JavaType type, AnnotatedClass ac)
public boolean removeProperty(String propName)
public AnnotatedClass getClassInfo()
public ObjectIdInfo getObjectIdInfo()
public List<BeanPropertyDefinition> findProperties()
public AnnotatedMethod findJsonValueMethod()
public Set<String> getIgnoredPropertyNames()
public boolean hasKnownClassAnnotations()
public Annotations getClassAnnotations()
public TypeBindings bindingsForBeanType()
public JavaType resolveType(java.lang.reflect.Type jdkType)
public AnnotatedConstructor findDefaultConstructor()
public AnnotatedMethod findAnySetter() throws IllegalArgumentException
public Map<Object, AnnotatedMember> findInjectables()
public List<AnnotatedConstructor> getConstructors()
public Object instantiateBean(boolean fixAccess)
public AnnotatedMethod findMethod(String name, Class<?>[] paramTypes)
public JsonFormat.Value findExpectedFormat(JsonFormat.Value defValue)
public Converter<Object, Object> findSerializationConverter()
public JsonInclude.Include findSerializationInclusion(JsonInclude.Include defValue)
public AnnotatedMember findAnyGetter() throws IllegalArgumentException
public Map<String, AnnotatedMember> findBackReferenceProperties()
public List<AnnotatedMethod> getFactoryMethods()
public Constructor<?> findSingleArgConstructor(Class<?>... argTypes)
public Method findFactoryMethod(Class<?>... expArgTypes)
protected boolean isFactoryMethod(AnnotatedMethod am)
public List<String> findCreatorPropertyNames()
public Class<?> findPOJOBuilder()
public JsonPOJOBuilder.Value findPOJOBuilderConfig()
public Converter<Object, Object> findDeserializationConverter()
public LinkedHashMap<String, AnnotatedField> _findPropertyFields(Collection<String> ignoredProperties, boolean forSerialization)
public Converter<Object, Object> _createConverter(Object converterDef)
MapperConfig<?> _config
AnnotationIntrospector _annotationIntrospector
AnnotatedClass _classInfo
TypeBindings _bindings
List<BeanPropertyDefinition> _properties
ObjectIdInfo _objectIdInfo
AnnotatedMethod _anySetterMethod
Map<Object, AnnotatedMember> _injectables
Set<String> _ignoredPropertyNames
AnnotatedMethod _jsonValueMethod
AnnotatedMember _anyGetter
