public JSONWrappedObject(String prefix, String suffix, Object value)
public JSONWrappedObject(String prefix, String suffix, Object value, JavaType asType)
public void serializeWithType(JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonProcessingException
public void serialize(JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException
public String getPrefix()
public String getSuffix()
public Object getValue()
public JavaType getSerializationType()
