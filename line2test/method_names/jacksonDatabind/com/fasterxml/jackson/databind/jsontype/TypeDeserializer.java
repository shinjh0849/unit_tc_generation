public abstract TypeDeserializer forProperty(BeanProperty prop)
public abstract As getTypeInclusion()
public abstract String getPropertyName()
public abstract TypeIdResolver getTypeIdResolver()
public abstract Class<?> getDefaultImpl()
public abstract Object deserializeTypedFromObject(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public abstract Object deserializeTypedFromArray(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public abstract Object deserializeTypedFromScalar(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public abstract Object deserializeTypedFromAny(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
public static Object deserializeIfNatural(JsonParser jp, DeserializationContext ctxt, JavaType baseType) throws IOException, JsonProcessingException
public static Object deserializeIfNatural(JsonParser jp, DeserializationContext ctxt, Class<?> base) throws IOException, JsonProcessingException
