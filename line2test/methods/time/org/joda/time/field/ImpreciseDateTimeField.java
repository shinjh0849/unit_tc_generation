public ImpreciseDateTimeField(DateTimeFieldType type, long unitMillis) { [EOL]     super(type); [EOL]     iUnitMillis = unitMillis; [EOL]     iDurationField = new LinkedDurationField(type.getDurationType()); [EOL] } <line_num>: 55,59
LinkedDurationField(DurationFieldType type) { [EOL]     super(type); [EOL] } <line_num>: 152,154
public abstract int get(long instant); <line_num>: 61,61
public abstract long set(long instant, int value); <line_num>: 63,63
public abstract long add(long instant, int value); <line_num>: 65,65
public abstract long add(long instant, long value); <line_num>: 67,67
public int getDifference(long minuendInstant, long subtrahendInstant) { [EOL]     return FieldUtils.safeToInt(getDifferenceAsLong(minuendInstant, subtrahendInstant)); [EOL] } <line_num>: 91,93
public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) { [EOL]     if (minuendInstant < subtrahendInstant) { [EOL]         return -getDifferenceAsLong(subtrahendInstant, minuendInstant); [EOL]     } [EOL]     long difference = (minuendInstant - subtrahendInstant) / iUnitMillis; [EOL]     if (add(subtrahendInstant, difference) < minuendInstant) { [EOL]         do { [EOL]             difference++; [EOL]         } while (add(subtrahendInstant, difference) <= minuendInstant); [EOL]         difference--; [EOL]     } else if (add(subtrahendInstant, difference) > minuendInstant) { [EOL]         do { [EOL]             difference--; [EOL]         } while (add(subtrahendInstant, difference) > minuendInstant); [EOL]     } [EOL]     return difference; [EOL] } <line_num>: 118,135
public final DurationField getDurationField() { [EOL]     return iDurationField; [EOL] } <line_num>: 137,139
public abstract DurationField getRangeDurationField(); <line_num>: 141,141
public abstract long roundFloor(long instant); <line_num>: 143,143
protected final long getDurationUnitMillis() { [EOL]     return iUnitMillis; [EOL] } <line_num>: 145,147
public boolean isPrecise() { [EOL]     return false; [EOL] } <line_num>: 156,158
public long getUnitMillis() { [EOL]     return iUnitMillis; [EOL] } <line_num>: 160,162
public int getValue(long duration, long instant) { [EOL]     return ImpreciseDateTimeField.this.getDifference(instant + duration, instant); [EOL] } <line_num>: 164,167
public long getValueAsLong(long duration, long instant) { [EOL]     return ImpreciseDateTimeField.this.getDifferenceAsLong(instant + duration, instant); [EOL] } <line_num>: 169,172
public long getMillis(int value, long instant) { [EOL]     return ImpreciseDateTimeField.this.add(instant, value) - instant; [EOL] } <line_num>: 174,176
public long getMillis(long value, long instant) { [EOL]     return ImpreciseDateTimeField.this.add(instant, value) - instant; [EOL] } <line_num>: 178,180
public long add(long instant, int value) { [EOL]     return ImpreciseDateTimeField.this.add(instant, value); [EOL] } <line_num>: 182,184
public long add(long instant, long value) { [EOL]     return ImpreciseDateTimeField.this.add(instant, value); [EOL] } <line_num>: 186,188
public int getDifference(long minuendInstant, long subtrahendInstant) { [EOL]     return ImpreciseDateTimeField.this.getDifference(minuendInstant, subtrahendInstant); [EOL] } <line_num>: 190,193
public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) { [EOL]     return ImpreciseDateTimeField.this.getDifferenceAsLong(minuendInstant, subtrahendInstant); [EOL] } <line_num>: 195,198
