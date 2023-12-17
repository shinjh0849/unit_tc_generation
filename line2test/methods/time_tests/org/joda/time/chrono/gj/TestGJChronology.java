public TestGJChronology(int epochYear, int epochMonth, int epochDay) { [EOL]     iEpochMillis = fixedFromGJ(epochYear, epochMonth, epochDay) * MILLIS_PER_DAY; [EOL] } <line_num>: 90,92
static long div(long dividend, long divisor) { [EOL]     if (divisor < 0) { [EOL]         throw new IllegalArgumentException("divisor must be positive: " + divisor); [EOL]     } [EOL]     if (dividend >= 0) { [EOL]         return dividend / divisor; [EOL]     } else { [EOL]         return (dividend + 1) / divisor - 1; [EOL]     } [EOL] } <line_num>: 55,64
static long mod(long dividend, long divisor) { [EOL]     if (divisor < 0) { [EOL]         throw new IllegalArgumentException("divisor must be positive: " + divisor); [EOL]     } [EOL]     if (dividend >= 0) { [EOL]         return dividend % divisor; [EOL]     } else { [EOL]         return (dividend + 1) % divisor - 1 + divisor; [EOL]     } [EOL] } <line_num>: 71,80
static long amod(long dividend, long divisor) { [EOL]     long mod = mod(dividend, divisor); [EOL]     return (mod == 0) ? divisor : mod; [EOL] } <line_num>: 82,85
public DateTimeZone getZone() { [EOL]     return null; [EOL] } <line_num>: 94,96
public Chronology withUTC() { [EOL]     return this; [EOL] } <line_num>: 98,100
public Chronology withZone(DateTimeZone zone) { [EOL]     throw new UnsupportedOperationException(); [EOL] } <line_num>: 105,107
long getTimeOnlyMillis(long millis) { [EOL]     return mod(millis, MILLIS_PER_DAY); [EOL] } <line_num>: 109,111
long getDateOnlyMillis(long millis) { [EOL]     return millis - mod(millis, MILLIS_PER_DAY); [EOL] } <line_num>: 113,115
public DurationField days() { [EOL]     return dayOfWeek().getDurationField(); [EOL] } <line_num>: 117,119
public DateTimeField dayOfWeek() { [EOL]     return new TestGJDayOfWeekField(this); [EOL] } <line_num>: 121,123
public DateTimeField dayOfMonth() { [EOL]     return new TestGJDayOfMonthField(this); [EOL] } <line_num>: 125,127
public DateTimeField dayOfYear() { [EOL]     return new TestGJDayOfYearField(this); [EOL] } <line_num>: 129,131
public DurationField weeks() { [EOL]     return weekOfWeekyear().getDurationField(); [EOL] } <line_num>: 133,135
public DateTimeField weekOfWeekyear() { [EOL]     return new TestGJWeekOfWeekyearField(this); [EOL] } <line_num>: 137,139
public DurationField weekyears() { [EOL]     return weekyear().getDurationField(); [EOL] } <line_num>: 141,143
public DateTimeField weekyear() { [EOL]     return new TestGJWeekyearField(this); [EOL] } <line_num>: 145,147
public DurationField months() { [EOL]     return monthOfYear().getDurationField(); [EOL] } <line_num>: 149,151
public DateTimeField monthOfYear() { [EOL]     return new TestGJMonthOfYearField(this); [EOL] } <line_num>: 153,155
public DurationField years() { [EOL]     return year().getDurationField(); [EOL] } <line_num>: 157,159
public DateTimeField year() { [EOL]     return new TestGJYearField(this); [EOL] } <line_num>: 161,163
abstract long millisPerYear(); <line_num>: 165,165
abstract long millisPerMonth(); <line_num>: 167,167
abstract boolean isLeapYear(int year); <line_num>: 169,169
abstract long fixedFromGJ(int year, int monthOfYear, int dayOfMonth); <line_num>: 174,174
abstract int gjYearFromFixed(long date); <line_num>: 180,180
abstract int[] gjFromFixed(long date); <line_num>: 186,186
abstract long fixedFromISO(int weekyear, int weekOfWeekyear, int dayOfWeek); <line_num>: 188,188
abstract int[] isoFromFixed(long date); <line_num>: 194,194
long fixedFromMillis(long millis) { [EOL]     return div(millis + iEpochMillis, MILLIS_PER_DAY); [EOL] } <line_num>: 200,202
long millisFromFixed(long fixed) { [EOL]     return fixed * MILLIS_PER_DAY - iEpochMillis; [EOL] } <line_num>: 208,210
long millisFromGJ(int year, int monthOfYear, int dayOfMonth) { [EOL]     return millisFromFixed(fixedFromGJ(year, monthOfYear, dayOfMonth)); [EOL] } <line_num>: 215,217
int gjYearFromMillis(long millis) { [EOL]     return gjYearFromFixed(fixedFromMillis(millis)); [EOL] } <line_num>: 223,225
int[] gjFromMillis(long millis) { [EOL]     return gjFromFixed(fixedFromMillis(millis)); [EOL] } <line_num>: 231,233
long millisFromISO(int weekyear, int weekOfWeekyear, int dayOfWeek) { [EOL]     return millisFromFixed(fixedFromISO(weekyear, weekOfWeekyear, dayOfWeek)); [EOL] } <line_num>: 238,240
int[] isoFromMillis(long millis) { [EOL]     return isoFromFixed(fixedFromMillis(millis)); [EOL] } <line_num>: 246,248
long weekdayOnOrBefore(long date, int weekday) { [EOL]     return date - mod(date - mod(weekday, 7), 7); [EOL] } <line_num>: 255,257
long weekdayOnOrAfter(long date, int weekday) { [EOL]     return weekdayOnOrBefore(date + 6, weekday); [EOL] } <line_num>: 259,261
long weekdayNearest(long date, int weekday) { [EOL]     return weekdayOnOrBefore(date + 3, weekday); [EOL] } <line_num>: 263,265
long weekdayBefore(long date, int weekday) { [EOL]     return weekdayOnOrBefore(date - 1, weekday); [EOL] } <line_num>: 267,269
long weekdayAfter(long date, int weekday) { [EOL]     return weekdayOnOrBefore(date + 7, weekday); [EOL] } <line_num>: 271,273
long nthWeekday(int n, int weekday, int year, int monthOfYear, int dayOfMonth) { [EOL]     if (n > 0) { [EOL]         return 7 * n + weekdayBefore(fixedFromGJ(year, monthOfYear, dayOfMonth), weekday); [EOL]     } else { [EOL]         return 7 * n + weekdayAfter(fixedFromGJ(year, monthOfYear, dayOfMonth), weekday); [EOL]     } [EOL] } <line_num>: 275,285
long firstWeekday(int weekday, int year, int monthOfYear, int dayOfMonth) { [EOL]     return nthWeekday(1, weekday, year, monthOfYear, dayOfMonth); [EOL] } <line_num>: 287,289
long lastWeekday(int weekday, int year, int monthOfYear, int dayOfMonth) { [EOL]     return nthWeekday(-1, weekday, year, monthOfYear, dayOfMonth); [EOL] } <line_num>: 291,293
