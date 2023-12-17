private Seconds(int seconds)
public static Seconds seconds(int seconds)
public static Seconds secondsBetween(ReadableInstant start, ReadableInstant end)
public static Seconds secondsBetween(ReadablePartial start, ReadablePartial end)
public static Seconds secondsIn(ReadableInterval interval)
public static Seconds standardSecondsIn(ReadablePeriod period)
public static Seconds parseSeconds(String periodStr)
private Object readResolve()
public DurationFieldType getFieldType()
public PeriodType getPeriodType()
public Weeks toStandardWeeks()
public Days toStandardDays()
public Hours toStandardHours()
public Minutes toStandardMinutes()
public Duration toStandardDuration()
public int getSeconds()
public Seconds plus(int seconds)
public Seconds plus(Seconds seconds)
public Seconds minus(int seconds)
public Seconds minus(Seconds seconds)
public Seconds multipliedBy(int scalar)
public Seconds dividedBy(int divisor)
public Seconds negated()
public boolean isGreaterThan(Seconds other)
public boolean isLessThan(Seconds other)
public String toString()
Seconds ZERO=Optional[new Seconds(0)]
Seconds ONE=Optional[new Seconds(1)]
Seconds TWO=Optional[new Seconds(2)]
Seconds THREE=Optional[new Seconds(3)]
Seconds MAX_VALUE=Optional[new Seconds(Integer.MAX_VALUE)]
Seconds MIN_VALUE=Optional[new Seconds(Integer.MIN_VALUE)]
PeriodFormatter PARSER=Optional[ISOPeriodFormat.standard().withParseType(PeriodType.seconds())]
long serialVersionUID=Optional[87525275727380862L]
