public BlockFieldMatrix(final Field<T> field, final int rows, final int columns) throws NotStrictlyPositiveException
public BlockFieldMatrix(final T[][] rawData) throws DimensionMismatchException
public BlockFieldMatrix(final int rows, final int columns, final T[][] blockData, final boolean copyArray) throws DimensionMismatchException, NotStrictlyPositiveException
public static T[][] toBlocksLayout(final T[][] rawData) throws DimensionMismatchException
public static T[][] createBlocksLayout(final Field<T> field, final int rows, final int columns)
public FieldMatrix<T> createMatrix(final int rowDimension, final int columnDimension) throws NotStrictlyPositiveException
public FieldMatrix<T> copy()
public FieldMatrix<T> add(final FieldMatrix<T> m) throws MatrixDimensionMismatchException
public BlockFieldMatrix<T> add(final BlockFieldMatrix<T> m) throws MatrixDimensionMismatchException
public FieldMatrix<T> subtract(final FieldMatrix<T> m) throws MatrixDimensionMismatchException
public BlockFieldMatrix<T> subtract(final BlockFieldMatrix<T> m) throws MatrixDimensionMismatchException
public FieldMatrix<T> scalarAdd(final T d)
public FieldMatrix<T> scalarMultiply(final T d)
public FieldMatrix<T> multiply(final FieldMatrix<T> m) throws DimensionMismatchException
public BlockFieldMatrix<T> multiply(BlockFieldMatrix<T> m) throws DimensionMismatchException
public T[][] getData()
public FieldMatrix<T> getSubMatrix(final int startRow, final int endRow, final int startColumn, final int endColumn) throws OutOfRangeException, NumberIsTooSmallException
private void copyBlockPart(final T[] srcBlock, final int srcWidth, final int srcStartRow, final int srcEndRow, final int srcStartColumn, final int srcEndColumn, final T[] dstBlock, final int dstWidth, final int dstStartRow, final int dstStartColumn)
public void setSubMatrix(final T[][] subMatrix, final int row, final int column) throws DimensionMismatchException, OutOfRangeException, NoDataException, NullArgumentException
public FieldMatrix<T> getRowMatrix(final int row) throws OutOfRangeException
public void setRowMatrix(final int row, final FieldMatrix<T> matrix) throws MatrixDimensionMismatchException, OutOfRangeException
public void setRowMatrix(final int row, final BlockFieldMatrix<T> matrix) throws MatrixDimensionMismatchException, OutOfRangeException
public FieldMatrix<T> getColumnMatrix(final int column) throws OutOfRangeException
public void setColumnMatrix(final int column, final FieldMatrix<T> matrix) throws MatrixDimensionMismatchException, OutOfRangeException
 void setColumnMatrix(final int column, final BlockFieldMatrix<T> matrix) throws MatrixDimensionMismatchException, OutOfRangeException
public FieldVector<T> getRowVector(final int row) throws OutOfRangeException
public void setRowVector(final int row, final FieldVector<T> vector) throws MatrixDimensionMismatchException, OutOfRangeException
public FieldVector<T> getColumnVector(final int column) throws OutOfRangeException
public void setColumnVector(final int column, final FieldVector<T> vector) throws OutOfRangeException, MatrixDimensionMismatchException
public T[] getRow(final int row) throws OutOfRangeException
public void setRow(final int row, final T[] array) throws OutOfRangeException, MatrixDimensionMismatchException
public T[] getColumn(final int column) throws OutOfRangeException
public void setColumn(final int column, final T[] array) throws MatrixDimensionMismatchException, OutOfRangeException
public T getEntry(final int row, final int column) throws OutOfRangeException
public void setEntry(final int row, final int column, final T value) throws OutOfRangeException
public void addToEntry(final int row, final int column, final T increment) throws OutOfRangeException
public void multiplyEntry(final int row, final int column, final T factor) throws OutOfRangeException
public FieldMatrix<T> transpose()
public int getRowDimension()
public int getColumnDimension()
public T[] operate(final T[] v) throws DimensionMismatchException
public T[] preMultiply(final T[] v) throws DimensionMismatchException
public T walkInRowOrder(final FieldMatrixChangingVisitor<T> visitor)
public T walkInRowOrder(final FieldMatrixPreservingVisitor<T> visitor)
public T walkInRowOrder(final FieldMatrixChangingVisitor<T> visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws OutOfRangeException, NumberIsTooSmallException
public T walkInRowOrder(final FieldMatrixPreservingVisitor<T> visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws OutOfRangeException, NumberIsTooSmallException
public T walkInOptimizedOrder(final FieldMatrixChangingVisitor<T> visitor)
public T walkInOptimizedOrder(final FieldMatrixPreservingVisitor<T> visitor)
public T walkInOptimizedOrder(final FieldMatrixChangingVisitor<T> visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws OutOfRangeException, NumberIsTooSmallException
public T walkInOptimizedOrder(final FieldMatrixPreservingVisitor<T> visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws OutOfRangeException, NumberIsTooSmallException
private int blockHeight(final int blockRow)
private int blockWidth(final int blockColumn)
int BLOCK_SIZE=Optional[36]
long serialVersionUID=Optional[-4602336630143123183L]
T[][] blocks
int rows
int columns
int blockRows
int blockColumns
