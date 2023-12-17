public ScaledDurationField(DurationField field, DurationFieldType type, int scalar) { [EOL]     super(field, type); [EOL]     if (scalar == 0 || scalar == 1) { [EOL]         throw new IllegalArgumentException("The scalar must not be 0 or 1"); [EOL]     } [EOL]     iScalar = scalar; [EOL] } <line_num>: 46,52
public int getValue(long duration) { [EOL]     return getWrappedField().getValue(duration) / iScalar; [EOL] } <line_num>: 54,56
public long getValueAsLong(long duration) { [EOL]     return getWrappedField().getValueAsLong(duration) / iScalar; [EOL] } <line_num>: 58,60
public int getValue(long duration, long instant) { [EOL]     return getWrappedField().getValue(duration, instant) / iScalar; [EOL] } <line_num>: 62,64
public long getValueAsLong(long duration, long instant) { [EOL]     return getWrappedField().getValueAsLong(duration, instant) / iScalar; [EOL] } <line_num>: 66,68
public long getMillis(int value) { [EOL]     long scaled = ((long) value) * ((long) iScalar); [EOL]     return getWrappedField().getMillis(scaled); [EOL] } <line_num>: 70,73
public long getMillis(long value) { [EOL]     long scaled = FieldUtils.safeMultiply(value, iScalar); [EOL]     return getWrappedField().getMillis(scaled); [EOL] } <line_num>: 75,78
public long getMillis(int value, long instant) { [EOL]     long scaled = ((long) value) * ((long) iScalar); [EOL]     return getWrappedField().getMillis(scaled, instant); [EOL] } <line_num>: 80,83
public long getMillis(long value, long instant) { [EOL]     long scaled = FieldUtils.safeMultiply(value, iScalar); [EOL]     return getWrappedField().getMillis(scaled, instant); [EOL] } <line_num>: 85,88
public long add(long instant, int value) { [EOL]     long scaled = ((long) value) * ((long) iScalar); [EOL]     return getWrappedField().add(instant, scaled); [EOL] } <line_num>: 90,93
public long add(long instant, long value) { [EOL]     long scaled = FieldUtils.safeMultiply(value, iScalar); [EOL]     return getWrappedField().add(instant, scaled); [EOL] } <line_num>: 95,98
public int getDifference(long minuendInstant, long subtrahendInstant) { [EOL]     return getWrappedField().getDifference(minuendInstant, subtrahendInstant) / iScalar; [EOL] } <line_num>: 100,102
public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) { [EOL]     return getWrappedField().getDifferenceAsLong(minuendInstant, subtrahendInstant) / iScalar; [EOL] } <line_num>: 104,106
public long getUnitMillis() { [EOL]     return getWrappedField().getUnitMillis() * iScalar; [EOL] } <line_num>: 108,110
public int getScalar() { [EOL]     return iScalar; [EOL] } <line_num>: 118,120
public boolean equals(Object obj) { [EOL]     if (this == obj) { [EOL]         return true; [EOL]     } else if (obj instanceof ScaledDurationField) { [EOL]         ScaledDurationField other = (ScaledDurationField) obj; [EOL]         return (getWrappedField().equals(other.getWrappedField())) && (getType() == other.getType()) && (iScalar == other.iScalar); [EOL]     } [EOL]     return false; [EOL] } <line_num>: 129,139
public int hashCode() { [EOL]     long scalar = iScalar; [EOL]     int hash = (int) (scalar ^ (scalar >>> 32)); [EOL]     hash += getType().hashCode(); [EOL]     hash += getWrappedField().hashCode(); [EOL]     return hash; [EOL] } <line_num>: 146,152
