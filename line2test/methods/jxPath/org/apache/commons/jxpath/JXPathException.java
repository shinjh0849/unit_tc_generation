public JXPathException() { [EOL]     super(); [EOL]     this.exception = null; [EOL] } <line_num>: 37,40
public JXPathException(String msg) { [EOL]     super(msg); [EOL]     this.exception = null; [EOL] } <line_num>: 48,51
public JXPathException(Throwable e) { [EOL]     super(e.toString()); [EOL]     this.exception = e; [EOL] } <line_num>: 61,64
public JXPathException(String msg, Throwable e) { [EOL]     super(msg); [EOL]     this.exception = e; [EOL] } <line_num>: 74,77
public String getMessage() { [EOL]     String message = super.getMessage(); [EOL]     if (exception != null) { [EOL]         if (message == null) { [EOL]             if (exception.getMessage() != null) { [EOL]                 return exception.getMessage(); [EOL]             } else { [EOL]                 return exception.getClass().getName(); [EOL]             } [EOL]         } else { [EOL]             if (exception.getMessage() != null) { [EOL]                 return message + "; " + exception.getMessage(); [EOL]             } else { [EOL]                 return message + "; " + exception.getClass().getName(); [EOL]             } [EOL]         } [EOL]     } [EOL]     return message; [EOL] } <line_num>: 87,110
public Throwable getException() { [EOL]     return exception; [EOL] } <line_num>: 118,120
public Throwable getCause() { [EOL]     return exception; [EOL] } <line_num>: 125,127
