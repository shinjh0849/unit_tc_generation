private JSSourceFile(SourceFile referenced) { [EOL]     super(referenced.getName()); [EOL]     this.referenced = referenced; [EOL] } <line_num>: 76,79
public static JSSourceFile fromFile(String fileName, Charset charSet) { [EOL]     return new JSSourceFile(SourceFile.fromFile(fileName, charSet)); [EOL] } <line_num>: 43,45
public static JSSourceFile fromFile(String fileName) { [EOL]     return new JSSourceFile(SourceFile.fromFile(fileName, Charsets.UTF_8)); [EOL] } <line_num>: 47,49
public static JSSourceFile fromFile(File file, Charset charSet) { [EOL]     return new JSSourceFile(SourceFile.fromFile(file, charSet)); [EOL] } <line_num>: 51,53
public static JSSourceFile fromFile(File file) { [EOL]     return new JSSourceFile(SourceFile.fromFile(file, Charsets.UTF_8)); [EOL] } <line_num>: 55,57
public static JSSourceFile fromCode(String fileName, String code) { [EOL]     return new JSSourceFile(SourceFile.fromCode(fileName, code)); [EOL] } <line_num>: 59,61
public static JSSourceFile fromInputStream(String fileName, InputStream s) throws IOException { [EOL]     return new JSSourceFile(SourceFile.fromInputStream(fileName, s)); [EOL] } <line_num>: 63,66
public static JSSourceFile fromGenerator(String fileName, Generator generator) { [EOL]     return new JSSourceFile(SourceFile.fromGenerator(fileName, generator)); [EOL] } <line_num>: 68,71
@Override [EOL] public String getCode() throws IOException { [EOL]     return referenced.getCode(); [EOL] } <line_num>: 81,84
@Override [EOL] public void clearCachedSource() { [EOL]     referenced.clearCachedSource(); [EOL] } <line_num>: 86,89
@Override [EOL] @VisibleForTesting [EOL] String getCodeNoCache() { [EOL]     return referenced.getCodeNoCache(); [EOL] } <line_num>: 91,95
