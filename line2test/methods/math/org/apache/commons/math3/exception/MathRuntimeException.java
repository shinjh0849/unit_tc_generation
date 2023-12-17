public MathRuntimeException(Localizable pattern, Object... args) { [EOL]     context = new ExceptionContext(this); [EOL]     context.addMessage(pattern, args); [EOL] } <line_num>: 44,48
public ExceptionContext getContext() { [EOL]     return context; [EOL] } <line_num>: 51,53
@Override [EOL] public String getMessage() { [EOL]     return context.getMessage(); [EOL] } <line_num>: 56,59
@Override [EOL] public String getLocalizedMessage() { [EOL]     return context.getLocalizedMessage(); [EOL] } <line_num>: 62,65
