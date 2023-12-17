public MutableInterval() { [EOL]     super(0L, 0L, null); [EOL] } <line_num>: 78,80
public MutableInterval(long startInstant, long endInstant) { [EOL]     super(startInstant, endInstant, null); [EOL] } <line_num>: 89,91
public MutableInterval(long startInstant, long endInstant, Chronology chronology) { [EOL]     super(startInstant, endInstant, chronology); [EOL] } <line_num>: 101,103
public MutableInterval(ReadableInstant start, ReadableInstant end) { [EOL]     super(start, end); [EOL] } <line_num>: 114,116
public MutableInterval(ReadableInstant start, ReadableDuration duration) { [EOL]     super(start, duration); [EOL] } <line_num>: 126,128
public MutableInterval(ReadableDuration duration, ReadableInstant end) { [EOL]     super(duration, end); [EOL] } <line_num>: 138,140
public MutableInterval(ReadableInstant start, ReadablePeriod period) { [EOL]     super(start, period); [EOL] } <line_num>: 153,155
public MutableInterval(ReadablePeriod period, ReadableInstant end) { [EOL]     super(period, end); [EOL] } <line_num>: 168,170
public MutableInterval(Object interval) { [EOL]     super(interval, null); [EOL] } <line_num>: 185,187
public MutableInterval(Object interval, Chronology chronology) { [EOL]     super(interval, chronology); [EOL] } <line_num>: 204,206
public static MutableInterval parse(String str) { [EOL]     return new MutableInterval(str); [EOL] } <line_num>: 70,72
public void setInterval(long startInstant, long endInstant) { [EOL]     super.setInterval(startInstant, endInstant, getChronology()); [EOL] } <line_num>: 216,218
public void setInterval(ReadableInterval interval) { [EOL]     if (interval == null) { [EOL]         throw new IllegalArgumentException("Interval must not be null"); [EOL]     } [EOL]     long startMillis = interval.getStartMillis(); [EOL]     long endMillis = interval.getEndMillis(); [EOL]     Chronology chrono = interval.getChronology(); [EOL]     super.setInterval(startMillis, endMillis, chrono); [EOL] } <line_num>: 226,234
public void setInterval(ReadableInstant start, ReadableInstant end) { [EOL]     if (start == null && end == null) { [EOL]         long now = DateTimeUtils.currentTimeMillis(); [EOL]         setInterval(now, now); [EOL]     } else { [EOL]         long startMillis = DateTimeUtils.getInstantMillis(start); [EOL]         long endMillis = DateTimeUtils.getInstantMillis(end); [EOL]         Chronology chrono = DateTimeUtils.getInstantChronology(start); [EOL]         super.setInterval(startMillis, endMillis, chrono); [EOL]     } [EOL] } <line_num>: 244,254
public void setChronology(Chronology chrono) { [EOL]     super.setInterval(getStartMillis(), getEndMillis(), chrono); [EOL] } <line_num>: 262,264
public void setStartMillis(long startInstant) { [EOL]     super.setInterval(startInstant, getEndMillis(), getChronology()); [EOL] } <line_num>: 273,275
public void setStart(ReadableInstant start) { [EOL]     long startMillis = DateTimeUtils.getInstantMillis(start); [EOL]     super.setInterval(startMillis, getEndMillis(), getChronology()); [EOL] } <line_num>: 283,286
public void setEndMillis(long endInstant) { [EOL]     super.setInterval(getStartMillis(), endInstant, getChronology()); [EOL] } <line_num>: 295,297
public void setEnd(ReadableInstant end) { [EOL]     long endMillis = DateTimeUtils.getInstantMillis(end); [EOL]     super.setInterval(getStartMillis(), endMillis, getChronology()); [EOL] } <line_num>: 305,308
public void setDurationAfterStart(long duration) { [EOL]     setEndMillis(FieldUtils.safeAdd(getStartMillis(), duration)); [EOL] } <line_num>: 318,320
public void setDurationBeforeEnd(long duration) { [EOL]     setStartMillis(FieldUtils.safeAdd(getEndMillis(), -duration)); [EOL] } <line_num>: 329,331
public void setDurationAfterStart(ReadableDuration duration) { [EOL]     long durationMillis = DateTimeUtils.getDurationMillis(duration); [EOL]     setEndMillis(FieldUtils.safeAdd(getStartMillis(), durationMillis)); [EOL] } <line_num>: 341,344
public void setDurationBeforeEnd(ReadableDuration duration) { [EOL]     long durationMillis = DateTimeUtils.getDurationMillis(duration); [EOL]     setStartMillis(FieldUtils.safeAdd(getEndMillis(), -durationMillis)); [EOL] } <line_num>: 353,356
public void setPeriodAfterStart(ReadablePeriod period) { [EOL]     if (period == null) { [EOL]         setEndMillis(getStartMillis()); [EOL]     } else { [EOL]         setEndMillis(getChronology().add(period, getStartMillis(), 1)); [EOL]     } [EOL] } <line_num>: 367,373
public void setPeriodBeforeEnd(ReadablePeriod period) { [EOL]     if (period == null) { [EOL]         setStartMillis(getEndMillis()); [EOL]     } else { [EOL]         setStartMillis(getChronology().add(period, getEndMillis(), -1)); [EOL]     } [EOL] } <line_num>: 383,389
public MutableInterval copy() { [EOL]     return (MutableInterval) clone(); [EOL] } <line_num>: 397,399
public Object clone() { [EOL]     try { [EOL]         return super.clone(); [EOL]     } catch (CloneNotSupportedException ex) { [EOL]         throw new InternalError("Clone error"); [EOL]     } [EOL] } <line_num>: 406,412
