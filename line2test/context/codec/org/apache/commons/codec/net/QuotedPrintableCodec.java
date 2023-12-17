public QuotedPrintableCodec()
public QuotedPrintableCodec(String charset)
private static final void encodeQuotedPrintable(int b, ByteArrayOutputStream buffer)
public static final byte[] encodeQuotedPrintable(BitSet printable, byte[] bytes)
public static final byte[] decodeQuotedPrintable(byte[] bytes) throws DecoderException
public byte[] encode(byte[] bytes)
public byte[] decode(byte[] bytes) throws DecoderException
public String encode(String pString) throws EncoderException
public String decode(String pString, String charset) throws DecoderException, UnsupportedEncodingException
public String decode(String pString) throws DecoderException
public Object encode(Object pObject) throws EncoderException
public Object decode(Object pObject) throws DecoderException
public String getDefaultCharset()
public String encode(String pString, String charset) throws UnsupportedEncodingException
String charset=Optional[CharacterEncodingNames.UTF8]
BitSet PRINTABLE_CHARS=Optional[new BitSet(256)]
byte ESCAPE_CHAR=Optional['=']
byte TAB=Optional[9]
byte SPACE=Optional[32]
