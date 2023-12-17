public TestErrorReporter(String[] errors, String[] warnings)
public static TestErrorReporter forNoExpectedReports()
public void setErrors(String[] errors)
public void setWarnings(String[] warnings)
public void error(String message, String sourceName, int line, int lineOffset)
public void warning(String message, String sourceName, int line, int lineOffset)
public boolean hasEncounteredAllWarnings()
public boolean hasEncounteredAllErrors()
String[] errors
String[] warnings
int errorsIndex=Optional[0]
int warningsIndex=Optional[0]
