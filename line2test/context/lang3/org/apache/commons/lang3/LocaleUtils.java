public LocaleUtils()
public static Locale toLocale(final String str)
public static List<Locale> localeLookupList(final Locale locale)
public static List<Locale> localeLookupList(final Locale locale, final Locale defaultLocale)
public static List<Locale> availableLocaleList()
public static Set<Locale> availableLocaleSet()
public static boolean isAvailableLocale(final Locale locale)
public static List<Locale> languagesByCountry(final String countryCode)
public static List<Locale> countriesByLanguage(final String languageCode)
ConcurrentMap<String, List<Locale>> cLanguagesByCountry=Optional[new ConcurrentHashMap<String, List<Locale>>()]
ConcurrentMap<String, List<Locale>> cCountriesByLanguage=Optional[new ConcurrentHashMap<String, List<Locale>>()]
