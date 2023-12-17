public SourceFile(String fileName)
public Builder()
 Preloaded(String fileName, String originalPath, String code)
 Generated(String fileName, String originalPath, Generator generator)
 OnDisk(File file, String originalPath, Charset c)
public String getCode()
public int getLineOffset(int lineno)
 int getNumLines()
private void findLineOffsets()
public String getCode() throws IOException
public Reader getCodeReader() throws IOException
 String getCodeNoCache()
private void setCode(String sourceCode)
public String getOriginalPath()
public void setOriginalPath(String originalPath)
public void clearCachedSource()
 boolean hasSourceInMemory()
public String getName()
public boolean isExtern()
 void setIsExtern(boolean newVal)
public int getLineOfOffset(int offset)
public int getColumnOfOffset(int offset)
public String getLine(int lineNumber)
public Region getRegion(int lineNumber)
public String toString()
public static SourceFile fromFile(String fileName, Charset c)
public static SourceFile fromFile(String fileName)
public static SourceFile fromFile(File file, Charset c)
public static SourceFile fromFile(File file)
public static SourceFile fromCode(String fileName, String code)
public static SourceFile fromCode(String fileName, String originalPath, String code)
public static SourceFile fromInputStream(String fileName, InputStream s) throws IOException
public static SourceFile fromInputStream(String fileName, String originalPath, InputStream s) throws IOException
public static SourceFile fromReader(String fileName, Reader r) throws IOException
public static SourceFile fromGenerator(String fileName, Generator generator)
public static Builder builder()
public Builder withCharset(Charset charset)
public Builder withOriginalPath(String originalPath)
public SourceFile buildFromFile(String fileName)
public SourceFile buildFromFile(File file)
public SourceFile buildFromCode(String fileName, String code)
public SourceFile buildFromInputStream(String fileName, InputStream s) throws IOException
public SourceFile buildFromReader(String fileName, Reader r) throws IOException
public SourceFile buildFromGenerator(String fileName, Generator generator)
public synchronized String getCode() throws IOException
public void clearCachedSource()
public synchronized String getCode() throws IOException
public Reader getCodeReader() throws IOException
public void clearCachedSource()
public void setCharset(Charset c)
public Charset getCharset()
long serialVersionUID=Optional[1L]
int SOURCE_EXCERPT_REGION_LENGTH=Optional[5]
String fileName
boolean isExternFile=Optional[false]
String originalPath=Optional[null]
int[] lineOffsets=Optional[null]
String code=Optional[null]
