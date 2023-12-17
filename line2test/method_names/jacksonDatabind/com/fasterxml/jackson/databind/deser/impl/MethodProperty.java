public MethodProperty(BeanPropertyDefinition propDef, JavaType type, TypeDeserializer typeDeser, Annotations contextAnnotations, AnnotatedMethod method)
protected MethodProperty(MethodProperty src, JsonDeserializer<?> deser)
protected MethodProperty(MethodProperty src, String newName)
protected MethodProperty(MethodProperty src, Method m)
public MethodProperty withName(String newName)
public MethodProperty withValueDeserializer(JsonDeserializer<?> deser)
public A getAnnotation(Class<A> acls)
public AnnotatedMember getMember()
public void deserializeAndSet(JsonParser jp, DeserializationContext ctxt, Object instance) throws IOException, JsonProcessingException
public Object deserializeSetAndReturn(JsonParser jp, DeserializationContext ctxt, Object instance) throws IOException, JsonProcessingException
public final void set(Object instance, Object value) throws IOException
public Object setAndReturn(Object instance, Object value) throws IOException
 Object readResolve()
