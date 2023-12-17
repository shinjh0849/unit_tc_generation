public AsExternalTypeSerializer(TypeIdResolver idRes, BeanProperty property, String propName)
public AsExternalTypeSerializer forProperty(BeanProperty prop)
public String getPropertyName()
public As getTypeInclusion()
public void writeTypePrefixForObject(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException
public void writeTypePrefixForObject(Object value, JsonGenerator jgen, Class<?> type) throws IOException, JsonProcessingException
public void writeTypePrefixForArray(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException
public void writeTypePrefixForArray(Object value, JsonGenerator jgen, Class<?> type) throws IOException, JsonProcessingException
public void writeTypePrefixForScalar(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException
public void writeTypePrefixForScalar(Object value, JsonGenerator jgen, Class<?> type) throws IOException, JsonProcessingException
public void writeTypeSuffixForObject(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException
public void writeTypeSuffixForArray(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException
public void writeTypeSuffixForScalar(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException
public void writeCustomTypePrefixForScalar(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException
public void writeCustomTypePrefixForObject(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException
public void writeCustomTypePrefixForArray(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException
public void writeCustomTypeSuffixForScalar(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException
public void writeCustomTypeSuffixForObject(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException
public void writeCustomTypeSuffixForArray(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException
protected final void _writeScalarPrefix(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException
protected final void _writeObjectPrefix(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException
protected final void _writeArrayPrefix(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException
protected final void _writeScalarSuffix(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException
protected final void _writeObjectSuffix(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException
protected final void _writeArraySuffix(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException
String _typePropertyName
