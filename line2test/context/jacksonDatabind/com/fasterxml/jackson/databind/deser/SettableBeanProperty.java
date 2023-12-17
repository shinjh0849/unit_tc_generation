protected SettableBeanProperty(BeanPropertyDefinition propDef, JavaType type, TypeDeserializer typeDeser, Annotations contextAnnotations)
protected SettableBeanProperty(String propName, JavaType type, PropertyName wrapper, TypeDeserializer typeDeser, Annotations contextAnnotations)
protected SettableBeanProperty(String propName, JavaType type, PropertyName wrapper, TypeDeserializer typeDeser, Annotations contextAnnotations, boolean isRequired)
protected SettableBeanProperty(SettableBeanProperty src)
protected SettableBeanProperty(SettableBeanProperty src, JsonDeserializer<?> deser)
protected SettableBeanProperty(SettableBeanProperty src, String newName)
public abstract SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser)
public abstract SettableBeanProperty withName(String newName)
public void setManagedReferenceName(String n)
public void setViews(Class<?>[] views)
public void assignIndex(int index)
public final String getName()
public boolean isRequired()
public JavaType getType()
public PropertyName getWrapperName()
public abstract A getAnnotation(Class<A> acls)
public abstract AnnotatedMember getMember()
public A getContextAnnotation(Class<A> acls)
public void depositSchemaProperty(JsonObjectFormatVisitor objectVisitor) throws JsonMappingException
protected final Class<?> getDeclaringClass()
public String getManagedReferenceName()
public boolean hasValueDeserializer()
public boolean hasValueTypeDeserializer()
public JsonDeserializer<Object> getValueDeserializer()
public TypeDeserializer getValueTypeDeserializer()
public boolean visibleInView(Class<?> activeView)
public boolean hasViews()
public int getPropertyIndex()
public int getCreatorIndex()
public Object getInjectableValueId()
public abstract void deserializeAndSet(JsonParser jp, DeserializationContext ctxt, Object instance) throws IOException, JsonProcessingException
public abstract Object deserializeSetAndReturn(JsonParser jp, DeserializationContext ctxt, Object instance) throws IOException, JsonProcessingException
public abstract void set(Object instance, Object value) throws IOException
public abstract Object setAndReturn(Object instance, Object value) throws IOException
public final Object deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected void _throwAsIOE(Exception e, Object value) throws IOException
protected IOException _throwAsIOE(Exception e) throws IOException
public String toString()
long serialVersionUID=Optional[-1026580169193933453L]
JsonDeserializer<Object> MISSING_VALUE_DESERIALIZER=Optional[new FailingDeserializer("No _valueDeserializer assigned")]
String _propName
JavaType _type
PropertyName _wrapperName
Annotations _contextAnnotations
JsonDeserializer<Object> _valueDeserializer
TypeDeserializer _valueTypeDeserializer
NullProvider _nullProvider
String _managedReferenceName
ViewMatcher _viewMatcher
int _propertyIndex=Optional[-1]
boolean _isRequired
