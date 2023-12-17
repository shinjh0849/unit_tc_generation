public ContextedRuntimeException() { [EOL]     super(); [EOL]     exceptionContext = new DefaultExceptionContext(); [EOL] } <line_num>: 96,99
public ContextedRuntimeException(final String message) { [EOL]     super(message); [EOL]     exceptionContext = new DefaultExceptionContext(); [EOL] } <line_num>: 108,111
public ContextedRuntimeException(final Throwable cause) { [EOL]     super(cause); [EOL]     exceptionContext = new DefaultExceptionContext(); [EOL] } <line_num>: 120,123
public ContextedRuntimeException(final String message, final Throwable cause) { [EOL]     super(message, cause); [EOL]     exceptionContext = new DefaultExceptionContext(); [EOL] } <line_num>: 133,136
public ContextedRuntimeException(final String message, final Throwable cause, ExceptionContext context) { [EOL]     super(message, cause); [EOL]     if (context == null) { [EOL]         context = new DefaultExceptionContext(); [EOL]     } [EOL]     exceptionContext = context; [EOL] } <line_num>: 145,151
@Override [EOL] public ContextedRuntimeException addContextValue(final String label, final Object value) { [EOL]     exceptionContext.addContextValue(label, value); [EOL]     return this; [EOL] } <line_num>: 167,171
@Override [EOL] public ContextedRuntimeException setContextValue(final String label, final Object value) { [EOL]     exceptionContext.setContextValue(label, value); [EOL]     return this; [EOL] } <line_num>: 186,190
@Override [EOL] public List<Object> getContextValues(final String label) { [EOL]     return this.exceptionContext.getContextValues(label); [EOL] } <line_num>: 195,198
@Override [EOL] public Object getFirstContextValue(final String label) { [EOL]     return this.exceptionContext.getFirstContextValue(label); [EOL] } <line_num>: 203,206
@Override [EOL] public List<Pair<String, Object>> getContextEntries() { [EOL]     return this.exceptionContext.getContextEntries(); [EOL] } <line_num>: 211,214
@Override [EOL] public Set<String> getContextLabels() { [EOL]     return exceptionContext.getContextLabels(); [EOL] } <line_num>: 219,222
@Override [EOL] public String getMessage() { [EOL]     return getFormattedExceptionMessage(super.getMessage()); [EOL] } <line_num>: 230,233
public String getRawMessage() { [EOL]     return super.getMessage(); [EOL] } <line_num>: 242,244
@Override [EOL] public String getFormattedExceptionMessage(final String baseMessage) { [EOL]     return exceptionContext.getFormattedExceptionMessage(baseMessage); [EOL] } <line_num>: 249,252
