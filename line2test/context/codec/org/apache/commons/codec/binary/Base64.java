private static boolean isBase64(byte octect)
public static boolean isArrayByteBase64(byte[] arrayOctect)
public static byte[] encodeBase64(byte[] binaryData)
public static byte[] encodeBase64Chunked(byte[] binaryData)
public Object decode(Object pObject) throws DecoderException
public byte[] decode(byte[] pArray)
public static byte[] encodeBase64(byte[] binaryData, boolean isChunked)
public static byte[] decodeBase64(byte[] base64Data)
 static byte[] discardWhitespace(byte[] data)
 static byte[] discardNonBase64(byte[] data)
public Object encode(Object pObject) throws EncoderException
public byte[] encode(byte[] pArray)
public static BigInteger decodeInteger(byte[] pArray)
public static byte[] encodeInteger(BigInteger bigInt)
 static byte[] toIntegerBytes(BigInteger bigInt)
int CHUNK_SIZE=Optional[76]
byte[] CHUNK_SEPARATOR=Optional["\r\n".getBytes()]
int BASELENGTH=Optional[255]
int LOOKUPLENGTH=Optional[64]
int EIGHTBIT=Optional[8]
int SIXTEENBIT=Optional[16]
int TWENTYFOURBITGROUP=Optional[24]
int FOURBYTE=Optional[4]
int SIGN=Optional[-128]
byte PAD=Optional[(byte) '=']
byte[] base64Alphabet=Optional[new byte[BASELENGTH]]
byte[] lookUpBase64Alphabet=Optional[new byte[LOOKUPLENGTH]]
