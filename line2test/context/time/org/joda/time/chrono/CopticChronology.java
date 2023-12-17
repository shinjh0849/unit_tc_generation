 CopticChronology(Chronology base, Object param, int minDaysInFirstWeek)
public static CopticChronology getInstanceUTC()
public static CopticChronology getInstance()
public static CopticChronology getInstance(DateTimeZone zone)
public static CopticChronology getInstance(DateTimeZone zone, int minDaysInFirstWeek)
private Object readResolve()
public Chronology withUTC()
public Chronology withZone(DateTimeZone zone)
 long calculateFirstDayOfYearMillis(int year)
 int getMinYear()
 int getMaxYear()
 long getApproxMillisAtEpochDividedByTwo()
protected void assemble(Fields fields)
long serialVersionUID=Optional[-5972804258688333942L]
int AM=Optional[DateTimeConstants.CE]
DateTimeField ERA_FIELD=Optional[new BasicSingleEraDateTimeField("AM")]
int MIN_YEAR=Optional[-292269337]
int MAX_YEAR=Optional[292272708]
Map<DateTimeZone, CopticChronology[]> cCache=Optional[new HashMap<DateTimeZone, CopticChronology[]>()]
CopticChronology INSTANCE_UTC
