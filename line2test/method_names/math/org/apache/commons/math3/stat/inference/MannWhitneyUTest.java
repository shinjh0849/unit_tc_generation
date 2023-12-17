public MannWhitneyUTest()
public MannWhitneyUTest(final NaNStrategy nanStrategy, final TiesStrategy tiesStrategy)
private void ensureDataConformance(final double[] x, final double[] y) throws NullArgumentException, NoDataException
private double[] concatenateSamples(final double[] x, final double[] y)
public double mannWhitneyU(final double[] x, final double[] y) throws NullArgumentException, NoDataException
private double calculateAsymptoticPValue(final double Umin, final int n1, final int n2) throws ConvergenceException, MaxCountExceededException
public double mannWhitneyUTest(final double[] x, final double[] y) throws NullArgumentException, NoDataException, ConvergenceException, MaxCountExceededException
