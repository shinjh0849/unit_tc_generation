public EmpiricalDistribution()
public EmpiricalDistribution(int binCount)
public EmpiricalDistribution(int binCount, RandomGenerator generator)
public EmpiricalDistribution(RandomGenerator generator)
public EmpiricalDistribution(int binCount, RandomDataImpl randomData)
public EmpiricalDistribution(RandomDataImpl randomData)
private EmpiricalDistribution(int binCount, RandomDataGenerator randomData)
public StreamDataAdapter(BufferedReader in)
public ArrayDataAdapter(double[] in) throws NullArgumentException
public void load(double[] in) throws NullArgumentException
public void load(URL url) throws IOException, NullArgumentException, ZeroException
public void load(File file) throws IOException, NullArgumentException
public abstract void computeBinStats() throws IOException
public abstract void computeStats() throws IOException
public void computeBinStats() throws IOException
public void computeStats() throws IOException
public void computeStats() throws IOException
public void computeBinStats() throws IOException
private void fillBinStats(final DataAdapter da) throws IOException
private int findBin(double value)
public double getNextValue() throws MathIllegalStateException
public StatisticalSummary getSampleStats()
public int getBinCount()
public List<SummaryStatistics> getBinStats()
public double[] getUpperBounds()
public double[] getGeneratorUpperBounds()
public boolean isLoaded()
public void reSeed(long seed)
public double probability(double x)
public double density(double x)
public double cumulativeProbability(double x)
public double inverseCumulativeProbability(final double p) throws OutOfRangeException
public double getNumericalMean()
public double getNumericalVariance()
public double getSupportLowerBound()
public double getSupportUpperBound()
public boolean isSupportLowerBoundInclusive()
public boolean isSupportUpperBoundInclusive()
public boolean isSupportConnected()
public double sample()
public void reseedRandomGenerator(long seed)
private double pB(int i)
private double pBminus(int i)
private double kB(int i)
private RealDistribution k(double x)
private double cumBinP(int binIndex)
protected RealDistribution getKernel(SummaryStatistics bStats)
