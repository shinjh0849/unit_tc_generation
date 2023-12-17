public EnumeratedDistribution(final List<Pair<T, Double>> pmf) throws NotPositiveException, MathArithmeticException, NotFiniteNumberException, NotANumberException
public EnumeratedDistribution(final RandomGenerator rng, final List<Pair<T, Double>> pmf) throws NotPositiveException, MathArithmeticException, NotFiniteNumberException, NotANumberException
public void reseedRandomGenerator(long seed)
 double probability(final T x)
public List<Pair<T, Double>> getPmf()
public T sample()
public Object[] sample(int sampleSize) throws NotStrictlyPositiveException
public T[] sample(int sampleSize, final T[] array) throws NotStrictlyPositiveException
