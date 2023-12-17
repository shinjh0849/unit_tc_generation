public void testBasicEscaping() throws Exception
public void testLongerRandomSingleChunk() throws Exception
public void testLongerRandomMultiChunk() throws Exception
private String generateRandom(int len)
private void doTestBasicEscaping(boolean charArray) throws Exception
private void doTestLongerRandom(String text, boolean charArray) throws Exception
private void doTestLongerRandomMulti(String text, boolean charArray, int round) throws Exception
String[] SAMPLES=Optional[new String[] { "\"test\"", "\n", "\\n", "\r\n", "a\\b", "tab:\nok?", "a\tb\tc\n\fdef\t \tg\"\"\"h\"\\ijklmn\b", "\"\"\"", "\\r)'\"", "Longer text & other stuff:\twith some\r\n\r\n random linefeeds etc added in to cause some \"special\" handling \\\\ to occur...\n" }]
