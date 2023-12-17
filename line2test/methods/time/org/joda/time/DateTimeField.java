public abstract DateTimeFieldType getType(); <line_num>: 40,40
public abstract String getName(); <line_num>: 52,52
public abstract boolean isSupported(); <line_num>: 59,59
public abstract boolean isLenient(); <line_num>: 68,68
public abstract int get(long instant); <line_num>: 78,78
public abstract String getAsText(long instant, Locale locale); <line_num>: 88,88
public abstract String getAsText(long instant); <line_num>: 96,96
public abstract String getAsText(ReadablePartial partial, int fieldValue, Locale locale); <line_num>: 107,107
public abstract String getAsText(ReadablePartial partial, Locale locale); <line_num>: 117,117
public abstract String getAsText(int fieldValue, Locale locale); <line_num>: 127,127
public abstract String getAsShortText(long instant, Locale locale); <line_num>: 137,137
public abstract String getAsShortText(long instant); <line_num>: 146,146
public abstract String getAsShortText(ReadablePartial partial, int fieldValue, Locale locale); <line_num>: 157,157
public abstract String getAsShortText(ReadablePartial partial, Locale locale); <line_num>: 167,167
public abstract String getAsShortText(int fieldValue, Locale locale); <line_num>: 177,177
public abstract long add(long instant, int value); <line_num>: 200,200
public abstract long add(long instant, long value); <line_num>: 212,212
public abstract int[] add(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd); <line_num>: 241,241
public abstract int[] addWrapPartial(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd); <line_num>: 270,270
public abstract long addWrapField(long instant, int value); <line_num>: 293,293
public abstract int[] addWrapField(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd); <line_num>: 319,319
public abstract int getDifference(long minuendInstant, long subtrahendInstant); <line_num>: 340,340
public abstract long getDifferenceAsLong(long minuendInstant, long subtrahendInstant); <line_num>: 361,361
public abstract long set(long instant, int value); <line_num>: 379,379
public abstract int[] set(ReadablePartial instant, int fieldIndex, int[] values, int newValue); <line_num>: 399,399
public abstract long set(long instant, String text, Locale locale); <line_num>: 416,416
public abstract long set(long instant, String text); <line_num>: 431,431
public abstract int[] set(ReadablePartial instant, int fieldIndex, int[] values, String text, Locale locale); <line_num>: 450,450
public abstract DurationField getDurationField(); <line_num>: 461,461
public abstract DurationField getRangeDurationField(); <line_num>: 469,469
public abstract boolean isLeap(long instant); <line_num>: 480,480
public abstract int getLeapAmount(long instant); <line_num>: 491,491
public abstract DurationField getLeapDurationField(); <line_num>: 499,499
public abstract int getMinimumValue(); <line_num>: 507,507
public abstract int getMinimumValue(long instant); <line_num>: 515,515
public abstract int getMinimumValue(ReadablePartial instant); <line_num>: 523,523
public abstract int getMinimumValue(ReadablePartial instant, int[] values); <line_num>: 533,533
public abstract int getMaximumValue(); <line_num>: 541,541
public abstract int getMaximumValue(long instant); <line_num>: 549,549
public abstract int getMaximumValue(ReadablePartial instant); <line_num>: 557,557
public abstract int getMaximumValue(ReadablePartial instant, int[] values); <line_num>: 567,567
public abstract int getMaximumTextLength(Locale locale); <line_num>: 575,575
public abstract int getMaximumShortTextLength(Locale locale); <line_num>: 583,583
public abstract long roundFloor(long instant); <line_num>: 599,599
public abstract long roundCeiling(long instant); <line_num>: 613,613
public abstract long roundHalfFloor(long instant); <line_num>: 624,624
public abstract long roundHalfCeiling(long instant); <line_num>: 635,635
public abstract long roundHalfEven(long instant); <line_num>: 650,650
public abstract long remainder(long instant); <line_num>: 664,664
public abstract String toString(); <line_num>: 671,671
