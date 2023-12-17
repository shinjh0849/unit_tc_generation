public CalendarSerializer()
public CalendarSerializer(boolean useTimestamp, DateFormat customFormat)
public CalendarSerializer withFormat(boolean timestamp, DateFormat customFormat)
protected long _timestamp(Calendar value)
public void serialize(Calendar value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
CalendarSerializer instance=Optional[new CalendarSerializer()]
