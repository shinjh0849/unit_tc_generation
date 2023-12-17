public MutableBoolean() { [EOL]     super(); [EOL] } <line_num>: 46,48
public MutableBoolean(final boolean value) { [EOL]     super(); [EOL]     this.value = value; [EOL] } <line_num>: 55,58
public MutableBoolean(final Boolean value) { [EOL]     super(); [EOL]     this.value = value.booleanValue(); [EOL] } <line_num>: 66,69
@Override [EOL] public Boolean getValue() { [EOL]     return Boolean.valueOf(this.value); [EOL] } <line_num>: 77,80
public void setValue(final boolean value) { [EOL]     this.value = value; [EOL] } <line_num>: 87,89
@Override [EOL] public void setValue(final Boolean value) { [EOL]     this.value = value.booleanValue(); [EOL] } <line_num>: 97,100
public boolean isTrue() { [EOL]     return value == true; [EOL] } <line_num>: 109,111
public boolean isFalse() { [EOL]     return value == false; [EOL] } <line_num>: 119,121
public boolean booleanValue() { [EOL]     return value; [EOL] } <line_num>: 129,131
public Boolean toBoolean() { [EOL]     return Boolean.valueOf(booleanValue()); [EOL] } <line_num>: 140,142
@Override [EOL] public boolean equals(final Object obj) { [EOL]     if (obj instanceof MutableBoolean) { [EOL]         return value == ((MutableBoolean) obj).booleanValue(); [EOL]     } [EOL]     return false; [EOL] } <line_num>: 153,159
@Override [EOL] public int hashCode() { [EOL]     return value ? Boolean.TRUE.hashCode() : Boolean.FALSE.hashCode(); [EOL] } <line_num>: 166,169
@Override [EOL] public int compareTo(final MutableBoolean other) { [EOL]     final boolean anotherVal = other.value; [EOL]     return value == anotherVal ? 0 : (value ? 1 : -1); [EOL] } <line_num>: 179,183
@Override [EOL] public String toString() { [EOL]     return String.valueOf(value); [EOL] } <line_num>: 191,194
