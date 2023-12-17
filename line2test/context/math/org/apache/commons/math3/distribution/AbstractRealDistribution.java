protected AbstractRealDistribution()
protected AbstractRealDistribution(RandomGenerator rng)
public double cumulativeProbability(double x0, double x1) throws NumberIsTooLargeException
public double probability(double x0, double x1)
public double value(final double x)
public double inverseCumulativeProbability(final double p) throws OutOfRangeException
protected double getSolverAbsoluteAccuracy()
public void reseedRandomGenerator(long seed)
public double sample()
public double[] sample(int sampleSize)
public double probability(double x)
double SOLVER_DEFAULT_ABSOLUTE_ACCURACY=Optional[1e-6]
long serialVersionUID=Optional[-38038050983108802L]
RandomDataImpl randomData=Optional[new RandomDataImpl()]
RandomGenerator random
double solverAbsoluteAccuracy=Optional[SOLVER_DEFAULT_ABSOLUTE_ACCURACY]
