public TarArchiveOutputStream(OutputStream os)
public TarArchiveOutputStream(OutputStream os, int blockSize)
public TarArchiveOutputStream(OutputStream os, int blockSize, int recordSize)
public void setLongFileMode(int longFileMode)
public void setDebug(boolean debugF)
public void setBufferDebug(boolean debug)
public void finish() throws IOException
public void close() throws IOException
public int getRecordSize()
public void putNextEntry(TarArchiveEntry entry) throws IOException
public void closeEntry() throws IOException
public void write(int b) throws IOException
public void write(byte[] wBuf) throws IOException
public void write(byte[] wBuf, int wOffset, int numToWrite) throws IOException
private void writeEOFRecord() throws IOException
public void flush() throws IOException
public void closeArchiveEntry() throws IOException
public void putArchiveEntry(ArchiveEntry entry) throws IOException
public String getDefaultFileExtension()
public String getName()
int LONGFILE_ERROR=Optional[0]
int LONGFILE_TRUNCATE=Optional[1]
int LONGFILE_GNU=Optional[2]
boolean debug
long currSize
String currName
long currBytes
byte[] oneBuf
byte[] recordBuf
int assemLen
byte[] assemBuf
TarBuffer buffer
int longFileMode=Optional[LONGFILE_ERROR]
boolean closed=Optional[false]
OutputStream out
