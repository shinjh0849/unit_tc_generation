public TestDateMidnight_Constructors(String name)
public static void main(String[] args)
public static TestSuite suite()
protected void setUp() throws Exception
protected void tearDown() throws Exception
public void testTest()
public void test_now() throws Throwable
public void test_now_DateTimeZone() throws Throwable
public void test_now_nullDateTimeZone() throws Throwable
public void test_now_Chronology() throws Throwable
public void test_now_nullChronology() throws Throwable
public void testParse_noFormatter() throws Throwable
public void testParse_formatter() throws Throwable
public void testConstructor() throws Throwable
public void testConstructor_DateTimeZone() throws Throwable
public void testConstructor_nullDateTimeZone() throws Throwable
public void testConstructor_Chronology() throws Throwable
public void testConstructor_nullChronology() throws Throwable
public void testConstructor_long1() throws Throwable
public void testConstructor_long2() throws Throwable
public void testConstructor_long1_DateTimeZone() throws Throwable
public void testConstructor_long2_DateTimeZone() throws Throwable
public void testConstructor_long_nullDateTimeZone() throws Throwable
public void testConstructor_long1_Chronology() throws Throwable
public void testConstructor_long2_Chronology() throws Throwable
public void testConstructor_long_nullChronology() throws Throwable
public void testConstructor_Object() throws Throwable
public void testConstructor_invalidObject() throws Throwable
public void testConstructor_nullObject() throws Throwable
public void testConstructor_badconverterObject() throws Throwable
public void testConstructor_Object_DateTimeZone() throws Throwable
public void testConstructor_invalidObject_DateTimeZone() throws Throwable
public void testConstructor_nullObject_DateTimeZone() throws Throwable
public void testConstructor_Object_nullDateTimeZone() throws Throwable
public void testConstructor_nullObject_nullDateTimeZone() throws Throwable
public void testConstructor_badconverterObject_DateTimeZone() throws Throwable
public void testConstructor_Object_Chronology() throws Throwable
public void testConstructor_invalidObject_Chronology() throws Throwable
public void testConstructor_nullObject_Chronology() throws Throwable
public void testConstructor_Object_nullChronology() throws Throwable
public void testConstructor_nullObject_nullChronology() throws Throwable
public void testConstructor_badconverterObject_Chronology() throws Throwable
public void testConstructor_int_int_int() throws Throwable
public void testConstructor_int_int_int_DateTimeZone() throws Throwable
public void testConstructor_int_int_int_nullDateTimeZone() throws Throwable
public void testConstructor_int_int_int_Chronology() throws Throwable
public void testConstructor_int_int_int_nullChronology() throws Throwable
DateTimeZone PARIS=Optional[DateTimeZone.forID("Europe/Paris")]
DateTimeZone LONDON=Optional[DateTimeZone.forID("Europe/London")]
long y2002days=Optional[365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365]
long y2003days=Optional[365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365]
long TEST_TIME_NOW_UTC=Optional[(y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY]
long TEST_TIME_NOW_LONDON=Optional[TEST_TIME_NOW_UTC - DateTimeConstants.MILLIS_PER_HOUR]
long TEST_TIME_NOW_PARIS=Optional[TEST_TIME_NOW_UTC - 2 * DateTimeConstants.MILLIS_PER_HOUR]
long TEST_TIME1_UTC=Optional[(y2002days + 31L + 28L + 31L + 5L - 1L) * DateTimeConstants.MILLIS_PER_DAY + 12L * DateTimeConstants.MILLIS_PER_HOUR + 24L * DateTimeConstants.MILLIS_PER_MINUTE]
long TEST_TIME1_LONDON=Optional[(y2002days + 31L + 28L + 31L + 5L - 1L) * DateTimeConstants.MILLIS_PER_DAY - DateTimeConstants.MILLIS_PER_HOUR]
long TEST_TIME1_PARIS=Optional[(y2002days + 31L + 28L + 31L + 5L - 1L) * DateTimeConstants.MILLIS_PER_DAY - 2 * DateTimeConstants.MILLIS_PER_HOUR]
long TEST_TIME2_UTC=Optional[(y2003days + 31L + 28L + 31L + 30L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY + 14L * DateTimeConstants.MILLIS_PER_HOUR + 28L * DateTimeConstants.MILLIS_PER_MINUTE]
long TEST_TIME2_LONDON=Optional[(y2003days + 31L + 28L + 31L + 30L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY - DateTimeConstants.MILLIS_PER_HOUR]
long TEST_TIME2_PARIS=Optional[(y2003days + 31L + 28L + 31L + 30L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY - 2 * DateTimeConstants.MILLIS_PER_HOUR]
DateTimeZone zone=Optional[null]
Locale locale=Optional[null]
