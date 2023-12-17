protected VectorFormat()
protected VectorFormat(final NumberFormat format)
protected VectorFormat(final String prefix, final String suffix, final String separator)
protected VectorFormat(final String prefix, final String suffix, final String separator, final NumberFormat format)
public static Locale[] getAvailableLocales()
public String getPrefix()
public String getSuffix()
public String getSeparator()
public NumberFormat getFormat()
public String format(Vector<S> vector)
public abstract StringBuffer format(Vector<S> vector, StringBuffer toAppendTo, FieldPosition pos)
protected StringBuffer format(StringBuffer toAppendTo, FieldPosition pos, double... coordinates)
public abstract Vector<S> parse(String source) throws MathParseException
public abstract Vector<S> parse(String source, ParsePosition pos)
protected double[] parseCoordinates(int dimension, String source, ParsePosition pos)
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
