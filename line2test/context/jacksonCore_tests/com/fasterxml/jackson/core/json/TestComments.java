public void testDefaultSettings() throws Exception
public void testCommentsDisabled() throws Exception
public void testCommentsEnabled() throws Exception
public void testCommentsWithUTF8() throws Exception
private void _testWithUTF8Chars(String doc, boolean useStream) throws IOException
private void _testDisabled(String doc, boolean useStream) throws IOException
private void _testEnabled(String doc, boolean useStream) throws IOException
private JsonParser _createParser(String doc, boolean useStream, boolean enabled) throws IOException
String DOC_WITH_SLASHSTAR_COMMENT=Optional["[ /* comment:\n ends here */ 1 /* one more ok to have \"unquoted\"  */ ]"]
String DOC_WITH_SLASHSLASH_COMMENT=Optional["[ // comment...\n 1 \r  // one more, not array: []   \n ]"]
