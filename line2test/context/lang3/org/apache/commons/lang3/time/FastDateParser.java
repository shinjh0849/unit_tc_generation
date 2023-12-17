protected FastDateParser(final String pattern, final TimeZone timeZone, final Locale locale)
 CopyQuotedStrategy(final String formatField)
 TextStrategy(final int field, final Calendar definingCalendar, final Locale locale)
 NumberStrategy(final int field)
 TimeZoneStrategy(final Locale locale)
private void init()
public String getPattern()
public TimeZone getTimeZone()
public Locale getLocale()
 Pattern getParsePattern()
public boolean equals(final Object obj)
public int hashCode()
public String toString()
private void readObject(final ObjectInputStream in) throws IOException, ClassNotFoundException
public Object parseObject(final String source) throws ParseException
public Date parse(final String source) throws ParseException
public Object parseObject(final String source, final ParsePosition pos)
public Date parse(final String source, final ParsePosition pos)
private static StringBuilder escapeRegex(final StringBuilder regex, final String value, final boolean unquote)
private static Map<String, Integer> getDisplayNames(final int field, final Calendar definingCalendar, final Locale locale)
 int adjustYear(final int twoDigitYear)
 boolean isNextNumber()
 int getFieldWidth()
 boolean isNumber()
 void setCalendar(final FastDateParser parser, final Calendar cal, final String value)
 abstract boolean addRegex(FastDateParser parser, StringBuilder regex)
private Strategy getStrategy(String formatField, final Calendar definingCalendar)
private static ConcurrentMap<Locale, Strategy> getCache(final int field)
private Strategy getLocaleSpecificStrategy(final int field, final Calendar definingCalendar)
 boolean isNumber()
 boolean addRegex(final FastDateParser parser, final StringBuilder regex)
 boolean addRegex(final FastDateParser parser, final StringBuilder regex)
 void setCalendar(final FastDateParser parser, final Calendar cal, final String value)
 boolean isNumber()
 boolean addRegex(final FastDateParser parser, final StringBuilder regex)
 void setCalendar(final FastDateParser parser, final Calendar cal, final String value)
 int modify(final int iValue)
 void setCalendar(final FastDateParser parser, final Calendar cal, final String value)
 boolean addRegex(final FastDateParser parser, final StringBuilder regex)
 void setCalendar(final FastDateParser parser, final Calendar cal, final String value)
 int modify(final int iValue)
 int modify(final int iValue)
 int modify(final int iValue)
long serialVersionUID=Optional[1L]
Locale JAPANESE_IMPERIAL=Optional[new Locale("ja", "JP", "JP")]
String pattern
TimeZone timeZone
Locale locale
Pattern parsePattern
Strategy[] strategies
int thisYear
String currentFormatField
Strategy nextStrategy
Pattern formatPattern=Optional[Pattern.compile("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++")]
ConcurrentMap<Locale, Strategy>[] caches=Optional[new ConcurrentMap[Calendar.FIELD_COUNT]]
Strategy ABBREVIATED_YEAR_STRATEGY=Optional[new NumberStrategy(Calendar.YEAR) {

    /**
     * {@inheritDoc}
     */
    @Override
    void setCalendar(final FastDateParser parser, final Calendar cal, final String value) {
        int iValue = Integer.parseInt(value);
        if (iValue < 100) {
            iValue = parser.adjustYear(iValue);
        }
        cal.set(Calendar.YEAR, iValue);
    }
}]
Strategy NUMBER_MONTH_STRATEGY=Optional[new NumberStrategy(Calendar.MONTH) {

    @Override
    int modify(final int iValue) {
        return iValue - 1;
    }
}]
Strategy LITERAL_YEAR_STRATEGY=Optional[new NumberStrategy(Calendar.YEAR)]
Strategy WEEK_OF_YEAR_STRATEGY=Optional[new NumberStrategy(Calendar.WEEK_OF_YEAR)]
Strategy WEEK_OF_MONTH_STRATEGY=Optional[new NumberStrategy(Calendar.WEEK_OF_MONTH)]
Strategy DAY_OF_YEAR_STRATEGY=Optional[new NumberStrategy(Calendar.DAY_OF_YEAR)]
Strategy DAY_OF_MONTH_STRATEGY=Optional[new NumberStrategy(Calendar.DAY_OF_MONTH)]
Strategy DAY_OF_WEEK_IN_MONTH_STRATEGY=Optional[new NumberStrategy(Calendar.DAY_OF_WEEK_IN_MONTH)]
Strategy HOUR_OF_DAY_STRATEGY=Optional[new NumberStrategy(Calendar.HOUR_OF_DAY)]
Strategy MODULO_HOUR_OF_DAY_STRATEGY=Optional[new NumberStrategy(Calendar.HOUR_OF_DAY) {

    @Override
    int modify(final int iValue) {
        return iValue % 24;
    }
}]
Strategy MODULO_HOUR_STRATEGY=Optional[new NumberStrategy(Calendar.HOUR) {

    @Override
    int modify(final int iValue) {
        return iValue % 12;
    }
}]
Strategy HOUR_STRATEGY=Optional[new NumberStrategy(Calendar.HOUR)]
Strategy MINUTE_STRATEGY=Optional[new NumberStrategy(Calendar.MINUTE)]
Strategy SECOND_STRATEGY=Optional[new NumberStrategy(Calendar.SECOND)]
Strategy MILLISECOND_STRATEGY=Optional[new NumberStrategy(Calendar.MILLISECOND)]
