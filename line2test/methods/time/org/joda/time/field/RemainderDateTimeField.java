public RemainderDateTimeField(DateTimeField field, DateTimeFieldType type, int divisor) { [EOL]     super(field, type); [EOL]     if (divisor < 2) { [EOL]         throw new IllegalArgumentException("The divisor must be at least 2"); [EOL]     } [EOL]     DurationField rangeField = field.getDurationField(); [EOL]     if (rangeField == null) { [EOL]         iRangeField = null; [EOL]     } else { [EOL]         iRangeField = new ScaledDurationField(rangeField, type.getRangeDurationType(), divisor); [EOL]     } [EOL]     iDurationField = field.getDurationField(); [EOL]     iDivisor = divisor; [EOL] } <line_num>: 52,69
public RemainderDateTimeField(DateTimeField field, DurationField rangeField, DateTimeFieldType type, int divisor) { [EOL]     super(field, type); [EOL]     if (divisor < 2) { [EOL]         throw new IllegalArgumentException("The divisor must be at least 2"); [EOL]     } [EOL]     iRangeField = rangeField; [EOL]     iDurationField = field.getDurationField(); [EOL]     iDivisor = divisor; [EOL] } <line_num>: 80,89
public RemainderDateTimeField(DividedDateTimeField dividedField) { [EOL]     this(dividedField, dividedField.getType()); [EOL] } <line_num>: 97,99
public RemainderDateTimeField(DividedDateTimeField dividedField, DateTimeFieldType type) { [EOL]     this(dividedField, dividedField.getWrappedField().getDurationField(), type); [EOL] } <line_num>: 108,110
public RemainderDateTimeField(DividedDateTimeField dividedField, DurationField durationField, DateTimeFieldType type) { [EOL]     super(dividedField.getWrappedField(), type); [EOL]     iDivisor = dividedField.iDivisor; [EOL]     iDurationField = durationField; [EOL]     iRangeField = dividedField.iDurationField; [EOL] } <line_num>: 121,126
public int get(long instant) { [EOL]     int value = getWrappedField().get(instant); [EOL]     if (value >= 0) { [EOL]         return value % iDivisor; [EOL]     } else { [EOL]         return (iDivisor - 1) + ((value + 1) % iDivisor); [EOL]     } [EOL] } <line_num>: 135,142
public long addWrapField(long instant, int amount) { [EOL]     return set(instant, FieldUtils.getWrappedValue(get(instant), amount, 0, iDivisor - 1)); [EOL] } <line_num>: 153,155
public long set(long instant, int value) { [EOL]     FieldUtils.verifyValueBounds(this, value, 0, iDivisor - 1); [EOL]     int divided = getDivided(getWrappedField().get(instant)); [EOL]     return getWrappedField().set(instant, divided * iDivisor + value); [EOL] } <line_num>: 165,169
@Override [EOL] public DurationField getDurationField() { [EOL]     return iDurationField; [EOL] } <line_num>: 171,174
public DurationField getRangeDurationField() { [EOL]     return iRangeField; [EOL] } <line_num>: 179,181
public int getMinimumValue() { [EOL]     return 0; [EOL] } <line_num>: 188,190
public int getMaximumValue() { [EOL]     return iDivisor - 1; [EOL] } <line_num>: 198,200
public long roundFloor(long instant) { [EOL]     return getWrappedField().roundFloor(instant); [EOL] } <line_num>: 202,204
public long roundCeiling(long instant) { [EOL]     return getWrappedField().roundCeiling(instant); [EOL] } <line_num>: 206,208
public long roundHalfFloor(long instant) { [EOL]     return getWrappedField().roundHalfFloor(instant); [EOL] } <line_num>: 210,212
public long roundHalfCeiling(long instant) { [EOL]     return getWrappedField().roundHalfCeiling(instant); [EOL] } <line_num>: 214,216
public long roundHalfEven(long instant) { [EOL]     return getWrappedField().roundHalfEven(instant); [EOL] } <line_num>: 218,220
public long remainder(long instant) { [EOL]     return getWrappedField().remainder(instant); [EOL] } <line_num>: 222,224
public int getDivisor() { [EOL]     return iDivisor; [EOL] } <line_num>: 231,233
private int getDivided(int value) { [EOL]     if (value >= 0) { [EOL]         return value / iDivisor; [EOL]     } else { [EOL]         return ((value + 1) / iDivisor) - 1; [EOL]     } [EOL] } <line_num>: 235,241
