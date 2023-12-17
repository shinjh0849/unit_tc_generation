public TestJulianYearField(TestJulianChronology chrono) { [EOL]     super(chrono); [EOL] } <line_num>: 25,27
public long addWrapField(long millis, int value) { [EOL]     int year = get(millis); [EOL]     int wrapped = FieldUtils.getWrappedValue(year, value, getMinimumValue(), getMaximumValue()); [EOL]     return add(millis, (long) wrapped - year); [EOL] } <line_num>: 29,34
public long add(long millis, long value) { [EOL]     int year = get(millis); [EOL]     int newYear = year + FieldUtils.safeToInt(value); [EOL]     if (year < 0) { [EOL]         if (newYear >= 0) { [EOL]             newYear++; [EOL]         } [EOL]     } else { [EOL]         if (newYear <= 0) { [EOL]             newYear--; [EOL]         } [EOL]     } [EOL]     return set(millis, newYear); [EOL] } <line_num>: 36,49
public int getMinimumValue() { [EOL]     return -100000000; [EOL] } <line_num>: 51,53
public int getMaximumValue() { [EOL]     return 100000000; [EOL] } <line_num>: 55,57
