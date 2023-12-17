public CpioArchiveInputStream(final InputStream in)
public int available() throws IOException
public void close() throws IOException
public void closeEntry() throws IOException
private void ensureOpen() throws IOException
public CpioArchiveEntry getNextCPIOEntry() throws IOException
private long pad(final long count, final int border) throws IOException
public int read() throws IOException
public int read(final byte[] b, final int off, final int len) throws IOException
private final int readFully(final byte[] b, final int off, final int len) throws IOException
private long readBinaryLong(final int length, final boolean swapHalfWord) throws IOException
private long readAsciiLong(final int length, final int radix) throws IOException
private CpioArchiveEntry readNewEntry(final boolean hasCrc) throws IOException
private CpioArchiveEntry readOldAsciiEntry() throws IOException
private CpioArchiveEntry readOldBinaryEntry(final boolean swapHalfWord) throws IOException
private String readCString(final int length) throws IOException
public long skip(final long n) throws IOException
public ArchiveEntry getNextEntry() throws IOException
public static boolean matches(byte[] signature, int length)
