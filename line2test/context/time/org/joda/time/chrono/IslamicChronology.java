 IslamicChronology(Chronology base, Object param, LeapYearPatternType leapYears)
 LeapYearPatternType(int index, int pattern)
public static IslamicChronology getInstanceUTC()
public static IslamicChronology getInstance()
public static IslamicChronology getInstance(DateTimeZone zone)
public static IslamicChronology getInstance(DateTimeZone zone, LeapYearPatternType leapYears)
private Object readResolve()
public LeapYearPatternType getLeapYearPatternType()
public Chronology withUTC()
public Chronology withZone(DateTimeZone zone)
public boolean equals(Object obj)
public int hashCode()
 int getYear(long instant)
 long setYear(long instant, int year)
 long getYearDifference(long minuendInstant, long subtrahendInstant)
 long getTotalMillisByYearMonth(int year, int month)
 int getDayOfMonth(long millis)
 boolean isLeapYear(int year)
 int getDaysInYearMax()
 int getDaysInYear(int year)
 int getDaysInYearMonth(int year, int month)
 int getDaysInMonthMax()
 int getDaysInMonthMax(int month)
 int getMonthOfYear(long millis, int year)
 long getAverageMillisPerYear()
 long getAverageMillisPerYearDividedByTwo()
 long getAverageMillisPerMonth()
 long calculateFirstDayOfYearMillis(int year)
 int getMinYear()
 int getMaxYear()
 long getApproxMillisAtEpochDividedByTwo()
protected void assemble(Fields fields)
 boolean isLeapYear(int year)
private Object readResolve()
public boolean equals(Object obj)
public int hashCode()
long serialVersionUID=Optional[-3663823829888L]
int AH=Optional[DateTimeConstants.CE]
DateTimeField ERA_FIELD=Optional[new BasicSingleEraDateTimeField("AH")]
LeapYearPatternType LEAP_YEAR_15_BASED=Optional[new LeapYearPatternType(0, 623158436)]
LeapYearPatternType LEAP_YEAR_16_BASED=Optional[new LeapYearPatternType(1, 623191204)]
LeapYearPatternType LEAP_YEAR_INDIAN=Optional[new LeapYearPatternType(2, 690562340)]
LeapYearPatternType LEAP_YEAR_HABASH_AL_HASIB=Optional[new LeapYearPatternType(3, 153692453)]
int MIN_YEAR=Optional[-292269337]
int MAX_YEAR=Optional[292271022]
int MONTH_PAIR_LENGTH=Optional[59]
int LONG_MONTH_LENGTH=Optional[30]
int SHORT_MONTH_LENGTH=Optional[29]
long MILLIS_PER_MONTH_PAIR=Optional[59L * DateTimeConstants.MILLIS_PER_DAY]
long MILLIS_PER_MONTH=Optional[(long) (29.53056 * DateTimeConstants.MILLIS_PER_DAY)]
long MILLIS_PER_LONG_MONTH=Optional[30L * DateTimeConstants.MILLIS_PER_DAY]
long MILLIS_PER_YEAR=Optional[(long) (354.36667 * DateTimeConstants.MILLIS_PER_DAY)]
long MILLIS_PER_SHORT_YEAR=Optional[354L * DateTimeConstants.MILLIS_PER_DAY]
long MILLIS_PER_LONG_YEAR=Optional[355L * DateTimeConstants.MILLIS_PER_DAY]
long MILLIS_YEAR_1=Optional[-42521587200000L]
int CYCLE=Optional[30]
long MILLIS_PER_CYCLE=Optional[((19L * 354L + 11L * 355L) * DateTimeConstants.MILLIS_PER_DAY)]
Map<DateTimeZone, IslamicChronology[]> cCache=Optional[new HashMap<DateTimeZone, IslamicChronology[]>()]
IslamicChronology INSTANCE_UTC
LeapYearPatternType iLeapYears
