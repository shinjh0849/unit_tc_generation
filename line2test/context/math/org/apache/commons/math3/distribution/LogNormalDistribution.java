public LogNormalDistribution()
public LogNormalDistribution(double scale, double shape) throws NotStrictlyPositiveException
public LogNormalDistribution(double scale, double shape, double inverseCumAccuracy) throws NotStrictlyPositiveException
public LogNormalDistribution(RandomGenerator rng, double scale, double shape, double inverseCumAccuracy) throws NotStrictlyPositiveException
public double getScale()
public double getShape()
public double density(double x)
public double cumulativeProbability(double x)
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
long serialVersionUID=Optional[20120112]
double SQRT2PI=Optional[FastMath.sqrt(2 * FastMath.PI)]
double SQRT2=Optional[FastMath.sqrt(2.0)]
double scale
double shape
double solverAbsoluteAccuracy
