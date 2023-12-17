public JsonParserDelegate(JsonParser d) { [EOL]     delegate = d; [EOL] } <line_num>: 24,26
@Override [EOL] public void setCodec(ObjectCodec c) { [EOL]     delegate.setCodec(c); [EOL] } <line_num>: 34,37
@Override [EOL] public ObjectCodec getCodec() { [EOL]     return delegate.getCodec(); [EOL] } <line_num>: 39,42
@Override [EOL] public JsonParser enable(Feature f) { [EOL]     delegate.enable(f); [EOL]     return this; [EOL] } <line_num>: 44,48
@Override [EOL] public JsonParser disable(Feature f) { [EOL]     delegate.disable(f); [EOL]     return this; [EOL] } <line_num>: 50,54
@Override [EOL] public boolean isEnabled(Feature f) { [EOL]     return delegate.isEnabled(f); [EOL] } <line_num>: 56,59
@Override [EOL] public int getFeatureMask() { [EOL]     return delegate.getFeatureMask(); [EOL] } <line_num>: 61,64
@Override [EOL] public JsonParser setFeatureMask(int mask) { [EOL]     delegate.setFeatureMask(mask); [EOL]     return this; [EOL] } <line_num>: 66,70
@Override [EOL] public FormatSchema getSchema() { [EOL]     return delegate.getSchema(); [EOL] } <line_num>: 72,75
@Override [EOL] public void setSchema(FormatSchema schema) { [EOL]     delegate.setSchema(schema); [EOL] } <line_num>: 77,80
@Override [EOL] public boolean canUseSchema(FormatSchema schema) { [EOL]     return delegate.canUseSchema(schema); [EOL] } <line_num>: 82,85
@Override [EOL] public Version version() { [EOL]     return delegate.version(); [EOL] } <line_num>: 87,90
@Override [EOL] public Object getInputSource() { [EOL]     return delegate.getInputSource(); [EOL] } <line_num>: 92,95
@Override [EOL] public boolean requiresCustomCodec() { [EOL]     return delegate.requiresCustomCodec(); [EOL] } <line_num>: 103,106
@Override [EOL] public void close() throws IOException { [EOL]     delegate.close(); [EOL] } <line_num>: 114,117
@Override [EOL] public boolean isClosed() { [EOL]     return delegate.isClosed(); [EOL] } <line_num>: 119,122
@Override [EOL] public JsonToken getCurrentToken() { [EOL]     return delegate.getCurrentToken(); [EOL] } <line_num>: 130,133
@Override [EOL] public boolean hasCurrentToken() { [EOL]     return delegate.hasCurrentToken(); [EOL] } <line_num>: 135,138
@Override [EOL] public String getCurrentName() throws IOException, JsonParseException { [EOL]     return delegate.getCurrentName(); [EOL] } <line_num>: 140,143
@Override [EOL] public JsonLocation getCurrentLocation() { [EOL]     return delegate.getCurrentLocation(); [EOL] } <line_num>: 145,148
@Override [EOL] public JsonStreamContext getParsingContext() { [EOL]     return delegate.getParsingContext(); [EOL] } <line_num>: 150,153
@Override [EOL] public void clearCurrentToken() { [EOL]     delegate.clearCurrentToken(); [EOL] } <line_num>: 161,164
@Override [EOL] public JsonToken getLastClearedToken() { [EOL]     return delegate.getLastClearedToken(); [EOL] } <line_num>: 166,169
@Override [EOL] public void overrideCurrentName(String name) { [EOL]     delegate.overrideCurrentName(name); [EOL] } <line_num>: 171,174
@Override [EOL] public String getText() throws IOException, JsonParseException { [EOL]     return delegate.getText(); [EOL] } <line_num>: 182,185
@Override [EOL] public boolean hasTextCharacters() { [EOL]     return delegate.hasTextCharacters(); [EOL] } <line_num>: 187,190
@Override [EOL] public char[] getTextCharacters() throws IOException, JsonParseException { [EOL]     return delegate.getTextCharacters(); [EOL] } <line_num>: 192,195
@Override [EOL] public int getTextLength() throws IOException, JsonParseException { [EOL]     return delegate.getTextLength(); [EOL] } <line_num>: 197,200
@Override [EOL] public int getTextOffset() throws IOException, JsonParseException { [EOL]     return delegate.getTextOffset(); [EOL] } <line_num>: 202,205
@Override [EOL] public BigInteger getBigIntegerValue() throws IOException, JsonParseException { [EOL]     return delegate.getBigIntegerValue(); [EOL] } <line_num>: 213,216
@Override [EOL] public boolean getBooleanValue() throws IOException, JsonParseException { [EOL]     return delegate.getBooleanValue(); [EOL] } <line_num>: 218,221
@Override [EOL] public byte getByteValue() throws IOException, JsonParseException { [EOL]     return delegate.getByteValue(); [EOL] } <line_num>: 223,226
@Override [EOL] public short getShortValue() throws IOException, JsonParseException { [EOL]     return delegate.getShortValue(); [EOL] } <line_num>: 228,231
@Override [EOL] public BigDecimal getDecimalValue() throws IOException, JsonParseException { [EOL]     return delegate.getDecimalValue(); [EOL] } <line_num>: 233,236
@Override [EOL] public double getDoubleValue() throws IOException, JsonParseException { [EOL]     return delegate.getDoubleValue(); [EOL] } <line_num>: 238,241
@Override [EOL] public float getFloatValue() throws IOException, JsonParseException { [EOL]     return delegate.getFloatValue(); [EOL] } <line_num>: 243,246
@Override [EOL] public int getIntValue() throws IOException, JsonParseException { [EOL]     return delegate.getIntValue(); [EOL] } <line_num>: 248,251
@Override [EOL] public long getLongValue() throws IOException, JsonParseException { [EOL]     return delegate.getLongValue(); [EOL] } <line_num>: 253,256
@Override [EOL] public NumberType getNumberType() throws IOException, JsonParseException { [EOL]     return delegate.getNumberType(); [EOL] } <line_num>: 258,261
@Override [EOL] public Number getNumberValue() throws IOException, JsonParseException { [EOL]     return delegate.getNumberValue(); [EOL] } <line_num>: 263,266
@Override [EOL] public int getValueAsInt() throws IOException, JsonParseException { [EOL]     return delegate.getValueAsInt(); [EOL] } <line_num>: 274,277
@Override [EOL] public int getValueAsInt(int defaultValue) throws IOException, JsonParseException { [EOL]     return delegate.getValueAsInt(defaultValue); [EOL] } <line_num>: 279,282
@Override [EOL] public long getValueAsLong() throws IOException, JsonParseException { [EOL]     return delegate.getValueAsLong(); [EOL] } <line_num>: 284,287
@Override [EOL] public long getValueAsLong(long defaultValue) throws IOException, JsonParseException { [EOL]     return delegate.getValueAsLong(defaultValue); [EOL] } <line_num>: 289,292
@Override [EOL] public double getValueAsDouble() throws IOException, JsonParseException { [EOL]     return delegate.getValueAsDouble(); [EOL] } <line_num>: 294,297
@Override [EOL] public double getValueAsDouble(double defaultValue) throws IOException, JsonParseException { [EOL]     return delegate.getValueAsDouble(defaultValue); [EOL] } <line_num>: 299,302
@Override [EOL] public boolean getValueAsBoolean() throws IOException, JsonParseException { [EOL]     return delegate.getValueAsBoolean(); [EOL] } <line_num>: 304,307
@Override [EOL] public boolean getValueAsBoolean(boolean defaultValue) throws IOException, JsonParseException { [EOL]     return delegate.getValueAsBoolean(defaultValue); [EOL] } <line_num>: 309,312
@Override [EOL] public String getValueAsString() throws IOException, JsonParseException { [EOL]     return delegate.getValueAsString(); [EOL] } <line_num>: 314,317
@Override [EOL] public String getValueAsString(String defaultValue) throws IOException, JsonParseException { [EOL]     return delegate.getValueAsString(defaultValue); [EOL] } <line_num>: 319,322
@Override [EOL] public Object getEmbeddedObject() throws IOException, JsonParseException { [EOL]     return delegate.getEmbeddedObject(); [EOL] } <line_num>: 330,333
@Override [EOL] public byte[] getBinaryValue(Base64Variant b64variant) throws IOException, JsonParseException { [EOL]     return delegate.getBinaryValue(b64variant); [EOL] } <line_num>: 335,338
@Override [EOL] public int readBinaryValue(Base64Variant b64variant, OutputStream out) throws IOException, JsonParseException { [EOL]     return delegate.readBinaryValue(b64variant, out); [EOL] } <line_num>: 340,344
@Override [EOL] public JsonLocation getTokenLocation() { [EOL]     return delegate.getTokenLocation(); [EOL] } <line_num>: 346,349
@Override [EOL] public JsonToken nextToken() throws IOException, JsonParseException { [EOL]     return delegate.nextToken(); [EOL] } <line_num>: 351,354
@Override [EOL] public JsonToken nextValue() throws IOException, JsonParseException { [EOL]     return delegate.nextValue(); [EOL] } <line_num>: 356,359
@Override [EOL] public JsonParser skipChildren() throws IOException, JsonParseException { [EOL]     delegate.skipChildren(); [EOL]     return this; [EOL] } <line_num>: 361,366
@Override [EOL] public boolean canReadObjectId() { [EOL]     return delegate.canReadObjectId(); [EOL] } <line_num>: 374,377
@Override [EOL] public boolean canReadTypeId() { [EOL]     return delegate.canReadTypeId(); [EOL] } <line_num>: 379,382
@Override [EOL] public Object getObjectId() throws IOException, JsonGenerationException { [EOL]     return delegate.getObjectId(); [EOL] } <line_num>: 384,387
@Override [EOL] public Object getTypeId() throws IOException, JsonGenerationException { [EOL]     return delegate.getTypeId(); [EOL] } <line_num>: 389,392
