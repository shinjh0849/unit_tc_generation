public BitField(final int mask) { [EOL]     _mask = mask; [EOL]     int count = 0; [EOL]     int bit_pattern = mask; [EOL]     if (bit_pattern != 0) { [EOL]         while ((bit_pattern & 1) == 0) { [EOL]             count++; [EOL]             bit_pattern >>= 1; [EOL]         } [EOL]     } [EOL]     _shift_count = count; [EOL] } <line_num>: 37,49
public int getValue(final int holder) { [EOL]     return getRawValue(holder) >> _shift_count; [EOL] } <line_num>: 65,67
public short getShortValue(final short holder) { [EOL]     return (short) getValue(holder); [EOL] } <line_num>: 83,85
public int getRawValue(final int holder) { [EOL]     return holder & _mask; [EOL] } <line_num>: 94,96
public short getShortRawValue(final short holder) { [EOL]     return (short) getRawValue(holder); [EOL] } <line_num>: 105,107
public boolean isSet(final int holder) { [EOL]     return (holder & _mask) != 0; [EOL] } <line_num>: 122,124
public boolean isAllSet(final int holder) { [EOL]     return (holder & _mask) == _mask; [EOL] } <line_num>: 138,140
public int setValue(final int holder, final int value) { [EOL]     return (holder & ~_mask) | ((value << _shift_count) & _mask); [EOL] } <line_num>: 152,154
public short setShortValue(final short holder, final short value) { [EOL]     return (short) setValue(holder, value); [EOL] } <line_num>: 166,168
public int clear(final int holder) { [EOL]     return holder & ~_mask; [EOL] } <line_num>: 178,180
public short clearShort(final short holder) { [EOL]     return (short) clear(holder); [EOL] } <line_num>: 190,192
public byte clearByte(final byte holder) { [EOL]     return (byte) clear(holder); [EOL] } <line_num>: 203,205
public int set(final int holder) { [EOL]     return holder | _mask; [EOL] } <line_num>: 215,217
public short setShort(final short holder) { [EOL]     return (short) set(holder); [EOL] } <line_num>: 227,229
public byte setByte(final byte holder) { [EOL]     return (byte) set(holder); [EOL] } <line_num>: 240,242
public int setBoolean(final int holder, final boolean flag) { [EOL]     return flag ? set(holder) : clear(holder); [EOL] } <line_num>: 253,255
public short setShortBoolean(final short holder, final boolean flag) { [EOL]     return flag ? setShort(holder) : clearShort(holder); [EOL] } <line_num>: 266,268
public byte setByteBoolean(final byte holder, final boolean flag) { [EOL]     return flag ? setByte(holder) : clearByte(holder); [EOL] } <line_num>: 279,281
