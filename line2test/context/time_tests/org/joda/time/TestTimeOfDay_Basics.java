public TestTimeOfDay_Basics(String name)
public static void main(String[] args)
public static TestSuite suite()
protected void setUp() throws Exception
protected void tearDown() throws Exception
public void testGet()
public void testSize()
public void testGetFieldType()
public void testGetFieldTypes()
public void testGetField()
public void testGetFields()
public void testGetValue()
public void testGetValues()
public void testIsSupported()
public void testEqualsHashCode()
public Chronology getChronology()
public DateTimeField[] getFields()
public int[] getValues()
public void testCompareTo()
public void testIsEqual_TOD()
public void testIsBefore_TOD()
public void testIsAfter_TOD()
public void testWithChronologyRetainFields_Chrono()
public void testWithChronologyRetainFields_sameChrono()
public void testWithChronologyRetainFields_nullChrono()
public void testWithField1()
public void testWithField2()
public void testWithField3()
public void testWithField4()
public void testWithFieldAdded1()
public void testWithFieldAdded2()
public void testWithFieldAdded3()
public void testWithFieldAdded4()
public void testWithFieldAdded5()
public void testWithFieldAdded6()
public void testWithFieldAdded7()
public void testWithFieldAdded8()
public void testPlus_RP()
public void testPlusHours_int()
public void testPlusMinutes_int()
public void testPlusSeconds_int()
public void testPlusMillis_int()
public void testMinus_RP()
public void testMinusHours_int()
public void testMinusMinutes_int()
public void testMinusSeconds_int()
public void testMinusMillis_int()
public void testToLocalTime()
public void testToDateTimeToday()
public void testToDateTimeToday_Zone()
public void testToDateTimeToday_nullZone()
public void testToDateTime_RI()
public void testToDateTime_nullRI()
public void testWithers()
public void testProperty()
public void testSerialization() throws Exception
public void testToString()
public void testToString_String()
public void testToString_String_Locale()
public void testToString_DTFormatter()
private void check(TimeOfDay test, int hour, int min, int sec, int milli)
DateTimeZone PARIS=Optional[DateTimeZone.forID("Europe/Paris")]
DateTimeZone LONDON=Optional[DateTimeZone.forID("Europe/London")]
DateTimeZone TOKYO=Optional[DateTimeZone.forID("Asia/Tokyo")]
int OFFSET=Optional[1]
Chronology COPTIC_PARIS=Optional[CopticChronology.getInstance(PARIS)]
Chronology COPTIC_LONDON=Optional[CopticChronology.getInstance(LONDON)]
Chronology COPTIC_TOKYO=Optional[CopticChronology.getInstance(TOKYO)]
Chronology COPTIC_UTC=Optional[CopticChronology.getInstanceUTC()]
Chronology ISO_UTC=Optional[ISOChronology.getInstanceUTC()]
Chronology BUDDHIST_TOKYO=Optional[BuddhistChronology.getInstance(TOKYO)]
Chronology BUDDHIST_UTC=Optional[BuddhistChronology.getInstanceUTC()]
long TEST_TIME_NOW=Optional[10L * DateTimeConstants.MILLIS_PER_HOUR + 20L * DateTimeConstants.MILLIS_PER_MINUTE + 30L * DateTimeConstants.MILLIS_PER_SECOND + 40L]
long TEST_TIME2=Optional[1L * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L]
DateTimeZone zone=Optional[null]
