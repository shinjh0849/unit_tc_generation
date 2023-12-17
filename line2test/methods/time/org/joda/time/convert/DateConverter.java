protected DateConverter() { [EOL]     super(); [EOL] } <line_num>: 40,42
public long getInstantMillis(Object object, Chronology chrono) { [EOL]     Date date = (Date) object; [EOL]     return date.getTime(); [EOL] } <line_num>: 54,57
public Class<?> getSupportedType() { [EOL]     return Date.class; [EOL] } <line_num>: 65,67
