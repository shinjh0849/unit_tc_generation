protected AbstractInstant() { [EOL]     super(); [EOL] } <line_num>: 60,62
public DateTimeZone getZone() { [EOL]     return getChronology().getZone(); [EOL] } <line_num>: 70,72
public int get(DateTimeFieldType type) { [EOL]     if (type == null) { [EOL]         throw new IllegalArgumentException("The DateTimeFieldType must not be null"); [EOL]     } [EOL]     return type.getField(getChronology()).get(getMillis()); [EOL] } <line_num>: 88,93
public boolean isSupported(DateTimeFieldType type) { [EOL]     if (type == null) { [EOL]         return false; [EOL]     } [EOL]     return type.getField(getChronology()).isSupported(); [EOL] } <line_num>: 102,107
public int get(DateTimeField field) { [EOL]     if (field == null) { [EOL]         throw new IllegalArgumentException("The DateTimeField must not be null"); [EOL]     } [EOL]     return field.get(getMillis()); [EOL] } <line_num>: 123,128
public Instant toInstant() { [EOL]     return new Instant(getMillis()); [EOL] } <line_num>: 136,138
public DateTime toDateTime() { [EOL]     return new DateTime(getMillis(), getZone()); [EOL] } <line_num>: 145,147
public DateTime toDateTimeISO() { [EOL]     return new DateTime(getMillis(), ISOChronology.getInstance(getZone())); [EOL] } <line_num>: 154,156
public DateTime toDateTime(DateTimeZone zone) { [EOL]     Chronology chrono = DateTimeUtils.getChronology(getChronology()); [EOL]     chrono = chrono.withZone(zone); [EOL]     return new DateTime(getMillis(), chrono); [EOL] } <line_num>: 164,168
public DateTime toDateTime(Chronology chronology) { [EOL]     return new DateTime(getMillis(), chronology); [EOL] } <line_num>: 176,178
public MutableDateTime toMutableDateTime() { [EOL]     return new MutableDateTime(getMillis(), getZone()); [EOL] } <line_num>: 190,192
public MutableDateTime toMutableDateTimeISO() { [EOL]     return new MutableDateTime(getMillis(), ISOChronology.getInstance(getZone())); [EOL] } <line_num>: 199,201
public MutableDateTime toMutableDateTime(DateTimeZone zone) { [EOL]     Chronology chrono = DateTimeUtils.getChronology(getChronology()); [EOL]     chrono = chrono.withZone(zone); [EOL]     return new MutableDateTime(getMillis(), chrono); [EOL] } <line_num>: 209,213
public MutableDateTime toMutableDateTime(Chronology chronology) { [EOL]     return new MutableDateTime(getMillis(), chronology); [EOL] } <line_num>: 221,223
public Date toDate() { [EOL]     return new Date(getMillis()); [EOL] } <line_num>: 234,236
public boolean equals(Object readableInstant) { [EOL]     if (this == readableInstant) { [EOL]         return true; [EOL]     } [EOL]     if (readableInstant instanceof ReadableInstant == false) { [EOL]         return false; [EOL]     } [EOL]     ReadableInstant otherInstant = (ReadableInstant) readableInstant; [EOL]     return getMillis() == otherInstant.getMillis() && FieldUtils.equals(getChronology(), otherInstant.getChronology()); [EOL] } <line_num>: 257,269
public int hashCode() { [EOL]     return ((int) (getMillis() ^ (getMillis() >>> 32))) + (getChronology().hashCode()); [EOL] } <line_num>: 276,281
public int compareTo(ReadableInstant other) { [EOL]     if (this == other) { [EOL]         return 0; [EOL]     } [EOL]     long otherMillis = other.getMillis(); [EOL]     long thisMillis = getMillis(); [EOL]     if (thisMillis == otherMillis) { [EOL]         return 0; [EOL]     } [EOL]     if (thisMillis < otherMillis) { [EOL]         return -1; [EOL]     } else { [EOL]         return 1; [EOL]     } [EOL] } <line_num>: 295,312
public boolean isAfter(long instant) { [EOL]     return (getMillis() > instant); [EOL] } <line_num>: 322,324
public boolean isAfterNow() { [EOL]     return isAfter(DateTimeUtils.currentTimeMillis()); [EOL] } <line_num>: 332,334
public boolean isAfter(ReadableInstant instant) { [EOL]     long instantMillis = DateTimeUtils.getInstantMillis(instant); [EOL]     return isAfter(instantMillis); [EOL] } <line_num>: 343,346
public boolean isBefore(long instant) { [EOL]     return (getMillis() < instant); [EOL] } <line_num>: 356,358
public boolean isBeforeNow() { [EOL]     return isBefore(DateTimeUtils.currentTimeMillis()); [EOL] } <line_num>: 366,368
public boolean isBefore(ReadableInstant instant) { [EOL]     long instantMillis = DateTimeUtils.getInstantMillis(instant); [EOL]     return isBefore(instantMillis); [EOL] } <line_num>: 377,380
public boolean isEqual(long instant) { [EOL]     return (getMillis() == instant); [EOL] } <line_num>: 390,392
public boolean isEqualNow() { [EOL]     return isEqual(DateTimeUtils.currentTimeMillis()); [EOL] } <line_num>: 400,402
public boolean isEqual(ReadableInstant instant) { [EOL]     long instantMillis = DateTimeUtils.getInstantMillis(instant); [EOL]     return isEqual(instantMillis); [EOL] } <line_num>: 411,414
@ToString [EOL] public String toString() { [EOL]     return ISODateTimeFormat.dateTime().print(this); [EOL] } <line_num>: 422,425
public String toString(DateTimeFormatter formatter) { [EOL]     if (formatter == null) { [EOL]         return toString(); [EOL]     } [EOL]     return formatter.print(this); [EOL] } <line_num>: 435,440
