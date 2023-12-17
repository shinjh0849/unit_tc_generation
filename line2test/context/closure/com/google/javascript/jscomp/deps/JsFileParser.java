public JsFileParser(ErrorManager errorManager)
public JsFileParser setIncludeGoogBase(boolean include)
public DependencyInfo parseFile(String filePath, String closureRelativePath) throws IOException
public DependencyInfo parseFile(String filePath, String closureRelativePath, String fileContents)
private DependencyInfo parseReader(String filePath, String closureRelativePath, Reader fileContents)
protected boolean parseLine(String line) throws ParseException
Logger logger=Optional[Logger.getLogger(JsFileParser.class.getName())]
Pattern GOOG_PROVIDE_REQUIRE_PATTERN=Optional[Pattern.compile("(?:^|;)\\s*goog\\.(provide|require|addDependency)\\s*\\((.*?)\\)")]
String BASE_JS_START=Optional["var COMPILED = false;"]
Matcher googMatcher=Optional[GOOG_PROVIDE_REQUIRE_PATTERN.matcher("")]
List<String> provides
List<String> requires
boolean fileHasProvidesOrRequires
boolean includeGoogBase=Optional[false]
