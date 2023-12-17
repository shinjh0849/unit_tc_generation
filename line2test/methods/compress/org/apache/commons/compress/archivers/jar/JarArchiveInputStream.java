public JarArchiveInputStream(final InputStream inputStream) { [EOL]     super(inputStream); [EOL] } <line_num>: 30,32
public JarArchiveEntry getNextJarEntry() throws IOException { [EOL]     ZipArchiveEntry entry = getNextZipEntry(); [EOL]     return entry == null ? null : new JarArchiveEntry(entry); [EOL] } <line_num>: 34,37
public ArchiveEntry getNextEntry() throws IOException { [EOL]     return getNextJarEntry(); [EOL] } <line_num>: 39,41
public static boolean matches(byte[] signature, int length) { [EOL]     return ZipArchiveInputStream.matches(signature, length); [EOL] } <line_num>: 43,45
