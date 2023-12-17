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
