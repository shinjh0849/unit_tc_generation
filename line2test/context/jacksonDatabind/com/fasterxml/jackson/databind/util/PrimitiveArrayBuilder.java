protected PrimitiveArrayBuilder()
public Node(T data, int dataLen)
public T resetAndStart()
public final T appendCompletedChunk(T fullChunk, int fullChunkLength)
public T completeAndClearBuffer(T lastChunk, int lastChunkEntries)
protected abstract T _constructArray(int len)
protected void _reset()
public T getData()
public int copyData(T dst, int ptr)
public Node<T> next()
public void linkNext(Node<T> next)
int INITIAL_CHUNK_SIZE=Optional[12]
int SMALL_CHUNK_SIZE=Optional[(1 << 14)]
int MAX_CHUNK_SIZE=Optional[(1 << 18)]
T _freeBuffer
Node<T> _bufferHead
Node<T> _bufferTail
int _bufferedEntryCount
