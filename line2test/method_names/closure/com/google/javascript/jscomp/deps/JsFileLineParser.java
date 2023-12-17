public ParseException(String message, boolean fatal)
public JsFileLineParser(ErrorManager errorManager)
public boolean isFatal()
public void setShortcutMode(boolean mode)
public boolean didParseSucceed()
 void doParse(String filePath, Reader fileContents)
 abstract boolean parseLine(String line) throws ParseException
 String parseJsString(String jsStringLiteral) throws ParseException
 List<String> parseJsStringArray(String input) throws ParseException
