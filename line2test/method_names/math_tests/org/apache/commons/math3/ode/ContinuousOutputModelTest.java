public ContinuousOutputModelTest()
public void testBoundaries() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void testRandomAccess() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException
public void computeDerivatives(double t, double[] y, double[] dot)
public int getDimension()
public void testModelsMerging() throws MaxCountExceededException, MathIllegalArgumentException
public void testErrorConditions() throws MaxCountExceededException, MathIllegalArgumentException
private boolean checkAppendError(ContinuousOutputModel cm, double t0, double[] y0, double t1) throws MaxCountExceededException, MathIllegalArgumentException
private StepInterpolator buildInterpolator(double t0, double[] y0, double t1)
public void checkValue(double value, double reference)
public void setUp()
public void tearDown()
