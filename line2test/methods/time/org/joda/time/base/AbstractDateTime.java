protected AbstractDateTime() { [EOL]     super(); [EOL] } <line_num>: 50,52
public int get(DateTimeFieldType type) { [EOL]     if (type == null) { [EOL]         throw new IllegalArgumentException("The DateTimeFieldType must not be null"); [EOL]     } [EOL]     return type.getField(getChronology()).get(getMillis()); [EOL] } <line_num>: 65,70
public int getEra() { [EOL]     return getChronology().era().get(getMillis()); [EOL] } <line_num>: 78,80
public int getCenturyOfEra() { [EOL]     return getChronology().centuryOfEra().get(getMillis()); [EOL] } <line_num>: 87,89
public int getYearOfEra() { [EOL]     return getChronology().yearOfEra().get(getMillis()); [EOL] } <line_num>: 96,98
public int getYearOfCentury() { [EOL]     return getChronology().yearOfCentury().get(getMillis()); [EOL] } <line_num>: 105,107
public int getYear() { [EOL]     return getChronology().year().get(getMillis()); [EOL] } <line_num>: 114,116
public int getWeekyear() { [EOL]     return getChronology().weekyear().get(getMillis()); [EOL] } <line_num>: 129,131
public int getMonthOfYear() { [EOL]     return getChronology().monthOfYear().get(getMillis()); [EOL] } <line_num>: 138,140
public int getWeekOfWeekyear() { [EOL]     return getChronology().weekOfWeekyear().get(getMillis()); [EOL] } <line_num>: 152,154
public int getDayOfYear() { [EOL]     return getChronology().dayOfYear().get(getMillis()); [EOL] } <line_num>: 161,163
public int getDayOfMonth() { [EOL]     return getChronology().dayOfMonth().get(getMillis()); [EOL] } <line_num>: 172,174
public int getDayOfWeek() { [EOL]     return getChronology().dayOfWeek().get(getMillis()); [EOL] } <line_num>: 183,185
public int getHourOfDay() { [EOL]     return getChronology().hourOfDay().get(getMillis()); [EOL] } <line_num>: 193,195
public int getMinuteOfDay() { [EOL]     return getChronology().minuteOfDay().get(getMillis()); [EOL] } <line_num>: 202,204
public int getMinuteOfHour() { [EOL]     return getChronology().minuteOfHour().get(getMillis()); [EOL] } <line_num>: 211,213
public int getSecondOfDay() { [EOL]     return getChronology().secondOfDay().get(getMillis()); [EOL] } <line_num>: 220,222
public int getSecondOfMinute() { [EOL]     return getChronology().secondOfMinute().get(getMillis()); [EOL] } <line_num>: 229,231
public int getMillisOfDay() { [EOL]     return getChronology().millisOfDay().get(getMillis()); [EOL] } <line_num>: 238,240
public int getMillisOfSecond() { [EOL]     return getChronology().millisOfSecond().get(getMillis()); [EOL] } <line_num>: 247,249
public Calendar toCalendar(Locale locale) { [EOL]     if (locale == null) { [EOL]         locale = Locale.getDefault(); [EOL]     } [EOL]     DateTimeZone zone = getZone(); [EOL]     Calendar cal = Calendar.getInstance(zone.toTimeZone(), locale); [EOL]     cal.setTime(toDate()); [EOL]     return cal; [EOL] } <line_num>: 269,277
public GregorianCalendar toGregorianCalendar() { [EOL]     DateTimeZone zone = getZone(); [EOL]     GregorianCalendar cal = new GregorianCalendar(zone.toTimeZone()); [EOL]     cal.setTime(toDate()); [EOL]     return cal; [EOL] } <line_num>: 293,298
public String toString(String pattern) { [EOL]     if (pattern == null) { [EOL]         return toString(); [EOL]     } [EOL]     return DateTimeFormat.forPattern(pattern).print(this); [EOL] } <line_num>: 307,312
public String toString(String pattern, Locale locale) throws IllegalArgumentException { [EOL]     if (pattern == null) { [EOL]         return toString(); [EOL]     } [EOL]     return DateTimeFormat.forPattern(pattern).withLocale(locale).print(this); [EOL] } <line_num>: 321,326
