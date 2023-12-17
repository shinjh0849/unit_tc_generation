public DateSerializer()
public DateSerializer(boolean useTimestamp, DateFormat customFormat)
public DateSerializer withFormat(boolean timestamp, DateFormat customFormat)
protected long _timestamp(Date value)
public void serialize(Date value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
