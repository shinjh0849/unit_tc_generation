public RandomDataImpl() { [EOL]     delegate = new RandomDataGenerator(); [EOL] } <line_num>: 114,116
public RandomDataImpl(RandomGenerator rand) { [EOL]     delegate = new RandomDataGenerator(rand); [EOL] } <line_num>: 126,128
@Deprecated [EOL] RandomDataGenerator getDelegate() { [EOL]     return delegate; [EOL] } <line_num>: 134,137
public String nextHexString(int len) throws NotStrictlyPositiveException { [EOL]     return delegate.nextHexString(len); [EOL] } <line_num>: 155,157
public int nextInt(int lower, int upper) throws NumberIsTooLargeException { [EOL]     return delegate.nextInt(lower, upper); [EOL] } <line_num>: 160,162
public long nextLong(long lower, long upper) throws NumberIsTooLargeException { [EOL]     return delegate.nextLong(lower, upper); [EOL] } <line_num>: 165,167
public String nextSecureHexString(int len) throws NotStrictlyPositiveException { [EOL]     return delegate.nextSecureHexString(len); [EOL] } <line_num>: 185,187
public int nextSecureInt(int lower, int upper) throws NumberIsTooLargeException { [EOL]     return delegate.nextSecureInt(lower, upper); [EOL] } <line_num>: 190,192
public long nextSecureLong(long lower, long upper) throws NumberIsTooLargeException { [EOL]     return delegate.nextSecureLong(lower, upper); [EOL] } <line_num>: 195,197
public long nextPoisson(double mean) throws NotStrictlyPositiveException { [EOL]     return delegate.nextPoisson(mean); [EOL] } <line_num>: 212,214
public double nextGaussian(double mu, double sigma) throws NotStrictlyPositiveException { [EOL]     return delegate.nextGaussian(mu, sigma); [EOL] } <line_num>: 217,219
public double nextExponential(double mean) throws NotStrictlyPositiveException { [EOL]     return delegate.nextExponential(mean); [EOL] } <line_num>: 232,234
public double nextUniform(double lower, double upper) throws NumberIsTooLargeException, NotFiniteNumberException, NotANumberException { [EOL]     return delegate.nextUniform(lower, upper); [EOL] } <line_num>: 246,249
public double nextUniform(double lower, double upper, boolean lowerInclusive) throws NumberIsTooLargeException, NotFiniteNumberException, NotANumberException { [EOL]     return delegate.nextUniform(lower, upper, lowerInclusive); [EOL] } <line_num>: 263,266
public double nextBeta(double alpha, double beta) { [EOL]     return delegate.nextBeta(alpha, beta); [EOL] } <line_num>: 278,280
public int nextBinomial(int numberOfTrials, double probabilityOfSuccess) { [EOL]     return delegate.nextBinomial(numberOfTrials, probabilityOfSuccess); [EOL] } <line_num>: 292,294
public double nextCauchy(double median, double scale) { [EOL]     return delegate.nextCauchy(median, scale); [EOL] } <line_num>: 306,308
public double nextChiSquare(double df) { [EOL]     return delegate.nextChiSquare(df); [EOL] } <line_num>: 319,321
public double nextF(double numeratorDf, double denominatorDf) throws NotStrictlyPositiveException { [EOL]     return delegate.nextF(numeratorDf, denominatorDf); [EOL] } <line_num>: 335,337
public double nextGamma(double shape, double scale) throws NotStrictlyPositiveException { [EOL]     return delegate.nextGamma(shape, scale); [EOL] } <line_num>: 362,364
public int nextHypergeometric(int populationSize, int numberOfSuccesses, int sampleSize) throws NotPositiveException, NotStrictlyPositiveException, NumberIsTooLargeException { [EOL]     return delegate.nextHypergeometric(populationSize, numberOfSuccesses, sampleSize); [EOL] } <line_num>: 381,384
public int nextPascal(int r, double p) throws NotStrictlyPositiveException, OutOfRangeException { [EOL]     return delegate.nextPascal(r, p); [EOL] } <line_num>: 399,402
public double nextT(double df) throws NotStrictlyPositiveException { [EOL]     return delegate.nextT(df); [EOL] } <line_num>: 414,416
public double nextWeibull(double shape, double scale) throws NotStrictlyPositiveException { [EOL]     return delegate.nextWeibull(shape, scale); [EOL] } <line_num>: 430,432
public int nextZipf(int numberOfElements, double exponent) throws NotStrictlyPositiveException { [EOL]     return delegate.nextZipf(numberOfElements, exponent); [EOL] } <line_num>: 446,448
public void reSeed(long seed) { [EOL]     delegate.reSeed(seed); [EOL] } <line_num>: 460,462
public void reSeedSecure() { [EOL]     delegate.reSeedSecure(); [EOL] } <line_num>: 471,473
public void reSeedSecure(long seed) { [EOL]     delegate.reSeedSecure(seed); [EOL] } <line_num>: 484,486
public void reSeed() { [EOL]     delegate.reSeed(); [EOL] } <line_num>: 492,494
public void setSecureAlgorithm(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { [EOL]     delegate.setSecureAlgorithm(algorithm, provider); [EOL] } <line_num>: 516,519
public int[] nextPermutation(int n, int k) throws NotStrictlyPositiveException, NumberIsTooLargeException { [EOL]     return delegate.nextPermutation(n, k); [EOL] } <line_num>: 530,533
public Object[] nextSample(Collection<?> c, int k) throws NotStrictlyPositiveException, NumberIsTooLargeException { [EOL]     return delegate.nextSample(c, k); [EOL] } <line_num>: 548,551
@Deprecated [EOL] public double nextInversionDeviate(RealDistribution distribution) throws MathIllegalArgumentException { [EOL]     return distribution.inverseCumulativeProbability(nextUniform(0, 1)); [EOL] } <line_num>: 563,568
@Deprecated [EOL] public int nextInversionDeviate(IntegerDistribution distribution) throws MathIllegalArgumentException { [EOL]     return distribution.inverseCumulativeProbability(nextUniform(0, 1)); [EOL] } <line_num>: 580,584
