private Feature(boolean defaultState)
protected JsonParser()
protected JsonParser(int features)
public static int collectDefaults()
public boolean enabledByDefault()
public int getMask()
public abstract ObjectCodec getCodec()
public abstract void setCodec(ObjectCodec c)
public Object getInputSource()
public void setSchema(FormatSchema schema)
public FormatSchema getSchema()
public boolean canUseSchema(FormatSchema schema)
public boolean requiresCustomCodec()
public abstract Version version()
public abstract void close() throws IOException
public int releaseBuffered(OutputStream out) throws IOException
public int releaseBuffered(Writer w) throws IOException
public JsonParser enable(Feature f)
public JsonParser disable(Feature f)
public JsonParser configure(Feature f, boolean state)
public boolean isEnabled(Feature f)
public int getFeatureMask()
public JsonParser setFeatureMask(int mask)
public abstract JsonToken nextToken() throws IOException, JsonParseException
public abstract JsonToken nextValue() throws IOException, JsonParseException
public boolean nextFieldName(SerializableString str) throws IOException, JsonParseException
public String nextTextValue() throws IOException, JsonParseException
public int nextIntValue(int defaultValue) throws IOException, JsonParseException
public long nextLongValue(long defaultValue) throws IOException, JsonParseException
public Boolean nextBooleanValue() throws IOException, JsonParseException
public abstract JsonParser skipChildren() throws IOException, JsonParseException
public abstract boolean isClosed()
public abstract JsonToken getCurrentToken()
public abstract boolean hasCurrentToken()
public abstract String getCurrentName() throws IOException, JsonParseException
public abstract JsonStreamContext getParsingContext()
public abstract JsonLocation getTokenLocation()
public abstract JsonLocation getCurrentLocation()
public boolean isExpectedStartArrayToken()
public abstract void clearCurrentToken()
public abstract JsonToken getLastClearedToken()
public abstract void overrideCurrentName(String name)
public abstract String getText() throws IOException, JsonParseException
public abstract char[] getTextCharacters() throws IOException, JsonParseException
public abstract int getTextLength() throws IOException, JsonParseException
public abstract int getTextOffset() throws IOException, JsonParseException
public abstract boolean hasTextCharacters()
public abstract Number getNumberValue() throws IOException, JsonParseException
public abstract NumberType getNumberType() throws IOException, JsonParseException
public byte getByteValue() throws IOException, JsonParseException
public short getShortValue() throws IOException, JsonParseException
public abstract int getIntValue() throws IOException, JsonParseException
public abstract long getLongValue() throws IOException, JsonParseException
public abstract BigInteger getBigIntegerValue() throws IOException, JsonParseException
public abstract float getFloatValue() throws IOException, JsonParseException
public abstract double getDoubleValue() throws IOException, JsonParseException
public abstract BigDecimal getDecimalValue() throws IOException, JsonParseException
public boolean getBooleanValue() throws IOException, JsonParseException
public abstract Object getEmbeddedObject() throws IOException, JsonParseException
public abstract byte[] getBinaryValue(Base64Variant b64variant) throws IOException, JsonParseException
public byte[] getBinaryValue() throws IOException, JsonParseException
public int readBinaryValue(OutputStream out) throws IOException, JsonParseException
public int readBinaryValue(Base64Variant b64variant, OutputStream out) throws IOException, JsonParseException
public int getValueAsInt() throws IOException, JsonParseException
public int getValueAsInt(int defaultValue) throws IOException, JsonParseException
public long getValueAsLong() throws IOException, JsonParseException
public long getValueAsLong(long defaultValue) throws IOException, JsonParseException
public double getValueAsDouble() throws IOException, JsonParseException
public double getValueAsDouble(double defaultValue) throws IOException, JsonParseException
public boolean getValueAsBoolean() throws IOException, JsonParseException
public boolean getValueAsBoolean(boolean defaultValue) throws IOException, JsonParseException
public String getValueAsString() throws IOException, JsonParseException
public abstract String getValueAsString(String defaultValue) throws IOException, JsonParseException
public boolean canReadObjectId()
public boolean canReadTypeId()
public Object getObjectId() throws IOException, JsonGenerationException
public Object getTypeId() throws IOException, JsonGenerationException
public T readValueAs(Class<T> valueType) throws IOException, JsonProcessingException
public T readValueAs(TypeReference<?> valueTypeRef) throws IOException, JsonProcessingException
public Iterator<T> readValuesAs(Class<T> valueType) throws IOException, JsonProcessingException
public Iterator<T> readValuesAs(TypeReference<?> valueTypeRef) throws IOException, JsonProcessingException
public T readValueAsTree() throws IOException, JsonProcessingException
protected JsonParseException _constructError(String msg)
protected void _reportUnsupportedOperation()
int MIN_BYTE_I=Optional[(int) Byte.MIN_VALUE]
int MAX_BYTE_I=Optional[(int) 255]
int MIN_SHORT_I=Optional[(int) Short.MIN_VALUE]
int MAX_SHORT_I=Optional[(int) Short.MAX_VALUE]
int _features
