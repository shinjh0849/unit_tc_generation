private StdKeySerializers()
public StringKeySerializer()
public DateKeySerializer()
public CalendarKeySerializer()
public static JsonSerializer<Object> getStdKeySerializer(JavaType keyType)
public void serialize(String value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public void serialize(Date value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public void serialize(Calendar value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
