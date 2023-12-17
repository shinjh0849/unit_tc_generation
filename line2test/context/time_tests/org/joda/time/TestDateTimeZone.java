public TestDateTimeZone(String name)
public MockDateTimeZone(String id)
public PermissionCollection getPermissions(CodeSource codesource)
public void refresh()
public boolean implies(ProtectionDomain domain, Permission permission)
public PermissionCollection getPermissions(CodeSource codesource)
public void refresh()
public static void main(String[] args)
public static TestSuite suite()
protected void setUp() throws Exception
protected void tearDown() throws Exception
public void testDefault()
public void testDefaultSecurity()
public void testForID_String()
public void testForID_String_old()
public void testForOffsetHours_int()
public void testForOffsetHoursMinutes_int_int()
public void testForOffsetMillis_int()
public void testForTimeZone_TimeZone()
public void testTimeZoneConversion()
public void testGetAvailableIDs()
public void testProvider()
public void testProvider_badClassName()
public void testProviderSecurity()
public Set getAvailableIDs()
public DateTimeZone getZone(String id)
public Set getAvailableIDs()
public DateTimeZone getZone(String id)
public Set getAvailableIDs()
public DateTimeZone getZone(String id)
public Set getAvailableIDs()
public DateTimeZone getZone(String id)
public Set getAvailableIDs()
public DateTimeZone getZone(String id)
public void testNameProvider()
public void testNameProvider_badClassName()
public void testNameProviderSecurity()
public String getShortName(Locale locale, String id, String nameKey)
public String getName(Locale locale, String id, String nameKey)
public String getNameKey(long instant)
public int getOffset(long instant)
public int getStandardOffset(long instant)
public boolean isFixed()
public long nextTransition(long instant)
public long previousTransition(long instant)
public boolean equals(Object object)
public void testConstructor()
public void testGetID()
public void testGetNameKey()
public void testGetShortName()
public void testGetShortName_berlin()
public void testGetShortNameProviderName()
public void testGetShortNameNullKey()
public void testGetName()
public void testGetName_berlin()
public void testGetNameProviderName()
public void testGetNameNullKey()
public String getNameKey(long instant)
public int getOffset(long instant)
public int getStandardOffset(long instant)
public boolean isFixed()
public long nextTransition(long instant)
public long previousTransition(long instant)
public boolean equals(Object object)
public void testGetOffset_long()
public void testGetOffset_RI()
public void testGetOffsetFixed()
public void testGetOffsetFixed_RI()
public void testGetMillisKeepLocal()
public void testIsFixed()
public void testTransitionFixed()
public void testIsLocalDateTimeGap_Berlin()
public void testIsLocalDateTimeGap_NewYork()
public void testToTimeZone()
public void testEqualsHashCode()
public void testToString()
public void testSerialization1() throws Exception
public void testSerialization2() throws Exception
public void testCommentParse() throws Exception
public void testPatchedNameKeysLondon() throws Exception
public void testPatchedNameKeysSydney() throws Exception
public void testPatchedNameKeysSydneyHistoric() throws Exception
public void testPatchedNameKeysGazaHistoric() throws Exception
boolean OLD_JDK
DateTimeZone PARIS=Optional[DateTimeZone.forID("Europe/Paris")]
DateTimeZone LONDON=Optional[DateTimeZone.forID("Europe/London")]
long y2002days=Optional[365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365]
long y2003days=Optional[365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365]
long TEST_TIME_SUMMER=Optional[(y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY]
long TEST_TIME_WINTER=Optional[(y2002days + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY]
Policy RESTRICT
Policy ALLOW
DateTimeZone zone
Locale locale
boolean JDK6
