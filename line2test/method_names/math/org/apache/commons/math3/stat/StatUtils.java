private StatUtils()
public static double sum(final double[] values) throws MathIllegalArgumentException
public static double sum(final double[] values, final int begin, final int length) throws MathIllegalArgumentException
public static double sumSq(final double[] values) throws MathIllegalArgumentException
public static double sumSq(final double[] values, final int begin, final int length) throws MathIllegalArgumentException
public static double product(final double[] values) throws MathIllegalArgumentException
public static double product(final double[] values, final int begin, final int length) throws MathIllegalArgumentException
public static double sumLog(final double[] values) throws MathIllegalArgumentException
public static double sumLog(final double[] values, final int begin, final int length) throws MathIllegalArgumentException
public static double mean(final double[] values) throws MathIllegalArgumentException
public static double mean(final double[] values, final int begin, final int length) throws MathIllegalArgumentException
public static double geometricMean(final double[] values) throws MathIllegalArgumentException
public static double geometricMean(final double[] values, final int begin, final int length) throws MathIllegalArgumentException
public static double variance(final double[] values) throws MathIllegalArgumentException
public static double variance(final double[] values, final int begin, final int length) throws MathIllegalArgumentException
public static double variance(final double[] values, final double mean, final int begin, final int length) throws MathIllegalArgumentException
public static double variance(final double[] values, final double mean) throws MathIllegalArgumentException
public static double populationVariance(final double[] values) throws MathIllegalArgumentException
public static double populationVariance(final double[] values, final int begin, final int length) throws MathIllegalArgumentException
public static double populationVariance(final double[] values, final double mean, final int begin, final int length) throws MathIllegalArgumentException
public static double populationVariance(final double[] values, final double mean) throws MathIllegalArgumentException
public static double max(final double[] values) throws MathIllegalArgumentException
public static double max(final double[] values, final int begin, final int length) throws MathIllegalArgumentException
public static double min(final double[] values) throws MathIllegalArgumentException
public static double min(final double[] values, final int begin, final int length) throws MathIllegalArgumentException
public static double percentile(final double[] values, final double p) throws MathIllegalArgumentException
public static double percentile(final double[] values, final int begin, final int length, final double p) throws MathIllegalArgumentException
public static double sumDifference(final double[] sample1, final double[] sample2) throws DimensionMismatchException, NoDataException
public static double meanDifference(final double[] sample1, final double[] sample2) throws DimensionMismatchException, NoDataException
public static double varianceDifference(final double[] sample1, final double[] sample2, double meanDifference) throws DimensionMismatchException, NumberIsTooSmallException
public static double[] normalize(final double[] sample)
public static double[] mode(double[] sample) throws MathIllegalArgumentException
public static double[] mode(double[] sample, final int begin, final int length)
private static double[] getMode(double[] values, final int begin, final int length)
