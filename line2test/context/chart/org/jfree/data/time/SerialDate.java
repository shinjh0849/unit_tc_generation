protected SerialDate()
public static boolean isValidWeekdayCode(final int code)
public static int stringToWeekdayCode(String s)
public static String weekdayCodeToString(final int weekday)
public static String[] getMonths()
public static String[] getMonths(final boolean shortened)
public static boolean isValidMonthCode(final int code)
public static int monthCodeToQuarter(final int code)
public static String monthCodeToString(final int month)
public static String monthCodeToString(final int month, final boolean shortened)
public static int stringToMonthCode(String s)
public static boolean isValidWeekInMonthCode(final int code)
public static boolean isLeapYear(final int yyyy)
public static int leapYearCount(final int yyyy)
public static int lastDayOfMonth(final int month, final int yyyy)
public static SerialDate addDays(final int days, final SerialDate base)
public static SerialDate addMonths(final int months, final SerialDate base)
public static SerialDate addYears(final int years, final SerialDate base)
public static SerialDate getPreviousDayOfWeek(final int targetWeekday, final SerialDate base)
public static SerialDate getFollowingDayOfWeek(final int targetWeekday, final SerialDate base)
public static SerialDate getNearestDayOfWeek(final int targetDOW, final SerialDate base)
public SerialDate getEndOfCurrentMonth(final SerialDate base)
public static String weekInMonthToString(final int count)
public static String relativeToString(final int relative)
public static SerialDate createInstance(final int day, final int month, final int yyyy)
public static SerialDate createInstance(final int serial)
public static SerialDate createInstance(final java.util.Date date)
public abstract int toSerial()
public abstract java.util.Date toDate()
public String getDescription()
public void setDescription(final String description)
public String toString()
public abstract int getYYYY()
public abstract int getMonth()
public abstract int getDayOfMonth()
public abstract int getDayOfWeek()
public abstract int compare(SerialDate other)
public abstract boolean isOn(SerialDate other)
public abstract boolean isBefore(SerialDate other)
public abstract boolean isOnOrBefore(SerialDate other)
public abstract boolean isAfter(SerialDate other)
public abstract boolean isOnOrAfter(SerialDate other)
public abstract boolean isInRange(SerialDate d1, SerialDate d2)
public abstract boolean isInRange(SerialDate d1, SerialDate d2, int include)
public SerialDate getPreviousDayOfWeek(final int targetDOW)
public SerialDate getFollowingDayOfWeek(final int targetDOW)
public SerialDate getNearestDayOfWeek(final int targetDOW)
long serialVersionUID=Optional[-293716040467423637L]
DateFormatSymbols DATE_FORMAT_SYMBOLS=Optional[new SimpleDateFormat().getDateFormatSymbols()]
int SERIAL_LOWER_BOUND=Optional[2]
int SERIAL_UPPER_BOUND=Optional[2958465]
int MINIMUM_YEAR_SUPPORTED=Optional[1900]
int MAXIMUM_YEAR_SUPPORTED=Optional[9999]
int MONDAY=Optional[Calendar.MONDAY]
int TUESDAY=Optional[Calendar.TUESDAY]
int WEDNESDAY=Optional[Calendar.WEDNESDAY]
int THURSDAY=Optional[Calendar.THURSDAY]
int FRIDAY=Optional[Calendar.FRIDAY]
int SATURDAY=Optional[Calendar.SATURDAY]
int SUNDAY=Optional[Calendar.SUNDAY]
int[] LAST_DAY_OF_MONTH=Optional[{ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }]
int[] AGGREGATE_DAYS_TO_END_OF_MONTH=Optional[{ 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365 }]
int[] AGGREGATE_DAYS_TO_END_OF_PRECEDING_MONTH=Optional[{ 0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365 }]
int[] LEAP_YEAR_AGGREGATE_DAYS_TO_END_OF_MONTH=Optional[{ 0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366 }]
int[] LEAP_YEAR_AGGREGATE_DAYS_TO_END_OF_PRECEDING_MONTH=Optional[{ 0, 0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366 }]
int FIRST_WEEK_IN_MONTH=Optional[1]
int SECOND_WEEK_IN_MONTH=Optional[2]
int THIRD_WEEK_IN_MONTH=Optional[3]
int FOURTH_WEEK_IN_MONTH=Optional[4]
int LAST_WEEK_IN_MONTH=Optional[0]
int INCLUDE_NONE=Optional[0]
int INCLUDE_FIRST=Optional[1]
int INCLUDE_SECOND=Optional[2]
int INCLUDE_BOTH=Optional[3]
int PRECEDING=Optional[-1]
int NEAREST=Optional[0]
int FOLLOWING=Optional[1]
String description
