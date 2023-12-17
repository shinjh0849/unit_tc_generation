public Brusselator(double b)
public ParamBrusselator(double b)
public Circle(double[] y0, double cx, double cy, double omega)
public ParameterizedCircle(double[] y0, double cx, double cy, double omega)
public void testLowAccuracyExternalDifferentiation() throws NumberIsTooSmallException, DimensionMismatchException, MaxCountExceededException, NoBracketingException
public void testHighAccuracyExternalDifferentiation() throws NumberIsTooSmallException, DimensionMismatchException, MaxCountExceededException, NoBracketingException, UnknownParameterException
public void testInternalDifferentiation() throws NumberIsTooSmallException, DimensionMismatchException, MaxCountExceededException, NoBracketingException, UnknownParameterException, MismatchedEquations
public void testAnalyticalDifferentiation() throws MaxCountExceededException, DimensionMismatchException, NumberIsTooSmallException, NoBracketingException, UnknownParameterException, MismatchedEquations
public void testFinalResult() throws MaxCountExceededException, DimensionMismatchException, NumberIsTooSmallException, NoBracketingException, UnknownParameterException, MismatchedEquations
public void testParameterizable() throws MaxCountExceededException, DimensionMismatchException, NumberIsTooSmallException, NoBracketingException, UnknownParameterException, MismatchedEquations
public int getDimension()
public void computeDerivatives(double t, double[] y, double[] yDot)
public void computeMainStateJacobian(double t, double[] y, double[] yDot, double[][] dFdY)
public void computeParameterJacobian(double t, double[] y, double[] yDot, String paramName, double[] dFdP)
public double dYdP0()
public double dYdP1()
public int getDimension()
public double getParameter(final String name) throws UnknownParameterException
public void setParameter(final String name, final double value) throws UnknownParameterException
public void computeDerivatives(double t, double[] y, double[] yDot)
public double dYdP0()
public double dYdP1()
public int getDimension()
public void computeDerivatives(double t, double[] y, double[] yDot)
public void computeMainStateJacobian(double t, double[] y, double[] yDot, double[][] dFdY)
public void computeParameterJacobian(double t, double[] y, double[] yDot, String paramName, double[] dFdP) throws UnknownParameterException
public double[] exactY(double t)
public double[][] exactDyDy0(double t)
public double[] exactDyDcx(double t)
public double[] exactDyDcy(double t)
public double[] exactDyDom(double t)
public int getDimension()
public void computeDerivatives(double t, double[] y, double[] yDot)
public double getParameter(final String name) throws UnknownParameterException
public void setParameter(final String name, final double value) throws UnknownParameterException
public double[] exactY(double t)
public double[][] exactDyDy0(double t)
public double[] exactDyDcx(double t)
public double[] exactDyDcy(double t)
public double[] exactDyDom(double t)
