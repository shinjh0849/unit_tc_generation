public ThrottledInputStream(byte[] data, int maxBytes)
public ThrottledInputStream(InputStream in, int maxBytes)
public int read(byte[] buf) throws IOException
public int read(byte[] buf, int offset, int len) throws IOException
public void testStreamingWrites() throws Exception
public void testIssue55() throws Exception
private void _testStreamingWrites(JsonFactory jf, boolean useBytes) throws Exception
Base64Variant[] VARIANTS=Optional[{ Base64Variants.MIME, Base64Variants.MIME_NO_LINEFEEDS, Base64Variants.MODIFIED_FOR_URL, Base64Variants.PEM }]
String TEXT=Optional["Some content so that we can test encoding of base64 data; must" + " be long enough include a line wrap or two..."]
String TEXT4=Optional[TEXT + TEXT + TEXT + TEXT]
