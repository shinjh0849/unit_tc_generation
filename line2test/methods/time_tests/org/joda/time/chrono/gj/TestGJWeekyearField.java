public TestGJWeekyearField(TestGJChronology chrono) { [EOL]     super(DateTimeFieldType.weekyear(), chrono.millisPerYear(), chrono); [EOL] } <line_num>: 26,28
public int get(long millis) { [EOL]     return iChronology.isoFromMillis(millis)[0]; [EOL] } <line_num>: 30,32
public long set(long millis, int value) { [EOL]     int[] wwd = iChronology.isoFromMillis(millis); [EOL]     millis = iChronology.getTimeOnlyMillis(millis) + iChronology.millisFromISO(value, wwd[1], wwd[2]); [EOL]     if (wwd[1] == 53) { [EOL]         int[] wwd2 = iChronology.isoFromMillis(millis); [EOL]         if (wwd2[0] != value) { [EOL]             millis = iChronology.dayOfYear().add(millis, -7); [EOL]         } [EOL]     } [EOL]     return millis; [EOL] } <line_num>: 34,46
public long add(long millis, long value) { [EOL]     return set(millis, (int) (get(millis) + value)); [EOL] } <line_num>: 48,50
public boolean isLeap(long millis) { [EOL]     return iChronology.weekOfWeekyear().getMaximumValue(millis) > 52; [EOL] } <line_num>: 52,54
public int getLeapAmount(long millis) { [EOL]     return iChronology.weekOfWeekyear().getMaximumValue(millis) - 52; [EOL] } <line_num>: 56,58
public DurationField getLeapDurationField() { [EOL]     return iChronology.weeks(); [EOL] } <line_num>: 60,62
public DurationField getRangeDurationField() { [EOL]     return null; [EOL] } <line_num>: 64,66
public int getMinimumValue() { [EOL]     return -100000000; [EOL] } <line_num>: 68,70
public int getMaximumValue() { [EOL]     return 100000000; [EOL] } <line_num>: 72,74
public long roundFloor(long millis) { [EOL]     return iChronology.millisFromISO(get(millis), 1, 1); [EOL] } <line_num>: 76,78
