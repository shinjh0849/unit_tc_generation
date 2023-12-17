public UTF32Reader(IOContext ctxt, InputStream in, byte[] buf, int ptr, int len, boolean isBigEndian)
public int read(char[] cbuf, int start, int len) throws IOException
private void reportUnexpectedEOF(int gotBytes, int needed) throws IOException
private void reportInvalid(int value, int offset, String msg) throws IOException
private boolean loadMore(int available) throws IOException
