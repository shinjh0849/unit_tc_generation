public RealMatrixFormat()
public RealMatrixFormat(final NumberFormat format)
public RealMatrixFormat(final String prefix, final String suffix, final String rowPrefix, final String rowSuffix, final String rowSeparator, final String columnSeparator)
public RealMatrixFormat(final String prefix, final String suffix, final String rowPrefix, final String rowSuffix, final String rowSeparator, final String columnSeparator, final NumberFormat format)
public static Locale[] getAvailableLocales()
public String getPrefix()
public String getSuffix()
public String getRowPrefix()
public String getRowSuffix()
public String getRowSeparator()
public String getColumnSeparator()
public NumberFormat getFormat()
public static RealMatrixFormat getInstance()
public static RealMatrixFormat getInstance(final Locale locale)
public String format(RealMatrix m)
public StringBuffer format(RealMatrix matrix, StringBuffer toAppendTo, FieldPosition pos)
public RealMatrix parse(String source)
public RealMatrix parse(String source, ParsePosition pos)
String DEFAULT_PREFIX=Optional["{"]
String DEFAULT_SUFFIX=Optional["}"]
String DEFAULT_ROW_PREFIX=Optional["{"]
String DEFAULT_ROW_SUFFIX=Optional["}"]
String DEFAULT_ROW_SEPARATOR=Optional[","]
String DEFAULT_COLUMN_SEPARATOR=Optional[","]
String prefix
String suffix
String rowPrefix
String rowSuffix
String rowSeparator
String columnSeparator
NumberFormat format
