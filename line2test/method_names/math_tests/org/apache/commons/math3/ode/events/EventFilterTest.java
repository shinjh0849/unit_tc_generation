public Event(boolean expectDecreasing, boolean expectIncreasing)
public void testHistoryIncreasingForward()
public void testHistoryIncreasingBackward()
public void testHistoryDecreasingForward()
public void testHistoryDecreasingBackward()
public void testHistory(FilterType type, double t0, double t1, double refSwitch, double signEven)
public void testIncreasingOnly() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testDecreasingOnly() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testTwoOppositeFilters() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public int getDimension()
public void computeDerivatives(double t, double[] y, double[] yDot)
public int getEventCount()
public void init(double t0, double[] y0, double t)
public double g(double t, double[] y)
public Action eventOccurred(double t, double[] y, boolean increasing)
public void resetState(double t, double[] y)
