public TDistribution(double degreesOfFreedom) throws NotStrictlyPositiveException
public TDistribution(double degreesOfFreedom, double inverseCumAccuracy) throws NotStrictlyPositiveException
public TDistribution(RandomGenerator rng, double degreesOfFreedom, double inverseCumAccuracy) throws NotStrictlyPositiveException
public double getDegreesOfFreedom()
public double density(double x)
public double cumulativeProbability(double x)
protected double getSolverAbsoluteAccuracy()
public double getNumericalMean()
public double getNumericalVariance()
public double getSupportLowerBound()
public double getSupportUpperBound()
public boolean isSupportLowerBoundInclusive()
public boolean isSupportUpperBoundInclusive()
public boolean isSupportConnected()
double DEFAULT_INVERSE_ABSOLUTE_ACCURACY=Optional[1e-9]
long serialVersionUID=Optional[-5852615386664158222L]
double degreesOfFreedom
double solverAbsoluteAccuracy
