protected TypeDeserializerBase(JavaType baseType, TypeIdResolver idRes, String typePropertyName, boolean typeIdVisible, Class<?> defaultImpl)
protected TypeDeserializerBase(TypeDeserializerBase src, BeanProperty property)
public abstract TypeDeserializer forProperty(BeanProperty prop)
public abstract JsonTypeInfo.As getTypeInclusion()
public String baseTypeName()
public final String getPropertyName()
public TypeIdResolver getTypeIdResolver()
public Class<?> getDefaultImpl()
public String toString()
protected final JsonDeserializer<Object> _findDeserializer(DeserializationContext ctxt, String typeId) throws IOException, JsonProcessingException
protected final JsonDeserializer<Object> _findDefaultImplDeserializer(DeserializationContext ctxt) throws IOException, JsonProcessingException
