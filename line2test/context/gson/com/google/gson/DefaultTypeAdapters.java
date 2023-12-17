 DefaultDateTypeAdapter()
 DefaultDateTypeAdapter(final String datePattern)
 DefaultDateTypeAdapter(final int style)
public DefaultDateTypeAdapter(final int dateStyle, final int timeStyle)
 DefaultJavaSqlDateTypeAdapter()
 DefaultTimeTypeAdapter()
private LongSerializer(LongSerializationPolicy longSerializationPolicy)
 FloatSerializer(boolean serializeSpecialDoubleValues)
 DoubleSerializer(boolean serializeSpecialDoubleValues)
private static ParameterizedTypeHandlerMap<JsonSerializer<?>> createDefaultSerializers()
private static ParameterizedTypeHandlerMap<JsonDeserializer<?>> createDefaultDeserializers()
private static ParameterizedTypeHandlerMap<InstanceCreator<?>> createDefaultInstanceCreators()
private static JsonDeserializer<?> wrapDeserializer(JsonDeserializer<?> deserializer)
 static ParameterizedTypeHandlerMap<JsonSerializer<?>> getDefaultSerializers()
 static ParameterizedTypeHandlerMap<JsonSerializer<?>> getDefaultSerializers(boolean serializeSpecialFloatingPointValues, LongSerializationPolicy longSerializationPolicy)
 static ParameterizedTypeHandlerMap<JsonDeserializer<?>> getDefaultDeserializers()
 static ParameterizedTypeHandlerMap<InstanceCreator<?>> getDefaultInstanceCreators()
public JsonElement serialize(Date src, Type typeOfSrc, JsonSerializationContext context)
public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public String toString()
public JsonElement serialize(java.sql.Date src, Type typeOfSrc, JsonSerializationContext context)
public java.sql.Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public Timestamp deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public JsonElement serialize(Time src, Type typeOfSrc, JsonSerializationContext context)
public Time deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public JsonElement serialize(GregorianCalendar src, Type typeOfSrc, JsonSerializationContext context)
public GregorianCalendar deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public String toString()
public JsonElement serialize(T src, Type typeOfSrc, JsonSerializationContext context)
public T deserialize(JsonElement json, Type classOfT, JsonDeserializationContext context) throws JsonParseException
public String toString()
public JsonElement serialize(URL src, Type typeOfSrc, JsonSerializationContext context)
public URL deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public String toString()
public JsonElement serialize(URI src, Type typeOfSrc, JsonSerializationContext context)
public URI deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public String toString()
public JsonElement serialize(UUID src, Type typeOfSrc, JsonSerializationContext context)
public UUID deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public String toString()
public JsonElement serialize(Locale src, Type typeOfSrc, JsonSerializationContext context)
public Locale deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public String toString()
public JsonElement serialize(Collection src, Type typeOfSrc, JsonSerializationContext context)
public Collection deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
private Collection constructCollectionType(Type collectionType, JsonDeserializationContext context)
public Collection createInstance(Type type)
public Properties createInstance(Type type)
public JsonElement serialize(Map src, Type typeOfSrc, JsonSerializationContext context)
public Map deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
private Map constructMapType(Type mapType, JsonDeserializationContext context)
public Map createInstance(Type type)
public String toString()
public JsonElement serialize(BigDecimal src, Type typeOfSrc, JsonSerializationContext context)
public BigDecimal deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public String toString()
public JsonElement serialize(BigInteger src, Type typeOfSrc, JsonSerializationContext context)
public BigInteger deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public String toString()
public JsonElement serialize(Number src, Type typeOfSrc, JsonSerializationContext context)
public Number deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public String toString()
public JsonElement serialize(Long src, Type typeOfSrc, JsonSerializationContext context)
public String toString()
public Long deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public String toString()
public JsonElement serialize(Integer src, Type typeOfSrc, JsonSerializationContext context)
public Integer deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public String toString()
public JsonElement serialize(Short src, Type typeOfSrc, JsonSerializationContext context)
public Short deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public String toString()
public JsonElement serialize(Byte src, Type typeOfSrc, JsonSerializationContext context)
public Byte deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public String toString()
public JsonElement serialize(Float src, Type typeOfSrc, JsonSerializationContext context)
public Float deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public String toString()
public JsonElement serialize(Double src, Type typeOfSrc, JsonSerializationContext context)
public Double deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public String toString()
public JsonElement serialize(Character src, Type typeOfSrc, JsonSerializationContext context)
public Character deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public String toString()
public JsonElement serialize(String src, Type typeOfSrc, JsonSerializationContext context)
public String deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public String toString()
public JsonElement serialize(Boolean src, Type typeOfSrc, JsonSerializationContext context)
public Boolean deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public String toString()
public TreeSet<?> createInstance(Type type)
public String toString()
public HashSet<?> createInstance(Type type)
public String toString()
DefaultDateTypeAdapter DATE_TYPE_ADAPTER=Optional[new DefaultDateTypeAdapter()]
DefaultJavaSqlDateTypeAdapter JAVA_SQL_DATE_TYPE_ADAPTER=Optional[new DefaultJavaSqlDateTypeAdapter()]
DefaultTimeTypeAdapter TIME_TYPE_ADAPTER=Optional[new DefaultTimeTypeAdapter()]
DefaultTimestampDeserializer TIMESTAMP_DESERIALIZER=Optional[new DefaultTimestampDeserializer()]
EnumTypeAdapter ENUM_TYPE_ADAPTER=Optional[new EnumTypeAdapter()]
UrlTypeAdapter URL_TYPE_ADAPTER=Optional[new UrlTypeAdapter()]
UriTypeAdapter URI_TYPE_ADAPTER=Optional[new UriTypeAdapter()]
UuidTypeAdapter UUUID_TYPE_ADAPTER=Optional[new UuidTypeAdapter()]
LocaleTypeAdapter LOCALE_TYPE_ADAPTER=Optional[new LocaleTypeAdapter()]
CollectionTypeAdapter COLLECTION_TYPE_ADAPTER=Optional[new CollectionTypeAdapter()]
MapTypeAdapter MAP_TYPE_ADAPTER=Optional[new MapTypeAdapter()]
BigDecimalTypeAdapter BIG_DECIMAL_TYPE_ADAPTER=Optional[new BigDecimalTypeAdapter()]
BigIntegerTypeAdapter BIG_INTEGER_TYPE_ADAPTER=Optional[new BigIntegerTypeAdapter()]
BooleanTypeAdapter BOOLEAN_TYPE_ADAPTER=Optional[new BooleanTypeAdapter()]
ByteTypeAdapter BYTE_TYPE_ADAPTER=Optional[new ByteTypeAdapter()]
CharacterTypeAdapter CHARACTER_TYPE_ADAPTER=Optional[new CharacterTypeAdapter()]
DoubleDeserializer DOUBLE_TYPE_ADAPTER=Optional[new DoubleDeserializer()]
FloatDeserializer FLOAT_TYPE_ADAPTER=Optional[new FloatDeserializer()]
IntegerTypeAdapter INTEGER_TYPE_ADAPTER=Optional[new IntegerTypeAdapter()]
LongDeserializer LONG_DESERIALIZER=Optional[new LongDeserializer()]
NumberTypeAdapter NUMBER_TYPE_ADAPTER=Optional[new NumberTypeAdapter()]
ShortTypeAdapter SHORT_TYPE_ADAPTER=Optional[new ShortTypeAdapter()]
StringTypeAdapter STRING_TYPE_ADAPTER=Optional[new StringTypeAdapter()]
PropertiesCreator PROPERTIES_CREATOR=Optional[new PropertiesCreator()]
TreeSetCreator TREE_SET_CREATOR=Optional[new TreeSetCreator()]
HashSetCreator HASH_SET_CREATOR=Optional[new HashSetCreator()]
GregorianCalendarTypeAdapter GREGORIAN_CALENDAR_TYPE_ADAPTER=Optional[new GregorianCalendarTypeAdapter()]
ParameterizedTypeHandlerMap<JsonSerializer<?>> DEFAULT_SERIALIZERS=Optional[createDefaultSerializers()]
ParameterizedTypeHandlerMap<JsonDeserializer<?>> DEFAULT_DESERIALIZERS=Optional[createDefaultDeserializers()]
ParameterizedTypeHandlerMap<InstanceCreator<?>> DEFAULT_INSTANCE_CREATORS=Optional[createDefaultInstanceCreators()]
