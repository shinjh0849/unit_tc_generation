public DateUtils()
 DateIterator(final Calendar startFinal, final Calendar endFinal)
public static boolean isSameDay(final Date date1, final Date date2)
public static boolean isSameDay(final Calendar cal1, final Calendar cal2)
public static boolean isSameInstant(final Date date1, final Date date2)
public static boolean isSameInstant(final Calendar cal1, final Calendar cal2)
public static boolean isSameLocalTime(final Calendar cal1, final Calendar cal2)
public static Date parseDate(final String str, final String... parsePatterns) throws ParseException
public static Date parseDate(final String str, final Locale locale, final String... parsePatterns) throws ParseException
public static Date parseDateStrictly(final String str, final String... parsePatterns) throws ParseException
public static Date parseDateStrictly(final String str, final Locale locale, final String... parsePatterns) throws ParseException
private static Date parseDateWithLeniency(final String str, final Locale locale, final String[] parsePatterns, final boolean lenient) throws ParseException
public static Date addYears(final Date date, final int amount)
public static Date addMonths(final Date date, final int amount)
public static Date addWeeks(final Date date, final int amount)
public static Date addDays(final Date date, final int amount)
public static Date addHours(final Date date, final int amount)
public static Date addMinutes(final Date date, final int amount)
public static Date addSeconds(final Date date, final int amount)
public static Date addMilliseconds(final Date date, final int amount)
private static Date add(final Date date, final int calendarField, final int amount)
public static Date setYears(final Date date, final int amount)
public static Date setMonths(final Date date, final int amount)
public static Date setDays(final Date date, final int amount)
public static Date setHours(final Date date, final int amount)
public static Date setMinutes(final Date date, final int amount)
public static Date setSeconds(final Date date, final int amount)
public static Date setMilliseconds(final Date date, final int amount)
private static Date set(final Date date, final int calendarField, final int amount)
public static Calendar toCalendar(final Date date)
public static Date round(final Date date, final int field)
public static Calendar round(final Calendar date, final int field)
public static Date round(final Object date, final int field)
public static Date truncate(final Date date, final int field)
public static Calendar truncate(final Calendar date, final int field)
public static Date truncate(final Object date, final int field)
public static Date ceiling(final Date date, final int field)
public static Calendar ceiling(final Calendar date, final int field)
public static Date ceiling(final Object date, final int field)
private static void modify(final Calendar val, final int field, final int modType)
public static Iterator<Calendar> iterator(final Date focus, final int rangeStyle)
public static Iterator<Calendar> iterator(final Calendar focus, final int rangeStyle)
public static Iterator<?> iterator(final Object focus, final int rangeStyle)
public static long getFragmentInMilliseconds(final Date date, final int fragment)
public static long getFragmentInSeconds(final Date date, final int fragment)
public static long getFragmentInMinutes(final Date date, final int fragment)
public static long getFragmentInHours(final Date date, final int fragment)
public static long getFragmentInDays(final Date date, final int fragment)
public static long getFragmentInMilliseconds(final Calendar calendar, final int fragment)
public static long getFragmentInSeconds(final Calendar calendar, final int fragment)
public static long getFragmentInMinutes(final Calendar calendar, final int fragment)
public static long getFragmentInHours(final Calendar calendar, final int fragment)
public static long getFragmentInDays(final Calendar calendar, final int fragment)
private static long getFragment(final Date date, final int fragment, final int unit)
private static long getFragment(final Calendar calendar, final int fragment, final int unit)
public static boolean truncatedEquals(final Calendar cal1, final Calendar cal2, final int field)
public static boolean truncatedEquals(final Date date1, final Date date2, final int field)
public static int truncatedCompareTo(final Calendar cal1, final Calendar cal2, final int field)
public static int truncatedCompareTo(final Date date1, final Date date2, final int field)
private static long getMillisPerUnit(final int unit)
public boolean hasNext()
public Calendar next()
public void remove()
long MILLIS_PER_SECOND=Optional[1000]
long MILLIS_PER_MINUTE=Optional[60 * MILLIS_PER_SECOND]
long MILLIS_PER_HOUR=Optional[60 * MILLIS_PER_MINUTE]
long MILLIS_PER_DAY=Optional[24 * MILLIS_PER_HOUR]
int SEMI_MONTH=Optional[1001]
int[][] fields=Optional[{ { Calendar.MILLISECOND }, { Calendar.SECOND }, { Calendar.MINUTE }, { Calendar.HOUR_OF_DAY, Calendar.HOUR }, { Calendar.DATE, Calendar.DAY_OF_MONTH, Calendar.AM_PM /* Calendar.DAY_OF_YEAR, Calendar.DAY_OF_WEEK, Calendar.DAY_OF_WEEK_IN_MONTH */
}, { Calendar.MONTH, DateUtils.SEMI_MONTH }, { Calendar.YEAR }, { Calendar.ERA } }]
int RANGE_WEEK_SUNDAY=Optional[1]
int RANGE_WEEK_MONDAY=Optional[2]
int RANGE_WEEK_RELATIVE=Optional[3]
int RANGE_WEEK_CENTER=Optional[4]
int RANGE_MONTH_SUNDAY=Optional[5]
int RANGE_MONTH_MONDAY=Optional[6]
int MODIFY_TRUNCATE=Optional[0]
int MODIFY_ROUND=Optional[1]
int MODIFY_CEILING=Optional[2]
