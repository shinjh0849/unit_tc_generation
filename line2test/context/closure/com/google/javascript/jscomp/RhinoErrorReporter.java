private RhinoErrorReporter(AbstractCompiler compiler)
private OldRhinoErrorReporter(AbstractCompiler compiler)
private NewRhinoErrorReporter(AbstractCompiler compiler)
private Pattern replacePlaceHolders(String s)
public static com.google.javascript.rhino.head.ErrorReporter forNewRhino(AbstractCompiler compiler)
public static ErrorReporter forOldRhino(AbstractCompiler compiler)
 void warningAtLine(String message, String sourceName, int line, int lineOffset)
 void errorAtLine(String message, String sourceName, int line, int lineOffset)
private JSError makeError(String message, String sourceName, int line, int lineOffset, CheckLevel defaultLevel)
public void error(String message, String sourceName, int line, int lineOffset)
public void warning(String message, String sourceName, int line, int lineOffset)
public com.google.javascript.rhino.head.EvaluatorException runtimeError(String message, String sourceName, int line, String lineSource, int lineOffset)
public void error(String message, String sourceName, int line, String sourceLine, int lineOffset)
public void error(String message, String sourceName, int offset, int length)
public void warning(String message, String sourceName, int line, String sourceLine, int lineOffset)
public void warning(String message, String sourceName, int offset, int length)
DiagnosticType PARSE_ERROR=Optional[DiagnosticType.error("JSC_PARSE_ERROR", "Parse error. {0}")]
DiagnosticType TYPE_PARSE_ERROR=Optional[DiagnosticType.warning("JSC_TYPE_PARSE_ERROR", "{0}")]
DiagnosticType TRAILING_COMMA=Optional[DiagnosticType.error("JSC_TRAILING_COMMA", "Parse error. IE8 (and below) will parse trailing commas in " + "array and object literals incorrectly. " + "If you are targeting newer versions of JS, " + "set the appropriate language_in option.")]
DiagnosticType DUPLICATE_PARAM=Optional[DiagnosticType.error("JSC_DUPLICATE_PARAM", "Parse error. {0}")]
DiagnosticType BAD_JSDOC_ANNOTATION=Optional[DiagnosticType.warning("JSC_BAD_JSDOC_ANNOTATION", "Parse error. {0}")]
DiagnosticType MISPLACED_TYPE_ANNOTATION=Optional[DiagnosticType.warning("JSC_MISPLACED_TYPE_ANNOTATION", "Type annotations are not allowed here. " + "Are you missing parentheses?")]
Map<Pattern, DiagnosticType> typeMap
AbstractCompiler compiler
