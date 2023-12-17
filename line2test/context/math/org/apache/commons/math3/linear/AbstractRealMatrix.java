protected AbstractRealMatrix()
protected AbstractRealMatrix(final int rowDimension, final int columnDimension) throws NotStrictlyPositiveException
public RealMatrix add(RealMatrix m) throws MatrixDimensionMismatchException
public RealMatrix subtract(final RealMatrix m) throws MatrixDimensionMismatchException
public RealMatrix scalarAdd(final double d)
public RealMatrix scalarMultiply(final double d)
public RealMatrix multiply(final RealMatrix m) throws DimensionMismatchException
public RealMatrix preMultiply(final RealMatrix m) throws DimensionMismatchException
public RealMatrix power(final int p) throws NotPositiveException, NonSquareMatrixException
public double[][] getData()
public void start(final int rows, final int columns, final int startRow, final int endRow, final int startColumn, final int endColumn)
public void visit(final int row, final int column, final double value)
public double end()
public double getNorm()
public void start(final int rows, final int columns, final int startRow, final int endRow, final int startColumn, final int endColumn)
public void visit(final int row, final int column, final double value)
public double end()
public double getFrobeniusNorm()
public RealMatrix getSubMatrix(final int startRow, final int endRow, final int startColumn, final int endColumn) throws OutOfRangeException, NumberIsTooSmallException
public double visit(final int row, final int column, final double value)
public RealMatrix getSubMatrix(final int[] selectedRows, final int[] selectedColumns) throws NullArgumentException, NoDataException, OutOfRangeException
public void start(final int rows, final int columns, final int startRow, final int endRow, final int startColumn, final int endColumn)
public void visit(final int row, final int column, final double value)
public void copySubMatrix(final int startRow, final int endRow, final int startColumn, final int endColumn, final double[][] destination) throws OutOfRangeException, NumberIsTooSmallException, MatrixDimensionMismatchException
public void copySubMatrix(int[] selectedRows, int[] selectedColumns, double[][] destination) throws OutOfRangeException, NullArgumentException, NoDataException, MatrixDimensionMismatchException
public void setSubMatrix(final double[][] subMatrix, final int row, final int column) throws NoDataException, OutOfRangeException, DimensionMismatchException, NullArgumentException
public RealMatrix getRowMatrix(final int row) throws OutOfRangeException
public void setRowMatrix(final int row, final RealMatrix matrix) throws OutOfRangeException, MatrixDimensionMismatchException
public RealMatrix getColumnMatrix(final int column) throws OutOfRangeException
public void setColumnMatrix(final int column, final RealMatrix matrix) throws OutOfRangeException, MatrixDimensionMismatchException
public RealVector getRowVector(final int row) throws OutOfRangeException
public void setRowVector(final int row, final RealVector vector) throws OutOfRangeException, MatrixDimensionMismatchException
public RealVector getColumnVector(final int column) throws OutOfRangeException
public void setColumnVector(final int column, final RealVector vector) throws OutOfRangeException, MatrixDimensionMismatchException
public double[] getRow(final int row) throws OutOfRangeException
public void setRow(final int row, final double[] array) throws OutOfRangeException, MatrixDimensionMismatchException
public double[] getColumn(final int column) throws OutOfRangeException
public void setColumn(final int column, final double[] array) throws OutOfRangeException, MatrixDimensionMismatchException
public void addToEntry(int row, int column, double increment) throws OutOfRangeException
public void multiplyEntry(int row, int column, double factor) throws OutOfRangeException
public void visit(final int row, final int column, final double value)
public RealMatrix transpose()
public boolean isSquare()
public abstract int getRowDimension()
public abstract int getColumnDimension()
public double getTrace() throws NonSquareMatrixException
public double[] operate(final double[] v) throws DimensionMismatchException
public RealVector operate(final RealVector v) throws DimensionMismatchException
public double[] preMultiply(final double[] v) throws DimensionMismatchException
public RealVector preMultiply(final RealVector v) throws DimensionMismatchException
public double walkInRowOrder(final RealMatrixChangingVisitor visitor)
public double walkInRowOrder(final RealMatrixPreservingVisitor visitor)
public double walkInRowOrder(final RealMatrixChangingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws OutOfRangeException, NumberIsTooSmallException
public double walkInRowOrder(final RealMatrixPreservingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws OutOfRangeException, NumberIsTooSmallException
public double walkInColumnOrder(final RealMatrixChangingVisitor visitor)
public double walkInColumnOrder(final RealMatrixPreservingVisitor visitor)
public double walkInColumnOrder(final RealMatrixChangingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws OutOfRangeException, NumberIsTooSmallException
public double walkInColumnOrder(final RealMatrixPreservingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws OutOfRangeException, NumberIsTooSmallException
public double walkInOptimizedOrder(final RealMatrixChangingVisitor visitor)
public double walkInOptimizedOrder(final RealMatrixPreservingVisitor visitor)
public double walkInOptimizedOrder(final RealMatrixChangingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws OutOfRangeException, NumberIsTooSmallException
public double walkInOptimizedOrder(final RealMatrixPreservingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws OutOfRangeException, NumberIsTooSmallException
public String toString()
public boolean equals(final Object object)
public int hashCode()
public abstract RealMatrix createMatrix(int rowDimension, int columnDimension) throws NotStrictlyPositiveException
public abstract RealMatrix copy()
public abstract double getEntry(int row, int column) throws OutOfRangeException
public abstract void setEntry(int row, int column, double value) throws OutOfRangeException
RealMatrixFormat DEFAULT_FORMAT=Optional[RealMatrixFormat.getInstance(Locale.US)]
