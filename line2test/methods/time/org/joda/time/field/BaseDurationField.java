protected BaseDurationField(DurationFieldType type) { [EOL]     super(); [EOL]     if (type == null) { [EOL]         throw new IllegalArgumentException("The type must not be null"); [EOL]     } [EOL]     iType = type; [EOL] } <line_num>: 46,52
public final DurationFieldType getType() { [EOL]     return iType; [EOL] } <line_num>: 54,56
public final String getName() { [EOL]     return iType.getName(); [EOL] } <line_num>: 58,60
public final boolean isSupported() { [EOL]     return true; [EOL] } <line_num>: 65,67
public int getValue(long duration) { [EOL]     return FieldUtils.safeToInt(getValueAsLong(duration)); [EOL] } <line_num>: 78,80
public long getValueAsLong(long duration) { [EOL]     return duration / getUnitMillis(); [EOL] } <line_num>: 90,92
public int getValue(long duration, long instant) { [EOL]     return FieldUtils.safeToInt(getValueAsLong(duration, instant)); [EOL] } <line_num>: 110,112
public long getMillis(int value) { [EOL]     return value * getUnitMillis(); [EOL] } <line_num>: 122,124
public long getMillis(long value) { [EOL]     return FieldUtils.safeMultiply(value, getUnitMillis()); [EOL] } <line_num>: 134,136
public int getDifference(long minuendInstant, long subtrahendInstant) { [EOL]     return FieldUtils.safeToInt(getDifferenceAsLong(minuendInstant, subtrahendInstant)); [EOL] } <line_num>: 140,142
public int compareTo(DurationField otherField) { [EOL]     long otherMillis = otherField.getUnitMillis(); [EOL]     long thisMillis = getUnitMillis(); [EOL]     if (thisMillis == otherMillis) { [EOL]         return 0; [EOL]     } [EOL]     if (thisMillis < otherMillis) { [EOL]         return -1; [EOL]     } else { [EOL]         return 1; [EOL]     } [EOL] } <line_num>: 145,157
public String toString() { [EOL]     return "DurationField[" + getName() + ']'; [EOL] } <line_num>: 164,166
