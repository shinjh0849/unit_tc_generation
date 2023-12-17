public Array2DRowRealMatrix()
public Array2DRowRealMatrix(final int rowDimension, final int columnDimension) throws NotStrictlyPositiveException
public Array2DRowRealMatrix(final double[][] d) throws DimensionMismatchException, NoDataException, NullArgumentException
public Array2DRowRealMatrix(final double[][] d, final boolean copyArray) throws DimensionMismatchException, NoDataException, NullArgumentException
public Array2DRowRealMatrix(final double[] v)
public RealMatrix createMatrix(final int rowDimension, final int columnDimension) throws NotStrictlyPositiveException
public RealMatrix copy()
public Array2DRowRealMatrix add(final Array2DRowRealMatrix m) throws MatrixDimensionMismatchException
public Array2DRowRealMatrix subtract(final Array2DRowRealMatrix m) throws MatrixDimensionMismatchException
public Array2DRowRealMatrix multiply(final Array2DRowRealMatrix m) throws DimensionMismatchException
public double[][] getData()
public double[][] getDataRef()
public void setSubMatrix(final double[][] subMatrix, final int row, final int column) throws NoDataException, OutOfRangeException, DimensionMismatchException, NullArgumentException
public double getEntry(final int row, final int column) throws OutOfRangeException
public void setEntry(final int row, final int column, final double value) throws OutOfRangeException
public void addToEntry(final int row, final int column, final double increment) throws OutOfRangeException
public void multiplyEntry(final int row, final int column, final double factor) throws OutOfRangeException
public int getRowDimension()
public int getColumnDimension()
public double[] operate(final double[] v) throws DimensionMismatchException
public double[] preMultiply(final double[] v) throws DimensionMismatchException
public double walkInRowOrder(final RealMatrixChangingVisitor visitor)
public double walkInRowOrder(final RealMatrixPreservingVisitor visitor)
public double walkInRowOrder(final RealMatrixChangingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws OutOfRangeException, NumberIsTooSmallException
public double walkInRowOrder(final RealMatrixPreservingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws OutOfRangeException, NumberIsTooSmallException
public double walkInColumnOrder(final RealMatrixChangingVisitor visitor)
public double walkInColumnOrder(final RealMatrixPreservingVisitor visitor)
public double walkInColumnOrder(final RealMatrixChangingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws OutOfRangeException, NumberIsTooSmallException
public double walkInColumnOrder(final RealMatrixPreservingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws OutOfRangeException, NumberIsTooSmallException
private double[][] copyOut()
private void copyIn(final double[][] in) throws DimensionMismatchException, NoDataException, NullArgumentException
