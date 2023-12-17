protected ConcurrentRuntimeException() { [EOL]     super(); [EOL] } <line_num>: 46,48
public ConcurrentRuntimeException(final Throwable cause) { [EOL]     super(ConcurrentUtils.checkedException(cause)); [EOL] } <line_num>: 57,59
public ConcurrentRuntimeException(final String msg, final Throwable cause) { [EOL]     super(msg, ConcurrentUtils.checkedException(cause)); [EOL] } <line_num>: 69,71
