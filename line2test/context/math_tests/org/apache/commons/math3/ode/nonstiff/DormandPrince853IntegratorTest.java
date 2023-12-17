public SchedulingChecker(int index)
public KeplerHandler(TestProblem3 pb)
public VariableHandler()
public int getDimension()
public void computeDerivatives(double t, double[] y, double[] yDot)
public void init(double t0, double[] y0, double t)
public void resetState(double t, double[] y)
public double g(double t, double[] y)
public Action eventOccurred(double t, double[] y, boolean increasing)
public void testMissedEndEvent() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testDimensionCheck() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testNullIntervalCheck() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testMinStep() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testIncreasingTolerance() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public int getDimension()
public void computeDerivatives(double t, double[] y, double[] yDot)
public void testTooLargeFirstStep() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testBackward() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testEvents() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testKepler() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testVariableSteps() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testUnstableDerivative() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public int getDimension()
public void computeDerivatives(double t, double[] y, double[] yDot)
public void testEventsScheduling()
public void init(double t0, double[] y0, double t)
public void handleStep(StepInterpolator interpolator, boolean isLast)
public double g(double t, double[] y)
public Action eventOccurred(double t, double[] y, boolean increasing)
public void resetState(double t, double[] y)
public void init(double t0, double[] y0, double t)
public void handleStep(StepInterpolator interpolator, boolean isLast) throws MaxCountExceededException
public void init(double t0, double[] y0, double t)
public void handleStep(StepInterpolator interpolator, boolean isLast)
