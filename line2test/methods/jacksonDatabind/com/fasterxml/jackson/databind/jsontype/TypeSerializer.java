public abstract TypeSerializer forProperty(BeanProperty prop); <line_num>: 37,37
public abstract JsonTypeInfo.As getTypeInclusion(); <line_num>: 50,50
public abstract String getPropertyName(); <line_num>: 56,56
public abstract TypeIdResolver getTypeIdResolver(); <line_num>: 62,62
public abstract void writeTypePrefixForScalar(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException; <line_num>: 81,82
public abstract void writeTypePrefixForObject(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException; <line_num>: 95,96
public abstract void writeTypePrefixForArray(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException; <line_num>: 109,110
public abstract void writeTypeSuffixForScalar(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException; <line_num>: 118,119
public abstract void writeTypeSuffixForObject(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException; <line_num>: 127,128
public abstract void writeTypeSuffixForArray(Object value, JsonGenerator jgen) throws IOException, JsonProcessingException; <line_num>: 136,137
public void writeTypePrefixForScalar(Object value, JsonGenerator jgen, Class<?> type) throws IOException, JsonProcessingException { [EOL]     writeTypePrefixForScalar(value, jgen); [EOL] } <line_num>: 144,149
public void writeTypePrefixForObject(Object value, JsonGenerator jgen, Class<?> type) throws IOException, JsonProcessingException { [EOL]     writeTypePrefixForObject(value, jgen); [EOL] } <line_num>: 156,161
public void writeTypePrefixForArray(Object value, JsonGenerator jgen, Class<?> type) throws IOException, JsonProcessingException { [EOL]     writeTypePrefixForArray(value, jgen); [EOL] } <line_num>: 168,173
public abstract void writeCustomTypePrefixForScalar(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException; <line_num>: 194,196
public abstract void writeCustomTypePrefixForObject(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException; <line_num>: 211,213
public abstract void writeCustomTypePrefixForArray(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException; <line_num>: 215,217
public abstract void writeCustomTypeSuffixForScalar(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException; <line_num>: 219,221
public abstract void writeCustomTypeSuffixForObject(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException; <line_num>: 223,225
public abstract void writeCustomTypeSuffixForArray(Object value, JsonGenerator jgen, String typeId) throws IOException, JsonProcessingException; <line_num>: 227,229
