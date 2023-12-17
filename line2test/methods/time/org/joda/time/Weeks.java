private Weeks(int weeks) { [EOL]     super(weeks); [EOL] } <line_num>: 197,199
public static Weeks weeks(int weeks) { [EOL]     switch(weeks) { [EOL]         case 0: [EOL]             return ZERO; [EOL]         case 1: [EOL]             return ONE; [EOL]         case 2: [EOL]             return TWO; [EOL]         case 3: [EOL]             return THREE; [EOL]         case Integer.MAX_VALUE: [EOL]             return MAX_VALUE; [EOL]         case Integer.MIN_VALUE: [EOL]             return MIN_VALUE; [EOL]         default: [EOL]             return new Weeks(weeks); [EOL]     } [EOL] } <line_num>: 71,88
public static Weeks weeksBetween(ReadableInstant start, ReadableInstant end) { [EOL]     int amount = BaseSingleFieldPeriod.between(start, end, DurationFieldType.weeks()); [EOL]     return Weeks.weeks(amount); [EOL] } <line_num>: 100,103
public static Weeks weeksBetween(ReadablePartial start, ReadablePartial end) { [EOL]     if (start instanceof LocalDate && end instanceof LocalDate) { [EOL]         Chronology chrono = DateTimeUtils.getChronology(start.getChronology()); [EOL]         int weeks = chrono.weeks().getDifference(((LocalDate) end).getLocalMillis(), ((LocalDate) start).getLocalMillis()); [EOL]         return Weeks.weeks(weeks); [EOL]     } [EOL]     int amount = BaseSingleFieldPeriod.between(start, end, ZERO); [EOL]     return Weeks.weeks(amount); [EOL] } <line_num>: 117,126
public static Weeks weeksIn(ReadableInterval interval) { [EOL]     if (interval == null) { [EOL]         return Weeks.ZERO; [EOL]     } [EOL]     int amount = BaseSingleFieldPeriod.between(interval.getStart(), interval.getEnd(), DurationFieldType.weeks()); [EOL]     return Weeks.weeks(amount); [EOL] } <line_num>: 136,142
public static Weeks standardWeeksIn(ReadablePeriod period) { [EOL]     int amount = BaseSingleFieldPeriod.standardPeriodIn(period, DateTimeConstants.MILLIS_PER_WEEK); [EOL]     return Weeks.weeks(amount); [EOL] } <line_num>: 164,167
@FromString [EOL] public static Weeks parseWeeks(String periodStr) { [EOL]     if (periodStr == null) { [EOL]         return Weeks.ZERO; [EOL]     } [EOL]     Period p = PARSER.parsePeriod(periodStr); [EOL]     return Weeks.weeks(p.getWeeks()); [EOL] } <line_num>: 180,187
private Object readResolve() { [EOL]     return Weeks.weeks(getValue()); [EOL] } <line_num>: 206,208
public DurationFieldType getFieldType() { [EOL]     return DurationFieldType.weeks(); [EOL] } <line_num>: 216,218
public PeriodType getPeriodType() { [EOL]     return PeriodType.weeks(); [EOL] } <line_num>: 225,227
public Days toStandardDays() { [EOL]     return Days.days(FieldUtils.safeMultiply(getValue(), DateTimeConstants.DAYS_PER_WEEK)); [EOL] } <line_num>: 243,245
public Hours toStandardHours() { [EOL]     return Hours.hours(FieldUtils.safeMultiply(getValue(), DateTimeConstants.HOURS_PER_WEEK)); [EOL] } <line_num>: 261,263
public Minutes toStandardMinutes() { [EOL]     return Minutes.minutes(FieldUtils.safeMultiply(getValue(), DateTimeConstants.MINUTES_PER_WEEK)); [EOL] } <line_num>: 279,281
public Seconds toStandardSeconds() { [EOL]     return Seconds.seconds(FieldUtils.safeMultiply(getValue(), DateTimeConstants.SECONDS_PER_WEEK)); [EOL] } <line_num>: 298,300
public Duration toStandardDuration() { [EOL]     long weeks = getValue(); [EOL]     return new Duration(weeks * DateTimeConstants.MILLIS_PER_WEEK); [EOL] } <line_num>: 317,320
public int getWeeks() { [EOL]     return getValue(); [EOL] } <line_num>: 328,330
public Weeks plus(int weeks) { [EOL]     if (weeks == 0) { [EOL]         return this; [EOL]     } [EOL]     return Weeks.weeks(FieldUtils.safeAdd(getValue(), weeks)); [EOL] } <line_num>: 342,347
public Weeks plus(Weeks weeks) { [EOL]     if (weeks == null) { [EOL]         return this; [EOL]     } [EOL]     return plus(weeks.getValue()); [EOL] } <line_num>: 358,363
public Weeks minus(int weeks) { [EOL]     return plus(FieldUtils.safeNegate(weeks)); [EOL] } <line_num>: 375,377
public Weeks minus(Weeks weeks) { [EOL]     if (weeks == null) { [EOL]         return this; [EOL]     } [EOL]     return minus(weeks.getValue()); [EOL] } <line_num>: 388,393
public Weeks multipliedBy(int scalar) { [EOL]     return Weeks.weeks(FieldUtils.safeMultiply(getValue(), scalar)); [EOL] } <line_num>: 405,407
public Weeks dividedBy(int divisor) { [EOL]     if (divisor == 1) { [EOL]         return this; [EOL]     } [EOL]     return Weeks.weeks(getValue() / divisor); [EOL] } <line_num>: 419,424
public Weeks negated() { [EOL]     return Weeks.weeks(FieldUtils.safeNegate(getValue())); [EOL] } <line_num>: 433,435
public boolean isGreaterThan(Weeks other) { [EOL]     if (other == null) { [EOL]         return getValue() > 0; [EOL]     } [EOL]     return getValue() > other.getValue(); [EOL] } <line_num>: 444,449
public boolean isLessThan(Weeks other) { [EOL]     if (other == null) { [EOL]         return getValue() < 0; [EOL]     } [EOL]     return getValue() < other.getValue(); [EOL] } <line_num>: 457,462
@ToString [EOL] public String toString() { [EOL]     return "P" + String.valueOf(getValue()) + "W"; [EOL] } <line_num>: 472,475
