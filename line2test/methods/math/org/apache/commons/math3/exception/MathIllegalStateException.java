public MathIllegalStateException(Localizable pattern, Object... args) { [EOL]     context = new ExceptionContext(this); [EOL]     context.addMessage(pattern, args); [EOL] } <line_num>: 44,48
public MathIllegalStateException(Throwable cause, Localizable pattern, Object... args) { [EOL]     super(cause); [EOL]     context = new ExceptionContext(this); [EOL]     context.addMessage(pattern, args); [EOL] } <line_num>: 57,63
public MathIllegalStateException() { [EOL]     this(LocalizedFormats.ILLEGAL_STATE); [EOL] } <line_num>: 68,70
public ExceptionContext getContext() { [EOL]     return context; [EOL] } <line_num>: 73,75
@Override [EOL] public String getMessage() { [EOL]     return context.getMessage(); [EOL] } <line_num>: 78,81
@Override [EOL] public String getLocalizedMessage() { [EOL]     return context.getLocalizedMessage(); [EOL] } <line_num>: 84,87
