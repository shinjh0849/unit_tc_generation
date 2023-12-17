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
