public JsonParserDelegate(JsonParser d)
public void setCodec(ObjectCodec c)
public ObjectCodec getCodec()
public JsonParser enable(Feature f)
public JsonParser disable(Feature f)
public boolean isEnabled(Feature f)
public int getFeatureMask()
public JsonParser setFeatureMask(int mask)
public FormatSchema getSchema()
public void setSchema(FormatSchema schema)
public boolean canUseSchema(FormatSchema schema)
public Version version()
public Object getInputSource()
public boolean requiresCustomCodec()
public void close() throws IOException
public boolean isClosed()
public JsonToken getCurrentToken()
public boolean hasCurrentToken()
public String getCurrentName() throws IOException, JsonParseException
public JsonLocation getCurrentLocation()
public JsonStreamContext getParsingContext()
public void clearCurrentToken()
public JsonToken getLastClearedToken()
public void overrideCurrentName(String name)
public String getText() throws IOException, JsonParseException
public boolean hasTextCharacters()
public char[] getTextCharacters() throws IOException, JsonParseException
public int getTextLength() throws IOException, JsonParseException
public int getTextOffset() throws IOException, JsonParseException
public BigInteger getBigIntegerValue() throws IOException, JsonParseException
public boolean getBooleanValue() throws IOException, JsonParseException
public byte getByteValue() throws IOException, JsonParseException
public short getShortValue() throws IOException, JsonParseException
public BigDecimal getDecimalValue() throws IOException, JsonParseException
public double getDoubleValue() throws IOException, JsonParseException
public float getFloatValue() throws IOException, JsonParseException
public int getIntValue() throws IOException, JsonParseException
public long getLongValue() throws IOException, JsonParseException
public NumberType getNumberType() throws IOException, JsonParseException
public Number getNumberValue() throws IOException, JsonParseException
public int getValueAsInt() throws IOException, JsonParseException
public int getValueAsInt(int defaultValue) throws IOException, JsonParseException
public long getValueAsLong() throws IOException, JsonParseException
public long getValueAsLong(long defaultValue) throws IOException, JsonParseException
public double getValueAsDouble() throws IOException, JsonParseException
public double getValueAsDouble(double defaultValue) throws IOException, JsonParseException
public boolean getValueAsBoolean() throws IOException, JsonParseException
public boolean getValueAsBoolean(boolean defaultValue) throws IOException, JsonParseException
public String getValueAsString() throws IOException, JsonParseException
public String getValueAsString(String defaultValue) throws IOException, JsonParseException
public Object getEmbeddedObject() throws IOException, JsonParseException
public byte[] getBinaryValue(Base64Variant b64variant) throws IOException, JsonParseException
public int readBinaryValue(Base64Variant b64variant, OutputStream out) throws IOException, JsonParseException
public JsonLocation getTokenLocation()
public JsonToken nextToken() throws IOException, JsonParseException
public JsonToken nextValue() throws IOException, JsonParseException
public JsonParser skipChildren() throws IOException, JsonParseException
public boolean canReadObjectId()
public boolean canReadTypeId()
public Object getObjectId() throws IOException, JsonGenerationException
public Object getTypeId() throws IOException, JsonGenerationException
JsonParser delegate
