public TestCopticChronology(String name)
public static void main(String[] args)
public static TestSuite suite()
protected void setUp() throws Exception
protected void tearDown() throws Exception
public void testFactoryUTC()
public void testFactory()
public void testFactory_Zone()
public void testEquality()
public void testWithUTC()
public void testWithZone()
public void testToString()
public void testDurationFields()
public void testDateFields()
public void testTimeFields()
public void testEpoch()
public void testEra()
public void testCalendar()
public void testSampleDate()
public void testSampleDateWithZone()
public void testDurationYear()
public void testDurationMonth()
int MILLIS_PER_DAY=Optional[DateTimeConstants.MILLIS_PER_DAY]
long SKIP=Optional[1 * MILLIS_PER_DAY]
DateTimeZone PARIS=Optional[DateTimeZone.forID("Europe/Paris")]
DateTimeZone LONDON=Optional[DateTimeZone.forID("Europe/London")]
DateTimeZone TOKYO=Optional[DateTimeZone.forID("Asia/Tokyo")]
Chronology COPTIC_UTC=Optional[CopticChronology.getInstanceUTC()]
Chronology JULIAN_UTC=Optional[JulianChronology.getInstanceUTC()]
Chronology ISO_UTC=Optional[ISOChronology.getInstanceUTC()]
long y2002days=Optional[365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365]
long TEST_TIME_NOW=Optional[(y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * MILLIS_PER_DAY]
DateTimeZone originalDateTimeZone=Optional[null]
TimeZone originalTimeZone=Optional[null]
Locale originalLocale=Optional[null]
