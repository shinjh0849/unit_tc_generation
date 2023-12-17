public PeriodFormatter(PeriodPrinter printer, PeriodParser parser) { [EOL]     super(); [EOL]     iPrinter = printer; [EOL]     iParser = parser; [EOL]     iLocale = null; [EOL]     iParseType = null; [EOL] } <line_num>: 85,92
private PeriodFormatter(PeriodPrinter printer, PeriodParser parser, Locale locale, PeriodType type) { [EOL]     super(); [EOL]     iPrinter = printer; [EOL]     iParser = parser; [EOL]     iLocale = locale; [EOL]     iParseType = type; [EOL] } <line_num>: 102,110
public boolean isPrinter() { [EOL]     return (iPrinter != null); [EOL] } <line_num>: 118,120
public PeriodPrinter getPrinter() { [EOL]     return iPrinter; [EOL] } <line_num>: 127,129
public boolean isParser() { [EOL]     return (iParser != null); [EOL] } <line_num>: 136,138
public PeriodParser getParser() { [EOL]     return iParser; [EOL] } <line_num>: 145,147
public PeriodFormatter withLocale(Locale locale) { [EOL]     if (locale == getLocale() || (locale != null && locale.equals(getLocale()))) { [EOL]         return this; [EOL]     } [EOL]     return new PeriodFormatter(iPrinter, iParser, locale, iParseType); [EOL] } <line_num>: 160,165
public Locale getLocale() { [EOL]     return iLocale; [EOL] } <line_num>: 172,174
public PeriodFormatter withParseType(PeriodType type) { [EOL]     if (type == iParseType) { [EOL]         return this; [EOL]     } [EOL]     return new PeriodFormatter(iPrinter, iParser, iLocale, type); [EOL] } <line_num>: 186,191
public PeriodType getParseType() { [EOL]     return iParseType; [EOL] } <line_num>: 198,200
public void printTo(StringBuffer buf, ReadablePeriod period) { [EOL]     checkPrinter(); [EOL]     checkPeriod(period); [EOL]     getPrinter().printTo(buf, period, iLocale); [EOL] } <line_num>: 209,214
public void printTo(Writer out, ReadablePeriod period) throws IOException { [EOL]     checkPrinter(); [EOL]     checkPeriod(period); [EOL]     getPrinter().printTo(out, period, iLocale); [EOL] } <line_num>: 222,227
public String print(ReadablePeriod period) { [EOL]     checkPrinter(); [EOL]     checkPeriod(period); [EOL]     PeriodPrinter printer = getPrinter(); [EOL]     StringBuffer buf = new StringBuffer(printer.calculatePrintedLength(period, iLocale)); [EOL]     printer.printTo(buf, period, iLocale); [EOL]     return buf.toString(); [EOL] } <line_num>: 235,243
private void checkPrinter() { [EOL]     if (iPrinter == null) { [EOL]         throw new UnsupportedOperationException("Printing not supported"); [EOL]     } [EOL] } <line_num>: 250,254
private void checkPeriod(ReadablePeriod period) { [EOL]     if (period == null) { [EOL]         throw new IllegalArgumentException("Period must not be null"); [EOL]     } [EOL] } <line_num>: 261,265
public int parseInto(ReadWritablePeriod period, String text, int position) { [EOL]     checkParser(); [EOL]     checkPeriod(period); [EOL]     return getParser().parseInto(period, text, position, iLocale); [EOL] } <line_num>: 287,292
public Period parsePeriod(String text) { [EOL]     checkParser(); [EOL]     return parseMutablePeriod(text).toPeriod(); [EOL] } <line_num>: 301,305
public MutablePeriod parseMutablePeriod(String text) { [EOL]     checkParser(); [EOL]     MutablePeriod period = new MutablePeriod(0, iParseType); [EOL]     int newPos = getParser().parseInto(period, text, 0, iLocale); [EOL]     if (newPos >= 0) { [EOL]         if (newPos >= text.length()) { [EOL]             return period; [EOL]         } [EOL]     } else { [EOL]         newPos = ~newPos; [EOL]     } [EOL]     throw new IllegalArgumentException(FormatUtils.createErrorMessage(text, newPos)); [EOL] } <line_num>: 314,327
private void checkParser() { [EOL]     if (iParser == null) { [EOL]         throw new UnsupportedOperationException("Parsing not supported"); [EOL]     } [EOL] } <line_num>: 334,338
