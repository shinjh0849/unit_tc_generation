protected AsArraySerializerBase(Class<?> cls, JavaType et, boolean staticTyping, TypeSerializer vts, BeanProperty property, JsonSerializer<Object> elementSerializer)
protected AsArraySerializerBase(AsArraySerializerBase<?> src, BeanProperty property, TypeSerializer vts, JsonSerializer<?> elementSerializer)
public abstract AsArraySerializerBase<T> withResolved(BeanProperty property, TypeSerializer vts, JsonSerializer<?> elementSerializer)
public JsonSerializer<?> createContextual(SerializerProvider provider, BeanProperty property) throws JsonMappingException
public JavaType getContentType()
public JsonSerializer<?> getContentSerializer()
public final void serialize(T value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public final void serializeWithType(T value, JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonGenerationException
protected abstract void serializeContents(T value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public JsonNode getSchema(SerializerProvider provider, Type typeHint) throws JsonMappingException
public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException
protected final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap map, Class<?> type, SerializerProvider provider) throws JsonMappingException
protected final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap map, JavaType type, SerializerProvider provider) throws JsonMappingException
boolean _staticTyping
JavaType _elementType
TypeSerializer _valueTypeSerializer
JsonSerializer<Object> _elementSerializer
BeanProperty _property
PropertySerializerMap _dynamicSerializers
