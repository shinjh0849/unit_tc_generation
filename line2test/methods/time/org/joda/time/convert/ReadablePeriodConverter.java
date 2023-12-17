protected ReadablePeriodConverter() { [EOL]     super(); [EOL] } <line_num>: 41,43
public void setInto(ReadWritablePeriod duration, Object object, Chronology chrono) { [EOL]     duration.setPeriod((ReadablePeriod) object); [EOL] } <line_num>: 57,59
public PeriodType getPeriodType(Object object) { [EOL]     ReadablePeriod period = (ReadablePeriod) object; [EOL]     return period.getPeriodType(); [EOL] } <line_num>: 69,72
public Class<?> getSupportedType() { [EOL]     return ReadablePeriod.class; [EOL] } <line_num>: 80,82
