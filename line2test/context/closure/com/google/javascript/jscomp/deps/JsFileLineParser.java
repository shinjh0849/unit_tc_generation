public ParseException(String message, boolean fatal)
public JsFileLineParser(ErrorManager errorManager)
public boolean isFatal()
public void setShortcutMode(boolean mode)
public boolean didParseSucceed()
 void doParse(String filePath, Reader fileContents)
 abstract boolean parseLine(String line) throws ParseException
 String parseJsString(String jsStringLiteral) throws ParseException
 List<String> parseJsStringArray(String input) throws ParseException
DiagnosticType PARSE_WARNING=Optional[DiagnosticType.warning("DEPS_PARSE_WARNING", "{0}\n{1}")]
DiagnosticType PARSE_ERROR=Optional[DiagnosticType.error("DEPS_PARSE_ERROR", "{0}\n{1}")]
boolean shortcutMode=Optional[false]
Pattern STRING_LITERAL_PATTERN=Optional[Pattern.compile("\\s*(?:'((?:\\\\'|[^'])*?)'|\"((?:\\\\\"|[^\"])*?)\")\\s*")]
Matcher valueMatcher=Optional[STRING_LITERAL_PATTERN.matcher("")]
String filePath
int lineNum
ErrorManager errorManager
boolean parseSucceeded
