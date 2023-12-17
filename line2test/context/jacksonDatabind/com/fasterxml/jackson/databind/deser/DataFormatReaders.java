public DataFormatReaders(ObjectReader... detectors)
public DataFormatReaders(Collection<ObjectReader> detectors)
private DataFormatReaders(ObjectReader[] detectors, MatchStrength optMatch, MatchStrength minMatch, int maxInputLookahead)
public AccessorForReader(InputStream in, byte[] buffer)
public AccessorForReader(byte[] inputDocument)
public AccessorForReader(byte[] inputDocument, int start, int len)
protected Match(InputStream in, byte[] buffered, int bufferedStart, int bufferedLength, ObjectReader match, MatchStrength strength)
public DataFormatReaders withOptimalMatch(MatchStrength optMatch)
public DataFormatReaders withMinimalMatch(MatchStrength minMatch)
public DataFormatReaders with(ObjectReader[] readers)
public DataFormatReaders withMaxInputLookahead(int lookaheadBytes)
public DataFormatReaders with(DeserializationConfig config)
public DataFormatReaders withType(JavaType type)
public Match findFormat(InputStream in) throws IOException
public Match findFormat(byte[] fullInputData) throws IOException
public Match findFormat(byte[] fullInputData, int offset, int len) throws IOException
public String toString()
private Match _findFormat(AccessorForReader acc) throws IOException
public Match createMatcher(ObjectReader match, MatchStrength matchStrength)
public boolean hasMatch()
public MatchStrength getMatchStrength()
public ObjectReader getReader()
public String getMatchedFormatName()
public JsonParser createParserWithMatch() throws IOException
public InputStream getDataStream()
int DEFAULT_MAX_INPUT_LOOKAHEAD=Optional[64]
ObjectReader[] _readers
MatchStrength _optimalMatch
MatchStrength _minimalMatch
int _maxInputLookahead
