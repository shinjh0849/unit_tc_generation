public MemoryArchiveInputStream(final String[][] pFiles) { [EOL]     filenames = new String[pFiles.length]; [EOL]     content = new String[pFiles.length]; [EOL]     for (int i = 0; i < pFiles.length; i++) { [EOL]         String[] nameAndContent = pFiles[i]; [EOL]         filenames[i] = nameAndContent[0]; [EOL]         content[i] = nameAndContent[1]; [EOL]     } [EOL]     p = 0; [EOL] } <line_num>: 32,42
public ArchiveEntry getNextEntry() throws IOException { [EOL]     if (p >= filenames.length) { [EOL]         return null; [EOL]     } [EOL]     return new MemoryArchiveEntry(filenames[p]); [EOL] } <line_num>: 44,50
public String readString() { [EOL]     return content[p++]; [EOL] } <line_num>: 52,54
public int read() throws IOException { [EOL]     return 0; [EOL] } <line_num>: 56,58
