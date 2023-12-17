protected AbstractIntegerDistribution()
protected AbstractIntegerDistribution(RandomGenerator rng)
public double cumulativeProbability(int x0, int x1) throws NumberIsTooLargeException
public int inverseCumulativeProbability(final double p) throws OutOfRangeException
protected int solveInverseCumulativeProbability(final double p, int lower, int upper)
public void reseedRandomGenerator(long seed)
public int sample()
public int[] sample(int sampleSize)
private double checkedCumulativeProbability(int argument) throws MathInternalError
