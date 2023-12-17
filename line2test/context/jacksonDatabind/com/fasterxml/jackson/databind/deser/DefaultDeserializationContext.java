protected DefaultDeserializationContext(DeserializerFactory df, DeserializerCache cache)
protected DefaultDeserializationContext(DefaultDeserializationContext src, DeserializationConfig config, JsonParser jp, InjectableValues values)
protected DefaultDeserializationContext(DefaultDeserializationContext src, DeserializerFactory factory)
public Impl(DeserializerFactory df)
protected Impl(Impl src, DeserializationConfig config, JsonParser jp, InjectableValues values)
protected Impl(Impl src, DeserializerFactory factory)
public ReadableObjectId findObjectId(Object id, ObjectIdGenerator<?> generator)
public JsonDeserializer<Object> deserializerInstance(Annotated annotated, Object deserDef) throws JsonMappingException
public final KeyDeserializer keyDeserializerInstance(Annotated annotated, Object deserDef) throws JsonMappingException
public abstract DefaultDeserializationContext with(DeserializerFactory factory)
public abstract DefaultDeserializationContext createInstance(DeserializationConfig config, JsonParser jp, InjectableValues values)
public DefaultDeserializationContext createInstance(DeserializationConfig config, JsonParser jp, InjectableValues values)
public DefaultDeserializationContext with(DeserializerFactory factory)
long serialVersionUID=Optional[1L]
LinkedHashMap<ObjectIdGenerator.IdKey, ReadableObjectId> _objectIds
