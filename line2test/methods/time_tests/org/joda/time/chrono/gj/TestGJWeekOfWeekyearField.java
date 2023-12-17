public TestGJWeekOfWeekyearField(TestGJChronology chrono) { [EOL]     super(DateTimeFieldType.weekOfWeekyear(), (long) (TestGJChronology.MILLIS_PER_DAY * 7), chrono); [EOL] } <line_num>: 26,29
public int get(long millis) { [EOL]     return iChronology.isoFromMillis(millis)[1]; [EOL] } <line_num>: 31,33
public long set(long millis, int value) { [EOL]     int[] wwd = iChronology.isoFromMillis(millis); [EOL]     return iChronology.getTimeOnlyMillis(millis) + iChronology.millisFromISO(wwd[0], value, wwd[2]); [EOL] } <line_num>: 35,39
public long add(long millis, long value) { [EOL]     return iChronology.dayOfYear().add(millis, value * 7); [EOL] } <line_num>: 41,43
public DurationField getRangeDurationField() { [EOL]     return iChronology.weeks(); [EOL] } <line_num>: 45,47
public int getMinimumValue() { [EOL]     return 1; [EOL] } <line_num>: 49,51
public int getMaximumValue() { [EOL]     return 53; [EOL] } <line_num>: 53,55
public int getMaximumValue(long millis) { [EOL]     millis = iChronology.weekyear().roundFloor(millis); [EOL]     millis = iChronology.weekyear().add(millis, 1); [EOL]     millis = iChronology.dayOfYear().add(millis, -1); [EOL]     return get(millis); [EOL] } <line_num>: 57,63
public long roundFloor(long millis) { [EOL]     int[] wwd = iChronology.isoFromMillis(millis); [EOL]     return iChronology.millisFromISO(wwd[0], wwd[1], 1); [EOL] } <line_num>: 65,68
