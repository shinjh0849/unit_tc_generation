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
int DEFAULT_BIN_COUNT=Optional[1000]
String FILE_CHARSET=Optional["US-ASCII"]
long serialVersionUID=Optional[5729073523949762654L]
RandomDataGenerator randomData
List<SummaryStatistics> binStats
SummaryStatistics sampleStats=Optional[null]
double max=Optional[Double.NEGATIVE_INFINITY]
double min=Optional[Double.POSITIVE_INFINITY]
double delta=Optional[0d]
int binCount
boolean loaded=Optional[false]
double[] upperBounds=Optional[null]
