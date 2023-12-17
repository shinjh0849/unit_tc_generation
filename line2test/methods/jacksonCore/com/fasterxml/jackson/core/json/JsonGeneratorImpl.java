public JsonGeneratorImpl(IOContext ctxt, int features, ObjectCodec codec) { [EOL]     super(features, codec); [EOL]     _ioContext = ctxt; [EOL]     if (isEnabled(Feature.ESCAPE_NON_ASCII)) { [EOL]         setHighestNonEscapedChar(127); [EOL]     } [EOL] } <line_num>: 93,100
@Override [EOL] public JsonGenerator setHighestNonEscapedChar(int charCode) { [EOL]     _maximumNonEscapedChar = (charCode < 0) ? 0 : charCode; [EOL]     return this; [EOL] } <line_num>: 108,112
@Override [EOL] public int getHighestEscapedChar() { [EOL]     return _maximumNonEscapedChar; [EOL] } <line_num>: 114,117
@Override [EOL] public JsonGenerator setCharacterEscapes(CharacterEscapes esc) { [EOL]     _characterEscapes = esc; [EOL]     if (esc == null) { [EOL]         _outputEscapes = sOutputEscapes; [EOL]     } else { [EOL]         _outputEscapes = esc.getEscapeCodesForAscii(); [EOL]     } [EOL]     return this; [EOL] } <line_num>: 119,129
@Override [EOL] public CharacterEscapes getCharacterEscapes() { [EOL]     return _characterEscapes; [EOL] } <line_num>: 135,138
@Override [EOL] public JsonGenerator setRootValueSeparator(SerializableString sep) { [EOL]     _rootValueSeparator = sep; [EOL]     return this; [EOL] } <line_num>: 140,144
@Override [EOL] public Version version() { [EOL]     return VersionUtil.versionFor(getClass()); [EOL] } <line_num>: 152,155
@Override [EOL] public final void writeStringField(String fieldName, String value) throws IOException, JsonGenerationException { [EOL]     writeFieldName(fieldName); [EOL]     writeString(value); [EOL] } <line_num>: 165,171
