private ParserRunner()
public ParseResult(Node ast, AstRoot oldAst)
public static Config createConfig(boolean isIdeMode)
public static Config createConfig(boolean isIdeMode, LanguageMode languageMode, boolean acceptConstKeyword)
public static Config createConfig(boolean isIdeMode, LanguageMode languageMode, boolean acceptConstKeyword, Set<String> extraAnnotationNames)
public static Set<String> getReservedVars()
private static synchronized void initResourceConfig()
private static Set<String> extractList(String configProp)
public static ParseResult parse(StaticSourceFile sourceFile, String sourceString, Config config, ErrorReporter errorReporter, Logger logger) throws IOException
String configResource=Optional["com.google.javascript.jscomp.parsing.ParserConfig"]
Set<String> annotationNames=Optional[null]
Set<String> suppressionNames=Optional[null]
Set<String> reservedVars=Optional[null]
