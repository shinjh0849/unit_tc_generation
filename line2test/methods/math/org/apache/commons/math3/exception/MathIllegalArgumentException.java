public MathIllegalArgumentException(Localizable pattern, Object... args) { [EOL]     context = new ExceptionContext(this); [EOL]     context.addMessage(pattern, args); [EOL] } <line_num>: 43,47
public ExceptionContext getContext() { [EOL]     return context; [EOL] } <line_num>: 50,52
@Override [EOL] public String getMessage() { [EOL]     return context.getMessage(); [EOL] } <line_num>: 55,58
@Override [EOL] public String getLocalizedMessage() { [EOL]     return context.getLocalizedMessage(); [EOL] } <line_num>: 61,64
