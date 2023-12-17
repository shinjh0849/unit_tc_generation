private NullErrorReporter() { [EOL] } <line_num>: 26,27
public void error(String message, String sourceName, int line, int lineOffset) { [EOL] } <line_num>: 29,31
public void warning(String message, String sourceName, int line, int lineOffset) { [EOL] } <line_num>: 33,35
public static ErrorReporter forOldRhino() { [EOL]     return new OldRhinoNullReporter(); [EOL] } <line_num>: 37,39
public static com.google.javascript.rhino.head.ErrorReporter forNewRhino() { [EOL]     return new NewRhinoNullReporter(); [EOL] } <line_num>: 41,44
@Override [EOL] public com.google.javascript.rhino.head.EvaluatorException runtimeError(String message, String sourceName, int line, String lineSource, int lineOffset) { [EOL]     return new com.google.javascript.rhino.head.EvaluatorException(message); [EOL] } <line_num>: 48,54
@Override [EOL] public void error(String message, String sourceName, int line, String sourceLine, int lineOffset) { [EOL]     super.error(message, sourceName, line, lineOffset); [EOL] } <line_num>: 56,60
@Override [EOL] public void warning(String message, String sourceName, int line, String sourceLine, int lineOffset) { [EOL]     super.warning(message, sourceName, line, lineOffset); [EOL] } <line_num>: 62,66
