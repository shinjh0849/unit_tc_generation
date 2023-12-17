public PolynomialFunctionLagrangeForm(double[] x, double[] y) throws DimensionMismatchException, NumberIsTooSmallException, NonMonotonicSequenceException
public double value(double z)
public int degree()
public double[] getInterpolatingPoints()
public double[] getInterpolatingValues()
public double[] getCoefficients()
public static double evaluate(double[] x, double[] y, double z) throws DimensionMismatchException, NumberIsTooSmallException, NonMonotonicSequenceException
private static double evaluateInternal(double[] x, double[] y, double z)
protected void computeCoefficients()
public static boolean verifyInterpolationArray(double[] x, double[] y, boolean abort) throws DimensionMismatchException, NumberIsTooSmallException, NonMonotonicSequenceException
double[] coefficients
double[] x
double[] y
boolean coefficientsComputed
