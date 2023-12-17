public ZipArchiveOutputStream(OutputStream out)
public ZipArchiveOutputStream(File file) throws IOException
private UnicodeExtraFieldPolicy(String n)
public boolean isSeekable()
public void setEncoding(final String encoding)
public String getEncoding()
public void setUseLanguageEncodingFlag(boolean b)
public void setCreateUnicodeExtraFields(UnicodeExtraFieldPolicy b)
public void setFallbackToUTF8(boolean b)
public void finish() throws IOException
public void closeEntry() throws IOException
public void putNextEntry(ZipArchiveEntry ze) throws IOException
public void setComment(String comment)
public void setLevel(int level)
public void setMethod(int method)
public void write(byte[] b, int offset, int length) throws IOException
public void write(int b) throws IOException
public void close() throws IOException
public void flush() throws IOException
public void putArchiveEntry(ArchiveEntry entry) throws IOException
public void closeArchiveEntry()
public void write(byte[] b) throws IOException
protected final void deflate() throws IOException
protected void writeLocalFileHeader(ZipArchiveEntry ze) throws IOException
protected void writeDataDescriptor(ZipArchiveEntry ze) throws IOException
protected void writeCentralFileHeader(ZipArchiveEntry ze) throws IOException
protected void writeCentralDirectoryEnd() throws IOException
protected final void writeOut(byte[] data) throws IOException
protected final void writeOut(byte[] data, int offset, int length) throws IOException
private void deflateUntilInputIsNeeded() throws IOException
private void writeVersionNeededToExtractAndGeneralPurposeBits(final int zipMethod, final boolean utfFallback) throws IOException
public String toString()
int BYTE_MASK=Optional[0xFF]
int SHORT=Optional[2]
int WORD=Optional[4]
int BUFFER_SIZE=Optional[512]
int DEFLATER_BLOCK_SIZE=Optional[8192]
int DEFLATED=Optional[java.util.zip.ZipEntry.DEFLATED]
int DEFAULT_COMPRESSION=Optional[Deflater.DEFAULT_COMPRESSION]
int STORED=Optional[java.util.zip.ZipEntry.STORED]
String DEFAULT_ENCODING=Optional[ZipEncodingHelper.UTF8]
int EFS_FLAG=Optional[1 << 11]
ZipArchiveEntry entry
String comment=Optional[""]
int level=Optional[DEFAULT_COMPRESSION]
boolean hasCompressionLevelChanged=Optional[false]
int method=Optional[java.util.zip.ZipEntry.DEFLATED]
List entries=Optional[new LinkedList()]
CRC32 crc=Optional[new CRC32()]
long written=Optional[0]
long dataStart=Optional[0]
long localDataStart=Optional[0]
long cdOffset=Optional[0]
long cdLength=Optional[0]
byte[] ZERO=Optional[{ 0, 0 }]
byte[] LZERO=Optional[{ 0, 0, 0, 0 }]
Map offsets=Optional[new HashMap()]
String encoding=Optional[DEFAULT_ENCODING]
ZipEncoding zipEncoding=Optional[ZipEncodingHelper.getZipEncoding(DEFAULT_ENCODING)]
Deflater def=Optional[new Deflater(level, true)]
byte[] buf=Optional[new byte[BUFFER_SIZE]]
RandomAccessFile raf
OutputStream out
boolean useEFS=Optional[true]
boolean fallbackToUTF8=Optional[false]
UnicodeExtraFieldPolicy createUnicodeExtraFields=Optional[UnicodeExtraFieldPolicy.NEVER]
byte[] LFH_SIG=Optional[ZipLong.getBytes(0X04034B50L)]
byte[] DD_SIG=Optional[ZipLong.getBytes(0X08074B50L)]
byte[] CFH_SIG=Optional[ZipLong.getBytes(0X02014B50L)]
byte[] EOCD_SIG=Optional[ZipLong.getBytes(0X06054B50L)]
