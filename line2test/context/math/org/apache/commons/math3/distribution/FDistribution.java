public FDistribution(double numeratorDegreesOfFreedom, double denominatorDegreesOfFreedom) throws NotStrictlyPositiveException
public FDistribution(double numeratorDegreesOfFreedom, double denominatorDegreesOfFreedom, double inverseCumAccuracy) throws NotStrictlyPositiveException
public FDistribution(RandomGenerator rng, double numeratorDegreesOfFreedom, double denominatorDegreesOfFreedom, double inverseCumAccuracy) throws NotStrictlyPositiveException
public double density(double x)
public double cumulativeProbability(double x)
public double getNumeratorDegreesOfFreedom()
public double getDenominatorDegreesOfFreedom()
protected double getSolverAbsoluteAccuracy()
public double getNumericalMean()
public double getNumericalVariance()
protected double calculateNumericalVariance()
public double getSupportLowerBound()
public double getSupportUpperBound()
public boolean isSupportLowerBoundInclusive()
public boolean isSupportUpperBoundInclusive()
public boolean isSupportConnected()
double DEFAULT_INVERSE_ABSOLUTE_ACCURACY=Optional[1e-9]
long serialVersionUID=Optional[-8516354193418641566L]
double numeratorDegreesOfFreedom
double denominatorDegreesOfFreedom
double solverAbsoluteAccuracy
double numericalVariance=Optional[Double.NaN]
boolean numericalVarianceIsCalculated=Optional[false]
