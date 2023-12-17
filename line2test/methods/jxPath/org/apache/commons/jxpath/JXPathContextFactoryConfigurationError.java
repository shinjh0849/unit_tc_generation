public JXPathContextFactoryConfigurationError() { [EOL]     super(); [EOL]     this.exception = null; [EOL] } <line_num>: 39,42
public JXPathContextFactoryConfigurationError(String msg) { [EOL]     super(msg); [EOL]     this.exception = null; [EOL] } <line_num>: 51,54
public JXPathContextFactoryConfigurationError(Exception e) { [EOL]     super(e.toString()); [EOL]     this.exception = e; [EOL] } <line_num>: 65,68
public JXPathContextFactoryConfigurationError(Exception e, String msg) { [EOL]     super(msg); [EOL]     this.exception = e; [EOL] } <line_num>: 79,82
public String getMessage() { [EOL]     String message = super.getMessage(); [EOL]     if (message == null && exception != null) { [EOL]         return exception.getMessage(); [EOL]     } [EOL]     return message; [EOL] } <line_num>: 93,101
public Exception getException() { [EOL]     return exception; [EOL] } <line_num>: 110,112
