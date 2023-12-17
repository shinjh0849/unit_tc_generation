public Logit()
public Logit(double lo, double hi)
public double value(double x) throws OutOfRangeException
public UnivariateFunction derivative()
public double value(double x, double... param) throws NullArgumentException, DimensionMismatchException
public double[] gradient(double x, double... param) throws NullArgumentException, DimensionMismatchException
private void validateParameters(double[] param) throws NullArgumentException, DimensionMismatchException
private static double value(double x, double lo, double hi) throws OutOfRangeException
public DerivativeStructure value(final DerivativeStructure t) throws OutOfRangeException
