public AsPropertyTypeSerializer(TypeIdResolver idRes, BeanProperty property, String propName)
public AsPropertyTypeSerializer forProperty(BeanProperty prop)
public String getPropertyName()
public As getTypeInclusion()
public void writeTypePrefixForObject(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException
public void writeTypePrefixForObject(Object value, JsonGenerator jgen, Class<?> type) throws IOException, JsonProcessingException
public void writeTypeSuffixForObject(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException
public void writeCustomTypePrefixForObject(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException
public void writeCustomTypeSuffixForObject(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException
String _typePropertyName
