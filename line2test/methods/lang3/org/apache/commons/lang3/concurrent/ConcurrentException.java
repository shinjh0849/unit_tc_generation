protected ConcurrentException() { [EOL]     super(); [EOL] } <line_num>: 44,46
public ConcurrentException(final Throwable cause) { [EOL]     super(ConcurrentUtils.checkedException(cause)); [EOL] } <line_num>: 55,57
public ConcurrentException(final String msg, final Throwable cause) { [EOL]     super(msg, ConcurrentUtils.checkedException(cause)); [EOL] } <line_num>: 67,69
