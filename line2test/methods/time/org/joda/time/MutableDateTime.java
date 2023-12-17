public MutableDateTime() { [EOL]     super(); [EOL] } <line_num>: 171,173
public MutableDateTime(DateTimeZone zone) { [EOL]     super(zone); [EOL] } <line_num>: 184,186
public MutableDateTime(Chronology chronology) { [EOL]     super(chronology); [EOL] } <line_num>: 198,200
public MutableDateTime(long instant) { [EOL]     super(instant); [EOL] } <line_num>: 209,211
public MutableDateTime(long instant, DateTimeZone zone) { [EOL]     super(instant, zone); [EOL] } <line_num>: 222,224
public MutableDateTime(long instant, Chronology chronology) { [EOL]     super(instant, chronology); [EOL] } <line_num>: 236,238
public MutableDateTime(Object instant) { [EOL]     super(instant, (Chronology) null); [EOL] } <line_num>: 256,258
public MutableDateTime(Object instant, DateTimeZone zone) { [EOL]     super(instant, zone); [EOL] } <line_num>: 279,281
public MutableDateTime(Object instant, Chronology chronology) { [EOL]     super(instant, DateTimeUtils.getChronology(chronology)); [EOL] } <line_num>: 299,301
public MutableDateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) { [EOL]     super(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond); [EOL] } <line_num>: 316,325
public MutableDateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond, DateTimeZone zone) { [EOL]     super(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond, zone); [EOL] } <line_num>: 342,353
public MutableDateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond, Chronology chronology) { [EOL]     super(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond, chronology); [EOL] } <line_num>: 371,382
Property(MutableDateTime instant, DateTimeField field) { [EOL]     super(); [EOL]     iInstant = instant; [EOL]     iField = field; [EOL] } <line_num>: 1288,1292
public static MutableDateTime now() { [EOL]     return new MutableDateTime(); [EOL] } <line_num>: 105,107
public static MutableDateTime now(DateTimeZone zone) { [EOL]     if (zone == null) { [EOL]         throw new NullPointerException("Zone must not be null"); [EOL]     } [EOL]     return new MutableDateTime(zone); [EOL] } <line_num>: 117,122
public static MutableDateTime now(Chronology chronology) { [EOL]     if (chronology == null) { [EOL]         throw new NullPointerException("Chronology must not be null"); [EOL]     } [EOL]     return new MutableDateTime(chronology); [EOL] } <line_num>: 132,137
@FromString [EOL] public static MutableDateTime parse(String str) { [EOL]     return parse(str, ISODateTimeFormat.dateTimeParser().withOffsetParsed()); [EOL] } <line_num>: 148,151
public static MutableDateTime parse(String str, DateTimeFormatter formatter) { [EOL]     return formatter.parseDateTime(str).toMutableDateTime(); [EOL] } <line_num>: 160,162
public DateTimeField getRoundingField() { [EOL]     return iRoundingField; [EOL] } <line_num>: 391,393
public int getRoundingMode() { [EOL]     return iRoundingMode; [EOL] } <line_num>: 401,403
public void setRounding(DateTimeField field) { [EOL]     setRounding(field, MutableDateTime.ROUND_FLOOR); [EOL] } <line_num>: 417,419
public void setRounding(DateTimeField field, int mode) { [EOL]     if (field != null && (mode < ROUND_NONE || mode > ROUND_HALF_EVEN)) { [EOL]         throw new IllegalArgumentException("Illegal rounding mode: " + mode); [EOL]     } [EOL]     iRoundingField = (mode == ROUND_NONE ? null : field); [EOL]     iRoundingMode = (field == null ? ROUND_NONE : mode); [EOL]     setMillis(getMillis()); [EOL] } <line_num>: 435,442
public void setMillis(long instant) { [EOL]     switch(iRoundingMode) { [EOL]         case ROUND_NONE: [EOL]             break; [EOL]         case ROUND_FLOOR: [EOL]             instant = iRoundingField.roundFloor(instant); [EOL]             break; [EOL]         case ROUND_CEILING: [EOL]             instant = iRoundingField.roundCeiling(instant); [EOL]             break; [EOL]         case ROUND_HALF_FLOOR: [EOL]             instant = iRoundingField.roundHalfFloor(instant); [EOL]             break; [EOL]         case ROUND_HALF_CEILING: [EOL]             instant = iRoundingField.roundHalfCeiling(instant); [EOL]             break; [EOL]         case ROUND_HALF_EVEN: [EOL]             instant = iRoundingField.roundHalfEven(instant); [EOL]             break; [EOL]     } [EOL]     super.setMillis(instant); [EOL] } <line_num>: 453,474
public void setMillis(ReadableInstant instant) { [EOL]     long instantMillis = DateTimeUtils.getInstantMillis(instant); [EOL]     setMillis(instantMillis); [EOL] } <line_num>: 484,487
public void add(long duration) { [EOL]     setMillis(FieldUtils.safeAdd(getMillis(), duration)); [EOL] } <line_num>: 496,498
public void add(ReadableDuration duration) { [EOL]     add(duration, 1); [EOL] } <line_num>: 508,510
public void add(ReadableDuration duration, int scalar) { [EOL]     if (duration != null) { [EOL]         add(FieldUtils.safeMultiply(duration.getMillis(), scalar)); [EOL]     } [EOL] } <line_num>: 521,525
public void add(ReadablePeriod period) { [EOL]     add(period, 1); [EOL] } <line_num>: 535,537
public void add(ReadablePeriod period, int scalar) { [EOL]     if (period != null) { [EOL]         setMillis(getChronology().add(period, getMillis(), scalar)); [EOL]     } [EOL] } <line_num>: 548,552
public void setChronology(Chronology chronology) { [EOL]     super.setChronology(chronology); [EOL] } <line_num>: 562,564
public void setZone(DateTimeZone newZone) { [EOL]     newZone = DateTimeUtils.getZone(newZone); [EOL]     Chronology chrono = getChronology(); [EOL]     if (chrono.getZone() != newZone) { [EOL]         setChronology(chrono.withZone(newZone)); [EOL]     } [EOL] } <line_num>: 581,587
public void setZoneRetainFields(DateTimeZone newZone) { [EOL]     newZone = DateTimeUtils.getZone(newZone); [EOL]     DateTimeZone originalZone = DateTimeUtils.getZone(getZone()); [EOL]     if (newZone == originalZone) { [EOL]         return; [EOL]     } [EOL]     long millis = originalZone.getMillisKeepLocal(newZone, getMillis()); [EOL]     setChronology(getChronology().withZone(newZone)); [EOL]     setMillis(millis); [EOL] } <line_num>: 600,610
public void set(DateTimeFieldType type, int value) { [EOL]     if (type == null) { [EOL]         throw new IllegalArgumentException("Field must not be null"); [EOL]     } [EOL]     setMillis(type.getField(getChronology()).set(getMillis(), value)); [EOL] } <line_num>: 620,625
public void add(DurationFieldType type, int amount) { [EOL]     if (type == null) { [EOL]         throw new IllegalArgumentException("Field must not be null"); [EOL]     } [EOL]     if (amount != 0) { [EOL]         setMillis(type.getField(getChronology()).add(getMillis(), amount)); [EOL]     } [EOL] } <line_num>: 635,642
public void setYear(final int year) { [EOL]     setMillis(getChronology().year().set(getMillis(), year)); [EOL] } <line_num>: 651,653
public void addYears(final int years) { [EOL]     if (years != 0) { [EOL]         setMillis(getChronology().years().add(getMillis(), years)); [EOL]     } [EOL] } <line_num>: 661,665
public void setWeekyear(final int weekyear) { [EOL]     setMillis(getChronology().weekyear().set(getMillis(), weekyear)); [EOL] } <line_num>: 674,676
public void addWeekyears(final int weekyears) { [EOL]     if (weekyears != 0) { [EOL]         setMillis(getChronology().weekyears().add(getMillis(), weekyears)); [EOL]     } [EOL] } <line_num>: 684,688
public void setMonthOfYear(final int monthOfYear) { [EOL]     setMillis(getChronology().monthOfYear().set(getMillis(), monthOfYear)); [EOL] } <line_num>: 697,699
public void addMonths(final int months) { [EOL]     if (months != 0) { [EOL]         setMillis(getChronology().months().add(getMillis(), months)); [EOL]     } [EOL] } <line_num>: 707,711
public void setWeekOfWeekyear(final int weekOfWeekyear) { [EOL]     setMillis(getChronology().weekOfWeekyear().set(getMillis(), weekOfWeekyear)); [EOL] } <line_num>: 720,722
public void addWeeks(final int weeks) { [EOL]     if (weeks != 0) { [EOL]         setMillis(getChronology().weeks().add(getMillis(), weeks)); [EOL]     } [EOL] } <line_num>: 730,734
public void setDayOfYear(final int dayOfYear) { [EOL]     setMillis(getChronology().dayOfYear().set(getMillis(), dayOfYear)); [EOL] } <line_num>: 743,745
public void setDayOfMonth(final int dayOfMonth) { [EOL]     setMillis(getChronology().dayOfMonth().set(getMillis(), dayOfMonth)); [EOL] } <line_num>: 753,755
public void setDayOfWeek(final int dayOfWeek) { [EOL]     setMillis(getChronology().dayOfWeek().set(getMillis(), dayOfWeek)); [EOL] } <line_num>: 763,765
public void addDays(final int days) { [EOL]     if (days != 0) { [EOL]         setMillis(getChronology().days().add(getMillis(), days)); [EOL]     } [EOL] } <line_num>: 773,777
public void setHourOfDay(final int hourOfDay) { [EOL]     setMillis(getChronology().hourOfDay().set(getMillis(), hourOfDay)); [EOL] } <line_num>: 786,788
public void addHours(final int hours) { [EOL]     if (hours != 0) { [EOL]         setMillis(getChronology().hours().add(getMillis(), hours)); [EOL]     } [EOL] } <line_num>: 796,800
public void setMinuteOfDay(final int minuteOfDay) { [EOL]     setMillis(getChronology().minuteOfDay().set(getMillis(), minuteOfDay)); [EOL] } <line_num>: 809,811
public void setMinuteOfHour(final int minuteOfHour) { [EOL]     setMillis(getChronology().minuteOfHour().set(getMillis(), minuteOfHour)); [EOL] } <line_num>: 819,821
public void addMinutes(final int minutes) { [EOL]     if (minutes != 0) { [EOL]         setMillis(getChronology().minutes().add(getMillis(), minutes)); [EOL]     } [EOL] } <line_num>: 829,833
public void setSecondOfDay(final int secondOfDay) { [EOL]     setMillis(getChronology().secondOfDay().set(getMillis(), secondOfDay)); [EOL] } <line_num>: 842,844
public void setSecondOfMinute(final int secondOfMinute) { [EOL]     setMillis(getChronology().secondOfMinute().set(getMillis(), secondOfMinute)); [EOL] } <line_num>: 852,854
public void addSeconds(final int seconds) { [EOL]     if (seconds != 0) { [EOL]         setMillis(getChronology().seconds().add(getMillis(), seconds)); [EOL]     } [EOL] } <line_num>: 862,866
public void setMillisOfDay(final int millisOfDay) { [EOL]     setMillis(getChronology().millisOfDay().set(getMillis(), millisOfDay)); [EOL] } <line_num>: 875,877
public void setMillisOfSecond(final int millisOfSecond) { [EOL]     setMillis(getChronology().millisOfSecond().set(getMillis(), millisOfSecond)); [EOL] } <line_num>: 885,887
public void addMillis(final int millis) { [EOL]     if (millis != 0) { [EOL]         setMillis(getChronology().millis().add(getMillis(), millis)); [EOL]     } [EOL] } <line_num>: 897,901
public void setDate(final long instant) { [EOL]     setMillis(getChronology().millisOfDay().set(instant, getMillisOfDay())); [EOL] } <line_num>: 911,913
public void setDate(final ReadableInstant instant) { [EOL]     long instantMillis = DateTimeUtils.getInstantMillis(instant); [EOL]     if (instant instanceof ReadableDateTime) { [EOL]         ReadableDateTime rdt = (ReadableDateTime) instant; [EOL]         Chronology instantChrono = DateTimeUtils.getChronology(rdt.getChronology()); [EOL]         DateTimeZone zone = instantChrono.getZone(); [EOL]         if (zone != null) { [EOL]             instantMillis = zone.getMillisKeepLocal(getZone(), instantMillis); [EOL]         } [EOL]     } [EOL]     setDate(instantMillis); [EOL] } <line_num>: 925,936
public void setDate(final int year, final int monthOfYear, final int dayOfMonth) { [EOL]     Chronology c = getChronology(); [EOL]     long instantMidnight = c.getDateTimeMillis(year, monthOfYear, dayOfMonth, 0); [EOL]     setDate(instantMidnight); [EOL] } <line_num>: 947,954
public void setTime(final long millis) { [EOL]     int millisOfDay = ISOChronology.getInstanceUTC().millisOfDay().get(millis); [EOL]     setMillis(getChronology().millisOfDay().set(getMillis(), millisOfDay)); [EOL] } <line_num>: 964,967
public void setTime(final ReadableInstant instant) { [EOL]     long instantMillis = DateTimeUtils.getInstantMillis(instant); [EOL]     Chronology instantChrono = DateTimeUtils.getInstantChronology(instant); [EOL]     DateTimeZone zone = instantChrono.getZone(); [EOL]     if (zone != null) { [EOL]         instantMillis = zone.getMillisKeepLocal(DateTimeZone.UTC, instantMillis); [EOL]     } [EOL]     setTime(instantMillis); [EOL] } <line_num>: 976,984
public void setTime(final int hour, final int minuteOfHour, final int secondOfMinute, final int millisOfSecond) { [EOL]     long instant = getChronology().getDateTimeMillis(getMillis(), hour, minuteOfHour, secondOfMinute, millisOfSecond); [EOL]     setMillis(instant); [EOL] } <line_num>: 996,1004
public void setDateTime(final int year, final int monthOfYear, final int dayOfMonth, final int hourOfDay, final int minuteOfHour, final int secondOfMinute, final int millisOfSecond) { [EOL]     long instant = getChronology().getDateTimeMillis(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond); [EOL]     setMillis(instant); [EOL] } <line_num>: 1018,1029
public Property property(DateTimeFieldType type) { [EOL]     if (type == null) { [EOL]         throw new IllegalArgumentException("The DateTimeFieldType must not be null"); [EOL]     } [EOL]     DateTimeField field = type.getField(getChronology()); [EOL]     if (field.isSupported() == false) { [EOL]         throw new IllegalArgumentException("Field '" + type + "' is not supported"); [EOL]     } [EOL]     return new Property(this, field); [EOL] } <line_num>: 1040,1049
public Property era() { [EOL]     return new Property(this, getChronology().era()); [EOL] } <line_num>: 1056,1058
public Property centuryOfEra() { [EOL]     return new Property(this, getChronology().centuryOfEra()); [EOL] } <line_num>: 1065,1067
public Property yearOfCentury() { [EOL]     return new Property(this, getChronology().yearOfCentury()); [EOL] } <line_num>: 1074,1076
public Property yearOfEra() { [EOL]     return new Property(this, getChronology().yearOfEra()); [EOL] } <line_num>: 1083,1085
public Property year() { [EOL]     return new Property(this, getChronology().year()); [EOL] } <line_num>: 1092,1094
public Property weekyear() { [EOL]     return new Property(this, getChronology().weekyear()); [EOL] } <line_num>: 1101,1103
public Property monthOfYear() { [EOL]     return new Property(this, getChronology().monthOfYear()); [EOL] } <line_num>: 1110,1112
public Property weekOfWeekyear() { [EOL]     return new Property(this, getChronology().weekOfWeekyear()); [EOL] } <line_num>: 1119,1121
public Property dayOfYear() { [EOL]     return new Property(this, getChronology().dayOfYear()); [EOL] } <line_num>: 1128,1130
public Property dayOfMonth() { [EOL]     return new Property(this, getChronology().dayOfMonth()); [EOL] } <line_num>: 1139,1141
public Property dayOfWeek() { [EOL]     return new Property(this, getChronology().dayOfWeek()); [EOL] } <line_num>: 1150,1152
public Property hourOfDay() { [EOL]     return new Property(this, getChronology().hourOfDay()); [EOL] } <line_num>: 1160,1162
public Property minuteOfDay() { [EOL]     return new Property(this, getChronology().minuteOfDay()); [EOL] } <line_num>: 1169,1171
public Property minuteOfHour() { [EOL]     return new Property(this, getChronology().minuteOfHour()); [EOL] } <line_num>: 1178,1180
public Property secondOfDay() { [EOL]     return new Property(this, getChronology().secondOfDay()); [EOL] } <line_num>: 1187,1189
public Property secondOfMinute() { [EOL]     return new Property(this, getChronology().secondOfMinute()); [EOL] } <line_num>: 1196,1198
public Property millisOfDay() { [EOL]     return new Property(this, getChronology().millisOfDay()); [EOL] } <line_num>: 1205,1207
public Property millisOfSecond() { [EOL]     return new Property(this, getChronology().millisOfSecond()); [EOL] } <line_num>: 1214,1216
public MutableDateTime copy() { [EOL]     return (MutableDateTime) clone(); [EOL] } <line_num>: 1224,1226
public Object clone() { [EOL]     try { [EOL]         return super.clone(); [EOL]     } catch (CloneNotSupportedException ex) { [EOL]         throw new InternalError("Clone error"); [EOL]     } [EOL] } <line_num>: 1234,1240
@ToString [EOL] public String toString() { [EOL]     return ISODateTimeFormat.dateTime().print(this); [EOL] } <line_num>: 1247,1250
private void writeObject(ObjectOutputStream oos) throws IOException { [EOL]     oos.writeObject(iInstant); [EOL]     oos.writeObject(iField.getType()); [EOL] } <line_num>: 1297,1300
private void readObject(ObjectInputStream oos) throws IOException, ClassNotFoundException { [EOL]     iInstant = (MutableDateTime) oos.readObject(); [EOL]     DateTimeFieldType type = (DateTimeFieldType) oos.readObject(); [EOL]     iField = type.getField(iInstant.getChronology()); [EOL] } <line_num>: 1305,1309
public DateTimeField getField() { [EOL]     return iField; [EOL] } <line_num>: 1317,1319
protected long getMillis() { [EOL]     return iInstant.getMillis(); [EOL] } <line_num>: 1326,1328
protected Chronology getChronology() { [EOL]     return iInstant.getChronology(); [EOL] } <line_num>: 1336,1338
public MutableDateTime getMutableDateTime() { [EOL]     return iInstant; [EOL] } <line_num>: 1345,1347
public MutableDateTime add(int value) { [EOL]     iInstant.setMillis(getField().add(iInstant.getMillis(), value)); [EOL]     return iInstant; [EOL] } <line_num>: 1357,1360
public MutableDateTime add(long value) { [EOL]     iInstant.setMillis(getField().add(iInstant.getMillis(), value)); [EOL]     return iInstant; [EOL] } <line_num>: 1369,1372
public MutableDateTime addWrapField(int value) { [EOL]     iInstant.setMillis(getField().addWrapField(iInstant.getMillis(), value)); [EOL]     return iInstant; [EOL] } <line_num>: 1381,1384
public MutableDateTime set(int value) { [EOL]     iInstant.setMillis(getField().set(iInstant.getMillis(), value)); [EOL]     return iInstant; [EOL] } <line_num>: 1394,1397
public MutableDateTime set(String text, Locale locale) { [EOL]     iInstant.setMillis(getField().set(iInstant.getMillis(), text, locale)); [EOL]     return iInstant; [EOL] } <line_num>: 1408,1411
public MutableDateTime set(String text) { [EOL]     set(text, null); [EOL]     return iInstant; [EOL] } <line_num>: 1421,1424
public MutableDateTime roundFloor() { [EOL]     iInstant.setMillis(getField().roundFloor(iInstant.getMillis())); [EOL]     return iInstant; [EOL] } <line_num>: 1433,1436
public MutableDateTime roundCeiling() { [EOL]     iInstant.setMillis(getField().roundCeiling(iInstant.getMillis())); [EOL]     return iInstant; [EOL] } <line_num>: 1444,1447
public MutableDateTime roundHalfFloor() { [EOL]     iInstant.setMillis(getField().roundHalfFloor(iInstant.getMillis())); [EOL]     return iInstant; [EOL] } <line_num>: 1456,1459
public MutableDateTime roundHalfCeiling() { [EOL]     iInstant.setMillis(getField().roundHalfCeiling(iInstant.getMillis())); [EOL]     return iInstant; [EOL] } <line_num>: 1468,1471
public MutableDateTime roundHalfEven() { [EOL]     iInstant.setMillis(getField().roundHalfEven(iInstant.getMillis())); [EOL]     return iInstant; [EOL] } <line_num>: 1480,1483
