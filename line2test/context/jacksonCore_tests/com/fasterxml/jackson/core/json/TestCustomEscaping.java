public MyEscapes()
public int[] getEscapeCodesForAscii()
public SerializableString getEscapeSequence(int ch)
public void testAboveAsciiEscapeWithReader() throws Exception
public void testAboveAsciiEscapeWithUTF8Stream() throws Exception
public void testEscapeCustomWithReader() throws Exception
public void testEscapeCustomWithUTF8Stream() throws Exception
private void _testEscapeAboveAscii(boolean useStream) throws Exception
private void _testEscapeCustom(boolean useStream) throws Exception
int TWO_BYTE_ESCAPED=Optional[0x111]
int THREE_BYTE_ESCAPED=Optional[0x1111]
SerializedString TWO_BYTE_ESCAPED_STRING=Optional[new SerializedString("&111;")]
SerializedString THREE_BYTE_ESCAPED_STRING=Optional[new SerializedString("&1111;")]
