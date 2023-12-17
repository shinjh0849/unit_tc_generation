public TestMutableInterval_Basics(String name)
public MockInterval()
public static void main(String[] args)
public static TestSuite suite()
protected void setUp() throws Exception
protected void tearDown() throws Exception
public void testTest()
public void testGetMillis()
public void testGetDuration1()
public void testGetDuration2()
public void testEqualsHashCode()
public Chronology getChronology()
public long getStartMillis()
public long getEndMillis()
public void testContains_long()
public void testContainsNow()
public void testContains_RI()
public void testContains_RInterval()
public void testOverlaps_RInterval()
public void testIsBefore_long()
public void testIsBeforeNow()
public void testIsBefore_RI()
public void testIsBefore_RInterval()
public void testIsAfter_long()
public void testIsAfterNow()
public void testIsAfter_RI()
public void testIsAfter_RInterval()
public void testToInterval1()
public void testToMutableInterval1()
public void testToPeriod()
public void testToPeriod_PeriodType1()
public void testToPeriod_PeriodType2()
public void testSerialization() throws Exception
public void testToString()
public void testCopy()
public void testClone()
DateTimeZone PARIS=Optional[DateTimeZone.forID("Europe/Paris")]
DateTimeZone LONDON=Optional[DateTimeZone.forID("Europe/London")]
Chronology COPTIC_PARIS=Optional[CopticChronology.getInstance(PARIS)]
long y2002days=Optional[365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365]
long y2003days=Optional[365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365]
long TEST_TIME_NOW=Optional[(y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY]
long TEST_TIME1=Optional[(y2002days + 31L + 28L + 31L + 5L - 1L) * DateTimeConstants.MILLIS_PER_DAY + 12L * DateTimeConstants.MILLIS_PER_HOUR + 24L * DateTimeConstants.MILLIS_PER_MINUTE]
long TEST_TIME2=Optional[(y2003days + 31L + 28L + 31L + 30L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY + 14L * DateTimeConstants.MILLIS_PER_HOUR + 28L * DateTimeConstants.MILLIS_PER_MINUTE]
DateTimeZone originalDateTimeZone=Optional[null]
TimeZone originalTimeZone=Optional[null]
Locale originalLocale=Optional[null]
