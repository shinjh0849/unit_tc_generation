private Minutes(int minutes)
public static Minutes minutes(int minutes)
public static Minutes minutesBetween(ReadableInstant start, ReadableInstant end)
public static Minutes minutesBetween(ReadablePartial start, ReadablePartial end)
public static Minutes minutesIn(ReadableInterval interval)
public static Minutes standardMinutesIn(ReadablePeriod period)
public static Minutes parseMinutes(String periodStr)
private Object readResolve()
public DurationFieldType getFieldType()
public PeriodType getPeriodType()
public Weeks toStandardWeeks()
public Days toStandardDays()
public Hours toStandardHours()
public Seconds toStandardSeconds()
public Duration toStandardDuration()
public int getMinutes()
public Minutes plus(int minutes)
public Minutes plus(Minutes minutes)
public Minutes minus(int minutes)
public Minutes minus(Minutes minutes)
public Minutes multipliedBy(int scalar)
public Minutes dividedBy(int divisor)
public Minutes negated()
public boolean isGreaterThan(Minutes other)
public boolean isLessThan(Minutes other)
public String toString()
Minutes ZERO=Optional[new Minutes(0)]
Minutes ONE=Optional[new Minutes(1)]
Minutes TWO=Optional[new Minutes(2)]
Minutes THREE=Optional[new Minutes(3)]
Minutes MAX_VALUE=Optional[new Minutes(Integer.MAX_VALUE)]
Minutes MIN_VALUE=Optional[new Minutes(Integer.MIN_VALUE)]
PeriodFormatter PARSER=Optional[ISOPeriodFormat.standard().withParseType(PeriodType.minutes())]
long serialVersionUID=Optional[87525275727380863L]
