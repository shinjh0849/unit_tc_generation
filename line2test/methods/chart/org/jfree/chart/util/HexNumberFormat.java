public HexNumberFormat() { [EOL]     this(DWORD); [EOL] } <line_num>: 73,75
public HexNumberFormat(int digits) { [EOL]     super(); [EOL]     this.m_numDigits = digits; [EOL] } <line_num>: 82,85
public final int getNumberOfDigits() { [EOL]     return this.m_numDigits; [EOL] } <line_num>: 92,94
public void setNumberOfDigits(int digits) { [EOL]     this.m_numDigits = digits; [EOL] } <line_num>: 101,103
public StringBuffer format(double number, StringBuffer toAppendTo, FieldPosition pos) { [EOL]     return format((long) number, toAppendTo, pos); [EOL] } <line_num>: 115,118
public StringBuffer format(long number, StringBuffer toAppendTo, FieldPosition pos) { [EOL]     String l_hex = Long.toHexString(number).toUpperCase(); [EOL]     int l_pad = this.m_numDigits - l_hex.length(); [EOL]     l_pad = (0 < l_pad) ? l_pad : 0; [EOL]     StringBuffer l_extended = new StringBuffer("0x"); [EOL]     for (int i = 0; i < l_pad; i++) { [EOL]         l_extended.append(0); [EOL]     } [EOL]     l_extended.append(l_hex); [EOL]     return l_extended; [EOL] } <line_num>: 130,144
public Number parse(String source, ParsePosition parsePosition) { [EOL]     return null; [EOL] } <line_num>: 155,157
