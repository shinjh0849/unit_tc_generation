 DateParser getInstance(final String format)
private DateParser getDateInstance(final int dateStyle, final Locale locale)
private DateParser getInstance(final String format, final Locale locale)
private DateParser getInstance(final String format, final TimeZone timeZone)
protected DateParser getInstance(final String format, final TimeZone timeZone, final Locale locale)
public void test_Equality_Hash()
public void testParseZone()
public void testParseLongShort() throws ParseException
public void testAmPm() throws ParseException
public void testParses() throws Exception
public void testLocales_Long_AD() throws Exception
public void testLocales_Long_BC() throws Exception
public void testLocales_Short_AD() throws Exception
public void testLocales_Short_BC() throws Exception
public void testLocales_LongNoEra_AD() throws Exception
public void testLocales_LongNoEra_BC() throws Exception
public void testLocales_ShortNoEra_AD() throws Exception
public void testLocales_ShortNoEra_BC() throws Exception
private void testLocales(final String format, final boolean eraBC) throws Exception
private String trimMessage(final String msg)
private void checkParse(final Locale locale, final Calendar cal, final SimpleDateFormat sdf, final DateParser fdf) throws ParseException
public void testParseNumerics() throws ParseException
public void testQuotes() throws ParseException
public void testSpecialCharacters() throws Exception
public void testLANG_832() throws Exception
public void testLANG_831() throws Exception
private void testSdfAndFdp(final String format, final String date, final boolean shouldFail) throws Exception
public void testDayOf() throws ParseException
public void testShortDateStyleWithLocales() throws ParseException
public void testLowYearPadding() throws ParseException
public void testMilleniumBug() throws ParseException
public void testLang303() throws ParseException
public void testLang538() throws ParseException
public void testEquals()
public void testToStringContainsName()
public void testPatternMatches()
public void testLocaleMatches()
public void testTimeZoneMatches()
String SHORT_FORMAT_NOERA=Optional["y/M/d/h/a/m/E/Z"]
String LONG_FORMAT_NOERA=Optional["yyyy/MMMM/dddd/hhhh/mmmm/aaaa/EEEE/ZZZZ"]
String SHORT_FORMAT=Optional["G/" + SHORT_FORMAT_NOERA]
String LONG_FORMAT=Optional["GGGG/" + LONG_FORMAT_NOERA]
String yMdHmsSZ=Optional["yyyy-MM-dd'T'HH:mm:ss.SSS Z"]
String DMY_DOT=Optional["dd.MM.yyyy"]
String YMD_SLASH=Optional["yyyy/MM/dd"]
String MDY_DASH=Optional["MM-DD-yyyy"]
String MDY_SLASH=Optional["MM/DD/yyyy"]
TimeZone REYKJAVIK=Optional[TimeZone.getTimeZone("Atlantic/Reykjavik")]
TimeZone NEW_YORK=Optional[TimeZone.getTimeZone("America/New_York")]
TimeZone GMT=Optional[TimeZone.getTimeZone("GMT")]
Locale SWEDEN=Optional[new Locale("sv", "SE")]
