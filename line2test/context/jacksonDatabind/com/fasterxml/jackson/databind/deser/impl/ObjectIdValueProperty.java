public ObjectIdValueProperty(ObjectIdReader objectIdReader)
public ObjectIdValueProperty(ObjectIdReader objectIdReader, boolean isRequired)
protected ObjectIdValueProperty(ObjectIdValueProperty src, JsonDeserializer<?> deser)
protected ObjectIdValueProperty(ObjectIdValueProperty src, String newName)
public ObjectIdValueProperty withName(String newName)
public ObjectIdValueProperty withValueDeserializer(JsonDeserializer<?> deser)
public A getAnnotation(Class<A> acls)
public AnnotatedMember getMember()
public void deserializeAndSet(JsonParser jp, DeserializationContext ctxt, Object instance) throws IOException, JsonProcessingException
public Object deserializeSetAndReturn(JsonParser jp, DeserializationContext ctxt, Object instance) throws IOException, JsonProcessingException
public void set(Object instance, Object value) throws IOException
public Object setAndReturn(Object instance, Object value) throws IOException
long serialVersionUID=Optional[1L]
ObjectIdReader _objectIdReader
