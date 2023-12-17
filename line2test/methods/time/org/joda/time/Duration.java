public Duration(long duration) { [EOL]     super(duration); [EOL] } <line_num>: 176,178
public Duration(long startInstant, long endInstant) { [EOL]     super(startInstant, endInstant); [EOL] } <line_num>: 187,189
public Duration(ReadableInstant start, ReadableInstant end) { [EOL]     super(start, end); [EOL] } <line_num>: 198,200
public Duration(Object duration) { [EOL]     super(duration); [EOL] } <line_num>: 209,211
@FromString [EOL] public static Duration parse(String str) { [EOL]     return new Duration(str); [EOL] } <line_num>: 58,61
public static Duration standardDays(long days) { [EOL]     if (days == 0) { [EOL]         return ZERO; [EOL]     } [EOL]     return new Duration(FieldUtils.safeMultiply(days, DateTimeConstants.MILLIS_PER_DAY)); [EOL] } <line_num>: 81,86
public static Duration standardHours(long hours) { [EOL]     if (hours == 0) { [EOL]         return ZERO; [EOL]     } [EOL]     return new Duration(FieldUtils.safeMultiply(hours, DateTimeConstants.MILLIS_PER_HOUR)); [EOL] } <line_num>: 104,109
public static Duration standardMinutes(long minutes) { [EOL]     if (minutes == 0) { [EOL]         return ZERO; [EOL]     } [EOL]     return new Duration(FieldUtils.safeMultiply(minutes, DateTimeConstants.MILLIS_PER_MINUTE)); [EOL] } <line_num>: 127,132
public static Duration standardSeconds(long seconds) { [EOL]     if (seconds == 0) { [EOL]         return ZERO; [EOL]     } [EOL]     return new Duration(FieldUtils.safeMultiply(seconds, DateTimeConstants.MILLIS_PER_SECOND)); [EOL] } <line_num>: 149,154
public static Duration millis(long millis) { [EOL]     if (millis == 0) { [EOL]         return ZERO; [EOL]     } [EOL]     return new Duration(millis); [EOL] } <line_num>: 163,168
public long getStandardDays() { [EOL]     return getMillis() / DateTimeConstants.MILLIS_PER_DAY; [EOL] } <line_num>: 229,231
public long getStandardHours() { [EOL]     return getMillis() / DateTimeConstants.MILLIS_PER_HOUR; [EOL] } <line_num>: 247,249
public long getStandardMinutes() { [EOL]     return getMillis() / DateTimeConstants.MILLIS_PER_MINUTE; [EOL] } <line_num>: 265,267
public long getStandardSeconds() { [EOL]     return getMillis() / DateTimeConstants.MILLIS_PER_SECOND; [EOL] } <line_num>: 282,284
public Duration toDuration() { [EOL]     return this; [EOL] } <line_num>: 293,295
public Days toStandardDays() { [EOL]     long days = getStandardDays(); [EOL]     return Days.days(FieldUtils.safeToInt(days)); [EOL] } <line_num>: 310,313
public Hours toStandardHours() { [EOL]     long hours = getStandardHours(); [EOL]     return Hours.hours(FieldUtils.safeToInt(hours)); [EOL] } <line_num>: 327,330
public Minutes toStandardMinutes() { [EOL]     long minutes = getStandardMinutes(); [EOL]     return Minutes.minutes(FieldUtils.safeToInt(minutes)); [EOL] } <line_num>: 344,347
public Seconds toStandardSeconds() { [EOL]     long seconds = getStandardSeconds(); [EOL]     return Seconds.seconds(FieldUtils.safeToInt(seconds)); [EOL] } <line_num>: 360,363
public Duration withMillis(long duration) { [EOL]     if (duration == getMillis()) { [EOL]         return this; [EOL]     } [EOL]     return new Duration(duration); [EOL] } <line_num>: 372,377
public Duration withDurationAdded(long durationToAdd, int scalar) { [EOL]     if (durationToAdd == 0 || scalar == 0) { [EOL]         return this; [EOL]     } [EOL]     long add = FieldUtils.safeMultiply(durationToAdd, scalar); [EOL]     long duration = FieldUtils.safeAdd(getMillis(), add); [EOL]     return new Duration(duration); [EOL] } <line_num>: 389,396
public Duration withDurationAdded(ReadableDuration durationToAdd, int scalar) { [EOL]     if (durationToAdd == null || scalar == 0) { [EOL]         return this; [EOL]     } [EOL]     return withDurationAdded(durationToAdd.getMillis(), scalar); [EOL] } <line_num>: 408,413
public Duration plus(long amount) { [EOL]     return withDurationAdded(amount, 1); [EOL] } <line_num>: 425,427
public Duration plus(ReadableDuration amount) { [EOL]     if (amount == null) { [EOL]         return this; [EOL]     } [EOL]     return withDurationAdded(amount.getMillis(), 1); [EOL] } <line_num>: 438,443
public Duration minus(long amount) { [EOL]     return withDurationAdded(amount, -1); [EOL] } <line_num>: 454,456
public Duration minus(ReadableDuration amount) { [EOL]     if (amount == null) { [EOL]         return this; [EOL]     } [EOL]     return withDurationAdded(amount.getMillis(), -1); [EOL] } <line_num>: 467,472
public Duration multipliedBy(long multiplicand) { [EOL]     if (multiplicand == 1) { [EOL]         return this; [EOL]     } [EOL]     return new Duration(FieldUtils.safeMultiply(getMillis(), multiplicand)); [EOL] } <line_num>: 484,489
public Duration dividedBy(long divisor) { [EOL]     if (divisor == 1) { [EOL]         return this; [EOL]     } [EOL]     return new Duration(FieldUtils.safeDivide(getMillis(), divisor)); [EOL] } <line_num>: 501,506
public Duration negated() { [EOL]     if (getMillis() == Long.MIN_VALUE) { [EOL]         throw new ArithmeticException("Negation of this duration would overflow"); [EOL]     } [EOL]     return new Duration(-getMillis()); [EOL] } <line_num>: 514,519
