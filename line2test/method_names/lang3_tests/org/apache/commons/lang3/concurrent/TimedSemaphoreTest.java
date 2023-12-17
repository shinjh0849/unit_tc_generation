public TimedSemaphoreTestImpl(final long timePeriod, final TimeUnit timeUnit, final int limit)
public TimedSemaphoreTestImpl(final ScheduledExecutorService service, final long timePeriod, final TimeUnit timeUnit, final int limit)
public SemaphoreThread(final TimedSemaphore b, final CountDownLatch l, final int c, final int lc)
public void testInit()
public void testInitInvalidPeriod()
public void testInitDefaultService()
public void testStartTimer() throws InterruptedException
public void testShutdownOwnExecutor()
public void testShutdownSharedExecutorNoTask()
private void prepareStartTimer(final ScheduledExecutorService service, final ScheduledFuture<?> future)
public void testShutdownSharedExecutorTask() throws InterruptedException
public void testShutdownMultipleTimes() throws InterruptedException
public void testAcquireLimit() throws InterruptedException
public void testAcquireMultipleThreads() throws InterruptedException
public void testAcquireNoLimit() throws InterruptedException
public void testPassAfterShutdown() throws InterruptedException
public void testAcquireMultiplePeriods() throws InterruptedException
public void testGetAverageCallsPerPeriod() throws InterruptedException
public void testGetAvailablePermits() throws InterruptedException
public int getPeriodEnds()
public synchronized void acquire() throws InterruptedException
protected synchronized void endOfPeriod()
protected ScheduledFuture<?> startTimer()
public void run()
