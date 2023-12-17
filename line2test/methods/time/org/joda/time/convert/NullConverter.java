protected NullConverter() { [EOL]     super(); [EOL] } <line_num>: 44,46
public long getDurationMillis(Object object) { [EOL]     return 0L; [EOL] } <line_num>: 55,57
public void setInto(ReadWritablePeriod duration, Object object, Chronology chrono) { [EOL]     duration.setPeriod((Period) null); [EOL] } <line_num>: 68,70
public void setInto(ReadWritableInterval writableInterval, Object object, Chronology chrono) { [EOL]     writableInterval.setChronology(chrono); [EOL]     long now = DateTimeUtils.currentTimeMillis(); [EOL]     writableInterval.setInterval(now, now); [EOL] } <line_num>: 82,86
public Class<?> getSupportedType() { [EOL]     return null; [EOL] } <line_num>: 94,96
