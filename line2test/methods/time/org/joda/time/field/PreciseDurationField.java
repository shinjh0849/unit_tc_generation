public PreciseDurationField(DurationFieldType type, long unitMillis) { [EOL]     super(type); [EOL]     iUnitMillis = unitMillis; [EOL] } <line_num>: 42,45
public final boolean isPrecise() { [EOL]     return true; [EOL] } <line_num>: 53,55
public final long getUnitMillis() { [EOL]     return iUnitMillis; [EOL] } <line_num>: 62,64
public long getValueAsLong(long duration, long instant) { [EOL]     return duration / iUnitMillis; [EOL] } <line_num>: 75,77
public long getMillis(int value, long instant) { [EOL]     return value * iUnitMillis; [EOL] } <line_num>: 87,89
public long getMillis(long value, long instant) { [EOL]     return FieldUtils.safeMultiply(value, iUnitMillis); [EOL] } <line_num>: 99,101
public long add(long instant, int value) { [EOL]     long addition = value * iUnitMillis; [EOL]     return FieldUtils.safeAdd(instant, addition); [EOL] } <line_num>: 103,106
public long add(long instant, long value) { [EOL]     long addition = FieldUtils.safeMultiply(value, iUnitMillis); [EOL]     return FieldUtils.safeAdd(instant, addition); [EOL] } <line_num>: 108,111
public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) { [EOL]     long difference = FieldUtils.safeSubtract(minuendInstant, subtrahendInstant); [EOL]     return difference / iUnitMillis; [EOL] } <line_num>: 113,116
public boolean equals(Object obj) { [EOL]     if (this == obj) { [EOL]         return true; [EOL]     } else if (obj instanceof PreciseDurationField) { [EOL]         PreciseDurationField other = (PreciseDurationField) obj; [EOL]         return (getType() == other.getType()) && (iUnitMillis == other.iUnitMillis); [EOL]     } [EOL]     return false; [EOL] } <line_num>: 126,134
public int hashCode() { [EOL]     long millis = iUnitMillis; [EOL]     int hash = (int) (millis ^ (millis >>> 32)); [EOL]     hash += getType().hashCode(); [EOL]     return hash; [EOL] } <line_num>: 141,146
