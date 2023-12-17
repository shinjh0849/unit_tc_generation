public TestYearMonth_Properties(String name)
public static void main(String[] args)
public static TestSuite suite()
protected void setUp() throws Exception
protected void tearDown() throws Exception
public void testPropertyGetYear()
public void testPropertyGetMaxMinValuesYear()
public void testPropertyAddYear()
public void testPropertyAddWrapFieldYear()
public void testPropertySetYear()
public void testPropertySetTextYear()
public void testPropertyCompareToYear()
public void testPropertyGetMonth()
public void testPropertyGetMaxMinValuesMonth()
public void testPropertyAddMonth()
public void testPropertyAddWrapFieldMonth()
public void testPropertySetMonth()
public void testPropertySetTextMonth()
public void testPropertyCompareToMonth()
public void testPropertyEquals()
public void testPropertyHashCode()
public void testPropertyEqualsHashCodeLenient()
public void testPropertyEqualsHashCodeStrict()
private void check(YearMonth test, int year, int month)
DateTimeZone PARIS=Optional[DateTimeZone.forID("Europe/Paris")]
Chronology COPTIC_PARIS=Optional[CopticChronology.getInstance(PARIS)]
long TEST_TIME_NOW=Optional[(31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY]
long TEST_TIME1=Optional[(31L + 28L + 31L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY + 12L * DateTimeConstants.MILLIS_PER_HOUR + 24L * DateTimeConstants.MILLIS_PER_MINUTE]
long TEST_TIME2=Optional[(365L + 31L + 28L + 31L + 30L + 7L - 1L) * DateTimeConstants.MILLIS_PER_DAY + 14L * DateTimeConstants.MILLIS_PER_HOUR + 28L * DateTimeConstants.MILLIS_PER_MINUTE]
DateTimeZone zone=Optional[null]
Locale systemDefaultLocale=Optional[null]
