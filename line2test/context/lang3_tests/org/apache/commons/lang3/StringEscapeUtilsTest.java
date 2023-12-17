public void testConstructor()
public void testEscapeJava() throws IOException
public void testEscapeJavaWithSlash()
private void assertEscapeJava(final String escaped, final String original) throws IOException
private void assertEscapeJava(String message, final String expected, final String original) throws IOException
public void testUnescapeJava() throws IOException
private void assertUnescapeJava(final String unescaped, final String original) throws IOException
private void assertUnescapeJava(final String message, final String unescaped, final String original) throws IOException
public void testEscapeEcmaScript()
public void testEscapeHtml()
public void testUnescapeHtml4()
public void testUnescapeHexCharsHtml()
public void testUnescapeUnknownEntity() throws Exception
public void testEscapeHtmlVersions() throws Exception
public void testEscapeXml() throws Exception
public void testEscapeXmlSupplementaryCharacters()
public void testEscapeXmlAllCharacters()
public void testUnescapeXmlSupplementaryCharacters()
public void testStandaloneAmphersand()
public void testLang313()
public void testEscapeCsvString() throws Exception
public void testEscapeCsvWriter() throws Exception
private void checkCsvEscapeWriter(final String expected, final String value)
public void testUnescapeCsvString() throws Exception
public void testUnescapeCsvWriter() throws Exception
private void checkCsvUnescapeWriter(final String expected, final String value)
public void testEscapeHtmlHighUnicode() throws java.io.UnsupportedEncodingException
public void testEscapeHiragana()
public void testLang708() throws IOException
public void testLang720()
public void testEscapeJson()
String FOO=Optional["foo"]
String[][] HTML_ESCAPES=Optional[{ { "no escaping", "plain text", "plain text" }, { "no escaping", "plain text", "plain text" }, { "empty string", "", "" }, { "null", null, null }, { "ampersand", "bread &amp; butter", "bread & butter" }, { "quotes", "&quot;bread&quot; &amp; butter", "\"bread\" & butter" }, { "final character only", "greater than &gt;", "greater than >" }, { "first character only", "&lt; less than", "< less than" }, { "apostrophe", "Huntington's chorea", "Huntington's chorea" }, { "languages", "English,Fran&ccedil;ais,\u65E5\u672C\u8A9E (nihongo)", "English,Fran\u00E7ais,\u65E5\u672C\u8A9E (nihongo)" }, { "8-bit ascii shouldn't number-escape", "\u0080\u009F", "\u0080\u009F" } }]
