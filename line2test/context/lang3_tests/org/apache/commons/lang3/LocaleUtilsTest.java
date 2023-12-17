public void setUp() throws Exception
public void testConstructor()
private void assertValidToLocale(final String language)
private void assertValidToLocale(final String localeString, final String language, final String country)
private void assertValidToLocale(final String localeString, final String language, final String country, final String variant)
public void testToLocale_1Part()
public void testToLocale_2Part()
public void testToLocale_3Part()
private void assertLocaleLookupList(final Locale locale, final Locale defaultLocale, final Locale[] expected)
public void testLocaleLookupList_Locale()
public void testLocaleLookupList_LocaleLocale()
public void testAvailableLocaleList()
public void testAvailableLocaleSet()
public void testIsAvailableLocale()
private void assertLanguageByCountry(final String country, final String[] languages)
public void testLanguagesByCountry()
private void assertCountriesByLanguage(final String language, final String[] countries)
public void testCountriesByLanguage()
private static void assertUnmodifiableCollection(final Collection<?> coll)
public void testLang328()
public void testLang865()
public void testParseAllLocales()
Locale LOCALE_EN=Optional[new Locale("en", "")]
Locale LOCALE_EN_US=Optional[new Locale("en", "US")]
Locale LOCALE_EN_US_ZZZZ=Optional[new Locale("en", "US", "ZZZZ")]
Locale LOCALE_FR=Optional[new Locale("fr", "")]
Locale LOCALE_FR_CA=Optional[new Locale("fr", "CA")]
Locale LOCALE_QQ=Optional[new Locale("qq", "")]
Locale LOCALE_QQ_ZZ=Optional[new Locale("qq", "ZZ")]
