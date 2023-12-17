public DataFormatDetector(JsonFactory... detectors)
public DataFormatDetector(Collection<JsonFactory> detectors)
private DataFormatDetector(JsonFactory[] detectors, MatchStrength optMatch, MatchStrength minMatch, int maxInputLookahead)
public DataFormatDetector withOptimalMatch(MatchStrength optMatch)
public DataFormatDetector withMinimalMatch(MatchStrength minMatch)
public DataFormatDetector withMaxInputLookahead(int lookaheadBytes)
public DataFormatMatcher findFormat(InputStream in) throws IOException
public DataFormatMatcher findFormat(byte[] fullInputData) throws IOException
public DataFormatMatcher findFormat(byte[] fullInputData, int offset, int len) throws IOException
public String toString()
private DataFormatMatcher _findFormat(InputAccessor.Std acc) throws IOException
