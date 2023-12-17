public MathUnsupportedOperationException() { [EOL]     this(LocalizedFormats.UNSUPPORTED_OPERATION); [EOL] } <line_num>: 43,45
public MathUnsupportedOperationException(Localizable pattern, Object... args) { [EOL]     context = new ExceptionContext(this); [EOL]     context.addMessage(pattern, args); [EOL] } <line_num>: 51,55
public ExceptionContext getContext() { [EOL]     return context; [EOL] } <line_num>: 58,60
@Override [EOL] public String getMessage() { [EOL]     return context.getMessage(); [EOL] } <line_num>: 63,66
@Override [EOL] public String getLocalizedMessage() { [EOL]     return context.getLocalizedMessage(); [EOL] } <line_num>: 69,72
