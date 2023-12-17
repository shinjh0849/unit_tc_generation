protected BackgroundInitializer() { [EOL]     this(null); [EOL] } <line_num>: 101,103
protected BackgroundInitializer(final ExecutorService exec) { [EOL]     setExternalExecutor(exec); [EOL] } <line_num>: 115,117
public InitializationTask(final ExecutorService exec) { [EOL]     execFinally = exec; [EOL] } <line_num>: 314,316
public final synchronized ExecutorService getExternalExecutor() { [EOL]     return externalExecutor; [EOL] } <line_num>: 124,126
public synchronized boolean isStarted() { [EOL]     return future != null; [EOL] } <line_num>: 135,137
public final synchronized void setExternalExecutor(final ExecutorService externalExecutor) { [EOL]     if (isStarted()) { [EOL]         throw new IllegalStateException("Cannot set ExecutorService after start()!"); [EOL]     } [EOL]     this.externalExecutor = externalExecutor; [EOL] } <line_num>: 153,161
public synchronized boolean start() { [EOL]     if (!isStarted()) { [EOL]         ExecutorService tempExec; [EOL]         executor = getExternalExecutor(); [EOL]         if (executor == null) { [EOL]             executor = tempExec = createExecutor(); [EOL]         } else { [EOL]             tempExec = null; [EOL]         } [EOL]         future = executor.submit(createTask(tempExec)); [EOL]         return true; [EOL]     } [EOL]     return false; [EOL] } <line_num>: 173,193
@Override [EOL] public T get() throws ConcurrentException { [EOL]     try { [EOL]         return getFuture().get(); [EOL]     } catch (final ExecutionException execex) { [EOL]         ConcurrentUtils.handleCause(execex); [EOL]         return null; [EOL]     } catch (final InterruptedException iex) { [EOL]         Thread.currentThread().interrupt(); [EOL]         throw new ConcurrentException(iex); [EOL]     } [EOL] } <line_num>: 209,221
public synchronized Future<T> getFuture() { [EOL]     if (future == null) { [EOL]         throw new IllegalStateException("start() must be called first!"); [EOL]     } [EOL]     return future; [EOL] } <line_num>: 231,237
protected synchronized final ExecutorService getActiveExecutor() { [EOL]     return executor; [EOL] } <line_num>: 248,250
protected int getTaskCount() { [EOL]     return 1; [EOL] } <line_num>: 263,265
protected abstract T initialize() throws Exception; <line_num>: 277,277
private Callable<T> createTask(final ExecutorService execDestroy) { [EOL]     return new InitializationTask(execDestroy); [EOL] } <line_num>: 290,292
private ExecutorService createExecutor() { [EOL]     return Executors.newFixedThreadPool(getTaskCount()); [EOL] } <line_num>: 300,302
@Override [EOL] public T call() throws Exception { [EOL]     try { [EOL]         return initialize(); [EOL]     } finally { [EOL]         if (execFinally != null) { [EOL]             execFinally.shutdown(); [EOL]         } [EOL]     } [EOL] } <line_num>: 324,333
