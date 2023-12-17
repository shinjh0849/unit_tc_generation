public DateFormatUtils()
public static String formatUTC(final long millis, final String pattern)
public static String formatUTC(final Date date, final String pattern)
public static String formatUTC(final long millis, final String pattern, final Locale locale)
public static String formatUTC(final Date date, final String pattern, final Locale locale)
public static String format(final long millis, final String pattern)
public static String format(final Date date, final String pattern)
public static String format(final Calendar calendar, final String pattern)
public static String format(final long millis, final String pattern, final TimeZone timeZone)
public static String format(final Date date, final String pattern, final TimeZone timeZone)
public static String format(final Calendar calendar, final String pattern, final TimeZone timeZone)
public static String format(final long millis, final String pattern, final Locale locale)
public static String format(final Date date, final String pattern, final Locale locale)
public static String format(final Calendar calendar, final String pattern, final Locale locale)
public static String format(final long millis, final String pattern, final TimeZone timeZone, final Locale locale)
public static String format(final Date date, final String pattern, final TimeZone timeZone, final Locale locale)
public static String format(final Calendar calendar, final String pattern, final TimeZone timeZone, final Locale locale)
TimeZone UTC_TIME_ZONE=Optional[TimeZone.getTimeZone("GMT")]
FastDateFormat ISO_DATETIME_FORMAT=Optional[FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ss")]
FastDateFormat ISO_DATETIME_TIME_ZONE_FORMAT=Optional[FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ssZZ")]
FastDateFormat ISO_DATE_FORMAT=Optional[FastDateFormat.getInstance("yyyy-MM-dd")]
FastDateFormat ISO_DATE_TIME_ZONE_FORMAT=Optional[FastDateFormat.getInstance("yyyy-MM-ddZZ")]
FastDateFormat ISO_TIME_FORMAT=Optional[FastDateFormat.getInstance("'T'HH:mm:ss")]
FastDateFormat ISO_TIME_TIME_ZONE_FORMAT=Optional[FastDateFormat.getInstance("'T'HH:mm:ssZZ")]
FastDateFormat ISO_TIME_NO_T_FORMAT=Optional[FastDateFormat.getInstance("HH:mm:ss")]
FastDateFormat ISO_TIME_NO_T_TIME_ZONE_FORMAT=Optional[FastDateFormat.getInstance("HH:mm:ssZZ")]
FastDateFormat SMTP_DATETIME_FORMAT=Optional[FastDateFormat.getInstance("EEE, dd MMM yyyy HH:mm:ss Z", Locale.US)]
