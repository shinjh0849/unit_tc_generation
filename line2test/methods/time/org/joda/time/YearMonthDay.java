public YearMonthDay() { [EOL]     super(); [EOL] } <line_num>: 152,154
public YearMonthDay(DateTimeZone zone) { [EOL]     super(ISOChronology.getInstance(zone)); [EOL] } <line_num>: 167,169
public YearMonthDay(Chronology chronology) { [EOL]     super(chronology); [EOL] } <line_num>: 181,183
public YearMonthDay(long instant) { [EOL]     super(instant); [EOL] } <line_num>: 195,197
public YearMonthDay(long instant, Chronology chronology) { [EOL]     super(instant, chronology); [EOL] } <line_num>: 210,212
public YearMonthDay(Object instant) { [EOL]     super(instant, null, ISODateTimeFormat.dateOptionalTimeParser()); [EOL] } <line_num>: 230,232
public YearMonthDay(Object instant, Chronology chronology) { [EOL]     super(instant, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.dateOptionalTimeParser()); [EOL] } <line_num>: 255,257
public YearMonthDay(int year, int monthOfYear, int dayOfMonth) { [EOL]     this(year, monthOfYear, dayOfMonth, null); [EOL] } <line_num>: 271,273
public YearMonthDay(int year, int monthOfYear, int dayOfMonth, Chronology chronology) { [EOL]     super(new int[] { year, monthOfYear, dayOfMonth }, chronology); [EOL] } <line_num>: 287,289
YearMonthDay(YearMonthDay partial, int[] values) { [EOL]     super(partial, values); [EOL] } <line_num>: 297,299
YearMonthDay(YearMonthDay partial, Chronology chrono) { [EOL]     super(partial, chrono); [EOL] } <line_num>: 307,309
Property(YearMonthDay partial, int fieldIndex) { [EOL]     super(); [EOL]     iYearMonthDay = partial; [EOL]     iFieldIndex = fieldIndex; [EOL] } <line_num>: 949,953
public static YearMonthDay fromCalendarFields(Calendar calendar) { [EOL]     if (calendar == null) { [EOL]         throw new IllegalArgumentException("The calendar must not be null"); [EOL]     } [EOL]     return new YearMonthDay(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DAY_OF_MONTH)); [EOL] } <line_num>: 105,114
public static YearMonthDay fromDateFields(Date date) { [EOL]     if (date == null) { [EOL]         throw new IllegalArgumentException("The date must not be null"); [EOL]     } [EOL]     return new YearMonthDay(date.getYear() + 1900, date.getMonth() + 1, date.getDate()); [EOL] } <line_num>: 132,141
public int size() { [EOL]     return 3; [EOL] } <line_num>: 317,319
protected DateTimeField getField(int index, Chronology chrono) { [EOL]     switch(index) { [EOL]         case YEAR: [EOL]             return chrono.year(); [EOL]         case MONTH_OF_YEAR: [EOL]             return chrono.monthOfYear(); [EOL]         case DAY_OF_MONTH: [EOL]             return chrono.dayOfMonth(); [EOL]         default: [EOL]             throw new IndexOutOfBoundsException("Invalid index: " + index); [EOL]     } [EOL] } <line_num>: 330,341
public DateTimeFieldType getFieldType(int index) { [EOL]     return FIELD_TYPES[index]; [EOL] } <line_num>: 350,352
public DateTimeFieldType[] getFieldTypes() { [EOL]     return (DateTimeFieldType[]) FIELD_TYPES.clone(); [EOL] } <line_num>: 361,363
public YearMonthDay withChronologyRetainFields(Chronology newChronology) { [EOL]     newChronology = DateTimeUtils.getChronology(newChronology); [EOL]     newChronology = newChronology.withUTC(); [EOL]     if (newChronology == getChronology()) { [EOL]         return this; [EOL]     } else { [EOL]         YearMonthDay newYearMonthDay = new YearMonthDay(this, newChronology); [EOL]         newChronology.validate(newYearMonthDay, getValues()); [EOL]         return newYearMonthDay; [EOL]     } [EOL] } <line_num>: 380,390
public YearMonthDay withField(DateTimeFieldType fieldType, int value) { [EOL]     int index = indexOfSupported(fieldType); [EOL]     if (value == getValue(index)) { [EOL]         return this; [EOL]     } [EOL]     int[] newValues = getValues(); [EOL]     newValues = getField(index).set(this, index, newValues, value); [EOL]     return new YearMonthDay(this, newValues); [EOL] } <line_num>: 410,418
public YearMonthDay withFieldAdded(DurationFieldType fieldType, int amount) { [EOL]     int index = indexOfSupported(fieldType); [EOL]     if (amount == 0) { [EOL]         return this; [EOL]     } [EOL]     int[] newValues = getValues(); [EOL]     newValues = getField(index).add(this, index, newValues, amount); [EOL]     return new YearMonthDay(this, newValues); [EOL] } <line_num>: 438,446
public YearMonthDay withPeriodAdded(ReadablePeriod period, int scalar) { [EOL]     if (period == null || scalar == 0) { [EOL]         return this; [EOL]     } [EOL]     int[] newValues = getValues(); [EOL]     for (int i = 0; i < period.size(); i++) { [EOL]         DurationFieldType fieldType = period.getFieldType(i); [EOL]         int index = indexOf(fieldType); [EOL]         if (index >= 0) { [EOL]             newValues = getField(index).add(this, index, newValues, FieldUtils.safeMultiply(period.getValue(i), scalar)); [EOL]         } [EOL]     } [EOL]     return new YearMonthDay(this, newValues); [EOL] } <line_num>: 464,478
public YearMonthDay plus(ReadablePeriod period) { [EOL]     return withPeriodAdded(period, 1); [EOL] } <line_num>: 494,496
public YearMonthDay plusYears(int years) { [EOL]     return withFieldAdded(DurationFieldType.years(), years); [EOL] } <line_num>: 515,517
public YearMonthDay plusMonths(int months) { [EOL]     return withFieldAdded(DurationFieldType.months(), months); [EOL] } <line_num>: 535,537
public YearMonthDay plusDays(int days) { [EOL]     return withFieldAdded(DurationFieldType.days(), days); [EOL] } <line_num>: 555,557
public YearMonthDay minus(ReadablePeriod period) { [EOL]     return withPeriodAdded(period, -1); [EOL] } <line_num>: 573,575
public YearMonthDay minusYears(int years) { [EOL]     return withFieldAdded(DurationFieldType.years(), FieldUtils.safeNegate(years)); [EOL] } <line_num>: 594,596
public YearMonthDay minusMonths(int months) { [EOL]     return withFieldAdded(DurationFieldType.months(), FieldUtils.safeNegate(months)); [EOL] } <line_num>: 614,616
public YearMonthDay minusDays(int days) { [EOL]     return withFieldAdded(DurationFieldType.days(), FieldUtils.safeNegate(days)); [EOL] } <line_num>: 634,636
public Property property(DateTimeFieldType type) { [EOL]     return new Property(this, indexOfSupported(type)); [EOL] } <line_num>: 647,649
public LocalDate toLocalDate() { [EOL]     return new LocalDate(getYear(), getMonthOfYear(), getDayOfMonth(), getChronology()); [EOL] } <line_num>: 658,660
public DateTime toDateTimeAtMidnight() { [EOL]     return toDateTimeAtMidnight(null); [EOL] } <line_num>: 669,671
public DateTime toDateTimeAtMidnight(DateTimeZone zone) { [EOL]     Chronology chrono = getChronology().withZone(zone); [EOL]     return new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), 0, 0, 0, 0, chrono); [EOL] } <line_num>: 683,686
public DateTime toDateTimeAtCurrentTime() { [EOL]     return toDateTimeAtCurrentTime(null); [EOL] } <line_num>: 696,698
public DateTime toDateTimeAtCurrentTime(DateTimeZone zone) { [EOL]     Chronology chrono = getChronology().withZone(zone); [EOL]     long instantMillis = DateTimeUtils.currentTimeMillis(); [EOL]     long resolved = chrono.set(this, instantMillis); [EOL]     return new DateTime(resolved, chrono); [EOL] } <line_num>: 711,716
public DateMidnight toDateMidnight() { [EOL]     return toDateMidnight(null); [EOL] } <line_num>: 724,726
public DateMidnight toDateMidnight(DateTimeZone zone) { [EOL]     Chronology chrono = getChronology().withZone(zone); [EOL]     return new DateMidnight(getYear(), getMonthOfYear(), getDayOfMonth(), chrono); [EOL] } <line_num>: 734,737
public DateTime toDateTime(TimeOfDay time) { [EOL]     return toDateTime(time, null); [EOL] } <line_num>: 752,754
public DateTime toDateTime(TimeOfDay time, DateTimeZone zone) { [EOL]     Chronology chrono = getChronology().withZone(zone); [EOL]     long instant = DateTimeUtils.currentTimeMillis(); [EOL]     instant = chrono.set(this, instant); [EOL]     if (time != null) { [EOL]         instant = chrono.set(time, instant); [EOL]     } [EOL]     return new DateTime(instant, chrono); [EOL] } <line_num>: 769,777
public Interval toInterval() { [EOL]     return toInterval(null); [EOL] } <line_num>: 786,788
public Interval toInterval(DateTimeZone zone) { [EOL]     zone = DateTimeUtils.getZone(zone); [EOL]     return toDateMidnight(zone).toInterval(); [EOL] } <line_num>: 796,799
public int getYear() { [EOL]     return getValue(YEAR); [EOL] } <line_num>: 807,809
public int getMonthOfYear() { [EOL]     return getValue(MONTH_OF_YEAR); [EOL] } <line_num>: 816,818
public int getDayOfMonth() { [EOL]     return getValue(DAY_OF_MONTH); [EOL] } <line_num>: 825,827
public YearMonthDay withYear(int year) { [EOL]     int[] newValues = getValues(); [EOL]     newValues = getChronology().year().set(this, YEAR, newValues, year); [EOL]     return new YearMonthDay(this, newValues); [EOL] } <line_num>: 842,846
public YearMonthDay withMonthOfYear(int monthOfYear) { [EOL]     int[] newValues = getValues(); [EOL]     newValues = getChronology().monthOfYear().set(this, MONTH_OF_YEAR, newValues, monthOfYear); [EOL]     return new YearMonthDay(this, newValues); [EOL] } <line_num>: 860,864
public YearMonthDay withDayOfMonth(int dayOfMonth) { [EOL]     int[] newValues = getValues(); [EOL]     newValues = getChronology().dayOfMonth().set(this, DAY_OF_MONTH, newValues, dayOfMonth); [EOL]     return new YearMonthDay(this, newValues); [EOL] } <line_num>: 878,882
public Property year() { [EOL]     return new Property(this, YEAR); [EOL] } <line_num>: 890,892
public Property monthOfYear() { [EOL]     return new Property(this, MONTH_OF_YEAR); [EOL] } <line_num>: 899,901
public Property dayOfMonth() { [EOL]     return new Property(this, DAY_OF_MONTH); [EOL] } <line_num>: 908,910
public String toString() { [EOL]     return ISODateTimeFormat.yearMonthDay().print(this); [EOL] } <line_num>: 918,920
public DateTimeField getField() { [EOL]     return iYearMonthDay.getField(iFieldIndex); [EOL] } <line_num>: 960,962
protected ReadablePartial getReadablePartial() { [EOL]     return iYearMonthDay; [EOL] } <line_num>: 969,971
public YearMonthDay getYearMonthDay() { [EOL]     return iYearMonthDay; [EOL] } <line_num>: 978,980
public int get() { [EOL]     return iYearMonthDay.getValue(iFieldIndex); [EOL] } <line_num>: 987,989
public YearMonthDay addToCopy(int valueToAdd) { [EOL]     int[] newValues = iYearMonthDay.getValues(); [EOL]     newValues = getField().add(iYearMonthDay, iFieldIndex, newValues, valueToAdd); [EOL]     return new YearMonthDay(iYearMonthDay, newValues); [EOL] } <line_num>: 1009,1013
public YearMonthDay addWrapFieldToCopy(int valueToAdd) { [EOL]     int[] newValues = iYearMonthDay.getValues(); [EOL]     newValues = getField().addWrapField(iYearMonthDay, iFieldIndex, newValues, valueToAdd); [EOL]     return new YearMonthDay(iYearMonthDay, newValues); [EOL] } <line_num>: 1033,1037
public YearMonthDay setCopy(int value) { [EOL]     int[] newValues = iYearMonthDay.getValues(); [EOL]     newValues = getField().set(iYearMonthDay, iFieldIndex, newValues, value); [EOL]     return new YearMonthDay(iYearMonthDay, newValues); [EOL] } <line_num>: 1050,1054
public YearMonthDay setCopy(String text, Locale locale) { [EOL]     int[] newValues = iYearMonthDay.getValues(); [EOL]     newValues = getField().set(iYearMonthDay, iFieldIndex, newValues, text, locale); [EOL]     return new YearMonthDay(iYearMonthDay, newValues); [EOL] } <line_num>: 1067,1071
public YearMonthDay setCopy(String text) { [EOL]     return setCopy(text, null); [EOL] } <line_num>: 1083,1085
public YearMonthDay withMaximumValue() { [EOL]     return setCopy(getMaximumValue()); [EOL] } <line_num>: 1103,1105
public YearMonthDay withMinimumValue() { [EOL]     return setCopy(getMinimumValue()); [EOL] } <line_num>: 1116,1118
