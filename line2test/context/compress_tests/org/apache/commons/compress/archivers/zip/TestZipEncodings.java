public void testSimpleCp437Encoding() throws IOException
public void testSimpleCp850Encoding() throws IOException
public void testNioCp1252Encoding() throws IOException
private static final void assertEquals(byte[] expected, ByteBuffer actual)
private void doSimpleEncodingTest(String name, byte[] testBytes) throws IOException
String UNENC_STRING=Optional["\u2016"]
String BAD_STRING=Optional["\u2016\u2015\u2016\u2015\u2016\u2015\u2016\u2015\u2016\u2015\u2016"]
String BAD_STRING_ENC=Optional["%U2016%U2015%U2016%U2015%U2016%U2015%U2016%U2015%U2016%U2015%U2016"]
