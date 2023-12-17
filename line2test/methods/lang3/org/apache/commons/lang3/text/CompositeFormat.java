public CompositeFormat(final Format parser, final Format formatter) { [EOL]     this.parser = parser; [EOL]     this.formatter = formatter; [EOL] } <line_num>: 52,55
@Override [EOL] public StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos) { [EOL]     return formatter.format(obj, toAppendTo, pos); [EOL] } <line_num>: 66,70
@Override [EOL] public Object parseObject(final String source, final ParsePosition pos) { [EOL]     return parser.parseObject(source, pos); [EOL] } <line_num>: 82,85
public Format getParser() { [EOL]     return this.parser; [EOL] } <line_num>: 92,94
public Format getFormatter() { [EOL]     return this.formatter; [EOL] } <line_num>: 101,103
public String reformat(final String input) throws ParseException { [EOL]     return format(parseObject(input)); [EOL] } <line_num>: 112,114
