public InnerClassProperty(SettableBeanProperty delegate, Constructor<?> ctor)
protected InnerClassProperty(InnerClassProperty src, JsonDeserializer<?> deser)
protected InnerClassProperty(InnerClassProperty src, String newName)
public InnerClassProperty withName(String newName)
public InnerClassProperty withValueDeserializer(JsonDeserializer<?> deser)
public A getAnnotation(Class<A> acls)
public AnnotatedMember getMember()
public void deserializeAndSet(JsonParser jp, DeserializationContext ctxt, Object bean) throws IOException, JsonProcessingException
public Object deserializeSetAndReturn(JsonParser jp, DeserializationContext ctxt, Object instance) throws IOException, JsonProcessingException
public final void set(Object instance, Object value) throws IOException
public Object setAndReturn(Object instance, Object value) throws IOException
long serialVersionUID=Optional[1L]
SettableBeanProperty _delegate
Constructor<?> _creator
