public ChiSquareTest()
public double chiSquare(final double[] expected, final long[] observed) throws NotPositiveException, NotStrictlyPositiveException, DimensionMismatchException
public double chiSquareTest(final double[] expected, final long[] observed) throws NotPositiveException, NotStrictlyPositiveException, DimensionMismatchException, MaxCountExceededException
public boolean chiSquareTest(final double[] expected, final long[] observed, final double alpha) throws NotPositiveException, NotStrictlyPositiveException, DimensionMismatchException, OutOfRangeException, MaxCountExceededException
public double chiSquare(final long[][] counts) throws NullArgumentException, NotPositiveException, DimensionMismatchException
public double chiSquareTest(final long[][] counts) throws NullArgumentException, DimensionMismatchException, NotPositiveException, MaxCountExceededException
public boolean chiSquareTest(final long[][] counts, final double alpha) throws NullArgumentException, DimensionMismatchException, NotPositiveException, OutOfRangeException, MaxCountExceededException
public double chiSquareDataSetsComparison(long[] observed1, long[] observed2) throws DimensionMismatchException, NotPositiveException, ZeroException
public double chiSquareTestDataSetsComparison(long[] observed1, long[] observed2) throws DimensionMismatchException, NotPositiveException, ZeroException, MaxCountExceededException
public boolean chiSquareTestDataSetsComparison(final long[] observed1, final long[] observed2, final double alpha) throws DimensionMismatchException, NotPositiveException, ZeroException, OutOfRangeException, MaxCountExceededException
private void checkArray(final long[][] in) throws NullArgumentException, DimensionMismatchException, NotPositiveException
