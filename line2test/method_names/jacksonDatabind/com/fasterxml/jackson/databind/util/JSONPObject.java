public JSONPObject(String function, Object value)
public JSONPObject(String function, Object value, JavaType asType)
public void serializeWithType(JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonProcessingException
public void serialize(JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException
public String getFunction()
public Object getValue()
public JavaType getSerializationType()
