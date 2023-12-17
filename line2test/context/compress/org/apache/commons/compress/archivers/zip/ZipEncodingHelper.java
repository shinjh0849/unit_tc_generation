 SimpleEncodingHolder(char[] highChars)
public synchronized Simple8BitZipEncoding getEncoding()
 static ByteBuffer growBuffer(ByteBuffer b, int newCapacity)
 static void appendSurrogate(ByteBuffer bb, char c)
 static ZipEncoding getZipEncoding(String name)
 static boolean isUTF8(String encoding)
Map simpleEncodings
byte[] HEX_DIGITS=Optional[new byte[] { 0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x41, 0x42, 0x43, 0x44, 0x45, 0x46 }]
String UTF8=Optional["UTF8"]
ZipEncoding UTF8_ZIP_ENCODING=Optional[new FallbackZipEncoding(UTF8)]
