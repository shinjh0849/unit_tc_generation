BasicFixedMonthChronology(Chronology base, Object param, int minDaysInFirstWeek) { [EOL]     super(base, param, minDaysInFirstWeek); [EOL] } <line_num>: 58,60
long setYear(long instant, int year) { [EOL]     int thisYear = getYear(instant); [EOL]     int dayOfYear = getDayOfYear(instant, thisYear); [EOL]     int millisOfDay = getMillisOfDay(instant); [EOL]     if (dayOfYear > 365) { [EOL]         if (!isLeapYear(year)) { [EOL]             dayOfYear--; [EOL]         } [EOL]     } [EOL]     instant = getYearMonthDayMillis(year, 1, dayOfYear); [EOL]     instant += millisOfDay; [EOL]     return instant; [EOL] } <line_num>: 63,80
long getYearDifference(long minuendInstant, long subtrahendInstant) { [EOL]     int minuendYear = getYear(minuendInstant); [EOL]     int subtrahendYear = getYear(subtrahendInstant); [EOL]     long minuendRem = minuendInstant - getYearMillis(minuendYear); [EOL]     long subtrahendRem = subtrahendInstant - getYearMillis(subtrahendYear); [EOL]     int difference = minuendYear - subtrahendYear; [EOL]     if (minuendRem < subtrahendRem) { [EOL]         difference--; [EOL]     } [EOL]     return difference; [EOL] } <line_num>: 83,97
long getTotalMillisByYearMonth(int year, int month) { [EOL]     return ((month - 1) * MILLIS_PER_MONTH); [EOL] } <line_num>: 100,102
int getDayOfMonth(long millis) { [EOL]     return (getDayOfYear(millis) - 1) % MONTH_LENGTH + 1; [EOL] } <line_num>: 105,108
boolean isLeapYear(int year) { [EOL]     return (year & 3) == 3; [EOL] } <line_num>: 111,113
int getDaysInYearMonth(int year, int month) { [EOL]     return (month != 13) ? MONTH_LENGTH : (isLeapYear(year) ? 6 : 5); [EOL] } <line_num>: 116,118
int getDaysInMonthMax() { [EOL]     return MONTH_LENGTH; [EOL] } <line_num>: 121,123
int getDaysInMonthMax(int month) { [EOL]     return (month != 13 ? MONTH_LENGTH : 6); [EOL] } <line_num>: 126,128
int getMonthOfYear(long millis) { [EOL]     return (getDayOfYear(millis) - 1) / MONTH_LENGTH + 1; [EOL] } <line_num>: 131,133
int getMonthOfYear(long millis, int year) { [EOL]     long monthZeroBased = (millis - getYearMillis(year)) / MILLIS_PER_MONTH; [EOL]     return ((int) monthZeroBased) + 1; [EOL] } <line_num>: 136,139
int getMaxMonth() { [EOL]     return 13; [EOL] } <line_num>: 142,144
long getAverageMillisPerYear() { [EOL]     return MILLIS_PER_YEAR; [EOL] } <line_num>: 147,149
long getAverageMillisPerYearDividedByTwo() { [EOL]     return MILLIS_PER_YEAR / 2; [EOL] } <line_num>: 152,154
long getAverageMillisPerMonth() { [EOL]     return MILLIS_PER_MONTH; [EOL] } <line_num>: 157,159
