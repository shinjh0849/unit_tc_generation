public JsonWriter(Writer out)
public void setIndent(String indent)
public void setLenient(boolean lenient)
public boolean isLenient()
public void setHtmlSafe(boolean htmlSafe)
public boolean isHtmlSafe()
public JsonWriter beginArray() throws IOException
public JsonWriter endArray() throws IOException
public JsonWriter beginObject() throws IOException
public JsonWriter endObject() throws IOException
private JsonWriter open(JsonScope empty, String openBracket) throws IOException
private JsonWriter close(JsonScope empty, JsonScope nonempty, String closeBracket) throws IOException
private JsonScope peek()
private void replaceTop(JsonScope topOfStack)
public JsonWriter name(String name) throws IOException
public JsonWriter value(String value) throws IOException
public JsonWriter nullValue() throws IOException
public JsonWriter value(boolean value) throws IOException
public JsonWriter value(double value) throws IOException
public JsonWriter value(long value) throws IOException
public JsonWriter value(Number value) throws IOException
public void flush() throws IOException
public void close() throws IOException
private void string(String value) throws IOException
private void newline() throws IOException
private void beforeName() throws IOException
private void beforeValue(boolean root) throws IOException
Writer out
List<JsonScope> stack=Optional[new ArrayList<JsonScope>()]
String indent
String separator=Optional[":"]
boolean lenient
boolean htmlSafe
