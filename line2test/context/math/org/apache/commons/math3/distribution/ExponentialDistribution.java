public ExponentialDistribution(double mean)
public ExponentialDistribution(double mean, double inverseCumAccuracy)
public ExponentialDistribution(RandomGenerator rng, double mean, double inverseCumAccuracy) throws NotStrictlyPositiveException
public double getMean()
public double density(double x)
public double cumulativeProbability(double x)
public double inverseCumulativeProbability(double p) throws OutOfRangeException
public double sample()
protected double getSolverAbsoluteAccuracy()
public double getNumericalMean()
public double getNumericalVariance()
public double getSupportLowerBound()
public double getSupportUpperBound()
public boolean isSupportLowerBoundInclusive()
public boolean isSupportUpperBoundInclusive()
public boolean isSupportConnected()
double DEFAULT_INVERSE_ABSOLUTE_ACCURACY=Optional[1e-9]
long serialVersionUID=Optional[2401296428283614780L]
double[] EXPONENTIAL_SA_QI
double mean
double solverAbsoluteAccuracy
