public JarArchiveEntry(ZipEntry entry) throws ZipException { [EOL]     super(entry); [EOL] } <line_num>: 35,37
public JarArchiveEntry(String name) { [EOL]     super(name); [EOL] } <line_num>: 39,41
public JarArchiveEntry(ZipArchiveEntry entry) throws ZipException { [EOL]     super(entry); [EOL] } <line_num>: 43,45
public JarArchiveEntry(JarEntry entry) throws ZipException { [EOL]     super(entry); [EOL] } <line_num>: 47,50
public Attributes getManifestAttributes() { [EOL]     return manifestAttributes; [EOL] } <line_num>: 52,54
public Certificate[] getCertificates() { [EOL]     if (certificates != null) { [EOL]         Certificate[] certs = new Certificate[certificates.length]; [EOL]         System.arraycopy(certificates, 0, certs, 0, certs.length); [EOL]         return certs; [EOL]     } [EOL]     return null; [EOL] } <line_num>: 56,63
