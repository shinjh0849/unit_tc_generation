public NormalDistribution()
public NormalDistribution(double mean, double sd) throws NotStrictlyPositiveException
public NormalDistribution(double mean, double sd, double inverseCumAccuracy) throws NotStrictlyPositiveException
public NormalDistribution(RandomGenerator rng, double mean, double sd, double inverseCumAccuracy) throws NotStrictlyPositiveException
public double getMean()
public double getStandardDeviation()
public double density(double x)
public double cumulativeProbability(double x)
public double inverseCumulativeProbability(final double p) throws OutOfRangeException
public double cumulativeProbability(double x0, double x1) throws NumberIsTooLargeException
public double probability(double x0, double x1) throws NumberIsTooLargeException
protected double getSolverAbsoluteAccuracy()
public double getNumericalMean()
public double getNumericalVariance()
public double getSupportLowerBound()
public double getSupportUpperBound()
public boolean isSupportLowerBoundInclusive()
public boolean isSupportUpperBoundInclusive()
public boolean isSupportConnected()
public double sample()
double DEFAULT_INVERSE_ABSOLUTE_ACCURACY=Optional[1e-9]
long serialVersionUID=Optional[8589540077390120676L]
double SQRT2PI=Optional[FastMath.sqrt(2 * FastMath.PI)]
double SQRT2=Optional[FastMath.sqrt(2.0)]
double mean
double standardDeviation
double solverAbsoluteAccuracy
