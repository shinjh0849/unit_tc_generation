public PoissonDistribution(double p) throws NotStrictlyPositiveException
public PoissonDistribution(double p, double epsilon, int maxIterations) throws NotStrictlyPositiveException
public PoissonDistribution(RandomGenerator rng, double p, double epsilon, int maxIterations) throws NotStrictlyPositiveException
public PoissonDistribution(double p, double epsilon) throws NotStrictlyPositiveException
public PoissonDistribution(double p, int maxIterations)
public double getMean()
public double probability(int x)
public double cumulativeProbability(int x)
public double normalApproximateProbability(int x)
public double getNumericalMean()
public double getNumericalVariance()
public int getSupportLowerBound()
public int getSupportUpperBound()
public boolean isSupportConnected()
public int sample()
private long nextPoisson(double meanPoisson)
