protected DataFormatMatcher(InputStream in, byte[] buffered, int bufferedStart, int bufferedLength, JsonFactory match, MatchStrength strength)
public boolean hasMatch()
public MatchStrength getMatchStrength()
public JsonFactory getMatch()
public String getMatchedFormatName()
public JsonParser createParserWithMatch() throws IOException
public InputStream getDataStream()
InputStream _originalStream
byte[] _bufferedData
int _bufferedStart
int _bufferedLength
JsonFactory _match
MatchStrength _matchStrength
