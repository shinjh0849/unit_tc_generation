protected ParserBase(IOContext ctxt, int features)
public Version version()
public String getCurrentName() throws IOException, JsonParseException
public void overrideCurrentName(String name)
public void close() throws IOException
public boolean isClosed()
public JsonReadContext getParsingContext()
public JsonLocation getTokenLocation()
public JsonLocation getCurrentLocation()
public boolean hasTextCharacters()
public Object getEmbeddedObject() throws IOException, JsonParseException
public long getTokenCharacterOffset()
public int getTokenLineNr()
public int getTokenColumnNr()
protected final void loadMoreGuaranteed() throws IOException
protected abstract boolean loadMore() throws IOException
protected abstract void _finishString() throws IOException, JsonParseException
protected abstract void _closeInput() throws IOException
protected void _releaseBuffers() throws IOException
protected void _handleEOF() throws JsonParseException
protected void _reportMismatchedEndMarker(int actCh, char expCh) throws JsonParseException
public ByteArrayBuilder _getByteArrayBuilder()
protected final JsonToken reset(boolean negative, int intLen, int fractLen, int expLen)
protected final JsonToken resetInt(boolean negative, int intLen)
protected final JsonToken resetFloat(boolean negative, int intLen, int fractLen, int expLen)
protected final JsonToken resetAsNaN(String valueStr, double value)
public Number getNumberValue() throws IOException, JsonParseException
public NumberType getNumberType() throws IOException, JsonParseException
public int getIntValue() throws IOException, JsonParseException
public long getLongValue() throws IOException, JsonParseException
public BigInteger getBigIntegerValue() throws IOException, JsonParseException
public float getFloatValue() throws IOException, JsonParseException
public double getDoubleValue() throws IOException, JsonParseException
public BigDecimal getDecimalValue() throws IOException, JsonParseException
protected void _parseNumericValue(int expType) throws IOException, JsonParseException
private void _parseSlowFloatValue(int expType) throws IOException, JsonParseException
private void _parseSlowIntValue(int expType, char[] buf, int offset, int len) throws IOException, JsonParseException
protected void convertNumberToInt() throws IOException, JsonParseException
protected void convertNumberToLong() throws IOException, JsonParseException
protected void convertNumberToBigInteger() throws IOException, JsonParseException
protected void convertNumberToDouble() throws IOException, JsonParseException
protected void convertNumberToBigDecimal() throws IOException, JsonParseException
protected void reportUnexpectedNumberChar(int ch, String comment) throws JsonParseException
protected void reportInvalidNumber(String msg) throws JsonParseException
protected void reportOverflowInt() throws IOException, JsonParseException
protected void reportOverflowLong() throws IOException, JsonParseException
protected char _decodeEscaped() throws IOException, JsonParseException
protected final int _decodeBase64Escape(Base64Variant b64variant, int ch, int index) throws IOException, JsonParseException
protected final int _decodeBase64Escape(Base64Variant b64variant, char ch, int index) throws IOException, JsonParseException
protected IllegalArgumentException reportInvalidBase64Char(Base64Variant b64variant, int ch, int bindex) throws IllegalArgumentException
protected IllegalArgumentException reportInvalidBase64Char(Base64Variant b64variant, int ch, int bindex, String msg) throws IllegalArgumentException
IOContext _ioContext
boolean _closed
int _inputPtr=Optional[0]
int _inputEnd=Optional[0]
long _currInputProcessed=Optional[0L]
int _currInputRow=Optional[1]
int _currInputRowStart=Optional[0]
long _tokenInputTotal=Optional[0]
int _tokenInputRow=Optional[1]
int _tokenInputCol=Optional[0]
JsonReadContext _parsingContext
JsonToken _nextToken
TextBuffer _textBuffer
char[] _nameCopyBuffer=Optional[null]
boolean _nameCopied=Optional[false]
ByteArrayBuilder _byteArrayBuilder=Optional[null]
byte[] _binaryValue
int NR_UNKNOWN=Optional[0]
int NR_INT=Optional[0x0001]
int NR_LONG=Optional[0x0002]
int NR_BIGINT=Optional[0x0004]
int NR_DOUBLE=Optional[0x008]
int NR_BIGDECIMAL=Optional[0x0010]
BigInteger BI_MIN_INT=Optional[BigInteger.valueOf(Integer.MIN_VALUE)]
BigInteger BI_MAX_INT=Optional[BigInteger.valueOf(Integer.MAX_VALUE)]
BigInteger BI_MIN_LONG=Optional[BigInteger.valueOf(Long.MIN_VALUE)]
BigInteger BI_MAX_LONG=Optional[BigInteger.valueOf(Long.MAX_VALUE)]
BigDecimal BD_MIN_LONG=Optional[new BigDecimal(BI_MIN_LONG)]
BigDecimal BD_MAX_LONG=Optional[new BigDecimal(BI_MAX_LONG)]
BigDecimal BD_MIN_INT=Optional[new BigDecimal(BI_MIN_INT)]
BigDecimal BD_MAX_INT=Optional[new BigDecimal(BI_MAX_INT)]
long MIN_INT_L=Optional[(long) Integer.MIN_VALUE]
long MAX_INT_L=Optional[(long) Integer.MAX_VALUE]
double MIN_LONG_D=Optional[(double) Long.MIN_VALUE]
double MAX_LONG_D=Optional[(double) Long.MAX_VALUE]
double MIN_INT_D=Optional[(double) Integer.MIN_VALUE]
double MAX_INT_D=Optional[(double) Integer.MAX_VALUE]
int INT_0=Optional['0']
int INT_1=Optional['1']
int INT_2=Optional['2']
int INT_3=Optional['3']
int INT_4=Optional['4']
int INT_5=Optional['5']
int INT_6=Optional['6']
int INT_7=Optional['7']
int INT_8=Optional['8']
int INT_9=Optional['9']
int INT_MINUS=Optional['-']
int INT_PLUS=Optional['+']
int INT_DECIMAL_POINT=Optional['.']
int INT_e=Optional['e']
int INT_E=Optional['E']
char CHAR_NULL=Optional['\0']
int _numTypesValid=Optional[NR_UNKNOWN]
int _numberInt
long _numberLong
double _numberDouble
BigInteger _numberBigInt
BigDecimal _numberBigDecimal
boolean _numberNegative
int _intLength
int _fractLength
int _expLength
