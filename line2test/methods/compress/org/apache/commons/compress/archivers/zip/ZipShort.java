public ZipShort(int value) { [EOL]     this.value = value; [EOL] } <line_num>: 36,38
public ZipShort(byte[] bytes) { [EOL]     this(bytes, 0); [EOL] } <line_num>: 44,46
public ZipShort(byte[] bytes, int offset) { [EOL]     value = ZipShort.getValue(bytes, offset); [EOL] } <line_num>: 53,55
public byte[] getBytes() { [EOL]     byte[] result = new byte[2]; [EOL]     result[0] = (byte) (value & BYTE_MASK); [EOL]     result[1] = (byte) ((value & BYTE_1_MASK) >> BYTE_1_SHIFT); [EOL]     return result; [EOL] } <line_num>: 61,66
public int getValue() { [EOL]     return value; [EOL] } <line_num>: 72,74
public static byte[] getBytes(int value) { [EOL]     byte[] result = new byte[2]; [EOL]     result[0] = (byte) (value & BYTE_MASK); [EOL]     result[1] = (byte) ((value & BYTE_1_MASK) >> BYTE_1_SHIFT); [EOL]     return result; [EOL] } <line_num>: 81,86
public static int getValue(byte[] bytes, int offset) { [EOL]     int value = (bytes[offset + 1] << BYTE_1_SHIFT) & BYTE_1_MASK; [EOL]     value += (bytes[offset] & BYTE_MASK); [EOL]     return value; [EOL] } <line_num>: 94,98
public static int getValue(byte[] bytes) { [EOL]     return getValue(bytes, 0); [EOL] } <line_num>: 105,107
public boolean equals(Object o) { [EOL]     if (o == null || !(o instanceof ZipShort)) { [EOL]         return false; [EOL]     } [EOL]     return value == ((ZipShort) o).getValue(); [EOL] } <line_num>: 114,119
public int hashCode() { [EOL]     return value; [EOL] } <line_num>: 125,127
public Object clone() { [EOL]     try { [EOL]         return super.clone(); [EOL]     } catch (CloneNotSupportedException cnfe) { [EOL]         throw new RuntimeException(cnfe); [EOL]     } [EOL] } <line_num>: 129,136
