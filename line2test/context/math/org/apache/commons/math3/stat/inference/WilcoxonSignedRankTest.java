public WilcoxonSignedRankTest()
public WilcoxonSignedRankTest(final NaNStrategy nanStrategy, final TiesStrategy tiesStrategy)
private void ensureDataConformance(final double[] x, final double[] y) throws NullArgumentException, NoDataException, DimensionMismatchException
private double[] calculateDifferences(final double[] x, final double[] y)
private double[] calculateAbsoluteDifferences(final double[] z) throws NullArgumentException, NoDataException
public double wilcoxonSignedRank(final double[] x, final double[] y) throws NullArgumentException, NoDataException, DimensionMismatchException
private double calculateExactPValue(final double Wmax, final int N)
private double calculateAsymptoticPValue(final double Wmin, final int N)
public double wilcoxonSignedRankTest(final double[] x, final double[] y, final boolean exactPValue) throws NullArgumentException, NoDataException, DimensionMismatchException, NumberIsTooLargeException, ConvergenceException, MaxCountExceededException
NaturalRanking naturalRanking
