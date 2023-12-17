protected ParserBase(IOContext ctxt, int features)
public Version version()
public String getCurrentName() throws IOException, JsonParseException
public void overrideCurrentName(String name)
public void close() throws IOException
public boolean isClosed()
public JsonReadContext getParsingContext()
public JsonLocation getTokenLocation()
public JsonLocation getCurrentLocation()
public boolean hasTextCharacters()
public Object getEmbeddedObject() throws IOException, JsonParseException
public long getTokenCharacterOffset()
public int getTokenLineNr()
public int getTokenColumnNr()
protected final void loadMoreGuaranteed() throws IOException
protected abstract boolean loadMore() throws IOException
protected abstract void _finishString() throws IOException, JsonParseException
protected abstract void _closeInput() throws IOException
protected void _releaseBuffers() throws IOException
protected void _handleEOF() throws JsonParseException
protected void _reportMismatchedEndMarker(int actCh, char expCh) throws JsonParseException
public ByteArrayBuilder _getByteArrayBuilder()
protected final JsonToken reset(boolean negative, int intLen, int fractLen, int expLen)
protected final JsonToken resetInt(boolean negative, int intLen)
protected final JsonToken resetFloat(boolean negative, int intLen, int fractLen, int expLen)
protected final JsonToken resetAsNaN(String valueStr, double value)
public Number getNumberValue() throws IOException, JsonParseException
public NumberType getNumberType() throws IOException, JsonParseException
public int getIntValue() throws IOException, JsonParseException
public long getLongValue() throws IOException, JsonParseException
public BigInteger getBigIntegerValue() throws IOException, JsonParseException
public float getFloatValue() throws IOException, JsonParseException
public double getDoubleValue() throws IOException, JsonParseException
public BigDecimal getDecimalValue() throws IOException, JsonParseException
protected void _parseNumericValue(int expType) throws IOException, JsonParseException
private void _parseSlowFloatValue(int expType) throws IOException, JsonParseException
private void _parseSlowIntValue(int expType, char[] buf, int offset, int len) throws IOException, JsonParseException
protected void convertNumberToInt() throws IOException, JsonParseException
protected void convertNumberToLong() throws IOException, JsonParseException
protected void convertNumberToBigInteger() throws IOException, JsonParseException
protected void convertNumberToDouble() throws IOException, JsonParseException
protected void convertNumberToBigDecimal() throws IOException, JsonParseException
protected void reportUnexpectedNumberChar(int ch, String comment) throws JsonParseException
protected void reportInvalidNumber(String msg) throws JsonParseException
protected void reportOverflowInt() throws IOException, JsonParseException
protected void reportOverflowLong() throws IOException, JsonParseException
protected char _decodeEscaped() throws IOException, JsonParseException
protected final int _decodeBase64Escape(Base64Variant b64variant, int ch, int index) throws IOException, JsonParseException
protected final int _decodeBase64Escape(Base64Variant b64variant, char ch, int index) throws IOException, JsonParseException
protected IllegalArgumentException reportInvalidBase64Char(Base64Variant b64variant, int ch, int bindex) throws IllegalArgumentException
protected IllegalArgumentException reportInvalidBase64Char(Base64Variant b64variant, int ch, int bindex, String msg) throws IllegalArgumentException
