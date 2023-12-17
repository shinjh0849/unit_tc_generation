public FractionFormat()
public FractionFormat(final NumberFormat format)
public FractionFormat(final NumberFormat numeratorFormat, final NumberFormat denominatorFormat)
public static Locale[] getAvailableLocales()
public static String formatFraction(Fraction f)
public static FractionFormat getImproperInstance()
public static FractionFormat getImproperInstance(final Locale locale)
public static FractionFormat getProperInstance()
public static FractionFormat getProperInstance(final Locale locale)
protected static NumberFormat getDefaultNumberFormat()
public StringBuffer format(final Fraction fraction, final StringBuffer toAppendTo, final FieldPosition pos)
public StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos) throws FractionConversionException, MathIllegalArgumentException
public Fraction parse(final String source) throws MathParseException
public Fraction parse(final String source, final ParsePosition pos)
long serialVersionUID=Optional[3008655719530972611L]
