protected FastDateFormat(final String pattern, final TimeZone timeZone, final Locale locale) { [EOL]     printer = new FastDatePrinter(pattern, timeZone, locale); [EOL]     parser = new FastDateParser(pattern, timeZone, locale); [EOL] } <line_num>: 368,371
@Override [EOL] protected FastDateFormat createInstance(final String pattern, final TimeZone timeZone, final Locale locale) { [EOL]     return new FastDateFormat(pattern, timeZone, locale); [EOL] } <line_num>: 89,92
public static FastDateFormat getInstance() { [EOL]     return cache.getInstance(); [EOL] } <line_num>: 105,107
public static FastDateFormat getInstance(final String pattern) { [EOL]     return cache.getInstance(pattern, null, null); [EOL] } <line_num>: 118,120
public static FastDateFormat getInstance(final String pattern, final TimeZone timeZone) { [EOL]     return cache.getInstance(pattern, timeZone, null); [EOL] } <line_num>: 133,135
public static FastDateFormat getInstance(final String pattern, final Locale locale) { [EOL]     return cache.getInstance(pattern, null, locale); [EOL] } <line_num>: 147,149
public static FastDateFormat getInstance(final String pattern, final TimeZone timeZone, final Locale locale) { [EOL]     return cache.getInstance(pattern, timeZone, locale); [EOL] } <line_num>: 164,166
public static FastDateFormat getDateInstance(final int style) { [EOL]     return cache.getDateInstance(style, null, null); [EOL] } <line_num>: 179,181
public static FastDateFormat getDateInstance(final int style, final Locale locale) { [EOL]     return cache.getDateInstance(style, null, locale); [EOL] } <line_num>: 194,196
public static FastDateFormat getDateInstance(final int style, final TimeZone timeZone) { [EOL]     return cache.getDateInstance(style, timeZone, null); [EOL] } <line_num>: 210,212
public static FastDateFormat getDateInstance(final int style, final TimeZone timeZone, final Locale locale) { [EOL]     return cache.getDateInstance(style, timeZone, locale); [EOL] } <line_num>: 226,228
public static FastDateFormat getTimeInstance(final int style) { [EOL]     return cache.getTimeInstance(style, null, null); [EOL] } <line_num>: 241,243
public static FastDateFormat getTimeInstance(final int style, final Locale locale) { [EOL]     return cache.getTimeInstance(style, null, locale); [EOL] } <line_num>: 256,258
public static FastDateFormat getTimeInstance(final int style, final TimeZone timeZone) { [EOL]     return cache.getTimeInstance(style, timeZone, null); [EOL] } <line_num>: 272,274
public static FastDateFormat getTimeInstance(final int style, final TimeZone timeZone, final Locale locale) { [EOL]     return cache.getTimeInstance(style, timeZone, locale); [EOL] } <line_num>: 288,290
public static FastDateFormat getDateTimeInstance(final int dateStyle, final int timeStyle) { [EOL]     return cache.getDateTimeInstance(dateStyle, timeStyle, null, null); [EOL] } <line_num>: 304,306
public static FastDateFormat getDateTimeInstance(final int dateStyle, final int timeStyle, final Locale locale) { [EOL]     return cache.getDateTimeInstance(dateStyle, timeStyle, null, locale); [EOL] } <line_num>: 320,322
public static FastDateFormat getDateTimeInstance(final int dateStyle, final int timeStyle, final TimeZone timeZone) { [EOL]     return getDateTimeInstance(dateStyle, timeStyle, timeZone, null); [EOL] } <line_num>: 337,339
public static FastDateFormat getDateTimeInstance(final int dateStyle, final int timeStyle, final TimeZone timeZone, final Locale locale) { [EOL]     return cache.getDateTimeInstance(dateStyle, timeStyle, timeZone, locale); [EOL] } <line_num>: 353,356
@Override [EOL] public StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos) { [EOL]     return printer.format(obj, toAppendTo, pos); [EOL] } <line_num>: 384,387
@Override [EOL] public String format(final long millis) { [EOL]     return printer.format(millis); [EOL] } <line_num>: 396,399
@Override [EOL] public String format(final Date date) { [EOL]     return printer.format(date); [EOL] } <line_num>: 407,410
@Override [EOL] public String format(final Calendar calendar) { [EOL]     return printer.format(calendar); [EOL] } <line_num>: 418,421
@Override [EOL] public StringBuffer format(final long millis, final StringBuffer buf) { [EOL]     return printer.format(millis, buf); [EOL] } <line_num>: 432,435
@Override [EOL] public StringBuffer format(final Date date, final StringBuffer buf) { [EOL]     return printer.format(date, buf); [EOL] } <line_num>: 445,448
@Override [EOL] public StringBuffer format(final Calendar calendar, final StringBuffer buf) { [EOL]     return printer.format(calendar, buf); [EOL] } <line_num>: 458,461
@Override [EOL] public Date parse(final String source) throws ParseException { [EOL]     return parser.parse(source); [EOL] } <line_num>: 470,473
@Override [EOL] public Date parse(final String source, final ParsePosition pos) { [EOL]     return parser.parse(source, pos); [EOL] } <line_num>: 478,481
@Override [EOL] public Object parseObject(final String source, final ParsePosition pos) { [EOL]     return parser.parseObject(source, pos); [EOL] } <line_num>: 486,489
@Override [EOL] public String getPattern() { [EOL]     return printer.getPattern(); [EOL] } <line_num>: 498,501
@Override [EOL] public TimeZone getTimeZone() { [EOL]     return printer.getTimeZone(); [EOL] } <line_num>: 510,513
@Override [EOL] public Locale getLocale() { [EOL]     return printer.getLocale(); [EOL] } <line_num>: 520,523
public int getMaxLengthEstimate() { [EOL]     return printer.getMaxLengthEstimate(); [EOL] } <line_num>: 534,536
@Override [EOL] public boolean equals(final Object obj) { [EOL]     if (obj instanceof FastDateFormat == false) { [EOL]         return false; [EOL]     } [EOL]     final FastDateFormat other = (FastDateFormat) obj; [EOL]     return printer.equals(other.printer); [EOL] } <line_num>: 546,554
@Override [EOL] public int hashCode() { [EOL]     return printer.hashCode(); [EOL] } <line_num>: 561,564
@Override [EOL] public String toString() { [EOL]     return "FastDateFormat[" + printer.getPattern() + "," + printer.getLocale() + "," + printer.getTimeZone().getID() + "]"; [EOL] } <line_num>: 571,574
protected StringBuffer applyRules(final Calendar calendar, final StringBuffer buf) { [EOL]     return printer.applyRules(calendar, buf); [EOL] } <line_num>: 585,587
