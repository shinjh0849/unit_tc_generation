public UniformRealDistribution()
public UniformRealDistribution(double lower, double upper) throws NumberIsTooLargeException
public UniformRealDistribution(double lower, double upper, double inverseCumAccuracy) throws NumberIsTooLargeException
public UniformRealDistribution(RandomGenerator rng, double lower, double upper, double inverseCumAccuracy)
public UniformRealDistribution(RandomGenerator rng, double lower, double upper) throws NumberIsTooLargeException
public double density(double x)
public double cumulativeProbability(double x)
public double inverseCumulativeProbability(final double p) throws OutOfRangeException
public double getNumericalMean()
public double getNumericalVariance()
public double getSupportLowerBound()
public double getSupportUpperBound()
public boolean isSupportLowerBoundInclusive()
public boolean isSupportUpperBoundInclusive()
public boolean isSupportConnected()
public double sample()
double DEFAULT_INVERSE_ABSOLUTE_ACCURACY=Optional[1e-9]
long serialVersionUID=Optional[20120109L]
double lower
double upper
