public MappingJsonFactory() { [EOL]     this(null); [EOL] } <line_num>: 37,40
public MappingJsonFactory(ObjectMapper mapper) { [EOL]     super(mapper); [EOL]     if (mapper == null) { [EOL]         setCodec(new ObjectMapper(this)); [EOL]     } [EOL] } <line_num>: 42,48
@Override [EOL] public final ObjectMapper getCodec() { [EOL]     return (ObjectMapper) _objectCodec; [EOL] } <line_num>: 54,55
@Override [EOL] public JsonFactory copy() { [EOL]     _checkInvalidCopy(MappingJsonFactory.class); [EOL]     return new MappingJsonFactory(null); [EOL] } <line_num>: 58,64
@Override [EOL] public String getFormatName() { [EOL]     return FORMAT_NAME_JSON; [EOL] } <line_num>: 75,82
@Override [EOL] public MatchStrength hasFormat(InputAccessor acc) throws IOException { [EOL]     if (getClass() == MappingJsonFactory.class) { [EOL]         return hasJSONFormat(acc); [EOL]     } [EOL]     return null; [EOL] } <line_num>: 87,94
