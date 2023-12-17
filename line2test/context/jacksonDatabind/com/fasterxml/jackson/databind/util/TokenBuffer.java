public TokenBuffer(ObjectCodec codec)
public Parser(Segment firstSeg, ObjectCodec codec)
public Segment()
public Version version()
public JsonParser asParser()
public JsonParser asParser(ObjectCodec codec)
public JsonParser asParser(JsonParser src)
public JsonToken firstToken()
public TokenBuffer append(TokenBuffer other) throws IOException, JsonGenerationException
public void serialize(JsonGenerator jgen) throws IOException, JsonGenerationException
public String toString()
public JsonGenerator enable(Feature f)
public JsonGenerator disable(Feature f)
public boolean isEnabled(Feature f)
public JsonGenerator useDefaultPrettyPrinter()
public JsonGenerator setCodec(ObjectCodec oc)
public ObjectCodec getCodec()
public final JsonWriteContext getOutputContext()
public void flush() throws IOException
public void close() throws IOException
public boolean isClosed()
public final void writeStartArray() throws IOException, JsonGenerationException
public final void writeEndArray() throws IOException, JsonGenerationException
public final void writeStartObject() throws IOException, JsonGenerationException
public final void writeEndObject() throws IOException, JsonGenerationException
public final void writeFieldName(String name) throws IOException, JsonGenerationException
public void writeFieldName(SerializableString name) throws IOException, JsonGenerationException
public void writeString(String text) throws IOException, JsonGenerationException
public void writeString(char[] text, int offset, int len) throws IOException, JsonGenerationException
public void writeString(SerializableString text) throws IOException, JsonGenerationException
public void writeRawUTF8String(byte[] text, int offset, int length) throws IOException, JsonGenerationException
public void writeUTF8String(byte[] text, int offset, int length) throws IOException, JsonGenerationException
public void writeRaw(String text) throws IOException, JsonGenerationException
public void writeRaw(String text, int offset, int len) throws IOException, JsonGenerationException
public void writeRaw(SerializableString text) throws IOException, JsonGenerationException
public void writeRaw(char[] text, int offset, int len) throws IOException, JsonGenerationException
public void writeRaw(char c) throws IOException, JsonGenerationException
public void writeRawValue(String text) throws IOException, JsonGenerationException
public void writeRawValue(String text, int offset, int len) throws IOException, JsonGenerationException
public void writeRawValue(char[] text, int offset, int len) throws IOException, JsonGenerationException
public void writeNumber(short i) throws IOException, JsonGenerationException
public void writeNumber(int i) throws IOException, JsonGenerationException
public void writeNumber(long l) throws IOException, JsonGenerationException
public void writeNumber(double d) throws IOException, JsonGenerationException
public void writeNumber(float f) throws IOException, JsonGenerationException
public void writeNumber(BigDecimal dec) throws IOException, JsonGenerationException
public void writeNumber(BigInteger v) throws IOException, JsonGenerationException
public void writeNumber(String encodedValue) throws IOException, JsonGenerationException
public void writeBoolean(boolean state) throws IOException, JsonGenerationException
public void writeNull() throws IOException, JsonGenerationException
public void writeObject(Object value) throws IOException, JsonProcessingException
public void writeTree(TreeNode rootNode) throws IOException, JsonProcessingException
public void writeBinary(Base64Variant b64variant, byte[] data, int offset, int len) throws IOException, JsonGenerationException
public int writeBinary(Base64Variant b64variant, InputStream data, int dataLength)
public void copyCurrentEvent(JsonParser jp) throws IOException, JsonProcessingException
public void copyCurrentStructure(JsonParser jp) throws IOException, JsonProcessingException
protected final void _append(JsonToken type)
protected final void _append(JsonToken type, Object value)
protected final void _appendRaw(int rawType, Object value)
protected void _reportUnsupportedOperation()
public void setLocation(JsonLocation l)
public ObjectCodec getCodec()
public void setCodec(ObjectCodec c)
public Version version()
public JsonToken peekNextToken() throws IOException, JsonParseException
public void close() throws IOException
public JsonToken nextToken() throws IOException, JsonParseException
public boolean isClosed()
public JsonStreamContext getParsingContext()
public JsonLocation getTokenLocation()
public JsonLocation getCurrentLocation()
public String getCurrentName()
public void overrideCurrentName(String name)
public String getText()
public char[] getTextCharacters()
public int getTextLength()
public int getTextOffset()
public boolean hasTextCharacters()
public BigInteger getBigIntegerValue() throws IOException, JsonParseException
public BigDecimal getDecimalValue() throws IOException, JsonParseException
public double getDoubleValue() throws IOException, JsonParseException
public float getFloatValue() throws IOException, JsonParseException
public int getIntValue() throws IOException, JsonParseException
public long getLongValue() throws IOException, JsonParseException
public NumberType getNumberType() throws IOException, JsonParseException
public final Number getNumberValue() throws IOException, JsonParseException
public Object getEmbeddedObject()
public byte[] getBinaryValue(Base64Variant b64variant) throws IOException, JsonParseException
public int readBinaryValue(Base64Variant b64variant, OutputStream out) throws IOException, JsonParseException
protected final Object _currentObject()
protected final void _checkIsNumber() throws JsonParseException
protected void _handleEOF() throws JsonParseException
public JsonToken type(int index)
public int rawType(int index)
public Object get(int index)
public Segment next()
public Segment append(int index, JsonToken tokenType)
public Segment append(int index, JsonToken tokenType, Object value)
public Segment appendRaw(int index, int rawTokenType, Object value)
public void set(int index, JsonToken tokenType)
public void set(int index, JsonToken tokenType, Object value)
private void set(int index, int rawTokenType, Object value)
int DEFAULT_PARSER_FEATURES=Optional[JsonParser.Feature.collectDefaults()]
ObjectCodec _objectCodec
int _generatorFeatures
boolean _closed
Segment _first
Segment _last
int _appendOffset
JsonWriteContext _writeContext
