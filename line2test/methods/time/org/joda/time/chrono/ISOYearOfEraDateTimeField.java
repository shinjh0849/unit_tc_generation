private ISOYearOfEraDateTimeField() { [EOL]     super(GregorianChronology.getInstanceUTC().year(), DateTimeFieldType.yearOfEra()); [EOL] } <line_num>: 47,49
@Override [EOL] public DurationField getRangeDurationField() { [EOL]     return GregorianChronology.getInstanceUTC().eras(); [EOL] } <line_num>: 51,54
public int get(long instant) { [EOL]     int year = getWrappedField().get(instant); [EOL]     return year < 0 ? -year : year; [EOL] } <line_num>: 56,59
public long add(long instant, int years) { [EOL]     return getWrappedField().add(instant, years); [EOL] } <line_num>: 61,63
public long add(long instant, long years) { [EOL]     return getWrappedField().add(instant, years); [EOL] } <line_num>: 65,67
public long addWrapField(long instant, int years) { [EOL]     return getWrappedField().addWrapField(instant, years); [EOL] } <line_num>: 69,71
public int[] addWrapField(ReadablePartial instant, int fieldIndex, int[] values, int years) { [EOL]     return getWrappedField().addWrapField(instant, fieldIndex, values, years); [EOL] } <line_num>: 73,75
public int getDifference(long minuendInstant, long subtrahendInstant) { [EOL]     return getWrappedField().getDifference(minuendInstant, subtrahendInstant); [EOL] } <line_num>: 77,79
public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) { [EOL]     return getWrappedField().getDifferenceAsLong(minuendInstant, subtrahendInstant); [EOL] } <line_num>: 81,83
public long set(long instant, int year) { [EOL]     FieldUtils.verifyValueBounds(this, year, 0, getMaximumValue()); [EOL]     if (getWrappedField().get(instant) < 0) { [EOL]         year = -year; [EOL]     } [EOL]     return super.set(instant, year); [EOL] } <line_num>: 85,91
public int getMinimumValue() { [EOL]     return 0; [EOL] } <line_num>: 93,95
public int getMaximumValue() { [EOL]     return getWrappedField().getMaximumValue(); [EOL] } <line_num>: 97,99
public long roundFloor(long instant) { [EOL]     return getWrappedField().roundFloor(instant); [EOL] } <line_num>: 101,103
public long roundCeiling(long instant) { [EOL]     return getWrappedField().roundCeiling(instant); [EOL] } <line_num>: 105,107
public long remainder(long instant) { [EOL]     return getWrappedField().remainder(instant); [EOL] } <line_num>: 109,111
private Object readResolve() { [EOL]     return INSTANCE; [EOL] } <line_num>: 116,118
