public TestMutableInterval_Constructors(String name)
public static void main(String[] args)
public static TestSuite suite()
protected void setUp() throws Exception
protected void tearDown() throws Exception
public void testTest()
public void testParse_noFormatter() throws Throwable
public void testConstructor() throws Throwable
public void testConstructor_long_long1() throws Throwable
public void testConstructor_long_long2() throws Throwable
public void testConstructor_long_long3() throws Throwable
public void testConstructor_long_long_Chronology1() throws Throwable
public void testConstructor_long_long_Chronology2() throws Throwable
public void testConstructor_RI_RI1() throws Throwable
public void testConstructor_RI_RI2() throws Throwable
public void testConstructor_RI_RI3() throws Throwable
public void testConstructor_RI_RI4() throws Throwable
public void testConstructor_RI_RI5() throws Throwable
public void testConstructor_RI_RI6() throws Throwable
public void testConstructor_RI_RI7() throws Throwable
public void testConstructor_RI_RI8() throws Throwable
public void testConstructor_RI_RI9() throws Throwable
public void testConstructor_RI_RP1() throws Throwable
public void testConstructor_RI_RP2() throws Throwable
public void testConstructor_RI_RP3() throws Throwable
public void testConstructor_RI_RP4() throws Throwable
public void testConstructor_RI_RP5() throws Throwable
public void testConstructor_RI_RP6() throws Throwable
public void testConstructor_RI_RP7() throws Throwable
public void testConstructor_RI_RP8() throws Throwable
public void testConstructor_RP_RI1() throws Throwable
public void testConstructor_RP_RI2() throws Throwable
public void testConstructor_RP_RI3() throws Throwable
public void testConstructor_RP_RI4() throws Throwable
public void testConstructor_RP_RI5() throws Throwable
public void testConstructor_RP_RI6() throws Throwable
public void testConstructor_RP_RI7() throws Throwable
public void testConstructor_RP_RI8() throws Throwable
public void testConstructor_RI_RD1() throws Throwable
public void testConstructor_RI_RD2() throws Throwable
public void testConstructor_RI_RD3() throws Throwable
public void testConstructor_RI_RD4() throws Throwable
public void testConstructor_RI_RD5() throws Throwable
public void testConstructor_RD_RI1() throws Throwable
public void testConstructor_RD_RI2() throws Throwable
public void testConstructor_RD_RI3() throws Throwable
public void testConstructor_RD_RI4() throws Throwable
public void testConstructor_RD_RI5() throws Throwable
public void testConstructor_Object1() throws Throwable
public void testConstructor_Object2() throws Throwable
public void testConstructor_Object3() throws Throwable
public void testConstructor_Object4() throws Throwable
public boolean isReadableInterval(Object object, Chronology chrono)
public void setInto(ReadWritableInterval interval, Object object, Chronology chrono)
public Class<?> getSupportedType()
public void testConstructor_Object5() throws Throwable
public boolean isReadableInterval(Object object, Chronology chrono)
public void setInto(ReadWritableInterval interval, Object object, Chronology chrono)
public Class<?> getSupportedType()
public void testConstructor_Object6() throws Throwable
public Chronology getChronology()
public long getStartMillis()
public DateTime getStart()
public long getEndMillis()
public DateTime getEnd()
public long toDurationMillis()
public Duration toDuration()
public boolean contains(long millisInstant)
public boolean containsNow()
public boolean contains(ReadableInstant instant)
public boolean contains(ReadableInterval interval)
public boolean overlaps(ReadableInterval interval)
public boolean isBefore(ReadableInstant instant)
public boolean isBefore(ReadableInterval interval)
public boolean isAfter(ReadableInstant instant)
public boolean isAfter(ReadableInterval interval)
public Interval toInterval()
public MutableInterval toMutableInterval()
public Period toPeriod()
public Period toPeriod(PeriodType type)
public void testConstructor_Object_Chronology1() throws Throwable
public void testConstructor_Object_Chronology2() throws Throwable
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
