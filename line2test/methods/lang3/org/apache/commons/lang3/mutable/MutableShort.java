public MutableShort() { [EOL]     super(); [EOL] } <line_num>: 43,45
public MutableShort(final short value) { [EOL]     super(); [EOL]     this.value = value; [EOL] } <line_num>: 52,55
public MutableShort(final Number value) { [EOL]     super(); [EOL]     this.value = value.shortValue(); [EOL] } <line_num>: 63,66
public MutableShort(final String value) throws NumberFormatException { [EOL]     super(); [EOL]     this.value = Short.parseShort(value); [EOL] } <line_num>: 75,78
@Override [EOL] public Short getValue() { [EOL]     return Short.valueOf(this.value); [EOL] } <line_num>: 86,89
public void setValue(final short value) { [EOL]     this.value = value; [EOL] } <line_num>: 96,98
@Override [EOL] public void setValue(final Number value) { [EOL]     this.value = value.shortValue(); [EOL] } <line_num>: 106,109
public void increment() { [EOL]     value++; [EOL] } <line_num>: 117,119
public void decrement() { [EOL]     value--; [EOL] } <line_num>: 126,128
public void add(final short operand) { [EOL]     this.value += operand; [EOL] } <line_num>: 137,139
public void add(final Number operand) { [EOL]     this.value += operand.shortValue(); [EOL] } <line_num>: 148,150
public void subtract(final short operand) { [EOL]     this.value -= operand; [EOL] } <line_num>: 158,160
public void subtract(final Number operand) { [EOL]     this.value -= operand.shortValue(); [EOL] } <line_num>: 169,171
@Override [EOL] public short shortValue() { [EOL]     return value; [EOL] } <line_num>: 180,183
@Override [EOL] public int intValue() { [EOL]     return value; [EOL] } <line_num>: 190,193
@Override [EOL] public long longValue() { [EOL]     return value; [EOL] } <line_num>: 200,203
@Override [EOL] public float floatValue() { [EOL]     return value; [EOL] } <line_num>: 210,213
@Override [EOL] public double doubleValue() { [EOL]     return value; [EOL] } <line_num>: 220,223
public Short toShort() { [EOL]     return Short.valueOf(shortValue()); [EOL] } <line_num>: 231,233
@Override [EOL] public boolean equals(final Object obj) { [EOL]     if (obj instanceof MutableShort) { [EOL]         return value == ((MutableShort) obj).shortValue(); [EOL]     } [EOL]     return false; [EOL] } <line_num>: 244,250
@Override [EOL] public int hashCode() { [EOL]     return value; [EOL] } <line_num>: 257,260
@Override [EOL] public int compareTo(final MutableShort other) { [EOL]     final short anotherVal = other.value; [EOL]     return value < anotherVal ? -1 : (value == anotherVal ? 0 : 1); [EOL] } <line_num>: 269,273
@Override [EOL] public String toString() { [EOL]     return String.valueOf(value); [EOL] } <line_num>: 281,284
