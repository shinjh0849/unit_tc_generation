public TestPeriodFormatterBuilder(String name)
public static void main(String[] args)
public static TestSuite suite()
protected void setUp() throws Exception
protected void tearDown() throws Exception
public void testToFormatterPrinterParser()
public void testFormatYears()
public void testFormatMonths()
public void testFormatWeeks()
public void testFormatDays()
public void testFormatHours()
public void testFormatMinutes()
public void testFormatSeconds()
public void testFormatSecondsWithMillis()
public void testFormatSecondsWithOptionalMillis()
public void testFormatMillis()
public void testFormatMillis3Digit()
public void testFormatPrefixSimple1()
public void testFormatPrefixSimple2()
public void testFormatPrefixSimple3()
public void testFormatPrefixPlural1()
public void testFormatPrefixPlural2()
public void testFormatPrefixPlural3()
public void testFormatSuffixSimple1()
public void testFormatSuffixSimple2()
public void testFormatSuffixSimple3()
public void testFormatSuffixSimple4()
public void testFormatSuffixPlural1()
public void testFormatSuffixPlural2()
public void testFormatSuffixPlural3()
public void testFormatSuffixPlural4()
public void testFormatPrefixSuffix()
public void testFormatSeparatorSimple()
public void testFormatSeparatorComplex()
public void testFormatSeparatorIfFieldsAfter()
public void testFormatSeparatorIfFieldsBefore()
public void testFormatLiteral()
public void testFormatAppendFormatter()
public void testFormatMinDigits()
public void testFormatPrintZeroDefault()
public void testFormatPrintZeroRarelyLast()
public void testFormatPrintZeroRarelyFirst()
public void testFormatPrintZeroRarelyFirstYears()
public void testFormatPrintZeroRarelyFirstMonths()
public void testFormatPrintZeroRarelyFirstWeeks()
public void testFormatPrintZeroRarelyFirstDays()
public void testFormatPrintZeroRarelyFirstHours()
public void testFormatPrintZeroRarelyFirstMinutes()
public void testFormatPrintZeroRarelyFirstSeconds()
public void testFormatPrintZeroIfSupported()
public void testFormatPrintZeroAlways()
public void testFormatPrintZeroNever()
public void testFormatAppend_PrinterParser_null_null()
public void testFormatAppend_PrinterParser_Printer_null()
public void testFormatAppend_PrinterParser_null_Parser()
public void testFormatAppend_PrinterParser_PrinterParser()
public void testFormatAppend_PrinterParser_Printer_null_null_Parser()
public void testFormatAppend_PrinterParserThenClear()
public void testBug2495455()
Period PERIOD=Optional[new Period(1, 2, 3, 4, 5, 6, 7, 8)]
Period EMPTY_PERIOD=Optional[new Period(0, 0, 0, 0, 0, 0, 0, 0)]
Period YEAR_DAY_PERIOD=Optional[new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime())]
Period EMPTY_YEAR_DAY_PERIOD=Optional[new Period(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.yearDayTime())]
Period TIME_PERIOD=Optional[new Period(0, 0, 0, 0, 5, 6, 7, 8)]
Period DATE_PERIOD=Optional[new Period(1, 2, 3, 4, 0, 0, 0, 0)]
DateTimeZone LONDON=Optional[DateTimeZone.forID("Europe/London")]
long y2002days=Optional[365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365]
long TEST_TIME_NOW=Optional[(y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY]
DateTimeZone originalDateTimeZone=Optional[null]
TimeZone originalTimeZone=Optional[null]
Locale originalLocale=Optional[null]
PeriodFormatterBuilder builder
