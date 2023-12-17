public KeplerHandler(TestProblem3 pb)
public int getDimension()
public void computeDerivatives(double t, double[] y, double[] yDot)
public void init(double t0, double[] y0, double t)
public void resetState(double t, double[] y)
public double g(double t, double[] y)
public Action eventOccurred(double t, double[] y, boolean increasing)
public void testMissedEndEvent() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testSanityChecks() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testDecreasingSteps() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testSmallStep() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testBigStep() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testBackward() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testKepler() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void init(double t0, double[] y0, double t)
public void handleStep(StepInterpolator interpolator, boolean isLast) throws MaxCountExceededException
public void handleStep(StepInterpolator interpolator, boolean isLast)
public void init(double t0, double[] y0, double t)
public void computeDerivatives(double t, double[] y, double[] dot)
public int getDimension()
public void testStepSize() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
