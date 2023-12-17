public SegmentedTimelineTests(String name)
public static Test suite()
protected void setUp() throws Exception
protected void tearDown() throws Exception
public void testMsSegmentedTimeline()
public void testMs2SegmentedTimeline()
public void testMondayThroughFridaySegmentedTimeline()
public void testFifteenMinSegmentedTimeline()
public void testMsSegment()
public void testMs2Segment()
public void testMondayThroughFridaySegment()
public void testFifteenMinSegment()
public void verifyOneSegment(SegmentedTimeline timeline)
public void testMsInc()
public void testMs2Inc()
public void testMondayThroughFridayInc()
public void testFifteenMinInc()
public void verifyInc(SegmentedTimeline timeline)
public void testMsIncludedAndExcludedSegments()
public void testMs2IncludedAndExcludedSegments()
public void testMondayThroughFridayIncludedAndExcludedSegments()
public void testFifteenMinIncludedAndExcludedSegments()
public void verifyIncludedAndExcludedSegments(SegmentedTimeline timeline, long n)
public void testMsExceptionSegments() throws ParseException
public void testMs2BaseTimelineExceptionSegments() throws ParseException
public void testMondayThoughFridayExceptionSegments() throws ParseException
public void testFifteenMinExceptionSegments() throws ParseException
public void verifyExceptionSegments(SegmentedTimeline timeline, String[] exceptionString, Format fmt) throws ParseException
public void testMsTranslations() throws ParseException
public void testMs2BaseTimelineTranslations() throws ParseException
public void testMs2Translations() throws ParseException
public void textMondayThroughFridayTranslations() throws ParseException
public void testFifteenMinTranslations() throws ParseException
public void verifyTranslations(SegmentedTimeline timeline, long startTest)
public void testSerialization()
private void verifySerialization(SegmentedTimeline a1)
private long[] verifyFillInExceptions(SegmentedTimeline timeline, String[] exceptionString, Format fmt) throws ParseException
private void fillInBaseTimelineExceptions(SegmentedTimeline timeline, String[] exceptionString, Format fmt) throws ParseException
private void fillInBaseTimelineExclusionsAsExceptions(SegmentedTimeline timeline, long from, long to)
public void testCloning()
public void testEquals()
public void testHashCode()
public void testSerialization2()
public void testBasicSegmentedTimeline()
public void testSegmentedTimelineWithException1()
public static void main(String[] args) throws Exception
int TEST_CYCLE_START=Optional[0]
int TEST_CYCLE_END=Optional[1000]
int TEST_CYCLE_INC=Optional[55]
long FIVE_YEARS=Optional[5 * 365 * SegmentedTimeline.DAY_SEGMENT_SIZE]
NumberFormat NUMBER_FORMAT=Optional[NumberFormat.getNumberInstance()]
SimpleDateFormat DATE_FORMAT
SimpleDateFormat DATE_TIME_FORMAT
String[] MS_EXCEPTIONS=Optional[{ "0", "2", "4", "10", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "47", "58", "100", "101" }]
String[] MS2_BASE_TIMELINE_EXCEPTIONS=Optional[{ "0", "8", "16", "24", "32", "40", "48", "56", "64", "72", "80", "88", "96", "104", "112", "120", "128", "136" }]
String[] US_HOLIDAYS=Optional[{ "2000-01-17", "2000-02-21", "2000-04-21", "2000-05-29", "2000-07-04", "2000-09-04", "2000-11-23", "2000-12-25", "2001-01-01", "2001-01-15", "2001-02-19", "2001-04-13", "2001-05-28", "2001-07-04", "2001-09-03", "2001-09-11", "2001-09-12", "2001-09-13", "2001-09-14", "2001-11-22", "2001-12-25", "2002-01-01", "2002-01-21", "2002-02-18", "2002-03-29", "2002-05-27", "2002-07-04", "2002-09-02", "2002-11-28", "2002-12-25" }]
String[] FIFTEEN_MIN_EXCEPTIONS=Optional[{ "2000-01-10 09:00:00", "2000-01-10 09:15:00", "2000-01-10 09:30:00", "2000-01-10 09:45:00", "2000-01-10 10:00:00", "2000-01-10 10:15:00", "2000-02-15 09:00:00", "2000-02-15 09:15:00", "2000-02-15 09:30:00", "2000-02-15 09:45:00", "2000-02-15 10:00:00", "2000-02-15 10:15:00", "2000-02-16 11:00:00", "2000-02-16 11:15:00", "2000-02-16 11:30:00", "2000-02-16 11:45:00", "2000-02-16 12:00:00", "2000-02-16 12:15:00", "2000-02-16 12:30:00", "2000-02-16 12:45:00", "2000-02-16 01:00:00", "2000-02-16 01:15:00", "2000-02-16 01:30:00", "2000-02-16 01:45:00", "2000-05-17 11:45:00", "2000-05-17 12:00:00", "2000-05-17 12:15:00", "2000-05-17 12:30:00", "2000-05-17 12:45:00", "2000-05-17 01:00:00", "2000-05-17 01:15:00", "2000-05-17 01:30:00", "2000-05-17 01:45:00", "2000-05-17 02:00:00", "2000-05-17 02:15:00", "2000-05-17 02:30:00", "2000-05-17 02:45:00", "2000-05-17 03:00:00", "2000-05-17 03:15:00", "2000-05-17 03:30:00", "2000-05-17 03:45:00", "2000-05-17 04:00:00" }]
SegmentedTimeline msTimeline
SegmentedTimeline ms2Timeline
SegmentedTimeline ms2BaseTimeline
SegmentedTimeline mondayFridayTimeline
SegmentedTimeline fifteenMinTimeline
Calendar monday
Calendar monday9am
