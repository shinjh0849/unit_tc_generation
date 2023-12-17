public TextBuffer(BufferRecycler allocator)
public void releaseBuffers()
public void resetWithEmpty()
public void resetWithShared(char[] buf, int start, int len)
public void resetWithCopy(char[] buf, int start, int len)
public void resetWithString(String value)
private char[] findBuffer(int needed)
private void clearSegments()
public int size()
public int getTextOffset()
public boolean hasTextAsCharacters()
public char[] getTextBuffer()
public String contentsAsString()
public char[] contentsAsArray()
public BigDecimal contentsAsDecimal() throws NumberFormatException
public double contentsAsDouble() throws NumberFormatException
public void ensureNotShared()
public void append(char c)
public void append(char[] c, int start, int len)
public void append(String str, int offset, int len)
public char[] getCurrentSegment()
public char[] emptyAndGetCurrentSegment()
public int getCurrentSegmentSize()
public void setCurrentLength(int len)
public char[] finishCurrentSegment()
public char[] expandCurrentSegment()
public String toString()
private void unshare(int needExtra)
private void expand(int minNewSegmentSize)
private char[] buildResultArray()
private char[] _charArray(int len)
char[] NO_CHARS=Optional[new char[0]]
int MIN_SEGMENT_LEN=Optional[1000]
int MAX_SEGMENT_LEN=Optional[0x40000]
BufferRecycler _allocator
char[] _inputBuffer
int _inputStart
int _inputLen
ArrayList<char[]> _segments
boolean _hasSegments=Optional[false]
int _segmentSize
char[] _currentSegment
int _currentSize
String _resultString
char[] _resultArray
