protected DateTimeFieldType(String name)
 StandardDateTimeFieldType(String name, byte ordinal, DurationFieldType unitType, DurationFieldType rangeType)
public static DateTimeFieldType millisOfSecond()
public static DateTimeFieldType millisOfDay()
public static DateTimeFieldType secondOfMinute()
public static DateTimeFieldType secondOfDay()
public static DateTimeFieldType minuteOfHour()
public static DateTimeFieldType minuteOfDay()
public static DateTimeFieldType hourOfDay()
public static DateTimeFieldType clockhourOfDay()
public static DateTimeFieldType hourOfHalfday()
public static DateTimeFieldType clockhourOfHalfday()
public static DateTimeFieldType halfdayOfDay()
public static DateTimeFieldType dayOfWeek()
public static DateTimeFieldType dayOfMonth()
public static DateTimeFieldType dayOfYear()
public static DateTimeFieldType weekOfWeekyear()
public static DateTimeFieldType weekyear()
public static DateTimeFieldType weekyearOfCentury()
public static DateTimeFieldType monthOfYear()
public static DateTimeFieldType year()
public static DateTimeFieldType yearOfEra()
public static DateTimeFieldType yearOfCentury()
public static DateTimeFieldType centuryOfEra()
public static DateTimeFieldType era()
public String getName()
public abstract DurationFieldType getDurationType()
public abstract DurationFieldType getRangeDurationType()
public abstract DateTimeField getField(Chronology chronology)
public boolean isSupported(Chronology chronology)
public String toString()
public DurationFieldType getDurationType()
public DurationFieldType getRangeDurationType()
public boolean equals(Object obj)
public int hashCode()
public DateTimeField getField(Chronology chronology)
private Object readResolve()
long serialVersionUID=Optional[-42615285973990L]
byte ERA=Optional[1]
byte YEAR_OF_ERA=Optional[2]
byte CENTURY_OF_ERA=Optional[3]
byte YEAR_OF_CENTURY=Optional[4]
byte YEAR=Optional[5]
byte DAY_OF_YEAR=Optional[6]
byte MONTH_OF_YEAR=Optional[7]
byte DAY_OF_MONTH=Optional[8]
byte WEEKYEAR_OF_CENTURY=Optional[9]
byte WEEKYEAR=Optional[10]
byte WEEK_OF_WEEKYEAR=Optional[11]
byte DAY_OF_WEEK=Optional[12]
byte HALFDAY_OF_DAY=Optional[13]
byte HOUR_OF_HALFDAY=Optional[14]
byte CLOCKHOUR_OF_HALFDAY=Optional[15]
byte CLOCKHOUR_OF_DAY=Optional[16]
byte HOUR_OF_DAY=Optional[17]
byte MINUTE_OF_DAY=Optional[18]
byte MINUTE_OF_HOUR=Optional[19]
byte SECOND_OF_DAY=Optional[20]
byte SECOND_OF_MINUTE=Optional[21]
byte MILLIS_OF_DAY=Optional[22]
byte MILLIS_OF_SECOND=Optional[23]
DateTimeFieldType ERA_TYPE=Optional[new StandardDateTimeFieldType("era", ERA, DurationFieldType.eras(), null)]
DateTimeFieldType YEAR_OF_ERA_TYPE=Optional[new StandardDateTimeFieldType("yearOfEra", YEAR_OF_ERA, DurationFieldType.years(), DurationFieldType.eras())]
DateTimeFieldType CENTURY_OF_ERA_TYPE=Optional[new StandardDateTimeFieldType("centuryOfEra", CENTURY_OF_ERA, DurationFieldType.centuries(), DurationFieldType.eras())]
DateTimeFieldType YEAR_OF_CENTURY_TYPE=Optional[new StandardDateTimeFieldType("yearOfCentury", YEAR_OF_CENTURY, DurationFieldType.years(), DurationFieldType.centuries())]
DateTimeFieldType YEAR_TYPE=Optional[new StandardDateTimeFieldType("year", YEAR, DurationFieldType.years(), null)]
DateTimeFieldType DAY_OF_YEAR_TYPE=Optional[new StandardDateTimeFieldType("dayOfYear", DAY_OF_YEAR, DurationFieldType.days(), DurationFieldType.years())]
DateTimeFieldType MONTH_OF_YEAR_TYPE=Optional[new StandardDateTimeFieldType("monthOfYear", MONTH_OF_YEAR, DurationFieldType.months(), DurationFieldType.years())]
DateTimeFieldType DAY_OF_MONTH_TYPE=Optional[new StandardDateTimeFieldType("dayOfMonth", DAY_OF_MONTH, DurationFieldType.days(), DurationFieldType.months())]
DateTimeFieldType WEEKYEAR_OF_CENTURY_TYPE=Optional[new StandardDateTimeFieldType("weekyearOfCentury", WEEKYEAR_OF_CENTURY, DurationFieldType.weekyears(), DurationFieldType.centuries())]
DateTimeFieldType WEEKYEAR_TYPE=Optional[new StandardDateTimeFieldType("weekyear", WEEKYEAR, DurationFieldType.weekyears(), null)]
DateTimeFieldType WEEK_OF_WEEKYEAR_TYPE=Optional[new StandardDateTimeFieldType("weekOfWeekyear", WEEK_OF_WEEKYEAR, DurationFieldType.weeks(), DurationFieldType.weekyears())]
DateTimeFieldType DAY_OF_WEEK_TYPE=Optional[new StandardDateTimeFieldType("dayOfWeek", DAY_OF_WEEK, DurationFieldType.days(), DurationFieldType.weeks())]
DateTimeFieldType HALFDAY_OF_DAY_TYPE=Optional[new StandardDateTimeFieldType("halfdayOfDay", HALFDAY_OF_DAY, DurationFieldType.halfdays(), DurationFieldType.days())]
DateTimeFieldType HOUR_OF_HALFDAY_TYPE=Optional[new StandardDateTimeFieldType("hourOfHalfday", HOUR_OF_HALFDAY, DurationFieldType.hours(), DurationFieldType.halfdays())]
DateTimeFieldType CLOCKHOUR_OF_HALFDAY_TYPE=Optional[new StandardDateTimeFieldType("clockhourOfHalfday", CLOCKHOUR_OF_HALFDAY, DurationFieldType.hours(), DurationFieldType.halfdays())]
DateTimeFieldType CLOCKHOUR_OF_DAY_TYPE=Optional[new StandardDateTimeFieldType("clockhourOfDay", CLOCKHOUR_OF_DAY, DurationFieldType.hours(), DurationFieldType.days())]
DateTimeFieldType HOUR_OF_DAY_TYPE=Optional[new StandardDateTimeFieldType("hourOfDay", HOUR_OF_DAY, DurationFieldType.hours(), DurationFieldType.days())]
DateTimeFieldType MINUTE_OF_DAY_TYPE=Optional[new StandardDateTimeFieldType("minuteOfDay", MINUTE_OF_DAY, DurationFieldType.minutes(), DurationFieldType.days())]
DateTimeFieldType MINUTE_OF_HOUR_TYPE=Optional[new StandardDateTimeFieldType("minuteOfHour", MINUTE_OF_HOUR, DurationFieldType.minutes(), DurationFieldType.hours())]
DateTimeFieldType SECOND_OF_DAY_TYPE=Optional[new StandardDateTimeFieldType("secondOfDay", SECOND_OF_DAY, DurationFieldType.seconds(), DurationFieldType.days())]
DateTimeFieldType SECOND_OF_MINUTE_TYPE=Optional[new StandardDateTimeFieldType("secondOfMinute", SECOND_OF_MINUTE, DurationFieldType.seconds(), DurationFieldType.minutes())]
DateTimeFieldType MILLIS_OF_DAY_TYPE=Optional[new StandardDateTimeFieldType("millisOfDay", MILLIS_OF_DAY, DurationFieldType.millis(), DurationFieldType.days())]
DateTimeFieldType MILLIS_OF_SECOND_TYPE=Optional[new StandardDateTimeFieldType("millisOfSecond", MILLIS_OF_SECOND, DurationFieldType.millis(), DurationFieldType.seconds())]
String iName
