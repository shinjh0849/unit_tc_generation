BasicYearDateTimeField(BasicChronology chronology) { [EOL]     super(DateTimeFieldType.year(), chronology.getAverageMillisPerYear()); [EOL]     iChronology = chronology; [EOL] } <line_num>: 45,48
public boolean isLenient() { [EOL]     return false; [EOL] } <line_num>: 50,52
public int get(long instant) { [EOL]     return iChronology.getYear(instant); [EOL] } <line_num>: 54,56
public long add(long instant, int years) { [EOL]     if (years == 0) { [EOL]         return instant; [EOL]     } [EOL]     int thisYear = get(instant); [EOL]     int newYear = FieldUtils.safeAdd(thisYear, years); [EOL]     return set(instant, newYear); [EOL] } <line_num>: 58,65
public long add(long instant, long years) { [EOL]     return add(instant, FieldUtils.safeToInt(years)); [EOL] } <line_num>: 67,69
public long addWrapField(long instant, int years) { [EOL]     if (years == 0) { [EOL]         return instant; [EOL]     } [EOL]     int thisYear = iChronology.getYear(instant); [EOL]     int wrappedYear = FieldUtils.getWrappedValue(thisYear, years, iChronology.getMinYear(), iChronology.getMaxYear()); [EOL]     return set(instant, wrappedYear); [EOL] } <line_num>: 71,80
public long set(long instant, int year) { [EOL]     FieldUtils.verifyValueBounds(this, year, iChronology.getMinYear(), iChronology.getMaxYear()); [EOL]     return iChronology.setYear(instant, year); [EOL] } <line_num>: 82,86
public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) { [EOL]     if (minuendInstant < subtrahendInstant) { [EOL]         return -iChronology.getYearDifference(subtrahendInstant, minuendInstant); [EOL]     } [EOL]     return iChronology.getYearDifference(minuendInstant, subtrahendInstant); [EOL] } <line_num>: 88,93
public DurationField getRangeDurationField() { [EOL]     return null; [EOL] } <line_num>: 95,97
public boolean isLeap(long instant) { [EOL]     return iChronology.isLeapYear(get(instant)); [EOL] } <line_num>: 99,101
public int getLeapAmount(long instant) { [EOL]     if (iChronology.isLeapYear(get(instant))) { [EOL]         return 1; [EOL]     } else { [EOL]         return 0; [EOL]     } [EOL] } <line_num>: 103,109
public DurationField getLeapDurationField() { [EOL]     return iChronology.days(); [EOL] } <line_num>: 111,113
public int getMinimumValue() { [EOL]     return iChronology.getMinYear(); [EOL] } <line_num>: 115,117
public int getMaximumValue() { [EOL]     return iChronology.getMaxYear(); [EOL] } <line_num>: 119,121
public long roundFloor(long instant) { [EOL]     return iChronology.getYearMillis(get(instant)); [EOL] } <line_num>: 123,125
public long roundCeiling(long instant) { [EOL]     int year = get(instant); [EOL]     long yearStartMillis = iChronology.getYearMillis(year); [EOL]     if (instant != yearStartMillis) { [EOL]         instant = iChronology.getYearMillis(year + 1); [EOL]     } [EOL]     return instant; [EOL] } <line_num>: 127,135
public long remainder(long instant) { [EOL]     return instant - roundFloor(instant); [EOL] } <line_num>: 137,139
private Object readResolve() { [EOL]     return iChronology.year(); [EOL] } <line_num>: 144,146
