private Minutes(int minutes) { [EOL]     super(minutes); [EOL] } <line_num>: 197,199
public static Minutes minutes(int minutes) { [EOL]     switch(minutes) { [EOL]         case 0: [EOL]             return ZERO; [EOL]         case 1: [EOL]             return ONE; [EOL]         case 2: [EOL]             return TWO; [EOL]         case 3: [EOL]             return THREE; [EOL]         case Integer.MAX_VALUE: [EOL]             return MAX_VALUE; [EOL]         case Integer.MIN_VALUE: [EOL]             return MIN_VALUE; [EOL]         default: [EOL]             return new Minutes(minutes); [EOL]     } [EOL] } <line_num>: 71,88
public static Minutes minutesBetween(ReadableInstant start, ReadableInstant end) { [EOL]     int amount = BaseSingleFieldPeriod.between(start, end, DurationFieldType.minutes()); [EOL]     return Minutes.minutes(amount); [EOL] } <line_num>: 100,103
public static Minutes minutesBetween(ReadablePartial start, ReadablePartial end) { [EOL]     if (start instanceof LocalTime && end instanceof LocalTime) { [EOL]         Chronology chrono = DateTimeUtils.getChronology(start.getChronology()); [EOL]         int minutes = chrono.minutes().getDifference(((LocalTime) end).getLocalMillis(), ((LocalTime) start).getLocalMillis()); [EOL]         return Minutes.minutes(minutes); [EOL]     } [EOL]     int amount = BaseSingleFieldPeriod.between(start, end, ZERO); [EOL]     return Minutes.minutes(amount); [EOL] } <line_num>: 117,126
public static Minutes minutesIn(ReadableInterval interval) { [EOL]     if (interval == null) { [EOL]         return Minutes.ZERO; [EOL]     } [EOL]     int amount = BaseSingleFieldPeriod.between(interval.getStart(), interval.getEnd(), DurationFieldType.minutes()); [EOL]     return Minutes.minutes(amount); [EOL] } <line_num>: 136,142
public static Minutes standardMinutesIn(ReadablePeriod period) { [EOL]     int amount = BaseSingleFieldPeriod.standardPeriodIn(period, DateTimeConstants.MILLIS_PER_MINUTE); [EOL]     return Minutes.minutes(amount); [EOL] } <line_num>: 164,167
@FromString [EOL] public static Minutes parseMinutes(String periodStr) { [EOL]     if (periodStr == null) { [EOL]         return Minutes.ZERO; [EOL]     } [EOL]     Period p = PARSER.parsePeriod(periodStr); [EOL]     return Minutes.minutes(p.getMinutes()); [EOL] } <line_num>: 180,187
private Object readResolve() { [EOL]     return Minutes.minutes(getValue()); [EOL] } <line_num>: 206,208
public DurationFieldType getFieldType() { [EOL]     return DurationFieldType.minutes(); [EOL] } <line_num>: 216,218
public PeriodType getPeriodType() { [EOL]     return PeriodType.minutes(); [EOL] } <line_num>: 225,227
public Weeks toStandardWeeks() { [EOL]     return Weeks.weeks(getValue() / DateTimeConstants.MINUTES_PER_WEEK); [EOL] } <line_num>: 243,245
public Days toStandardDays() { [EOL]     return Days.days(getValue() / DateTimeConstants.MINUTES_PER_DAY); [EOL] } <line_num>: 260,262
public Hours toStandardHours() { [EOL]     return Hours.hours(getValue() / DateTimeConstants.MINUTES_PER_HOUR); [EOL] } <line_num>: 276,278
public Seconds toStandardSeconds() { [EOL]     return Seconds.seconds(FieldUtils.safeMultiply(getValue(), DateTimeConstants.SECONDS_PER_MINUTE)); [EOL] } <line_num>: 293,295
public Duration toStandardDuration() { [EOL]     long minutes = getValue(); [EOL]     return new Duration(minutes * DateTimeConstants.MILLIS_PER_MINUTE); [EOL] } <line_num>: 311,314
public int getMinutes() { [EOL]     return getValue(); [EOL] } <line_num>: 322,324
public Minutes plus(int minutes) { [EOL]     if (minutes == 0) { [EOL]         return this; [EOL]     } [EOL]     return Minutes.minutes(FieldUtils.safeAdd(getValue(), minutes)); [EOL] } <line_num>: 336,341
public Minutes plus(Minutes minutes) { [EOL]     if (minutes == null) { [EOL]         return this; [EOL]     } [EOL]     return plus(minutes.getValue()); [EOL] } <line_num>: 352,357
public Minutes minus(int minutes) { [EOL]     return plus(FieldUtils.safeNegate(minutes)); [EOL] } <line_num>: 369,371
public Minutes minus(Minutes minutes) { [EOL]     if (minutes == null) { [EOL]         return this; [EOL]     } [EOL]     return minus(minutes.getValue()); [EOL] } <line_num>: 382,387
public Minutes multipliedBy(int scalar) { [EOL]     return Minutes.minutes(FieldUtils.safeMultiply(getValue(), scalar)); [EOL] } <line_num>: 399,401
public Minutes dividedBy(int divisor) { [EOL]     if (divisor == 1) { [EOL]         return this; [EOL]     } [EOL]     return Minutes.minutes(getValue() / divisor); [EOL] } <line_num>: 413,418
public Minutes negated() { [EOL]     return Minutes.minutes(FieldUtils.safeNegate(getValue())); [EOL] } <line_num>: 427,429
public boolean isGreaterThan(Minutes other) { [EOL]     if (other == null) { [EOL]         return getValue() > 0; [EOL]     } [EOL]     return getValue() > other.getValue(); [EOL] } <line_num>: 438,443
public boolean isLessThan(Minutes other) { [EOL]     if (other == null) { [EOL]         return getValue() < 0; [EOL]     } [EOL]     return getValue() < other.getValue(); [EOL] } <line_num>: 451,456
@ToString [EOL] public String toString() { [EOL]     return "PT" + String.valueOf(getValue()) + "M"; [EOL] } <line_num>: 466,469
