protected AbstractFormat()
protected AbstractFormat(final NumberFormat format)
protected AbstractFormat(final NumberFormat numeratorFormat, final NumberFormat denominatorFormat)
protected static NumberFormat getDefaultNumberFormat()
protected static NumberFormat getDefaultNumberFormat(final Locale locale)
public NumberFormat getDenominatorFormat()
public NumberFormat getNumeratorFormat()
public void setDenominatorFormat(final NumberFormat format)
public void setNumeratorFormat(final NumberFormat format)
protected static void parseAndIgnoreWhitespace(final String source, final ParsePosition pos)
protected static char parseNextCharacter(final String source, final ParsePosition pos)
public StringBuffer format(final double value, final StringBuffer buffer, final FieldPosition position)
public StringBuffer format(final long value, final StringBuffer buffer, final FieldPosition position)
long serialVersionUID=Optional[-6981118387974191891L]
NumberFormat denominatorFormat
NumberFormat numeratorFormat
