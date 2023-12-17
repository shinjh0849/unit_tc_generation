public OffsetDateTimeField(DateTimeField field, int offset) { [EOL]     this(field, (field == null ? null : field.getType()), offset, Integer.MIN_VALUE, Integer.MAX_VALUE); [EOL] } <line_num>: 46,48
public OffsetDateTimeField(DateTimeField field, DateTimeFieldType type, int offset) { [EOL]     this(field, type, offset, Integer.MIN_VALUE, Integer.MAX_VALUE); [EOL] } <line_num>: 58,60
public OffsetDateTimeField(DateTimeField field, DateTimeFieldType type, int offset, int minValue, int maxValue) { [EOL]     super(field, type); [EOL]     if (offset == 0) { [EOL]         throw new IllegalArgumentException("The offset cannot be zero"); [EOL]     } [EOL]     iOffset = offset; [EOL]     if (minValue < (field.getMinimumValue() + offset)) { [EOL]         iMin = field.getMinimumValue() + offset; [EOL]     } else { [EOL]         iMin = minValue; [EOL]     } [EOL]     if (maxValue > (field.getMaximumValue() + offset)) { [EOL]         iMax = field.getMaximumValue() + offset; [EOL]     } else { [EOL]         iMax = maxValue; [EOL]     } [EOL] } <line_num>: 72,92
public int get(long instant) { [EOL]     return super.get(instant) + iOffset; [EOL] } <line_num>: 100,102
public long add(long instant, int amount) { [EOL]     instant = super.add(instant, amount); [EOL]     FieldUtils.verifyValueBounds(this, get(instant), iMin, iMax); [EOL]     return instant; [EOL] } <line_num>: 112,116
public long add(long instant, long amount) { [EOL]     instant = super.add(instant, amount); [EOL]     FieldUtils.verifyValueBounds(this, get(instant), iMin, iMax); [EOL]     return instant; [EOL] } <line_num>: 126,130
public long addWrapField(long instant, int amount) { [EOL]     return set(instant, FieldUtils.getWrappedValue(get(instant), amount, iMin, iMax)); [EOL] } <line_num>: 140,142
public long set(long instant, int value) { [EOL]     FieldUtils.verifyValueBounds(this, value, iMin, iMax); [EOL]     return super.set(instant, value - iOffset); [EOL] } <line_num>: 152,155
public boolean isLeap(long instant) { [EOL]     return getWrappedField().isLeap(instant); [EOL] } <line_num>: 157,159
public int getLeapAmount(long instant) { [EOL]     return getWrappedField().getLeapAmount(instant); [EOL] } <line_num>: 161,163
public DurationField getLeapDurationField() { [EOL]     return getWrappedField().getLeapDurationField(); [EOL] } <line_num>: 165,167
public int getMinimumValue() { [EOL]     return iMin; [EOL] } <line_num>: 174,176
public int getMaximumValue() { [EOL]     return iMax; [EOL] } <line_num>: 183,185
public long roundFloor(long instant) { [EOL]     return getWrappedField().roundFloor(instant); [EOL] } <line_num>: 187,189
public long roundCeiling(long instant) { [EOL]     return getWrappedField().roundCeiling(instant); [EOL] } <line_num>: 191,193
public long roundHalfFloor(long instant) { [EOL]     return getWrappedField().roundHalfFloor(instant); [EOL] } <line_num>: 195,197
public long roundHalfCeiling(long instant) { [EOL]     return getWrappedField().roundHalfCeiling(instant); [EOL] } <line_num>: 199,201
public long roundHalfEven(long instant) { [EOL]     return getWrappedField().roundHalfEven(instant); [EOL] } <line_num>: 203,205
public long remainder(long instant) { [EOL]     return getWrappedField().remainder(instant); [EOL] } <line_num>: 207,209
public int getOffset() { [EOL]     return iOffset; [EOL] } <line_num>: 216,218
