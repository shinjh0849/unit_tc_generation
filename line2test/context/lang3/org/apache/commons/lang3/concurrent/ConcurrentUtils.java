private ConcurrentUtils()
 ConstantFuture(final T value)
public static ConcurrentException extractCause(final ExecutionException ex)
public static ConcurrentRuntimeException extractCauseUnchecked(final ExecutionException ex)
public static void handleCause(final ExecutionException ex) throws ConcurrentException
public static void handleCauseUnchecked(final ExecutionException ex)
 static Throwable checkedException(final Throwable ex)
private static void throwCause(final ExecutionException ex)
public static T initialize(final ConcurrentInitializer<T> initializer) throws ConcurrentException
public static T initializeUnchecked(final ConcurrentInitializer<T> initializer)
public static V putIfAbsent(final ConcurrentMap<K, V> map, final K key, final V value)
public static V createIfAbsent(final ConcurrentMap<K, V> map, final K key, final ConcurrentInitializer<V> init) throws ConcurrentException
public static V createIfAbsentUnchecked(final ConcurrentMap<K, V> map, final K key, final ConcurrentInitializer<V> init)
public static Future<T> constantFuture(final T value)
public boolean isDone()
public T get()
public T get(final long timeout, final TimeUnit unit)
public boolean isCancelled()
public boolean cancel(final boolean mayInterruptIfRunning)
