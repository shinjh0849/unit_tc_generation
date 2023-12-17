protected DelegatedDurationField(DurationField field) { [EOL]     this(field, null); [EOL] } <line_num>: 49,51
protected DelegatedDurationField(DurationField field, DurationFieldType type) { [EOL]     super(); [EOL]     if (field == null) { [EOL]         throw new IllegalArgumentException("The field must not be null"); [EOL]     } [EOL]     iField = field; [EOL]     iType = (type == null ? field.getType() : type); [EOL] } <line_num>: 59,66
public final DurationField getWrappedField() { [EOL]     return iField; [EOL] } <line_num>: 74,76
public DurationFieldType getType() { [EOL]     return iType; [EOL] } <line_num>: 78,80
public String getName() { [EOL]     return iType.getName(); [EOL] } <line_num>: 82,84
public boolean isSupported() { [EOL]     return iField.isSupported(); [EOL] } <line_num>: 89,91
public boolean isPrecise() { [EOL]     return iField.isPrecise(); [EOL] } <line_num>: 93,95
public int getValue(long duration) { [EOL]     return iField.getValue(duration); [EOL] } <line_num>: 97,99
public long getValueAsLong(long duration) { [EOL]     return iField.getValueAsLong(duration); [EOL] } <line_num>: 101,103
public int getValue(long duration, long instant) { [EOL]     return iField.getValue(duration, instant); [EOL] } <line_num>: 105,107
public long getValueAsLong(long duration, long instant) { [EOL]     return iField.getValueAsLong(duration, instant); [EOL] } <line_num>: 109,111
public long getMillis(int value) { [EOL]     return iField.getMillis(value); [EOL] } <line_num>: 113,115
public long getMillis(long value) { [EOL]     return iField.getMillis(value); [EOL] } <line_num>: 117,119
public long getMillis(int value, long instant) { [EOL]     return iField.getMillis(value, instant); [EOL] } <line_num>: 121,123
public long getMillis(long value, long instant) { [EOL]     return iField.getMillis(value, instant); [EOL] } <line_num>: 125,127
public long add(long instant, int value) { [EOL]     return iField.add(instant, value); [EOL] } <line_num>: 129,131
public long add(long instant, long value) { [EOL]     return iField.add(instant, value); [EOL] } <line_num>: 133,135
public int getDifference(long minuendInstant, long subtrahendInstant) { [EOL]     return iField.getDifference(minuendInstant, subtrahendInstant); [EOL] } <line_num>: 137,139
public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) { [EOL]     return iField.getDifferenceAsLong(minuendInstant, subtrahendInstant); [EOL] } <line_num>: 141,143
public long getUnitMillis() { [EOL]     return iField.getUnitMillis(); [EOL] } <line_num>: 145,147
public int compareTo(DurationField durationField) { [EOL]     return iField.compareTo(durationField); [EOL] } <line_num>: 149,151
public boolean equals(Object obj) { [EOL]     if (obj instanceof DelegatedDurationField) { [EOL]         return iField.equals(((DelegatedDurationField) obj).iField); [EOL]     } [EOL]     return false; [EOL] } <line_num>: 153,158
public int hashCode() { [EOL]     return iField.hashCode() ^ iType.hashCode(); [EOL] } <line_num>: 160,162
public String toString() { [EOL]     return (iType == null) ? iField.toString() : ("DurationField[" + iType + ']'); [EOL] } <line_num>: 164,167
