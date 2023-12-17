public TestDuration_Constructors(String name)
public static void main(String[] args)
public static TestSuite suite()
protected void setUp() throws Exception
protected void tearDown() throws Exception
public void testZERO() throws Throwable
public void testParse_noFormatter() throws Throwable
public void testFactory_standardDays_long() throws Throwable
public void testFactory_standardHours_long() throws Throwable
public void testFactory_standardMinutes_long() throws Throwable
public void testFactory_standardSeconds_long() throws Throwable
public void testFactory_millis_long() throws Throwable
public void testConstructor_long1() throws Throwable
public void testConstructor_long_long1() throws Throwable
public void testConstructor_RI_RI1() throws Throwable
public void testConstructor_RI_RI2() throws Throwable
public void testConstructor_RI_RI3() throws Throwable
public void testConstructor_RI_RI4() throws Throwable
public void testConstructor_Object1() throws Throwable
public void testConstructor_Object2() throws Throwable
public void testConstructor_Object3() throws Throwable
public void testConstructor_Object4() throws Throwable
public void testConstructor_Object5() throws Throwable
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
