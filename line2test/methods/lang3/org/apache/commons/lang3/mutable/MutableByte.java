public MutableByte() { [EOL]     super(); [EOL] } <line_num>: 43,45
public MutableByte(final byte value) { [EOL]     super(); [EOL]     this.value = value; [EOL] } <line_num>: 52,55
public MutableByte(final Number value) { [EOL]     super(); [EOL]     this.value = value.byteValue(); [EOL] } <line_num>: 63,66
public MutableByte(final String value) throws NumberFormatException { [EOL]     super(); [EOL]     this.value = Byte.parseByte(value); [EOL] } <line_num>: 75,78
@Override [EOL] public Byte getValue() { [EOL]     return Byte.valueOf(this.value); [EOL] } <line_num>: 86,89
public void setValue(final byte value) { [EOL]     this.value = value; [EOL] } <line_num>: 96,98
@Override [EOL] public void setValue(final Number value) { [EOL]     this.value = value.byteValue(); [EOL] } <line_num>: 106,109
public void increment() { [EOL]     value++; [EOL] } <line_num>: 117,119
public void decrement() { [EOL]     value--; [EOL] } <line_num>: 126,128
public void add(final byte operand) { [EOL]     this.value += operand; [EOL] } <line_num>: 137,139
public void add(final Number operand) { [EOL]     this.value += operand.byteValue(); [EOL] } <line_num>: 148,150
public void subtract(final byte operand) { [EOL]     this.value -= operand; [EOL] } <line_num>: 158,160
public void subtract(final Number operand) { [EOL]     this.value -= operand.byteValue(); [EOL] } <line_num>: 169,171
@Override [EOL] public byte byteValue() { [EOL]     return value; [EOL] } <line_num>: 180,183
@Override [EOL] public int intValue() { [EOL]     return value; [EOL] } <line_num>: 190,193
@Override [EOL] public long longValue() { [EOL]     return value; [EOL] } <line_num>: 200,203
@Override [EOL] public float floatValue() { [EOL]     return value; [EOL] } <line_num>: 210,213
@Override [EOL] public double doubleValue() { [EOL]     return value; [EOL] } <line_num>: 220,223
public Byte toByte() { [EOL]     return Byte.valueOf(byteValue()); [EOL] } <line_num>: 231,233
@Override [EOL] public boolean equals(final Object obj) { [EOL]     if (obj instanceof MutableByte) { [EOL]         return value == ((MutableByte) obj).byteValue(); [EOL]     } [EOL]     return false; [EOL] } <line_num>: 244,250
@Override [EOL] public int hashCode() { [EOL]     return value; [EOL] } <line_num>: 257,260
@Override [EOL] public int compareTo(final MutableByte other) { [EOL]     final byte anotherVal = other.value; [EOL]     return value < anotherVal ? -1 : (value == anotherVal ? 0 : 1); [EOL] } <line_num>: 269,273
@Override [EOL] public String toString() { [EOL]     return String.valueOf(value); [EOL] } <line_num>: 281,284
