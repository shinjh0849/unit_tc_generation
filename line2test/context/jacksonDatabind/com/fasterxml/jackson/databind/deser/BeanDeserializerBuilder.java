public BeanDeserializerBuilder(BeanDescription beanDesc, DeserializationConfig config)
protected BeanDeserializerBuilder(BeanDeserializerBuilder src)
private static HashMap<String, SettableBeanProperty> _copy(HashMap<String, SettableBeanProperty> src)
public void addOrReplaceProperty(SettableBeanProperty prop, boolean allowOverride)
public void addProperty(SettableBeanProperty prop)
public void addBackReferenceProperty(String referenceName, SettableBeanProperty prop)
public void addInjectable(String propertyName, JavaType propertyType, Annotations contextAnnotations, AnnotatedMember member, Object valueId)
public void addIgnorable(String propName)
public void addCreatorProperty(SettableBeanProperty prop)
public void addCreatorProperty(BeanPropertyDefinition propDef)
public void setAnySetter(SettableAnyProperty s)
public void setIgnoreUnknownProperties(boolean ignore)
public void setValueInstantiator(ValueInstantiator inst)
public void setObjectIdReader(ObjectIdReader r)
public void setPOJOBuilder(AnnotatedMethod buildMethod, JsonPOJOBuilder.Value config)
public Iterator<SettableBeanProperty> getProperties()
public SettableBeanProperty findProperty(String propertyName)
public boolean hasProperty(String propertyName)
public SettableBeanProperty removeProperty(String name)
public SettableAnyProperty getAnySetter()
public ValueInstantiator getValueInstantiator()
public List<ValueInjector> getInjectables()
public ObjectIdReader getObjectIdReader()
public AnnotatedMethod getBuildMethod()
public JsonPOJOBuilder.Value getBuilderConfig()
public JsonDeserializer<?> build()
public AbstractDeserializer buildAbstract()
public JsonDeserializer<?> buildBuilderBased(JavaType valueType, String expBuildMethodName)
BeanDescription _beanDesc
boolean _defaultViewInclusion
Map<String, SettableBeanProperty> _properties=Optional[new LinkedHashMap<String, SettableBeanProperty>()]
List<ValueInjector> _injectables
HashMap<String, SettableBeanProperty> _backRefProperties
HashSet<String> _ignorableProps
ValueInstantiator _valueInstantiator
ObjectIdReader _objectIdReader
SettableAnyProperty _anySetter
boolean _ignoreAllUnknown
AnnotatedMethod _buildMethod
JsonPOJOBuilder.Value _builderConfig
