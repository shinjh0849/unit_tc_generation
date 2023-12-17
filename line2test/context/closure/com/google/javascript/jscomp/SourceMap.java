public LocationMapping(String prefix, String replacement)
private SourceMap(SourceMapGenerator generator)
 SourceMap getInstance()
 SourceMap getInstance()
 SourceMap getInstance()
 SourceMap getInstance()
 abstract SourceMap getInstance()
public boolean apply(Node node)
public boolean apply(Node node)
public void addMapping(Node node, FilePosition outputStartPosition, FilePosition outputEndPosition)
private String fixupSourceLocation(String sourceFile)
public void appendTo(Appendable out, String name) throws IOException
public void reset()
public void setStartingPosition(int offsetLine, int offsetIndex)
public void setWrapperPrefix(String prefix)
public void validate(boolean validate)
public void setPrefixMappings(List<LocationMapping> sourceMapLocationMappings)
SourceMapGenerator generator
List<LocationMapping> prefixMappings=Optional[Collections.emptyList()]
Map<String, String> sourceLocationFixupCache=Optional[Maps.newHashMap()]
