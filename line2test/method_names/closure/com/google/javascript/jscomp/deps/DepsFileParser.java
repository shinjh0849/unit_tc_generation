public DepsFileParser(ErrorManager errorManager)
public DepsFileParser(Function<String, String> pathTranslator, ErrorManager errorManager)
public List<DependencyInfo> parseFile(String filePath) throws IOException
public List<DependencyInfo> parseFile(String filePath, String fileContents)
public List<DependencyInfo> parseFileReader(String filePath, Reader reader)
protected boolean parseLine(String line) throws ParseException
