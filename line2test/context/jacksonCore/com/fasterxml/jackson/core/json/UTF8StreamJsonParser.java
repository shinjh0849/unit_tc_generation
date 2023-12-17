public UTF8StreamJsonParser(IOContext ctxt, int features, InputStream in, ObjectCodec codec, BytesToNameCanonicalizer sym, byte[] inputBuffer, int start, int end, boolean bufferRecyclable)
public ObjectCodec getCodec()
public void setCodec(ObjectCodec c)
public int releaseBuffered(OutputStream out) throws IOException
public Object getInputSource()
protected boolean loadMore() throws IOException
protected boolean _loadToHaveAtLeast(int minAvailable) throws IOException
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
private JsonToken _nextTokenNotInObject(int i) throws IOException, JsonParseException
private JsonToken _nextAfterName()
public void close() throws IOException
public boolean nextFieldName(SerializableString str) throws IOException, JsonParseException
private void _isNextTokenNameYes() throws IOException, JsonParseException
private boolean _isNextTokenNameMaybe(int i, SerializableString str) throws IOException, JsonParseException
public String nextTextValue() throws IOException, JsonParseException
public int nextIntValue(int defaultValue) throws IOException, JsonParseException
public long nextLongValue(long defaultValue) throws IOException, JsonParseException
public Boolean nextBooleanValue() throws IOException, JsonParseException
protected JsonToken parseNumberText(int c) throws IOException, JsonParseException
private JsonToken _parserNumber2(char[] outBuf, int outPtr, boolean negative, int intPartLength) throws IOException, JsonParseException
private int _verifyNoLeadingZeroes() throws IOException, JsonParseException
private JsonToken _parseFloatText(char[] outBuf, int outPtr, int c, boolean negative, int integerPartLength) throws IOException, JsonParseException
protected Name _parseFieldName(int i) throws IOException, JsonParseException
protected Name parseMediumFieldName(int q2, final int[] codes) throws IOException, JsonParseException
protected Name parseLongFieldName(int q) throws IOException, JsonParseException
protected Name slowParseFieldName() throws IOException, JsonParseException
private Name parseFieldName(int q1, int ch, int lastQuadBytes) throws IOException, JsonParseException
private Name parseFieldName(int q1, int q2, int ch, int lastQuadBytes) throws IOException, JsonParseException
protected Name parseEscapedFieldName(int[] quads, int qlen, int currQuad, int ch, int currQuadBytes) throws IOException, JsonParseException
protected Name _handleUnusualFieldName(int ch) throws IOException, JsonParseException
protected Name _parseApostropheFieldName() throws IOException, JsonParseException
private Name findName(int q1, int lastQuadBytes) throws JsonParseException
private Name findName(int q1, int q2, int lastQuadBytes) throws JsonParseException
private Name findName(int[] quads, int qlen, int lastQuad, int lastQuadBytes) throws JsonParseException
private Name addName(int[] quads, int qlen, int lastQuadBytes) throws JsonParseException
protected void _finishString() throws IOException, JsonParseException
private void _finishString2(char[] outBuf, int outPtr) throws IOException, JsonParseException
protected void _skipString() throws IOException, JsonParseException
protected JsonToken _handleUnexpectedValue(int c) throws IOException, JsonParseException
protected JsonToken _handleApostropheValue() throws IOException, JsonParseException
protected JsonToken _handleInvalidNumberStart(int ch, boolean neg) throws IOException, JsonParseException
protected void _matchToken(String matchStr, int i) throws IOException, JsonParseException
protected void _reportInvalidToken(String matchedPart) throws IOException, JsonParseException
protected void _reportInvalidToken(String matchedPart, String msg) throws IOException, JsonParseException
private int _skipWS() throws IOException, JsonParseException
private int _skipWSOrEnd() throws IOException, JsonParseException
private int _skipColon() throws IOException, JsonParseException
private void _skipComment() throws IOException, JsonParseException
private void _skipCComment() throws IOException, JsonParseException
private void _skipCppComment() throws IOException, JsonParseException
protected char _decodeEscaped() throws IOException, JsonParseException
protected int _decodeCharForError(int firstByte) throws IOException, JsonParseException
private int _decodeUtf8_2(int c) throws IOException, JsonParseException
private int _decodeUtf8_3(int c1) throws IOException, JsonParseException
private int _decodeUtf8_3fast(int c1) throws IOException, JsonParseException
private int _decodeUtf8_4(int c) throws IOException, JsonParseException
private void _skipUtf8_2(int c) throws IOException, JsonParseException
private void _skipUtf8_3(int c) throws IOException, JsonParseException
private void _skipUtf8_4(int c) throws IOException, JsonParseException
protected void _skipCR() throws IOException
protected void _skipLF() throws IOException
private int nextByte() throws IOException, JsonParseException
protected void _reportInvalidChar(int c) throws JsonParseException
protected void _reportInvalidInitial(int mask) throws JsonParseException
protected void _reportInvalidOther(int mask) throws JsonParseException
protected void _reportInvalidOther(int mask, int ptr) throws JsonParseException
public static int[] growArrayBy(int[] arr, int more)
protected byte[] _decodeBase64(Base64Variant b64variant) throws IOException, JsonParseException
byte BYTE_LF=Optional[(byte) '\n']
int[] sInputCodesUtf8=Optional[CharTypes.getInputCodeUtf8()]
int[] sInputCodesLatin1=Optional[CharTypes.getInputCodeLatin1()]
ObjectCodec _objectCodec
BytesToNameCanonicalizer _symbols
int[] _quadBuffer=Optional[new int[16]]
boolean _tokenIncomplete=Optional[false]
int _quad1
InputStream _inputStream
byte[] _inputBuffer
boolean _bufferRecyclable
