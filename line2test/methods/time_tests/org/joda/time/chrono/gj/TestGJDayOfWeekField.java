public TestGJDayOfWeekField(TestGJChronology chrono) { [EOL]     super(DateTimeFieldType.dayOfWeek(), TestGJChronology.MILLIS_PER_DAY, chrono); [EOL] } <line_num>: 26,28
public int get(long millis) { [EOL]     int dayOfWeek = (int) TestGJChronology.mod(iChronology.fixedFromMillis(millis), 7); [EOL]     if (dayOfWeek == 0) { [EOL]         dayOfWeek = 7; [EOL]     } [EOL]     return dayOfWeek; [EOL] } <line_num>: 30,36
public long set(long millis, int value) { [EOL]     return add(millis, (long) value - get(millis)); [EOL] } <line_num>: 38,40
public long add(long millis, long value) { [EOL]     return millis + value * TestGJChronology.MILLIS_PER_DAY; [EOL] } <line_num>: 42,44
public DurationField getRangeDurationField() { [EOL]     return iChronology.weeks(); [EOL] } <line_num>: 46,48
public int getMinimumValue() { [EOL]     return 1; [EOL] } <line_num>: 50,52
public int getMaximumValue() { [EOL]     return 7; [EOL] } <line_num>: 54,56
public long roundFloor(long millis) { [EOL]     return iChronology.getDateOnlyMillis(millis); [EOL] } <line_num>: 58,60
