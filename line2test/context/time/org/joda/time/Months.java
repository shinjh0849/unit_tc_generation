private Months(int months)
public static Months months(int months)
public static Months monthsBetween(ReadableInstant start, ReadableInstant end)
public static Months monthsBetween(ReadablePartial start, ReadablePartial end)
public static Months monthsIn(ReadableInterval interval)
public static Months parseMonths(String periodStr)
private Object readResolve()
public DurationFieldType getFieldType()
public PeriodType getPeriodType()
public int getMonths()
public Months plus(int months)
public Months plus(Months months)
public Months minus(int months)
public Months minus(Months months)
public Months multipliedBy(int scalar)
public Months dividedBy(int divisor)
public Months negated()
public boolean isGreaterThan(Months other)
public boolean isLessThan(Months other)
public String toString()
Months ZERO=Optional[new Months(0)]
Months ONE=Optional[new Months(1)]
Months TWO=Optional[new Months(2)]
Months THREE=Optional[new Months(3)]
Months FOUR=Optional[new Months(4)]
Months FIVE=Optional[new Months(5)]
Months SIX=Optional[new Months(6)]
Months SEVEN=Optional[new Months(7)]
Months EIGHT=Optional[new Months(8)]
Months NINE=Optional[new Months(9)]
Months TEN=Optional[new Months(10)]
Months ELEVEN=Optional[new Months(11)]
Months TWELVE=Optional[new Months(12)]
Months MAX_VALUE=Optional[new Months(Integer.MAX_VALUE)]
Months MIN_VALUE=Optional[new Months(Integer.MIN_VALUE)]
PeriodFormatter PARSER=Optional[ISOPeriodFormat.standard().withParseType(PeriodType.months())]
long serialVersionUID=Optional[87525275727380867L]
