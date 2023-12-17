public Array2DRowFieldMatrix(final Field<T> field)
public Array2DRowFieldMatrix(final Field<T> field, final int rowDimension, final int columnDimension) throws NotStrictlyPositiveException
public Array2DRowFieldMatrix(final T[][] d) throws DimensionMismatchException, NullArgumentException, NoDataException
public Array2DRowFieldMatrix(final Field<T> field, final T[][] d) throws DimensionMismatchException, NullArgumentException, NoDataException
public Array2DRowFieldMatrix(final T[][] d, final boolean copyArray) throws DimensionMismatchException, NoDataException, NullArgumentException
public Array2DRowFieldMatrix(final Field<T> field, final T[][] d, final boolean copyArray) throws DimensionMismatchException, NoDataException, NullArgumentException
public Array2DRowFieldMatrix(final T[] v) throws NoDataException
public Array2DRowFieldMatrix(final Field<T> field, final T[] v)
public FieldMatrix<T> createMatrix(final int rowDimension, final int columnDimension) throws NotStrictlyPositiveException
public FieldMatrix<T> copy()
public Array2DRowFieldMatrix<T> add(final Array2DRowFieldMatrix<T> m) throws MatrixDimensionMismatchException
public Array2DRowFieldMatrix<T> subtract(final Array2DRowFieldMatrix<T> m) throws MatrixDimensionMismatchException
public Array2DRowFieldMatrix<T> multiply(final Array2DRowFieldMatrix<T> m) throws DimensionMismatchException
public T[][] getData()
public T[][] getDataRef()
public void setSubMatrix(final T[][] subMatrix, final int row, final int column) throws OutOfRangeException, NullArgumentException, NoDataException, DimensionMismatchException
public T getEntry(final int row, final int column) throws OutOfRangeException
public void setEntry(final int row, final int column, final T value) throws OutOfRangeException
public void addToEntry(final int row, final int column, final T increment) throws OutOfRangeException
public void multiplyEntry(final int row, final int column, final T factor) throws OutOfRangeException
public int getRowDimension()
public int getColumnDimension()
public T[] operate(final T[] v) throws DimensionMismatchException
public T[] preMultiply(final T[] v) throws DimensionMismatchException
public T walkInRowOrder(final FieldMatrixChangingVisitor<T> visitor)
public T walkInRowOrder(final FieldMatrixPreservingVisitor<T> visitor)
public T walkInRowOrder(final FieldMatrixChangingVisitor<T> visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws OutOfRangeException, NumberIsTooSmallException
public T walkInRowOrder(final FieldMatrixPreservingVisitor<T> visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws OutOfRangeException, NumberIsTooSmallException
public T walkInColumnOrder(final FieldMatrixChangingVisitor<T> visitor)
public T walkInColumnOrder(final FieldMatrixPreservingVisitor<T> visitor)
public T walkInColumnOrder(final FieldMatrixChangingVisitor<T> visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws OutOfRangeException, NumberIsTooSmallException
public T walkInColumnOrder(final FieldMatrixPreservingVisitor<T> visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws OutOfRangeException, NumberIsTooSmallException
private T[][] copyOut()
private void copyIn(final T[][] in) throws NullArgumentException, NoDataException, DimensionMismatchException
long serialVersionUID=Optional[7260756672015356458L]
T[][] data
