protected DurationFieldType(String name)
 StandardDurationFieldType(String name, byte ordinal)
public static DurationFieldType millis()
public static DurationFieldType seconds()
public static DurationFieldType minutes()
public static DurationFieldType hours()
public static DurationFieldType halfdays()
public static DurationFieldType days()
public static DurationFieldType weeks()
public static DurationFieldType weekyears()
public static DurationFieldType months()
public static DurationFieldType years()
public static DurationFieldType centuries()
public static DurationFieldType eras()
public String getName()
public abstract DurationField getField(Chronology chronology)
public boolean isSupported(Chronology chronology)
public String toString()
public boolean equals(Object obj)
public int hashCode()
public DurationField getField(Chronology chronology)
private Object readResolve()
long serialVersionUID=Optional[8765135187319L]
byte ERAS=Optional[1]
byte CENTURIES=Optional[2]
byte WEEKYEARS=Optional[3]
byte YEARS=Optional[4]
byte MONTHS=Optional[5]
byte WEEKS=Optional[6]
byte DAYS=Optional[7]
byte HALFDAYS=Optional[8]
byte HOURS=Optional[9]
byte MINUTES=Optional[10]
byte SECONDS=Optional[11]
byte MILLIS=Optional[12]
DurationFieldType ERAS_TYPE=Optional[new StandardDurationFieldType("eras", ERAS)]
DurationFieldType CENTURIES_TYPE=Optional[new StandardDurationFieldType("centuries", CENTURIES)]
DurationFieldType WEEKYEARS_TYPE=Optional[new StandardDurationFieldType("weekyears", WEEKYEARS)]
DurationFieldType YEARS_TYPE=Optional[new StandardDurationFieldType("years", YEARS)]
DurationFieldType MONTHS_TYPE=Optional[new StandardDurationFieldType("months", MONTHS)]
DurationFieldType WEEKS_TYPE=Optional[new StandardDurationFieldType("weeks", WEEKS)]
DurationFieldType DAYS_TYPE=Optional[new StandardDurationFieldType("days", DAYS)]
DurationFieldType HALFDAYS_TYPE=Optional[new StandardDurationFieldType("halfdays", HALFDAYS)]
DurationFieldType HOURS_TYPE=Optional[new StandardDurationFieldType("hours", HOURS)]
DurationFieldType MINUTES_TYPE=Optional[new StandardDurationFieldType("minutes", MINUTES)]
DurationFieldType SECONDS_TYPE=Optional[new StandardDurationFieldType("seconds", SECONDS)]
DurationFieldType MILLIS_TYPE=Optional[new StandardDurationFieldType("millis", MILLIS)]
String iName
