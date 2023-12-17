public AsArrayTypeSerializer(TypeIdResolver idRes, BeanProperty property)
public AsArrayTypeSerializer forProperty(BeanProperty prop)
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
public void writeCustomTypePrefixForObject(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException
public void writeCustomTypePrefixForArray(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException
public void writeCustomTypePrefixForScalar(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException
public void writeCustomTypeSuffixForObject(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException
public void writeCustomTypeSuffixForArray(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException
public void writeCustomTypeSuffixForScalar(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException
