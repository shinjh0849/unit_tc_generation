public RealVectorFormat()
public RealVectorFormat(final NumberFormat format)
public RealVectorFormat(final String prefix, final String suffix, final String separator)
public RealVectorFormat(final String prefix, final String suffix, final String separator, final NumberFormat format)
public static Locale[] getAvailableLocales()
public String getPrefix()
public String getSuffix()
public String getSeparator()
public NumberFormat getFormat()
public static RealVectorFormat getInstance()
public static RealVectorFormat getInstance(final Locale locale)
public String format(RealVector v)
public StringBuffer format(RealVector vector, StringBuffer toAppendTo, FieldPosition pos)
public ArrayRealVector parse(String source)
public ArrayRealVector parse(String source, ParsePosition pos)
String DEFAULT_PREFIX=Optional["{"]
String DEFAULT_SUFFIX=Optional["}"]
String DEFAULT_SEPARATOR=Optional["; "]
String prefix
String suffix
String separator
String trimmedPrefix
String trimmedSuffix
String trimmedSeparator
NumberFormat format
