public MonthDay() { [EOL]     super(); [EOL] } <line_num>: 220,222
public MonthDay(DateTimeZone zone) { [EOL]     super(ISOChronology.getInstance(zone)); [EOL] } <line_num>: 235,237
public MonthDay(Chronology chronology) { [EOL]     super(chronology); [EOL] } <line_num>: 250,252
public MonthDay(long instant) { [EOL]     super(instant); [EOL] } <line_num>: 264,266
public MonthDay(long instant, Chronology chronology) { [EOL]     super(instant, chronology); [EOL] } <line_num>: 279,281
public MonthDay(Object instant) { [EOL]     super(instant, null, ISODateTimeFormat.localDateParser()); [EOL] } <line_num>: 296,298
public MonthDay(Object instant, Chronology chronology) { [EOL]     super(instant, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.localDateParser()); [EOL] } <line_num>: 318,320
public MonthDay(int monthOfYear, int dayOfMonth) { [EOL]     this(monthOfYear, dayOfMonth, null); [EOL] } <line_num>: 333,335
public MonthDay(int monthOfYear, int dayOfMonth, Chronology chronology) { [EOL]     super(new int[] { monthOfYear, dayOfMonth }, chronology); [EOL] } <line_num>: 351,353
MonthDay(MonthDay partial, int[] values) { [EOL]     super(partial, values); [EOL] } <line_num>: 361,363
MonthDay(MonthDay partial, Chronology chrono) { [EOL]     super(partial, chrono); [EOL] } <line_num>: 371,373
Property(MonthDay partial, int fieldIndex) { [EOL]     super(); [EOL]     iBase = partial; [EOL]     iFieldIndex = fieldIndex; [EOL] } <line_num>: 838,842
public static MonthDay now() { [EOL]     return new MonthDay(); [EOL] } <line_num>: 102,104
public static MonthDay now(DateTimeZone zone) { [EOL]     if (zone == null) { [EOL]         throw new NullPointerException("Zone must not be null"); [EOL]     } [EOL]     return new MonthDay(zone); [EOL] } <line_num>: 115,120
public static MonthDay now(Chronology chronology) { [EOL]     if (chronology == null) { [EOL]         throw new NullPointerException("Chronology must not be null"); [EOL]     } [EOL]     return new MonthDay(chronology); [EOL] } <line_num>: 131,136
@FromString [EOL] public static MonthDay parse(String str) { [EOL]     return parse(str, PARSER); [EOL] } <line_num>: 147,150
public static MonthDay parse(String str, DateTimeFormatter formatter) { [EOL]     LocalDate date = formatter.parseLocalDate(str); [EOL]     return new MonthDay(date.getMonthOfYear(), date.getDayOfMonth()); [EOL] } <line_num>: 159,162
public static MonthDay fromCalendarFields(Calendar calendar) { [EOL]     if (calendar == null) { [EOL]         throw new IllegalArgumentException("The calendar must not be null"); [EOL]     } [EOL]     return new MonthDay(calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DAY_OF_MONTH)); [EOL] } <line_num>: 181,186
@SuppressWarnings("deprecation") [EOL] public static MonthDay fromDateFields(Date date) { [EOL]     if (date == null) { [EOL]         throw new IllegalArgumentException("The date must not be null"); [EOL]     } [EOL]     return new MonthDay(date.getMonth() + 1, date.getDate()); [EOL] } <line_num>: 201,207
private Object readResolve() { [EOL]     if (DateTimeZone.UTC.equals(getChronology().getZone()) == false) { [EOL]         return new MonthDay(this, getChronology().withUTC()); [EOL]     } [EOL]     return this; [EOL] } <line_num>: 379,384
public int size() { [EOL]     return 2; [EOL] } <line_num>: 394,396
protected DateTimeField getField(int index, Chronology chrono) { [EOL]     switch(index) { [EOL]         case MONTH_OF_YEAR: [EOL]             return chrono.monthOfYear(); [EOL]         case DAY_OF_MONTH: [EOL]             return chrono.dayOfMonth(); [EOL]         default: [EOL]             throw new IndexOutOfBoundsException("Invalid index: " + index); [EOL]     } [EOL] } <line_num>: 407,416
public DateTimeFieldType getFieldType(int index) { [EOL]     return FIELD_TYPES[index]; [EOL] } <line_num>: 425,427
public DateTimeFieldType[] getFieldTypes() { [EOL]     return (DateTimeFieldType[]) FIELD_TYPES.clone(); [EOL] } <line_num>: 436,438
public MonthDay withChronologyRetainFields(Chronology newChronology) { [EOL]     newChronology = DateTimeUtils.getChronology(newChronology); [EOL]     newChronology = newChronology.withUTC(); [EOL]     if (newChronology == getChronology()) { [EOL]         return this; [EOL]     } else { [EOL]         MonthDay newMonthDay = new MonthDay(this, newChronology); [EOL]         newChronology.validate(newMonthDay, getValues()); [EOL]         return newMonthDay; [EOL]     } [EOL] } <line_num>: 455,465
public MonthDay withField(DateTimeFieldType fieldType, int value) { [EOL]     int index = indexOfSupported(fieldType); [EOL]     if (value == getValue(index)) { [EOL]         return this; [EOL]     } [EOL]     int[] newValues = getValues(); [EOL]     newValues = getField(index).set(this, index, newValues, value); [EOL]     return new MonthDay(this, newValues); [EOL] } <line_num>: 485,493
public MonthDay withFieldAdded(DurationFieldType fieldType, int amount) { [EOL]     int index = indexOfSupported(fieldType); [EOL]     if (amount == 0) { [EOL]         return this; [EOL]     } [EOL]     int[] newValues = getValues(); [EOL]     newValues = getField(index).add(this, index, newValues, amount); [EOL]     return new MonthDay(this, newValues); [EOL] } <line_num>: 513,521
public MonthDay withPeriodAdded(ReadablePeriod period, int scalar) { [EOL]     if (period == null || scalar == 0) { [EOL]         return this; [EOL]     } [EOL]     int[] newValues = getValues(); [EOL]     for (int i = 0; i < period.size(); i++) { [EOL]         DurationFieldType fieldType = period.getFieldType(i); [EOL]         int index = indexOf(fieldType); [EOL]         if (index >= 0) { [EOL]             newValues = getField(index).add(this, index, newValues, FieldUtils.safeMultiply(period.getValue(i), scalar)); [EOL]         } [EOL]     } [EOL]     return new MonthDay(this, newValues); [EOL] } <line_num>: 539,553
public MonthDay plus(ReadablePeriod period) { [EOL]     return withPeriodAdded(period, 1); [EOL] } <line_num>: 569,571
public MonthDay plusMonths(int months) { [EOL]     return withFieldAdded(DurationFieldType.months(), months); [EOL] } <line_num>: 591,593
public MonthDay plusDays(int days) { [EOL]     return withFieldAdded(DurationFieldType.days(), days); [EOL] } <line_num>: 611,613
public MonthDay minus(ReadablePeriod period) { [EOL]     return withPeriodAdded(period, -1); [EOL] } <line_num>: 629,631
public MonthDay minusMonths(int months) { [EOL]     return withFieldAdded(DurationFieldType.months(), FieldUtils.safeNegate(months)); [EOL] } <line_num>: 651,653
public MonthDay minusDays(int days) { [EOL]     return withFieldAdded(DurationFieldType.days(), FieldUtils.safeNegate(days)); [EOL] } <line_num>: 671,673
public LocalDate toLocalDate(int year) { [EOL]     return new LocalDate(year, getMonthOfYear(), getDayOfMonth(), getChronology()); [EOL] } <line_num>: 682,684
public int getMonthOfYear() { [EOL]     return getValue(MONTH_OF_YEAR); [EOL] } <line_num>: 692,694
public int getDayOfMonth() { [EOL]     return getValue(DAY_OF_MONTH); [EOL] } <line_num>: 701,703
public MonthDay withMonthOfYear(int monthOfYear) { [EOL]     int[] newValues = getValues(); [EOL]     newValues = getChronology().monthOfYear().set(this, MONTH_OF_YEAR, newValues, monthOfYear); [EOL]     return new MonthDay(this, newValues); [EOL] } <line_num>: 717,721
public MonthDay withDayOfMonth(int dayOfMonth) { [EOL]     int[] newValues = getValues(); [EOL]     newValues = getChronology().dayOfMonth().set(this, DAY_OF_MONTH, newValues, dayOfMonth); [EOL]     return new MonthDay(this, newValues); [EOL] } <line_num>: 734,738
public Property property(DateTimeFieldType type) { [EOL]     return new Property(this, indexOfSupported(type)); [EOL] } <line_num>: 749,751
public Property monthOfYear() { [EOL]     return new Property(this, MONTH_OF_YEAR); [EOL] } <line_num>: 759,761
public Property dayOfMonth() { [EOL]     return new Property(this, DAY_OF_MONTH); [EOL] } <line_num>: 768,770
@ToString [EOL] public String toString() { [EOL]     List<DateTimeFieldType> fields = new ArrayList<DateTimeFieldType>(); [EOL]     fields.add(DateTimeFieldType.monthOfYear()); [EOL]     fields.add(DateTimeFieldType.dayOfMonth()); [EOL]     return ISODateTimeFormat.forFields(fields, true, true).print(this); [EOL] } <line_num>: 778,784
public String toString(String pattern) { [EOL]     if (pattern == null) { [EOL]         return toString(); [EOL]     } [EOL]     return DateTimeFormat.forPattern(pattern).print(this); [EOL] } <line_num>: 792,797
public String toString(String pattern, Locale locale) throws IllegalArgumentException { [EOL]     if (pattern == null) { [EOL]         return toString(); [EOL]     } [EOL]     return DateTimeFormat.forPattern(pattern).withLocale(locale).print(this); [EOL] } <line_num>: 806,811
public DateTimeField getField() { [EOL]     return iBase.getField(iFieldIndex); [EOL] } <line_num>: 849,851
protected ReadablePartial getReadablePartial() { [EOL]     return iBase; [EOL] } <line_num>: 858,860
public MonthDay getMonthDay() { [EOL]     return iBase; [EOL] } <line_num>: 867,869
public int get() { [EOL]     return iBase.getValue(iFieldIndex); [EOL] } <line_num>: 876,878
public MonthDay addToCopy(int valueToAdd) { [EOL]     int[] newValues = iBase.getValues(); [EOL]     newValues = getField().add(iBase, iFieldIndex, newValues, valueToAdd); [EOL]     return new MonthDay(iBase, newValues); [EOL] } <line_num>: 895,899
public MonthDay addWrapFieldToCopy(int valueToAdd) { [EOL]     int[] newValues = iBase.getValues(); [EOL]     newValues = getField().addWrapField(iBase, iFieldIndex, newValues, valueToAdd); [EOL]     return new MonthDay(iBase, newValues); [EOL] } <line_num>: 919,923
public MonthDay setCopy(int value) { [EOL]     int[] newValues = iBase.getValues(); [EOL]     newValues = getField().set(iBase, iFieldIndex, newValues, value); [EOL]     return new MonthDay(iBase, newValues); [EOL] } <line_num>: 936,940
public MonthDay setCopy(String text, Locale locale) { [EOL]     int[] newValues = iBase.getValues(); [EOL]     newValues = getField().set(iBase, iFieldIndex, newValues, text, locale); [EOL]     return new MonthDay(iBase, newValues); [EOL] } <line_num>: 953,957
public MonthDay setCopy(String text) { [EOL]     return setCopy(text, null); [EOL] } <line_num>: 969,971
