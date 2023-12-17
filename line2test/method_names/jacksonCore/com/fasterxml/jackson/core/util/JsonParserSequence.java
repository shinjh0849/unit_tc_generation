protected JsonParserSequence(JsonParser[] parsers)
public static JsonParserSequence createFlattened(JsonParser first, JsonParser second)
protected void addFlattenedActiveParsers(List<JsonParser> result)
public void close() throws IOException
public JsonToken nextToken() throws IOException, JsonParseException
public int containedParsersCount()
protected boolean switchToNext()
