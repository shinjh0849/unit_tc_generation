public ParetoDistribution()
public ParetoDistribution(double scale, double shape) throws NotStrictlyPositiveException
public ParetoDistribution(double scale, double shape, double inverseCumAccuracy) throws NotStrictlyPositiveException
public ParetoDistribution(RandomGenerator rng, double scale, double shape, double inverseCumAccuracy) throws NotStrictlyPositiveException
public double getScale()
public double getShape()
public double density(double x)
public double cumulativeProbability(double x)
public double cumulativeProbability(double x0, double x1) throws NumberIsTooLargeException
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
long serialVersionUID=Optional[20130424]
double scale
double shape
double solverAbsoluteAccuracy
