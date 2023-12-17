public CpioArchiveOutputStream(final OutputStream out, final short format)
public CpioArchiveOutputStream(final OutputStream out)
private void ensureOpen() throws IOException
private void setFormat(final short format)
public void putNextEntry(final CpioArchiveEntry e) throws IOException
private void writeHeader(final CpioArchiveEntry e) throws IOException
private void writeNewEntry(final CpioArchiveEntry entry) throws IOException
private void writeOldAsciiEntry(final CpioArchiveEntry entry) throws IOException
private void writeOldBinaryEntry(final CpioArchiveEntry entry, final boolean swapHalfWord) throws IOException
public void closeArchiveEntry() throws IOException
public void write(final byte[] b, final int off, final int len) throws IOException
public void finish() throws IOException
public void close() throws IOException
private void pad(final long count, final int border) throws IOException
private void writeBinaryLong(final long number, final int length, final boolean swapHalfWord) throws IOException
private void writeAsciiLong(final long number, final int length, final int radix) throws IOException
private void writeCString(final String str) throws IOException
public void putArchiveEntry(ArchiveEntry entry) throws IOException
public void write(int b) throws IOException
