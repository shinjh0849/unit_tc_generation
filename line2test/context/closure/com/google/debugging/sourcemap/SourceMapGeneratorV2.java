 LineMapper(Appendable out)
 MappingTraversal()
public void reset()
public void validate(boolean validate)
public void setWrapperPrefix(String prefix)
public void setStartingPosition(int offsetLine, int offsetIndex)
public void addMapping(String sourceName, @Nullable String symbolName, FilePosition sourceStartPosition, FilePosition startPosition, FilePosition endPosition)
public void appendTo(Appendable out, String name) throws IOException
private void addSourceNameMap(Appendable out) throws IOException
private void addOriginalNameMap(Appendable out) throws IOException
private void addMap(Appendable out, Map<String, Integer> map) throws IOException
private static String escapeString(String value)
private static void appendFirstField(Appendable out, String name, CharSequence value) throws IOException
private static void appendField(Appendable out, String name, CharSequence value) throws IOException
private static void appendFieldStart(Appendable out, String name) throws IOException
private static void appendFieldEnd(Appendable out) throws IOException
private int prepMappings() throws IOException
private int getSourceId(String sourceName)
private int getNameId(String symbolName)
private void appendMappingTo(Mapping m, Appendable out) throws IOException
 void appendMappings(Appendable out) throws IOException
public void visit(Mapping m, int line, int col, int nextLine, int nextCol) throws IOException
 void appendLineMappings() throws IOException
private void openLine() throws IOException
private void closeLine(boolean finalEntry) throws IOException
private void closeEntry(int id, int reps) throws IOException
public static void encodeEntry(Appendable out, int id, int lastId, int reps) throws IOException
public static int getRelativeMappingId(int id, int idLength, int lastId)
public static int getRelativeMappingIdLength(int rawId, int lastId)
 static String valueToBase64(int value, int minimumSize)
public void visit(Mapping m, int line, int col, int nextLine, int nextCol) throws IOException
 void visit(Mapping m, int line, int col, int endLine, int endCol) throws IOException
 void traverse(MappingVisitor v) throws IOException
private int getAdjustedLine(FilePosition p)
private int getAdjustedCol(FilePosition p)
private boolean isOverlapped(Mapping m1, Mapping m2)
private void maybeVisit(MappingVisitor v, Mapping m) throws IOException
private void maybeVisitParent(MappingVisitor v, Mapping parent, Mapping m) throws IOException
private void visit(MappingVisitor v, Mapping m, int nextLine, int nextCol) throws IOException
public void appendIndexMapTo(Appendable out, String name, List<SourceMapSection> appSections)
boolean validate=Optional[false]
int UNMAPPED=Optional[-1]
List<Mapping> mappings=Optional[Lists.newArrayList()]
LinkedHashMap<String, Integer> sourceFileMap=Optional[Maps.newLinkedHashMap()]
LinkedHashMap<String, Integer> originalNameMap=Optional[Maps.newLinkedHashMap()]
String lastSourceFile=Optional[null]
int lastSourceFileIndex=Optional[-1]
Mapping lastMapping
FilePosition offsetPosition=Optional[new FilePosition(0, 0)]
FilePosition prefixPosition=Optional[new FilePosition(0, 0)]
