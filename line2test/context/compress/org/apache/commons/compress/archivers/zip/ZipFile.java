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
int HASH_SIZE=Optional[509]
int SHORT=Optional[2]
int WORD=Optional[4]
int NIBLET_MASK=Optional[0x0f]
int BYTE_SHIFT=Optional[8]
int POS_0=Optional[0]
int POS_1=Optional[1]
int POS_2=Optional[2]
int POS_3=Optional[3]
Map entries=Optional[new HashMap(HASH_SIZE)]
Map nameMap=Optional[new HashMap(HASH_SIZE)]
String encoding
ZipEncoding zipEncoding
RandomAccessFile archive
boolean useUnicodeExtraFields
int CFH_LEN=Optional[/* version made by                 */
SHORT + /* version needed to extract       */
SHORT + /* general purpose bit flag        */
SHORT + /* compression method              */
SHORT + /* last mod file time              */
SHORT + /* last mod file date              */
SHORT + /* crc-32                          */
WORD + /* compressed size                 */
WORD + /* uncompressed size               */
WORD + /* filename length                 */
SHORT + /* extra field length              */
SHORT + /* file comment length             */
SHORT + /* disk number start               */
SHORT + /* internal file attributes        */
SHORT + /* external file attributes        */
WORD + /* relative offset of local header */
WORD]
int MIN_EOCD_SIZE=Optional[/* end of central dir signature    */
WORD + /* number of this disk             */
SHORT + /* number of the disk with the     */
/* start of the central directory  */
SHORT + /* total number of entries in      */
/* the central dir on this disk    */
SHORT + /* total number of entries in      */
/* the central dir                 */
SHORT + /* size of the central directory   */
WORD + /* offset of start of central      */
/* directory with respect to       */
/* the starting disk number        */
WORD + /* zipfile comment length          */
SHORT]
int MAX_EOCD_SIZE=Optional[MIN_EOCD_SIZE + /* maximum length of zipfile comment */
0xFFFF]
int CFD_LOCATOR_OFFSET=Optional[/* end of central dir signature    */
WORD + /* number of this disk             */
SHORT + /* number of the disk with the     */
/* start of the central directory  */
SHORT + /* total number of entries in      */
/* the central dir on this disk    */
SHORT + /* total number of entries in      */
/* the central dir                 */
SHORT + /* size of the central directory   */
WORD]
long LFH_OFFSET_FOR_FILENAME_LENGTH=Optional[/* local file header signature     */
WORD + /* version needed to extract       */
SHORT + /* general purpose bit flag        */
SHORT + /* compression method              */
SHORT + /* last mod file time              */
SHORT + /* last mod file date              */
SHORT + /* crc-32                          */
WORD + /* compressed size                 */
WORD + /* uncompressed size               */
WORD]
