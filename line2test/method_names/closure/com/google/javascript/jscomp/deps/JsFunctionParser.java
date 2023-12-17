private SymbolInfo(String functionName, String symbol)
public JsFunctionParser(Collection<String> functions, ErrorManager errorManager)
private Pattern getPattern(Collection<String> functions)
public Collection<SymbolInfo> parseFile(String filePath, String fileContents)
private Collection<SymbolInfo> parseReader(String filePath, Reader fileContents)
protected boolean parseLine(String line) throws ParseException
