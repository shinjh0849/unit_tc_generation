public JsonGeneratorImpl(IOContext ctxt, int features, ObjectCodec codec)
public JsonGenerator setHighestNonEscapedChar(int charCode)
public int getHighestEscapedChar()
public JsonGenerator setCharacterEscapes(CharacterEscapes esc)
public CharacterEscapes getCharacterEscapes()
public JsonGenerator setRootValueSeparator(SerializableString sep)
public Version version()
public final void writeStringField(String fieldName, String value) throws IOException, JsonGenerationException
int[] sOutputEscapes=Optional[CharTypes.get7BitOutputEscapes()]
IOContext _ioContext
int[] _outputEscapes=Optional[sOutputEscapes]
int _maximumNonEscapedChar
CharacterEscapes _characterEscapes
SerializableString _rootValueSeparator=Optional[DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR]
