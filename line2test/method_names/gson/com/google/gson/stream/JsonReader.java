public JsonReader(Reader in)
public void setLenient(boolean lenient)
public boolean isLenient()
public void beginArray() throws IOException
public void endArray() throws IOException
public void beginObject() throws IOException
public void endObject() throws IOException
private void expect(JsonToken expected) throws IOException
public boolean hasNext() throws IOException
public JsonToken peek() throws IOException
private JsonToken quickPeek() throws IOException
private void consumeNonExecutePrefix() throws IOException
private JsonToken advance() throws IOException
public String nextName() throws IOException
public String nextString() throws IOException
public boolean nextBoolean() throws IOException
public void nextNull() throws IOException
public double nextDouble() throws IOException
public long nextLong() throws IOException
public int nextInt() throws IOException
public void close() throws IOException
public void skipValue() throws IOException
private JsonScope peekStack()
private JsonScope pop()
private void push(JsonScope newTop)
private void replaceTop(JsonScope newTop)
private JsonToken nextInArray(boolean firstElement) throws IOException
private JsonToken nextInObject(boolean firstElement) throws IOException
private JsonToken objectValue() throws IOException
private JsonToken nextValue() throws IOException
private boolean fillBuffer(int minimum) throws IOException
private int nextNonWhitespace() throws IOException
private void checkLenient() throws IOException
private void skipToEndOfLine() throws IOException
private boolean skipTo(String toFind) throws IOException
private String nextString(char quote) throws IOException
private String nextLiteral() throws IOException
public String toString()
private char readEscapeCharacter() throws IOException
private JsonToken readLiteral() throws IOException
private void decodeLiteral() throws IOException
private IOException syntaxError(String message) throws IOException
private CharSequence getSnippet()
