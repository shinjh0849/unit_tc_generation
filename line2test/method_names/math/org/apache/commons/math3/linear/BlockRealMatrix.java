public BlockRealMatrix(final int rows, final int columns) throws NotStrictlyPositiveException
public BlockRealMatrix(final double[][] rawData) throws DimensionMismatchException, NotStrictlyPositiveException
public BlockRealMatrix(final int rows, final int columns, final double[][] blockData, final boolean copyArray) throws DimensionMismatchException, NotStrictlyPositiveException
public static double[][] toBlocksLayout(final double[][] rawData) throws DimensionMismatchException
public static double[][] createBlocksLayout(final int rows, final int columns)
public BlockRealMatrix createMatrix(final int rowDimension, final int columnDimension) throws NotStrictlyPositiveException
public BlockRealMatrix copy()
public BlockRealMatrix add(final RealMatrix m) throws MatrixDimensionMismatchException
public BlockRealMatrix add(final BlockRealMatrix m) throws MatrixDimensionMismatchException
public BlockRealMatrix subtract(final RealMatrix m) throws MatrixDimensionMismatchException
public BlockRealMatrix subtract(final BlockRealMatrix m) throws MatrixDimensionMismatchException
public BlockRealMatrix scalarAdd(final double d)
public RealMatrix scalarMultiply(final double d)
public BlockRealMatrix multiply(final RealMatrix m) throws DimensionMismatchException
public BlockRealMatrix multiply(BlockRealMatrix m) throws DimensionMismatchException
public double[][] getData()
public double getNorm()
public double getFrobeniusNorm()
public BlockRealMatrix getSubMatrix(final int startRow, final int endRow, final int startColumn, final int endColumn) throws OutOfRangeException, NumberIsTooSmallException
private void copyBlockPart(final double[] srcBlock, final int srcWidth, final int srcStartRow, final int srcEndRow, final int srcStartColumn, final int srcEndColumn, final double[] dstBlock, final int dstWidth, final int dstStartRow, final int dstStartColumn)
public void setSubMatrix(final double[][] subMatrix, final int row, final int column) throws OutOfRangeException, NoDataException, NullArgumentException, DimensionMismatchException
public BlockRealMatrix getRowMatrix(final int row) throws OutOfRangeException
public void setRowMatrix(final int row, final RealMatrix matrix) throws OutOfRangeException, MatrixDimensionMismatchException
public void setRowMatrix(final int row, final BlockRealMatrix matrix) throws OutOfRangeException, MatrixDimensionMismatchException
public BlockRealMatrix getColumnMatrix(final int column) throws OutOfRangeException
public void setColumnMatrix(final int column, final RealMatrix matrix) throws OutOfRangeException, MatrixDimensionMismatchException
 void setColumnMatrix(final int column, final BlockRealMatrix matrix) throws OutOfRangeException, MatrixDimensionMismatchException
public RealVector getRowVector(final int row) throws OutOfRangeException
public void setRowVector(final int row, final RealVector vector) throws OutOfRangeException, MatrixDimensionMismatchException
public RealVector getColumnVector(final int column) throws OutOfRangeException
public void setColumnVector(final int column, final RealVector vector) throws OutOfRangeException, MatrixDimensionMismatchException
public double[] getRow(final int row) throws OutOfRangeException
public void setRow(final int row, final double[] array) throws OutOfRangeException, MatrixDimensionMismatchException
public double[] getColumn(final int column) throws OutOfRangeException
public void setColumn(final int column, final double[] array) throws OutOfRangeException, MatrixDimensionMismatchException
public double getEntry(final int row, final int column) throws OutOfRangeException
public void setEntry(final int row, final int column, final double value) throws OutOfRangeException
public void addToEntry(final int row, final int column, final double increment) throws OutOfRangeException
public void multiplyEntry(final int row, final int column, final double factor) throws OutOfRangeException
public BlockRealMatrix transpose()
public int getRowDimension()
public int getColumnDimension()
public double[] operate(final double[] v) throws DimensionMismatchException
public double[] preMultiply(final double[] v) throws DimensionMismatchException
public double walkInRowOrder(final RealMatrixChangingVisitor visitor)
public double walkInRowOrder(final RealMatrixPreservingVisitor visitor)
public double walkInRowOrder(final RealMatrixChangingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws OutOfRangeException, NumberIsTooSmallException
public double walkInRowOrder(final RealMatrixPreservingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws OutOfRangeException, NumberIsTooSmallException
public double walkInOptimizedOrder(final RealMatrixChangingVisitor visitor)
public double walkInOptimizedOrder(final RealMatrixPreservingVisitor visitor)
public double walkInOptimizedOrder(final RealMatrixChangingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws OutOfRangeException, NumberIsTooSmallException
public double walkInOptimizedOrder(final RealMatrixPreservingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws OutOfRangeException, NumberIsTooSmallException
private int blockHeight(final int blockRow)
private int blockWidth(final int blockColumn)
