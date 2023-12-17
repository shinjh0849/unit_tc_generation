public TestLocalTime_Constructors(String name)
public static void main(String[] args)
public static TestSuite suite()
protected void setUp() throws Exception
protected void tearDown() throws Exception
public void testConstantMidnight() throws Throwable
public void testParse_noFormatter() throws Throwable
public void testParse_formatter() throws Throwable
public void testFactory_FromCalendarFields_Calendar() throws Exception
public void testFactory_FromDateFields_after1970() throws Exception
public void testFactory_FromDateFields_before1970() throws Exception
public void testFactory_FromDateFields_null() throws Exception
public void testFactoryMillisOfDay_long() throws Throwable
public void testFactoryMillisOfDay_long_Chronology() throws Throwable
public void testFactoryMillisOfDay_long_nullChronology() throws Throwable
public void testConstructor() throws Throwable
public void testConstructor_DateTimeZone() throws Throwable
public void testConstructor_nullDateTimeZone() throws Throwable
public void testConstructor_Chronology() throws Throwable
public void testConstructor_nullChronology() throws Throwable
public void testConstructor_long1() throws Throwable
public void testConstructor_long2() throws Throwable
public void testConstructor_long_DateTimeZone() throws Throwable
public void testConstructor_long_DateTimeZone_2() throws Throwable
public void testConstructor_long_nullDateTimeZone() throws Throwable
public void testConstructor_long1_Chronology() throws Throwable
public void testConstructor_long2_Chronology() throws Throwable
public void testConstructor_long_nullChronology() throws Throwable
public void testConstructor_Object1() throws Throwable
public void testConstructor_Object2() throws Throwable
public void testConstructor_nullObject() throws Throwable
public void testConstructor_ObjectString1() throws Throwable
public void testConstructor_ObjectString1Tokyo() throws Throwable
public void testConstructor_ObjectString1NewYork() throws Throwable
public void testConstructor_ObjectString2() throws Throwable
public void testConstructor_ObjectString3() throws Throwable
public void testConstructor_ObjectString4() throws Throwable
public void testConstructor_ObjectStringEx1() throws Throwable
public void testConstructor_ObjectStringEx2() throws Throwable
public void testConstructor_ObjectStringEx3() throws Throwable
public void testConstructor_ObjectStringEx4() throws Throwable
public void testConstructor_ObjectStringEx5() throws Throwable
public void testConstructor_ObjectStringEx6() throws Throwable
public void testConstructor_ObjectLocalTime() throws Throwable
public void testConstructor_ObjectLocalDate() throws Throwable
public void testConstructor_ObjectLocalDateTime() throws Throwable
public void testConstructor_ObjectTimeOfDay() throws Throwable
public void testConstructor_Object1_DateTimeZone() throws Throwable
public void testConstructor_ObjectString_DateTimeZoneLondon() throws Throwable
public void testConstructor_ObjectString_DateTimeZoneTokyo() throws Throwable
public void testConstructor_ObjectString_DateTimeZoneNewYork() throws Throwable
public void testConstructor_nullObject_DateTimeZone() throws Throwable
public void testConstructor_Object_nullDateTimeZone() throws Throwable
public void testConstructor_nullObject_nullDateTimeZone() throws Throwable
public void testConstructor_Object1_Chronology() throws Throwable
public void testConstructor_Object2_Chronology() throws Throwable
public void testConstructor_nullObject_Chronology() throws Throwable
public void testConstructor_Object_nullChronology() throws Throwable
public void testConstructor_nullObject_nullChronology() throws Throwable
public void testConstructor_int_int() throws Throwable
public void testConstructor_int_int_int() throws Throwable
public void testConstructor_int_int_int_int() throws Throwable
public void testConstructor_int_int_int_int_Chronology() throws Throwable
public void testConstructor_int_int_int_int_nullChronology() throws Throwable
DateTimeZone LONDON=Optional[DateTimeZone.forID("Europe/London")]
DateTimeZone PARIS=Optional[DateTimeZone.forID("Europe/Paris")]
DateTimeZone TOKYO=Optional[DateTimeZone.forID("Asia/Tokyo")]
DateTimeZone NEW_YORK=Optional[DateTimeZone.forID("America/New_York")]
ISOChronology ISO_UTC=Optional[ISOChronology.getInstanceUTC()]
JulianChronology JULIAN_LONDON=Optional[JulianChronology.getInstance(LONDON)]
JulianChronology JULIAN_PARIS=Optional[JulianChronology.getInstance(PARIS)]
JulianChronology JULIAN_UTC=Optional[JulianChronology.getInstanceUTC()]
Chronology BUDDHIST_UTC=Optional[BuddhistChronology.getInstanceUTC()]
int OFFSET_LONDON=Optional[LONDON.getOffset(0L) / DateTimeConstants.MILLIS_PER_HOUR]
int OFFSET_PARIS=Optional[PARIS.getOffset(0L) / DateTimeConstants.MILLIS_PER_HOUR]
long TEST_TIME_NOW=Optional[10L * DateTimeConstants.MILLIS_PER_HOUR + 20L * DateTimeConstants.MILLIS_PER_MINUTE + 30L * DateTimeConstants.MILLIS_PER_SECOND + 40L]
long TEST_TIME1=Optional[1L * DateTimeConstants.MILLIS_PER_HOUR + 2L * DateTimeConstants.MILLIS_PER_MINUTE + 3L * DateTimeConstants.MILLIS_PER_SECOND + 4L]
long TEST_TIME2=Optional[1L * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L]
DateTimeZone zone=Optional[null]
