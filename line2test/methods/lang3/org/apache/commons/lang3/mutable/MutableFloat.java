public MutableFloat() { [EOL]     super(); [EOL] } <line_num>: 43,45
public MutableFloat(final float value) { [EOL]     super(); [EOL]     this.value = value; [EOL] } <line_num>: 52,55
public MutableFloat(final Number value) { [EOL]     super(); [EOL]     this.value = value.floatValue(); [EOL] } <line_num>: 63,66
public MutableFloat(final String value) throws NumberFormatException { [EOL]     super(); [EOL]     this.value = Float.parseFloat(value); [EOL] } <line_num>: 75,78
@Override [EOL] public Float getValue() { [EOL]     return Float.valueOf(this.value); [EOL] } <line_num>: 86,89
public void setValue(final float value) { [EOL]     this.value = value; [EOL] } <line_num>: 96,98
@Override [EOL] public void setValue(final Number value) { [EOL]     this.value = value.floatValue(); [EOL] } <line_num>: 106,109
public boolean isNaN() { [EOL]     return Float.isNaN(value); [EOL] } <line_num>: 117,119
public boolean isInfinite() { [EOL]     return Float.isInfinite(value); [EOL] } <line_num>: 126,128
public void increment() { [EOL]     value++; [EOL] } <line_num>: 136,138
public void decrement() { [EOL]     value--; [EOL] } <line_num>: 145,147
public void add(final float operand) { [EOL]     this.value += operand; [EOL] } <line_num>: 156,158
public void add(final Number operand) { [EOL]     this.value += operand.floatValue(); [EOL] } <line_num>: 167,169
public void subtract(final float operand) { [EOL]     this.value -= operand; [EOL] } <line_num>: 177,179
public void subtract(final Number operand) { [EOL]     this.value -= operand.floatValue(); [EOL] } <line_num>: 188,190
@Override [EOL] public int intValue() { [EOL]     return (int) value; [EOL] } <line_num>: 199,202
@Override [EOL] public long longValue() { [EOL]     return (long) value; [EOL] } <line_num>: 209,212
@Override [EOL] public float floatValue() { [EOL]     return value; [EOL] } <line_num>: 219,222
@Override [EOL] public double doubleValue() { [EOL]     return value; [EOL] } <line_num>: 229,232
public Float toFloat() { [EOL]     return Float.valueOf(floatValue()); [EOL] } <line_num>: 240,242
@Override [EOL] public boolean equals(final Object obj) { [EOL]     return obj instanceof MutableFloat && Float.floatToIntBits(((MutableFloat) obj).value) == Float.floatToIntBits(value); [EOL] } <line_num>: 276,280
@Override [EOL] public int hashCode() { [EOL]     return Float.floatToIntBits(value); [EOL] } <line_num>: 287,290
@Override [EOL] public int compareTo(final MutableFloat other) { [EOL]     final float anotherVal = other.value; [EOL]     return Float.compare(value, anotherVal); [EOL] } <line_num>: 299,303
@Override [EOL] public String toString() { [EOL]     return String.valueOf(value); [EOL] } <line_num>: 311,314
