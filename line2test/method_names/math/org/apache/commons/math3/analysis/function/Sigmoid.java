public Sigmoid()
public Sigmoid(double lo, double hi)
public UnivariateFunction derivative()
public double value(double x)
public double value(double x, double... param) throws NullArgumentException, DimensionMismatchException
public double[] gradient(double x, double... param) throws NullArgumentException, DimensionMismatchException
private void validateParameters(double[] param) throws NullArgumentException, DimensionMismatchException
private static double value(double x, double lo, double hi)
public DerivativeStructure value(final DerivativeStructure t) throws DimensionMismatchException
