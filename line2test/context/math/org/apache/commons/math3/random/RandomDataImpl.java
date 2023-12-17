public RandomDataImpl()
public RandomDataImpl(RandomGenerator rand)
 RandomDataGenerator getDelegate()
public String nextHexString(int len) throws NotStrictlyPositiveException
public int nextInt(int lower, int upper) throws NumberIsTooLargeException
public long nextLong(long lower, long upper) throws NumberIsTooLargeException
public String nextSecureHexString(int len) throws NotStrictlyPositiveException
public int nextSecureInt(int lower, int upper) throws NumberIsTooLargeException
public long nextSecureLong(long lower, long upper) throws NumberIsTooLargeException
public long nextPoisson(double mean) throws NotStrictlyPositiveException
public double nextGaussian(double mu, double sigma) throws NotStrictlyPositiveException
public double nextExponential(double mean) throws NotStrictlyPositiveException
public double nextUniform(double lower, double upper) throws NumberIsTooLargeException, NotFiniteNumberException, NotANumberException
public double nextUniform(double lower, double upper, boolean lowerInclusive) throws NumberIsTooLargeException, NotFiniteNumberException, NotANumberException
public double nextBeta(double alpha, double beta)
public int nextBinomial(int numberOfTrials, double probabilityOfSuccess)
public double nextCauchy(double median, double scale)
public double nextChiSquare(double df)
public double nextF(double numeratorDf, double denominatorDf) throws NotStrictlyPositiveException
public double nextGamma(double shape, double scale) throws NotStrictlyPositiveException
public int nextHypergeometric(int populationSize, int numberOfSuccesses, int sampleSize) throws NotPositiveException, NotStrictlyPositiveException, NumberIsTooLargeException
public int nextPascal(int r, double p) throws NotStrictlyPositiveException, OutOfRangeException
public double nextT(double df) throws NotStrictlyPositiveException
public double nextWeibull(double shape, double scale) throws NotStrictlyPositiveException
public int nextZipf(int numberOfElements, double exponent) throws NotStrictlyPositiveException
public void reSeed(long seed)
public void reSeedSecure()
public void reSeedSecure(long seed)
public void reSeed()
public void setSecureAlgorithm(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException
public int[] nextPermutation(int n, int k) throws NotStrictlyPositiveException, NumberIsTooLargeException
public Object[] nextSample(Collection<?> c, int k) throws NotStrictlyPositiveException, NumberIsTooLargeException
public double nextInversionDeviate(RealDistribution distribution) throws MathIllegalArgumentException
public int nextInversionDeviate(IntegerDistribution distribution) throws MathIllegalArgumentException
long serialVersionUID=Optional[-626730818244969716L]
RandomDataGenerator delegate
