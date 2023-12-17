public InvalidFormatException(String msg, Object value, Class<?> targetType) { [EOL]     super(msg); [EOL]     _value = value; [EOL]     _targetType = targetType; [EOL] } <line_num>: 36,42
public InvalidFormatException(String msg, JsonLocation loc, Object value, Class<?> targetType) { [EOL]     super(msg, loc); [EOL]     _value = value; [EOL]     _targetType = targetType; [EOL] } <line_num>: 44,50
public static InvalidFormatException from(JsonParser jp, String msg, Object value, Class<?> targetType) { [EOL]     return new InvalidFormatException(msg, jp.getTokenLocation(), value, targetType); [EOL] } <line_num>: 52,57
public Object getValue() { [EOL]     return _value; [EOL] } <line_num>: 71,73
public Class<?> getTargetType() { [EOL]     return _targetType; [EOL] } <line_num>: 81,83
