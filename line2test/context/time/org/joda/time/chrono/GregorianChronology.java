private GregorianChronology(Chronology base, Object param, int minDaysInFirstWeek)
public static GregorianChronology getInstanceUTC()
public static GregorianChronology getInstance()
public static GregorianChronology getInstance(DateTimeZone zone)
public static GregorianChronology getInstance(DateTimeZone zone, int minDaysInFirstWeek)
private Object readResolve()
public Chronology withUTC()
public Chronology withZone(DateTimeZone zone)
protected void assemble(Fields fields)
 boolean isLeapYear(int year)
 long calculateFirstDayOfYearMillis(int year)
 int getMinYear()
 int getMaxYear()
 long getAverageMillisPerYear()
 long getAverageMillisPerYearDividedByTwo()
 long getAverageMillisPerMonth()
 long getApproxMillisAtEpochDividedByTwo()
long serialVersionUID=Optional[-861407383323710522L]
long MILLIS_PER_YEAR=Optional[(long) (365.2425 * DateTimeConstants.MILLIS_PER_DAY)]
long MILLIS_PER_MONTH=Optional[(long) (365.2425 * DateTimeConstants.MILLIS_PER_DAY / 12)]
int DAYS_0000_TO_1970=Optional[719527]
int MIN_YEAR=Optional[-292275054]
int MAX_YEAR=Optional[292278993]
GregorianChronology INSTANCE_UTC
Map<DateTimeZone, GregorianChronology[]> cCache=Optional[new HashMap<DateTimeZone, GregorianChronology[]>()]
