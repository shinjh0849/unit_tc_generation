ByteBufferType(int size) { [EOL]     this.size = size; [EOL] } <line_num>: 40,40
CharBufferType(int size) { [EOL]     this.size = size; [EOL] } <line_num>: 52,52
public BufferRecycler() { [EOL] } <line_num>: 58,58
public final byte[] allocByteBuffer(ByteBufferType type) { [EOL]     int ix = type.ordinal(); [EOL]     byte[] buffer = _byteBuffers[ix]; [EOL]     if (buffer == null) { [EOL]         buffer = balloc(type.size); [EOL]     } else { [EOL]         _byteBuffers[ix] = null; [EOL]     } [EOL]     return buffer; [EOL] } <line_num>: 60,70
public final void releaseByteBuffer(ByteBufferType type, byte[] buffer) { [EOL]     _byteBuffers[type.ordinal()] = buffer; [EOL] } <line_num>: 72,75
public final char[] allocCharBuffer(CharBufferType type) { [EOL]     return allocCharBuffer(type, 0); [EOL] } <line_num>: 77,80
public final char[] allocCharBuffer(CharBufferType type, int minSize) { [EOL]     if (type.size > minSize) { [EOL]         minSize = type.size; [EOL]     } [EOL]     int ix = type.ordinal(); [EOL]     char[] buffer = _charBuffers[ix]; [EOL]     if (buffer == null || buffer.length < minSize) { [EOL]         buffer = calloc(minSize); [EOL]     } else { [EOL]         _charBuffers[ix] = null; [EOL]     } [EOL]     return buffer; [EOL] } <line_num>: 82,95
public final void releaseCharBuffer(CharBufferType type, char[] buffer) { [EOL]     _charBuffers[type.ordinal()] = buffer; [EOL] } <line_num>: 97,100
private byte[] balloc(int size) { [EOL]     return new byte[size]; [EOL] } <line_num>: 108,111
private char[] calloc(int size) { [EOL]     return new char[size]; [EOL] } <line_num>: 113,116
