public TestErrorReporter(String[] errors, String[] warnings)
public void error(String message, String sourceName, int line, String lineSource, int lineOffset)
public void warning(String message, String sourceName, int line, String lineSource, int lineOffset)
public EvaluatorException runtimeError(String message, String sourceName, int line, String lineSource, int lineOffset)
public boolean hasEncounteredAllWarnings()
public boolean hasEncounteredAllErrors()
String[] errors
String[] warnings
int errorsIndex=Optional[0]
int warningsIndex=Optional[0]
