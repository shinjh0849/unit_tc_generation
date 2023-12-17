public ManagedReferenceProperty(SettableBeanProperty forward, String refName, SettableBeanProperty backward, Annotations contextAnnotations, boolean isContainer)
protected ManagedReferenceProperty(ManagedReferenceProperty src, JsonDeserializer<?> deser)
protected ManagedReferenceProperty(ManagedReferenceProperty src, String newName)
public ManagedReferenceProperty withName(String newName)
public ManagedReferenceProperty withValueDeserializer(JsonDeserializer<?> deser)
public A getAnnotation(Class<A> acls)
public AnnotatedMember getMember()
public void deserializeAndSet(JsonParser jp, DeserializationContext ctxt, Object instance) throws IOException, JsonProcessingException
public Object deserializeSetAndReturn(JsonParser jp, DeserializationContext ctxt, Object instance) throws IOException, JsonProcessingException
public final void set(Object instance, Object value) throws IOException
public Object setAndReturn(Object instance, Object value) throws IOException
long serialVersionUID=Optional[1L]
String _referenceName
boolean _isContainer
SettableBeanProperty _managedProperty
SettableBeanProperty _backProperty
