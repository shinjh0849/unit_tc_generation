public TestMutableDateTime_Basics(String name)
public static void main(String[] args)
public static TestSuite suite()
protected void setUp() throws Exception
protected void tearDown() throws Exception
public void testTest()
public void testGet_DateTimeField()
public void testGet_DateTimeFieldType()
public void testGetMethods()
public void testEqualsHashCode()
public String toString()
public long getMillis()
public Chronology getChronology()
public boolean equals(Object obj)
public DateTimeZone getZone()
public Chronology withUTC()
public Chronology withZone(DateTimeZone zone)
public String toString()
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
public void testClone()
public void testCopy()
public void testRounding1()
public void testRounding2()
public void testRounding3()
public void testRounding4()
public void testRounding5()
public void testRounding6()
public void testRounding7()
public void testRounding8()
public DurationFieldType getDurationType()
public DurationFieldType getRangeDurationType()
public DateTimeField getField(Chronology chronology)
public void testProperty()
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
