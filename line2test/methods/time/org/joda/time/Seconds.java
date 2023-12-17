private Seconds(int seconds) { [EOL]     super(seconds); [EOL] } <line_num>: 197,199
public static Seconds seconds(int seconds) { [EOL]     switch(seconds) { [EOL]         case 0: [EOL]             return ZERO; [EOL]         case 1: [EOL]             return ONE; [EOL]         case 2: [EOL]             return TWO; [EOL]         case 3: [EOL]             return THREE; [EOL]         case Integer.MAX_VALUE: [EOL]             return MAX_VALUE; [EOL]         case Integer.MIN_VALUE: [EOL]             return MIN_VALUE; [EOL]         default: [EOL]             return new Seconds(seconds); [EOL]     } [EOL] } <line_num>: 71,88
public static Seconds secondsBetween(ReadableInstant start, ReadableInstant end) { [EOL]     int amount = BaseSingleFieldPeriod.between(start, end, DurationFieldType.seconds()); [EOL]     return Seconds.seconds(amount); [EOL] } <line_num>: 100,103
public static Seconds secondsBetween(ReadablePartial start, ReadablePartial end) { [EOL]     if (start instanceof LocalTime && end instanceof LocalTime) { [EOL]         Chronology chrono = DateTimeUtils.getChronology(start.getChronology()); [EOL]         int seconds = chrono.seconds().getDifference(((LocalTime) end).getLocalMillis(), ((LocalTime) start).getLocalMillis()); [EOL]         return Seconds.seconds(seconds); [EOL]     } [EOL]     int amount = BaseSingleFieldPeriod.between(start, end, ZERO); [EOL]     return Seconds.seconds(amount); [EOL] } <line_num>: 117,126
public static Seconds secondsIn(ReadableInterval interval) { [EOL]     if (interval == null) { [EOL]         return Seconds.ZERO; [EOL]     } [EOL]     int amount = BaseSingleFieldPeriod.between(interval.getStart(), interval.getEnd(), DurationFieldType.seconds()); [EOL]     return Seconds.seconds(amount); [EOL] } <line_num>: 136,142
public static Seconds standardSecondsIn(ReadablePeriod period) { [EOL]     int amount = BaseSingleFieldPeriod.standardPeriodIn(period, DateTimeConstants.MILLIS_PER_SECOND); [EOL]     return Seconds.seconds(amount); [EOL] } <line_num>: 164,167
@FromString [EOL] public static Seconds parseSeconds(String periodStr) { [EOL]     if (periodStr == null) { [EOL]         return Seconds.ZERO; [EOL]     } [EOL]     Period p = PARSER.parsePeriod(periodStr); [EOL]     return Seconds.seconds(p.getSeconds()); [EOL] } <line_num>: 180,187
private Object readResolve() { [EOL]     return Seconds.seconds(getValue()); [EOL] } <line_num>: 206,208
public DurationFieldType getFieldType() { [EOL]     return DurationFieldType.seconds(); [EOL] } <line_num>: 216,218
public PeriodType getPeriodType() { [EOL]     return PeriodType.seconds(); [EOL] } <line_num>: 225,227
public Weeks toStandardWeeks() { [EOL]     return Weeks.weeks(getValue() / DateTimeConstants.SECONDS_PER_WEEK); [EOL] } <line_num>: 244,246
public Days toStandardDays() { [EOL]     return Days.days(getValue() / DateTimeConstants.SECONDS_PER_DAY); [EOL] } <line_num>: 261,263
public Hours toStandardHours() { [EOL]     return Hours.hours(getValue() / DateTimeConstants.SECONDS_PER_HOUR); [EOL] } <line_num>: 277,279
public Minutes toStandardMinutes() { [EOL]     return Minutes.minutes(getValue() / DateTimeConstants.SECONDS_PER_MINUTE); [EOL] } <line_num>: 293,295
public Duration toStandardDuration() { [EOL]     long seconds = getValue(); [EOL]     return new Duration(seconds * DateTimeConstants.MILLIS_PER_SECOND); [EOL] } <line_num>: 311,314
public int getSeconds() { [EOL]     return getValue(); [EOL] } <line_num>: 322,324
public Seconds plus(int seconds) { [EOL]     if (seconds == 0) { [EOL]         return this; [EOL]     } [EOL]     return Seconds.seconds(FieldUtils.safeAdd(getValue(), seconds)); [EOL] } <line_num>: 336,341
public Seconds plus(Seconds seconds) { [EOL]     if (seconds == null) { [EOL]         return this; [EOL]     } [EOL]     return plus(seconds.getValue()); [EOL] } <line_num>: 352,357
public Seconds minus(int seconds) { [EOL]     return plus(FieldUtils.safeNegate(seconds)); [EOL] } <line_num>: 369,371
public Seconds minus(Seconds seconds) { [EOL]     if (seconds == null) { [EOL]         return this; [EOL]     } [EOL]     return minus(seconds.getValue()); [EOL] } <line_num>: 382,387
public Seconds multipliedBy(int scalar) { [EOL]     return Seconds.seconds(FieldUtils.safeMultiply(getValue(), scalar)); [EOL] } <line_num>: 399,401
public Seconds dividedBy(int divisor) { [EOL]     if (divisor == 1) { [EOL]         return this; [EOL]     } [EOL]     return Seconds.seconds(getValue() / divisor); [EOL] } <line_num>: 413,418
public Seconds negated() { [EOL]     return Seconds.seconds(FieldUtils.safeNegate(getValue())); [EOL] } <line_num>: 427,429
public boolean isGreaterThan(Seconds other) { [EOL]     if (other == null) { [EOL]         return getValue() > 0; [EOL]     } [EOL]     return getValue() > other.getValue(); [EOL] } <line_num>: 438,443
public boolean isLessThan(Seconds other) { [EOL]     if (other == null) { [EOL]         return getValue() < 0; [EOL]     } [EOL]     return getValue() < other.getValue(); [EOL] } <line_num>: 451,456
@ToString [EOL] public String toString() { [EOL]     return "PT" + String.valueOf(getValue()) + "S"; [EOL] } <line_num>: 466,469
