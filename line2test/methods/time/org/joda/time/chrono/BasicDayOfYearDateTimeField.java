BasicDayOfYearDateTimeField(BasicChronology chronology, DurationField days) { [EOL]     super(DateTimeFieldType.dayOfYear(), days); [EOL]     iChronology = chronology; [EOL] } <line_num>: 41,44
public int get(long instant) { [EOL]     return iChronology.getDayOfYear(instant); [EOL] } <line_num>: 52,54
public DurationField getRangeDurationField() { [EOL]     return iChronology.years(); [EOL] } <line_num>: 56,58
public int getMinimumValue() { [EOL]     return 1; [EOL] } <line_num>: 60,62
public int getMaximumValue() { [EOL]     return iChronology.getDaysInYearMax(); [EOL] } <line_num>: 64,66
public int getMaximumValue(long instant) { [EOL]     int year = iChronology.getYear(instant); [EOL]     return iChronology.getDaysInYear(year); [EOL] } <line_num>: 68,71
public int getMaximumValue(ReadablePartial partial) { [EOL]     if (partial.isSupported(DateTimeFieldType.year())) { [EOL]         int year = partial.get(DateTimeFieldType.year()); [EOL]         return iChronology.getDaysInYear(year); [EOL]     } [EOL]     return iChronology.getDaysInYearMax(); [EOL] } <line_num>: 73,79
public int getMaximumValue(ReadablePartial partial, int[] values) { [EOL]     int size = partial.size(); [EOL]     for (int i = 0; i < size; i++) { [EOL]         if (partial.getFieldType(i) == DateTimeFieldType.year()) { [EOL]             int year = values[i]; [EOL]             return iChronology.getDaysInYear(year); [EOL]         } [EOL]     } [EOL]     return iChronology.getDaysInYearMax(); [EOL] } <line_num>: 81,90
protected int getMaximumValueForSet(long instant, int value) { [EOL]     int maxLessOne = iChronology.getDaysInYearMax() - 1; [EOL]     return (value > maxLessOne || value < 1) ? getMaximumValue(instant) : maxLessOne; [EOL] } <line_num>: 92,95
private Object readResolve() { [EOL]     return iChronology.dayOfYear(); [EOL] } <line_num>: 100,102
