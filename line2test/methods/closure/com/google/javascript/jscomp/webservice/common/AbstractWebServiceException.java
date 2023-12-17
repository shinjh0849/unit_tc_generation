public abstract ErrorCode getErrorCode(); <line_num>: 24,24
public abstract String getFormattedError(); <line_num>: 25,25
@Override [EOL] public String toString() { [EOL]     return String.format("Error(%d): %s", getErrorCode().getCode(), getFormattedError()); [EOL] } <line_num>: 27,31
