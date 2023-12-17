public CreatorProperty(String name, JavaType type, TypeDeserializer typeDeser, Annotations contextAnnotations, AnnotatedParameter param, int index, Object injectableValueId)
public CreatorProperty(String name, JavaType type, PropertyName wrapperName, TypeDeserializer typeDeser, Annotations contextAnnotations, AnnotatedParameter param, int index, Object injectableValueId, boolean isRequired)
protected CreatorProperty(CreatorProperty src, String newName)
protected CreatorProperty(CreatorProperty src, JsonDeserializer<?> deser)
public CreatorProperty withName(String newName)
public CreatorProperty withValueDeserializer(JsonDeserializer<?> deser)
public Object findInjectableValue(DeserializationContext context, Object beanInstance)
public void inject(DeserializationContext context, Object beanInstance) throws IOException
public A getAnnotation(Class<A> acls)
public AnnotatedMember getMember()
public int getCreatorIndex()
public void deserializeAndSet(JsonParser jp, DeserializationContext ctxt, Object instance) throws IOException, JsonProcessingException
public Object deserializeSetAndReturn(JsonParser jp, DeserializationContext ctxt, Object instance) throws IOException, JsonProcessingException
public void set(Object instance, Object value) throws IOException
public Object setAndReturn(Object instance, Object value) throws IOException
public Object getInjectableValueId()
public String toString()
