public JsFileParser(ErrorManager errorManager)
public JsFileParser setIncludeGoogBase(boolean include)
public DependencyInfo parseFile(String filePath, String closureRelativePath) throws IOException
public DependencyInfo parseFile(String filePath, String closureRelativePath, String fileContents)
private DependencyInfo parseReader(String filePath, String closureRelativePath, Reader fileContents)
protected boolean parseLine(String line) throws ParseException
