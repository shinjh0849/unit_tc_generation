private Hours(int hours)
public static Hours hours(int hours)
public static Hours hoursBetween(ReadableInstant start, ReadableInstant end)
public static Hours hoursBetween(ReadablePartial start, ReadablePartial end)
public static Hours hoursIn(ReadableInterval interval)
public static Hours standardHoursIn(ReadablePeriod period)
public static Hours parseHours(String periodStr)
private Object readResolve()
public DurationFieldType getFieldType()
public PeriodType getPeriodType()
public Weeks toStandardWeeks()
public Days toStandardDays()
public Minutes toStandardMinutes()
public Seconds toStandardSeconds()
public Duration toStandardDuration()
public int getHours()
public Hours plus(int hours)
public Hours plus(Hours hours)
public Hours minus(int hours)
public Hours minus(Hours hours)
public Hours multipliedBy(int scalar)
public Hours dividedBy(int divisor)
public Hours negated()
public boolean isGreaterThan(Hours other)
public boolean isLessThan(Hours other)
public String toString()
Hours ZERO=Optional[new Hours(0)]
Hours ONE=Optional[new Hours(1)]
Hours TWO=Optional[new Hours(2)]
Hours THREE=Optional[new Hours(3)]
Hours FOUR=Optional[new Hours(4)]
Hours FIVE=Optional[new Hours(5)]
Hours SIX=Optional[new Hours(6)]
Hours SEVEN=Optional[new Hours(7)]
Hours EIGHT=Optional[new Hours(8)]
Hours MAX_VALUE=Optional[new Hours(Integer.MAX_VALUE)]
Hours MIN_VALUE=Optional[new Hours(Integer.MIN_VALUE)]
PeriodFormatter PARSER=Optional[ISOPeriodFormat.standard().withParseType(PeriodType.hours())]
long serialVersionUID=Optional[87525275727380864L]
