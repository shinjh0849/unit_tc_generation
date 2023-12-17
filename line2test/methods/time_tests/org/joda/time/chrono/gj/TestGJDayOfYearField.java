public TestGJDayOfYearField(TestGJChronology chrono) { [EOL]     super(DateTimeFieldType.dayOfYear(), TestGJChronology.MILLIS_PER_DAY, chrono); [EOL] } <line_num>: 26,28
public int get(long millis) { [EOL]     int year = iChronology.gjYearFromMillis(millis); [EOL]     return (int) (iChronology.fixedFromMillis(millis) - iChronology.fixedFromGJ(year, 1, 1)) + 1; [EOL] } <line_num>: 30,34
public long set(long millis, int value) { [EOL]     return add(millis, (long) value - get(millis)); [EOL] } <line_num>: 36,38
public long add(long millis, long value) { [EOL]     return millis + value * TestGJChronology.MILLIS_PER_DAY; [EOL] } <line_num>: 40,42
public DurationField getRangeDurationField() { [EOL]     return iChronology.years(); [EOL] } <line_num>: 44,46
public int getMinimumValue() { [EOL]     return 1; [EOL] } <line_num>: 48,50
public int getMaximumValue() { [EOL]     return 366; [EOL] } <line_num>: 52,54
public int getMaximumValue(long millis) { [EOL]     return iChronology.year().isLeap(millis) ? 366 : 365; [EOL] } <line_num>: 56,58
public long roundFloor(long millis) { [EOL]     return iChronology.getDateOnlyMillis(millis); [EOL] } <line_num>: 60,62
