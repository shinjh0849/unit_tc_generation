private Feature(boolean defaultState) { [EOL]     _defaultState = defaultState; [EOL] } <line_num>: 179,181
protected JsonParser() { [EOL] } <line_num>: 207,207
protected JsonParser(int features) { [EOL]     _features = features; [EOL] } <line_num>: 208,210
public static int collectDefaults() { [EOL]     int flags = 0; [EOL]     for (Feature f : values()) { [EOL]         if (f.enabledByDefault()) { [EOL]             flags |= f.getMask(); [EOL]         } [EOL]     } [EOL]     return flags; [EOL] } <line_num>: 168,177
public boolean enabledByDefault() { [EOL]     return _defaultState; [EOL] } <line_num>: 183,183
public int getMask() { [EOL]     return (1 << ordinal()); [EOL] } <line_num>: 185,185
public abstract ObjectCodec getCodec(); <line_num>: 217,217
public abstract void setCodec(ObjectCodec c); <line_num>: 224,224
public Object getInputSource() { [EOL]     return null; [EOL] } <line_num>: 241,243
public void setSchema(FormatSchema schema) { [EOL]     throw new UnsupportedOperationException("Parser of type " + getClass().getName() + " does not support schema of type '" + schema.getSchemaType() + "'"); [EOL] } <line_num>: 265,269
public FormatSchema getSchema() { [EOL]     return null; [EOL] } <line_num>: 277,279
public boolean canUseSchema(FormatSchema schema) { [EOL]     return false; [EOL] } <line_num>: 289,291
public boolean requiresCustomCodec() { [EOL]     return false; [EOL] } <line_num>: 312,314
@Override [EOL] public abstract Version version(); <line_num>: 326,327
@Override [EOL] public abstract void close() throws IOException; <line_num>: 350,351
public int releaseBuffered(OutputStream out) throws IOException { [EOL]     return -1; [EOL] } <line_num>: 373,376
public int releaseBuffered(Writer w) throws IOException { [EOL]     return -1; [EOL] } <line_num>: 393,396
public JsonParser enable(Feature f) { [EOL]     _features |= f.getMask(); [EOL]     return this; [EOL] } <line_num>: 408,412
public JsonParser disable(Feature f) { [EOL]     _features &= ~f.getMask(); [EOL]     return this; [EOL] } <line_num>: 418,422
public JsonParser configure(Feature f, boolean state) { [EOL]     if (state) { [EOL]         enable(f); [EOL]     } else { [EOL]         disable(f); [EOL]     } [EOL]     return this; [EOL] } <line_num>: 428,436
public boolean isEnabled(Feature f) { [EOL]     return (_features & f.getMask()) != 0; [EOL] } <line_num>: 441,443
public int getFeatureMask() { [EOL]     return _features; [EOL] } <line_num>: 452,454
public JsonParser setFeatureMask(int mask) { [EOL]     _features = mask; [EOL]     return this; [EOL] } <line_num>: 463,466
public abstract JsonToken nextToken() throws IOException, JsonParseException; <line_num>: 483,484
public abstract JsonToken nextValue() throws IOException, JsonParseException; <line_num>: 503,504
public boolean nextFieldName(SerializableString str) throws IOException, JsonParseException { [EOL]     return (nextToken() == JsonToken.FIELD_NAME) && str.getValue().equals(getCurrentName()); [EOL] } <line_num>: 519,523
public String nextTextValue() throws IOException, JsonParseException { [EOL]     return (nextToken() == JsonToken.VALUE_STRING) ? getText() : null; [EOL] } <line_num>: 536,540
public int nextIntValue(int defaultValue) throws IOException, JsonParseException { [EOL]     return (nextToken() == JsonToken.VALUE_NUMBER_INT) ? getIntValue() : defaultValue; [EOL] } <line_num>: 553,557
public long nextLongValue(long defaultValue) throws IOException, JsonParseException { [EOL]     return (nextToken() == JsonToken.VALUE_NUMBER_INT) ? getLongValue() : defaultValue; [EOL] } <line_num>: 570,574
public Boolean nextBooleanValue() throws IOException, JsonParseException { [EOL]     switch(nextToken()) { [EOL]         case VALUE_TRUE: [EOL]             return Boolean.TRUE; [EOL]         case VALUE_FALSE: [EOL]             return Boolean.FALSE; [EOL]         default: [EOL]             return null; [EOL]     } [EOL] } <line_num>: 590,601
public abstract JsonParser skipChildren() throws IOException, JsonParseException; <line_num>: 617,618
public abstract boolean isClosed(); <line_num>: 628,628
public abstract JsonToken getCurrentToken(); <line_num>: 647,647
public abstract boolean hasCurrentToken(); <line_num>: 660,660
public abstract String getCurrentName() throws IOException, JsonParseException; <line_num>: 669,670
public abstract JsonStreamContext getParsingContext(); <line_num>: 682,682
public abstract JsonLocation getTokenLocation(); <line_num>: 689,689
public abstract JsonLocation getCurrentLocation(); <line_num>: 695,695
public boolean isExpectedStartArrayToken() { [EOL]     return getCurrentToken() == JsonToken.START_ARRAY; [EOL] } <line_num>: 714,716
public abstract void clearCurrentToken(); <line_num>: 736,736
public abstract JsonToken getLastClearedToken(); <line_num>: 745,745
public abstract void overrideCurrentName(String name); <line_num>: 760,760
public abstract String getText() throws IOException, JsonParseException; <line_num>: 774,775
public abstract char[] getTextCharacters() throws IOException, JsonParseException; <line_num>: 802,803
public abstract int getTextLength() throws IOException, JsonParseException; <line_num>: 813,814
public abstract int getTextOffset() throws IOException, JsonParseException; <line_num>: 824,825
public abstract boolean hasTextCharacters(); <line_num>: 844,844
public abstract Number getNumberValue() throws IOException, JsonParseException; <line_num>: 858,859
public abstract NumberType getNumberType() throws IOException, JsonParseException; <line_num>: 867,868
public byte getByteValue() throws IOException, JsonParseException { [EOL]     int value = getIntValue(); [EOL]     if (value < MIN_BYTE_I || value > MAX_BYTE_I) { [EOL]         throw _constructError("Numeric value (" + getText() + ") out of range of Java byte"); [EOL]     } [EOL]     return (byte) value; [EOL] } <line_num>: 883,894
public short getShortValue() throws IOException, JsonParseException { [EOL]     int value = getIntValue(); [EOL]     if (value < MIN_SHORT_I || value > MAX_SHORT_I) { [EOL]         throw _constructError("Numeric value (" + getText() + ") out of range of Java short"); [EOL]     } [EOL]     return (short) value; [EOL] } <line_num>: 909,917
public abstract int getIntValue() throws IOException, JsonParseException; <line_num>: 932,933
public abstract long getLongValue() throws IOException, JsonParseException; <line_num>: 948,949
public abstract BigInteger getBigIntegerValue() throws IOException, JsonParseException; <line_num>: 960,961
public abstract float getFloatValue() throws IOException, JsonParseException; <line_num>: 976,977
public abstract double getDoubleValue() throws IOException, JsonParseException; <line_num>: 992,993
public abstract BigDecimal getDecimalValue() throws IOException, JsonParseException; <line_num>: 1001,1002
public boolean getBooleanValue() throws IOException, JsonParseException { [EOL]     JsonToken t = getCurrentToken(); [EOL]     if (t == JsonToken.VALUE_TRUE) [EOL]         return true; [EOL]     if (t == JsonToken.VALUE_FALSE) [EOL]         return false; [EOL]     throw new JsonParseException("Current token (" + t + ") not of boolean type", getCurrentLocation()); [EOL] } <line_num>: 1020,1027
public abstract Object getEmbeddedObject() throws IOException, JsonParseException; <line_num>: 1038,1039
public abstract byte[] getBinaryValue(Base64Variant b64variant) throws IOException, JsonParseException; <line_num>: 1069,1069
public byte[] getBinaryValue() throws IOException, JsonParseException { [EOL]     return getBinaryValue(Base64Variants.getDefaultVariant()); [EOL] } <line_num>: 1076,1078
public int readBinaryValue(OutputStream out) throws IOException, JsonParseException { [EOL]     return readBinaryValue(Base64Variants.getDefaultVariant(), out); [EOL] } <line_num>: 1094,1096
public int readBinaryValue(Base64Variant b64variant, OutputStream out) throws IOException, JsonParseException { [EOL]     _reportUnsupportedOperation(); [EOL]     return 0; [EOL] } <line_num>: 1109,1114
public int getValueAsInt() throws IOException, JsonParseException { [EOL]     return getValueAsInt(0); [EOL] } <line_num>: 1133,1135
public int getValueAsInt(int defaultValue) throws IOException, JsonParseException { [EOL]     return defaultValue; [EOL] } <line_num>: 1148,1150
public long getValueAsLong() throws IOException, JsonParseException { [EOL]     return getValueAsLong(0); [EOL] } <line_num>: 1163,1165
public long getValueAsLong(long defaultValue) throws IOException, JsonParseException { [EOL]     return defaultValue; [EOL] } <line_num>: 1178,1180
public double getValueAsDouble() throws IOException, JsonParseException { [EOL]     return getValueAsDouble(0.0); [EOL] } <line_num>: 1193,1195
public double getValueAsDouble(double defaultValue) throws IOException, JsonParseException { [EOL]     return defaultValue; [EOL] } <line_num>: 1208,1210
public boolean getValueAsBoolean() throws IOException, JsonParseException { [EOL]     return getValueAsBoolean(false); [EOL] } <line_num>: 1223,1225
public boolean getValueAsBoolean(boolean defaultValue) throws IOException, JsonParseException { [EOL]     return defaultValue; [EOL] } <line_num>: 1238,1240
public String getValueAsString() throws IOException, JsonParseException { [EOL]     return getValueAsString(null); [EOL] } <line_num>: 1253,1255
public abstract String getValueAsString(String defaultValue) throws IOException, JsonParseException; <line_num>: 1268,1269
public boolean canReadObjectId() { [EOL]     return false; [EOL] } <line_num>: 1289,1291
public boolean canReadTypeId() { [EOL]     return false; [EOL] } <line_num>: 1305,1307
public Object getObjectId() throws IOException, JsonGenerationException { [EOL]     return null; [EOL] } <line_num>: 1322,1324
public Object getTypeId() throws IOException, JsonGenerationException { [EOL]     return null; [EOL] } <line_num>: 1339,1341
public <T> T readValueAs(Class<T> valueType) throws IOException, JsonProcessingException { [EOL]     ObjectCodec codec = getCodec(); [EOL]     if (codec == null) { [EOL]         throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into Java objects"); [EOL]     } [EOL]     return codec.readValue(this, valueType); [EOL] } <line_num>: 1370,1378
@SuppressWarnings("unchecked") [EOL] public <T> T readValueAs(TypeReference<?> valueTypeRef) throws IOException, JsonProcessingException { [EOL]     ObjectCodec codec = getCodec(); [EOL]     if (codec == null) { [EOL]         throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into Java objects"); [EOL]     } [EOL]     return (T) codec.readValue(this, valueTypeRef); [EOL] } <line_num>: 1398,1410
public <T> Iterator<T> readValuesAs(Class<T> valueType) throws IOException, JsonProcessingException { [EOL]     ObjectCodec codec = getCodec(); [EOL]     if (codec == null) { [EOL]         throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into Java objects"); [EOL]     } [EOL]     return codec.readValues(this, valueType); [EOL] } <line_num>: 1416,1424
public <T> Iterator<T> readValuesAs(TypeReference<?> valueTypeRef) throws IOException, JsonProcessingException { [EOL]     ObjectCodec codec = getCodec(); [EOL]     if (codec == null) { [EOL]         throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into Java objects"); [EOL]     } [EOL]     return codec.readValues(this, valueTypeRef); [EOL] } <line_num>: 1430,1438
@SuppressWarnings("unchecked") [EOL] public <T extends TreeNode> T readValueAsTree() throws IOException, JsonProcessingException { [EOL]     ObjectCodec codec = getCodec(); [EOL]     if (codec == null) { [EOL]         throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into JsonNode tree"); [EOL]     } [EOL]     return (T) codec.readTree(this); [EOL] } <line_num>: 1447,1456
protected JsonParseException _constructError(String msg) { [EOL]     return new JsonParseException(msg, getCurrentLocation()); [EOL] } <line_num>: 1468,1471
protected void _reportUnsupportedOperation() { [EOL]     throw new UnsupportedOperationException("Operation not supported by parser of type " + getClass().getName()); [EOL] } <line_num>: 1479,1481
