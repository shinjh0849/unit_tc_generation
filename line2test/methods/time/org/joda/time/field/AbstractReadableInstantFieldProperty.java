public AbstractReadableInstantFieldProperty() { [EOL]     super(); [EOL] } <line_num>: 54,56
public abstract DateTimeField getField(); <line_num>: 64,64
public DateTimeFieldType getFieldType() { [EOL]     return getField().getType(); [EOL] } <line_num>: 71,73
public String getName() { [EOL]     return getField().getName(); [EOL] } <line_num>: 80,82
protected abstract long getMillis(); <line_num>: 89,89
protected Chronology getChronology() { [EOL]     throw new UnsupportedOperationException("The method getChronology() was added in v1.4 and needs " + "to be implemented by subclasses of AbstractReadableInstantFieldProperty"); [EOL] } <line_num>: 100,104
public int get() { [EOL]     return getField().get(getMillis()); [EOL] } <line_num>: 119,121
public String getAsString() { [EOL]     return Integer.toString(get()); [EOL] } <line_num>: 135,137
public String getAsText() { [EOL]     return getAsText(null); [EOL] } <line_num>: 150,152
public String getAsText(Locale locale) { [EOL]     return getField().getAsText(getMillis(), locale); [EOL] } <line_num>: 166,168
public String getAsShortText() { [EOL]     return getAsShortText(null); [EOL] } <line_num>: 181,183
public String getAsShortText(Locale locale) { [EOL]     return getField().getAsShortText(getMillis(), locale); [EOL] } <line_num>: 197,199
public int getDifference(ReadableInstant instant) { [EOL]     if (instant == null) { [EOL]         return getField().getDifference(getMillis(), DateTimeUtils.currentTimeMillis()); [EOL]     } [EOL]     return getField().getDifference(getMillis(), instant.getMillis()); [EOL] } <line_num>: 212,217
public long getDifferenceAsLong(ReadableInstant instant) { [EOL]     if (instant == null) { [EOL]         return getField().getDifferenceAsLong(getMillis(), DateTimeUtils.currentTimeMillis()); [EOL]     } [EOL]     return getField().getDifferenceAsLong(getMillis(), instant.getMillis()); [EOL] } <line_num>: 229,234
public DurationField getDurationField() { [EOL]     return getField().getDurationField(); [EOL] } <line_num>: 243,245
public DurationField getRangeDurationField() { [EOL]     return getField().getRangeDurationField(); [EOL] } <line_num>: 253,255
public boolean isLeap() { [EOL]     return getField().isLeap(getMillis()); [EOL] } <line_num>: 263,265
public int getLeapAmount() { [EOL]     return getField().getLeapAmount(getMillis()); [EOL] } <line_num>: 273,275
public DurationField getLeapDurationField() { [EOL]     return getField().getLeapDurationField(); [EOL] } <line_num>: 281,283
public int getMinimumValueOverall() { [EOL]     return getField().getMinimumValue(); [EOL] } <line_num>: 292,294
public int getMinimumValue() { [EOL]     return getField().getMinimumValue(getMillis()); [EOL] } <line_num>: 302,304
public int getMaximumValueOverall() { [EOL]     return getField().getMaximumValue(); [EOL] } <line_num>: 312,314
public int getMaximumValue() { [EOL]     return getField().getMaximumValue(getMillis()); [EOL] } <line_num>: 322,324
public int getMaximumTextLength(Locale locale) { [EOL]     return getField().getMaximumTextLength(locale); [EOL] } <line_num>: 333,335
public int getMaximumShortTextLength(Locale locale) { [EOL]     return getField().getMaximumShortTextLength(locale); [EOL] } <line_num>: 344,346
public long remainder() { [EOL]     return getField().remainder(getMillis()); [EOL] } <line_num>: 355,357
public Interval toInterval() { [EOL]     DateTimeField field = getField(); [EOL]     long start = field.roundFloor(getMillis()); [EOL]     long end = field.add(start, 1); [EOL]     Interval interval = new Interval(start, end); [EOL]     return interval; [EOL] } <line_num>: 369,375
public int compareTo(ReadableInstant instant) { [EOL]     if (instant == null) { [EOL]         throw new IllegalArgumentException("The instant must not be null"); [EOL]     } [EOL]     int thisValue = get(); [EOL]     int otherValue = instant.get(getFieldType()); [EOL]     if (thisValue < otherValue) { [EOL]         return -1; [EOL]     } else if (thisValue > otherValue) { [EOL]         return 1; [EOL]     } else { [EOL]         return 0; [EOL]     } [EOL] } <line_num>: 390,403
public int compareTo(ReadablePartial partial) { [EOL]     if (partial == null) { [EOL]         throw new IllegalArgumentException("The partial must not be null"); [EOL]     } [EOL]     int thisValue = get(); [EOL]     int otherValue = partial.get(getFieldType()); [EOL]     if (thisValue < otherValue) { [EOL]         return -1; [EOL]     } else if (thisValue > otherValue) { [EOL]         return 1; [EOL]     } else { [EOL]         return 0; [EOL]     } [EOL] } <line_num>: 419,432
public boolean equals(Object object) { [EOL]     if (this == object) { [EOL]         return true; [EOL]     } [EOL]     if (object instanceof AbstractReadableInstantFieldProperty == false) { [EOL]         return false; [EOL]     } [EOL]     AbstractReadableInstantFieldProperty other = (AbstractReadableInstantFieldProperty) object; [EOL]     return get() == other.get() && getFieldType().equals(other.getFieldType()) && FieldUtils.equals(getChronology(), other.getChronology()); [EOL] } <line_num>: 441,453
public int hashCode() { [EOL]     return get() * 17 + getFieldType().hashCode() + getChronology().hashCode(); [EOL] } <line_num>: 460,462
public String toString() { [EOL]     return "Property[" + getName() + "]"; [EOL] } <line_num>: 470,472
