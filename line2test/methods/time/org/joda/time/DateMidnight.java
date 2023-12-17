public DateMidnight() { [EOL]     super(); [EOL] } <line_num>: 163,165
public DateMidnight(DateTimeZone zone) { [EOL]     super(zone); [EOL] } <line_num>: 177,179
public DateMidnight(Chronology chronology) { [EOL]     super(chronology); [EOL] } <line_num>: 192,194
public DateMidnight(long instant) { [EOL]     super(instant); [EOL] } <line_num>: 204,206
public DateMidnight(long instant, DateTimeZone zone) { [EOL]     super(instant, zone); [EOL] } <line_num>: 218,220
public DateMidnight(long instant, Chronology chronology) { [EOL]     super(instant, chronology); [EOL] } <line_num>: 233,235
public DateMidnight(Object instant) { [EOL]     super(instant, (Chronology) null); [EOL] } <line_num>: 255,257
public DateMidnight(Object instant, DateTimeZone zone) { [EOL]     super(instant, zone); [EOL] } <line_num>: 280,282
public DateMidnight(Object instant, Chronology chronology) { [EOL]     super(instant, DateTimeUtils.getChronology(chronology)); [EOL] } <line_num>: 302,304
public DateMidnight(int year, int monthOfYear, int dayOfMonth) { [EOL]     super(year, monthOfYear, dayOfMonth, 0, 0, 0, 0); [EOL] } <line_num>: 316,318
public DateMidnight(int year, int monthOfYear, int dayOfMonth, DateTimeZone zone) { [EOL]     super(year, monthOfYear, dayOfMonth, 0, 0, 0, 0, zone); [EOL] } <line_num>: 332,334
public DateMidnight(int year, int monthOfYear, int dayOfMonth, Chronology chronology) { [EOL]     super(year, monthOfYear, dayOfMonth, 0, 0, 0, 0, chronology); [EOL] } <line_num>: 349,351
Property(DateMidnight instant, DateTimeField field) { [EOL]     super(); [EOL]     iInstant = instant; [EOL]     iField = field; [EOL] } <line_num>: 1235,1239
public static DateMidnight now() { [EOL]     return new DateMidnight(); [EOL] } <line_num>: 94,96
public static DateMidnight now(DateTimeZone zone) { [EOL]     if (zone == null) { [EOL]         throw new NullPointerException("Zone must not be null"); [EOL]     } [EOL]     return new DateMidnight(zone); [EOL] } <line_num>: 107,112
public static DateMidnight now(Chronology chronology) { [EOL]     if (chronology == null) { [EOL]         throw new NullPointerException("Chronology must not be null"); [EOL]     } [EOL]     return new DateMidnight(chronology); [EOL] } <line_num>: 123,128
@FromString [EOL] public static DateMidnight parse(String str) { [EOL]     return parse(str, ISODateTimeFormat.dateTimeParser().withOffsetParsed()); [EOL] } <line_num>: 139,142
public static DateMidnight parse(String str, DateTimeFormatter formatter) { [EOL]     return formatter.parseDateTime(str).toDateMidnight(); [EOL] } <line_num>: 151,153
protected long checkInstant(long instant, Chronology chronology) { [EOL]     return chronology.dayOfMonth().roundFloor(instant); [EOL] } <line_num>: 360,362
public DateMidnight withMillis(long newMillis) { [EOL]     Chronology chrono = getChronology(); [EOL]     newMillis = checkInstant(newMillis, chrono); [EOL]     return (newMillis == getMillis() ? this : new DateMidnight(newMillis, chrono)); [EOL] } <line_num>: 375,379
public DateMidnight withChronology(Chronology newChronology) { [EOL]     return (newChronology == getChronology() ? this : new DateMidnight(getMillis(), newChronology)); [EOL] } <line_num>: 402,404
public DateMidnight withZoneRetainFields(DateTimeZone newZone) { [EOL]     newZone = DateTimeUtils.getZone(newZone); [EOL]     DateTimeZone originalZone = DateTimeUtils.getZone(getZone()); [EOL]     if (newZone == originalZone) { [EOL]         return this; [EOL]     } [EOL]     long millis = originalZone.getMillisKeepLocal(newZone, getMillis()); [EOL]     return new DateMidnight(millis, getChronology().withZone(newZone)); [EOL] } <line_num>: 414,423
public DateMidnight withFields(ReadablePartial partial) { [EOL]     if (partial == null) { [EOL]         return this; [EOL]     } [EOL]     return withMillis(getChronology().set(partial, getMillis())); [EOL] } <line_num>: 438,443
public DateMidnight withField(DateTimeFieldType fieldType, int value) { [EOL]     if (fieldType == null) { [EOL]         throw new IllegalArgumentException("Field must not be null"); [EOL]     } [EOL]     long instant = fieldType.getField(getChronology()).set(getMillis(), value); [EOL]     return withMillis(instant); [EOL] } <line_num>: 464,470
public DateMidnight withFieldAdded(DurationFieldType fieldType, int amount) { [EOL]     if (fieldType == null) { [EOL]         throw new IllegalArgumentException("Field must not be null"); [EOL]     } [EOL]     if (amount == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = fieldType.getField(getChronology()).add(getMillis(), amount); [EOL]     return withMillis(instant); [EOL] } <line_num>: 490,499
public DateMidnight withDurationAdded(long durationToAdd, int scalar) { [EOL]     if (durationToAdd == 0 || scalar == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().add(getMillis(), durationToAdd, scalar); [EOL]     return withMillis(instant); [EOL] } <line_num>: 512,518
public DateMidnight withDurationAdded(ReadableDuration durationToAdd, int scalar) { [EOL]     if (durationToAdd == null || scalar == 0) { [EOL]         return this; [EOL]     } [EOL]     return withDurationAdded(durationToAdd.getMillis(), scalar); [EOL] } <line_num>: 530,535
public DateMidnight withPeriodAdded(ReadablePeriod period, int scalar) { [EOL]     if (period == null || scalar == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().add(period, getMillis(), scalar); [EOL]     return withMillis(instant); [EOL] } <line_num>: 552,558
public DateMidnight plus(long duration) { [EOL]     return withDurationAdded(duration, 1); [EOL] } <line_num>: 570,572
public DateMidnight plus(ReadableDuration duration) { [EOL]     return withDurationAdded(duration, 1); [EOL] } <line_num>: 583,585
public DateMidnight plus(ReadablePeriod period) { [EOL]     return withPeriodAdded(period, 1); [EOL] } <line_num>: 600,602
public DateMidnight plusYears(int years) { [EOL]     if (years == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().years().add(getMillis(), years); [EOL]     return withMillis(instant); [EOL] } <line_num>: 621,627
public DateMidnight plusMonths(int months) { [EOL]     if (months == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().months().add(getMillis(), months); [EOL]     return withMillis(instant); [EOL] } <line_num>: 645,651
public DateMidnight plusWeeks(int weeks) { [EOL]     if (weeks == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().weeks().add(getMillis(), weeks); [EOL]     return withMillis(instant); [EOL] } <line_num>: 669,675
public DateMidnight plusDays(int days) { [EOL]     if (days == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().days().add(getMillis(), days); [EOL]     return withMillis(instant); [EOL] } <line_num>: 693,699
public DateMidnight minus(long duration) { [EOL]     return withDurationAdded(duration, -1); [EOL] } <line_num>: 711,713
public DateMidnight minus(ReadableDuration duration) { [EOL]     return withDurationAdded(duration, -1); [EOL] } <line_num>: 724,726
public DateMidnight minus(ReadablePeriod period) { [EOL]     return withPeriodAdded(period, -1); [EOL] } <line_num>: 741,743
public DateMidnight minusYears(int years) { [EOL]     if (years == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().years().subtract(getMillis(), years); [EOL]     return withMillis(instant); [EOL] } <line_num>: 762,768
public DateMidnight minusMonths(int months) { [EOL]     if (months == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().months().subtract(getMillis(), months); [EOL]     return withMillis(instant); [EOL] } <line_num>: 786,792
public DateMidnight minusWeeks(int weeks) { [EOL]     if (weeks == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().weeks().subtract(getMillis(), weeks); [EOL]     return withMillis(instant); [EOL] } <line_num>: 810,816
public DateMidnight minusDays(int days) { [EOL]     if (days == 0) { [EOL]         return this; [EOL]     } [EOL]     long instant = getChronology().days().subtract(getMillis(), days); [EOL]     return withMillis(instant); [EOL] } <line_num>: 834,840
public Property property(DateTimeFieldType type) { [EOL]     if (type == null) { [EOL]         throw new IllegalArgumentException("The DateTimeFieldType must not be null"); [EOL]     } [EOL]     DateTimeField field = type.getField(getChronology()); [EOL]     if (field.isSupported() == false) { [EOL]         throw new IllegalArgumentException("Field '" + type + "' is not supported"); [EOL]     } [EOL]     return new Property(this, field); [EOL] } <line_num>: 850,859
@Deprecated [EOL] public YearMonthDay toYearMonthDay() { [EOL]     return new YearMonthDay(getMillis(), getChronology()); [EOL] } <line_num>: 869,872
public LocalDate toLocalDate() { [EOL]     return new LocalDate(getMillis(), getChronology()); [EOL] } <line_num>: 881,883
public Interval toInterval() { [EOL]     Chronology chrono = getChronology(); [EOL]     long start = getMillis(); [EOL]     long end = DurationFieldType.days().getField(chrono).add(start, 1); [EOL]     return new Interval(start, end, chrono); [EOL] } <line_num>: 894,899
public DateMidnight withEra(int era) { [EOL]     return withMillis(getChronology().era().set(getMillis(), era)); [EOL] } <line_num>: 914,916
public DateMidnight withCenturyOfEra(int centuryOfEra) { [EOL]     return withMillis(getChronology().centuryOfEra().set(getMillis(), centuryOfEra)); [EOL] } <line_num>: 930,932
public DateMidnight withYearOfEra(int yearOfEra) { [EOL]     return withMillis(getChronology().yearOfEra().set(getMillis(), yearOfEra)); [EOL] } <line_num>: 946,948
public DateMidnight withYearOfCentury(int yearOfCentury) { [EOL]     return withMillis(getChronology().yearOfCentury().set(getMillis(), yearOfCentury)); [EOL] } <line_num>: 962,964
public DateMidnight withYear(int year) { [EOL]     return withMillis(getChronology().year().set(getMillis(), year)); [EOL] } <line_num>: 978,980
public DateMidnight withWeekyear(int weekyear) { [EOL]     return withMillis(getChronology().weekyear().set(getMillis(), weekyear)); [EOL] } <line_num>: 1000,1002
public DateMidnight withMonthOfYear(int monthOfYear) { [EOL]     return withMillis(getChronology().monthOfYear().set(getMillis(), monthOfYear)); [EOL] } <line_num>: 1016,1018
public DateMidnight withWeekOfWeekyear(int weekOfWeekyear) { [EOL]     return withMillis(getChronology().weekOfWeekyear().set(getMillis(), weekOfWeekyear)); [EOL] } <line_num>: 1037,1039
public DateMidnight withDayOfYear(int dayOfYear) { [EOL]     return withMillis(getChronology().dayOfYear().set(getMillis(), dayOfYear)); [EOL] } <line_num>: 1053,1055
public DateMidnight withDayOfMonth(int dayOfMonth) { [EOL]     return withMillis(getChronology().dayOfMonth().set(getMillis(), dayOfMonth)); [EOL] } <line_num>: 1069,1071
public DateMidnight withDayOfWeek(int dayOfWeek) { [EOL]     return withMillis(getChronology().dayOfWeek().set(getMillis(), dayOfWeek)); [EOL] } <line_num>: 1085,1087
public Property era() { [EOL]     return new Property(this, getChronology().era()); [EOL] } <line_num>: 1096,1098
public Property centuryOfEra() { [EOL]     return new Property(this, getChronology().centuryOfEra()); [EOL] } <line_num>: 1105,1107
public Property yearOfCentury() { [EOL]     return new Property(this, getChronology().yearOfCentury()); [EOL] } <line_num>: 1114,1116
public Property yearOfEra() { [EOL]     return new Property(this, getChronology().yearOfEra()); [EOL] } <line_num>: 1123,1125
public Property year() { [EOL]     return new Property(this, getChronology().year()); [EOL] } <line_num>: 1132,1134
public Property weekyear() { [EOL]     return new Property(this, getChronology().weekyear()); [EOL] } <line_num>: 1141,1143
public Property monthOfYear() { [EOL]     return new Property(this, getChronology().monthOfYear()); [EOL] } <line_num>: 1150,1152
public Property weekOfWeekyear() { [EOL]     return new Property(this, getChronology().weekOfWeekyear()); [EOL] } <line_num>: 1159,1161
public Property dayOfYear() { [EOL]     return new Property(this, getChronology().dayOfYear()); [EOL] } <line_num>: 1168,1170
public Property dayOfMonth() { [EOL]     return new Property(this, getChronology().dayOfMonth()); [EOL] } <line_num>: 1177,1179
public Property dayOfWeek() { [EOL]     return new Property(this, getChronology().dayOfWeek()); [EOL] } <line_num>: 1186,1188
private void writeObject(ObjectOutputStream oos) throws IOException { [EOL]     oos.writeObject(iInstant); [EOL]     oos.writeObject(iField.getType()); [EOL] } <line_num>: 1244,1247
private void readObject(ObjectInputStream oos) throws IOException, ClassNotFoundException { [EOL]     iInstant = (DateMidnight) oos.readObject(); [EOL]     DateTimeFieldType type = (DateTimeFieldType) oos.readObject(); [EOL]     iField = type.getField(iInstant.getChronology()); [EOL] } <line_num>: 1252,1256
public DateTimeField getField() { [EOL]     return iField; [EOL] } <line_num>: 1264,1266
protected long getMillis() { [EOL]     return iInstant.getMillis(); [EOL] } <line_num>: 1273,1275
protected Chronology getChronology() { [EOL]     return iInstant.getChronology(); [EOL] } <line_num>: 1283,1285
public DateMidnight getDateMidnight() { [EOL]     return iInstant; [EOL] } <line_num>: 1292,1294
public DateMidnight addToCopy(int value) { [EOL]     return iInstant.withMillis(iField.add(iInstant.getMillis(), value)); [EOL] } <line_num>: 1309,1311
public DateMidnight addToCopy(long value) { [EOL]     return iInstant.withMillis(iField.add(iInstant.getMillis(), value)); [EOL] } <line_num>: 1325,1327
public DateMidnight addWrapFieldToCopy(int value) { [EOL]     return iInstant.withMillis(iField.addWrapField(iInstant.getMillis(), value)); [EOL] } <line_num>: 1343,1345
public DateMidnight setCopy(int value) { [EOL]     return iInstant.withMillis(iField.set(iInstant.getMillis(), value)); [EOL] } <line_num>: 1360,1362
public DateMidnight setCopy(String text, Locale locale) { [EOL]     return iInstant.withMillis(iField.set(iInstant.getMillis(), text, locale)); [EOL] } <line_num>: 1377,1379
public DateMidnight setCopy(String text) { [EOL]     return setCopy(text, null); [EOL] } <line_num>: 1393,1395
public DateMidnight withMaximumValue() { [EOL]     return setCopy(getMaximumValue()); [EOL] } <line_num>: 1413,1415
public DateMidnight withMinimumValue() { [EOL]     return setCopy(getMinimumValue()); [EOL] } <line_num>: 1426,1428
public DateMidnight roundFloorCopy() { [EOL]     return iInstant.withMillis(iField.roundFloor(iInstant.getMillis())); [EOL] } <line_num>: 1436,1438
public DateMidnight roundCeilingCopy() { [EOL]     return iInstant.withMillis(iField.roundCeiling(iInstant.getMillis())); [EOL] } <line_num>: 1445,1447
public DateMidnight roundHalfFloorCopy() { [EOL]     return iInstant.withMillis(iField.roundHalfFloor(iInstant.getMillis())); [EOL] } <line_num>: 1455,1457
public DateMidnight roundHalfCeilingCopy() { [EOL]     return iInstant.withMillis(iField.roundHalfCeiling(iInstant.getMillis())); [EOL] } <line_num>: 1465,1467
public DateMidnight roundHalfEvenCopy() { [EOL]     return iInstant.withMillis(iField.roundHalfEven(iInstant.getMillis())); [EOL] } <line_num>: 1475,1477
