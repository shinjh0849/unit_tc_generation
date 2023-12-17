public UnicodeEscaper()
protected UnicodeEscaper(final int below, final int above, final boolean between)
public static UnicodeEscaper below(final int codepoint)
public static UnicodeEscaper above(final int codepoint)
public static UnicodeEscaper outsideOf(final int codepointLow, final int codepointHigh)
public static UnicodeEscaper between(final int codepointLow, final int codepointHigh)
public boolean translate(final int codepoint, final Writer out) throws IOException
protected String toUtf16Escape(final int codepoint)
