public ZipFile(File f) throws IOException
public ZipFile(String name) throws IOException
public ZipFile(String name, String encoding) throws IOException
public ZipFile(File f, String encoding) throws IOException
public ZipFile(File f, String encoding, boolean useUnicodeExtraFields) throws IOException
 BoundedInputStream(long start, long remaining)
private NameAndComment(byte[] name, byte[] comment)
public String getEncoding()
public void close() throws IOException
public static void closeQuietly(ZipFile zipfile)
public Enumeration getEntries()
public ZipArchiveEntry getEntry(String name)
public InputStream getInputStream(ZipArchiveEntry ze) throws IOException, ZipException
private Map populateFromCentralDirectory() throws IOException
private void positionAtCentralDirectory() throws IOException
private void resolveLocalFileHeaderData(Map entriesWithoutEFS) throws IOException
private boolean startsWithLocalFileHeader() throws IOException
private void setNameAndCommentFromExtraFields(ZipArchiveEntry ze, NameAndComment nc)
private String getUnicodeStringIfOriginalMatches(AbstractUnicodeExtraField f, byte[] orig)
public int read() throws IOException
public int read(byte[] b, int off, int len) throws IOException
 void addDummy()
