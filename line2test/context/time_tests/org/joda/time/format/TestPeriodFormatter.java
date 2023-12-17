public TestPeriodFormatter(String name)
public static void main(String[] args)
public static TestSuite suite()
protected void setUp() throws Exception
protected void tearDown() throws Exception
public void testPrint_simple()
public void testPrint_bufferMethods() throws Exception
public void testPrint_writerMethods() throws Exception
public void testWithGetLocaleMethods()
public void testWithGetParseTypeMethods()
public void testPrinterParserMethods()
public void testParsePeriod_simple()
public void testParsePeriod_parseType()
public void testParseMutablePeriod_simple()
public void testParseInto_simple()
DateTimeZone UTC=Optional[DateTimeZone.UTC]
DateTimeZone PARIS=Optional[DateTimeZone.forID("Europe/Paris")]
DateTimeZone LONDON=Optional[DateTimeZone.forID("Europe/London")]
DateTimeZone TOKYO=Optional[DateTimeZone.forID("Asia/Tokyo")]
DateTimeZone NEWYORK=Optional[DateTimeZone.forID("America/New_York")]
Chronology ISO_UTC=Optional[ISOChronology.getInstanceUTC()]
Chronology ISO_PARIS=Optional[ISOChronology.getInstance(PARIS)]
Chronology BUDDHIST_PARIS=Optional[BuddhistChronology.getInstance(PARIS)]
long y2002days=Optional[365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365]
long TEST_TIME_NOW=Optional[(y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY]
DateTimeZone originalDateTimeZone=Optional[null]
TimeZone originalTimeZone=Optional[null]
Locale originalLocale=Optional[null]
PeriodFormatter f=Optional[null]
