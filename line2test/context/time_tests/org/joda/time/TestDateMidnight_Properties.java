public TestDateMidnight_Properties(String name)
public static void main(String[] args)
public static TestSuite suite()
protected void setUp() throws Exception
protected void tearDown() throws Exception
public void testTest()
public void testPropertyGetEra()
public void testPropertyGetYearOfEra()
public void testPropertyGetCenturyOfEra()
public void testPropertyGetYearOfCentury()
public void testPropertyGetWeekyear()
public void testPropertyGetYear()
public void testPropertyGetMonthOfYear()
public void testPropertySetMonthOfYear()
public void testPropertySetTextMonthOfYear()
public void testPropertySetTextLocaleMonthOfYear()
public void testPropertyAddMonthOfYear()
public void testPropertyAddLongMonthOfYear()
public void testPropertyAddWrapFieldMonthOfYear()
public void testPropertyGetDifferenceMonthOfYear()
public void testPropertyRoundFloorMonthOfYear()
public void testPropertyRoundCeilingMonthOfYear()
public void testPropertyRoundHalfFloorMonthOfYear()
public void testPropertyRoundHalfCeilingMonthOfYear()
public void testPropertyRoundHalfEvenMonthOfYear()
public void testPropertyRemainderMonthOfYear()
public void testPropertyGetDayOfMonth()
public void testPropertyWithMaximumValueDayOfMonth()
public void testPropertyWithMinimumValueDayOfMonth()
public void testPropertyGetDayOfYear()
public void testPropertyGetWeekOfWeekyear()
public void testPropertyGetDayOfWeek()
public void testPropertyToIntervalYearOfEra()
public void testPropertyToIntervalYearOfCentury()
public void testPropertyToIntervalYear()
public void testPropertyToIntervalMonthOfYear()
public void testPropertyToIntervalDayOfMonth()
public void testPropertyEqualsHashCodeLenient()
public void testPropertyEqualsHashCodeStrict()
DateTimeZone PARIS=Optional[DateTimeZone.forID("Europe/Paris")]
Chronology COPTIC_PARIS=Optional[CopticChronology.getInstance(PARIS)]
DateTimeZone LONDON=Optional[DateTimeZone.forID("Europe/London")]
long y2002days=Optional[365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365]
long y2003days=Optional[365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365]
long TEST_TIME_NOW=Optional[(y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY]
long TEST_TIME1=Optional[(y2002days + 31L + 28L + 31L + 5L - 1L) * DateTimeConstants.MILLIS_PER_DAY + 12L * DateTimeConstants.MILLIS_PER_HOUR + 24L * DateTimeConstants.MILLIS_PER_MINUTE]
long TEST_TIME2=Optional[(y2003days + 31L + 28L + 31L + 30L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY + 14L * DateTimeConstants.MILLIS_PER_HOUR + 28L * DateTimeConstants.MILLIS_PER_MINUTE]
DateTimeZone zone=Optional[null]
Locale locale=Optional[null]
