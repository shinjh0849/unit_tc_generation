protected AbstractConverter() { [EOL]     super(); [EOL] } <line_num>: 37,39
public long getInstantMillis(Object object, Chronology chrono) { [EOL]     return DateTimeUtils.currentTimeMillis(); [EOL] } <line_num>: 51,53
public Chronology getChronology(Object object, DateTimeZone zone) { [EOL]     return ISOChronology.getInstance(zone); [EOL] } <line_num>: 66,68
public Chronology getChronology(Object object, Chronology chrono) { [EOL]     return DateTimeUtils.getChronology(chrono); [EOL] } <line_num>: 81,83
public int[] getPartialValues(ReadablePartial fieldSource, Object object, Chronology chrono) { [EOL]     long instant = getInstantMillis(object, chrono); [EOL]     return chrono.get(fieldSource, instant); [EOL] } <line_num>: 100,103
public int[] getPartialValues(ReadablePartial fieldSource, Object object, Chronology chrono, DateTimeFormatter parser) { [EOL]     return getPartialValues(fieldSource, object, chrono); [EOL] } <line_num>: 121,124
public PeriodType getPeriodType(Object object) { [EOL]     return PeriodType.standard(); [EOL] } <line_num>: 133,135
public boolean isReadableInterval(Object object, Chronology chrono) { [EOL]     return false; [EOL] } <line_num>: 147,149
public String toString() { [EOL]     return "Converter[" + (getSupportedType() == null ? "null" : getSupportedType().getName()) + "]"; [EOL] } <line_num>: 157,159
