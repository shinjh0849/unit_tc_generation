public EnumeratedIntegerDistribution(final int[] singletons, final double[] probabilities) throws DimensionMismatchException, NotPositiveException, MathArithmeticException, NotFiniteNumberException, NotANumberException
public EnumeratedIntegerDistribution(final RandomGenerator rng, final int[] singletons, final double[] probabilities) throws DimensionMismatchException, NotPositiveException, MathArithmeticException, NotFiniteNumberException, NotANumberException
public double probability(final int x)
public double cumulativeProbability(final int x)
public double getNumericalMean()
public double getNumericalVariance()
public int getSupportLowerBound()
public int getSupportUpperBound()
public boolean isSupportConnected()
public int sample()
long serialVersionUID=Optional[20130308L]
EnumeratedDistribution<Integer> innerDistribution
