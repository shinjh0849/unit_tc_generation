public Gaussian(double norm, double mean, double sigma) throws NotStrictlyPositiveException
public Gaussian(double mean, double sigma) throws NotStrictlyPositiveException
public Gaussian()
public double value(double x)
public UnivariateFunction derivative()
public double value(double x, double... param) throws NullArgumentException, DimensionMismatchException, NotStrictlyPositiveException
public double[] gradient(double x, double... param) throws NullArgumentException, DimensionMismatchException, NotStrictlyPositiveException
private void validateParameters(double[] param) throws NullArgumentException, DimensionMismatchException, NotStrictlyPositiveException
private static double value(double xMinusMean, double norm, double i2s2)
public DerivativeStructure value(final DerivativeStructure t) throws DimensionMismatchException
double mean
double is
double i2s2
double norm
