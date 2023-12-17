public BCodec()
public BCodec(final String charset)
protected String getEncoding()
protected byte[] doEncoding(byte[] bytes)
protected byte[] doDecoding(byte[] bytes)
public String encode(final String value, final String charset) throws EncoderException
public String encode(String value) throws EncoderException
public String decode(String value) throws DecoderException
public Object encode(Object value) throws EncoderException
public Object decode(Object value) throws DecoderException
public String getDefaultCharset()
String charset=Optional[CharacterEncodingNames.UTF8]
