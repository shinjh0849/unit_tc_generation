public TestInterval_Basics(String name)
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
public void testEqualsHashCodeLenient()
public void testEqualsHashCodeStrict()
public void test_useCase_ContainsOverlapAbutGap()
public void test_useCase_ContainsOverlapAbutGap_zeroDuration()
public void test_useCase_ContainsOverlapAbutGap_bothZeroDuration()
public void testContains_long()
public void testContains_long_zeroDuration()
public void testContainsNow()
public void testContains_RI()
public void testContains_RI_null()
public void testContains_RI_zeroDuration()
public void testContains_RInterval()
public void testContains_RInterval_null()
public void testContains_RInterval_zeroDuration()
public void testOverlaps_RInterval()
public void testOverlaps_RInterval_null()
public void testOverlaps_RInterval_zeroDuration()
public void testOverlap_RInterval()
public void testOverlap_RInterval_null()
public void testOverlap_RInterval_zone()
public void testOverlap_RInterval_zoneUTC()
public void testGap_RInterval()
public void testGap_RInterval_null()
public void testGap_RInterval_zone()
public void testGap_RInterval_zoneUTC()
public void testAbuts_RInterval()
public void testAbuts_RInterval_null()
public void testIsEqual_RI()
public void testIsBefore_long()
public void testIsBeforeNow()
public void testIsBefore_RI()
public void testIsBefore_RI_null()
public void testIsBefore_RInterval()
public void testIsBefore_RInterval_null()
public void testIsAfter_long()
public void testIsAfterNow()
public void testIsAfter_RI()
public void testIsAfter_RI_null()
public void testIsAfter_RInterval()
public void testIsAfter_RInterval_null()
public void testToInterval1()
public void testToMutableInterval1()
public void testToPeriod()
public void testToPeriod_PeriodType1()
public void testToPeriod_PeriodType2()
public void testSerialization() throws Exception
public void testToString()
public void testToString_reparse()
public void testWithChronology1()
public void testWithChronology2()
public void testWithChronology3()
public void testWithStartMillis_long1()
public void testWithStartMillis_long2()
public void testWithStartMillis_long3()
public void testWithStartInstant_RI1()
public void testWithStartInstant_RI2()
public void testWithStartInstant_RI3()
public void testWithEndMillis_long1()
public void testWithEndMillis_long2()
public void testWithEndMillis_long3()
public void testWithEndInstant_RI1()
public void testWithEndInstant_RI2()
public void testWithEndInstant_RI3()
public void testWithDurationAfterStart1() throws Throwable
public void testWithDurationAfterStart2() throws Throwable
public void testWithDurationAfterStart3() throws Throwable
public void testWithDurationAfterStart4() throws Throwable
public void testWithDurationBeforeEnd1() throws Throwable
public void testWithDurationBeforeEnd2() throws Throwable
public void testWithDurationBeforeEnd3() throws Throwable
public void testWithDurationBeforeEnd4() throws Throwable
public void testWithPeriodAfterStart1() throws Throwable
public void testWithPeriodAfterStart2() throws Throwable
public void testWithPeriodAfterStart3() throws Throwable
public void testWithPeriodBeforeEnd1() throws Throwable
public void testWithPeriodBeforeEnd2() throws Throwable
public void testWithPeriodBeforeEnd3() throws Throwable
DateTimeZone MOSCOW=Optional[DateTimeZone.forID("Europe/Moscow")]
DateTimeZone PARIS=Optional[DateTimeZone.forID("Europe/Paris")]
DateTimeZone LONDON=Optional[DateTimeZone.forID("Europe/London")]
Chronology COPTIC_PARIS=Optional[CopticChronology.getInstance(PARIS)]
Interval interval37
Interval interval33
long y2002days=Optional[365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365]
long y2003days=Optional[365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365]
long TEST_TIME_NOW=Optional[(y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY]
long TEST_TIME1=Optional[(y2002days + 31L + 28L + 31L + 5L - 1L) * DateTimeConstants.MILLIS_PER_DAY + 12L * DateTimeConstants.MILLIS_PER_HOUR + 24L * DateTimeConstants.MILLIS_PER_MINUTE]
long TEST_TIME2=Optional[(y2003days + 31L + 28L + 31L + 30L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY + 14L * DateTimeConstants.MILLIS_PER_HOUR + 28L * DateTimeConstants.MILLIS_PER_MINUTE]
DateTimeZone originalDateTimeZone=Optional[null]
TimeZone originalTimeZone=Optional[null]
Locale originalLocale=Optional[null]
