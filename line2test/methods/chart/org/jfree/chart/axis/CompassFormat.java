public CompassFormat() { [EOL]     super(); [EOL] } <line_num>: 73,75
public String getDirectionCode(double direction) { [EOL]     direction = direction % 360; [EOL]     if (direction < 0.0) { [EOL]         direction = direction + 360.0; [EOL]     } [EOL]     int index = ((int) Math.floor(direction / 11.25) + 1) / 2; [EOL]     return DIRECTIONS[index]; [EOL] } <line_num>: 84,93
public StringBuffer format(double number, StringBuffer toAppendTo, FieldPosition pos) { [EOL]     return toAppendTo.append(getDirectionCode(number)); [EOL] } <line_num>: 104,107
public StringBuffer format(long number, StringBuffer toAppendTo, FieldPosition pos) { [EOL]     return toAppendTo.append(getDirectionCode(number)); [EOL] } <line_num>: 118,121
public Number parse(String source, ParsePosition parsePosition) { [EOL]     return null; [EOL] } <line_num>: 132,134
