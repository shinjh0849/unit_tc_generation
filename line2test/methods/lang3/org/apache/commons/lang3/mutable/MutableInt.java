public MutableInt() { [EOL]     super(); [EOL] } <line_num>: 43,45
public MutableInt(final int value) { [EOL]     super(); [EOL]     this.value = value; [EOL] } <line_num>: 52,55
public MutableInt(final Number value) { [EOL]     super(); [EOL]     this.value = value.intValue(); [EOL] } <line_num>: 63,66
public MutableInt(final String value) throws NumberFormatException { [EOL]     super(); [EOL]     this.value = Integer.parseInt(value); [EOL] } <line_num>: 75,78
@Override [EOL] public Integer getValue() { [EOL]     return Integer.valueOf(this.value); [EOL] } <line_num>: 86,89
public void setValue(final int value) { [EOL]     this.value = value; [EOL] } <line_num>: 96,98
@Override [EOL] public void setValue(final Number value) { [EOL]     this.value = value.intValue(); [EOL] } <line_num>: 106,109
public void increment() { [EOL]     value++; [EOL] } <line_num>: 117,119
public void decrement() { [EOL]     value--; [EOL] } <line_num>: 126,128
public void add(final int operand) { [EOL]     this.value += operand; [EOL] } <line_num>: 137,139
public void add(final Number operand) { [EOL]     this.value += operand.intValue(); [EOL] } <line_num>: 148,150
public void subtract(final int operand) { [EOL]     this.value -= operand; [EOL] } <line_num>: 158,160
public void subtract(final Number operand) { [EOL]     this.value -= operand.intValue(); [EOL] } <line_num>: 169,171
@Override [EOL] public int intValue() { [EOL]     return value; [EOL] } <line_num>: 180,183
@Override [EOL] public long longValue() { [EOL]     return value; [EOL] } <line_num>: 190,193
@Override [EOL] public float floatValue() { [EOL]     return value; [EOL] } <line_num>: 200,203
@Override [EOL] public double doubleValue() { [EOL]     return value; [EOL] } <line_num>: 210,213
public Integer toInteger() { [EOL]     return Integer.valueOf(intValue()); [EOL] } <line_num>: 221,223
@Override [EOL] public boolean equals(final Object obj) { [EOL]     if (obj instanceof MutableInt) { [EOL]         return value == ((MutableInt) obj).intValue(); [EOL]     } [EOL]     return false; [EOL] } <line_num>: 234,240
@Override [EOL] public int hashCode() { [EOL]     return value; [EOL] } <line_num>: 247,250
@Override [EOL] public int compareTo(final MutableInt other) { [EOL]     final int anotherVal = other.value; [EOL]     return value < anotherVal ? -1 : (value == anotherVal ? 0 : 1); [EOL] } <line_num>: 259,263
@Override [EOL] public String toString() { [EOL]     return String.valueOf(value); [EOL] } <line_num>: 271,274
