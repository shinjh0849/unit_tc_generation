private MillisDurationField() { [EOL]     super(); [EOL] } <line_num>: 43,45
public DurationFieldType getType() { [EOL]     return DurationFieldType.millis(); [EOL] } <line_num>: 48,50
public String getName() { [EOL]     return "millis"; [EOL] } <line_num>: 52,54
public boolean isSupported() { [EOL]     return true; [EOL] } <line_num>: 61,63
public final boolean isPrecise() { [EOL]     return true; [EOL] } <line_num>: 70,72
public final long getUnitMillis() { [EOL]     return 1; [EOL] } <line_num>: 79,81
public int getValue(long duration) { [EOL]     return FieldUtils.safeToInt(duration); [EOL] } <line_num>: 84,86
public long getValueAsLong(long duration) { [EOL]     return duration; [EOL] } <line_num>: 88,90
public int getValue(long duration, long instant) { [EOL]     return FieldUtils.safeToInt(duration); [EOL] } <line_num>: 92,94
public long getValueAsLong(long duration, long instant) { [EOL]     return duration; [EOL] } <line_num>: 96,98
public long getMillis(int value) { [EOL]     return value; [EOL] } <line_num>: 100,102
public long getMillis(long value) { [EOL]     return value; [EOL] } <line_num>: 104,106
public long getMillis(int value, long instant) { [EOL]     return value; [EOL] } <line_num>: 108,110
public long getMillis(long value, long instant) { [EOL]     return value; [EOL] } <line_num>: 112,114
public long add(long instant, int value) { [EOL]     return FieldUtils.safeAdd(instant, value); [EOL] } <line_num>: 116,118
public long add(long instant, long value) { [EOL]     return FieldUtils.safeAdd(instant, value); [EOL] } <line_num>: 120,122
public int getDifference(long minuendInstant, long subtrahendInstant) { [EOL]     return FieldUtils.safeToInt(FieldUtils.safeSubtract(minuendInstant, subtrahendInstant)); [EOL] } <line_num>: 124,126
public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) { [EOL]     return FieldUtils.safeSubtract(minuendInstant, subtrahendInstant); [EOL] } <line_num>: 128,130
public int compareTo(DurationField otherField) { [EOL]     long otherMillis = otherField.getUnitMillis(); [EOL]     long thisMillis = getUnitMillis(); [EOL]     if (thisMillis == otherMillis) { [EOL]         return 0; [EOL]     } [EOL]     if (thisMillis < otherMillis) { [EOL]         return -1; [EOL]     } else { [EOL]         return 1; [EOL]     } [EOL] } <line_num>: 133,145
public boolean equals(Object obj) { [EOL]     if (obj instanceof MillisDurationField) { [EOL]         return getUnitMillis() == ((MillisDurationField) obj).getUnitMillis(); [EOL]     } [EOL]     return false; [EOL] } <line_num>: 147,152
public int hashCode() { [EOL]     return (int) getUnitMillis(); [EOL] } <line_num>: 154,156
public String toString() { [EOL]     return "DurationField[millis]"; [EOL] } <line_num>: 163,165
private Object readResolve() { [EOL]     return INSTANCE; [EOL] } <line_num>: 170,172
