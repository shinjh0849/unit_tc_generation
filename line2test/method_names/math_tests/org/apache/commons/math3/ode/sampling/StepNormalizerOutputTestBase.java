protected abstract double getStart()
protected abstract double getEnd()
protected abstract double[] getExpInc()
protected abstract double[] getExpIncRev()
protected abstract double[] getExpMul()
protected abstract double[] getExpMulRev()
protected abstract int[][] getO()
private double[] getArray(double[] a, int offsetL, int offsetR)
public void testIncNeither() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testIncNeitherRev() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testIncFirst() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testIncFirstRev() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testIncLast() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testIncLastRev() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testIncBoth() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testIncBothRev() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testMulNeither() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testMulNeitherRev() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testMulFirst() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testMulFirstRev() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testMulLast() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testMulLastRev() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testMulBoth() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testMulBothRev() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
private void doTest(StepNormalizerMode mode, StepNormalizerBounds bounds, double[] expected, boolean reverse) throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public int getDimension()
public void computeDerivatives(double t, double[] y, double[] yDot)
public void init(double t0, double[] y0, double t)
public void handleStep(double t, double[] y, double[] yDot, boolean isLast)
