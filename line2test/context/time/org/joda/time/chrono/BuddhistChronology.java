private BuddhistChronology(Chronology base, Object param)
public static BuddhistChronology getInstanceUTC()
public static BuddhistChronology getInstance()
public static synchronized BuddhistChronology getInstance(DateTimeZone zone)
private Object readResolve()
public Chronology withUTC()
public Chronology withZone(DateTimeZone zone)
public boolean equals(Object obj)
public int hashCode()
public String toString()
protected void assemble(Fields fields)
long serialVersionUID=Optional[-3474595157769370126L]
int BE=Optional[DateTimeConstants.CE]
DateTimeField ERA_FIELD=Optional[new BasicSingleEraDateTimeField("BE")]
int BUDDHIST_OFFSET=Optional[543]
Map<DateTimeZone, BuddhistChronology> cCache=Optional[new HashMap<DateTimeZone, BuddhistChronology>()]
BuddhistChronology INSTANCE_UTC=Optional[getInstance(DateTimeZone.UTC)]
