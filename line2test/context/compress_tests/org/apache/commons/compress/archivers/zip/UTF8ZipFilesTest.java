public void testUtf8FileRoundtripExplicitUnicodeExtra() throws IOException
public void testUtf8FileRoundtripNoEFSExplicitUnicodeExtra() throws IOException
public void testCP437FileRoundtripExplicitUnicodeExtra() throws IOException
public void testASCIIFileRoundtripExplicitUnicodeExtra() throws IOException
public void testUtf8FileRoundtripImplicitUnicodeExtra() throws IOException
public void testUtf8FileRoundtripNoEFSImplicitUnicodeExtra() throws IOException
public void testCP437FileRoundtripImplicitUnicodeExtra() throws IOException
public void testASCIIFileRoundtripImplicitUnicodeExtra() throws IOException
public void testRead7ZipArchive() throws IOException, URISyntaxException
public void testReadWinZipArchive() throws IOException, URISyntaxException
public void testZipFileReadsUnicodeFields() throws IOException
private static void testFileRoundtrip(String encoding, boolean withEFS, boolean withExplicitUnicodeExtra) throws IOException
private static void createTestFile(File file, String encoding, boolean withEFS, boolean withExplicitUnicodeExtra) throws UnsupportedEncodingException, IOException
private static void testFile(File file, String encoding) throws IOException
private static UnicodePathExtraField findUniCodePath(ZipArchiveEntry ze)
private static void assertUnicodeName(ZipArchiveEntry ze, String expectedName, String encoding) throws IOException
public void testUtf8Interoperability() throws IOException
String UTF_8=Optional["utf-8"]
String CP437=Optional["cp437"]
String US_ASCII=Optional["US-ASCII"]
String ASCII_TXT=Optional["ascii.txt"]
String EURO_FOR_DOLLAR_TXT=Optional["\u20AC_for_Dollar.txt"]
String OIL_BARREL_TXT=Optional["\u00D6lf\u00E4sser.txt"]
