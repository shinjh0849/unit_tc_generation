public TestGJYearField(TestGJChronology chrono) { [EOL]     super(DateTimeFieldType.year(), chrono.millisPerYear(), chrono); [EOL] } <line_num>: 26,28
public int get(long millis) { [EOL]     return iChronology.gjYearFromMillis(millis); [EOL] } <line_num>: 30,32
public long set(long millis, int value) { [EOL]     int[] ymd = iChronology.gjFromMillis(millis); [EOL]     millis = iChronology.getTimeOnlyMillis(millis) + iChronology.millisFromGJ(value, ymd[1], ymd[2]); [EOL]     if (ymd[1] == 2 && ymd[2] == 29 && !iChronology.isLeapYear(value)) { [EOL]         millis = iChronology.dayOfYear().add(millis, -1); [EOL]     } [EOL]     return millis; [EOL] } <line_num>: 34,42
public long add(long millis, long value) { [EOL]     return set(millis, (int) (get(millis) + value)); [EOL] } <line_num>: 44,46
public boolean isLeap(long millis) { [EOL]     return iChronology.isLeapYear(get(millis)); [EOL] } <line_num>: 48,50
public int getLeapAmount(long millis) { [EOL]     return isLeap(millis) ? 1 : 0; [EOL] } <line_num>: 52,54
public DurationField getLeapDurationField() { [EOL]     return iChronology.days(); [EOL] } <line_num>: 56,58
public DurationField getRangeDurationField() { [EOL]     return null; [EOL] } <line_num>: 60,62
public int getMinimumValue() { [EOL]     return -100000000; [EOL] } <line_num>: 64,66
public int getMaximumValue() { [EOL]     return 100000000; [EOL] } <line_num>: 68,70
public long roundFloor(long millis) { [EOL]     return iChronology.millisFromGJ(get(millis), 1, 1); [EOL] } <line_num>: 72,74
