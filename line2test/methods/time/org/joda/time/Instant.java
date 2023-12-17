public Instant() { [EOL]     super(); [EOL]     iMillis = DateTimeUtils.currentTimeMillis(); [EOL] } <line_num>: 107,110
public Instant(long instant) { [EOL]     super(); [EOL]     iMillis = instant; [EOL] } <line_num>: 117,120
public Instant(Object instant) { [EOL]     super(); [EOL]     InstantConverter converter = ConverterManager.getInstance().getInstantConverter(instant); [EOL]     iMillis = converter.getInstantMillis(instant, ISOChronology.getInstanceUTC()); [EOL] } <line_num>: 131,135
public static Instant now() { [EOL]     return new Instant(); [EOL] } <line_num>: 72,74
@FromString [EOL] public static Instant parse(String str) { [EOL]     return parse(str, ISODateTimeFormat.dateTimeParser()); [EOL] } <line_num>: 85,88
public static Instant parse(String str, DateTimeFormatter formatter) { [EOL]     return formatter.parseDateTime(str).toInstant(); [EOL] } <line_num>: 97,99
public Instant toInstant() { [EOL]     return this; [EOL] } <line_num>: 143,145
public Instant withMillis(long newMillis) { [EOL]     return (newMillis == iMillis ? this : new Instant(newMillis)); [EOL] } <line_num>: 156,158
public Instant withDurationAdded(long durationToAdd, int scalar) { [EOL]     if (durationToAdd == 0 || scalar == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().add(getMillis(), durationToAdd, scalar); [EOL]     return withMillis(instant); [EOL] } <line_num>: 170,176
public Instant withDurationAdded(ReadableDuration durationToAdd, int scalar) { [EOL]     if (durationToAdd == null || scalar == 0) { [EOL]         return this; [EOL]     } [EOL]     return withDurationAdded(durationToAdd.getMillis(), scalar); [EOL] } <line_num>: 188,193
public Instant plus(long duration) { [EOL]     return withDurationAdded(duration, 1); [EOL] } <line_num>: 205,207
public Instant plus(ReadableDuration duration) { [EOL]     return withDurationAdded(duration, 1); [EOL] } <line_num>: 218,220
public Instant minus(long duration) { [EOL]     return withDurationAdded(duration, -1); [EOL] } <line_num>: 232,234
public Instant minus(ReadableDuration duration) { [EOL]     return withDurationAdded(duration, -1); [EOL] } <line_num>: 245,247
public long getMillis() { [EOL]     return iMillis; [EOL] } <line_num>: 255,257
public Chronology getChronology() { [EOL]     return ISOChronology.getInstanceUTC(); [EOL] } <line_num>: 267,269
public DateTime toDateTime() { [EOL]     return new DateTime(getMillis(), ISOChronology.getInstance()); [EOL] } <line_num>: 287,289
@Deprecated [EOL] public DateTime toDateTimeISO() { [EOL]     return toDateTime(); [EOL] } <line_num>: 313,316
public MutableDateTime toMutableDateTime() { [EOL]     return new MutableDateTime(getMillis(), ISOChronology.getInstance()); [EOL] } <line_num>: 333,335
@Deprecated [EOL] public MutableDateTime toMutableDateTimeISO() { [EOL]     return toMutableDateTime(); [EOL] } <line_num>: 359,362
