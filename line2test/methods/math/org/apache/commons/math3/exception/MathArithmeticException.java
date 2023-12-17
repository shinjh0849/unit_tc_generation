public MathArithmeticException() { [EOL]     context = new ExceptionContext(this); [EOL]     context.addMessage(LocalizedFormats.ARITHMETIC_EXCEPTION); [EOL] } <line_num>: 43,46
public MathArithmeticException(Localizable pattern, Object... args) { [EOL]     context = new ExceptionContext(this); [EOL]     context.addMessage(pattern, args); [EOL] } <line_num>: 55,59
public ExceptionContext getContext() { [EOL]     return context; [EOL] } <line_num>: 62,64
@Override [EOL] public String getMessage() { [EOL]     return context.getMessage(); [EOL] } <line_num>: 67,70
@Override [EOL] public String getLocalizedMessage() { [EOL]     return context.getLocalizedMessage(); [EOL] } <line_num>: 73,76
