public ThrottledInputStream(byte[] data, int maxBytes)
public ThrottledInputStream(InputStream in, int maxBytes)
public int read(byte[] buf) throws IOException
public int read(byte[] buf, int offset, int len) throws IOException
public void testStreamingWrites() throws Exception
public void testIssue55() throws Exception
private void _testStreamingWrites(JsonFactory jf, boolean useBytes) throws Exception
