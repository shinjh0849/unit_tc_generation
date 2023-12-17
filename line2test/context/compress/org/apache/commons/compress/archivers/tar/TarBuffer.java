public TarBuffer(InputStream inStream)
public TarBuffer(InputStream inStream, int blockSize)
public TarBuffer(InputStream inStream, int blockSize, int recordSize)
public TarBuffer(OutputStream outStream)
public TarBuffer(OutputStream outStream, int blockSize)
public TarBuffer(OutputStream outStream, int blockSize, int recordSize)
private void initialize(int blockSize, int recordSize)
public int getBlockSize()
public int getRecordSize()
public void setDebug(boolean debug)
public boolean isEOFRecord(byte[] record)
public void skipRecord() throws IOException
public byte[] readRecord() throws IOException
private boolean readBlock() throws IOException
public int getCurrentBlockNum()
public int getCurrentRecordNum()
public void writeRecord(byte[] record) throws IOException
public void writeRecord(byte[] buf, int offset) throws IOException
private void writeBlock() throws IOException
private void flushBlock() throws IOException
public void close() throws IOException
int DEFAULT_RCDSIZE=Optional[(512)]
int DEFAULT_BLKSIZE=Optional[(DEFAULT_RCDSIZE * 20)]
InputStream inStream
OutputStream outStream
byte[] blockBuffer
int currBlkIdx
int currRecIdx
int blockSize
int recordSize
int recsPerBlock
boolean debug
