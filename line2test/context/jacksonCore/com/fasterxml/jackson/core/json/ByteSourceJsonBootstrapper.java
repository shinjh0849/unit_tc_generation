public ByteSourceJsonBootstrapper(IOContext ctxt, InputStream in)
public ByteSourceJsonBootstrapper(IOContext ctxt, byte[] inputBuffer, int inputStart, int inputLen)
public JsonEncoding detectEncoding() throws IOException, JsonParseException
public Reader constructReader() throws IOException
public JsonParser constructParser(int parserFeatures, ObjectCodec codec, BytesToNameCanonicalizer rootByteSymbols, CharsToNameCanonicalizer rootCharSymbols, boolean canonicalize, boolean intern) throws IOException, JsonParseException
public static MatchStrength hasJSONFormat(InputAccessor acc) throws IOException
private static MatchStrength tryMatch(InputAccessor acc, String matchStr, MatchStrength fullMatchStrength) throws IOException
private static int skipSpace(InputAccessor acc) throws IOException
private static int skipSpace(InputAccessor acc, byte b) throws IOException
private boolean handleBOM(int quad) throws IOException
private boolean checkUTF32(int quad) throws IOException
private boolean checkUTF16(int i16)
private void reportWeirdUCS4(String type) throws IOException
protected boolean ensureLoaded(int minimum) throws IOException
byte UTF8_BOM_1=Optional[(byte) 0xEF]
byte UTF8_BOM_2=Optional[(byte) 0xBB]
byte UTF8_BOM_3=Optional[(byte) 0xBF]
IOContext _context
InputStream _in
byte[] _inputBuffer
int _inputPtr
int _inputEnd
boolean _bufferRecyclable
int _inputProcessed
boolean _bigEndian=Optional[true]
int _bytesPerChar=Optional[0]
