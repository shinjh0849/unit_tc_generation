public GaussIntegrator legendre(int numberOfPoints)
public GaussIntegrator legendre(int numberOfPoints, double lowerBound, double upperBound) throws NotStrictlyPositiveException
public GaussIntegrator legendreHighPrecision(int numberOfPoints) throws NotStrictlyPositiveException
public GaussIntegrator legendreHighPrecision(int numberOfPoints, double lowerBound, double upperBound) throws NotStrictlyPositiveException
public SymmetricGaussIntegrator hermite(int numberOfPoints)
private static Pair<double[], double[]> getRule(BaseRuleFactory<? extends Number> factory, int numberOfPoints) throws NotStrictlyPositiveException, DimensionMismatchException
private static Pair<double[], double[]> transform(Pair<double[], double[]> rule, double a, double b)
