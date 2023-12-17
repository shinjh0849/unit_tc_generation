public TestDateMidnight_Basics(String name)
public static void main(String[] args)
public static TestSuite suite()
protected void setUp() throws Exception
protected void tearDown() throws Exception
public void testTest()
public void testGet_DateTimeField()
public void testGet_DateTimeFieldType()
public void testGetters()
public void testWithers()
public void testEqualsHashCode()
public String toString()
public long getMillis()
public Chronology getChronology()
public void testCompareTo()
public void testIsEqual()
public void testIsBefore()
public void testIsAfter()
public void testSerialization() throws Exception
public void testToString()
public void testToString_String()
public void testToString_String_String()
public void testToString_DTFormatter()
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
public void testToCalendar_Locale()
public void testToGregorianCalendar()
public void testToYearMonthDay()
public void testToLocalDate()
public void testToInterval()
public void testWithMillis_long()
public void testWithChronology_Chronology()
public void testWithZoneRetainFields_DateTimeZone()
public void testWithFields_RPartial()
public void testWithField1()
public void testWithField2()
public void testWithFieldAdded1()
public void testWithFieldAdded2()
public void testWithFieldAdded3()
public void testWithFieldAdded4()
public void testWithDurationAdded_long_int()
public void testWithDurationAdded_RD_int()
public void testWithDurationAdded_RP_int()
public void testPlus_long()
public void testPlus_RD()
public void testPlus_RP()
public void testPlusYears_int()
public void testPlusMonths_int()
public void testPlusWeeks_int()
public void testPlusDays_int()
public void testMinus_long()
public void testMinus_RD()
public void testMinus_RP()
public void testMinusYears_int()
public void testMinusMonths_int()
public void testMinusWeeks_int()
public void testMinusDays_int()
public DurationFieldType getDurationType()
public DurationFieldType getRangeDurationType()
public DateTimeField getField(Chronology chronology)
public void testProperty()
private void check(DateMidnight test, int year, int month, int day)
DateTimeZone PARIS=Optional[DateTimeZone.forID("Europe/Paris")]
DateTimeZone LONDON=Optional[DateTimeZone.forID("Europe/London")]
DateTimeZone NEWYORK=Optional[DateTimeZone.forID("America/New_York")]
ISOChronology ISO_DEFAULT=Optional[ISOChronology.getInstance(LONDON)]
ISOChronology ISO_PARIS=Optional[ISOChronology.getInstance(PARIS)]
GJChronology GJ_DEFAULT=Optional[GJChronology.getInstance(LONDON)]
GregorianChronology GREGORIAN_DEFAULT=Optional[GregorianChronology.getInstance(LONDON)]
GregorianChronology GREGORIAN_PARIS=Optional[GregorianChronology.getInstance(PARIS)]
BuddhistChronology BUDDHIST_DEFAULT=Optional[BuddhistChronology.getInstance(LONDON)]
CopticChronology COPTIC_DEFAULT=Optional[CopticChronology.getInstance(LONDON)]
long y2002days=Optional[365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365]
long y2003days=Optional[365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365]
long TEST_TIME_NOW_UTC=Optional[(y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY]
long TEST_TIME_NOW_LONDON=Optional[TEST_TIME_NOW_UTC - DateTimeConstants.MILLIS_PER_HOUR]
long TEST_TIME1_UTC=Optional[(y2002days + 31L + 28L + 31L + 5L - 1L) * DateTimeConstants.MILLIS_PER_DAY + 12L * DateTimeConstants.MILLIS_PER_HOUR + 24L * DateTimeConstants.MILLIS_PER_MINUTE]
long TEST_TIME1_LONDON=Optional[(y2002days + 31L + 28L + 31L + 5L - 1L) * DateTimeConstants.MILLIS_PER_DAY - DateTimeConstants.MILLIS_PER_HOUR]
long TEST_TIME1_PARIS=Optional[(y2002days + 31L + 28L + 31L + 5L - 1L) * DateTimeConstants.MILLIS_PER_DAY - 2 * DateTimeConstants.MILLIS_PER_HOUR]
long TEST_TIME2_UTC=Optional[(y2003days + 31L + 28L + 31L + 30L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY + 14L * DateTimeConstants.MILLIS_PER_HOUR + 28L * DateTimeConstants.MILLIS_PER_MINUTE]
long TEST_TIME2_LONDON=Optional[(y2003days + 31L + 28L + 31L + 30L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY - DateTimeConstants.MILLIS_PER_HOUR]
long TEST_TIME2_PARIS=Optional[(y2003days + 31L + 28L + 31L + 30L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY - 2 * DateTimeConstants.MILLIS_PER_HOUR]
DateTimeZone originalDateTimeZone=Optional[null]
TimeZone originalTimeZone=Optional[null]
Locale originalLocale=Optional[null]
