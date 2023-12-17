 MappingTraversal()
 LineMapper(Appendable out)
public void reset()
public void validate(boolean validate)
public void setWrapperPrefix(String prefix)
public void setStartingPosition(int offsetLine, int offsetIndex)
public void addMapping(String sourceName, @Nullable String symbolName, FilePosition sourceStartPosition, FilePosition startPosition, FilePosition endPosition)
public void visit(String sourceName, String symbolName, FilePosition sourceStartPosition, FilePosition startPosition, FilePosition endPosition)
public void mergeMapSection(int line, int column, String mapSectionContents) throws SourceMapParseException
public void appendTo(Appendable out, String name) throws IOException
private void addSourceNameMap(Appendable out) throws IOException
private void addSymbolNameMap(Appendable out) throws IOException
private void addNameMap(Appendable out, Map<String, Integer> map) throws IOException
private static String escapeString(String value)
private static void appendFirstField(Appendable out, String name, CharSequence value) throws IOException
private static void appendField(Appendable out, String name, CharSequence value) throws IOException
private static void appendFieldStart(Appendable out, String name) throws IOException
private static void appendFieldEnd(Appendable out) throws IOException
private int prepMappings() throws IOException
public void visit(Mapping m, int line, int col, int nextLine, int nextCol) throws IOException
 void visit(Mapping m, int line, int col, int endLine, int endCol) throws IOException
 void traverse(MappingVisitor v) throws IOException
private int getAdjustedLine(FilePosition p)
private int getAdjustedCol(FilePosition p)
private boolean isOverlapped(Mapping m1, Mapping m2)
private void maybeVisit(MappingVisitor v, Mapping m) throws IOException
private void maybeVisitParent(MappingVisitor v, Mapping parent, Mapping m) throws IOException
private void visit(MappingVisitor v, Mapping m, int nextLine, int nextCol) throws IOException
public void appendIndexMapTo(Appendable out, String name, List<SourceMapSection> sections) throws IOException
private CharSequence offsetValue(int line, int column) throws IOException
private int getSourceId(String sourceName)
private int getNameId(String symbolName)
public void visit(Mapping m, int line, int col, int nextLine, int nextCol) throws IOException
 void writeEntry(Mapping m, int column) throws IOException
 void appendLineMappings() throws IOException
private void openLine(boolean firstEntry) throws IOException
private void closeLine(boolean finalEntry) throws IOException
