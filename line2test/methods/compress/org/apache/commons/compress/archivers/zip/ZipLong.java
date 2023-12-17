public ZipLong(long value) { [EOL]     this.value = value; [EOL] } <line_num>: 48,50
public ZipLong(byte[] bytes) { [EOL]     this(bytes, 0); [EOL] } <line_num>: 56,58
public ZipLong(byte[] bytes, int offset) { [EOL]     value = ZipLong.getValue(bytes, offset); [EOL] } <line_num>: 65,67
public byte[] getBytes() { [EOL]     return ZipLong.getBytes(value); [EOL] } <line_num>: 73,75
public long getValue() { [EOL]     return value; [EOL] } <line_num>: 81,83
public static byte[] getBytes(long value) { [EOL]     byte[] result = new byte[WORD]; [EOL]     result[0] = (byte) ((value & BYTE_MASK)); [EOL]     result[BYTE_1] = (byte) ((value & BYTE_1_MASK) >> BYTE_1_SHIFT); [EOL]     result[BYTE_2] = (byte) ((value & BYTE_2_MASK) >> BYTE_2_SHIFT); [EOL]     result[BYTE_3] = (byte) ((value & BYTE_3_MASK) >> BYTE_3_SHIFT); [EOL]     return result; [EOL] } <line_num>: 90,97
public static long getValue(byte[] bytes, int offset) { [EOL]     long value = (bytes[offset + BYTE_3] << BYTE_3_SHIFT) & BYTE_3_MASK; [EOL]     value += (bytes[offset + BYTE_2] << BYTE_2_SHIFT) & BYTE_2_MASK; [EOL]     value += (bytes[offset + BYTE_1] << BYTE_1_SHIFT) & BYTE_1_MASK; [EOL]     value += (bytes[offset] & BYTE_MASK); [EOL]     return value; [EOL] } <line_num>: 105,111
public static long getValue(byte[] bytes) { [EOL]     return getValue(bytes, 0); [EOL] } <line_num>: 118,120
public boolean equals(Object o) { [EOL]     if (o == null || !(o instanceof ZipLong)) { [EOL]         return false; [EOL]     } [EOL]     return value == ((ZipLong) o).getValue(); [EOL] } <line_num>: 127,132
public int hashCode() { [EOL]     return (int) value; [EOL] } <line_num>: 138,140
public Object clone() { [EOL]     try { [EOL]         return super.clone(); [EOL]     } catch (CloneNotSupportedException cnfe) { [EOL]         throw new RuntimeException(cnfe); [EOL]     } [EOL] } <line_num>: 142,149
