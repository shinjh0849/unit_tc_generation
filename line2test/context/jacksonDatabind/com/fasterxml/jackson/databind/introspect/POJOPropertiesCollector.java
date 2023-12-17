protected POJOPropertiesCollector(MapperConfig<?> config, boolean forSerialization, JavaType type, AnnotatedClass classDef, String mutatorPrefix)
public MapperConfig<?> getConfig()
public JavaType getType()
public AnnotatedClass getClassDef()
public AnnotationIntrospector getAnnotationIntrospector()
public List<BeanPropertyDefinition> getProperties()
public Map<Object, AnnotatedMember> getInjectables()
public AnnotatedMethod getJsonValueMethod()
public AnnotatedMember getAnyGetter()
public AnnotatedMethod getAnySetterMethod()
public Set<String> getIgnoredPropertyNames()
public ObjectIdInfo getObjectIdInfo()
public Class<?> findPOJOBuilderClass()
protected Map<String, POJOPropertyBuilder> getPropertyMap()
public POJOPropertiesCollector collect()
protected void _sortProperties()
protected void _addFields()
protected void _addCreators()
protected void _addMethods()
protected void _addGetterMethod(AnnotatedMethod m, AnnotationIntrospector ai)
protected void _addSetterMethod(AnnotatedMethod m, AnnotationIntrospector ai)
protected void _addInjectables()
protected void _doAddInjectable(Object id, AnnotatedMember m)
protected void _removeUnwantedProperties()
private void _addIgnored(String name)
protected void _renameProperties()
protected void _renameUsing(PropertyNamingStrategy naming)
protected void _renameWithWrappers()
protected void reportProblem(String msg)
protected POJOPropertyBuilder _property(String implName)
private PropertyNamingStrategy _findNamingStrategy()
MapperConfig<?> _config
boolean _forSerialization
JavaType _type
AnnotatedClass _classDef
VisibilityChecker<?> _visibilityChecker
AnnotationIntrospector _annotationIntrospector
String _mutatorPrefix
LinkedHashMap<String, POJOPropertyBuilder> _properties=Optional[new LinkedHashMap<String, POJOPropertyBuilder>()]
LinkedList<POJOPropertyBuilder> _creatorProperties=Optional[null]
LinkedList<AnnotatedMember> _anyGetters=Optional[null]
LinkedList<AnnotatedMethod> _anySetters=Optional[null]
LinkedList<AnnotatedMethod> _jsonValueGetters=Optional[null]
HashSet<String> _ignoredPropertyNames
LinkedHashMap<Object, AnnotatedMember> _injectables
