public TestGJDayOfMonthField(TestGJChronology chrono) { [EOL]     super(DateTimeFieldType.dayOfMonth(), TestGJChronology.MILLIS_PER_DAY, chrono); [EOL] } <line_num>: 26,28
public int get(long millis) { [EOL]     return iChronology.gjFromMillis(millis)[2]; [EOL] } <line_num>: 30,32
public long set(long millis, int value) { [EOL]     int[] ymd = iChronology.gjFromMillis(millis); [EOL]     return iChronology.getTimeOnlyMillis(millis) + iChronology.millisFromGJ(ymd[0], ymd[1], value); [EOL] } <line_num>: 34,38
public long add(long millis, long value) { [EOL]     return millis + value * TestGJChronology.MILLIS_PER_DAY; [EOL] } <line_num>: 40,42
public DurationField getRangeDurationField() { [EOL]     return iChronology.months(); [EOL] } <line_num>: 44,46
public int getMinimumValue() { [EOL]     return 1; [EOL] } <line_num>: 48,50
public int getMaximumValue() { [EOL]     return 31; [EOL] } <line_num>: 52,54
public int getMaximumValue(long millis) { [EOL]     int[] lengths = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; [EOL]     if (iChronology.year().isLeap(millis)) { [EOL]         lengths[2] = 29; [EOL]     } [EOL]     return lengths[iChronology.monthOfYear().get(millis)]; [EOL] } <line_num>: 56,62
public long roundFloor(long millis) { [EOL]     return iChronology.getDateOnlyMillis(millis); [EOL] } <line_num>: 64,66
