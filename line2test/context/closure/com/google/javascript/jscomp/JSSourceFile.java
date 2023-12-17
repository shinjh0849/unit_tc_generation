private JSSourceFile(SourceFile referenced)
public static JSSourceFile fromFile(String fileName, Charset charSet)
public static JSSourceFile fromFile(String fileName)
public static JSSourceFile fromFile(File file, Charset charSet)
public static JSSourceFile fromFile(File file)
public static JSSourceFile fromCode(String fileName, String code)
public static JSSourceFile fromInputStream(String fileName, InputStream s) throws IOException
public static JSSourceFile fromGenerator(String fileName, Generator generator)
public String getCode() throws IOException
public void clearCachedSource()
 String getCodeNoCache()
long serialVersionUID=Optional[1L]
SourceFile referenced
