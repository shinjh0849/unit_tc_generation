public PolynomialFunctionNewtonForm(double[] a, double[] c) throws NullArgumentException, NoDataException, DimensionMismatchException
public double value(double z)
public DerivativeStructure value(final DerivativeStructure t)
public int degree()
public double[] getNewtonCoefficients()
public double[] getCenters()
public double[] getCoefficients()
public static double evaluate(double[] a, double[] c, double z) throws NullArgumentException, DimensionMismatchException, NoDataException
protected void computeCoefficients()
protected static void verifyInputArray(double[] a, double[] c) throws NullArgumentException, NoDataException, DimensionMismatchException
double[] coefficients
double[] c
double[] a
boolean coefficientsComputed
