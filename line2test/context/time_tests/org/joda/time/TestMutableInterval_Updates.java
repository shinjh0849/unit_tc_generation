public TestMutableInterval_Updates(String name)
public static void main(String[] args)
public static TestSuite suite()
protected void setUp() throws Exception
protected void tearDown() throws Exception
public void testTest()
public void testSetInterval_long_long1()
public void testSetInterval_long_long2()
public void testSetInterval_RI_RI1()
public void testSetInterval_RI_RI2()
public void testSetInterval_RI_RI3()
public void testSetInterval_RI_RI4()
public void testSetInterval_RI_RI5()
public void testSetInterval_RInterval1()
public void testSetInterval_RInterval2()
public Chronology getChronology()
public long getStartMillis()
public long getEndMillis()
public void testSetInterval_RInterval3()
public void testSetStartMillis_long1()
public void testSetStartMillis_long2()
public void testSetStart_RI1()
public void testSetStart_RI2()
public void testSetStart_RI3()
public void testSetEndMillis_long1()
public void testSetEndMillis_long2()
public void testSetEnd_RI1()
public void testSetEnd_RI2()
public void testSetEnd_RI3()
public void testSetDurationAfterStart_long1()
public void testSeDurationAfterStart_long2()
public void testSetDurationAfterStart_RI1()
public void testSeDurationAfterStart_RI2()
public void testSetDurationAfterStart_RI3()
public void testSetDurationBeforeEnd_long1()
public void testSeDurationBeforeEnd_long2()
public void testSetDurationBeforeEnd_RI1()
public void testSeDurationBeforeEnd_RI2()
public void testSetDurationBeforeEnd_RI3()
public void testSetPeriodAfterStart_RI1()
public void testSePeriodAfterStart_RI2()
public void testSetPeriodAfterStart_RI3()
public void testSetPeriodBeforeEnd_RI1()
public void testSePeriodBeforeEnd_RI2()
public void testSetPeriodBeforeEnd_RI3()
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
