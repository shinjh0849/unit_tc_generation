public YearMonth() { [EOL]     super(); [EOL] } <line_num>: 212,214
public YearMonth(DateTimeZone zone) { [EOL]     super(ISOChronology.getInstance(zone)); [EOL] } <line_num>: 227,229
public YearMonth(Chronology chronology) { [EOL]     super(chronology); [EOL] } <line_num>: 242,244
public YearMonth(long instant) { [EOL]     super(instant); [EOL] } <line_num>: 256,258
public YearMonth(long instant, Chronology chronology) { [EOL]     super(instant, chronology); [EOL] } <line_num>: 271,273
public YearMonth(Object instant) { [EOL]     super(instant, null, ISODateTimeFormat.localDateParser()); [EOL] } <line_num>: 288,290
public YearMonth(Object instant, Chronology chronology) { [EOL]     super(instant, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.localDateParser()); [EOL] } <line_num>: 310,312
public YearMonth(int year, int monthOfYear) { [EOL]     this(year, monthOfYear, null); [EOL] } <line_num>: 325,327
public YearMonth(int year, int monthOfYear, Chronology chronology) { [EOL]     super(new int[] { year, monthOfYear }, chronology); [EOL] } <line_num>: 343,345
YearMonth(YearMonth partial, int[] values) { [EOL]     super(partial, values); [EOL] } <line_num>: 353,355
YearMonth(YearMonth partial, Chronology chrono) { [EOL]     super(partial, chrono); [EOL] } <line_num>: 363,365
Property(YearMonth partial, int fieldIndex) { [EOL]     super(); [EOL]     iBase = partial; [EOL]     iFieldIndex = fieldIndex; [EOL] } <line_num>: 852,856
public static YearMonth now() { [EOL]     return new YearMonth(); [EOL] } <line_num>: 94,96
public static YearMonth now(DateTimeZone zone) { [EOL]     if (zone == null) { [EOL]         throw new NullPointerException("Zone must not be null"); [EOL]     } [EOL]     return new YearMonth(zone); [EOL] } <line_num>: 107,112
public static YearMonth now(Chronology chronology) { [EOL]     if (chronology == null) { [EOL]         throw new NullPointerException("Chronology must not be null"); [EOL]     } [EOL]     return new YearMonth(chronology); [EOL] } <line_num>: 123,128
@FromString [EOL] public static YearMonth parse(String str) { [EOL]     return parse(str, ISODateTimeFormat.localDateParser()); [EOL] } <line_num>: 139,142
public static YearMonth parse(String str, DateTimeFormatter formatter) { [EOL]     LocalDate date = formatter.parseLocalDate(str); [EOL]     return new YearMonth(date.getYear(), date.getMonthOfYear()); [EOL] } <line_num>: 151,154
public static YearMonth fromCalendarFields(Calendar calendar) { [EOL]     if (calendar == null) { [EOL]         throw new IllegalArgumentException("The calendar must not be null"); [EOL]     } [EOL]     return new YearMonth(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1); [EOL] } <line_num>: 173,178
@SuppressWarnings("deprecation") [EOL] public static YearMonth fromDateFields(Date date) { [EOL]     if (date == null) { [EOL]         throw new IllegalArgumentException("The date must not be null"); [EOL]     } [EOL]     return new YearMonth(date.getYear() + 1900, date.getMonth() + 1); [EOL] } <line_num>: 193,199
private Object readResolve() { [EOL]     if (DateTimeZone.UTC.equals(getChronology().getZone()) == false) { [EOL]         return new YearMonth(this, getChronology().withUTC()); [EOL]     } [EOL]     return this; [EOL] } <line_num>: 371,376
public int size() { [EOL]     return 2; [EOL] } <line_num>: 386,388
protected DateTimeField getField(int index, Chronology chrono) { [EOL]     switch(index) { [EOL]         case YEAR: [EOL]             return chrono.year(); [EOL]         case MONTH_OF_YEAR: [EOL]             return chrono.monthOfYear(); [EOL]         default: [EOL]             throw new IndexOutOfBoundsException("Invalid index: " + index); [EOL]     } [EOL] } <line_num>: 399,408
public DateTimeFieldType getFieldType(int index) { [EOL]     return FIELD_TYPES[index]; [EOL] } <line_num>: 417,419
public DateTimeFieldType[] getFieldTypes() { [EOL]     return (DateTimeFieldType[]) FIELD_TYPES.clone(); [EOL] } <line_num>: 428,430
public YearMonth withChronologyRetainFields(Chronology newChronology) { [EOL]     newChronology = DateTimeUtils.getChronology(newChronology); [EOL]     newChronology = newChronology.withUTC(); [EOL]     if (newChronology == getChronology()) { [EOL]         return this; [EOL]     } else { [EOL]         YearMonth newYearMonth = new YearMonth(this, newChronology); [EOL]         newChronology.validate(newYearMonth, getValues()); [EOL]         return newYearMonth; [EOL]     } [EOL] } <line_num>: 447,457
public YearMonth withField(DateTimeFieldType fieldType, int value) { [EOL]     int index = indexOfSupported(fieldType); [EOL]     if (value == getValue(index)) { [EOL]         return this; [EOL]     } [EOL]     int[] newValues = getValues(); [EOL]     newValues = getField(index).set(this, index, newValues, value); [EOL]     return new YearMonth(this, newValues); [EOL] } <line_num>: 477,485
public YearMonth withFieldAdded(DurationFieldType fieldType, int amount) { [EOL]     int index = indexOfSupported(fieldType); [EOL]     if (amount == 0) { [EOL]         return this; [EOL]     } [EOL]     int[] newValues = getValues(); [EOL]     newValues = getField(index).add(this, index, newValues, amount); [EOL]     return new YearMonth(this, newValues); [EOL] } <line_num>: 505,513
public YearMonth withPeriodAdded(ReadablePeriod period, int scalar) { [EOL]     if (period == null || scalar == 0) { [EOL]         return this; [EOL]     } [EOL]     int[] newValues = getValues(); [EOL]     for (int i = 0; i < period.size(); i++) { [EOL]         DurationFieldType fieldType = period.getFieldType(i); [EOL]         int index = indexOf(fieldType); [EOL]         if (index >= 0) { [EOL]             newValues = getField(index).add(this, index, newValues, FieldUtils.safeMultiply(period.getValue(i), scalar)); [EOL]         } [EOL]     } [EOL]     return new YearMonth(this, newValues); [EOL] } <line_num>: 531,545
public YearMonth plus(ReadablePeriod period) { [EOL]     return withPeriodAdded(period, 1); [EOL] } <line_num>: 561,563
public YearMonth plusYears(int years) { [EOL]     return withFieldAdded(DurationFieldType.years(), years); [EOL] } <line_num>: 581,583
public YearMonth plusMonths(int months) { [EOL]     return withFieldAdded(DurationFieldType.months(), months); [EOL] } <line_num>: 600,602
public YearMonth minus(ReadablePeriod period) { [EOL]     return withPeriodAdded(period, -1); [EOL] } <line_num>: 618,620
public YearMonth minusYears(int years) { [EOL]     return withFieldAdded(DurationFieldType.years(), FieldUtils.safeNegate(years)); [EOL] } <line_num>: 638,640
public YearMonth minusMonths(int months) { [EOL]     return withFieldAdded(DurationFieldType.months(), FieldUtils.safeNegate(months)); [EOL] } <line_num>: 657,659
public LocalDate toLocalDate(int dayOfMonth) { [EOL]     return new LocalDate(getYear(), getMonthOfYear(), dayOfMonth, getChronology()); [EOL] } <line_num>: 668,670
public Interval toInterval() { [EOL]     return toInterval(null); [EOL] } <line_num>: 682,684
public Interval toInterval(DateTimeZone zone) { [EOL]     zone = DateTimeUtils.getZone(zone); [EOL]     DateTime start = toLocalDate(1).toDateTimeAtStartOfDay(zone); [EOL]     DateTime end = plusMonths(1).toLocalDate(1).toDateTimeAtStartOfDay(zone); [EOL]     return new Interval(start, end); [EOL] } <line_num>: 696,701
public int getYear() { [EOL]     return getValue(YEAR); [EOL] } <line_num>: 709,711
public int getMonthOfYear() { [EOL]     return getValue(MONTH_OF_YEAR); [EOL] } <line_num>: 718,720
public YearMonth withYear(int year) { [EOL]     int[] newValues = getValues(); [EOL]     newValues = getChronology().year().set(this, YEAR, newValues, year); [EOL]     return new YearMonth(this, newValues); [EOL] } <line_num>: 734,738
public YearMonth withMonthOfYear(int monthOfYear) { [EOL]     int[] newValues = getValues(); [EOL]     newValues = getChronology().monthOfYear().set(this, MONTH_OF_YEAR, newValues, monthOfYear); [EOL]     return new YearMonth(this, newValues); [EOL] } <line_num>: 751,755
public Property property(DateTimeFieldType type) { [EOL]     return new Property(this, indexOfSupported(type)); [EOL] } <line_num>: 766,768
public Property year() { [EOL]     return new Property(this, YEAR); [EOL] } <line_num>: 776,778
public Property monthOfYear() { [EOL]     return new Property(this, MONTH_OF_YEAR); [EOL] } <line_num>: 785,787
@ToString [EOL] public String toString() { [EOL]     return ISODateTimeFormat.yearMonth().print(this); [EOL] } <line_num>: 795,798
public String toString(String pattern) { [EOL]     if (pattern == null) { [EOL]         return toString(); [EOL]     } [EOL]     return DateTimeFormat.forPattern(pattern).print(this); [EOL] } <line_num>: 806,811
public String toString(String pattern, Locale locale) throws IllegalArgumentException { [EOL]     if (pattern == null) { [EOL]         return toString(); [EOL]     } [EOL]     return DateTimeFormat.forPattern(pattern).withLocale(locale).print(this); [EOL] } <line_num>: 820,825
public DateTimeField getField() { [EOL]     return iBase.getField(iFieldIndex); [EOL] } <line_num>: 863,865
protected ReadablePartial getReadablePartial() { [EOL]     return iBase; [EOL] } <line_num>: 872,874
public YearMonth getYearMonth() { [EOL]     return iBase; [EOL] } <line_num>: 881,883
public int get() { [EOL]     return iBase.getValue(iFieldIndex); [EOL] } <line_num>: 890,892
public YearMonth addToCopy(int valueToAdd) { [EOL]     int[] newValues = iBase.getValues(); [EOL]     newValues = getField().add(iBase, iFieldIndex, newValues, valueToAdd); [EOL]     return new YearMonth(iBase, newValues); [EOL] } <line_num>: 912,916
public YearMonth addWrapFieldToCopy(int valueToAdd) { [EOL]     int[] newValues = iBase.getValues(); [EOL]     newValues = getField().addWrapField(iBase, iFieldIndex, newValues, valueToAdd); [EOL]     return new YearMonth(iBase, newValues); [EOL] } <line_num>: 936,940
public YearMonth setCopy(int value) { [EOL]     int[] newValues = iBase.getValues(); [EOL]     newValues = getField().set(iBase, iFieldIndex, newValues, value); [EOL]     return new YearMonth(iBase, newValues); [EOL] } <line_num>: 953,957
public YearMonth setCopy(String text, Locale locale) { [EOL]     int[] newValues = iBase.getValues(); [EOL]     newValues = getField().set(iBase, iFieldIndex, newValues, text, locale); [EOL]     return new YearMonth(iBase, newValues); [EOL] } <line_num>: 970,974
public YearMonth setCopy(String text) { [EOL]     return setCopy(text, null); [EOL] } <line_num>: 986,988
