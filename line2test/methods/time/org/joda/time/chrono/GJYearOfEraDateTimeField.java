GJYearOfEraDateTimeField(DateTimeField yearField, BasicChronology chronology) { [EOL]     super(yearField, DateTimeFieldType.yearOfEra()); [EOL]     iChronology = chronology; [EOL] } <line_num>: 41,44
@Override [EOL] public DurationField getRangeDurationField() { [EOL]     return iChronology.eras(); [EOL] } <line_num>: 46,49
public int get(long instant) { [EOL]     int year = getWrappedField().get(instant); [EOL]     if (year <= 0) { [EOL]         year = 1 - year; [EOL]     } [EOL]     return year; [EOL] } <line_num>: 51,57
public long add(long instant, int years) { [EOL]     return getWrappedField().add(instant, years); [EOL] } <line_num>: 59,61
public long add(long instant, long years) { [EOL]     return getWrappedField().add(instant, years); [EOL] } <line_num>: 63,65
public long addWrapField(long instant, int years) { [EOL]     return getWrappedField().addWrapField(instant, years); [EOL] } <line_num>: 67,69
public int[] addWrapField(ReadablePartial instant, int fieldIndex, int[] values, int years) { [EOL]     return getWrappedField().addWrapField(instant, fieldIndex, values, years); [EOL] } <line_num>: 71,73
public int getDifference(long minuendInstant, long subtrahendInstant) { [EOL]     return getWrappedField().getDifference(minuendInstant, subtrahendInstant); [EOL] } <line_num>: 75,77
public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) { [EOL]     return getWrappedField().getDifferenceAsLong(minuendInstant, subtrahendInstant); [EOL] } <line_num>: 79,81
public long set(long instant, int year) { [EOL]     FieldUtils.verifyValueBounds(this, year, 1, getMaximumValue()); [EOL]     if (iChronology.getYear(instant) <= 0) { [EOL]         year = 1 - year; [EOL]     } [EOL]     return super.set(instant, year); [EOL] } <line_num>: 91,97
public int getMinimumValue() { [EOL]     return 1; [EOL] } <line_num>: 99,101
public int getMaximumValue() { [EOL]     return getWrappedField().getMaximumValue(); [EOL] } <line_num>: 103,105
public long roundFloor(long instant) { [EOL]     return getWrappedField().roundFloor(instant); [EOL] } <line_num>: 107,109
public long roundCeiling(long instant) { [EOL]     return getWrappedField().roundCeiling(instant); [EOL] } <line_num>: 111,113
public long remainder(long instant) { [EOL]     return getWrappedField().remainder(instant); [EOL] } <line_num>: 115,117
private Object readResolve() { [EOL]     return iChronology.yearOfEra(); [EOL] } <line_num>: 122,124
