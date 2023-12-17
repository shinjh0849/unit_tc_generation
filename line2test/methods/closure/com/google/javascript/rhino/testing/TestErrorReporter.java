public TestErrorReporter(String[] errors, String[] warnings) { [EOL]     this.errors = errors; [EOL]     this.warnings = warnings; [EOL] } <line_num>: 64,67
public static TestErrorReporter forNoExpectedReports() { [EOL]     return new TestErrorReporter(null, null); [EOL] } <line_num>: 69,71
public void setErrors(String[] errors) { [EOL]     this.errors = errors; [EOL]     errorsIndex = 0; [EOL] } <line_num>: 73,76
public void setWarnings(String[] warnings) { [EOL]     this.warnings = warnings; [EOL]     warningsIndex = 0; [EOL] } <line_num>: 78,81
@Override [EOL] public void error(String message, String sourceName, int line, int lineOffset) { [EOL]     if (errors != null && errorsIndex < errors.length) { [EOL]         assertEquals(errors[errorsIndex++], message); [EOL]     } else { [EOL]         fail("extra error: " + message); [EOL]     } [EOL] } <line_num>: 83,91
@Override [EOL] public void warning(String message, String sourceName, int line, int lineOffset) { [EOL]     if (warnings != null && warningsIndex < warnings.length) { [EOL]         assertEquals(warnings[warningsIndex++], message); [EOL]     } else { [EOL]         fail("extra warning: " + message); [EOL]     } [EOL] } <line_num>: 93,101
public boolean hasEncounteredAllWarnings() { [EOL]     return (warnings == null) ? warningsIndex == 0 : warnings.length == warningsIndex; [EOL] } <line_num>: 106,110
public boolean hasEncounteredAllErrors() { [EOL]     return (errors == null) ? errorsIndex == 0 : errors.length == errorsIndex; [EOL] } <line_num>: 115,119
