public ByteArrayBuilder()
public ByteArrayBuilder(BufferRecycler br)
public ByteArrayBuilder(int firstBlockSize)
public ByteArrayBuilder(BufferRecycler br, int firstBlockSize)
public void reset()
public void release()
public void append(int i)
public void appendTwoBytes(int b16)
public void appendThreeBytes(int b24)
public byte[] toByteArray()
public byte[] resetAndGetFirstSegment()
public byte[] finishCurrentSegment()
public byte[] completeAndCoalesce(int lastBlockLength)
public byte[] getCurrentSegment()
public void setCurrentSegmentLength(int len)
public int getCurrentSegmentLength()
public void write(byte[] b)
public void write(byte[] b, int off, int len)
public void write(int b)
public void close()
public void flush()
private void _allocMore()
byte[] NO_BYTES=Optional[new byte[0]]
int INITIAL_BLOCK_SIZE=Optional[500]
int MAX_BLOCK_SIZE=Optional[(1 << 18)]
int DEFAULT_BLOCK_ARRAY_SIZE=Optional[40]
BufferRecycler _bufferRecycler
LinkedList<byte[]> _pastBlocks=Optional[new LinkedList<byte[]>()]
int _pastLen
byte[] _currBlock
int _currBlockPtr
