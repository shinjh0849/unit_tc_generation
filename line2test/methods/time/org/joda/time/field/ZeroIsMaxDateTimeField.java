public ZeroIsMaxDateTimeField(DateTimeField field, DateTimeFieldType type) { [EOL]     super(field, type); [EOL]     if (field.getMinimumValue() != 0) { [EOL]         throw new IllegalArgumentException("Wrapped field's minumum value must be zero"); [EOL]     } [EOL] } <line_num>: 45,50
public int get(long instant) { [EOL]     int value = getWrappedField().get(instant); [EOL]     if (value == 0) { [EOL]         value = getMaximumValue(); [EOL]     } [EOL]     return value; [EOL] } <line_num>: 52,58
public long add(long instant, int value) { [EOL]     return getWrappedField().add(instant, value); [EOL] } <line_num>: 60,62
public long add(long instant, long value) { [EOL]     return getWrappedField().add(instant, value); [EOL] } <line_num>: 64,66
public long addWrapField(long instant, int value) { [EOL]     return getWrappedField().addWrapField(instant, value); [EOL] } <line_num>: 68,70
public int[] addWrapField(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) { [EOL]     return getWrappedField().addWrapField(instant, fieldIndex, values, valueToAdd); [EOL] } <line_num>: 72,74
public int getDifference(long minuendInstant, long subtrahendInstant) { [EOL]     return getWrappedField().getDifference(minuendInstant, subtrahendInstant); [EOL] } <line_num>: 76,78
public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) { [EOL]     return getWrappedField().getDifferenceAsLong(minuendInstant, subtrahendInstant); [EOL] } <line_num>: 80,82
public long set(long instant, int value) { [EOL]     int max = getMaximumValue(); [EOL]     FieldUtils.verifyValueBounds(this, value, 1, max); [EOL]     if (value == max) { [EOL]         value = 0; [EOL]     } [EOL]     return getWrappedField().set(instant, value); [EOL] } <line_num>: 84,91
public boolean isLeap(long instant) { [EOL]     return getWrappedField().isLeap(instant); [EOL] } <line_num>: 93,95
public int getLeapAmount(long instant) { [EOL]     return getWrappedField().getLeapAmount(instant); [EOL] } <line_num>: 97,99
public DurationField getLeapDurationField() { [EOL]     return getWrappedField().getLeapDurationField(); [EOL] } <line_num>: 101,103
public int getMinimumValue() { [EOL]     return 1; [EOL] } <line_num>: 110,112
public int getMinimumValue(long instant) { [EOL]     return 1; [EOL] } <line_num>: 119,121
public int getMinimumValue(ReadablePartial instant) { [EOL]     return 1; [EOL] } <line_num>: 128,130
public int getMinimumValue(ReadablePartial instant, int[] values) { [EOL]     return 1; [EOL] } <line_num>: 137,139
public int getMaximumValue() { [EOL]     return getWrappedField().getMaximumValue() + 1; [EOL] } <line_num>: 147,149
public int getMaximumValue(long instant) { [EOL]     return getWrappedField().getMaximumValue(instant) + 1; [EOL] } <line_num>: 157,159
public int getMaximumValue(ReadablePartial instant) { [EOL]     return getWrappedField().getMaximumValue(instant) + 1; [EOL] } <line_num>: 167,169
public int getMaximumValue(ReadablePartial instant, int[] values) { [EOL]     return getWrappedField().getMaximumValue(instant, values) + 1; [EOL] } <line_num>: 177,179
public long roundFloor(long instant) { [EOL]     return getWrappedField().roundFloor(instant); [EOL] } <line_num>: 181,183
public long roundCeiling(long instant) { [EOL]     return getWrappedField().roundCeiling(instant); [EOL] } <line_num>: 185,187
public long roundHalfFloor(long instant) { [EOL]     return getWrappedField().roundHalfFloor(instant); [EOL] } <line_num>: 189,191
public long roundHalfCeiling(long instant) { [EOL]     return getWrappedField().roundHalfCeiling(instant); [EOL] } <line_num>: 193,195
public long roundHalfEven(long instant) { [EOL]     return getWrappedField().roundHalfEven(instant); [EOL] } <line_num>: 197,199
public long remainder(long instant) { [EOL]     return getWrappedField().remainder(instant); [EOL] } <line_num>: 201,203
