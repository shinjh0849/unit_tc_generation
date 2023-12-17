public SourceMapConsumerV2()
public void parse(String contents) throws SourceMapParseException
public void parse(JSONObject sourceMapRoot) throws SourceMapParseException
private void parseInternal(JSONObject sourceMapRoot) throws JSONException, SourceMapParseException
public OriginalMapping getMappingForLine(int lineNumber, int columnIndex)
Map<Integer, List<Integer>> characterMap=Optional[null]
JSONArray lineMaps=Optional[null]
List<OriginalMapping> mappings
