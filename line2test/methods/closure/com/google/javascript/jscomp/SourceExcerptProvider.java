@Override [EOL] public String get(SourceExcerptProvider source, String sourceName, int lineNumber, ExcerptFormatter formatter) { [EOL]     return formatter.formatLine(source.getSourceLine(sourceName, lineNumber), lineNumber); [EOL] } <line_num>: 33,38
@Override [EOL] public String get(SourceExcerptProvider source, String sourceName, int lineNumber, ExcerptFormatter formatter) { [EOL]     return formatter.formatRegion(source.getSourceRegion(sourceName, lineNumber)); [EOL] } <line_num>: 44,49
public abstract String get(SourceExcerptProvider source, String sourceName, int lineNumber, ExcerptFormatter formatter); <line_num>: 55,56
String getSourceLine(String sourceName, int lineNumber); <line_num>: 66,66
Region getSourceRegion(String sourceName, int lineNumber); <line_num>: 77,77
String formatLine(String line, int lineNumber); <line_num>: 86,86
String formatRegion(Region region); <line_num>: 91,91
