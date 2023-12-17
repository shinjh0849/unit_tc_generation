public double pairedT(final double[] sample1, final double[] sample2) throws NullArgumentException, NoDataException, DimensionMismatchException, NumberIsTooSmallException
public double pairedTTest(final double[] sample1, final double[] sample2) throws NullArgumentException, NoDataException, DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException
public boolean pairedTTest(final double[] sample1, final double[] sample2, final double alpha) throws NullArgumentException, NoDataException, DimensionMismatchException, NumberIsTooSmallException, OutOfRangeException, MaxCountExceededException
public double t(final double mu, final double[] observed) throws NullArgumentException, NumberIsTooSmallException
public double t(final double mu, final StatisticalSummary sampleStats) throws NullArgumentException, NumberIsTooSmallException
public double homoscedasticT(final double[] sample1, final double[] sample2) throws NullArgumentException, NumberIsTooSmallException
public double t(final double[] sample1, final double[] sample2) throws NullArgumentException, NumberIsTooSmallException
public double t(final StatisticalSummary sampleStats1, final StatisticalSummary sampleStats2) throws NullArgumentException, NumberIsTooSmallException
public double homoscedasticT(final StatisticalSummary sampleStats1, final StatisticalSummary sampleStats2) throws NullArgumentException, NumberIsTooSmallException
public double tTest(final double mu, final double[] sample) throws NullArgumentException, NumberIsTooSmallException, MaxCountExceededException
public boolean tTest(final double mu, final double[] sample, final double alpha) throws NullArgumentException, NumberIsTooSmallException, OutOfRangeException, MaxCountExceededException
public double tTest(final double mu, final StatisticalSummary sampleStats) throws NullArgumentException, NumberIsTooSmallException, MaxCountExceededException
public boolean tTest(final double mu, final StatisticalSummary sampleStats, final double alpha) throws NullArgumentException, NumberIsTooSmallException, OutOfRangeException, MaxCountExceededException
public double tTest(final double[] sample1, final double[] sample2) throws NullArgumentException, NumberIsTooSmallException, MaxCountExceededException
public double homoscedasticTTest(final double[] sample1, final double[] sample2) throws NullArgumentException, NumberIsTooSmallException, MaxCountExceededException
public boolean tTest(final double[] sample1, final double[] sample2, final double alpha) throws NullArgumentException, NumberIsTooSmallException, OutOfRangeException, MaxCountExceededException
public boolean homoscedasticTTest(final double[] sample1, final double[] sample2, final double alpha) throws NullArgumentException, NumberIsTooSmallException, OutOfRangeException, MaxCountExceededException
public double tTest(final StatisticalSummary sampleStats1, final StatisticalSummary sampleStats2) throws NullArgumentException, NumberIsTooSmallException, MaxCountExceededException
public double homoscedasticTTest(final StatisticalSummary sampleStats1, final StatisticalSummary sampleStats2) throws NullArgumentException, NumberIsTooSmallException, MaxCountExceededException
public boolean tTest(final StatisticalSummary sampleStats1, final StatisticalSummary sampleStats2, final double alpha) throws NullArgumentException, NumberIsTooSmallException, OutOfRangeException, MaxCountExceededException
protected double df(double v1, double v2, double n1, double n2)
protected double t(final double m, final double mu, final double v, final double n)
protected double t(final double m1, final double m2, final double v1, final double v2, final double n1, final double n2)
protected double homoscedasticT(final double m1, final double m2, final double v1, final double v2, final double n1, final double n2)
protected double tTest(final double m, final double mu, final double v, final double n) throws MaxCountExceededException, MathIllegalArgumentException
protected double tTest(final double m1, final double m2, final double v1, final double v2, final double n1, final double n2) throws MaxCountExceededException, NotStrictlyPositiveException
protected double homoscedasticTTest(double m1, double m2, double v1, double v2, double n1, double n2) throws MaxCountExceededException, NotStrictlyPositiveException
private void checkSignificanceLevel(final double alpha) throws OutOfRangeException
private void checkSampleData(final double[] data) throws NullArgumentException, NumberIsTooSmallException
private void checkSampleData(final StatisticalSummary stat) throws NullArgumentException, NumberIsTooSmallException
