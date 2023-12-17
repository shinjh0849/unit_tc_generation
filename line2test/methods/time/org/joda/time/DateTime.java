public DateTime() { [EOL]     super(); [EOL] } <line_num>: 154,156
public DateTime(DateTimeZone zone) { [EOL]     super(zone); [EOL] } <line_num>: 167,169
public DateTime(Chronology chronology) { [EOL]     super(chronology); [EOL] } <line_num>: 181,183
public DateTime(long instant) { [EOL]     super(instant); [EOL] } <line_num>: 192,194
public DateTime(long instant, DateTimeZone zone) { [EOL]     super(instant, zone); [EOL] } <line_num>: 205,207
public DateTime(long instant, Chronology chronology) { [EOL]     super(instant, chronology); [EOL] } <line_num>: 219,221
public DateTime(Object instant) { [EOL]     super(instant, (Chronology) null); [EOL] } <line_num>: 240,242
public DateTime(Object instant, DateTimeZone zone) { [EOL]     super(instant, zone); [EOL] } <line_num>: 264,266
public DateTime(Object instant, Chronology chronology) { [EOL]     super(instant, DateTimeUtils.getChronology(chronology)); [EOL] } <line_num>: 285,287
public DateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour) { [EOL]     super(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, 0, 0); [EOL] } <line_num>: 301,308
public DateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, DateTimeZone zone) { [EOL]     super(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, 0, 0, zone); [EOL] } <line_num>: 324,333
public DateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, Chronology chronology) { [EOL]     super(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, 0, 0, chronology); [EOL] } <line_num>: 350,359
public DateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute) { [EOL]     super(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, 0); [EOL] } <line_num>: 374,382
public DateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, DateTimeZone zone) { [EOL]     super(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, 0, zone); [EOL] } <line_num>: 399,409
public DateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, Chronology chronology) { [EOL]     super(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, 0, chronology); [EOL] } <line_num>: 427,437
public DateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) { [EOL]     super(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond); [EOL] } <line_num>: 452,461
public DateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond, DateTimeZone zone) { [EOL]     super(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond, zone); [EOL] } <line_num>: 478,489
public DateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond, Chronology chronology) { [EOL]     super(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond, chronology); [EOL] } <line_num>: 507,518
Property(DateTime instant, DateTimeField field) { [EOL]     super(); [EOL]     iInstant = instant; [EOL]     iField = field; [EOL] } <line_num>: 2046,2050
public static DateTime now() { [EOL]     return new DateTime(); [EOL] } <line_num>: 88,90
public static DateTime now(DateTimeZone zone) { [EOL]     if (zone == null) { [EOL]         throw new NullPointerException("Zone must not be null"); [EOL]     } [EOL]     return new DateTime(zone); [EOL] } <line_num>: 100,105
public static DateTime now(Chronology chronology) { [EOL]     if (chronology == null) { [EOL]         throw new NullPointerException("Chronology must not be null"); [EOL]     } [EOL]     return new DateTime(chronology); [EOL] } <line_num>: 115,120
@FromString [EOL] public static DateTime parse(String str) { [EOL]     return parse(str, ISODateTimeFormat.dateTimeParser().withOffsetParsed()); [EOL] } <line_num>: 131,134
public static DateTime parse(String str, DateTimeFormatter formatter) { [EOL]     return formatter.parseDateTime(str); [EOL] } <line_num>: 143,145
public DateTime toDateTime() { [EOL]     return this; [EOL] } <line_num>: 526,528
public DateTime toDateTimeISO() { [EOL]     if (getChronology() == ISOChronology.getInstance()) { [EOL]         return this; [EOL]     } [EOL]     return super.toDateTimeISO(); [EOL] } <line_num>: 536,541
public DateTime toDateTime(DateTimeZone zone) { [EOL]     zone = DateTimeUtils.getZone(zone); [EOL]     if (getZone() == zone) { [EOL]         return this; [EOL]     } [EOL]     return super.toDateTime(zone); [EOL] } <line_num>: 549,555
public DateTime toDateTime(Chronology chronology) { [EOL]     chronology = DateTimeUtils.getChronology(chronology); [EOL]     if (getChronology() == chronology) { [EOL]         return this; [EOL]     } [EOL]     return super.toDateTime(chronology); [EOL] } <line_num>: 563,569
public DateTime withMillis(long newMillis) { [EOL]     return (newMillis == getMillis() ? this : new DateTime(newMillis, getChronology())); [EOL] } <line_num>: 581,583
public DateTime withChronology(Chronology newChronology) { [EOL]     newChronology = DateTimeUtils.getChronology(newChronology); [EOL]     return (newChronology == getChronology() ? this : new DateTime(getMillis(), newChronology)); [EOL] } <line_num>: 594,597
public DateTime withZone(DateTimeZone newZone) { [EOL]     return withChronology(getChronology().withZone(newZone)); [EOL] } <line_num>: 617,619
public DateTime withZoneRetainFields(DateTimeZone newZone) { [EOL]     newZone = DateTimeUtils.getZone(newZone); [EOL]     DateTimeZone originalZone = DateTimeUtils.getZone(getZone()); [EOL]     if (newZone == originalZone) { [EOL]         return this; [EOL]     } [EOL]     long millis = originalZone.getMillisKeepLocal(newZone, getMillis()); [EOL]     return new DateTime(millis, getChronology().withZone(newZone)); [EOL] } <line_num>: 638,647
public DateTime withEarlierOffsetAtOverlap() { [EOL]     long newMillis = getZone().adjustOffset(getMillis(), false); [EOL]     return withMillis(newMillis); [EOL] } <line_num>: 664,667
public DateTime withLaterOffsetAtOverlap() { [EOL]     long newMillis = getZone().adjustOffset(getMillis(), true); [EOL]     return withMillis(newMillis); [EOL] } <line_num>: 684,687
public DateTime withDate(int year, int monthOfYear, int dayOfMonth) { [EOL]     Chronology chrono = getChronology(); [EOL]     long instant = getMillis(); [EOL]     instant = chrono.year().set(instant, year); [EOL]     instant = chrono.monthOfYear().set(instant, monthOfYear); [EOL]     instant = chrono.dayOfMonth().set(instant, dayOfMonth); [EOL]     return withMillis(instant); [EOL] } <line_num>: 708,715
public DateTime withTime(int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) { [EOL]     Chronology chrono = getChronology(); [EOL]     long instant = getMillis(); [EOL]     instant = chrono.hourOfDay().set(instant, hourOfDay); [EOL]     instant = chrono.minuteOfHour().set(instant, minuteOfHour); [EOL]     instant = chrono.secondOfMinute().set(instant, secondOfMinute); [EOL]     instant = chrono.millisOfSecond().set(instant, millisOfSecond); [EOL]     return withMillis(instant); [EOL] } <line_num>: 736,744
public DateTime withTimeAtStartOfDay() { [EOL]     return toLocalDate().toDateTimeAtStartOfDay(getZone()); [EOL] } <line_num>: 758,760
public DateTime withFields(ReadablePartial partial) { [EOL]     if (partial == null) { [EOL]         return this; [EOL]     } [EOL]     return withMillis(getChronology().set(partial, getMillis())); [EOL] } <line_num>: 775,780
public DateTime withField(DateTimeFieldType fieldType, int value) { [EOL]     if (fieldType == null) { [EOL]         throw new IllegalArgumentException("Field must not be null"); [EOL]     } [EOL]     long instant = fieldType.getField(getChronology()).set(getMillis(), value); [EOL]     return withMillis(instant); [EOL] } <line_num>: 801,807
public DateTime withFieldAdded(DurationFieldType fieldType, int amount) { [EOL]     if (fieldType == null) { [EOL]         throw new IllegalArgumentException("Field must not be null"); [EOL]     } [EOL]     if (amount == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = fieldType.getField(getChronology()).add(getMillis(), amount); [EOL]     return withMillis(instant); [EOL] } <line_num>: 827,836
public DateTime withDurationAdded(long durationToAdd, int scalar) { [EOL]     if (durationToAdd == 0 || scalar == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().add(getMillis(), durationToAdd, scalar); [EOL]     return withMillis(instant); [EOL] } <line_num>: 849,855
public DateTime withDurationAdded(ReadableDuration durationToAdd, int scalar) { [EOL]     if (durationToAdd == null || scalar == 0) { [EOL]         return this; [EOL]     } [EOL]     return withDurationAdded(durationToAdd.getMillis(), scalar); [EOL] } <line_num>: 867,872
public DateTime withPeriodAdded(ReadablePeriod period, int scalar) { [EOL]     if (period == null || scalar == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().add(period, getMillis(), scalar); [EOL]     return withMillis(instant); [EOL] } <line_num>: 889,895
public DateTime plus(long duration) { [EOL]     return withDurationAdded(duration, 1); [EOL] } <line_num>: 908,910
public DateTime plus(ReadableDuration duration) { [EOL]     return withDurationAdded(duration, 1); [EOL] } <line_num>: 922,924
public DateTime plus(ReadablePeriod period) { [EOL]     return withPeriodAdded(period, 1); [EOL] } <line_num>: 948,950
public DateTime plusYears(int years) { [EOL]     if (years == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().years().add(getMillis(), years); [EOL]     return withMillis(instant); [EOL] } <line_num>: 975,981
public DateTime plusMonths(int months) { [EOL]     if (months == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().months().add(getMillis(), months); [EOL]     return withMillis(instant); [EOL] } <line_num>: 1005,1011
public DateTime plusWeeks(int weeks) { [EOL]     if (weeks == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().weeks().add(getMillis(), weeks); [EOL]     return withMillis(instant); [EOL] } <line_num>: 1031,1037
public DateTime plusDays(int days) { [EOL]     if (days == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().days().add(getMillis(), days); [EOL]     return withMillis(instant); [EOL] } <line_num>: 1066,1072
public DateTime plusHours(int hours) { [EOL]     if (hours == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().hours().add(getMillis(), hours); [EOL]     return withMillis(instant); [EOL] } <line_num>: 1097,1103
public DateTime plusMinutes(int minutes) { [EOL]     if (minutes == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().minutes().add(getMillis(), minutes); [EOL]     return withMillis(instant); [EOL] } <line_num>: 1124,1130
public DateTime plusSeconds(int seconds) { [EOL]     if (seconds == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().seconds().add(getMillis(), seconds); [EOL]     return withMillis(instant); [EOL] } <line_num>: 1151,1157
public DateTime plusMillis(int millis) { [EOL]     if (millis == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().millis().add(getMillis(), millis); [EOL]     return withMillis(instant); [EOL] } <line_num>: 1177,1183
public DateTime minus(long duration) { [EOL]     return withDurationAdded(duration, -1); [EOL] } <line_num>: 1196,1198
public DateTime minus(ReadableDuration duration) { [EOL]     return withDurationAdded(duration, -1); [EOL] } <line_num>: 1210,1212
public DateTime minus(ReadablePeriod period) { [EOL]     return withPeriodAdded(period, -1); [EOL] } <line_num>: 1237,1239
public DateTime minusYears(int years) { [EOL]     if (years == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().years().subtract(getMillis(), years); [EOL]     return withMillis(instant); [EOL] } <line_num>: 1264,1270
public DateTime minusMonths(int months) { [EOL]     if (months == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().months().subtract(getMillis(), months); [EOL]     return withMillis(instant); [EOL] } <line_num>: 1294,1300
public DateTime minusWeeks(int weeks) { [EOL]     if (weeks == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().weeks().subtract(getMillis(), weeks); [EOL]     return withMillis(instant); [EOL] } <line_num>: 1320,1326
public DateTime minusDays(int days) { [EOL]     if (days == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().days().subtract(getMillis(), days); [EOL]     return withMillis(instant); [EOL] } <line_num>: 1355,1361
public DateTime minusHours(int hours) { [EOL]     if (hours == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().hours().subtract(getMillis(), hours); [EOL]     return withMillis(instant); [EOL] } <line_num>: 1387,1393
public DateTime minusMinutes(int minutes) { [EOL]     if (minutes == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().minutes().subtract(getMillis(), minutes); [EOL]     return withMillis(instant); [EOL] } <line_num>: 1414,1420
public DateTime minusSeconds(int seconds) { [EOL]     if (seconds == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().seconds().subtract(getMillis(), seconds); [EOL]     return withMillis(instant); [EOL] } <line_num>: 1441,1447
public DateTime minusMillis(int millis) { [EOL]     if (millis == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().millis().subtract(getMillis(), millis); [EOL]     return withMillis(instant); [EOL] } <line_num>: 1468,1474
public Property property(DateTimeFieldType type) { [EOL]     if (type == null) { [EOL]         throw new IllegalArgumentException("The DateTimeFieldType must not be null"); [EOL]     } [EOL]     DateTimeField field = type.getField(getChronology()); [EOL]     if (field.isSupported() == false) { [EOL]         throw new IllegalArgumentException("Field '" + type + "' is not supported"); [EOL]     } [EOL]     return new Property(this, field); [EOL] } <line_num>: 1484,1493
@Deprecated [EOL] public DateMidnight toDateMidnight() { [EOL]     return new DateMidnight(getMillis(), getChronology()); [EOL] } <line_num>: 1503,1506
@Deprecated [EOL] public YearMonthDay toYearMonthDay() { [EOL]     return new YearMonthDay(getMillis(), getChronology()); [EOL] } <line_num>: 1515,1518
@Deprecated [EOL] public TimeOfDay toTimeOfDay() { [EOL]     return new TimeOfDay(getMillis(), getChronology()); [EOL] } <line_num>: 1527,1530
public LocalDateTime toLocalDateTime() { [EOL]     return new LocalDateTime(getMillis(), getChronology()); [EOL] } <line_num>: 1539,1541
public LocalDate toLocalDate() { [EOL]     return new LocalDate(getMillis(), getChronology()); [EOL] } <line_num>: 1550,1552
public LocalTime toLocalTime() { [EOL]     return new LocalTime(getMillis(), getChronology()); [EOL] } <line_num>: 1561,1563
public DateTime withEra(int era) { [EOL]     return withMillis(getChronology().era().set(getMillis(), era)); [EOL] } <line_num>: 1578,1580
public DateTime withCenturyOfEra(int centuryOfEra) { [EOL]     return withMillis(getChronology().centuryOfEra().set(getMillis(), centuryOfEra)); [EOL] } <line_num>: 1594,1596
public DateTime withYearOfEra(int yearOfEra) { [EOL]     return withMillis(getChronology().yearOfEra().set(getMillis(), yearOfEra)); [EOL] } <line_num>: 1610,1612
public DateTime withYearOfCentury(int yearOfCentury) { [EOL]     return withMillis(getChronology().yearOfCentury().set(getMillis(), yearOfCentury)); [EOL] } <line_num>: 1626,1628
public DateTime withYear(int year) { [EOL]     return withMillis(getChronology().year().set(getMillis(), year)); [EOL] } <line_num>: 1642,1644
public DateTime withWeekyear(int weekyear) { [EOL]     return withMillis(getChronology().weekyear().set(getMillis(), weekyear)); [EOL] } <line_num>: 1664,1666
public DateTime withMonthOfYear(int monthOfYear) { [EOL]     return withMillis(getChronology().monthOfYear().set(getMillis(), monthOfYear)); [EOL] } <line_num>: 1680,1682
public DateTime withWeekOfWeekyear(int weekOfWeekyear) { [EOL]     return withMillis(getChronology().weekOfWeekyear().set(getMillis(), weekOfWeekyear)); [EOL] } <line_num>: 1701,1703
public DateTime withDayOfYear(int dayOfYear) { [EOL]     return withMillis(getChronology().dayOfYear().set(getMillis(), dayOfYear)); [EOL] } <line_num>: 1717,1719
public DateTime withDayOfMonth(int dayOfMonth) { [EOL]     return withMillis(getChronology().dayOfMonth().set(getMillis(), dayOfMonth)); [EOL] } <line_num>: 1733,1735
public DateTime withDayOfWeek(int dayOfWeek) { [EOL]     return withMillis(getChronology().dayOfWeek().set(getMillis(), dayOfWeek)); [EOL] } <line_num>: 1749,1751
public DateTime withHourOfDay(int hour) { [EOL]     return withMillis(getChronology().hourOfDay().set(getMillis(), hour)); [EOL] } <line_num>: 1766,1768
public DateTime withMinuteOfHour(int minute) { [EOL]     return withMillis(getChronology().minuteOfHour().set(getMillis(), minute)); [EOL] } <line_num>: 1782,1784
public DateTime withSecondOfMinute(int second) { [EOL]     return withMillis(getChronology().secondOfMinute().set(getMillis(), second)); [EOL] } <line_num>: 1798,1800
public DateTime withMillisOfSecond(int millis) { [EOL]     return withMillis(getChronology().millisOfSecond().set(getMillis(), millis)); [EOL] } <line_num>: 1814,1816
public DateTime withMillisOfDay(int millis) { [EOL]     return withMillis(getChronology().millisOfDay().set(getMillis(), millis)); [EOL] } <line_num>: 1830,1832
public Property era() { [EOL]     return new Property(this, getChronology().era()); [EOL] } <line_num>: 1841,1843
public Property centuryOfEra() { [EOL]     return new Property(this, getChronology().centuryOfEra()); [EOL] } <line_num>: 1850,1852
public Property yearOfCentury() { [EOL]     return new Property(this, getChronology().yearOfCentury()); [EOL] } <line_num>: 1859,1861
public Property yearOfEra() { [EOL]     return new Property(this, getChronology().yearOfEra()); [EOL] } <line_num>: 1868,1870
public Property year() { [EOL]     return new Property(this, getChronology().year()); [EOL] } <line_num>: 1877,1879
public Property weekyear() { [EOL]     return new Property(this, getChronology().weekyear()); [EOL] } <line_num>: 1886,1888
public Property monthOfYear() { [EOL]     return new Property(this, getChronology().monthOfYear()); [EOL] } <line_num>: 1895,1897
public Property weekOfWeekyear() { [EOL]     return new Property(this, getChronology().weekOfWeekyear()); [EOL] } <line_num>: 1904,1906
public Property dayOfYear() { [EOL]     return new Property(this, getChronology().dayOfYear()); [EOL] } <line_num>: 1913,1915
public Property dayOfMonth() { [EOL]     return new Property(this, getChronology().dayOfMonth()); [EOL] } <line_num>: 1922,1924
public Property dayOfWeek() { [EOL]     return new Property(this, getChronology().dayOfWeek()); [EOL] } <line_num>: 1931,1933
public Property hourOfDay() { [EOL]     return new Property(this, getChronology().hourOfDay()); [EOL] } <line_num>: 1942,1944
public Property minuteOfDay() { [EOL]     return new Property(this, getChronology().minuteOfDay()); [EOL] } <line_num>: 1951,1953
public Property minuteOfHour() { [EOL]     return new Property(this, getChronology().minuteOfHour()); [EOL] } <line_num>: 1960,1962
public Property secondOfDay() { [EOL]     return new Property(this, getChronology().secondOfDay()); [EOL] } <line_num>: 1969,1971
public Property secondOfMinute() { [EOL]     return new Property(this, getChronology().secondOfMinute()); [EOL] } <line_num>: 1978,1980
public Property millisOfDay() { [EOL]     return new Property(this, getChronology().millisOfDay()); [EOL] } <line_num>: 1987,1989
public Property millisOfSecond() { [EOL]     return new Property(this, getChronology().millisOfSecond()); [EOL] } <line_num>: 1996,1998
private void writeObject(ObjectOutputStream oos) throws IOException { [EOL]     oos.writeObject(iInstant); [EOL]     oos.writeObject(iField.getType()); [EOL] } <line_num>: 2055,2058
private void readObject(ObjectInputStream oos) throws IOException, ClassNotFoundException { [EOL]     iInstant = (DateTime) oos.readObject(); [EOL]     DateTimeFieldType type = (DateTimeFieldType) oos.readObject(); [EOL]     iField = type.getField(iInstant.getChronology()); [EOL] } <line_num>: 2063,2067
public DateTimeField getField() { [EOL]     return iField; [EOL] } <line_num>: 2075,2077
protected long getMillis() { [EOL]     return iInstant.getMillis(); [EOL] } <line_num>: 2084,2086
protected Chronology getChronology() { [EOL]     return iInstant.getChronology(); [EOL] } <line_num>: 2094,2096
public DateTime getDateTime() { [EOL]     return iInstant; [EOL] } <line_num>: 2103,2105
public DateTime addToCopy(int value) { [EOL]     return iInstant.withMillis(iField.add(iInstant.getMillis(), value)); [EOL] } <line_num>: 2120,2122
public DateTime addToCopy(long value) { [EOL]     return iInstant.withMillis(iField.add(iInstant.getMillis(), value)); [EOL] } <line_num>: 2136,2138
public DateTime addWrapFieldToCopy(int value) { [EOL]     return iInstant.withMillis(iField.addWrapField(iInstant.getMillis(), value)); [EOL] } <line_num>: 2154,2156
public DateTime setCopy(int value) { [EOL]     return iInstant.withMillis(iField.set(iInstant.getMillis(), value)); [EOL] } <line_num>: 2171,2173
public DateTime setCopy(String text, Locale locale) { [EOL]     return iInstant.withMillis(iField.set(iInstant.getMillis(), text, locale)); [EOL] } <line_num>: 2188,2190
public DateTime setCopy(String text) { [EOL]     return setCopy(text, null); [EOL] } <line_num>: 2204,2206
public DateTime withMaximumValue() { [EOL]     try { [EOL]         return setCopy(getMaximumValue()); [EOL]     } catch (RuntimeException ex) { [EOL]         if (IllegalInstantException.isIllegalInstant(ex)) { [EOL]             long beforeGap = getChronology().getZone().previousTransition(getMillis() + DateTimeConstants.MILLIS_PER_DAY); [EOL]             return new DateTime(beforeGap, getChronology()); [EOL]         } [EOL]         throw ex; [EOL]     } [EOL] } <line_num>: 2231,2242
public DateTime withMinimumValue() { [EOL]     try { [EOL]         return setCopy(getMinimumValue()); [EOL]     } catch (RuntimeException ex) { [EOL]         if (IllegalInstantException.isIllegalInstant(ex)) { [EOL]             long afterGap = getChronology().getZone().nextTransition(getMillis() - DateTimeConstants.MILLIS_PER_DAY); [EOL]             return new DateTime(afterGap, getChronology()); [EOL]         } [EOL]         throw ex; [EOL]     } [EOL] } <line_num>: 2260,2271
public DateTime roundFloorCopy() { [EOL]     return iInstant.withMillis(iField.roundFloor(iInstant.getMillis())); [EOL] } <line_num>: 2279,2281
public DateTime roundCeilingCopy() { [EOL]     return iInstant.withMillis(iField.roundCeiling(iInstant.getMillis())); [EOL] } <line_num>: 2288,2290
public DateTime roundHalfFloorCopy() { [EOL]     return iInstant.withMillis(iField.roundHalfFloor(iInstant.getMillis())); [EOL] } <line_num>: 2298,2300
public DateTime roundHalfCeilingCopy() { [EOL]     return iInstant.withMillis(iField.roundHalfCeiling(iInstant.getMillis())); [EOL] } <line_num>: 2308,2310
public DateTime roundHalfEvenCopy() { [EOL]     return iInstant.withMillis(iField.roundHalfEven(iInstant.getMillis())); [EOL] } <line_num>: 2319,2321
