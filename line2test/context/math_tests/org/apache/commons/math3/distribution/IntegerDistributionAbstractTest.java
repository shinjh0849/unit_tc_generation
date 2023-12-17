public abstract IntegerDistribution makeDistribution()
public abstract int[] makeDensityTestPoints()
public abstract double[] makeDensityTestValues()
public abstract int[] makeCumulativeTestPoints()
public abstract double[] makeCumulativeTestValues()
public abstract double[] makeInverseCumulativeTestPoints()
public abstract int[] makeInverseCumulativeTestValues()
public void setUp()
public void tearDown()
protected void verifyDensities()
protected void verifyCumulativeProbabilities()
protected void verifyInverseCumulativeProbabilities()
public void testDensities()
public void testCumulativeProbabilities()
public void testInverseCumulativeProbabilities()
public void testConsistencyAtSupportBounds()
public void testIllegalArguments()
public void testSampling()
protected int[] getCumulativeTestPoints()
protected void setCumulativeTestPoints(int[] cumulativeTestPoints)
protected double[] getCumulativeTestValues()
protected void setCumulativeTestValues(double[] cumulativeTestValues)
protected int[] getDensityTestPoints()
protected void setDensityTestPoints(int[] densityTestPoints)
protected double[] getDensityTestValues()
protected void setDensityTestValues(double[] densityTestValues)
protected IntegerDistribution getDistribution()
protected void setDistribution(IntegerDistribution distribution)
protected double[] getInverseCumulativeTestPoints()
protected void setInverseCumulativeTestPoints(double[] inverseCumulativeTestPoints)
protected int[] getInverseCumulativeTestValues()
protected void setInverseCumulativeTestValues(int[] inverseCumulativeTestValues)
protected double getTolerance()
protected void setTolerance(double tolerance)
IntegerDistribution distribution
double tolerance=Optional[1E-4]
int[] densityTestPoints
double[] densityTestValues
int[] cumulativeTestPoints
double[] cumulativeTestValues
double[] inverseCumulativeTestPoints
int[] inverseCumulativeTestValues
