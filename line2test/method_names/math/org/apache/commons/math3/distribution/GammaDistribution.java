public GammaDistribution(double shape, double scale) throws NotStrictlyPositiveException
public GammaDistribution(double shape, double scale, double inverseCumAccuracy) throws NotStrictlyPositiveException
public GammaDistribution(RandomGenerator rng, double shape, double scale, double inverseCumAccuracy) throws NotStrictlyPositiveException
public double getAlpha()
public double getShape()
public double getBeta()
public double getScale()
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
public double sample()
