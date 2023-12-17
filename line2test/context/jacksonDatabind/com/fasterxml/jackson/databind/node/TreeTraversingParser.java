public TreeTraversingParser(JsonNode n)
public TreeTraversingParser(JsonNode n, ObjectCodec codec)
public void setCodec(ObjectCodec c)
public ObjectCodec getCodec()
public Version version()
public void close() throws IOException
public JsonToken nextToken() throws IOException, JsonParseException
public JsonParser skipChildren() throws IOException, JsonParseException
public boolean isClosed()
public String getCurrentName()
public void overrideCurrentName(String name)
public JsonStreamContext getParsingContext()
public JsonLocation getTokenLocation()
public JsonLocation getCurrentLocation()
public String getText()
public char[] getTextCharacters() throws IOException, JsonParseException
public int getTextLength() throws IOException, JsonParseException
public int getTextOffset() throws IOException, JsonParseException
public boolean hasTextCharacters()
public NumberType getNumberType() throws IOException, JsonParseException
public BigInteger getBigIntegerValue() throws IOException, JsonParseException
public BigDecimal getDecimalValue() throws IOException, JsonParseException
public double getDoubleValue() throws IOException, JsonParseException
public float getFloatValue() throws IOException, JsonParseException
public long getLongValue() throws IOException, JsonParseException
public int getIntValue() throws IOException, JsonParseException
public Number getNumberValue() throws IOException, JsonParseException
public Object getEmbeddedObject()
public byte[] getBinaryValue(Base64Variant b64variant) throws IOException, JsonParseException
public int readBinaryValue(Base64Variant b64variant, OutputStream out) throws IOException, JsonParseException
protected JsonNode currentNode()
protected JsonNode currentNumericNode() throws JsonParseException
protected void _handleEOF() throws JsonParseException
ObjectCodec _objectCodec
NodeCursor _nodeCursor
JsonToken _nextToken
boolean _startContainer
boolean _closed
