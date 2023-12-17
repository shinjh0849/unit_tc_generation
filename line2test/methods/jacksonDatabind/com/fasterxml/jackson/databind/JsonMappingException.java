protected Reference() { [EOL] } <line_num>: 70,70
public Reference(Object from) { [EOL]     _from = from; [EOL] } <line_num>: 72,72
public Reference(Object from, String fieldName) { [EOL]     _from = from; [EOL]     if (fieldName == null) { [EOL]         throw new NullPointerException("Can not pass null fieldName"); [EOL]     } [EOL]     _fieldName = fieldName; [EOL] } <line_num>: 74,80
public Reference(Object from, int index) { [EOL]     _from = from; [EOL]     _index = index; [EOL] } <line_num>: 82,85
public JsonMappingException(String msg) { [EOL]     super(msg); [EOL] } <line_num>: 142,145
public JsonMappingException(String msg, Throwable rootCause) { [EOL]     super(msg, rootCause); [EOL] } <line_num>: 147,150
public JsonMappingException(String msg, JsonLocation loc) { [EOL]     super(msg, loc); [EOL] } <line_num>: 152,155
public JsonMappingException(String msg, JsonLocation loc, Throwable rootCause) { [EOL]     super(msg, loc, rootCause); [EOL] } <line_num>: 157,160
public void setFrom(Object o) { [EOL]     _from = o; [EOL] } <line_num>: 87,87
public void setFieldName(String n) { [EOL]     _fieldName = n; [EOL] } <line_num>: 88,88
public void setIndex(int ix) { [EOL]     _index = ix; [EOL] } <line_num>: 89,89
public Object getFrom() { [EOL]     return _from; [EOL] } <line_num>: 91,91
public String getFieldName() { [EOL]     return _fieldName; [EOL] } <line_num>: 92,92
public int getIndex() { [EOL]     return _index; [EOL] } <line_num>: 93,93
@Override [EOL] public String toString() { [EOL]     StringBuilder sb = new StringBuilder(); [EOL]     Class<?> cls = (_from instanceof Class<?>) ? ((Class<?>) _from) : _from.getClass(); [EOL]     Package pkg = cls.getPackage(); [EOL]     if (pkg != null) { [EOL]         sb.append(pkg.getName()); [EOL]         sb.append('.'); [EOL]     } [EOL]     sb.append(cls.getSimpleName()); [EOL]     sb.append('['); [EOL]     if (_fieldName != null) { [EOL]         sb.append('"'); [EOL]         sb.append(_fieldName); [EOL]         sb.append('"'); [EOL]     } else if (_index >= 0) { [EOL]         sb.append(_index); [EOL]     } else { [EOL]         sb.append('?'); [EOL]     } [EOL]     sb.append(']'); [EOL]     return sb.toString(); [EOL] } <line_num>: 95,121
public static JsonMappingException from(JsonParser jp, String msg) { [EOL]     return new JsonMappingException(msg, ((jp == null) ? null : jp.getTokenLocation())); [EOL] } <line_num>: 162,165
public static JsonMappingException from(JsonParser jp, String msg, Throwable problem) { [EOL]     return new JsonMappingException(msg, ((jp == null) ? null : jp.getTokenLocation()), problem); [EOL] } <line_num>: 167,171
public static JsonMappingException fromUnexpectedIOE(IOException src) { [EOL]     return new JsonMappingException("Unexpected IOException (of type " + src.getClass().getName() + "): " + src.getMessage(), (JsonLocation) null, src); [EOL] } <line_num>: 180,184
public static JsonMappingException wrapWithPath(Throwable src, Object refFrom, String refFieldName) { [EOL]     return wrapWithPath(src, new Reference(refFrom, refFieldName)); [EOL] } <line_num>: 194,198
public static JsonMappingException wrapWithPath(Throwable src, Object refFrom, int index) { [EOL]     return wrapWithPath(src, new Reference(refFrom, index)); [EOL] } <line_num>: 208,212
public static JsonMappingException wrapWithPath(Throwable src, Reference ref) { [EOL]     JsonMappingException jme; [EOL]     if (src instanceof JsonMappingException) { [EOL]         jme = (JsonMappingException) src; [EOL]     } else { [EOL]         String msg = src.getMessage(); [EOL]         if (msg == null || msg.length() == 0) { [EOL]             msg = "(was " + src.getClass().getName() + ")"; [EOL]         } [EOL]         jme = new JsonMappingException(msg, null, src); [EOL]     } [EOL]     jme.prependPath(ref); [EOL]     return jme; [EOL] } <line_num>: 219,236
public List<Reference> getPath() { [EOL]     if (_path == null) { [EOL]         return Collections.emptyList(); [EOL]     } [EOL]     return Collections.unmodifiableList(_path); [EOL] } <line_num>: 248,254
public String getPathReference() { [EOL]     return getPathReference(new StringBuilder()).toString(); [EOL] } <line_num>: 260,263
public StringBuilder getPathReference(StringBuilder sb) { [EOL]     _appendPathDesc(sb); [EOL]     return sb; [EOL] } <line_num>: 265,269
public void prependPath(Object referrer, String fieldName) { [EOL]     Reference ref = new Reference(referrer, fieldName); [EOL]     prependPath(ref); [EOL] } <line_num>: 275,279
public void prependPath(Object referrer, int index) { [EOL]     Reference ref = new Reference(referrer, index); [EOL]     prependPath(ref); [EOL] } <line_num>: 284,288
public void prependPath(Reference r) { [EOL]     if (_path == null) { [EOL]         _path = new LinkedList<Reference>(); [EOL]     } [EOL]     if (_path.size() < MAX_REFS_TO_LIST) { [EOL]         _path.addFirst(r); [EOL]     } [EOL] } <line_num>: 290,302
@Override [EOL] public String getLocalizedMessage() { [EOL]     return _buildMessage(); [EOL] } <line_num>: 310,313
@Override [EOL] public String getMessage() { [EOL]     return _buildMessage(); [EOL] } <line_num>: 319,322
protected String _buildMessage() { [EOL]     String msg = super.getMessage(); [EOL]     if (_path == null) { [EOL]         return msg; [EOL]     } [EOL]     StringBuilder sb = (msg == null) ? new StringBuilder() : new StringBuilder(msg); [EOL]     sb.append(" (through reference chain: "); [EOL]     sb = getPathReference(sb); [EOL]     sb.append(')'); [EOL]     return sb.toString(); [EOL] } <line_num>: 324,343
@Override [EOL] public String toString() { [EOL]     return getClass().getName() + ": " + getMessage(); [EOL] } <line_num>: 345,349
protected void _appendPathDesc(StringBuilder sb) { [EOL]     if (_path == null) { [EOL]         return; [EOL]     } [EOL]     Iterator<Reference> it = _path.iterator(); [EOL]     while (it.hasNext()) { [EOL]         sb.append(it.next().toString()); [EOL]         if (it.hasNext()) { [EOL]             sb.append("->"); [EOL]         } [EOL]     } [EOL] } <line_num>: 357,369
