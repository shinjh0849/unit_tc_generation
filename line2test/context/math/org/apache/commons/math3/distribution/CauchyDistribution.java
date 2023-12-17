public CauchyDistribution()
public CauchyDistribution(double median, double scale)
public CauchyDistribution(double median, double scale, double inverseCumAccuracy)
public CauchyDistribution(RandomGenerator rng, double median, double scale, double inverseCumAccuracy)
public double cumulativeProbability(double x)
public double getMedian()
public double getScale()
public double density(double x)
public double inverseCumulativeProbability(double p) throws OutOfRangeException
protected double getSolverAbsoluteAccuracy()
public double getNumericalMean()
public double getNumericalVariance()
public double getSupportLowerBound()
public double getSupportUpperBound()
public boolean isSupportLowerBoundInclusive()
public boolean isSupportUpperBoundInclusive()
public boolean isSupportConnected()
double DEFAULT_INVERSE_ABSOLUTE_ACCURACY=Optional[1e-9]
long serialVersionUID=Optional[8589540077390120676L]
double median
double scale
double solverAbsoluteAccuracy
