public TestSerialization(String name)
public static void main(String[] args)
public static TestSuite suite()
protected void setUp() throws Exception
protected void tearDown() throws Exception
public void testTest()
public void testSerializedInstant() throws Exception
public void testSerializedDateTime() throws Exception
public void testSerializedDateTimeProperty() throws Exception
public void testSerializedMutableDateTime() throws Exception
public void testSerializedMutableDateTimeProperty() throws Exception
public void testSerializedDateMidnight() throws Exception
public void testSerializedDateMidnightProperty() throws Exception
public void testSerializedLocalDate() throws Exception
public void testSerializedLocalDateBuddhist() throws Exception
public void testSerializedLocalTime() throws Exception
public void testSerializedLocalDateTime() throws Exception
public void testSerializedYearMonthDay() throws Exception
public void testSerializedTimeOfDay() throws Exception
public void testSerializedDateTimeZoneUTC() throws Exception
public void testSerializedDateTimeZone() throws Exception
public void testDuration() throws Exception
public void testSerializedCopticChronology() throws Exception
public void testSerializedISOChronology() throws Exception
public void testSerializedGJChronology() throws Exception
public void testSerializedGJChronologyChangedInternals() throws Exception
public void testSerializedGregorianChronology() throws Exception
public void testSerializedJulianChronology() throws Exception
public void testSerializedBuddhistChronology() throws Exception
public void testSerializedPeriodType() throws Exception
public void testSerializedDateTimeFieldType() throws Exception
public void testSerializedUnsupportedDateTimeField() throws Exception
private void loadAndCompare(Serializable test, String filename, boolean same) throws Exception
public void inlineCompare(Serializable test, boolean same) throws Exception
DateTimeZone PARIS=Optional[DateTimeZone.forID("Europe/Paris")]
DateTimeZone LONDON=Optional[DateTimeZone.forID("Europe/London")]
DateTimeZone TOKYO=Optional[DateTimeZone.forID("Asia/Tokyo")]
long y2002days=Optional[365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365]
long y2003days=Optional[365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365]
long TEST_TIME_NOW=Optional[(y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY]
long TEST_TIME1=Optional[(y2002days + 31L + 28L + 31L + 5L - 1L) * DateTimeConstants.MILLIS_PER_DAY + 12L * DateTimeConstants.MILLIS_PER_HOUR + 24L * DateTimeConstants.MILLIS_PER_MINUTE]
long TEST_TIME2=Optional[(y2003days + 31L + 28L + 31L + 30L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY + 14L * DateTimeConstants.MILLIS_PER_HOUR + 28L * DateTimeConstants.MILLIS_PER_MINUTE]
DateTimeZone originalDateTimeZone=Optional[null]
TimeZone originalTimeZone=Optional[null]
Locale originalLocale=Optional[null]
