public TestPeriodFormatParsing(String name)
public static void main(String[] args)
public static TestSuite suite()
protected void setUp() throws Exception
protected void tearDown() throws Exception
public void testParseStandard1()
public void testParseCustom1()
Period PERIOD=Optional[new Period(1, 2, 3, 4, 5, 6, 7, 8)]
Period EMPTY_PERIOD=Optional[new Period(0, 0, 0, 0, 0, 0, 0, 0)]
Period YEAR_DAY_PERIOD=Optional[new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime())]
Period EMPTY_YEAR_DAY_PERIOD=Optional[new Period(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.yearDayTime())]
Period TIME_PERIOD=Optional[new Period(0, 0, 0, 0, 5, 6, 7, 8)]
Period DATE_PERIOD=Optional[new Period(1, 2, 3, 4, 0, 0, 0, 0)]
DateTimeZone PARIS=Optional[DateTimeZone.forID("Europe/Paris")]
DateTimeZone LONDON=Optional[DateTimeZone.forID("Europe/London")]
DateTimeZone TOKYO=Optional[DateTimeZone.forID("Asia/Tokyo")]
long y2002days=Optional[365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365]
long TEST_TIME_NOW=Optional[(y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY]
DateTimeZone originalDateTimeZone=Optional[null]
TimeZone originalTimeZone=Optional[null]
Locale originalLocale=Optional[null]
