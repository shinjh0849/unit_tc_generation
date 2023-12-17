public SettableAnyProperty(BeanProperty property, AnnotatedMethod setter, JavaType type, JsonDeserializer<Object> valueDeser)
public SettableAnyProperty(BeanProperty property, Method rawSetter, JavaType type, JsonDeserializer<Object> valueDeser)
public SettableAnyProperty withValueDeserializer(JsonDeserializer<Object> deser)
public BeanProperty getProperty()
public boolean hasValueDeserializer()
public JavaType getType()
public final void deserializeAndSet(JsonParser jp, DeserializationContext ctxt, Object instance, String propName) throws IOException, JsonProcessingException
public final Object deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public final void set(Object instance, String propName, Object value) throws IOException
protected void _throwAsIOE(Exception e, String propName, Object value) throws IOException
private String getClassName()
public String toString()
BeanProperty _property
Method _setter
JavaType _type
JsonDeserializer<Object> _valueDeserializer
