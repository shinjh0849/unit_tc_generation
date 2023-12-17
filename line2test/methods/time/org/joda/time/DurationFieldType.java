protected DurationFieldType(String name) { [EOL]     super(); [EOL]     iName = name; [EOL] } <line_num>: 93,96
StandardDurationFieldType(String name, byte ordinal) { [EOL]     super(name); [EOL]     iOrdinal = ordinal; [EOL] } <line_num>: 258,261
public static DurationFieldType millis() { [EOL]     return MILLIS_TYPE; [EOL] } <line_num>: 104,106
public static DurationFieldType seconds() { [EOL]     return SECONDS_TYPE; [EOL] } <line_num>: 113,115
public static DurationFieldType minutes() { [EOL]     return MINUTES_TYPE; [EOL] } <line_num>: 122,124
public static DurationFieldType hours() { [EOL]     return HOURS_TYPE; [EOL] } <line_num>: 131,133
public static DurationFieldType halfdays() { [EOL]     return HALFDAYS_TYPE; [EOL] } <line_num>: 140,142
public static DurationFieldType days() { [EOL]     return DAYS_TYPE; [EOL] } <line_num>: 150,152
public static DurationFieldType weeks() { [EOL]     return WEEKS_TYPE; [EOL] } <line_num>: 159,161
public static DurationFieldType weekyears() { [EOL]     return WEEKYEARS_TYPE; [EOL] } <line_num>: 168,170
public static DurationFieldType months() { [EOL]     return MONTHS_TYPE; [EOL] } <line_num>: 177,179
public static DurationFieldType years() { [EOL]     return YEARS_TYPE; [EOL] } <line_num>: 186,188
public static DurationFieldType centuries() { [EOL]     return CENTURIES_TYPE; [EOL] } <line_num>: 195,197
public static DurationFieldType eras() { [EOL]     return ERAS_TYPE; [EOL] } <line_num>: 204,206
public String getName() { [EOL]     return iName; [EOL] } <line_num>: 215,217
public abstract DurationField getField(Chronology chronology); <line_num>: 225,225
public boolean isSupported(Chronology chronology) { [EOL]     return getField(chronology).isSupported(); [EOL] } <line_num>: 233,235
public String toString() { [EOL]     return getName(); [EOL] } <line_num>: 242,244
@Override [EOL] public boolean equals(Object obj) { [EOL]     if (this == obj) { [EOL]         return true; [EOL]     } [EOL]     if (obj instanceof StandardDurationFieldType) { [EOL]         return iOrdinal == ((StandardDurationFieldType) obj).iOrdinal; [EOL]     } [EOL]     return false; [EOL] } <line_num>: 264,273
@Override [EOL] public int hashCode() { [EOL]     return (1 << iOrdinal); [EOL] } <line_num>: 276,279
public DurationField getField(Chronology chronology) { [EOL]     chronology = DateTimeUtils.getChronology(chronology); [EOL]     switch(iOrdinal) { [EOL]         case ERAS: [EOL]             return chronology.eras(); [EOL]         case CENTURIES: [EOL]             return chronology.centuries(); [EOL]         case WEEKYEARS: [EOL]             return chronology.weekyears(); [EOL]         case YEARS: [EOL]             return chronology.years(); [EOL]         case MONTHS: [EOL]             return chronology.months(); [EOL]         case WEEKS: [EOL]             return chronology.weeks(); [EOL]         case DAYS: [EOL]             return chronology.days(); [EOL]         case HALFDAYS: [EOL]             return chronology.halfdays(); [EOL]         case HOURS: [EOL]             return chronology.hours(); [EOL]         case MINUTES: [EOL]             return chronology.minutes(); [EOL]         case SECONDS: [EOL]             return chronology.seconds(); [EOL]         case MILLIS: [EOL]             return chronology.millis(); [EOL]         default: [EOL]             throw new InternalError(); [EOL]     } [EOL] } <line_num>: 281,313
private Object readResolve() { [EOL]     switch(iOrdinal) { [EOL]         case ERAS: [EOL]             return ERAS_TYPE; [EOL]         case CENTURIES: [EOL]             return CENTURIES_TYPE; [EOL]         case WEEKYEARS: [EOL]             return WEEKYEARS_TYPE; [EOL]         case YEARS: [EOL]             return YEARS_TYPE; [EOL]         case MONTHS: [EOL]             return MONTHS_TYPE; [EOL]         case WEEKS: [EOL]             return WEEKS_TYPE; [EOL]         case DAYS: [EOL]             return DAYS_TYPE; [EOL]         case HALFDAYS: [EOL]             return HALFDAYS_TYPE; [EOL]         case HOURS: [EOL]             return HOURS_TYPE; [EOL]         case MINUTES: [EOL]             return MINUTES_TYPE; [EOL]         case SECONDS: [EOL]             return SECONDS_TYPE; [EOL]         case MILLIS: [EOL]             return MILLIS_TYPE; [EOL]         default: [EOL]             return this; [EOL]     } [EOL] } <line_num>: 320,350
