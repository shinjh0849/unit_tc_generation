protected MapSerializer(HashSet<String> ignoredEntries, JavaType keyType, JavaType valueType, boolean valueTypeIsStatic, TypeSerializer vts, JsonSerializer<?> keySerializer, JsonSerializer<?> valueSerializer)
protected MapSerializer(MapSerializer src, BeanProperty property, JsonSerializer<?> keySerializer, JsonSerializer<?> valueSerializer, HashSet<String> ignored)
protected MapSerializer(MapSerializer src, TypeSerializer vts)
public MapSerializer _withValueTypeSerializer(TypeSerializer vts)
public MapSerializer withResolved(BeanProperty property, JsonSerializer<?> keySerializer, JsonSerializer<?> valueSerializer, HashSet<String> ignored)
public static MapSerializer construct(String[] ignoredList, JavaType mapType, boolean staticValueType, TypeSerializer vts, JsonSerializer<Object> keySerializer, JsonSerializer<Object> valueSerializer)
private static HashSet<String> toSet(String[] ignoredEntries)
public JsonSerializer<?> createContextual(SerializerProvider provider, BeanProperty property) throws JsonMappingException
public JavaType getContentType()
public JsonSerializer<?> getContentSerializer()
public boolean isEmpty(Map<?, ?> value)
public boolean hasSingleElement(Map<?, ?> value)
public JsonSerializer<?> getKeySerializer()
public void serialize(Map<?, ?> value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public void serializeWithType(Map<?, ?> value, JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer) throws IOException, JsonGenerationException
public void serializeFields(Map<?, ?> value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
protected void serializeFieldsUsing(Map<?, ?> value, JsonGenerator jgen, SerializerProvider provider, JsonSerializer<Object> ser) throws IOException, JsonGenerationException
protected void serializeTypedFields(Map<?, ?> value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException
public JsonNode getSchema(SerializerProvider provider, Type typeHint)
public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint) throws JsonMappingException
protected final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap map, Class<?> type, SerializerProvider provider) throws JsonMappingException
protected final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap map, JavaType type, SerializerProvider provider) throws JsonMappingException
protected Map<?, ?> _orderEntries(Map<?, ?> input)
JavaType UNSPECIFIED_TYPE=Optional[TypeFactory.unknownType()]
BeanProperty _property
HashSet<String> _ignoredEntries
boolean _valueTypeIsStatic
JavaType _keyType
JavaType _valueType
JsonSerializer<Object> _keySerializer
JsonSerializer<Object> _valueSerializer
TypeSerializer _valueTypeSerializer
PropertySerializerMap _dynamicValueSerializers
