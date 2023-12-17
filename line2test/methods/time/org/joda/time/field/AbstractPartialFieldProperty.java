protected AbstractPartialFieldProperty() { [EOL]     super(); [EOL] } <line_num>: 42,44
public abstract DateTimeField getField(); <line_num>: 52,52
public DateTimeFieldType getFieldType() { [EOL]     return getField().getType(); [EOL] } <line_num>: 59,61
public String getName() { [EOL]     return getField().getName(); [EOL] } <line_num>: 68,70
protected abstract ReadablePartial getReadablePartial(); <line_num>: 77,77
public abstract int get(); <line_num>: 91,91
public String getAsString() { [EOL]     return Integer.toString(get()); [EOL] } <line_num>: 105,107
public String getAsText() { [EOL]     return getAsText(null); [EOL] } <line_num>: 120,122
public String getAsText(Locale locale) { [EOL]     return getField().getAsText(getReadablePartial(), get(), locale); [EOL] } <line_num>: 136,138
public String getAsShortText() { [EOL]     return getAsShortText(null); [EOL] } <line_num>: 151,153
public String getAsShortText(Locale locale) { [EOL]     return getField().getAsShortText(getReadablePartial(), get(), locale); [EOL] } <line_num>: 167,169
public DurationField getDurationField() { [EOL]     return getField().getDurationField(); [EOL] } <line_num>: 178,180
public DurationField getRangeDurationField() { [EOL]     return getField().getRangeDurationField(); [EOL] } <line_num>: 188,190
public int getMinimumValueOverall() { [EOL]     return getField().getMinimumValue(); [EOL] } <line_num>: 199,201
public int getMinimumValue() { [EOL]     return getField().getMinimumValue(getReadablePartial()); [EOL] } <line_num>: 209,211
public int getMaximumValueOverall() { [EOL]     return getField().getMaximumValue(); [EOL] } <line_num>: 219,221
public int getMaximumValue() { [EOL]     return getField().getMaximumValue(getReadablePartial()); [EOL] } <line_num>: 229,231
public int getMaximumTextLength(Locale locale) { [EOL]     return getField().getMaximumTextLength(locale); [EOL] } <line_num>: 241,243
public int getMaximumShortTextLength(Locale locale) { [EOL]     return getField().getMaximumShortTextLength(locale); [EOL] } <line_num>: 252,254
public int compareTo(ReadableInstant instant) { [EOL]     if (instant == null) { [EOL]         throw new IllegalArgumentException("The instant must not be null"); [EOL]     } [EOL]     int thisValue = get(); [EOL]     int otherValue = instant.get(getFieldType()); [EOL]     if (thisValue < otherValue) { [EOL]         return -1; [EOL]     } else if (thisValue > otherValue) { [EOL]         return 1; [EOL]     } else { [EOL]         return 0; [EOL]     } [EOL] } <line_num>: 270,283
public int compareTo(ReadablePartial partial) { [EOL]     if (partial == null) { [EOL]         throw new IllegalArgumentException("The instant must not be null"); [EOL]     } [EOL]     int thisValue = get(); [EOL]     int otherValue = partial.get(getFieldType()); [EOL]     if (thisValue < otherValue) { [EOL]         return -1; [EOL]     } else if (thisValue > otherValue) { [EOL]         return 1; [EOL]     } else { [EOL]         return 0; [EOL]     } [EOL] } <line_num>: 299,312
public boolean equals(Object object) { [EOL]     if (this == object) { [EOL]         return true; [EOL]     } [EOL]     if (object instanceof AbstractPartialFieldProperty == false) { [EOL]         return false; [EOL]     } [EOL]     AbstractPartialFieldProperty other = (AbstractPartialFieldProperty) object; [EOL]     return get() == other.get() && getFieldType() == other.getFieldType() && FieldUtils.equals(getReadablePartial().getChronology(), other.getReadablePartial().getChronology()); [EOL] } <line_num>: 321,333
public int hashCode() { [EOL]     int hash = 19; [EOL]     hash = 13 * hash + get(); [EOL]     hash = 13 * hash + getFieldType().hashCode(); [EOL]     hash = 13 * hash + getReadablePartial().getChronology().hashCode(); [EOL]     return hash; [EOL] } <line_num>: 342,348
public String toString() { [EOL]     return "Property[" + getName() + "]"; [EOL] } <line_num>: 356,358
