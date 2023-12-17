public UTF8JsonGenerator(IOContext ctxt, int features, ObjectCodec codec, OutputStream out)
public UTF8JsonGenerator(IOContext ctxt, int features, ObjectCodec codec, OutputStream out, byte[] outputBuffer, int outputOffset, boolean bufferRecyclable)
public Object getOutputTarget()
public final void writeFieldName(String name) throws IOException, JsonGenerationException
public final void writeFieldName(SerializableString name) throws IOException, JsonGenerationException
public final void writeStartArray() throws IOException, JsonGenerationException
public final void writeEndArray() throws IOException, JsonGenerationException
public final void writeStartObject() throws IOException, JsonGenerationException
public final void writeEndObject() throws IOException, JsonGenerationException
protected final void _writeFieldName(String name) throws IOException, JsonGenerationException
protected final void _writeFieldName(SerializableString name) throws IOException, JsonGenerationException
protected final void _writePPFieldName(String name, boolean commaBefore) throws IOException, JsonGenerationException
protected final void _writePPFieldName(SerializableString name, boolean commaBefore) throws IOException, JsonGenerationException
public void writeString(String text) throws IOException, JsonGenerationException
private void _writeLongString(String text) throws IOException, JsonGenerationException
private void _writeLongString(char[] text, int offset, int len) throws IOException, JsonGenerationException
public void writeString(char[] text, int offset, int len) throws IOException, JsonGenerationException
public final void writeString(SerializableString text) throws IOException, JsonGenerationException
public void writeRawUTF8String(byte[] text, int offset, int length) throws IOException, JsonGenerationException
public void writeUTF8String(byte[] text, int offset, int len) throws IOException, JsonGenerationException
public void writeRaw(String text) throws IOException, JsonGenerationException
public void writeRaw(String text, int offset, int len) throws IOException, JsonGenerationException
public void writeRaw(SerializableString text) throws IOException, JsonGenerationException
public final void writeRaw(char[] cbuf, int offset, int len) throws IOException, JsonGenerationException
public void writeRaw(char ch) throws IOException, JsonGenerationException
private final void _writeSegmentedRaw(char[] cbuf, int offset, int len) throws IOException, JsonGenerationException
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
protected final void _verifyValueWrite(String typeMsg) throws IOException, JsonGenerationException
protected final void _verifyPrettyValueWrite(String typeMsg, int status) throws IOException, JsonGenerationException
public final void flush() throws IOException
public void close() throws IOException
protected void _releaseBuffers()
private final void _writeBytes(byte[] bytes) throws IOException
private final void _writeBytes(byte[] bytes, int offset, int len) throws IOException
private final void _writeStringSegments(String text) throws IOException, JsonGenerationException
private final void _writeStringSegments(char[] cbuf, int offset, int totalLen) throws IOException, JsonGenerationException
private final void _writeStringSegment(char[] cbuf, int offset, int len) throws IOException, JsonGenerationException
private final void _writeStringSegment2(final char[] cbuf, int offset, final int end) throws IOException, JsonGenerationException
private final void _writeStringSegmentASCII2(final char[] cbuf, int offset, final int end) throws IOException, JsonGenerationException
private void _writeCustomStringSegment2(final char[] cbuf, int offset, final int end) throws IOException, JsonGenerationException
private int _writeCustomEscape(byte[] outputBuffer, int outputPtr, SerializableString esc, int remainingChars) throws IOException, JsonGenerationException
private int _handleLongCustomEscape(byte[] outputBuffer, int outputPtr, int outputEnd, byte[] raw, int remainingChars) throws IOException, JsonGenerationException
private void _writeUTF8Segments(byte[] utf8, int offset, int totalLen) throws IOException, JsonGenerationException
private void _writeUTF8Segment(byte[] utf8, final int offset, final int len) throws IOException, JsonGenerationException
private void _writeUTF8Segment2(final byte[] utf8, int offset, int len) throws IOException, JsonGenerationException
protected void _writeBinary(Base64Variant b64variant, byte[] input, int inputPtr, final int inputEnd) throws IOException, JsonGenerationException
protected int _writeBinary(Base64Variant b64variant, InputStream data, byte[] readBuffer, int bytesLeft) throws IOException, JsonGenerationException
protected int _writeBinary(Base64Variant b64variant, InputStream data, byte[] readBuffer) throws IOException, JsonGenerationException
private int _readMore(InputStream in, byte[] readBuffer, int inputPtr, int inputEnd, int maxRead) throws IOException
private int _outputRawMultiByteChar(int ch, char[] cbuf, int inputOffset, int inputLen) throws IOException
protected final void _outputSurrogates(int surr1, int surr2) throws IOException
private int _outputMultiByteChar(int ch, int outputPtr) throws IOException
protected final int _decodeSurrogate(int surr1, int surr2) throws IOException
private void _writeNull() throws IOException
private int _writeGenericEscape(int charToEscape, int outputPtr) throws IOException
protected final void _flushBuffer() throws IOException
