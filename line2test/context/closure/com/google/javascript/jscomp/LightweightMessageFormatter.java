private LightweightMessageFormatter()
public LightweightMessageFormatter(SourceExcerptProvider source)
public LightweightMessageFormatter(SourceExcerptProvider source, SourceExcerpt excerpt)
 static LightweightMessageFormatter withoutSource()
public String formatError(JSError error)
public String formatWarning(JSError warning)
private String format(JSError error, boolean warning)
public String formatLine(String line, int lineNumber)
public String formatRegion(Region region)
SourceExcerpt excerpt
ExcerptFormatter excerptFormatter=Optional[new LineNumberingFormatter()]
