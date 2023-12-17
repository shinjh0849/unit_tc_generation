public LoessInterpolator()
public LoessInterpolator(double bandwidth, int robustnessIters)
public LoessInterpolator(double bandwidth, int robustnessIters, double accuracy) throws OutOfRangeException, NotPositiveException
public final PolynomialSplineFunction interpolate(final double[] xval, final double[] yval) throws NonMonotonicSequenceException, DimensionMismatchException, NoDataException, NotFiniteNumberException, NumberIsTooSmallException
public final double[] smooth(final double[] xval, final double[] yval, final double[] weights) throws NonMonotonicSequenceException, DimensionMismatchException, NoDataException, NotFiniteNumberException, NumberIsTooSmallException
public final double[] smooth(final double[] xval, final double[] yval) throws NonMonotonicSequenceException, DimensionMismatchException, NoDataException, NotFiniteNumberException, NumberIsTooSmallException
private static void updateBandwidthInterval(final double[] xval, final double[] weights, final int i, final int[] bandwidthInterval)
private static int nextNonzero(final double[] weights, final int i)
private static double tricube(final double x)
private static void checkAllFiniteReal(final double[] values)
double DEFAULT_BANDWIDTH=Optional[0.3]
int DEFAULT_ROBUSTNESS_ITERS=Optional[2]
double DEFAULT_ACCURACY=Optional[1e-12]
long serialVersionUID=Optional[5204927143605193821L]
double bandwidth
int robustnessIters
double accuracy
