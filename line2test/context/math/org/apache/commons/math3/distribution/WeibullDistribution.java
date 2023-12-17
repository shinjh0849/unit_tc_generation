public WeibullDistribution(double alpha, double beta) throws NotStrictlyPositiveException
public WeibullDistribution(double alpha, double beta, double inverseCumAccuracy)
public WeibullDistribution(RandomGenerator rng, double alpha, double beta, double inverseCumAccuracy) throws NotStrictlyPositiveException
public double getShape()
public double getScale()
public double density(double x)
public double cumulativeProbability(double x)
public double inverseCumulativeProbability(double p)
protected double getSolverAbsoluteAccuracy()
public double getNumericalMean()
protected double calculateNumericalMean()
public double getNumericalVariance()
protected double calculateNumericalVariance()
public double getSupportLowerBound()
public double getSupportUpperBound()
public boolean isSupportLowerBoundInclusive()
public boolean isSupportUpperBoundInclusive()
public boolean isSupportConnected()
double DEFAULT_INVERSE_ABSOLUTE_ACCURACY=Optional[1e-9]
long serialVersionUID=Optional[8589540077390120676L]
double shape
double scale
double solverAbsoluteAccuracy
double numericalMean=Optional[Double.NaN]
boolean numericalMeanIsCalculated=Optional[false]
double numericalVariance=Optional[Double.NaN]
boolean numericalVarianceIsCalculated=Optional[false]
