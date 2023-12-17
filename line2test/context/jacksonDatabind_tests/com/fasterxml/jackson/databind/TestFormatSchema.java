public SchemaException(FormatSchema s)
public ParserWithSchema(IOContext ioCtxt, int features)
public GeneratorWithSchema(int features, ObjectCodec codec)
public String getSchemaType()
public String getFormatName()
public boolean canUseSchema(FormatSchema schema)
protected JsonParser _createParser(Reader r, IOContext ctxt) throws IOException, JsonParseException
protected JsonGenerator _createGenerator(Writer out, IOContext ctxt) throws IOException
public void setSchema(FormatSchema schema)
protected void _finishString() throws IOException, JsonParseException
public byte[] getBinaryValue(Base64Variant b64variant)
public byte[] getEmbeddedObject()
public String getText() throws IOException, JsonParseException
public char[] getTextCharacters() throws IOException
public int getTextLength() throws IOException, JsonParseException
public int getTextOffset() throws IOException, JsonParseException
public JsonToken nextToken() throws IOException, JsonParseException
public ObjectCodec getCodec()
public void setCodec(ObjectCodec c)
protected boolean loadMore() throws IOException
protected void _closeInput() throws IOException
public int readBinaryValue(Base64Variant b64variant, OutputStream out)
public void setSchema(FormatSchema schema)
protected void _releaseBuffers()
protected void _verifyValueWrite(String typeMsg) throws IOException
public void flush() throws IOException
public void writeBinary(Base64Variant b64variant, byte[] data, int offset, int len) throws IOException
public void writeBoolean(boolean state) throws IOException
public void writeFieldName(String name) throws IOException
public void writeNull() throws IOException, JsonGenerationException
public void writeNumber(short v) throws IOException
public void writeNumber(int v) throws IOException
public void writeNumber(long v) throws IOException
public void writeNumber(BigInteger v) throws IOException
public void writeNumber(double d) throws IOException
public void writeNumber(float f) throws IOException
public void writeNumber(BigDecimal dec) throws IOException
public void writeNumber(String encodedValue) throws IOException
public void writeRaw(String text) throws IOException
public void writeRaw(String text, int offset, int len)
public void writeRaw(char[] text, int offset, int len)
public void writeRaw(char c) throws IOException
public void writeRawUTF8String(byte[] text, int offset, int length)
public void writeString(String text) throws IOException
public void writeString(char[] text, int offset, int len)
public void writeUTF8String(byte[] text, int offset, int length)
public void writeStartArray()
public void writeEndArray() throws IOException, JsonGenerationException
public void writeStartObject()
public void writeEndObject()
public int writeBinary(Base64Variant b64variant, InputStream data, int dataLength)
public void testFormatForParsers() throws Exception
public void testFormatForGenerators() throws Exception
