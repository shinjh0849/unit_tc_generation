public BetaDistribution(double alpha, double beta)
public BetaDistribution(double alpha, double beta, double inverseCumAccuracy)
public BetaDistribution(RandomGenerator rng, double alpha, double beta, double inverseCumAccuracy)
public double getAlpha()
public double getBeta()
private void recomputeZ()
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
long serialVersionUID=Optional[-1221965979403477668L]
double alpha
double beta
double z
double solverAbsoluteAccuracy
