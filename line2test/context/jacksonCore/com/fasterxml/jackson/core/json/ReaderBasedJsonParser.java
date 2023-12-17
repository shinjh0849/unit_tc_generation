public ReaderBasedJsonParser(IOContext ctxt, int features, Reader r, ObjectCodec codec, CharsToNameCanonicalizer st)
public ObjectCodec getCodec()
public void setCodec(ObjectCodec c)
public int releaseBuffered(Writer w) throws IOException
public Object getInputSource()
protected boolean loadMore() throws IOException
protected char getNextChar(String eofMsg) throws IOException, JsonParseException
protected void _closeInput() throws IOException
protected void _releaseBuffers() throws IOException
public String getText() throws IOException, JsonParseException
public String getValueAsString() throws IOException, JsonParseException
public String getValueAsString(String defValue) throws IOException, JsonParseException
protected String _getText2(JsonToken t)
public char[] getTextCharacters() throws IOException, JsonParseException
public int getTextLength() throws IOException, JsonParseException
public int getTextOffset() throws IOException, JsonParseException
public byte[] getBinaryValue(Base64Variant b64variant) throws IOException, JsonParseException
public int readBinaryValue(Base64Variant b64variant, OutputStream out) throws IOException, JsonParseException
protected int _readBinary(Base64Variant b64variant, OutputStream out, byte[] buffer) throws IOException, JsonParseException
public JsonToken nextToken() throws IOException, JsonParseException
private JsonToken _nextAfterName()
public String nextTextValue() throws IOException, JsonParseException
public int nextIntValue(int defaultValue) throws IOException, JsonParseException
public long nextLongValue(long defaultValue) throws IOException, JsonParseException
public Boolean nextBooleanValue() throws IOException, JsonParseException
public void close() throws IOException
protected JsonToken parseNumberText(int ch) throws IOException, JsonParseException
private JsonToken parseNumberText2(boolean negative) throws IOException, JsonParseException
private char _verifyNoLeadingZeroes() throws IOException, JsonParseException
protected JsonToken _handleInvalidNumberStart(int ch, boolean negative) throws IOException, JsonParseException
protected String _parseFieldName(int i) throws IOException, JsonParseException
private String _parseFieldName2(int startPtr, int hash, int endChar) throws IOException, JsonParseException
protected String _handleUnusualFieldName(int i) throws IOException, JsonParseException
protected String _parseApostropheFieldName() throws IOException, JsonParseException
protected JsonToken _handleUnexpectedValue(int i) throws IOException, JsonParseException
protected JsonToken _handleApostropheValue() throws IOException, JsonParseException
private String _parseUnusualFieldName2(int startPtr, int hash, int[] codes) throws IOException, JsonParseException
protected void _finishString() throws IOException, JsonParseException
protected void _finishString2() throws IOException, JsonParseException
protected void _skipString() throws IOException, JsonParseException
protected void _skipCR() throws IOException
protected void _skipLF() throws IOException
private int _skipWS() throws IOException, JsonParseException
private int _skipWSOrEnd() throws IOException, JsonParseException
private void _skipComment() throws IOException, JsonParseException
private void _skipCComment() throws IOException, JsonParseException
private void _skipCppComment() throws IOException, JsonParseException
protected char _decodeEscaped() throws IOException, JsonParseException
protected void _matchToken(String matchStr, int i) throws IOException, JsonParseException
protected byte[] _decodeBase64(Base64Variant b64variant) throws IOException, JsonParseException
protected void _reportInvalidToken(String matchedPart) throws IOException, JsonParseException
protected void _reportInvalidToken(String matchedPart, String msg) throws IOException, JsonParseException
Reader _reader
char[] _inputBuffer
ObjectCodec _objectCodec
CharsToNameCanonicalizer _symbols
int _hashSeed
boolean _tokenIncomplete=Optional[false]
