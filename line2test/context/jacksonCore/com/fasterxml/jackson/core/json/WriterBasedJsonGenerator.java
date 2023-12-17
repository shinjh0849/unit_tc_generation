public WriterBasedJsonGenerator(IOContext ctxt, int features, ObjectCodec codec, Writer w)
public Object getOutputTarget()
public void writeFieldName(String name) throws IOException, JsonGenerationException
public void writeFieldName(SerializableString name) throws IOException, JsonGenerationException
public void writeStartArray() throws IOException, JsonGenerationException
public void writeEndArray() throws IOException, JsonGenerationException
public void writeStartObject() throws IOException, JsonGenerationException
public void writeEndObject() throws IOException, JsonGenerationException
protected void _writeFieldName(String name, boolean commaBefore) throws IOException, JsonGenerationException
public void _writeFieldName(SerializableString name, boolean commaBefore) throws IOException, JsonGenerationException
protected void _writePPFieldName(String name, boolean commaBefore) throws IOException, JsonGenerationException
protected void _writePPFieldName(SerializableString name, boolean commaBefore) throws IOException, JsonGenerationException
public void writeString(String text) throws IOException, JsonGenerationException
public void writeString(char[] text, int offset, int len) throws IOException, JsonGenerationException
public void writeString(SerializableString sstr) throws IOException, JsonGenerationException
public void writeRawUTF8String(byte[] text, int offset, int length) throws IOException, JsonGenerationException
public void writeUTF8String(byte[] text, int offset, int length) throws IOException, JsonGenerationException
public void writeRaw(String text) throws IOException, JsonGenerationException
public void writeRaw(String text, int start, int len) throws IOException, JsonGenerationException
public void writeRaw(SerializableString text) throws IOException, JsonGenerationException
public void writeRaw(char[] text, int offset, int len) throws IOException, JsonGenerationException
public void writeRaw(char c) throws IOException, JsonGenerationException
private void writeRawLong(String text) throws IOException, JsonGenerationException
public void writeBinary(Base64Variant b64variant, byte[] data, int offset, int len) throws IOException, JsonGenerationException
public int writeBinary(Base64Variant b64variant, InputStream data, int dataLength) throws IOException, JsonGenerationException
public void writeNumber(short s) throws IOException, JsonGenerationException
private void _writeQuotedShort(short s) throws IOException
public void writeNumber(int i) throws IOException, JsonGenerationException
private void _writeQuotedInt(int i) throws IOException
public void writeNumber(long l) throws IOException, JsonGenerationException
private void _writeQuotedLong(long l) throws IOException
public void writeNumber(BigInteger value) throws IOException, JsonGenerationException
public void writeNumber(double d) throws IOException, JsonGenerationException
public void writeNumber(float f) throws IOException, JsonGenerationException
public void writeNumber(BigDecimal value) throws IOException, JsonGenerationException
public void writeNumber(String encodedValue) throws IOException, JsonGenerationException
private void _writeQuotedRaw(Object value) throws IOException
public void writeBoolean(boolean state) throws IOException, JsonGenerationException
public void writeNull() throws IOException, JsonGenerationException
protected void _verifyValueWrite(String typeMsg) throws IOException, JsonGenerationException
protected void _verifyPrettyValueWrite(String typeMsg, int status) throws IOException, JsonGenerationException
public void flush() throws IOException
public void close() throws IOException
protected void _releaseBuffers()
private void _writeString(String text) throws IOException, JsonGenerationException
private void _writeString2(final int len) throws IOException, JsonGenerationException
private void _writeLongString(String text) throws IOException, JsonGenerationException
private void _writeSegment(int end) throws IOException, JsonGenerationException
private void _writeString(char[] text, int offset, int len) throws IOException, JsonGenerationException
private void _writeStringASCII(final int len, final int maxNonEscaped) throws IOException, JsonGenerationException
private void _writeSegmentASCII(int end, final int maxNonEscaped) throws IOException, JsonGenerationException
private void _writeStringASCII(char[] text, int offset, int len, final int maxNonEscaped) throws IOException, JsonGenerationException
private void _writeStringCustom(final int len) throws IOException, JsonGenerationException
private void _writeSegmentCustom(int end) throws IOException, JsonGenerationException
private void _writeStringCustom(char[] text, int offset, int len) throws IOException, JsonGenerationException
protected void _writeBinary(Base64Variant b64variant, byte[] input, int inputPtr, final int inputEnd) throws IOException, JsonGenerationException
protected int _writeBinary(Base64Variant b64variant, InputStream data, byte[] readBuffer, int bytesLeft) throws IOException, JsonGenerationException
protected int _writeBinary(Base64Variant b64variant, InputStream data, byte[] readBuffer) throws IOException, JsonGenerationException
private int _readMore(InputStream in, byte[] readBuffer, int inputPtr, int inputEnd, int maxRead) throws IOException
private void _writeNull() throws IOException
private void _prependOrWriteCharacterEscape(char ch, int escCode) throws IOException, JsonGenerationException
private int _prependOrWriteCharacterEscape(char[] buffer, int ptr, int end, char ch, int escCode) throws IOException, JsonGenerationException
private void _appendCharacterEscape(char ch, int escCode) throws IOException, JsonGenerationException
private char[] _allocateEntityBuffer()
protected void _flushBuffer() throws IOException
int SHORT_WRITE=Optional[32]
char[] HEX_CHARS=Optional[CharTypes.copyHexChars()]
Writer _writer
char[] _outputBuffer
int _outputHead=Optional[0]
int _outputTail=Optional[0]
int _outputEnd
char[] _entityBuffer
SerializableString _currentEscape
