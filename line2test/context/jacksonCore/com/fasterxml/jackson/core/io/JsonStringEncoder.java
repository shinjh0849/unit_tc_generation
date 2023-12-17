public JsonStringEncoder()
public static JsonStringEncoder getInstance()
public char[] quoteAsString(String input)
public byte[] quoteAsUTF8(String text)
public byte[] encodeAsUTF8(String text)
private int _appendNumericEscape(int value, char[] quoteBuffer)
private int _appendNamedEscape(int escCode, char[] quoteBuffer)
private int _appendByteEscape(int ch, int escCode, ByteArrayBuilder byteBuilder, int ptr)
protected static int _convertSurrogate(int firstPart, int secondPart)
protected static void _illegalSurrogate(int code)
char[] HEX_CHARS=Optional[CharTypes.copyHexChars()]
byte[] HEX_BYTES=Optional[CharTypes.copyHexBytes()]
int SURR1_FIRST=Optional[0xD800]
int SURR1_LAST=Optional[0xDBFF]
int SURR2_FIRST=Optional[0xDC00]
int SURR2_LAST=Optional[0xDFFF]
int INT_BACKSLASH=Optional['\\']
int INT_U=Optional['u']
int INT_0=Optional['0']
ThreadLocal<SoftReference<JsonStringEncoder>> _threadEncoder=Optional[new ThreadLocal<SoftReference<JsonStringEncoder>>()]
TextBuffer _textBuffer
ByteArrayBuilder _byteBuilder
char[] _quoteBuffer
