public abstract TypeSerializer forProperty(BeanProperty prop)
public abstract JsonTypeInfo.As getTypeInclusion()
public abstract String getPropertyName()
public abstract TypeIdResolver getTypeIdResolver()
public abstract void writeTypePrefixForScalar(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException
public abstract void writeTypePrefixForObject(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException
public abstract void writeTypePrefixForArray(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException
public abstract void writeTypeSuffixForScalar(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException
public abstract void writeTypeSuffixForObject(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException
public abstract void writeTypeSuffixForArray(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException
public void writeTypePrefixForScalar(Object value, JsonGenerator jgen, Class<?> type) throws IOException, JsonProcessingException
public void writeTypePrefixForObject(Object value, JsonGenerator jgen, Class<?> type) throws IOException, JsonProcessingException
public void writeTypePrefixForArray(Object value, JsonGenerator jgen, Class<?> type) throws IOException, JsonProcessingException
public abstract void writeCustomTypePrefixForScalar(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException
public abstract void writeCustomTypePrefixForObject(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException
public abstract void writeCustomTypePrefixForArray(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException
public abstract void writeCustomTypeSuffixForScalar(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException
public abstract void writeCustomTypeSuffixForObject(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException
public abstract void writeCustomTypeSuffixForArray(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException
