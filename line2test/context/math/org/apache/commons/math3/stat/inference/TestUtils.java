private TestUtils()
public static double homoscedasticT(final double[] sample1, final double[] sample2) throws NullArgumentException, NumberIsTooSmallException
public static double homoscedasticT(final StatisticalSummary sampleStats1, final StatisticalSummary sampleStats2) throws NullArgumentException, NumberIsTooSmallException
public static boolean homoscedasticTTest(final double[] sample1, final double[] sample2, final double alpha) throws NullArgumentException, NumberIsTooSmallException, OutOfRangeException, MaxCountExceededException
public static double homoscedasticTTest(final double[] sample1, final double[] sample2) throws NullArgumentException, NumberIsTooSmallException, MaxCountExceededException
public static double homoscedasticTTest(final StatisticalSummary sampleStats1, final StatisticalSummary sampleStats2) throws NullArgumentException, NumberIsTooSmallException, MaxCountExceededException
public static double pairedT(final double[] sample1, final double[] sample2) throws NullArgumentException, NoDataException, DimensionMismatchException, NumberIsTooSmallException
public static boolean pairedTTest(final double[] sample1, final double[] sample2, final double alpha) throws NullArgumentException, NoDataException, DimensionMismatchException, NumberIsTooSmallException, OutOfRangeException, MaxCountExceededException
public static double pairedTTest(final double[] sample1, final double[] sample2) throws NullArgumentException, NoDataException, DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException
public static double t(final double mu, final double[] observed) throws NullArgumentException, NumberIsTooSmallException
public static double t(final double mu, final StatisticalSummary sampleStats) throws NullArgumentException, NumberIsTooSmallException
public static double t(final double[] sample1, final double[] sample2) throws NullArgumentException, NumberIsTooSmallException
public static double t(final StatisticalSummary sampleStats1, final StatisticalSummary sampleStats2) throws NullArgumentException, NumberIsTooSmallException
public static boolean tTest(final double mu, final double[] sample, final double alpha) throws NullArgumentException, NumberIsTooSmallException, OutOfRangeException, MaxCountExceededException
public static double tTest(final double mu, final double[] sample) throws NullArgumentException, NumberIsTooSmallException, MaxCountExceededException
public static boolean tTest(final double mu, final StatisticalSummary sampleStats, final double alpha) throws NullArgumentException, NumberIsTooSmallException, OutOfRangeException, MaxCountExceededException
public static double tTest(final double mu, final StatisticalSummary sampleStats) throws NullArgumentException, NumberIsTooSmallException, MaxCountExceededException
public static boolean tTest(final double[] sample1, final double[] sample2, final double alpha) throws NullArgumentException, NumberIsTooSmallException, OutOfRangeException, MaxCountExceededException
public static double tTest(final double[] sample1, final double[] sample2) throws NullArgumentException, NumberIsTooSmallException, MaxCountExceededException
public static boolean tTest(final StatisticalSummary sampleStats1, final StatisticalSummary sampleStats2, final double alpha) throws NullArgumentException, NumberIsTooSmallException, OutOfRangeException, MaxCountExceededException
public static double tTest(final StatisticalSummary sampleStats1, final StatisticalSummary sampleStats2) throws NullArgumentException, NumberIsTooSmallException, MaxCountExceededException
public static double chiSquare(final double[] expected, final long[] observed) throws NotPositiveException, NotStrictlyPositiveException, DimensionMismatchException
public static double chiSquare(final long[][] counts) throws NullArgumentException, NotPositiveException, DimensionMismatchException
public static boolean chiSquareTest(final double[] expected, final long[] observed, final double alpha) throws NotPositiveException, NotStrictlyPositiveException, DimensionMismatchException, OutOfRangeException, MaxCountExceededException
public static double chiSquareTest(final double[] expected, final long[] observed) throws NotPositiveException, NotStrictlyPositiveException, DimensionMismatchException, MaxCountExceededException
public static boolean chiSquareTest(final long[][] counts, final double alpha) throws NullArgumentException, DimensionMismatchException, NotPositiveException, OutOfRangeException, MaxCountExceededException
public static double chiSquareTest(final long[][] counts) throws NullArgumentException, DimensionMismatchException, NotPositiveException, MaxCountExceededException
public static double chiSquareDataSetsComparison(final long[] observed1, final long[] observed2) throws DimensionMismatchException, NotPositiveException, ZeroException
public static double chiSquareTestDataSetsComparison(final long[] observed1, final long[] observed2) throws DimensionMismatchException, NotPositiveException, ZeroException, MaxCountExceededException
public static boolean chiSquareTestDataSetsComparison(final long[] observed1, final long[] observed2, final double alpha) throws DimensionMismatchException, NotPositiveException, ZeroException, OutOfRangeException, MaxCountExceededException
public static double oneWayAnovaFValue(final Collection<double[]> categoryData) throws NullArgumentException, DimensionMismatchException
public static double oneWayAnovaPValue(final Collection<double[]> categoryData) throws NullArgumentException, DimensionMismatchException, ConvergenceException, MaxCountExceededException
public static boolean oneWayAnovaTest(final Collection<double[]> categoryData, final double alpha) throws NullArgumentException, DimensionMismatchException, OutOfRangeException, ConvergenceException, MaxCountExceededException
public static double g(final double[] expected, final long[] observed) throws NotPositiveException, NotStrictlyPositiveException, DimensionMismatchException
public static double gTest(final double[] expected, final long[] observed) throws NotPositiveException, NotStrictlyPositiveException, DimensionMismatchException, MaxCountExceededException
public static double gTestIntrinsic(final double[] expected, final long[] observed) throws NotPositiveException, NotStrictlyPositiveException, DimensionMismatchException, MaxCountExceededException
public static boolean gTest(final double[] expected, final long[] observed, final double alpha) throws NotPositiveException, NotStrictlyPositiveException, DimensionMismatchException, OutOfRangeException, MaxCountExceededException
public static double gDataSetsComparison(final long[] observed1, final long[] observed2) throws DimensionMismatchException, NotPositiveException, ZeroException
public static double rootLogLikelihoodRatio(final long k11, final long k12, final long k21, final long k22) throws DimensionMismatchException, NotPositiveException, ZeroException
public static double gTestDataSetsComparison(final long[] observed1, final long[] observed2) throws DimensionMismatchException, NotPositiveException, ZeroException, MaxCountExceededException
public static boolean gTestDataSetsComparison(final long[] observed1, final long[] observed2, final double alpha) throws DimensionMismatchException, NotPositiveException, ZeroException, OutOfRangeException, MaxCountExceededException
TTest T_TEST=Optional[new TTest()]
ChiSquareTest CHI_SQUARE_TEST=Optional[new ChiSquareTest()]
OneWayAnova ONE_WAY_ANANOVA=Optional[new OneWayAnova()]
GTest G_TEST=Optional[new GTest()]
