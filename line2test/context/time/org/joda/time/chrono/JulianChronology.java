 JulianChronology(Chronology base, Object param, int minDaysInFirstWeek)
 static int adjustYearForSet(int year)
public static JulianChronology getInstanceUTC()
public static JulianChronology getInstance()
public static JulianChronology getInstance(DateTimeZone zone)
public static JulianChronology getInstance(DateTimeZone zone, int minDaysInFirstWeek)
private Object readResolve()
public Chronology withUTC()
public Chronology withZone(DateTimeZone zone)
 long getDateMidnightMillis(int year, int monthOfYear, int dayOfMonth) throws IllegalArgumentException
 boolean isLeapYear(int year)
 long calculateFirstDayOfYearMillis(int year)
 int getMinYear()
 int getMaxYear()
 long getAverageMillisPerYear()
 long getAverageMillisPerYearDividedByTwo()
 long getAverageMillisPerMonth()
 long getApproxMillisAtEpochDividedByTwo()
protected void assemble(Fields fields)
long serialVersionUID=Optional[-8731039522547897247L]
long MILLIS_PER_YEAR=Optional[(long) (365.25 * DateTimeConstants.MILLIS_PER_DAY)]
long MILLIS_PER_MONTH=Optional[(long) (365.25 * DateTimeConstants.MILLIS_PER_DAY / 12)]
int MIN_YEAR=Optional[-292269054]
int MAX_YEAR=Optional[292272992]
JulianChronology INSTANCE_UTC
Map<DateTimeZone, JulianChronology[]> cCache=Optional[new HashMap<DateTimeZone, JulianChronology[]>()]
