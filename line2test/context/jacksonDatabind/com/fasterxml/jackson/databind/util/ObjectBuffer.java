public ObjectBuffer()
public Node(Object[] data)
public Object[] resetAndStart()
public Object[] appendCompletedChunk(Object[] fullChunk)
public Object[] completeAndClearBuffer(Object[] lastChunk, int lastChunkEntries)
public T[] completeAndClearBuffer(Object[] lastChunk, int lastChunkEntries, Class<T> componentType)
public void completeAndClearBuffer(Object[] lastChunk, int lastChunkEntries, List<Object> resultList)
public int initialCapacity()
public int bufferedSize()
protected void _reset()
protected final void _copyTo(Object resultArray, int totalSize, Object[] lastChunk, int lastChunkEntries)
public Object[] getData()
public Node next()
public void linkNext(Node next)
int INITIAL_CHUNK_SIZE=Optional[12]
int SMALL_CHUNK_SIZE=Optional[(1 << 14)]
int MAX_CHUNK_SIZE=Optional[(1 << 18)]
Node _bufferHead
Node _bufferTail
int _bufferedEntryCount
Object[] _freeBuffer
