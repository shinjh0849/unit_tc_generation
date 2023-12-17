private JsonMLError(DiagnosticType type, String sourceName, JsonML element, int lineNumber, ErrorLevel level, String... arguments)
private JsonMLError(String description, DiagnosticType type, String sourceName, JsonML element, int lineNumber, ErrorLevel level)
public static JsonMLError make(DiagnosticType type, String sourceName, JsonML element, int lineNumber, ErrorLevel level, String... arguments)
public static JsonMLError make(JSError error, JsonMLAst ast)
