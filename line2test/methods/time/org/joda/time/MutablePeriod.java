public MutablePeriod() { [EOL]     super(0L, null, null); [EOL] } <line_num>: 92,94
public MutablePeriod(PeriodType type) { [EOL]     super(0L, type, null); [EOL] } <line_num>: 101,103
public MutablePeriod(int hours, int minutes, int seconds, int millis) { [EOL]     super(0, 0, 0, 0, hours, minutes, seconds, millis, PeriodType.standard()); [EOL] } <line_num>: 113,115
public MutablePeriod(int years, int months, int weeks, int days, int hours, int minutes, int seconds, int millis) { [EOL]     super(years, months, weeks, days, hours, minutes, seconds, millis, PeriodType.standard()); [EOL] } <line_num>: 129,132
public MutablePeriod(int years, int months, int weeks, int days, int hours, int minutes, int seconds, int millis, PeriodType type) { [EOL]     super(years, months, weeks, days, hours, minutes, seconds, millis, type); [EOL] } <line_num>: 148,151
public MutablePeriod(long duration) { [EOL]     super(duration); [EOL] } <line_num>: 179,181
public MutablePeriod(long duration, PeriodType type) { [EOL]     super(duration, type, null); [EOL] } <line_num>: 199,201
public MutablePeriod(long duration, Chronology chronology) { [EOL]     super(duration, null, chronology); [EOL] } <line_num>: 220,222
public MutablePeriod(long duration, PeriodType type, Chronology chronology) { [EOL]     super(duration, type, chronology); [EOL] } <line_num>: 241,243
public MutablePeriod(long startInstant, long endInstant) { [EOL]     super(startInstant, endInstant, null, null); [EOL] } <line_num>: 252,254
public MutablePeriod(long startInstant, long endInstant, PeriodType type) { [EOL]     super(startInstant, endInstant, type, null); [EOL] } <line_num>: 263,265
public MutablePeriod(long startInstant, long endInstant, Chronology chrono) { [EOL]     super(startInstant, endInstant, null, chrono); [EOL] } <line_num>: 275,277
public MutablePeriod(long startInstant, long endInstant, PeriodType type, Chronology chrono) { [EOL]     super(startInstant, endInstant, type, chrono); [EOL] } <line_num>: 287,289
public MutablePeriod(ReadableInstant startInstant, ReadableInstant endInstant) { [EOL]     super(startInstant, endInstant, null); [EOL] } <line_num>: 301,303
public MutablePeriod(ReadableInstant startInstant, ReadableInstant endInstant, PeriodType type) { [EOL]     super(startInstant, endInstant, type); [EOL] } <line_num>: 315,317
public MutablePeriod(ReadableInstant startInstant, ReadableDuration duration) { [EOL]     super(startInstant, duration, null); [EOL] } <line_num>: 325,327
public MutablePeriod(ReadableInstant startInstant, ReadableDuration duration, PeriodType type) { [EOL]     super(startInstant, duration, type); [EOL] } <line_num>: 336,338
public MutablePeriod(ReadableDuration duration, ReadableInstant endInstant) { [EOL]     super(duration, endInstant, null); [EOL] } <line_num>: 346,348
public MutablePeriod(ReadableDuration duration, ReadableInstant endInstant, PeriodType type) { [EOL]     super(duration, endInstant, type); [EOL] } <line_num>: 357,359
public MutablePeriod(Object period) { [EOL]     super(period, null, null); [EOL] } <line_num>: 373,375
public MutablePeriod(Object period, PeriodType type) { [EOL]     super(period, type, null); [EOL] } <line_num>: 390,392
public MutablePeriod(Object period, Chronology chrono) { [EOL]     super(period, null, chrono); [EOL] } <line_num>: 407,409
public MutablePeriod(Object period, PeriodType type, Chronology chrono) { [EOL]     super(period, type, chrono); [EOL] } <line_num>: 425,427
@FromString [EOL] public static MutablePeriod parse(String str) { [EOL]     return parse(str, ISOPeriodFormat.standard()); [EOL] } <line_num>: 72,75
public static MutablePeriod parse(String str, PeriodFormatter formatter) { [EOL]     return formatter.parsePeriod(str).toMutablePeriod(); [EOL] } <line_num>: 84,86
public void clear() { [EOL]     super.setValues(new int[size()]); [EOL] } <line_num>: 433,435
public void setValue(int index, int value) { [EOL]     super.setValue(index, value); [EOL] } <line_num>: 444,446
public void set(DurationFieldType field, int value) { [EOL]     super.setField(field, value); [EOL] } <line_num>: 457,459
public void setPeriod(ReadablePeriod period) { [EOL]     super.setPeriod(period); [EOL] } <line_num>: 467,469
public void setPeriod(int years, int months, int weeks, int days, int hours, int minutes, int seconds, int millis) { [EOL]     super.setPeriod(years, months, weeks, days, hours, minutes, seconds, millis); [EOL] } <line_num>: 484,487
public void setPeriod(ReadableInterval interval) { [EOL]     if (interval == null) { [EOL]         setPeriod(0L); [EOL]     } else { [EOL]         Chronology chrono = DateTimeUtils.getChronology(interval.getChronology()); [EOL]         setPeriod(interval.getStartMillis(), interval.getEndMillis(), chrono); [EOL]     } [EOL] } <line_num>: 496,503
public void setPeriod(ReadableInstant start, ReadableInstant end) { [EOL]     if (start == end) { [EOL]         setPeriod(0L); [EOL]     } else { [EOL]         long startMillis = DateTimeUtils.getInstantMillis(start); [EOL]         long endMillis = DateTimeUtils.getInstantMillis(end); [EOL]         Chronology chrono = DateTimeUtils.getIntervalChronology(start, end); [EOL]         setPeriod(startMillis, endMillis, chrono); [EOL]     } [EOL] } <line_num>: 515,524
public void setPeriod(long startInstant, long endInstant) { [EOL]     setPeriod(startInstant, endInstant, null); [EOL] } <line_num>: 534,536
public void setPeriod(long startInstant, long endInstant, Chronology chrono) { [EOL]     chrono = DateTimeUtils.getChronology(chrono); [EOL]     setValues(chrono.get(this, startInstant, endInstant)); [EOL] } <line_num>: 546,549
public void setPeriod(ReadableDuration duration) { [EOL]     setPeriod(duration, null); [EOL] } <line_num>: 562,564
public void setPeriod(ReadableDuration duration, Chronology chrono) { [EOL]     long durationMillis = DateTimeUtils.getDurationMillis(duration); [EOL]     setPeriod(durationMillis, chrono); [EOL] } <line_num>: 578,581
public void setPeriod(long duration) { [EOL]     setPeriod(duration, null); [EOL] } <line_num>: 594,596
public void setPeriod(long duration, Chronology chrono) { [EOL]     chrono = DateTimeUtils.getChronology(chrono); [EOL]     setValues(chrono.get(this, duration)); [EOL] } <line_num>: 609,612
public void add(DurationFieldType field, int value) { [EOL]     super.addField(field, value); [EOL] } <line_num>: 624,626
public void add(ReadablePeriod period) { [EOL]     super.addPeriod(period); [EOL] } <line_num>: 636,638
public void add(int years, int months, int weeks, int days, int hours, int minutes, int seconds, int millis) { [EOL]     setPeriod(FieldUtils.safeAdd(getYears(), years), FieldUtils.safeAdd(getMonths(), months), FieldUtils.safeAdd(getWeeks(), weeks), FieldUtils.safeAdd(getDays(), days), FieldUtils.safeAdd(getHours(), hours), FieldUtils.safeAdd(getMinutes(), minutes), FieldUtils.safeAdd(getSeconds(), seconds), FieldUtils.safeAdd(getMillis(), millis)); [EOL] } <line_num>: 655,667
public void add(ReadableInterval interval) { [EOL]     if (interval != null) { [EOL]         add(interval.toPeriod(getPeriodType())); [EOL]     } [EOL] } <line_num>: 676,680
public void add(ReadableDuration duration) { [EOL]     if (duration != null) { [EOL]         add(new Period(duration.getMillis(), getPeriodType())); [EOL]     } [EOL] } <line_num>: 689,693
public void add(long duration) { [EOL]     add(new Period(duration, getPeriodType())); [EOL] } <line_num>: 706,708
public void add(long duration, Chronology chrono) { [EOL]     add(new Period(duration, getPeriodType(), chrono)); [EOL] } <line_num>: 722,724
public void mergePeriod(ReadablePeriod period) { [EOL]     super.mergePeriod(period); [EOL] } <line_num>: 735,737
public int getYears() { [EOL]     return getPeriodType().getIndexedField(this, PeriodType.YEAR_INDEX); [EOL] } <line_num>: 745,747
public int getMonths() { [EOL]     return getPeriodType().getIndexedField(this, PeriodType.MONTH_INDEX); [EOL] } <line_num>: 754,756
public int getWeeks() { [EOL]     return getPeriodType().getIndexedField(this, PeriodType.WEEK_INDEX); [EOL] } <line_num>: 763,765
public int getDays() { [EOL]     return getPeriodType().getIndexedField(this, PeriodType.DAY_INDEX); [EOL] } <line_num>: 772,774
public int getHours() { [EOL]     return getPeriodType().getIndexedField(this, PeriodType.HOUR_INDEX); [EOL] } <line_num>: 782,784
public int getMinutes() { [EOL]     return getPeriodType().getIndexedField(this, PeriodType.MINUTE_INDEX); [EOL] } <line_num>: 791,793
public int getSeconds() { [EOL]     return getPeriodType().getIndexedField(this, PeriodType.SECOND_INDEX); [EOL] } <line_num>: 800,802
public int getMillis() { [EOL]     return getPeriodType().getIndexedField(this, PeriodType.MILLI_INDEX); [EOL] } <line_num>: 809,811
public void setYears(int years) { [EOL]     super.setField(DurationFieldType.years(), years); [EOL] } <line_num>: 820,822
public void addYears(int years) { [EOL]     super.addField(DurationFieldType.years(), years); [EOL] } <line_num>: 831,833
public void setMonths(int months) { [EOL]     super.setField(DurationFieldType.months(), months); [EOL] } <line_num>: 842,844
public void addMonths(int months) { [EOL]     super.addField(DurationFieldType.months(), months); [EOL] } <line_num>: 853,855
public void setWeeks(int weeks) { [EOL]     super.setField(DurationFieldType.weeks(), weeks); [EOL] } <line_num>: 864,866
public void addWeeks(int weeks) { [EOL]     super.addField(DurationFieldType.weeks(), weeks); [EOL] } <line_num>: 875,877
public void setDays(int days) { [EOL]     super.setField(DurationFieldType.days(), days); [EOL] } <line_num>: 886,888
public void addDays(int days) { [EOL]     super.addField(DurationFieldType.days(), days); [EOL] } <line_num>: 897,899
public void setHours(int hours) { [EOL]     super.setField(DurationFieldType.hours(), hours); [EOL] } <line_num>: 908,910
public void addHours(int hours) { [EOL]     super.addField(DurationFieldType.hours(), hours); [EOL] } <line_num>: 919,921
public void setMinutes(int minutes) { [EOL]     super.setField(DurationFieldType.minutes(), minutes); [EOL] } <line_num>: 930,932
public void addMinutes(int minutes) { [EOL]     super.addField(DurationFieldType.minutes(), minutes); [EOL] } <line_num>: 941,943
public void setSeconds(int seconds) { [EOL]     super.setField(DurationFieldType.seconds(), seconds); [EOL] } <line_num>: 952,954
public void addSeconds(int seconds) { [EOL]     super.addField(DurationFieldType.seconds(), seconds); [EOL] } <line_num>: 963,965
public void setMillis(int millis) { [EOL]     super.setField(DurationFieldType.millis(), millis); [EOL] } <line_num>: 974,976
public void addMillis(int millis) { [EOL]     super.addField(DurationFieldType.millis(), millis); [EOL] } <line_num>: 985,987
public MutablePeriod copy() { [EOL]     return (MutablePeriod) clone(); [EOL] } <line_num>: 996,998
public Object clone() { [EOL]     try { [EOL]         return super.clone(); [EOL]     } catch (CloneNotSupportedException ex) { [EOL]         throw new InternalError("Clone error"); [EOL]     } [EOL] } <line_num>: 1005,1011
