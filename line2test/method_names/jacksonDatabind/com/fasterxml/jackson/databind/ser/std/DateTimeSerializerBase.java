protected DateTimeSerializerBase(Class<T> type, boolean useTimestamp, DateFormat customFormat)
public abstract DateTimeSerializerBase<T> withFormat(boolean timestamp, DateFormat customFormat)
public JsonSerializer<?> createContextual(SerializerProvider prov, BeanProperty property) throws JsonMappingException
public boolean isEmpty(T value)
protected abstract long _timestamp(T value)
public JsonNode getSchema(SerializerProvider provider, Type typeHint)
public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException
public abstract void serialize(T value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
