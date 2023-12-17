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
int DEFAULT_MAX_ITERATIONS=Optional[10000000]
double DEFAULT_EPSILON=Optional[1e-12]
long serialVersionUID=Optional[-3349935121172596109L]
NormalDistribution normal
ExponentialDistribution exponential
double mean
int maxIterations
double epsilon
