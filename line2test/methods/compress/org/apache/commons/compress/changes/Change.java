public Change(final String pFilename) { [EOL]     if (pFilename == null) { [EOL]         throw new NullPointerException(); [EOL]     } [EOL]     targetFile = pFilename; [EOL]     type = TYPE_DELETE; [EOL]     input = null; [EOL]     entry = null; [EOL] } <line_num>: 41,49
public Change(final ArchiveEntry pEntry, final InputStream pInput) { [EOL]     if (pEntry == null || pInput == null) { [EOL]         throw new NullPointerException(); [EOL]     } [EOL]     this.entry = pEntry; [EOL]     this.input = pInput; [EOL]     type = TYPE_ADD; [EOL]     targetFile = null; [EOL] } <line_num>: 60,68
public ArchiveEntry getEntry() { [EOL]     return entry; [EOL] } <line_num>: 70,72
public InputStream getInput() { [EOL]     return input; [EOL] } <line_num>: 74,76
public String targetFile() { [EOL]     return targetFile; [EOL] } <line_num>: 78,80
public int type() { [EOL]     return type; [EOL] } <line_num>: 82,84
