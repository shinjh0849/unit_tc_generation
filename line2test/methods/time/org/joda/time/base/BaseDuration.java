protected BaseDuration(long duration) { [EOL]     super(); [EOL]     iMillis = duration; [EOL] } <line_num>: 60,63
protected BaseDuration(long startInstant, long endInstant) { [EOL]     super(); [EOL]     iMillis = FieldUtils.safeAdd(endInstant, -startInstant); [EOL] } <line_num>: 72,75
protected BaseDuration(ReadableInstant start, ReadableInstant end) { [EOL]     super(); [EOL]     if (start == end) { [EOL]         iMillis = 0L; [EOL]     } else { [EOL]         long startMillis = DateTimeUtils.getInstantMillis(start); [EOL]         long endMillis = DateTimeUtils.getInstantMillis(end); [EOL]         iMillis = FieldUtils.safeAdd(endMillis, -startMillis); [EOL]     } [EOL] } <line_num>: 84,93
protected BaseDuration(Object duration) { [EOL]     super(); [EOL]     DurationConverter converter = ConverterManager.getInstance().getDurationConverter(duration); [EOL]     iMillis = converter.getDurationMillis(duration); [EOL] } <line_num>: 102,106
public long getMillis() { [EOL]     return iMillis; [EOL] } <line_num>: 114,116
protected void setMillis(long duration) { [EOL]     iMillis = duration; [EOL] } <line_num>: 124,126
public Period toPeriod(PeriodType type) { [EOL]     return new Period(getMillis(), type); [EOL] } <line_num>: 143,145
public Period toPeriod(Chronology chrono) { [EOL]     return new Period(getMillis(), chrono); [EOL] } <line_num>: 163,165
public Period toPeriod(PeriodType type, Chronology chrono) { [EOL]     return new Period(getMillis(), type, chrono); [EOL] } <line_num>: 184,186
public Period toPeriodFrom(ReadableInstant startInstant) { [EOL]     return new Period(startInstant, this); [EOL] } <line_num>: 199,201
public Period toPeriodFrom(ReadableInstant startInstant, PeriodType type) { [EOL]     return new Period(startInstant, this, type); [EOL] } <line_num>: 215,217
public Period toPeriodTo(ReadableInstant endInstant) { [EOL]     return new Period(this, endInstant); [EOL] } <line_num>: 231,233
public Period toPeriodTo(ReadableInstant endInstant, PeriodType type) { [EOL]     return new Period(this, endInstant, type); [EOL] } <line_num>: 248,250
public Interval toIntervalFrom(ReadableInstant startInstant) { [EOL]     return new Interval(startInstant, this); [EOL] } <line_num>: 258,260
public Interval toIntervalTo(ReadableInstant endInstant) { [EOL]     return new Interval(this, endInstant); [EOL] } <line_num>: 268,270
