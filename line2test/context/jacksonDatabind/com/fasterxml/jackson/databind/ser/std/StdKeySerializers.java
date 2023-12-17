private StdKeySerializers()
public StringKeySerializer()
public DateKeySerializer()
public CalendarKeySerializer()
public static JsonSerializer<Object> getStdKeySerializer(JavaType keyType)
public void serialize(String value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public void serialize(Date value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public void serialize(Calendar value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
JsonSerializer<Object> DEFAULT_KEY_SERIALIZER=Optional[new StdKeySerializer()]
JsonSerializer<Object> DEFAULT_STRING_SERIALIZER=Optional[(JsonSerializer<Object>) (JsonSerializer<?>) new StringKeySerializer()]
