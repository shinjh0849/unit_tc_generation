public NamedType(Class<?> c) { [EOL]     this(c, null); [EOL] } <line_num>: 19,19
public NamedType(Class<?> c, String name) { [EOL]     _class = c; [EOL]     _hashCode = c.getName().hashCode(); [EOL]     setName(name); [EOL] } <line_num>: 21,26
public Class<?> getType() { [EOL]     return _class; [EOL] } <line_num>: 28,28
public String getName() { [EOL]     return _name; [EOL] } <line_num>: 29,29
public void setName(String name) { [EOL]     _name = (name == null || name.length() == 0) ? null : name; [EOL] } <line_num>: 30,32
public boolean hasName() { [EOL]     return _name != null; [EOL] } <line_num>: 34,34
@Override [EOL] public boolean equals(Object o) { [EOL]     if (o == this) [EOL]         return true; [EOL]     if (o == null) [EOL]         return false; [EOL]     if (o.getClass() != getClass()) [EOL]         return false; [EOL]     return _class == ((NamedType) o)._class; [EOL] } <line_num>: 39,46
@Override [EOL] public int hashCode() { [EOL]     return _hashCode; [EOL] } <line_num>: 48,49
@Override [EOL] public String toString() { [EOL]     return "[NamedType, class " + _class.getName() + ", name: " + (_name == null ? "null" : ("'" + _name + "'")) + "]"; [EOL] } <line_num>: 51,54
