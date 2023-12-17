public DelegatedDateTimeField(DateTimeField field) { [EOL]     this(field, null); [EOL] } <line_num>: 53,55
public DelegatedDateTimeField(DateTimeField field, DateTimeFieldType type) { [EOL]     this(field, null, type); [EOL] } <line_num>: 63,65
public DelegatedDateTimeField(DateTimeField field, DurationField rangeField, DateTimeFieldType type) { [EOL]     super(); [EOL]     if (field == null) { [EOL]         throw new IllegalArgumentException("The field must not be null"); [EOL]     } [EOL]     iField = field; [EOL]     iRangeDurationField = rangeField; [EOL]     iType = (type == null ? field.getType() : type); [EOL] } <line_num>: 74,82
public final DateTimeField getWrappedField() { [EOL]     return iField; [EOL] } <line_num>: 89,91
public DateTimeFieldType getType() { [EOL]     return iType; [EOL] } <line_num>: 93,95
public String getName() { [EOL]     return iType.getName(); [EOL] } <line_num>: 97,99
public boolean isSupported() { [EOL]     return iField.isSupported(); [EOL] } <line_num>: 101,103
public boolean isLenient() { [EOL]     return iField.isLenient(); [EOL] } <line_num>: 105,107
public int get(long instant) { [EOL]     return iField.get(instant); [EOL] } <line_num>: 109,111
public String getAsText(long instant, Locale locale) { [EOL]     return iField.getAsText(instant, locale); [EOL] } <line_num>: 113,115
public String getAsText(long instant) { [EOL]     return iField.getAsText(instant); [EOL] } <line_num>: 117,119
public String getAsText(ReadablePartial partial, int fieldValue, Locale locale) { [EOL]     return iField.getAsText(partial, fieldValue, locale); [EOL] } <line_num>: 121,123
public String getAsText(ReadablePartial partial, Locale locale) { [EOL]     return iField.getAsText(partial, locale); [EOL] } <line_num>: 125,127
public String getAsText(int fieldValue, Locale locale) { [EOL]     return iField.getAsText(fieldValue, locale); [EOL] } <line_num>: 129,131
public String getAsShortText(long instant, Locale locale) { [EOL]     return iField.getAsShortText(instant, locale); [EOL] } <line_num>: 133,135
public String getAsShortText(long instant) { [EOL]     return iField.getAsShortText(instant); [EOL] } <line_num>: 137,139
public String getAsShortText(ReadablePartial partial, int fieldValue, Locale locale) { [EOL]     return iField.getAsShortText(partial, fieldValue, locale); [EOL] } <line_num>: 141,143
public String getAsShortText(ReadablePartial partial, Locale locale) { [EOL]     return iField.getAsShortText(partial, locale); [EOL] } <line_num>: 145,147
public String getAsShortText(int fieldValue, Locale locale) { [EOL]     return iField.getAsShortText(fieldValue, locale); [EOL] } <line_num>: 149,151
public long add(long instant, int value) { [EOL]     return iField.add(instant, value); [EOL] } <line_num>: 153,155
public long add(long instant, long value) { [EOL]     return iField.add(instant, value); [EOL] } <line_num>: 157,159
public int[] add(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) { [EOL]     return iField.add(instant, fieldIndex, values, valueToAdd); [EOL] } <line_num>: 161,163
public int[] addWrapPartial(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) { [EOL]     return iField.addWrapPartial(instant, fieldIndex, values, valueToAdd); [EOL] } <line_num>: 165,167
public long addWrapField(long instant, int value) { [EOL]     return iField.addWrapField(instant, value); [EOL] } <line_num>: 169,171
public int[] addWrapField(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) { [EOL]     return iField.addWrapField(instant, fieldIndex, values, valueToAdd); [EOL] } <line_num>: 173,175
public int getDifference(long minuendInstant, long subtrahendInstant) { [EOL]     return iField.getDifference(minuendInstant, subtrahendInstant); [EOL] } <line_num>: 177,179
public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) { [EOL]     return iField.getDifferenceAsLong(minuendInstant, subtrahendInstant); [EOL] } <line_num>: 181,183
public long set(long instant, int value) { [EOL]     return iField.set(instant, value); [EOL] } <line_num>: 185,187
public long set(long instant, String text, Locale locale) { [EOL]     return iField.set(instant, text, locale); [EOL] } <line_num>: 189,191
public long set(long instant, String text) { [EOL]     return iField.set(instant, text); [EOL] } <line_num>: 193,195
public int[] set(ReadablePartial instant, int fieldIndex, int[] values, int newValue) { [EOL]     return iField.set(instant, fieldIndex, values, newValue); [EOL] } <line_num>: 197,199
public int[] set(ReadablePartial instant, int fieldIndex, int[] values, String text, Locale locale) { [EOL]     return iField.set(instant, fieldIndex, values, text, locale); [EOL] } <line_num>: 201,203
public DurationField getDurationField() { [EOL]     return iField.getDurationField(); [EOL] } <line_num>: 205,207
public DurationField getRangeDurationField() { [EOL]     if (iRangeDurationField != null) { [EOL]         return iRangeDurationField; [EOL]     } [EOL]     return iField.getRangeDurationField(); [EOL] } <line_num>: 209,214
public boolean isLeap(long instant) { [EOL]     return iField.isLeap(instant); [EOL] } <line_num>: 216,218
public int getLeapAmount(long instant) { [EOL]     return iField.getLeapAmount(instant); [EOL] } <line_num>: 220,222
public DurationField getLeapDurationField() { [EOL]     return iField.getLeapDurationField(); [EOL] } <line_num>: 224,226
public int getMinimumValue() { [EOL]     return iField.getMinimumValue(); [EOL] } <line_num>: 228,230
public int getMinimumValue(long instant) { [EOL]     return iField.getMinimumValue(instant); [EOL] } <line_num>: 232,234
public int getMinimumValue(ReadablePartial instant) { [EOL]     return iField.getMinimumValue(instant); [EOL] } <line_num>: 236,238
public int getMinimumValue(ReadablePartial instant, int[] values) { [EOL]     return iField.getMinimumValue(instant, values); [EOL] } <line_num>: 240,242
public int getMaximumValue() { [EOL]     return iField.getMaximumValue(); [EOL] } <line_num>: 244,246
public int getMaximumValue(long instant) { [EOL]     return iField.getMaximumValue(instant); [EOL] } <line_num>: 248,250
public int getMaximumValue(ReadablePartial instant) { [EOL]     return iField.getMaximumValue(instant); [EOL] } <line_num>: 252,254
public int getMaximumValue(ReadablePartial instant, int[] values) { [EOL]     return iField.getMaximumValue(instant, values); [EOL] } <line_num>: 256,258
public int getMaximumTextLength(Locale locale) { [EOL]     return iField.getMaximumTextLength(locale); [EOL] } <line_num>: 260,262
public int getMaximumShortTextLength(Locale locale) { [EOL]     return iField.getMaximumShortTextLength(locale); [EOL] } <line_num>: 264,266
public long roundFloor(long instant) { [EOL]     return iField.roundFloor(instant); [EOL] } <line_num>: 268,270
public long roundCeiling(long instant) { [EOL]     return iField.roundCeiling(instant); [EOL] } <line_num>: 272,274
public long roundHalfFloor(long instant) { [EOL]     return iField.roundHalfFloor(instant); [EOL] } <line_num>: 276,278
public long roundHalfCeiling(long instant) { [EOL]     return iField.roundHalfCeiling(instant); [EOL] } <line_num>: 280,282
public long roundHalfEven(long instant) { [EOL]     return iField.roundHalfEven(instant); [EOL] } <line_num>: 284,286
public long remainder(long instant) { [EOL]     return iField.remainder(instant); [EOL] } <line_num>: 288,290
public String toString() { [EOL]     return ("DateTimeField[" + getName() + ']'); [EOL] } <line_num>: 292,294
