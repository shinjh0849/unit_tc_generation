private Years(int years)
public static Years years(int years)
public static Years yearsBetween(ReadableInstant start, ReadableInstant end)
public static Years yearsBetween(ReadablePartial start, ReadablePartial end)
public static Years yearsIn(ReadableInterval interval)
public static Years parseYears(String periodStr)
private Object readResolve()
public DurationFieldType getFieldType()
public PeriodType getPeriodType()
public int getYears()
public Years plus(int years)
public Years plus(Years years)
public Years minus(int years)
public Years minus(Years years)
public Years multipliedBy(int scalar)
public Years dividedBy(int divisor)
public Years negated()
public boolean isGreaterThan(Years other)
public boolean isLessThan(Years other)
public String toString()
Years ZERO=Optional[new Years(0)]
Years ONE=Optional[new Years(1)]
Years TWO=Optional[new Years(2)]
Years THREE=Optional[new Years(3)]
Years MAX_VALUE=Optional[new Years(Integer.MAX_VALUE)]
Years MIN_VALUE=Optional[new Years(Integer.MIN_VALUE)]
PeriodFormatter PARSER=Optional[ISOPeriodFormat.standard().withParseType(PeriodType.years())]
long serialVersionUID=Optional[87525275727380868L]
