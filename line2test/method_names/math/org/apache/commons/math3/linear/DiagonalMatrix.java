public DiagonalMatrix(final int dimension) throws NotStrictlyPositiveException
public DiagonalMatrix(final double[] d)
public DiagonalMatrix(final double[] d, final boolean copyArray) throws NullArgumentException
public RealMatrix createMatrix(final int rowDimension, final int columnDimension) throws NotStrictlyPositiveException, DimensionMismatchException
public RealMatrix copy()
public DiagonalMatrix add(final DiagonalMatrix m) throws MatrixDimensionMismatchException
public DiagonalMatrix subtract(final DiagonalMatrix m) throws MatrixDimensionMismatchException
public DiagonalMatrix multiply(final DiagonalMatrix m) throws DimensionMismatchException
public RealMatrix multiply(final RealMatrix m) throws DimensionMismatchException
public double[][] getData()
public double[] getDataRef()
public double getEntry(final int row, final int column) throws OutOfRangeException
public void setEntry(final int row, final int column, final double value) throws OutOfRangeException, NumberIsTooLargeException
public void addToEntry(final int row, final int column, final double increment) throws OutOfRangeException, NumberIsTooLargeException
public void multiplyEntry(final int row, final int column, final double factor) throws OutOfRangeException
public int getRowDimension()
public int getColumnDimension()
public double[] operate(final double[] v) throws DimensionMismatchException
public double[] preMultiply(final double[] v) throws DimensionMismatchException
public RealVector preMultiply(final RealVector v) throws DimensionMismatchException
private void ensureZero(final double value) throws NumberIsTooLargeException
