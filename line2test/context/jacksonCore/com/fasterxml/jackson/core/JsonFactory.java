private Feature(boolean defaultState)
public JsonFactory()
public JsonFactory(ObjectCodec oc)
protected JsonFactory(JsonFactory src, ObjectCodec codec)
public static int collectDefaults()
public boolean enabledByDefault()
public boolean enabledIn(int flags)
public int getMask()
public JsonFactory copy()
protected void _checkInvalidCopy(Class<?> exp)
protected Object readResolve()
public boolean requiresPropertyOrdering()
public boolean canUseSchema(FormatSchema schema)
public String getFormatName()
public MatchStrength hasFormat(InputAccessor acc) throws IOException
public boolean requiresCustomCodec()
protected MatchStrength hasJSONFormat(InputAccessor acc) throws IOException
public Version version()
public final JsonFactory configure(JsonFactory.Feature f, boolean state)
public JsonFactory enable(JsonFactory.Feature f)
public JsonFactory disable(JsonFactory.Feature f)
public final boolean isEnabled(JsonFactory.Feature f)
public final JsonFactory configure(JsonParser.Feature f, boolean state)
public JsonFactory enable(JsonParser.Feature f)
public JsonFactory disable(JsonParser.Feature f)
public final boolean isEnabled(JsonParser.Feature f)
public InputDecorator getInputDecorator()
public JsonFactory setInputDecorator(InputDecorator d)
public final JsonFactory configure(JsonGenerator.Feature f, boolean state)
public JsonFactory enable(JsonGenerator.Feature f)
public JsonFactory disable(JsonGenerator.Feature f)
public final boolean isEnabled(JsonGenerator.Feature f)
public CharacterEscapes getCharacterEscapes()
public JsonFactory setCharacterEscapes(CharacterEscapes esc)
public OutputDecorator getOutputDecorator()
public JsonFactory setOutputDecorator(OutputDecorator d)
public JsonFactory setRootValueSeparator(String sep)
public String getRootValueSeparator()
public JsonFactory setCodec(ObjectCodec oc)
public ObjectCodec getCodec()
public JsonParser createParser(File f) throws IOException, JsonParseException
public JsonParser createParser(URL url) throws IOException, JsonParseException
public JsonParser createParser(InputStream in) throws IOException, JsonParseException
public JsonParser createParser(Reader r) throws IOException, JsonParseException
public JsonParser createParser(byte[] data) throws IOException, JsonParseException
public JsonParser createParser(byte[] data, int offset, int len) throws IOException, JsonParseException
public JsonParser createParser(String content) throws IOException, JsonParseException
public JsonParser createJsonParser(File f) throws IOException, JsonParseException
public JsonParser createJsonParser(URL url) throws IOException, JsonParseException
public JsonParser createJsonParser(InputStream in) throws IOException, JsonParseException
public JsonParser createJsonParser(Reader r) throws IOException, JsonParseException
public JsonParser createJsonParser(byte[] data) throws IOException, JsonParseException
public JsonParser createJsonParser(byte[] data, int offset, int len) throws IOException, JsonParseException
public JsonParser createJsonParser(String content) throws IOException, JsonParseException
public JsonGenerator createGenerator(OutputStream out, JsonEncoding enc) throws IOException
public JsonGenerator createGenerator(OutputStream out) throws IOException
public JsonGenerator createGenerator(Writer out) throws IOException
public JsonGenerator createGenerator(File f, JsonEncoding enc) throws IOException
public JsonGenerator createJsonGenerator(OutputStream out, JsonEncoding enc) throws IOException
public JsonGenerator createJsonGenerator(Writer out) throws IOException
public JsonGenerator createJsonGenerator(OutputStream out) throws IOException
public JsonGenerator createJsonGenerator(File f, JsonEncoding enc) throws IOException
protected JsonParser _createParser(InputStream in, IOContext ctxt) throws IOException, JsonParseException
protected JsonParser _createJsonParser(InputStream in, IOContext ctxt) throws IOException, JsonParseException
protected JsonParser _createParser(Reader r, IOContext ctxt) throws IOException, JsonParseException
protected JsonParser _createJsonParser(Reader r, IOContext ctxt) throws IOException, JsonParseException
protected JsonParser _createParser(byte[] data, int offset, int len, IOContext ctxt) throws IOException, JsonParseException
protected JsonParser _createJsonParser(byte[] data, int offset, int len, IOContext ctxt) throws IOException, JsonParseException
protected JsonGenerator _createGenerator(Writer out, IOContext ctxt) throws IOException
protected JsonGenerator _createJsonGenerator(Writer out, IOContext ctxt) throws IOException
protected JsonGenerator _createUTF8Generator(OutputStream out, IOContext ctxt) throws IOException
protected JsonGenerator _createUTF8JsonGenerator(OutputStream out, IOContext ctxt) throws IOException
protected Writer _createWriter(OutputStream out, JsonEncoding enc, IOContext ctxt) throws IOException
protected IOContext _createContext(Object srcRef, boolean resourceManaged)
public BufferRecycler _getBufferRecycler()
protected InputStream _optimizedStreamFromURL(URL url) throws IOException
long serialVersionUID=Optional[3194418244231611666L]
String FORMAT_NAME_JSON=Optional["JSON"]
int DEFAULT_FACTORY_FEATURE_FLAGS=Optional[JsonFactory.Feature.collectDefaults()]
int DEFAULT_PARSER_FEATURE_FLAGS=Optional[JsonParser.Feature.collectDefaults()]
int DEFAULT_GENERATOR_FEATURE_FLAGS=Optional[JsonGenerator.Feature.collectDefaults()]
SerializableString DEFAULT_ROOT_VALUE_SEPARATOR=Optional[DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR]
ThreadLocal<SoftReference<BufferRecycler>> _recyclerRef=Optional[new ThreadLocal<SoftReference<BufferRecycler>>()]
CharsToNameCanonicalizer _rootCharSymbols=Optional[CharsToNameCanonicalizer.createRoot()]
BytesToNameCanonicalizer _rootByteSymbols=Optional[BytesToNameCanonicalizer.createRoot()]
ObjectCodec _objectCodec
int _factoryFeatures=Optional[DEFAULT_FACTORY_FEATURE_FLAGS]
int _parserFeatures=Optional[DEFAULT_PARSER_FEATURE_FLAGS]
int _generatorFeatures=Optional[DEFAULT_GENERATOR_FEATURE_FLAGS]
CharacterEscapes _characterEscapes
InputDecorator _inputDecorator
OutputDecorator _outputDecorator
SerializableString _rootValueSeparator=Optional[DEFAULT_ROOT_VALUE_SEPARATOR]
