protected FastDateFormat(final String pattern, final TimeZone timeZone, final Locale locale)
protected FastDateFormat createInstance(final String pattern, final TimeZone timeZone, final Locale locale)
public static FastDateFormat getInstance()
public static FastDateFormat getInstance(final String pattern)
public static FastDateFormat getInstance(final String pattern, final TimeZone timeZone)
public static FastDateFormat getInstance(final String pattern, final Locale locale)
public static FastDateFormat getInstance(final String pattern, final TimeZone timeZone, final Locale locale)
public static FastDateFormat getDateInstance(final int style)
public static FastDateFormat getDateInstance(final int style, final Locale locale)
public static FastDateFormat getDateInstance(final int style, final TimeZone timeZone)
public static FastDateFormat getDateInstance(final int style, final TimeZone timeZone, final Locale locale)
public static FastDateFormat getTimeInstance(final int style)
public static FastDateFormat getTimeInstance(final int style, final Locale locale)
public static FastDateFormat getTimeInstance(final int style, final TimeZone timeZone)
public static FastDateFormat getTimeInstance(final int style, final TimeZone timeZone, final Locale locale)
public static FastDateFormat getDateTimeInstance(final int dateStyle, final int timeStyle)
public static FastDateFormat getDateTimeInstance(final int dateStyle, final int timeStyle, final Locale locale)
public static FastDateFormat getDateTimeInstance(final int dateStyle, final int timeStyle, final TimeZone timeZone)
public static FastDateFormat getDateTimeInstance(final int dateStyle, final int timeStyle, final TimeZone timeZone, final Locale locale)
public StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos)
public String format(final long millis)
public String format(final Date date)
public String format(final Calendar calendar)
public StringBuffer format(final long millis, final StringBuffer buf)
public StringBuffer format(final Date date, final StringBuffer buf)
public StringBuffer format(final Calendar calendar, final StringBuffer buf)
public Date parse(final String source) throws ParseException
public Date parse(final String source, final ParsePosition pos)
public Object parseObject(final String source, final ParsePosition pos)
public String getPattern()
public TimeZone getTimeZone()
public Locale getLocale()
public int getMaxLengthEstimate()
public boolean equals(final Object obj)
public int hashCode()
public String toString()
protected StringBuffer applyRules(final Calendar calendar, final StringBuffer buf)
long serialVersionUID=Optional[2L]
int FULL=Optional[DateFormat.FULL]
int LONG=Optional[DateFormat.LONG]
int MEDIUM=Optional[DateFormat.MEDIUM]
int SHORT=Optional[DateFormat.SHORT]
FormatCache<FastDateFormat> cache=Optional[new FormatCache<FastDateFormat>() {

    @Override
    protected FastDateFormat createInstance(final String pattern, final TimeZone timeZone, final Locale locale) {
        return new FastDateFormat(pattern, timeZone, locale);
    }
}]
FastDatePrinter printer
FastDateParser parser
