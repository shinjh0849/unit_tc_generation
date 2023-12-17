public FieldProperty(BeanPropertyDefinition propDef, JavaType type, TypeDeserializer typeDeser, Annotations contextAnnotations, AnnotatedField field)
protected FieldProperty(FieldProperty src, JsonDeserializer<?> deser)
protected FieldProperty(FieldProperty src, String newName)
protected FieldProperty(FieldProperty src, Field f)
public FieldProperty withName(String newName)
public FieldProperty withValueDeserializer(JsonDeserializer<?> deser)
public A getAnnotation(Class<A> acls)
public AnnotatedMember getMember()
public void deserializeAndSet(JsonParser jp, DeserializationContext ctxt, Object instance) throws IOException, JsonProcessingException
public Object deserializeSetAndReturn(JsonParser jp, DeserializationContext ctxt, Object instance) throws IOException, JsonProcessingException
public final void set(Object instance, Object value) throws IOException
public Object setAndReturn(Object instance, Object value) throws IOException
 Object readResolve()
