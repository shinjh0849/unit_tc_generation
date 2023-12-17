public TimeOfDay() { [EOL]     super(); [EOL] } <line_num>: 198,200
public TimeOfDay(DateTimeZone zone) { [EOL]     super(ISOChronology.getInstance(zone)); [EOL] } <line_num>: 213,215
public TimeOfDay(Chronology chronology) { [EOL]     super(chronology); [EOL] } <line_num>: 227,229
public TimeOfDay(long instant) { [EOL]     super(instant); [EOL] } <line_num>: 241,243
public TimeOfDay(long instant, Chronology chronology) { [EOL]     super(instant, chronology); [EOL] } <line_num>: 256,258
public TimeOfDay(Object instant) { [EOL]     super(instant, null, ISODateTimeFormat.timeParser()); [EOL] } <line_num>: 276,278
public TimeOfDay(Object instant, Chronology chronology) { [EOL]     super(instant, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.timeParser()); [EOL] } <line_num>: 301,303
public TimeOfDay(int hourOfDay, int minuteOfHour) { [EOL]     this(hourOfDay, minuteOfHour, 0, 0, null); [EOL] } <line_num>: 316,318
public TimeOfDay(int hourOfDay, int minuteOfHour, Chronology chronology) { [EOL]     this(hourOfDay, minuteOfHour, 0, 0, chronology); [EOL] } <line_num>: 331,333
public TimeOfDay(int hourOfDay, int minuteOfHour, int secondOfMinute) { [EOL]     this(hourOfDay, minuteOfHour, secondOfMinute, 0, null); [EOL] } <line_num>: 347,349
public TimeOfDay(int hourOfDay, int minuteOfHour, int secondOfMinute, Chronology chronology) { [EOL]     this(hourOfDay, minuteOfHour, secondOfMinute, 0, chronology); [EOL] } <line_num>: 363,365
public TimeOfDay(int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) { [EOL]     this(hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond, null); [EOL] } <line_num>: 380,382
public TimeOfDay(int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond, Chronology chronology) { [EOL]     super(new int[] { hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond }, chronology); [EOL] } <line_num>: 397,400
TimeOfDay(TimeOfDay partial, int[] values) { [EOL]     super(partial, values); [EOL] } <line_num>: 408,410
TimeOfDay(TimeOfDay partial, Chronology chrono) { [EOL]     super(partial, chrono); [EOL] } <line_num>: 418,420
Property(TimeOfDay partial, int fieldIndex) { [EOL]     super(); [EOL]     iTimeOfDay = partial; [EOL]     iFieldIndex = fieldIndex; [EOL] } <line_num>: 1034,1038
public static TimeOfDay fromCalendarFields(Calendar calendar) { [EOL]     if (calendar == null) { [EOL]         throw new IllegalArgumentException("The calendar must not be null"); [EOL]     } [EOL]     return new TimeOfDay(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), calendar.get(Calendar.SECOND), calendar.get(Calendar.MILLISECOND)); [EOL] } <line_num>: 114,124
public static TimeOfDay fromDateFields(Date date) { [EOL]     if (date == null) { [EOL]         throw new IllegalArgumentException("The date must not be null"); [EOL]     } [EOL]     return new TimeOfDay(date.getHours(), date.getMinutes(), date.getSeconds(), (((int) (date.getTime() % 1000)) + 1000) % 1000); [EOL] } <line_num>: 144,154
public static TimeOfDay fromMillisOfDay(long millisOfDay) { [EOL]     return fromMillisOfDay(millisOfDay, null); [EOL] } <line_num>: 167,169
public static TimeOfDay fromMillisOfDay(long millisOfDay, Chronology chrono) { [EOL]     chrono = DateTimeUtils.getChronology(chrono); [EOL]     chrono = chrono.withUTC(); [EOL]     return new TimeOfDay(millisOfDay, chrono); [EOL] } <line_num>: 182,186
public int size() { [EOL]     return 4; [EOL] } <line_num>: 428,430
protected DateTimeField getField(int index, Chronology chrono) { [EOL]     switch(index) { [EOL]         case HOUR_OF_DAY: [EOL]             return chrono.hourOfDay(); [EOL]         case MINUTE_OF_HOUR: [EOL]             return chrono.minuteOfHour(); [EOL]         case SECOND_OF_MINUTE: [EOL]             return chrono.secondOfMinute(); [EOL]         case MILLIS_OF_SECOND: [EOL]             return chrono.millisOfSecond(); [EOL]         default: [EOL]             throw new IndexOutOfBoundsException("Invalid index: " + index); [EOL]     } [EOL] } <line_num>: 441,454
public DateTimeFieldType getFieldType(int index) { [EOL]     return FIELD_TYPES[index]; [EOL] } <line_num>: 463,465
public DateTimeFieldType[] getFieldTypes() { [EOL]     return (DateTimeFieldType[]) FIELD_TYPES.clone(); [EOL] } <line_num>: 474,476
public TimeOfDay withChronologyRetainFields(Chronology newChronology) { [EOL]     newChronology = DateTimeUtils.getChronology(newChronology); [EOL]     newChronology = newChronology.withUTC(); [EOL]     if (newChronology == getChronology()) { [EOL]         return this; [EOL]     } else { [EOL]         TimeOfDay newTimeOfDay = new TimeOfDay(this, newChronology); [EOL]         newChronology.validate(newTimeOfDay, getValues()); [EOL]         return newTimeOfDay; [EOL]     } [EOL] } <line_num>: 493,503
public TimeOfDay withField(DateTimeFieldType fieldType, int value) { [EOL]     int index = indexOfSupported(fieldType); [EOL]     if (value == getValue(index)) { [EOL]         return this; [EOL]     } [EOL]     int[] newValues = getValues(); [EOL]     newValues = getField(index).set(this, index, newValues, value); [EOL]     return new TimeOfDay(this, newValues); [EOL] } <line_num>: 523,531
public TimeOfDay withFieldAdded(DurationFieldType fieldType, int amount) { [EOL]     int index = indexOfSupported(fieldType); [EOL]     if (amount == 0) { [EOL]         return this; [EOL]     } [EOL]     int[] newValues = getValues(); [EOL]     newValues = getField(index).addWrapPartial(this, index, newValues, amount); [EOL]     return new TimeOfDay(this, newValues); [EOL] } <line_num>: 552,560
public TimeOfDay withPeriodAdded(ReadablePeriod period, int scalar) { [EOL]     if (period == null || scalar == 0) { [EOL]         return this; [EOL]     } [EOL]     int[] newValues = getValues(); [EOL]     for (int i = 0; i < period.size(); i++) { [EOL]         DurationFieldType fieldType = period.getFieldType(i); [EOL]         int index = indexOf(fieldType); [EOL]         if (index >= 0) { [EOL]             newValues = getField(index).addWrapPartial(this, index, newValues, FieldUtils.safeMultiply(period.getValue(i), scalar)); [EOL]         } [EOL]     } [EOL]     return new TimeOfDay(this, newValues); [EOL] } <line_num>: 579,593
public TimeOfDay plus(ReadablePeriod period) { [EOL]     return withPeriodAdded(period, 1); [EOL] } <line_num>: 610,612
public TimeOfDay plusHours(int hours) { [EOL]     return withFieldAdded(DurationFieldType.hours(), hours); [EOL] } <line_num>: 631,633
public TimeOfDay plusMinutes(int minutes) { [EOL]     return withFieldAdded(DurationFieldType.minutes(), minutes); [EOL] } <line_num>: 651,653
public TimeOfDay plusSeconds(int seconds) { [EOL]     return withFieldAdded(DurationFieldType.seconds(), seconds); [EOL] } <line_num>: 671,673
public TimeOfDay plusMillis(int millis) { [EOL]     return withFieldAdded(DurationFieldType.millis(), millis); [EOL] } <line_num>: 691,693
public TimeOfDay minus(ReadablePeriod period) { [EOL]     return withPeriodAdded(period, -1); [EOL] } <line_num>: 710,712
public TimeOfDay minusHours(int hours) { [EOL]     return withFieldAdded(DurationFieldType.hours(), FieldUtils.safeNegate(hours)); [EOL] } <line_num>: 731,733
public TimeOfDay minusMinutes(int minutes) { [EOL]     return withFieldAdded(DurationFieldType.minutes(), FieldUtils.safeNegate(minutes)); [EOL] } <line_num>: 751,753
public TimeOfDay minusSeconds(int seconds) { [EOL]     return withFieldAdded(DurationFieldType.seconds(), FieldUtils.safeNegate(seconds)); [EOL] } <line_num>: 771,773
public TimeOfDay minusMillis(int millis) { [EOL]     return withFieldAdded(DurationFieldType.millis(), FieldUtils.safeNegate(millis)); [EOL] } <line_num>: 791,793
public Property property(DateTimeFieldType type) { [EOL]     return new Property(this, indexOfSupported(type)); [EOL] } <line_num>: 804,806
public LocalTime toLocalTime() { [EOL]     return new LocalTime(getHourOfDay(), getMinuteOfHour(), getSecondOfMinute(), getMillisOfSecond(), getChronology()); [EOL] } <line_num>: 815,818
public DateTime toDateTimeToday() { [EOL]     return toDateTimeToday(null); [EOL] } <line_num>: 828,830
public DateTime toDateTimeToday(DateTimeZone zone) { [EOL]     Chronology chrono = getChronology().withZone(zone); [EOL]     long instantMillis = DateTimeUtils.currentTimeMillis(); [EOL]     long resolved = chrono.set(this, instantMillis); [EOL]     return new DateTime(resolved, chrono); [EOL] } <line_num>: 843,848
public int getHourOfDay() { [EOL]     return getValue(HOUR_OF_DAY); [EOL] } <line_num>: 856,858
public int getMinuteOfHour() { [EOL]     return getValue(MINUTE_OF_HOUR); [EOL] } <line_num>: 865,867
public int getSecondOfMinute() { [EOL]     return getValue(SECOND_OF_MINUTE); [EOL] } <line_num>: 874,876
public int getMillisOfSecond() { [EOL]     return getValue(MILLIS_OF_SECOND); [EOL] } <line_num>: 883,885
public TimeOfDay withHourOfDay(int hour) { [EOL]     int[] newValues = getValues(); [EOL]     newValues = getChronology().hourOfDay().set(this, HOUR_OF_DAY, newValues, hour); [EOL]     return new TimeOfDay(this, newValues); [EOL] } <line_num>: 900,904
public TimeOfDay withMinuteOfHour(int minute) { [EOL]     int[] newValues = getValues(); [EOL]     newValues = getChronology().minuteOfHour().set(this, MINUTE_OF_HOUR, newValues, minute); [EOL]     return new TimeOfDay(this, newValues); [EOL] } <line_num>: 918,922
public TimeOfDay withSecondOfMinute(int second) { [EOL]     int[] newValues = getValues(); [EOL]     newValues = getChronology().secondOfMinute().set(this, SECOND_OF_MINUTE, newValues, second); [EOL]     return new TimeOfDay(this, newValues); [EOL] } <line_num>: 936,940
public TimeOfDay withMillisOfSecond(int millis) { [EOL]     int[] newValues = getValues(); [EOL]     newValues = getChronology().millisOfSecond().set(this, MILLIS_OF_SECOND, newValues, millis); [EOL]     return new TimeOfDay(this, newValues); [EOL] } <line_num>: 954,958
public Property hourOfDay() { [EOL]     return new Property(this, HOUR_OF_DAY); [EOL] } <line_num>: 966,968
public Property minuteOfHour() { [EOL]     return new Property(this, MINUTE_OF_HOUR); [EOL] } <line_num>: 975,977
public Property secondOfMinute() { [EOL]     return new Property(this, SECOND_OF_MINUTE); [EOL] } <line_num>: 984,986
public Property millisOfSecond() { [EOL]     return new Property(this, MILLIS_OF_SECOND); [EOL] } <line_num>: 993,995
public String toString() { [EOL]     return ISODateTimeFormat.tTime().print(this); [EOL] } <line_num>: 1003,1005
public DateTimeField getField() { [EOL]     return iTimeOfDay.getField(iFieldIndex); [EOL] } <line_num>: 1045,1047
protected ReadablePartial getReadablePartial() { [EOL]     return iTimeOfDay; [EOL] } <line_num>: 1054,1056
public TimeOfDay getTimeOfDay() { [EOL]     return iTimeOfDay; [EOL] } <line_num>: 1063,1065
public int get() { [EOL]     return iTimeOfDay.getValue(iFieldIndex); [EOL] } <line_num>: 1072,1074
public TimeOfDay addToCopy(int valueToAdd) { [EOL]     int[] newValues = iTimeOfDay.getValues(); [EOL]     newValues = getField().addWrapPartial(iTimeOfDay, iFieldIndex, newValues, valueToAdd); [EOL]     return new TimeOfDay(iTimeOfDay, newValues); [EOL] } <line_num>: 1096,1100
public TimeOfDay addNoWrapToCopy(int valueToAdd) { [EOL]     int[] newValues = iTimeOfDay.getValues(); [EOL]     newValues = getField().add(iTimeOfDay, iFieldIndex, newValues, valueToAdd); [EOL]     return new TimeOfDay(iTimeOfDay, newValues); [EOL] } <line_num>: 1122,1126
public TimeOfDay addWrapFieldToCopy(int valueToAdd) { [EOL]     int[] newValues = iTimeOfDay.getValues(); [EOL]     newValues = getField().addWrapField(iTimeOfDay, iFieldIndex, newValues, valueToAdd); [EOL]     return new TimeOfDay(iTimeOfDay, newValues); [EOL] } <line_num>: 1146,1150
public TimeOfDay setCopy(int value) { [EOL]     int[] newValues = iTimeOfDay.getValues(); [EOL]     newValues = getField().set(iTimeOfDay, iFieldIndex, newValues, value); [EOL]     return new TimeOfDay(iTimeOfDay, newValues); [EOL] } <line_num>: 1163,1167
public TimeOfDay setCopy(String text, Locale locale) { [EOL]     int[] newValues = iTimeOfDay.getValues(); [EOL]     newValues = getField().set(iTimeOfDay, iFieldIndex, newValues, text, locale); [EOL]     return new TimeOfDay(iTimeOfDay, newValues); [EOL] } <line_num>: 1180,1184
public TimeOfDay setCopy(String text) { [EOL]     return setCopy(text, null); [EOL] } <line_num>: 1196,1198
public TimeOfDay withMaximumValue() { [EOL]     return setCopy(getMaximumValue()); [EOL] } <line_num>: 1210,1212
public TimeOfDay withMinimumValue() { [EOL]     return setCopy(getMinimumValue()); [EOL] } <line_num>: 1223,1225
