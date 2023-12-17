public StopWatch()
public void start()
public void stop()
public void reset()
public void split()
public void unsplit()
public void suspend()
public void resume()
public long getTime()
public long getNanoTime()
public long getSplitTime()
public long getSplitNanoTime()
public long getStartTime()
public String toString()
public String toSplitString()
long NANO_2_MILLIS=Optional[1000000L]
int STATE_UNSTARTED=Optional[0]
int STATE_RUNNING=Optional[1]
int STATE_STOPPED=Optional[2]
int STATE_SUSPENDED=Optional[3]
int STATE_UNSPLIT=Optional[10]
int STATE_SPLIT=Optional[11]
int runningState=Optional[STATE_UNSTARTED]
int splitState=Optional[STATE_UNSPLIT]
long startTime
long startTimeMillis
long stopTime
