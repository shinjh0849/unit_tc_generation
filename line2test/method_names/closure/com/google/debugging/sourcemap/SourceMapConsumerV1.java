 ParseState(String contents)
 FileName(String directory, String name)
 LineFragment(int startIndex, byte[] offsets)
private SourceFile(String dir, String fileName, int startLine, int startMapId, byte[] lineOffsets, short[] columns, String[] identifiers)
private SourceFile(int startMapId)
 String readLineOrNull()
 String readLine() throws SourceMapParseException
 void expectLine(String expect) throws SourceMapParseException
 void fail(String message) throws SourceMapParseException
public void parse(String contents) throws SourceMapParseException
private int parseCharacterMap(ParseState parser, int lineCount, ImmutableList.Builder<ImmutableList<LineFragment>> characterMapBuilder) throws SourceMapParseException, JSONException
private FileName splitFileName(Interner<String> interner, String input)
private void parseFileMappings(ParseState parser, int maxID) throws SourceMapParseException, JSONException
private void parseInternal(ParseState parser) throws SourceMapParseException, JSONException
public OriginalMapping getMappingForLine(int lineNumber, int columnIndex)
private SourceFile binarySearch(int mapId)
private OriginalMapping getMappingFromId(int mapID)
 int length()
 int valueAtColumn(int column)
 int getLength()
 int getStartMapId()
 OriginalMapping getOriginalMapping(int offset)
 Builder setDir(String dir)
 Builder setFileName(String fileName)
 Builder setStartMapId(int startMapId)
 Builder setStartLine(int startLine)
 Builder setLineOffsets(List<Byte> lineOffsets)
 Builder setColumns(List<Short> columns)
 Builder setIdentifiers(List<String> identifiers)
 SourceFile build()
 static Builder newBuilder()
