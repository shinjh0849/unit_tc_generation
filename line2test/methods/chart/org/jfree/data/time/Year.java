public Year() { [EOL]     this(new Date()); [EOL] } <line_num>: 105,107
public Year(int year) { [EOL]     if ((year < Year.MINIMUM_YEAR) || (year > Year.MAXIMUM_YEAR)) { [EOL]         throw new IllegalArgumentException("Year constructor: year (" + year + ") outside valid range."); [EOL]     } [EOL]     this.year = (short) year; [EOL]     peg(Calendar.getInstance()); [EOL] } <line_num>: 114,121
public Year(Date time) { [EOL]     this(time, TimeZone.getDefault()); [EOL] } <line_num>: 131,133
public Year(Date time, TimeZone zone) { [EOL]     this(time, zone, Locale.getDefault()); [EOL] } <line_num>: 144,146
public Year(Date time, TimeZone zone, Locale locale) { [EOL]     Calendar calendar = Calendar.getInstance(zone, locale); [EOL]     calendar.setTime(time); [EOL]     this.year = (short) calendar.get(Calendar.YEAR); [EOL]     peg(calendar); [EOL] } <line_num>: 158,163
public int getYear() { [EOL]     return this.year; [EOL] } <line_num>: 170,172
public long getFirstMillisecond() { [EOL]     return this.firstMillisecond; [EOL] } <line_num>: 184,186
public long getLastMillisecond() { [EOL]     return this.lastMillisecond; [EOL] } <line_num>: 198,200
public void peg(Calendar calendar) { [EOL]     this.firstMillisecond = getFirstMillisecond(calendar); [EOL]     this.lastMillisecond = getLastMillisecond(calendar); [EOL] } <line_num>: 210,213
public RegularTimePeriod previous() { [EOL]     if (this.year > Year.MINIMUM_YEAR) { [EOL]         return new Year(this.year - 1); [EOL]     } else { [EOL]         return null; [EOL]     } [EOL] } <line_num>: 221,228
public RegularTimePeriod next() { [EOL]     if (this.year < Year.MAXIMUM_YEAR) { [EOL]         return new Year(this.year + 1); [EOL]     } else { [EOL]         return null; [EOL]     } [EOL] } <line_num>: 236,243
public long getSerialIndex() { [EOL]     return this.year; [EOL] } <line_num>: 252,254
public long getFirstMillisecond(Calendar calendar) { [EOL]     calendar.set(this.year, Calendar.JANUARY, 1, 0, 0, 0); [EOL]     calendar.set(Calendar.MILLISECOND, 0); [EOL]     return calendar.getTime().getTime(); [EOL] } <line_num>: 267,273
public long getLastMillisecond(Calendar calendar) { [EOL]     calendar.set(this.year, Calendar.DECEMBER, 31, 23, 59, 59); [EOL]     calendar.set(Calendar.MILLISECOND, 999); [EOL]     return calendar.getTime().getTime(); [EOL] } <line_num>: 286,292
public boolean equals(Object obj) { [EOL]     if (obj == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(obj instanceof Year)) { [EOL]         return false; [EOL]     } [EOL]     Year that = (Year) obj; [EOL]     return (this.year == that.year); [EOL] } <line_num>: 305,314
public int hashCode() { [EOL]     int result = 17; [EOL]     int c = this.year; [EOL]     result = 37 * result + c; [EOL]     return result; [EOL] } <line_num>: 325,330
public int compareTo(Object o1) { [EOL]     int result; [EOL]     if (o1 instanceof Year) { [EOL]         Year y = (Year) o1; [EOL]         result = this.year - y.getYear(); [EOL]     } else if (o1 instanceof RegularTimePeriod) { [EOL]         result = 0; [EOL]     } else { [EOL]         result = 1; [EOL]     } [EOL]     return result; [EOL] } <line_num>: 342,369
public String toString() { [EOL]     return Integer.toString(this.year); [EOL] } <line_num>: 376,378
public static Year parseYear(String s) { [EOL]     int y; [EOL]     try { [EOL]         y = Integer.parseInt(s.trim()); [EOL]     } catch (NumberFormatException e) { [EOL]         throw new TimePeriodFormatException("Cannot parse string."); [EOL]     } [EOL]     try { [EOL]         return new Year(y); [EOL]     } catch (IllegalArgumentException e) { [EOL]         throw new TimePeriodFormatException("Year outside valid range."); [EOL]     } [EOL] } <line_num>: 390,408
