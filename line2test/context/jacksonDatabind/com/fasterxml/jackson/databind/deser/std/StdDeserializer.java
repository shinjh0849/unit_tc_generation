protected StdDeserializer(Class<?> vc)
protected StdDeserializer(JavaType valueType)
public Class<?> getValueClass()
public JavaType getValueType()
protected boolean isDefaultDeserializer(JsonDeserializer<?> deserializer)
protected boolean isDefaultKeyDeserializer(KeyDeserializer keyDeser)
public Object deserializeWithType(JsonParser jp, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException, JsonProcessingException
protected final boolean _parseBooleanPrimitive(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected final Boolean _parseBoolean(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected final boolean _parseBooleanFromNumber(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected Byte _parseByte(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected Short _parseShort(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected final short _parseShortPrimitive(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected final int _parseIntPrimitive(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected final Integer _parseInteger(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected final Long _parseLong(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected final long _parseLongPrimitive(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected final Float _parseFloat(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected final float _parseFloatPrimitive(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected final Double _parseDouble(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected final double _parseDoublePrimitive(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected java.util.Date _parseDate(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected static final double parseDouble(String numStr) throws NumberFormatException
protected final String _parseString(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
protected JsonDeserializer<Object> findDeserializer(DeserializationContext ctxt, JavaType type, BeanProperty property) throws JsonMappingException
protected JsonDeserializer<?> findConvertingContentDeserializer(DeserializationContext ctxt, BeanProperty prop, JsonDeserializer<?> existingDeserializer) throws JsonMappingException
protected void handleUnknownProperty(JsonParser jp, DeserializationContext ctxt, Object instanceOrClass, String propName) throws IOException, JsonProcessingException
long serialVersionUID=Optional[1L]
Class<?> _valueClass
