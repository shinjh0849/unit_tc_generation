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
