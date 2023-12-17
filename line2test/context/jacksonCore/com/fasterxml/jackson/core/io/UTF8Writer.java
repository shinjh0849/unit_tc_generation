public UTF8Writer(IOContext ctxt, OutputStream out)
public Writer append(char c) throws IOException
public void close() throws IOException
public void flush() throws IOException
public void write(char[] cbuf) throws IOException
public void write(char[] cbuf, int off, int len) throws IOException
public void write(int c) throws IOException
public void write(String str) throws IOException
public void write(String str, int off, int len) throws IOException
protected int convertSurrogate(int secondPart) throws IOException
protected static void illegalSurrogate(int code) throws IOException
protected static String illegalSurrogateDesc(int code)
int SURR1_FIRST=Optional[0xD800]
int SURR1_LAST=Optional[0xDBFF]
int SURR2_FIRST=Optional[0xDC00]
int SURR2_LAST=Optional[0xDFFF]
IOContext _context
OutputStream _out
byte[] _outBuffer
int _outBufferEnd
int _outPtr
int _surrogate=Optional[0]
