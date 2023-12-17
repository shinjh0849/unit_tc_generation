public Incrementor()
public Incrementor(int max)
public Incrementor(int max, MaxCountExceededCallback cb) throws NullArgumentException
public void trigger(int max) throws MaxCountExceededException
public void setMaximalCount(int max)
public int getMaximalCount()
public int getCount()
public boolean canIncrement()
public void incrementCount(int value) throws MaxCountExceededException
public void incrementCount() throws MaxCountExceededException
public void resetCount()
 void trigger(int maximalCount) throws MaxCountExceededException
