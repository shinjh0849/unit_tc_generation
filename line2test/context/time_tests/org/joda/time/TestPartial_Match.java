public TestPartial_Match(String name)
public static void main(String[] args)
public static TestSuite suite()
protected void setUp() throws Exception
protected void tearDown() throws Exception
public void testIsMatch_Instant()
public void testIsMatch_Partial()
private Partial createYMDwPartial(Chronology chrono, int year, int month, int dow)
DateTimeZone PARIS=Optional[DateTimeZone.forID("Europe/Paris")]
DateTimeZone LONDON=Optional[DateTimeZone.forID("Europe/London")]
DateTimeZone TOKYO=Optional[DateTimeZone.forID("Asia/Tokyo")]
int OFFSET=Optional[1]
Chronology COPTIC_PARIS=Optional[CopticChronology.getInstance(PARIS)]
Chronology COPTIC_LONDON=Optional[CopticChronology.getInstance(LONDON)]
Chronology COPTIC_TOKYO=Optional[CopticChronology.getInstance(TOKYO)]
Chronology COPTIC_UTC=Optional[CopticChronology.getInstanceUTC()]
Chronology ISO_PARIS=Optional[ISOChronology.getInstance(PARIS)]
Chronology ISO_LONDON=Optional[ISOChronology.getInstance(LONDON)]
Chronology ISO_TOKYO=Optional[ISOChronology.getInstance(TOKYO)]
Chronology ISO_UTC=Optional[ISOChronology.getInstanceUTC()]
Chronology BUDDHIST_PARIS=Optional[BuddhistChronology.getInstance(PARIS)]
Chronology BUDDHIST_LONDON=Optional[BuddhistChronology.getInstance(LONDON)]
Chronology BUDDHIST_TOKYO=Optional[BuddhistChronology.getInstance(TOKYO)]
Chronology BUDDHIST_UTC=Optional[BuddhistChronology.getInstanceUTC()]
long TEST_TIME_NOW=Optional[10L * DateTimeConstants.MILLIS_PER_HOUR + 20L * DateTimeConstants.MILLIS_PER_MINUTE + 30L * DateTimeConstants.MILLIS_PER_SECOND + 40L]
long TEST_TIME1=Optional[1L * DateTimeConstants.MILLIS_PER_HOUR + 2L * DateTimeConstants.MILLIS_PER_MINUTE + 3L * DateTimeConstants.MILLIS_PER_SECOND + 4L]
long TEST_TIME2=Optional[1L * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L]
DateTimeZone zone=Optional[null]
