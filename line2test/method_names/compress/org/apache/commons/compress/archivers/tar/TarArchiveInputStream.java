public TarArchiveInputStream(InputStream is)
public TarArchiveInputStream(InputStream is, int blockSize)
public TarArchiveInputStream(InputStream is, int blockSize, int recordSize)
public void setDebug(boolean debug)
public void close() throws IOException
public int getRecordSize()
public int available() throws IOException
public long skip(long numToSkip) throws IOException
public void reset()
public TarArchiveEntry getNextTarEntry() throws IOException
public ArchiveEntry getNextEntry() throws IOException
public int read() throws IOException
public int read(byte[] buf, int offset, int numToRead) throws IOException
public void copyEntryContents(OutputStream out) throws IOException
protected final TarArchiveEntry getCurrentEntry()
protected final void setCurrentEntry(TarArchiveEntry e)
protected final boolean isAtEOF()
protected final void setAtEOF(boolean b)
public int read(byte[] b) throws IOException
public static boolean matches(byte[] signature, int length)
