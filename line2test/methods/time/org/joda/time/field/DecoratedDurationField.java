public DecoratedDurationField(DurationField field, DurationFieldType type) { [EOL]     super(type); [EOL]     if (field == null) { [EOL]         throw new IllegalArgumentException("The field must not be null"); [EOL]     } [EOL]     if (!field.isSupported()) { [EOL]         throw new IllegalArgumentException("The field must be supported"); [EOL]     } [EOL]     iField = field; [EOL] } <line_num>: 51,60
public final DurationField getWrappedField() { [EOL]     return iField; [EOL] } <line_num>: 68,70
public boolean isPrecise() { [EOL]     return iField.isPrecise(); [EOL] } <line_num>: 72,74
public long getValueAsLong(long duration, long instant) { [EOL]     return iField.getValueAsLong(duration, instant); [EOL] } <line_num>: 76,78
public long getMillis(int value, long instant) { [EOL]     return iField.getMillis(value, instant); [EOL] } <line_num>: 80,82
public long getMillis(long value, long instant) { [EOL]     return iField.getMillis(value, instant); [EOL] } <line_num>: 84,86
public long add(long instant, int value) { [EOL]     return iField.add(instant, value); [EOL] } <line_num>: 88,90
public long add(long instant, long value) { [EOL]     return iField.add(instant, value); [EOL] } <line_num>: 92,94
public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) { [EOL]     return iField.getDifferenceAsLong(minuendInstant, subtrahendInstant); [EOL] } <line_num>: 96,98
public long getUnitMillis() { [EOL]     return iField.getUnitMillis(); [EOL] } <line_num>: 100,102
