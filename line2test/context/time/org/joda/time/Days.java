private Days(int days)
public static Days days(int days)
public static Days daysBetween(ReadableInstant start, ReadableInstant end)
public static Days daysBetween(ReadablePartial start, ReadablePartial end)
public static Days daysIn(ReadableInterval interval)
public static Days standardDaysIn(ReadablePeriod period)
public static Days parseDays(String periodStr)
private Object readResolve()
public DurationFieldType getFieldType()
public PeriodType getPeriodType()
public Weeks toStandardWeeks()
public Hours toStandardHours()
public Minutes toStandardMinutes()
public Seconds toStandardSeconds()
public Duration toStandardDuration()
public int getDays()
public Days plus(int days)
public Days plus(Days days)
public Days minus(int days)
public Days minus(Days days)
public Days multipliedBy(int scalar)
public Days dividedBy(int divisor)
public Days negated()
public boolean isGreaterThan(Days other)
public boolean isLessThan(Days other)
public String toString()
Days ZERO=Optional[new Days(0)]
Days ONE=Optional[new Days(1)]
Days TWO=Optional[new Days(2)]
Days THREE=Optional[new Days(3)]
Days FOUR=Optional[new Days(4)]
Days FIVE=Optional[new Days(5)]
Days SIX=Optional[new Days(6)]
Days SEVEN=Optional[new Days(7)]
Days MAX_VALUE=Optional[new Days(Integer.MAX_VALUE)]
Days MIN_VALUE=Optional[new Days(Integer.MIN_VALUE)]
PeriodFormatter PARSER=Optional[ISOPeriodFormat.standard().withParseType(PeriodType.days())]
long serialVersionUID=Optional[87525275727380865L]
