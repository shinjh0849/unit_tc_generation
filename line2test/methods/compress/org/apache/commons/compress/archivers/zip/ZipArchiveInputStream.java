public ZipArchiveInputStream(InputStream inputStream) { [EOL]     input = new ZipInputStream(inputStream); [EOL] } <line_num>: 32,34
public ZipArchiveEntry getNextZipEntry() throws IOException { [EOL]     java.util.zip.ZipEntry entry = input.getNextEntry(); [EOL]     if (entry == null) { [EOL]         return null; [EOL]     } [EOL]     return new ZipArchiveEntry(entry); [EOL] } <line_num>: 36,42
public ArchiveEntry getNextEntry() throws IOException { [EOL]     return getNextZipEntry(); [EOL] } <line_num>: 44,46
public int read(byte[] b, int off, int len) throws IOException { [EOL]     return input.read(b, off, len); [EOL] } <line_num>: 48,50
public int read() throws IOException { [EOL]     return input.read(); [EOL] } <line_num>: 52,54
public static boolean matches(byte[] signature, int length) { [EOL]     if (length < ZipArchiveOutputStream.LFH_SIG.length) { [EOL]         return false; [EOL]     } [EOL]     for (int i = 0; i < ZipArchiveOutputStream.LFH_SIG.length; i++) { [EOL]         if (signature[i] != ZipArchiveOutputStream.LFH_SIG[i]) { [EOL]             return false; [EOL]         } [EOL]     } [EOL]     return true; [EOL] } <line_num>: 57,69
