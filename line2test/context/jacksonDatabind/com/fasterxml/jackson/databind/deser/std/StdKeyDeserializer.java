protected StdKeyDeserializer(Class<?> cls)
private StringKD(Class<?> nominalType)
 BoolKD()
 ByteKD()
 ShortKD()
 CharKD()
 IntKD()
 LongKD()
 DoubleKD()
 FloatKD()
 LocaleKD()
protected DelegatingKD(Class<?> cls, JsonDeserializer<?> deser)
protected EnumKD(EnumResolver<?> er, AnnotatedMethod factory)
public StringCtorKeyDeserializer(Constructor<?> ctor)
public StringFactoryKeyDeserializer(Method fm)
protected DateKD()
protected CalendarKD()
protected UuidKD()
public final Object deserializeKey(String key, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Class<?> getKeyClass()
protected abstract Object _parse(String key, DeserializationContext ctxt) throws Exception
protected int _parseInt(String key) throws IllegalArgumentException
protected long _parseLong(String key) throws IllegalArgumentException
protected double _parseDouble(String key) throws IllegalArgumentException
public static StringKD forType(Class<?> nominalType)
public String _parse(String key, DeserializationContext ctxt) throws JsonMappingException
public Boolean _parse(String key, DeserializationContext ctxt) throws JsonMappingException
public Byte _parse(String key, DeserializationContext ctxt) throws JsonMappingException
public Short _parse(String key, DeserializationContext ctxt) throws JsonMappingException
public Character _parse(String key, DeserializationContext ctxt) throws JsonMappingException
public Integer _parse(String key, DeserializationContext ctxt) throws JsonMappingException
public Long _parse(String key, DeserializationContext ctxt) throws JsonMappingException
public Double _parse(String key, DeserializationContext ctxt) throws JsonMappingException
public Float _parse(String key, DeserializationContext ctxt) throws JsonMappingException
protected Locale _parse(String key, DeserializationContext ctxt) throws JsonMappingException
public final Object deserializeKey(String key, DeserializationContext ctxt) throws IOException, JsonProcessingException
public Class<?> getKeyClass()
public Object _parse(String key, DeserializationContext ctxt) throws JsonMappingException
public Object _parse(String key, DeserializationContext ctxt) throws Exception
public Object _parse(String key, DeserializationContext ctxt) throws Exception
public Object _parse(String key, DeserializationContext ctxt) throws IllegalArgumentException, JsonMappingException
public Object _parse(String key, DeserializationContext ctxt) throws IllegalArgumentException, JsonMappingException
public Object _parse(String key, DeserializationContext ctxt) throws IllegalArgumentException, JsonMappingException
long serialVersionUID=Optional[1L]
Class<?> _keyClass
