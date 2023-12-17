public MutableDouble() { [EOL]     super(); [EOL] } <line_num>: 43,45
public MutableDouble(final double value) { [EOL]     super(); [EOL]     this.value = value; [EOL] } <line_num>: 52,55
public MutableDouble(final Number value) { [EOL]     super(); [EOL]     this.value = value.doubleValue(); [EOL] } <line_num>: 63,66
public MutableDouble(final String value) throws NumberFormatException { [EOL]     super(); [EOL]     this.value = Double.parseDouble(value); [EOL] } <line_num>: 75,78
@Override [EOL] public Double getValue() { [EOL]     return Double.valueOf(this.value); [EOL] } <line_num>: 86,89
public void setValue(final double value) { [EOL]     this.value = value; [EOL] } <line_num>: 96,98
@Override [EOL] public void setValue(final Number value) { [EOL]     this.value = value.doubleValue(); [EOL] } <line_num>: 106,109
public boolean isNaN() { [EOL]     return Double.isNaN(value); [EOL] } <line_num>: 117,119
public boolean isInfinite() { [EOL]     return Double.isInfinite(value); [EOL] } <line_num>: 126,128
public void increment() { [EOL]     value++; [EOL] } <line_num>: 136,138
public void decrement() { [EOL]     value--; [EOL] } <line_num>: 145,147
public void add(final double operand) { [EOL]     this.value += operand; [EOL] } <line_num>: 156,158
public void add(final Number operand) { [EOL]     this.value += operand.doubleValue(); [EOL] } <line_num>: 167,169
public void subtract(final double operand) { [EOL]     this.value -= operand; [EOL] } <line_num>: 177,179
public void subtract(final Number operand) { [EOL]     this.value -= operand.doubleValue(); [EOL] } <line_num>: 188,190
@Override [EOL] public int intValue() { [EOL]     return (int) value; [EOL] } <line_num>: 199,202
@Override [EOL] public long longValue() { [EOL]     return (long) value; [EOL] } <line_num>: 209,212
@Override [EOL] public float floatValue() { [EOL]     return (float) value; [EOL] } <line_num>: 219,222
@Override [EOL] public double doubleValue() { [EOL]     return value; [EOL] } <line_num>: 229,232
public Double toDouble() { [EOL]     return Double.valueOf(doubleValue()); [EOL] } <line_num>: 240,242
@Override [EOL] public boolean equals(final Object obj) { [EOL]     return obj instanceof MutableDouble && Double.doubleToLongBits(((MutableDouble) obj).value) == Double.doubleToLongBits(value); [EOL] } <line_num>: 274,278
@Override [EOL] public int hashCode() { [EOL]     final long bits = Double.doubleToLongBits(value); [EOL]     return (int) (bits ^ bits >>> 32); [EOL] } <line_num>: 285,289
@Override [EOL] public int compareTo(final MutableDouble other) { [EOL]     final double anotherVal = other.value; [EOL]     return Double.compare(value, anotherVal); [EOL] } <line_num>: 298,302
@Override [EOL] public String toString() { [EOL]     return String.valueOf(value); [EOL] } <line_num>: 310,313
