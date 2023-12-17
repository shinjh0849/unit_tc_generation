protected BackgroundInitializer()
protected BackgroundInitializer(final ExecutorService exec)
public InitializationTask(final ExecutorService exec)
public final synchronized ExecutorService getExternalExecutor()
public synchronized boolean isStarted()
public final synchronized void setExternalExecutor(final ExecutorService externalExecutor)
public synchronized boolean start()
public T get() throws ConcurrentException
public synchronized Future<T> getFuture()
protected final synchronized ExecutorService getActiveExecutor()
protected int getTaskCount()
protected abstract T initialize() throws Exception
private Callable<T> createTask(final ExecutorService execDestroy)
private ExecutorService createExecutor()
public T call() throws Exception
