 ByteBufferType(int size)
 CharBufferType(int size)
public BufferRecycler()
public final byte[] allocByteBuffer(ByteBufferType type)
public final void releaseByteBuffer(ByteBufferType type, byte[] buffer)
public final char[] allocCharBuffer(CharBufferType type)
public final char[] allocCharBuffer(CharBufferType type, int minSize)
public final void releaseCharBuffer(CharBufferType type, char[] buffer)
private byte[] balloc(int size)
private char[] calloc(int size)
int DEFAULT_WRITE_CONCAT_BUFFER_LEN=Optional[2000]
byte[][] _byteBuffers=Optional[new byte[ByteBufferType.values().length][]]
char[][] _charBuffers=Optional[new char[CharBufferType.values().length][]]
