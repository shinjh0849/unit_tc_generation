private Feature(boolean defaultState)
protected JsonGenerator()
public static int collectDefaults()
public boolean enabledByDefault()
public int getMask()
public abstract JsonGenerator setCodec(ObjectCodec oc)
public abstract ObjectCodec getCodec()
public abstract Version version()
public Object getOutputTarget()
public abstract JsonGenerator enable(Feature f)
public abstract JsonGenerator disable(Feature f)
public final JsonGenerator configure(Feature f, boolean state)
public abstract boolean isEnabled(Feature f)
public abstract int getFeatureMask()
public abstract JsonGenerator setFeatureMask(int mask)
public void setSchema(FormatSchema schema)
public FormatSchema getSchema()
public JsonGenerator setPrettyPrinter(PrettyPrinter pp)
public PrettyPrinter getPrettyPrinter()
public abstract JsonGenerator useDefaultPrettyPrinter()
public JsonGenerator setHighestNonEscapedChar(int charCode)
public int getHighestEscapedChar()
public CharacterEscapes getCharacterEscapes()
public JsonGenerator setCharacterEscapes(CharacterEscapes esc)
public JsonGenerator setRootValueSeparator(SerializableString sep)
public boolean canUseSchema(FormatSchema schema)
public boolean canWriteObjectId()
public boolean canWriteTypeId()
public boolean canOmitFields()
public abstract void writeStartArray() throws IOException, JsonGenerationException
public abstract void writeEndArray() throws IOException, JsonGenerationException
public abstract void writeStartObject() throws IOException, JsonGenerationException
public abstract void writeEndObject() throws IOException, JsonGenerationException
public abstract void writeFieldName(String name) throws IOException, JsonGenerationException
public abstract void writeFieldName(SerializableString name) throws IOException, JsonGenerationException
public abstract void writeString(String text) throws IOException, JsonGenerationException
public abstract void writeString(char[] text, int offset, int len) throws IOException, JsonGenerationException
public abstract void writeString(SerializableString text) throws IOException, JsonGenerationException
public abstract void writeRawUTF8String(byte[] text, int offset, int length) throws IOException, JsonGenerationException
public abstract void writeUTF8String(byte[] text, int offset, int length) throws IOException, JsonGenerationException
public abstract void writeRaw(String text) throws IOException, JsonGenerationException
public abstract void writeRaw(String text, int offset, int len) throws IOException, JsonGenerationException
public abstract void writeRaw(char[] text, int offset, int len) throws IOException, JsonGenerationException
public abstract void writeRaw(char c) throws IOException, JsonGenerationException
public void writeRaw(SerializableString raw) throws IOException, JsonGenerationException
public abstract void writeRawValue(String text) throws IOException, JsonGenerationException
public abstract void writeRawValue(String text, int offset, int len) throws IOException, JsonGenerationException
public abstract void writeRawValue(char[] text, int offset, int len) throws IOException, JsonGenerationException
public abstract void writeBinary(Base64Variant b64variant, byte[] data, int offset, int len) throws IOException, JsonGenerationException
public void writeBinary(byte[] data, int offset, int len) throws IOException, JsonGenerationException
public void writeBinary(byte[] data) throws IOException, JsonGenerationException
public int writeBinary(InputStream data, int dataLength) throws IOException, JsonGenerationException
public abstract int writeBinary(Base64Variant b64variant, InputStream data, int dataLength) throws IOException, JsonGenerationException
public void writeNumber(short v) throws IOException, JsonGenerationException
public abstract void writeNumber(int v) throws IOException, JsonGenerationException
public abstract void writeNumber(long v) throws IOException, JsonGenerationException
public abstract void writeNumber(BigInteger v) throws IOException, JsonGenerationException
public abstract void writeNumber(double d) throws IOException, JsonGenerationException
public abstract void writeNumber(float f) throws IOException, JsonGenerationException
public abstract void writeNumber(BigDecimal dec) throws IOException, JsonGenerationException
public abstract void writeNumber(String encodedValue) throws IOException, JsonGenerationException, UnsupportedOperationException
public abstract void writeBoolean(boolean state) throws IOException, JsonGenerationException
public abstract void writeNull() throws IOException, JsonGenerationException
public void writeObjectId(Object id) throws IOException, JsonGenerationException
public void writeObjectRef(Object id) throws IOException, JsonGenerationException
public void writeTypeId(Object id) throws IOException, JsonGenerationException
public abstract void writeObject(Object pojo) throws IOException, JsonProcessingException
public abstract void writeTree(TreeNode rootNode) throws IOException, JsonProcessingException
public void writeStringField(String fieldName, String value) throws IOException, JsonGenerationException
public final void writeBooleanField(String fieldName, boolean value) throws IOException, JsonGenerationException
public final void writeNullField(String fieldName) throws IOException, JsonGenerationException
public final void writeNumberField(String fieldName, int value) throws IOException, JsonGenerationException
public final void writeNumberField(String fieldName, long value) throws IOException, JsonGenerationException
public final void writeNumberField(String fieldName, double value) throws IOException, JsonGenerationException
public final void writeNumberField(String fieldName, float value) throws IOException, JsonGenerationException
public final void writeNumberField(String fieldName, BigDecimal value) throws IOException, JsonGenerationException
public final void writeBinaryField(String fieldName, byte[] data) throws IOException, JsonGenerationException
public final void writeArrayFieldStart(String fieldName) throws IOException, JsonGenerationException
public final void writeObjectFieldStart(String fieldName) throws IOException, JsonGenerationException
public final void writeObjectField(String fieldName, Object pojo) throws IOException, JsonProcessingException
public void writeOmittedField(String fieldName) throws IOException, JsonGenerationException
public abstract void copyCurrentEvent(JsonParser jp) throws IOException, JsonProcessingException
public abstract void copyCurrentStructure(JsonParser jp) throws IOException, JsonProcessingException
public abstract JsonStreamContext getOutputContext()
public abstract void flush() throws IOException
public abstract boolean isClosed()
public abstract void close() throws IOException
