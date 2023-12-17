public SchemaException(FormatSchema s) { [EOL]     _schema = s; [EOL] } <line_num>: 62,64
public ParserWithSchema(IOContext ioCtxt, int features) { [EOL]     super(ioCtxt, features); [EOL] } <line_num>: 69,72
public GeneratorWithSchema(int features, ObjectCodec codec) { [EOL]     super(features, codec); [EOL] } <line_num>: 142,145
@Override [EOL] public String getSchemaType() { [EOL]     return "test"; [EOL] } <line_num>: 27,28
@Override [EOL] public String getFormatName() { [EOL]     return "test"; [EOL] } <line_num>: 33,34
@Override [EOL] public boolean canUseSchema(FormatSchema schema) { [EOL]     return (schema instanceof MySchema); [EOL] } <line_num>: 36,39
@Override [EOL] protected JsonParser _createParser(Reader r, IOContext ctxt) throws IOException, JsonParseException { [EOL]     return new ParserWithSchema(ctxt, _parserFeatures); [EOL] } <line_num>: 42,47
@Override [EOL] protected JsonGenerator _createGenerator(Writer out, IOContext ctxt) throws IOException { [EOL]     return new GeneratorWithSchema(_generatorFeatures, _objectCodec); [EOL] } <line_num>: 49,53
@Override [EOL] public void setSchema(FormatSchema schema) { [EOL]     throw new SchemaException(schema); [EOL] } <line_num>: 74,77
@Override [EOL] protected void _finishString() throws IOException, JsonParseException { [EOL] } <line_num>: 79,80
@Override [EOL] public byte[] getBinaryValue(Base64Variant b64variant) { [EOL]     return null; [EOL] } <line_num>: 82,85
@Override [EOL] public byte[] getEmbeddedObject() { [EOL]     return null; [EOL] } <line_num>: 87,90
@Override [EOL] public String getText() throws IOException, JsonParseException { [EOL]     return null; [EOL] } <line_num>: 92,95
@Override [EOL] public char[] getTextCharacters() throws IOException { [EOL]     return null; [EOL] } <line_num>: 97,100
@Override [EOL] public int getTextLength() throws IOException, JsonParseException { [EOL]     return 0; [EOL] } <line_num>: 102,105
@Override [EOL] public int getTextOffset() throws IOException, JsonParseException { [EOL]     return 0; [EOL] } <line_num>: 107,110
@Override [EOL] public JsonToken nextToken() throws IOException, JsonParseException { [EOL]     return null; [EOL] } <line_num>: 112,115
@Override [EOL] public ObjectCodec getCodec() { [EOL]     return null; [EOL] } <line_num>: 117,120
@Override [EOL] public void setCodec(ObjectCodec c) { [EOL] } <line_num>: 122,123
@Override [EOL] protected boolean loadMore() throws IOException { [EOL]     return false; [EOL] } <line_num>: 125,128
@Override [EOL] protected void _closeInput() throws IOException { [EOL] } <line_num>: 130,132
@Override [EOL] public int readBinaryValue(Base64Variant b64variant, OutputStream out) { [EOL]     return 0; [EOL] } <line_num>: 134,137
@Override [EOL] public void setSchema(FormatSchema schema) { [EOL]     throw new SchemaException(schema); [EOL] } <line_num>: 147,150
@Override [EOL] protected void _releaseBuffers() { [EOL] } <line_num>: 152,153
@Override [EOL] protected void _verifyValueWrite(String typeMsg) throws IOException { [EOL] } <line_num>: 155,156
@Override [EOL] public void flush() throws IOException { [EOL] } <line_num>: 158,159
@Override [EOL] public void writeBinary(Base64Variant b64variant, byte[] data, int offset, int len) throws IOException { [EOL] } <line_num>: 161,163
@Override [EOL] public void writeBoolean(boolean state) throws IOException { [EOL] } <line_num>: 165,166
@Override [EOL] public void writeFieldName(String name) throws IOException { [EOL] } <line_num>: 168,169
@Override [EOL] public void writeNull() throws IOException, JsonGenerationException { [EOL] } <line_num>: 171,172
@Override [EOL] public void writeNumber(short v) throws IOException { [EOL] } <line_num>: 174,175
@Override [EOL] public void writeNumber(int v) throws IOException { [EOL] } <line_num>: 177,178
@Override [EOL] public void writeNumber(long v) throws IOException { [EOL] } <line_num>: 180,181
@Override [EOL] public void writeNumber(BigInteger v) throws IOException { [EOL] } <line_num>: 183,184
@Override [EOL] public void writeNumber(double d) throws IOException { [EOL] } <line_num>: 186,187
@Override [EOL] public void writeNumber(float f) throws IOException { [EOL] } <line_num>: 189,190
@Override [EOL] public void writeNumber(BigDecimal dec) throws IOException { [EOL] } <line_num>: 192,193
@Override [EOL] public void writeNumber(String encodedValue) throws IOException { [EOL] } <line_num>: 195,196
@Override [EOL] public void writeRaw(String text) throws IOException { [EOL] } <line_num>: 198,199
@Override [EOL] public void writeRaw(String text, int offset, int len) { [EOL] } <line_num>: 201,202
@Override [EOL] public void writeRaw(char[] text, int offset, int len) { [EOL] } <line_num>: 204,205
@Override [EOL] public void writeRaw(char c) throws IOException { [EOL] } <line_num>: 207,208
@Override [EOL] public void writeRawUTF8String(byte[] text, int offset, int length) { [EOL] } <line_num>: 210,211
@Override [EOL] public void writeString(String text) throws IOException { [EOL] } <line_num>: 213,214
@Override [EOL] public void writeString(char[] text, int offset, int len) { [EOL] } <line_num>: 216,217
@Override [EOL] public void writeUTF8String(byte[] text, int offset, int length) { [EOL] } <line_num>: 219,220
@Override [EOL] public void writeStartArray() { [EOL] } <line_num>: 222,223
@Override [EOL] public void writeEndArray() throws IOException, JsonGenerationException { [EOL] } <line_num>: 225,226
@Override [EOL] public void writeStartObject() { [EOL] } <line_num>: 228,229
@Override [EOL] public void writeEndObject() { [EOL] } <line_num>: 231,232
@Override [EOL] public int writeBinary(Base64Variant b64variant, InputStream data, int dataLength) { [EOL]     return -1; [EOL] } <line_num>: 234,237
public void testFormatForParsers() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(new FactoryWithSchema()); [EOL]     MySchema s = new MySchema(); [EOL]     StringReader r = new StringReader("{}"); [EOL]     try { [EOL]         mapper.reader(s).withType(Object.class).readValue(r); [EOL]         fail("Excpected exception"); [EOL]     } catch (SchemaException e) { [EOL]         assertSame(s, e._schema); [EOL]     } [EOL] } <line_num>: 246,258
public void testFormatForGenerators() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(new FactoryWithSchema()); [EOL]     MySchema s = new MySchema(); [EOL]     StringWriter sw = new StringWriter(); [EOL]     try { [EOL]         mapper.writer(s).writeValue(sw, "Foobar"); [EOL]         fail("Excpected exception"); [EOL]     } catch (SchemaException e) { [EOL]         assertSame(s, e._schema); [EOL]     } [EOL] } <line_num>: 260,272
