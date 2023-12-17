public MultipartKey(final Object... keys)
public F getInstance()
public F getInstance(final String pattern, TimeZone timeZone, Locale locale)
protected abstract F createInstance(String pattern, TimeZone timeZone, Locale locale)
private F getDateTimeInstance(final Integer dateStyle, final Integer timeStyle, final TimeZone timeZone, Locale locale)
 F getDateTimeInstance(final int dateStyle, final int timeStyle, final TimeZone timeZone, Locale locale)
 F getDateInstance(final int dateStyle, final TimeZone timeZone, Locale locale)
 F getTimeInstance(final int timeStyle, final TimeZone timeZone, Locale locale)
 static String getPatternForStyle(final Integer dateStyle, final Integer timeStyle, final Locale locale)
public boolean equals(final Object obj)
public int hashCode()
int NONE=Optional[-1]
ConcurrentMap<MultipartKey, F> cInstanceCache=Optional[new ConcurrentHashMap<MultipartKey, F>(7)]
ConcurrentMap<MultipartKey, String> cDateTimeInstanceCache=Optional[new ConcurrentHashMap<MultipartKey, String>(7)]
