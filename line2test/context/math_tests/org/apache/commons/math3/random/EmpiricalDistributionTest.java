public ConstantKernelEmpiricalDistribution(int i)
public UniformKernelEmpiricalDistribution(int i)
public ConstantDistribution(double c)
public void setUp()
public void testLoad() throws Exception
private void checkDistribution()
public void testDoubleLoad() throws Exception
public void testNext() throws Exception
public void testNexFail()
public void testGridTooFine() throws Exception
public void testGridTooFat() throws Exception
public void testBinIndexOverflow() throws Exception
public void testSerialization()
public void testLoadNullDoubleArray()
public void testLoadNullURL() throws Exception
public void testLoadNullFile() throws Exception
public void testGetBinUpperBounds()
public void testGeneratorConfig()
public void testReSeed() throws Exception
private void verifySame(EmpiricalDistribution d1, EmpiricalDistribution d2)
private void tstGen(double tolerance) throws Exception
private void tstDoubleGen(double tolerance) throws Exception
public RealDistribution makeDistribution()
public double[] makeCumulativeTestPoints()
public double[] makeCumulativeTestValues()
public double[] makeDensityTestValues()
public double value(double x)
public void testDensityIntegrals()
private int findBin(double x)
private RealDistribution findKernel(double lower, double upper)
public void testKernelOverrideConstant()
public void testKernelOverrideUniform()
protected RealDistribution getKernel(SummaryStatistics bStats)
protected RealDistribution getKernel(SummaryStatistics bStats)
public double density(double x)
public double cumulativeProbability(double x)
public double inverseCumulativeProbability(double p)
public double getNumericalMean()
public double getNumericalVariance()
public double getSupportLowerBound()
public double getSupportUpperBound()
public boolean isSupportLowerBoundInclusive()
public boolean isSupportUpperBoundInclusive()
public boolean isSupportConnected()
public double sample()
EmpiricalDistribution empiricalDistribution=Optional[null]
EmpiricalDistribution empiricalDistribution2=Optional[null]
File file=Optional[null]
URL url=Optional[null]
double[] dataArray=Optional[null]
int n=Optional[10000]
double binMass=Optional[10d / (n + 1)]
double firstBinMass=Optional[11d / (n + 1)]
