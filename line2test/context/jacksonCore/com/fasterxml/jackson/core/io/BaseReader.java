protected BaseReader(IOContext context, InputStream in, byte[] buf, int ptr, int len)
public void close() throws IOException
public int read() throws IOException
public final void freeBuffers()
protected void reportBounds(char[] cbuf, int start, int len) throws IOException
protected void reportStrangeStream() throws IOException
int LAST_VALID_UNICODE_CHAR=Optional[0x10FFFF]
char NULL_CHAR=Optional[(char) 0]
char NULL_BYTE=Optional[(byte) 0]
IOContext _context
InputStream _in
byte[] _buffer
int _ptr
int _length
char[] _tmpBuf=Optional[null]
