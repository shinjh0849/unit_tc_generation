public MutableLong() { [EOL]     super(); [EOL] } <line_num>: 43,45
public MutableLong(final long value) { [EOL]     super(); [EOL]     this.value = value; [EOL] } <line_num>: 52,55
public MutableLong(final Number value) { [EOL]     super(); [EOL]     this.value = value.longValue(); [EOL] } <line_num>: 63,66
public MutableLong(final String value) throws NumberFormatException { [EOL]     super(); [EOL]     this.value = Long.parseLong(value); [EOL] } <line_num>: 75,78
@Override [EOL] public Long getValue() { [EOL]     return Long.valueOf(this.value); [EOL] } <line_num>: 86,89
public void setValue(final long value) { [EOL]     this.value = value; [EOL] } <line_num>: 96,98
@Override [EOL] public void setValue(final Number value) { [EOL]     this.value = value.longValue(); [EOL] } <line_num>: 106,109
public void increment() { [EOL]     value++; [EOL] } <line_num>: 117,119
public void decrement() { [EOL]     value--; [EOL] } <line_num>: 126,128
public void add(final long operand) { [EOL]     this.value += operand; [EOL] } <line_num>: 137,139
public void add(final Number operand) { [EOL]     this.value += operand.longValue(); [EOL] } <line_num>: 148,150
public void subtract(final long operand) { [EOL]     this.value -= operand; [EOL] } <line_num>: 158,160
public void subtract(final Number operand) { [EOL]     this.value -= operand.longValue(); [EOL] } <line_num>: 169,171
@Override [EOL] public int intValue() { [EOL]     return (int) value; [EOL] } <line_num>: 180,183
@Override [EOL] public long longValue() { [EOL]     return value; [EOL] } <line_num>: 190,193
@Override [EOL] public float floatValue() { [EOL]     return value; [EOL] } <line_num>: 200,203
@Override [EOL] public double doubleValue() { [EOL]     return value; [EOL] } <line_num>: 210,213
public Long toLong() { [EOL]     return Long.valueOf(longValue()); [EOL] } <line_num>: 221,223
@Override [EOL] public boolean equals(final Object obj) { [EOL]     if (obj instanceof MutableLong) { [EOL]         return value == ((MutableLong) obj).longValue(); [EOL]     } [EOL]     return false; [EOL] } <line_num>: 234,240
@Override [EOL] public int hashCode() { [EOL]     return (int) (value ^ (value >>> 32)); [EOL] } <line_num>: 247,250
@Override [EOL] public int compareTo(final MutableLong other) { [EOL]     final long anotherVal = other.value; [EOL]     return value < anotherVal ? -1 : (value == anotherVal ? 0 : 1); [EOL] } <line_num>: 259,263
@Override [EOL] public String toString() { [EOL]     return String.valueOf(value); [EOL] } <line_num>: 271,274
