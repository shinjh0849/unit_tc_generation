private UnsupportedDateTimeField(DateTimeFieldType type, DurationField durationField) { [EOL]     if (type == null || durationField == null) { [EOL]         throw new IllegalArgumentException(); [EOL]     } [EOL]     iType = type; [EOL]     iDurationField = durationField; [EOL] } <line_num>: 82,88
public static synchronized UnsupportedDateTimeField getInstance(DateTimeFieldType type, DurationField durationField) { [EOL]     UnsupportedDateTimeField field; [EOL]     if (cCache == null) { [EOL]         cCache = new HashMap<DateTimeFieldType, UnsupportedDateTimeField>(7); [EOL]         field = null; [EOL]     } else { [EOL]         field = cCache.get(type); [EOL]         if (field != null && field.getDurationField() != durationField) { [EOL]             field = null; [EOL]         } [EOL]     } [EOL]     if (field == null) { [EOL]         field = new UnsupportedDateTimeField(type, durationField); [EOL]         cCache.put(type, field); [EOL]     } [EOL]     return field; [EOL] } <line_num>: 51,69
public DateTimeFieldType getType() { [EOL]     return iType; [EOL] } <line_num>: 94,96
public String getName() { [EOL]     return iType.getName(); [EOL] } <line_num>: 98,100
public boolean isSupported() { [EOL]     return false; [EOL] } <line_num>: 107,109
public boolean isLenient() { [EOL]     return false; [EOL] } <line_num>: 116,118
public int get(long instant) { [EOL]     throw unsupported(); [EOL] } <line_num>: 125,127
public String getAsText(long instant, Locale locale) { [EOL]     throw unsupported(); [EOL] } <line_num>: 134,136
public String getAsText(long instant) { [EOL]     throw unsupported(); [EOL] } <line_num>: 143,145
public String getAsText(ReadablePartial partial, int fieldValue, Locale locale) { [EOL]     throw unsupported(); [EOL] } <line_num>: 152,154
public String getAsText(ReadablePartial partial, Locale locale) { [EOL]     throw unsupported(); [EOL] } <line_num>: 161,163
public String getAsText(int fieldValue, Locale locale) { [EOL]     throw unsupported(); [EOL] } <line_num>: 170,172
public String getAsShortText(long instant, Locale locale) { [EOL]     throw unsupported(); [EOL] } <line_num>: 179,181
public String getAsShortText(long instant) { [EOL]     throw unsupported(); [EOL] } <line_num>: 188,190
public String getAsShortText(ReadablePartial partial, int fieldValue, Locale locale) { [EOL]     throw unsupported(); [EOL] } <line_num>: 197,199
public String getAsShortText(ReadablePartial partial, Locale locale) { [EOL]     throw unsupported(); [EOL] } <line_num>: 206,208
public String getAsShortText(int fieldValue, Locale locale) { [EOL]     throw unsupported(); [EOL] } <line_num>: 215,217
public long add(long instant, int value) { [EOL]     return getDurationField().add(instant, value); [EOL] } <line_num>: 224,226
public long add(long instant, long value) { [EOL]     return getDurationField().add(instant, value); [EOL] } <line_num>: 233,235
public int[] add(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) { [EOL]     throw unsupported(); [EOL] } <line_num>: 242,244
public int[] addWrapPartial(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) { [EOL]     throw unsupported(); [EOL] } <line_num>: 251,253
public long addWrapField(long instant, int value) { [EOL]     throw unsupported(); [EOL] } <line_num>: 260,262
public int[] addWrapField(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) { [EOL]     throw unsupported(); [EOL] } <line_num>: 269,271
public int getDifference(long minuendInstant, long subtrahendInstant) { [EOL]     return getDurationField().getDifference(minuendInstant, subtrahendInstant); [EOL] } <line_num>: 278,280
public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) { [EOL]     return getDurationField().getDifferenceAsLong(minuendInstant, subtrahendInstant); [EOL] } <line_num>: 287,289
public long set(long instant, int value) { [EOL]     throw unsupported(); [EOL] } <line_num>: 296,298
public int[] set(ReadablePartial instant, int fieldIndex, int[] values, int newValue) { [EOL]     throw unsupported(); [EOL] } <line_num>: 305,307
public long set(long instant, String text, Locale locale) { [EOL]     throw unsupported(); [EOL] } <line_num>: 314,316
public long set(long instant, String text) { [EOL]     throw unsupported(); [EOL] } <line_num>: 323,325
public int[] set(ReadablePartial instant, int fieldIndex, int[] values, String text, Locale locale) { [EOL]     throw unsupported(); [EOL] } <line_num>: 332,334
public DurationField getDurationField() { [EOL]     return iDurationField; [EOL] } <line_num>: 342,344
public DurationField getRangeDurationField() { [EOL]     return null; [EOL] } <line_num>: 351,353
public boolean isLeap(long instant) { [EOL]     throw unsupported(); [EOL] } <line_num>: 360,362
public int getLeapAmount(long instant) { [EOL]     throw unsupported(); [EOL] } <line_num>: 369,371
public DurationField getLeapDurationField() { [EOL]     return null; [EOL] } <line_num>: 378,380
public int getMinimumValue() { [EOL]     throw unsupported(); [EOL] } <line_num>: 387,389
public int getMinimumValue(long instant) { [EOL]     throw unsupported(); [EOL] } <line_num>: 396,398
public int getMinimumValue(ReadablePartial instant) { [EOL]     throw unsupported(); [EOL] } <line_num>: 405,407
public int getMinimumValue(ReadablePartial instant, int[] values) { [EOL]     throw unsupported(); [EOL] } <line_num>: 414,416
public int getMaximumValue() { [EOL]     throw unsupported(); [EOL] } <line_num>: 423,425
public int getMaximumValue(long instant) { [EOL]     throw unsupported(); [EOL] } <line_num>: 432,434
public int getMaximumValue(ReadablePartial instant) { [EOL]     throw unsupported(); [EOL] } <line_num>: 441,443
public int getMaximumValue(ReadablePartial instant, int[] values) { [EOL]     throw unsupported(); [EOL] } <line_num>: 450,452
public int getMaximumTextLength(Locale locale) { [EOL]     throw unsupported(); [EOL] } <line_num>: 459,461
public int getMaximumShortTextLength(Locale locale) { [EOL]     throw unsupported(); [EOL] } <line_num>: 468,470
public long roundFloor(long instant) { [EOL]     throw unsupported(); [EOL] } <line_num>: 477,479
public long roundCeiling(long instant) { [EOL]     throw unsupported(); [EOL] } <line_num>: 486,488
public long roundHalfFloor(long instant) { [EOL]     throw unsupported(); [EOL] } <line_num>: 495,497
public long roundHalfCeiling(long instant) { [EOL]     throw unsupported(); [EOL] } <line_num>: 504,506
public long roundHalfEven(long instant) { [EOL]     throw unsupported(); [EOL] } <line_num>: 513,515
public long remainder(long instant) { [EOL]     throw unsupported(); [EOL] } <line_num>: 522,524
public String toString() { [EOL]     return "UnsupportedDateTimeField"; [EOL] } <line_num>: 532,534
private Object readResolve() { [EOL]     return getInstance(iType, iDurationField); [EOL] } <line_num>: 539,541
private UnsupportedOperationException unsupported() { [EOL]     return new UnsupportedOperationException(iType + " field is unsupported"); [EOL] } <line_num>: 543,545
