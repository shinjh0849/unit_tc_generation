public OneWayAnova()
private AnovaStats(int dfbg, int dfwg, double F)
public double anovaFValue(final Collection<double[]> categoryData) throws NullArgumentException, DimensionMismatchException
public double anovaPValue(final Collection<double[]> categoryData) throws NullArgumentException, DimensionMismatchException, ConvergenceException, MaxCountExceededException
public double anovaPValue(final Collection<SummaryStatistics> categoryData, final boolean allowOneElementData) throws NullArgumentException, DimensionMismatchException, ConvergenceException, MaxCountExceededException
private AnovaStats anovaStats(final Collection<double[]> categoryData) throws NullArgumentException, DimensionMismatchException
public boolean anovaTest(final Collection<double[]> categoryData, final double alpha) throws NullArgumentException, DimensionMismatchException, OutOfRangeException, ConvergenceException, MaxCountExceededException
private AnovaStats anovaStats(final Collection<SummaryStatistics> categoryData, final boolean allowOneElementData) throws NullArgumentException, DimensionMismatchException
