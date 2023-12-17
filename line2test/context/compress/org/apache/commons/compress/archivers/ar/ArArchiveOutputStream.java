public ArArchiveOutputStream(final OutputStream pOut)
private long writeArchiveHeader() throws IOException
public void closeArchiveEntry() throws IOException
public void putArchiveEntry(final ArchiveEntry pEntry) throws IOException
private long fill(final long pOffset, final long pNewOffset, final char pFill) throws IOException
private long write(final String data) throws IOException
private long writeEntryHeader(final ArArchiveEntry pEntry) throws IOException
public void write(int b) throws IOException
public void write(byte[] b, int off, int len) throws IOException
public void write(byte[] b) throws IOException
public void close() throws IOException
OutputStream out
long archiveOffset=Optional[0]
long entryOffset=Optional[0]
ArArchiveEntry prevEntry
