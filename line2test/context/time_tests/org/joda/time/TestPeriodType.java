public TestPeriodType(String name)
public static void main(String[] args)
public static TestSuite suite()
protected void setUp() throws Exception
protected void tearDown() throws Exception
public void testTest()
private void assertEqualsAfterSerialization(PeriodType type) throws Exception
private void assertSameAfterSerialization(PeriodType type) throws Exception
public void testStandard() throws Exception
public void testYearMonthDayTime() throws Exception
public void testYearMonthDay() throws Exception
public void testYearWeekDayTime() throws Exception
public void testYearWeekDay() throws Exception
public void testYearDayTime() throws Exception
public void testYearDay() throws Exception
public void testDayTime() throws Exception
public void testTime() throws Exception
public void testYears() throws Exception
public void testMonths() throws Exception
public void testWeeks() throws Exception
public void testDays() throws Exception
public void testHours() throws Exception
public void testMinutes() throws Exception
public void testSeconds() throws Exception
public void testMillis() throws Exception
public void testForFields1() throws Exception
public void testForFields2() throws Exception
public void testForFields3() throws Exception
public void testForFields4() throws Exception
public void testForFields5() throws Exception
public void testForFields6() throws Exception
public void testForFields7() throws Exception
public void testMaskYears() throws Exception
public void testMaskMonths() throws Exception
public void testMaskWeeks() throws Exception
public void testMaskDays() throws Exception
public void testMaskHours() throws Exception
public void testMaskMinutes() throws Exception
public void testMaskSeconds() throws Exception
public void testMaskMillis() throws Exception
public void testMaskHoursMinutesSeconds() throws Exception
public void testMaskTwice1() throws Exception
public void testMaskTwice2() throws Exception
public void testEquals() throws Exception
public void testHashCode() throws Exception
public void testIsSupported() throws Exception
public void testIndexOf() throws Exception
DateTimeZone PARIS=Optional[DateTimeZone.forID("Europe/Paris")]
DateTimeZone LONDON=Optional[DateTimeZone.forID("Europe/London")]
long y2002days=Optional[365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365]
long y2003days=Optional[365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365]
long TEST_TIME_NOW=Optional[(y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY]
long TEST_TIME1=Optional[(y2002days + 31L + 28L + 31L + 5L - 1L) * DateTimeConstants.MILLIS_PER_DAY + 12L * DateTimeConstants.MILLIS_PER_HOUR + 24L * DateTimeConstants.MILLIS_PER_MINUTE]
long TEST_TIME2=Optional[(y2003days + 31L + 28L + 31L + 30L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY + 14L * DateTimeConstants.MILLIS_PER_HOUR + 28L * DateTimeConstants.MILLIS_PER_MINUTE]
DateTimeZone originalDateTimeZone=Optional[null]
TimeZone originalTimeZone=Optional[null]
Locale originalLocale=Optional[null]
