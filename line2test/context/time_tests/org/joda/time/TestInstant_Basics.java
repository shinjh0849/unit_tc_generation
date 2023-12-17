public TestInstant_Basics(String name)
public static void main(String[] args)
public static TestSuite suite()
protected void setUp() throws Exception
protected void tearDown() throws Exception
public void testTest()
public void testGet_DateTimeFieldType()
public void testGet_DateTimeField()
public void testGetMethods()
public void testEqualsHashCode()
public String toString()
public long getMillis()
public Chronology getChronology()
public void testCompareTo()
public void testIsEqual_long()
public void testIsEqualNow()
public void testIsEqual_RI()
public void testIsBefore_long()
public void testIsBeforeNow()
public void testIsBefore_RI()
public void testIsAfter_long()
public void testIsAfterNow()
public void testIsAfter_RI()
public void testSerialization() throws Exception
public void testToString()
public void testToInstant()
public void testToDateTime()
public void testToDateTimeISO()
public void testToDateTime_DateTimeZone()
public void testToDateTime_Chronology()
public void testToMutableDateTime()
public void testToMutableDateTimeISO()
public void testToMutableDateTime_DateTimeZone()
public void testToMutableDateTime_Chronology()
public void testToDate()
public void testWithMillis_long()
public void testWithDurationAdded_long_int()
public void testWithDurationAdded_RD_int()
public void testPlus_long()
public void testPlus_RD()
public void testMinus_long()
public void testMinus_RD()
public void testImmutable()
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
