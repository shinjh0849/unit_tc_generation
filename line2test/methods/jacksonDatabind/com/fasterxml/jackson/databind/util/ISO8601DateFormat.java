public ISO8601DateFormat() { [EOL]     this.numberFormat = NUMBER_FORMAT; [EOL]     this.calendar = CALENDAR; [EOL] } <line_num>: 26,29
@Override [EOL] public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) { [EOL]     String value = ISO8601Utils.format(date); [EOL]     toAppendTo.append(value); [EOL]     return toAppendTo; [EOL] } <line_num>: 31,37
@Override [EOL] public Date parse(String source, ParsePosition pos) { [EOL]     pos.setIndex(source.length()); [EOL]     return ISO8601Utils.parse(source); [EOL] } <line_num>: 39,46
@Override [EOL] public Object clone() { [EOL]     return this; [EOL] } <line_num>: 48,51
