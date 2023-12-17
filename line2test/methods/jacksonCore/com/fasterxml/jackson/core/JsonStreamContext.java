protected JsonStreamContext() { [EOL] } <line_num>: 43,43
public abstract JsonStreamContext getParent(); <line_num>: 55,55
public final boolean inArray() { [EOL]     return _type == TYPE_ARRAY; [EOL] } <line_num>: 61,61
public final boolean inRoot() { [EOL]     return _type == TYPE_ROOT; [EOL] } <line_num>: 68,68
public final boolean inObject() { [EOL]     return _type == TYPE_OBJECT; [EOL] } <line_num>: 74,74
public final String getTypeDesc() { [EOL]     switch(_type) { [EOL]         case TYPE_ROOT: [EOL]             return "ROOT"; [EOL]         case TYPE_ARRAY: [EOL]             return "ARRAY"; [EOL]         case TYPE_OBJECT: [EOL]             return "OBJECT"; [EOL]     } [EOL]     return "?"; [EOL] } <line_num>: 81,88
public final int getEntryCount() { [EOL]     return _index + 1; [EOL] } <line_num>: 93,96
public final int getCurrentIndex() { [EOL]     return (_index < 0) ? 0 : _index; [EOL] } <line_num>: 101,104
public abstract String getCurrentName(); <line_num>: 111,111
