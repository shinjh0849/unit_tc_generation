public JsonGeneratorDelegate(JsonGenerator d)
public ObjectCodec getCodec()
public JsonGenerator setCodec(ObjectCodec oc)
public void setSchema(FormatSchema schema)
public FormatSchema getSchema()
public Version version()
public Object getOutputTarget()
public boolean canUseSchema(FormatSchema schema)
public boolean canWriteTypeId()
public boolean canWriteObjectId()
public boolean canOmitFields()
public JsonGenerator enable(Feature f)
public JsonGenerator disable(Feature f)
public boolean isEnabled(Feature f)
public int getFeatureMask()
public JsonGenerator setFeatureMask(int mask)
public JsonGenerator setPrettyPrinter(PrettyPrinter pp)
public PrettyPrinter getPrettyPrinter()
public JsonGenerator useDefaultPrettyPrinter()
public JsonGenerator setHighestNonEscapedChar(int charCode)
public int getHighestEscapedChar()
public CharacterEscapes getCharacterEscapes()
public JsonGenerator setCharacterEscapes(CharacterEscapes esc)
public JsonGenerator setRootValueSeparator(SerializableString sep)
public void writeStartArray() throws IOException, JsonGenerationException
public void writeEndArray() throws IOException, JsonGenerationException
public void writeStartObject() throws IOException, JsonGenerationException
public void writeEndObject() throws IOException, JsonGenerationException
public void writeFieldName(String name) throws IOException, JsonGenerationException
public void writeFieldName(SerializableString name) throws IOException, JsonGenerationException
public void writeString(String text) throws IOException, JsonGenerationException
public void writeString(char[] text, int offset, int len) throws IOException, JsonGenerationException
public void writeString(SerializableString text) throws IOException, JsonGenerationException
public void writeRawUTF8String(byte[] text, int offset, int length) throws IOException, JsonGenerationException
public void writeUTF8String(byte[] text, int offset, int length) throws IOException, JsonGenerationException
public void writeRaw(String text) throws IOException, JsonGenerationException
public void writeRaw(String text, int offset, int len) throws IOException, JsonGenerationException
public void writeRaw(SerializableString raw) throws IOException, JsonGenerationException
public void writeRaw(char[] text, int offset, int len) throws IOException, JsonGenerationException
public void writeRaw(char c) throws IOException, JsonGenerationException
public void writeRawValue(String text) throws IOException, JsonGenerationException
public void writeRawValue(String text, int offset, int len) throws IOException, JsonGenerationException
public void writeRawValue(char[] text, int offset, int len) throws IOException, JsonGenerationException
public void writeBinary(Base64Variant b64variant, byte[] data, int offset, int len) throws IOException, JsonGenerationException
public int writeBinary(Base64Variant b64variant, InputStream data, int dataLength) throws IOException, JsonGenerationException
public void writeNumber(short v) throws IOException, JsonGenerationException
public void writeNumber(int v) throws IOException, JsonGenerationException
public void writeNumber(long v) throws IOException, JsonGenerationException
public void writeNumber(BigInteger v) throws IOException, JsonGenerationException
public void writeNumber(double v) throws IOException, JsonGenerationException
public void writeNumber(float v) throws IOException, JsonGenerationException
public void writeNumber(BigDecimal v) throws IOException, JsonGenerationException
public void writeNumber(String encodedValue) throws IOException, JsonGenerationException, UnsupportedOperationException
public void writeBoolean(boolean state) throws IOException, JsonGenerationException
public void writeNull() throws IOException, JsonGenerationException
public void writeOmittedField(String fieldName) throws IOException, JsonGenerationException
public void writeObjectId(Object id) throws IOException, JsonGenerationException
public void writeObjectRef(Object id) throws IOException, JsonGenerationException
public void writeTypeId(Object id) throws IOException, JsonGenerationException
public void writeObject(Object pojo) throws IOException, JsonProcessingException
public void writeTree(TreeNode rootNode) throws IOException, JsonProcessingException
public void copyCurrentEvent(JsonParser jp) throws IOException, JsonProcessingException
public void copyCurrentStructure(JsonParser jp) throws IOException, JsonProcessingException
public JsonStreamContext getOutputContext()
public void flush() throws IOException
public void close() throws IOException
public boolean isClosed()
JsonGenerator delegate
