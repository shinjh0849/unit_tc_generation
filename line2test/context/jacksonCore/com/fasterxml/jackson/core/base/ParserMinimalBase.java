protected ParserMinimalBase()
protected ParserMinimalBase(int features)
public Version version()
public abstract JsonToken nextToken() throws IOException, JsonParseException
public JsonToken getCurrentToken()
public boolean hasCurrentToken()
public JsonToken nextValue() throws IOException, JsonParseException
public JsonParser skipChildren() throws IOException, JsonParseException
protected abstract void _handleEOF() throws JsonParseException
public abstract String getCurrentName() throws IOException, JsonParseException
public abstract void close() throws IOException
public abstract boolean isClosed()
public abstract JsonStreamContext getParsingContext()
public void clearCurrentToken()
public JsonToken getLastClearedToken()
public abstract void overrideCurrentName(String name)
public abstract String getText() throws IOException, JsonParseException
public abstract char[] getTextCharacters() throws IOException, JsonParseException
public abstract boolean hasTextCharacters()
public abstract int getTextLength() throws IOException, JsonParseException
public abstract int getTextOffset() throws IOException, JsonParseException
public abstract byte[] getBinaryValue(Base64Variant b64variant) throws IOException, JsonParseException
public boolean getValueAsBoolean(boolean defaultValue) throws IOException, JsonParseException
public int getValueAsInt(int defaultValue) throws IOException, JsonParseException
public long getValueAsLong(long defaultValue) throws IOException, JsonParseException
public double getValueAsDouble(double defaultValue) throws IOException, JsonParseException
public String getValueAsString(String defaultValue) throws IOException, JsonParseException
protected void _decodeBase64(String str, ByteArrayBuilder builder, Base64Variant b64variant) throws IOException, JsonParseException
protected void _reportInvalidBase64(Base64Variant b64variant, char ch, int bindex, String msg) throws JsonParseException
protected void _reportBase64EOF() throws JsonParseException
protected boolean _hasTextualNull(String value)
protected void _reportUnexpectedChar(int ch, String comment) throws JsonParseException
protected void _reportInvalidEOF() throws JsonParseException
protected void _reportInvalidEOF(String msg) throws JsonParseException
protected void _reportInvalidEOFInValue() throws JsonParseException
protected void _throwInvalidSpace(int i) throws JsonParseException
protected void _throwUnquotedSpace(int i, String ctxtDesc) throws JsonParseException
protected char _handleUnrecognizedCharacterEscape(char ch) throws JsonProcessingException
protected static final String _getCharDesc(int ch)
protected final void _reportError(String msg) throws JsonParseException
protected final void _wrapError(String msg, Throwable t) throws JsonParseException
protected final void _throwInternal()
protected final JsonParseException _constructError(String msg, Throwable t)
int INT_TAB=Optional['\t']
int INT_LF=Optional['\n']
int INT_CR=Optional['\r']
int INT_SPACE=Optional[0x0020]
int INT_LBRACKET=Optional['[']
int INT_RBRACKET=Optional[']']
int INT_LCURLY=Optional['{']
int INT_RCURLY=Optional['}']
int INT_QUOTE=Optional['"']
int INT_BACKSLASH=Optional['\\']
int INT_SLASH=Optional['/']
int INT_COLON=Optional[':']
int INT_COMMA=Optional[',']
int INT_ASTERISK=Optional['*']
int INT_APOSTROPHE=Optional['\'']
int INT_b=Optional['b']
int INT_f=Optional['f']
int INT_n=Optional['n']
int INT_r=Optional['r']
int INT_t=Optional['t']
int INT_u=Optional['u']
JsonToken _currToken
JsonToken _lastClearedToken
