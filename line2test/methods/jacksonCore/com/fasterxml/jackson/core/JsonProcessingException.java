protected JsonProcessingException(String msg, JsonLocation loc, Throwable rootCause) { [EOL]     super(msg); [EOL]     if (rootCause != null) { [EOL]         initCause(rootCause); [EOL]     } [EOL]     _location = loc; [EOL] } <line_num>: 22,32
protected JsonProcessingException(String msg) { [EOL]     super(msg); [EOL] } <line_num>: 34,37
protected JsonProcessingException(String msg, JsonLocation loc) { [EOL]     this(msg, loc, null); [EOL] } <line_num>: 39,42
protected JsonProcessingException(String msg, Throwable rootCause) { [EOL]     this(msg, null, rootCause); [EOL] } <line_num>: 44,47
protected JsonProcessingException(Throwable rootCause) { [EOL]     this(null, null, rootCause); [EOL] } <line_num>: 49,52
public JsonLocation getLocation() { [EOL]     return _location; [EOL] } <line_num>: 54,56
public String getOriginalMessage() { [EOL]     return super.getMessage(); [EOL] } <line_num>: 71,74
protected String getMessageSuffix() { [EOL]     return null; [EOL] } <line_num>: 87,89
@Override [EOL] public String getMessage() { [EOL]     String msg = super.getMessage(); [EOL]     if (msg == null) { [EOL]         msg = "N/A"; [EOL]     } [EOL]     JsonLocation loc = getLocation(); [EOL]     String suffix = getMessageSuffix(); [EOL]     if (loc != null || suffix != null) { [EOL]         StringBuilder sb = new StringBuilder(100); [EOL]         sb.append(msg); [EOL]         if (suffix != null) { [EOL]             sb.append(suffix); [EOL]         } [EOL]         if (loc != null) { [EOL]             sb.append('\n'); [EOL]             sb.append(" at "); [EOL]             sb.append(loc.toString()); [EOL]         } [EOL]         msg = sb.toString(); [EOL]     } [EOL]     return msg; [EOL] } <line_num>: 100,124
@Override [EOL] public String toString() { [EOL]     return getClass().getName() + ": " + getMessage(); [EOL] } <line_num>: 126,129
