public URLCodec()
public URLCodec(String charset)
public static final byte[] encodeUrl(BitSet urlsafe, byte[] bytes)
public static final byte[] decodeUrl(byte[] bytes) throws DecoderException
public byte[] encode(byte[] bytes)
public byte[] decode(byte[] bytes) throws DecoderException
public String encode(String pString, String charset) throws UnsupportedEncodingException
public String encode(String pString) throws EncoderException
public String decode(String pString, String charset) throws DecoderException, UnsupportedEncodingException
public String decode(String pString) throws DecoderException
public Object encode(Object pObject) throws EncoderException
public Object decode(Object pObject) throws DecoderException
public String getEncoding()
public String getDefaultCharset()
String charset=Optional[CharacterEncodingNames.UTF8]
byte ESCAPE_CHAR=Optional['%']
BitSet WWW_FORM_URL=Optional[new BitSet(256)]
