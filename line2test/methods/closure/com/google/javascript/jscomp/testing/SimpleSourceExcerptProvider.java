public SimpleSourceExcerptProvider(String source) { [EOL]     sourceFile = SourceFile.fromCode("input", source); [EOL] } <line_num>: 33,35
@Override [EOL] public String getSourceLine(String sourceName, int lineNumber) { [EOL]     return sourceFile.getLine(lineNumber); [EOL] } <line_num>: 37,40
@Override [EOL] public Region getSourceRegion(String sourceName, int lineNumber) { [EOL]     return sourceFile.getRegion(lineNumber); [EOL] } <line_num>: 42,45
