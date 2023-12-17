private NumericEntityEscaper(final int below, final int above, final boolean between)
public NumericEntityEscaper()
public static NumericEntityEscaper below(final int codepoint)
public static NumericEntityEscaper above(final int codepoint)
public static NumericEntityEscaper between(final int codepointLow, final int codepointHigh)
public static NumericEntityEscaper outsideOf(final int codepointLow, final int codepointHigh)
public boolean translate(final int codepoint, final Writer out) throws IOException
int below
int above
boolean between
