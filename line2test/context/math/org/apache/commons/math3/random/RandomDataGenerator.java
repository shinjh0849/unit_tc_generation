public RandomDataGenerator()
public RandomDataGenerator(RandomGenerator rand)
public String nextHexString(int len) throws NotStrictlyPositiveException
public int nextInt(final int lower, final int upper) throws NumberIsTooLargeException
public long nextLong(final long lower, final long upper) throws NumberIsTooLargeException
private static long nextLong(final RandomGenerator rng, final long n) throws IllegalArgumentException
public String nextSecureHexString(int len) throws NotStrictlyPositiveException
public int nextSecureInt(final int lower, final int upper) throws NumberIsTooLargeException
public long nextSecureLong(final long lower, final long upper) throws NumberIsTooLargeException
public long nextPoisson(double mean) throws NotStrictlyPositiveException
public double nextGaussian(double mu, double sigma) throws NotStrictlyPositiveException
public double nextExponential(double mean) throws NotStrictlyPositiveException
public double nextGamma(double shape, double scale) throws NotStrictlyPositiveException
public int nextHypergeometric(int populationSize, int numberOfSuccesses, int sampleSize) throws NotPositiveException, NotStrictlyPositiveException, NumberIsTooLargeException
public int nextPascal(int r, double p) throws NotStrictlyPositiveException, OutOfRangeException
public double nextT(double df) throws NotStrictlyPositiveException
public double nextWeibull(double shape, double scale) throws NotStrictlyPositiveException
public int nextZipf(int numberOfElements, double exponent) throws NotStrictlyPositiveException
public double nextBeta(double alpha, double beta)
public int nextBinomial(int numberOfTrials, double probabilityOfSuccess)
public double nextCauchy(double median, double scale)
public double nextChiSquare(double df)
public double nextF(double numeratorDf, double denominatorDf) throws NotStrictlyPositiveException
public double nextUniform(double lower, double upper) throws NumberIsTooLargeException, NotFiniteNumberException, NotANumberException
public double nextUniform(double lower, double upper, boolean lowerInclusive) throws NumberIsTooLargeException, NotFiniteNumberException, NotANumberException
public int[] nextPermutation(int n, int k) throws NumberIsTooLargeException, NotStrictlyPositiveException
public Object[] nextSample(Collection<?> c, int k) throws NumberIsTooLargeException, NotStrictlyPositiveException
public void reSeed(long seed)
public void reSeedSecure()
public void reSeedSecure(long seed)
public void reSeed()
public void setSecureAlgorithm(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException
public RandomGenerator getRandomGenerator()
private void initRan()
private RandomGenerator getSecRan()
private int[] getNatural(int n)
long serialVersionUID=Optional[-626730818244969716L]
RandomGenerator rand=Optional[null]
RandomGenerator secRand=Optional[null]
