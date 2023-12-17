protected DefaultSerializerProvider()
protected DefaultSerializerProvider(SerializerProvider src, SerializationConfig config, SerializerFactory f)
public Impl()
protected Impl(SerializerProvider src, SerializationConfig config, SerializerFactory f)
public abstract DefaultSerializerProvider createInstance(SerializationConfig config, SerializerFactory jsf)
public void serializeValue(JsonGenerator jgen, Object value) throws IOException, JsonGenerationException
public void serializeValue(JsonGenerator jgen, Object value, JavaType rootType) throws IOException, JsonGenerationException
public void serializeValue(JsonGenerator jgen, Object value, JavaType rootType, JsonSerializer<Object> ser) throws IOException, JsonGenerationException
public com.fasterxml.jackson.databind.jsonschema.JsonSchema generateJsonSchema(Class<?> type) throws JsonMappingException
public void acceptJsonFormatVisitor(JavaType javaType, JsonFormatVisitorWrapper visitor) throws JsonMappingException
public boolean hasSerializerFor(Class<?> cls)
public int cachedSerializersCount()
public void flushCachedSerializers()
public WritableObjectId findObjectId(Object forPojo, ObjectIdGenerator<?> generatorType)
public JsonSerializer<Object> serializerInstance(Annotated annotated, Object serDef) throws JsonMappingException
public Impl createInstance(SerializationConfig config, SerializerFactory jsf)
long serialVersionUID=Optional[1L]
IdentityHashMap<Object, WritableObjectId> _seenObjectIds
ArrayList<ObjectIdGenerator<?>> _objectIdGenerators
