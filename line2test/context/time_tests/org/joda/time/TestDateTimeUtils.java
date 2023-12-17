public TestDateTimeUtils(String name)
public PermissionCollection getPermissions(CodeSource codesource)
public void refresh()
public boolean implies(ProtectionDomain domain, Permission permission)
public PermissionCollection getPermissions(CodeSource codesource)
public void refresh()
public static void main(String[] args)
public static TestSuite suite()
protected void setUp() throws Exception
protected void tearDown() throws Exception
public void testTest()
public void testClass()
public void testSystemMillis()
public void testSystemMillisSecurity()
public void testFixedMillis()
public void testFixedMillisSecurity()
public void testOffsetMillis()
public void testOffsetMillisToZero()
public void testOffsetMillisSecurity()
public long getMillis()
public void testMillisProvider()
public void testMillisProvider_null()
public long getMillis()
public void testMillisProviderSecurity()
public void testGetInstantMillis_RI()
public long getMillis()
public Chronology getChronology()
public void testGetInstantChronology_RI()
public Chronology getChronology()
public void testGetIntervalChronology_RInterval()
public void testGetIntervalChronology_RI_RI()
public void testGetReadableInterval_ReadableInterval()
public void testGetChronology_Chronology()
public void testGetZone_Zone()
public void testGetPeriodType_PeriodType()
public void testGetDurationMillis_RI()
public void testIsContiguous_RP()
public void testIsContiguous_RP_GJChronology()
public void test_julianDay()
GJChronology GJ=Optional[GJChronology.getInstance()]
boolean OLD_JDK
DateTimeZone PARIS=Optional[DateTimeZone.forID("Europe/Paris")]
long y2002days=Optional[365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365]
long y2003days=Optional[365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365]
long TEST_TIME_NOW=Optional[(y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY]
long TEST_TIME1=Optional[(y2002days + 31L + 28L + 31L + 5L - 1L) * DateTimeConstants.MILLIS_PER_DAY + 12L * DateTimeConstants.MILLIS_PER_HOUR + 24L * DateTimeConstants.MILLIS_PER_MINUTE]
long TEST_TIME2=Optional[(y2003days + 31L + 28L + 31L + 30L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY + 14L * DateTimeConstants.MILLIS_PER_HOUR + 28L * DateTimeConstants.MILLIS_PER_MINUTE]
Policy RESTRICT
Policy ALLOW
