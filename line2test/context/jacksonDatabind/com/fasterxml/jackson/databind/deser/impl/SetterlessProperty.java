public SetterlessProperty(BeanPropertyDefinition propDef, JavaType type, TypeDeserializer typeDeser, Annotations contextAnnotations, AnnotatedMethod method)
protected SetterlessProperty(SetterlessProperty src, JsonDeserializer<?> deser)
protected SetterlessProperty(SetterlessProperty src, String newName)
public SetterlessProperty withName(String newName)
public SetterlessProperty withValueDeserializer(JsonDeserializer<?> deser)
public A getAnnotation(Class<A> acls)
public AnnotatedMember getMember()
public final void deserializeAndSet(JsonParser jp, DeserializationContext ctxt, Object instance) throws IOException, JsonProcessingException
public Object deserializeSetAndReturn(JsonParser jp, DeserializationContext ctxt, Object instance) throws IOException, JsonProcessingException
public final void set(Object instance, Object value) throws IOException
public Object setAndReturn(Object instance, Object value) throws IOException
long serialVersionUID=Optional[1L]
AnnotatedMethod _annotated
Method _getter
