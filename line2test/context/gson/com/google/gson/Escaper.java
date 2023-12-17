 Escaper(boolean escapeHtmlCharacters)
public String escapeJsonString(CharSequence plainText)
private void escapeJsonString(CharSequence plainText, StringBuffer out) throws IOException
private boolean mustEscapeCharInJsString(int codepoint)
private static boolean isControlCharacter(int codePoint)
private static void appendHexJavaScriptRepresentation(int codePoint, Appendable out) throws IOException
char[] HEX_CHARS=Optional[{ '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' }]
Set<Character> JS_ESCAPE_CHARS
Set<Character> HTML_ESCAPE_CHARS
boolean escapeHtmlCharacters
