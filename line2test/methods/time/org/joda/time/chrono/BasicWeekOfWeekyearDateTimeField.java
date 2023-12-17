BasicWeekOfWeekyearDateTimeField(BasicChronology chronology, DurationField weeks) { [EOL]     super(DateTimeFieldType.weekOfWeekyear(), weeks); [EOL]     iChronology = chronology; [EOL] } <line_num>: 42,45
public int get(long instant) { [EOL]     return iChronology.getWeekOfWeekyear(instant); [EOL] } <line_num>: 54,56
public DurationField getRangeDurationField() { [EOL]     return iChronology.weekyears(); [EOL] } <line_num>: 58,60
public long roundFloor(long instant) { [EOL]     return super.roundFloor(instant + 3 * DateTimeConstants.MILLIS_PER_DAY) - 3 * DateTimeConstants.MILLIS_PER_DAY; [EOL] } <line_num>: 65,68
public long roundCeiling(long instant) { [EOL]     return super.roundCeiling(instant + 3 * DateTimeConstants.MILLIS_PER_DAY) - 3 * DateTimeConstants.MILLIS_PER_DAY; [EOL] } <line_num>: 70,73
public long remainder(long instant) { [EOL]     return super.remainder(instant + 3 * DateTimeConstants.MILLIS_PER_DAY); [EOL] } <line_num>: 75,77
public int getMinimumValue() { [EOL]     return 1; [EOL] } <line_num>: 79,81
public int getMaximumValue() { [EOL]     return 53; [EOL] } <line_num>: 83,85
public int getMaximumValue(long instant) { [EOL]     int weekyear = iChronology.getWeekyear(instant); [EOL]     return iChronology.getWeeksInYear(weekyear); [EOL] } <line_num>: 87,90
public int getMaximumValue(ReadablePartial partial) { [EOL]     if (partial.isSupported(DateTimeFieldType.weekyear())) { [EOL]         int weekyear = partial.get(DateTimeFieldType.weekyear()); [EOL]         return iChronology.getWeeksInYear(weekyear); [EOL]     } [EOL]     return 53; [EOL] } <line_num>: 92,98
public int getMaximumValue(ReadablePartial partial, int[] values) { [EOL]     int size = partial.size(); [EOL]     for (int i = 0; i < size; i++) { [EOL]         if (partial.getFieldType(i) == DateTimeFieldType.weekyear()) { [EOL]             int weekyear = values[i]; [EOL]             return iChronology.getWeeksInYear(weekyear); [EOL]         } [EOL]     } [EOL]     return 53; [EOL] } <line_num>: 100,109
protected int getMaximumValueForSet(long instant, int value) { [EOL]     return value > 52 ? getMaximumValue(instant) : 52; [EOL] } <line_num>: 111,113
private Object readResolve() { [EOL]     return iChronology.weekOfWeekyear(); [EOL] } <line_num>: 118,120
