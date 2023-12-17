public IDKey(final Object _value) { [EOL]     id = System.identityHashCode(_value); [EOL]     value = _value; [EOL] } <line_num>: 39,46
@Override [EOL] public int hashCode() { [EOL]     return id; [EOL] } <line_num>: 52,55
@Override [EOL] public boolean equals(final Object other) { [EOL]     if (!(other instanceof IDKey)) { [EOL]         return false; [EOL]     } [EOL]     final IDKey idKey = (IDKey) other; [EOL]     if (id != idKey.id) { [EOL]         return false; [EOL]     } [EOL]     return value == idKey.value; [EOL] } <line_num>: 62,73
