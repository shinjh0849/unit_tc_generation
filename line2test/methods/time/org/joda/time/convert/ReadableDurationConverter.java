protected ReadableDurationConverter() { [EOL]     super(); [EOL] } <line_num>: 41,43
public long getDurationMillis(Object object) { [EOL]     return ((ReadableDuration) object).getMillis(); [EOL] } <line_num>: 55,57
public void setInto(ReadWritablePeriod writablePeriod, Object object, Chronology chrono) { [EOL]     ReadableDuration dur = (ReadableDuration) object; [EOL]     chrono = DateTimeUtils.getChronology(chrono); [EOL]     long duration = dur.getMillis(); [EOL]     int[] values = chrono.get(writablePeriod, duration); [EOL]     for (int i = 0; i < values.length; i++) { [EOL]         writablePeriod.setValue(i, values[i]); [EOL]     } [EOL] } <line_num>: 71,79
public Class<?> getSupportedType() { [EOL]     return ReadableDuration.class; [EOL] } <line_num>: 87,89
