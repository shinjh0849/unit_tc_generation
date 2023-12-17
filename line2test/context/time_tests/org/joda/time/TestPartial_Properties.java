public TestPartial_Properties(String name)
public static void main(String[] args)
public static TestSuite suite()
protected void setUp() throws Exception
protected void tearDown() throws Exception
public void testPropertyGetHour()
public void testPropertyGetMaxMinValuesHour()
public void testPropertyAddHour()
public void testPropertyAddWrapFieldHour()
public void testPropertySetHour()
public void testPropertySetTextHour()
public void testPropertyWithMaximumValueHour()
public void testPropertyWithMinimumValueHour()
public void testPropertyCompareToHour()
public void testPropertyGetMinute()
public void testPropertyGetMaxMinValuesMinute()
public void testPropertyAddMinute()
public void testPropertyAddWrapFieldMinute()
public void testPropertySetMinute()
public void testPropertySetTextMinute()
public void testPropertyCompareToMinute()
private void check(Partial test, int hour, int min, int sec, int milli)
DateTimeZone LONDON=Optional[DateTimeZone.forID("Europe/London")]
DateTimeZone PARIS=Optional[DateTimeZone.forID("Europe/Paris")]
DateTimeZone zone=Optional[null]
DateTimeFieldType[] TYPES=Optional[new DateTimeFieldType[] { DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(), DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond() }]
int[] VALUES=Optional[new int[] { 10, 20, 30, 40 }]
int[] VALUES1=Optional[new int[] { 1, 2, 3, 4 }]
int[] VALUES2=Optional[new int[] { 5, 6, 7, 8 }]
long TEST_TIME1=Optional[1L * DateTimeConstants.MILLIS_PER_HOUR + 2L * DateTimeConstants.MILLIS_PER_MINUTE + 3L * DateTimeConstants.MILLIS_PER_SECOND + 4L]
long TEST_TIME2=Optional[1L * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L]
