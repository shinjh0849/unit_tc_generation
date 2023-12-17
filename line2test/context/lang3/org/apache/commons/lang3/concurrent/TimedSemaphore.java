public TimedSemaphore(final long timePeriod, final TimeUnit timeUnit, final int limit)
public TimedSemaphore(final ScheduledExecutorService service, final long timePeriod, final TimeUnit timeUnit, final int limit)
public final synchronized int getLimit()
public final synchronized void setLimit(final int limit)
public synchronized void shutdown()
public synchronized boolean isShutdown()
public synchronized void acquire() throws InterruptedException
public synchronized int getLastAcquiresPerPeriod()
public synchronized int getAcquireCount()
public synchronized int getAvailablePermits()
public synchronized double getAverageCallsPerPeriod()
public long getPeriod()
public TimeUnit getUnit()
protected ScheduledExecutorService getExecutorService()
public void run()
protected ScheduledFuture<?> startTimer()
 synchronized void endOfPeriod()
int NO_LIMIT=Optional[0]
int THREAD_POOL_SIZE=Optional[1]
ScheduledExecutorService executorService
long period
TimeUnit unit
boolean ownExecutor
ScheduledFuture<?> task
long totalAcquireCount
long periodCount
int limit
int acquireCount
int lastCallsPerPeriod
boolean shutdown
