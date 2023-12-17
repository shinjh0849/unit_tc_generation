public ClassKey() { [EOL]     _class = null; [EOL]     _className = null; [EOL]     _hashCode = 0; [EOL] } <line_num>: 35,40
public ClassKey(Class<?> clz) { [EOL]     _class = clz; [EOL]     _className = clz.getName(); [EOL]     _hashCode = _className.hashCode(); [EOL] } <line_num>: 42,47
public void reset(Class<?> clz) { [EOL]     _class = clz; [EOL]     _className = clz.getName(); [EOL]     _hashCode = _className.hashCode(); [EOL] } <line_num>: 49,54
@Override [EOL] public int compareTo(ClassKey other) { [EOL]     return _className.compareTo(other._className); [EOL] } <line_num>: 62,67
@Override [EOL] public boolean equals(Object o) { [EOL]     if (o == this) [EOL]         return true; [EOL]     if (o == null) [EOL]         return false; [EOL]     if (o.getClass() != getClass()) [EOL]         return false; [EOL]     ClassKey other = (ClassKey) o; [EOL]     return other._class == _class; [EOL] } <line_num>: 75,91
@Override [EOL] public int hashCode() { [EOL]     return _hashCode; [EOL] } <line_num>: 93,93
@Override [EOL] public String toString() { [EOL]     return _className; [EOL] } <line_num>: 95,95
