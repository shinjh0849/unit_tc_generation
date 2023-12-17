 LineMapper(Appendable out)
 MappingTraversal()
private void appendMappingTo(Mapping m, Appendable out) throws IOException
 void appendMappings(Appendable out) throws IOException
private static String escapeString(String value)
public void addMapping(String sourceName, @Nullable String symbolName, FilePosition sourceStartPosition, FilePosition startPosition, FilePosition endPosition)
public void setWrapperPrefix(String prefix)
public void setStartingPosition(int offsetLine, int offsetIndex)
public void reset()
public void appendTo(Appendable out, String name) throws IOException
private int prepMappings() throws IOException
public void visit(Mapping m, int line, int col, int nextLine, int nextCol) throws IOException
 void appendLineMappings() throws IOException
private void openLine() throws IOException
private void closeLine() throws IOException
private void addCharEntry(String id) throws IOException
public void visit(Mapping m, int line, int col, int nextLine, int nextCol) throws IOException
 void visit(Mapping m, int line, int col, int endLine, int endCol) throws IOException
 void traverse(MappingVisitor v) throws IOException
private int getAdjustedLine(FilePosition p)
private int getAdjustedCol(FilePosition p)
private boolean isOverlapped(Mapping m1, Mapping m2)
private void maybeVisit(MappingVisitor v, Mapping m) throws IOException
private void maybeVisitParent(MappingVisitor v, Mapping parent, Mapping m) throws IOException
private void visit(MappingVisitor v, Mapping m, int nextLine, int nextCol) throws IOException
public void validate(boolean validate)
public void appendIndexMapTo(Appendable out, String name, List<SourceMapSection> appSections)
