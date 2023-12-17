public StdDateFormat()
public StdDateFormat(TimeZone tz)
public static TimeZone getDefaultTimeZone()
public StdDateFormat withTimeZone(TimeZone tz)
public StdDateFormat clone()
public static DateFormat getBlueprintISO8601Format()
public static DateFormat getISO8601Format(TimeZone tz)
public static DateFormat getBlueprintRFC1123Format()
public static DateFormat getRFC1123Format(TimeZone tz)
public void setTimeZone(TimeZone tz)
public Date parse(String dateStr) throws ParseException
public Date parse(String dateStr, ParsePosition pos)
public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition)
protected boolean looksLikeISO8601(String dateStr)
protected Date parseAsISO8601(String dateStr, ParsePosition pos)
protected Date parseAsRFC1123(String dateStr, ParsePosition pos)
private static final boolean hasTimeZone(String str)
private final DateFormat _cloneFormat(DateFormat df)
private static final DateFormat _cloneFormat(DateFormat df, TimeZone tz)
String DATE_FORMAT_STR_ISO8601=Optional["yyyy-MM-dd'T'HH:mm:ss.SSSZ"]
String DATE_FORMAT_STR_ISO8601_Z=Optional["yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"]
String DATE_FORMAT_STR_PLAIN=Optional["yyyy-MM-dd"]
String DATE_FORMAT_STR_RFC1123=Optional["EEE, dd MMM yyyy HH:mm:ss zzz"]
String[] ALL_FORMATS=Optional[new String[] { DATE_FORMAT_STR_ISO8601, DATE_FORMAT_STR_ISO8601_Z, DATE_FORMAT_STR_RFC1123, DATE_FORMAT_STR_PLAIN }]
TimeZone DEFAULT_TIMEZONE
DateFormat DATE_FORMAT_RFC1123
DateFormat DATE_FORMAT_ISO8601
DateFormat DATE_FORMAT_ISO8601_Z
DateFormat DATE_FORMAT_PLAIN
StdDateFormat instance=Optional[new StdDateFormat()]
TimeZone _timezone
DateFormat _formatRFC1123
DateFormat _formatISO8601
DateFormat _formatISO8601_z
DateFormat _formatPlain
