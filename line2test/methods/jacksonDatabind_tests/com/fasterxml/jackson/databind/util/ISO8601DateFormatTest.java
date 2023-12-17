@Override [EOL] public void setUp() { [EOL]     Calendar cal = new GregorianCalendar(2007, 8 - 1, 13, 19, 51, 23); [EOL]     cal.setTimeZone(TimeZone.getTimeZone("GMT")); [EOL]     cal.set(Calendar.MILLISECOND, 0); [EOL]     date = cal.getTime(); [EOL]     df = new ISO8601DateFormat(); [EOL] } <line_num>: 18,26
public void testFormat() { [EOL]     String result = df.format(date); [EOL]     assertEquals("2007-08-13T19:51:23Z", result); [EOL] } <line_num>: 28,31
public void testParse() throws Exception { [EOL]     Date result = df.parse("2007-08-13T19:51:23Z"); [EOL]     assertEquals(date, result); [EOL] } <line_num>: 33,36
public void testCloneObject() throws Exception { [EOL]     DateFormat clone = (DateFormat) df.clone(); [EOL]     assertSame(df, clone); [EOL] } <line_num>: 38,41
